package com.example.recipeapp.ui.lucky

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.annotation.SuppressLint
import android.content.Context
import android.graphics.PorterDuff
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.core.content.ContextCompat
import androidx.core.graphics.drawable.DrawableCompat
import androidx.core.text.HtmlCompat
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import coil.load
import coil.request.CachePolicy
import com.example.recipeapp.R
import com.example.recipeapp.adapter.InstructionsAdapter
import com.example.recipeapp.adapter.StepsAdapter
import com.example.recipeapp.databinding.FragmentLuckyBinding
import com.example.recipeapp.models.detail.ResponseDetail
import com.example.recipeapp.models.lucky.ResponseLucky
import com.example.recipeapp.ui.detail.DetailFragmentDirections
import com.example.recipeapp.utils.Constants
import com.example.recipeapp.utils.NetworkChecker
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.isVisible
import com.example.recipeapp.utils.minToHour
import com.example.recipeapp.utils.setDynamicallyColor
import com.example.recipeapp.utils.setupRecyclerView
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.LuckyViewModel
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipDrawable
import com.google.android.material.chip.ChipGroup
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import javax.inject.Inject

@AndroidEntryPoint
class LuckyFragment : Fragment() {
    //Binding
    private var _binding: FragmentLuckyBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var instructionsAdapter: InstructionsAdapter

    @Inject
    lateinit var stepsAdapter: StepsAdapter

    @Inject
    lateinit var networkChecker: NetworkChecker

    //Other
    private val viewModel: LuckyViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentLuckyBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetJavaScriptEnabled")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Check Internet
        lifecycleScope.launchWhenStarted {
            networkChecker.checkNetworkAvailability().collect { state ->
                initInternetLayout(state)
                if (state)
                    viewModel.callLuckyApi(viewModel.luckyQueries())
            }
        }
        //Load data
        loadDetailDataFromApi()
    }

    private fun loadDetailDataFromApi() {
        val sharedPreferences = requireActivity().getPreferences(Context.MODE_PRIVATE)
        val dialogShown = sharedPreferences.getBoolean("dialog_shown", false)

        if (!dialogShown) {
            showCustomDialog()
            with(sharedPreferences.edit()) {
                putBoolean("dialog_shown", true)
                apply()
            }
        }
        binding.apply {
            viewModel.luckyData.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is NetworkRequest.Loading -> {
                        loading.isVisible(true, contentLay)
                    }

                    is NetworkRequest.Success -> {
                        loading.isVisible(false, contentLay)
                        response.data?.let { data ->
                            if (data.recipes.isNullOrEmpty()) {
                                emptyLay.isVisible(true, contentLay)
                            } else {
                                initViewsWithData(data.recipes[0])
                            }
                        }
                    }

                    is NetworkRequest.Error -> {
                        loading.isVisible(false, contentLay)
                        Toast.makeText(requireContext() , response.message , Toast.LENGTH_SHORT).show()
                    }
                }
            }
        }
    }


    @SuppressLint("SetTextI18n")
    private fun initViewsWithData(data: ResponseLucky.Recipe) {
        binding.apply {
            //Image
            data.image?.let {
                val imageSplit = it.split("-")
                val imageSize = imageSplit.getOrNull(1)
                    ?.replace(Constants.OLD_IMAGE_SIZE, Constants.NEW_IMAGE_SIZE)
                imageSize?.let { size ->
                    coverImg.load("${imageSplit[0]}-$size") {
                        crossfade(true)
                        crossfade(800)
                        memoryCachePolicy(CachePolicy.ENABLED)
                        error(R.drawable.ic_placeholder)
                    }
                } ?: run {
                    coverImg.load(R.drawable.ic_placeholder) {
                        crossfade(true)
                        crossfade(800)
                        memoryCachePolicy(CachePolicy.ENABLED)
                    }
                }
            }
            //Source
            data.sourceUrl?.let { source ->
                sourceImg.isVisible = true
                sourceImg.setOnClickListener {
                    val direction = DetailFragmentDirections.actionToWebView(source)
                    findNavController().navigate(direction)
                }
            }
            //Text
            timeTxt.text = data.readyInMinutes!!.minToHour()
            nameTxt.text = data.title
            //Desc
            val summary = HtmlCompat.fromHtml(data.summary!!, HtmlCompat.FROM_HTML_MODE_COMPACT)
            descTxt.text = summary
            //Toggle
            if (data.cheap!!) cheapTxt.setDynamicallyColor(R.color.caribbean_green)
            if (data.veryPopular!!) popularTxt.setDynamicallyColor(R.color.tart_orange)
            if (data.vegan!!) veganTxt.setDynamicallyColor(R.color.caribbean_green)
            if (data.dairyFree!!) dairyTxt.setDynamicallyColor(R.color.caribbean_green)
            //Like
            likeTxt.text = data.aggregateLikes.toString()
            //price
            val price = "%.2f".format(data.pricePerServing!!.div(100))
            priceTxt.text = "$price $"
            //Healthy
            healthyTxt.text = data.healthScore.toString()
            when (data.healthScore) {
                in 90..100 -> healthyTxt.setDynamicallyColor(R.color.caribbean_green)
                in 60..89 -> healthyTxt.setDynamicallyColor(R.color.chineseYellow)
                in 0..59 -> healthyTxt.setDynamicallyColor(R.color.tart_orange)
            }
            //Instructions
            instructionsCount.text =
                "${data.extendedIngredients!!.size} ${getString(R.string.items)}"
            val instructions =
                HtmlCompat.fromHtml(data.instructions!!, HtmlCompat.FROM_HTML_MODE_COMPACT)
            instructionsDesc.text = instructions
            initInstructionsList(data.extendedIngredients.toMutableList())
            //Steps
            data.analyzedInstructions?.let { instructions ->
                if (instructions.isNotEmpty()) {
                    initStepsList(instructions[0].steps!!.toMutableList())
                } else {
                    Toast.makeText(requireContext(), "steps", Toast.LENGTH_SHORT)
                }
            }
            stepsShowMore.setOnClickListener {
                data.analyzedInstructions?.takeIf { it.isNotEmpty() }?.let { instructions ->
                    val direction = DetailFragmentDirections.actionDetailToSteps(instructions[0])
                    findNavController().navigate(direction)
                }
            }
            //Diets
            setupChip(data.diets!!.toMutableList(), dietsChipGroup)
        }
    }

    private fun initInstructionsList(list: MutableList<ResponseDetail.ExtendedIngredient>) {
        if (list.isNotEmpty()) {
            instructionsAdapter.setData(list)
            binding.instructionsList.setupRecyclerView(
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false),
                instructionsAdapter
            )
        }
    }

    private fun initStepsList(list: MutableList<ResponseDetail.AnalyzedInstruction.Step>) {
        if (list.isNotEmpty()) {
            Constants.STEPS_COUNT = if (list.size < 3) {
                list.size
            } else {
                3
            }
            stepsAdapter.setData(list)
            binding.apply {
                stepsList.setupRecyclerView(LinearLayoutManager(requireContext()), stepsAdapter)
                //Show more
                if (list.size > 3) {
                    stepsShowMore.isVisible = true
                }
            }
        }
    }

    private fun setupChip(list: MutableList<String>, view: ChipGroup) {
        list.forEach {
            val chip = Chip(requireContext())
            val drawable =
                ChipDrawable.createFromAttributes(requireContext(), null, 0, R.style.DietsChip)
            chip.setChipDrawable(drawable)
            chip.setTextColor(ContextCompat.getColor(requireContext(), R.color.darkGray))
            chip.text = it
            view.addView(chip)
        }
    }

    private fun showCustomDialog() {
        val dialogBuilder = AlertDialog.Builder(requireContext())

        dialogBuilder.setMessage("You can increase your chances for your favorite recipe by using the menu :)")

        dialogBuilder.setPositiveButton("OK") { _, _ ->
            val direction = LuckyFragmentDirections.actionToLuckyMenu()
            findNavController().navigate(direction)
        }
        val dialog = dialogBuilder.create()
        dialog.show()
    }

    private fun initInternetLayout(isConnected: Boolean) {
        binding.internetLay.isVisible = isConnected.not()
        binding.contentLay.visibility = View.GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}