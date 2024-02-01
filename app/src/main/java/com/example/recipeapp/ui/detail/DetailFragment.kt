package com.example.recipeapp.ui.detail

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.annotation.SuppressLint
import androidx.core.content.ContextCompat
import androidx.core.text.HtmlCompat
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import coil.load
import coil.request.CachePolicy
import com.example.recipeapp.R
import com.example.recipeapp.adapter.InstructionsAdapter
import com.example.recipeapp.adapter.SimilarAdapter
import com.example.recipeapp.adapter.StepsAdapter
import com.example.recipeapp.databinding.FragmentDetailBinding
import com.example.recipeapp.models.detail.ResponseDetail
import com.example.recipeapp.models.detail.ResponseSimilar
import com.example.recipeapp.ui.recipe.RecipeFragmentDirections
import com.example.recipeapp.utils.Constants
import com.example.recipeapp.utils.NetworkChecker
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.isVisible
import com.example.recipeapp.utils.minToHour
import com.example.recipeapp.utils.setDynamicallyColor
import com.example.recipeapp.utils.setupRecyclerView
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.DetailViewModel
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipDrawable
import com.google.android.material.chip.ChipGroup
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import javax.inject.Inject

@AndroidEntryPoint
class DetailFragment : Fragment() {
    //Binding
    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var instructionsAdapter: InstructionsAdapter

    @Inject
    lateinit var stepsAdapter: StepsAdapter

    @Inject
    lateinit var similarAdapter: SimilarAdapter

    @Inject
    lateinit var networkChecker: NetworkChecker

    //Other
    private val viewModel: DetailViewModel by viewModels()
    private val args: DetailFragmentArgs by navArgs()
    private var recipeId = 0
    private var isExistsCache = false
    private var isExistsFavorite = false

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentDetailBinding.inflate(layoutInflater)
        return binding.root
    }

    @SuppressLint("SetTextI18n")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //Args
        args.let {
            recipeId = args.recipeID
            //Call api
            if (recipeId > 0)
                checkExistsDetailInCache(recipeId)
        }
        //InitViews
        binding.apply {
            //Back
            backImg.setOnClickListener { findNavController().popBackStack() }
        }
        //Check Internet
        lifecycleScope.launchWhenStarted {
            networkChecker.checkNetworkAvailability().collect { state ->
                delay(200)
                if (isExistsCache.not()) {
                    initInternetLayout(state)
                    if (state) {
                        loadDetailDataFromApi()
                    }
                }
                //Similar
                if (state)
                    viewModel.callSimilarApi(recipeId, Constants.MY_API_KEY)
            }
        }

    }

    private fun loadDetailDataFromApi() {
        viewModel.callDetailApi(recipeId, Constants.MY_API_KEY)
        binding.apply {
            viewModel.detailData.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is NetworkRequest.Loading -> {
                        loading.isVisible(true, contentLay)
                    }
                    is NetworkRequest.Success -> {
                        loading.isVisible(false, contentLay)
                        response.data?.let { data ->
                            initViewsWithData(data)
                        }
                    }
                    is NetworkRequest.Error -> {
                        loading.isVisible(false, contentLay)
                        binding.root.showSnackBar(response.message!!)
                    }
                }
            }
        }
    }

    private fun checkExistsDetailInCache(id: Int) {
        viewModel.existsDetail(id)
        //Load
        viewModel.existsDetailData.observe(viewLifecycleOwner) {
            isExistsCache = it
            if (it) {
                loadDetailDataFromDb()
                loadSimilarData()
                binding.contentLay.isVisible = true
            }
        }
    }

    private fun loadDetailDataFromDb() {
        viewModel.readDetailFromDb(recipeId).observe(viewLifecycleOwner) {
            initViewsWithData(it.result)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun initViewsWithData(data: ResponseDetail) {
        binding.apply {

            //Image
            val imageSplit = data.image!!.split("-")
            val imageSize = imageSplit[1].replace(Constants.OLD_IMAGE_SIZE, Constants.NEW_IMAGE_SIZE)
            coverImg.load("${imageSplit[0]}-$imageSize") {
                crossfade(true)
                crossfade(800)
                memoryCachePolicy(CachePolicy.ENABLED)
                error(R.drawable.ic_placeholder)
            }
            //Source
//            data.sourceUrl?.let { source ->
//                sourceImg.isVisible = true
//                sourceImg.setOnClickListener {
//                    val direction = DetailFragmentDirections.actionToWebView(source)
//                    findNavController().navigate(direction)
//                }
//            }
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
            priceTxt.text = "${data.pricePerServing} $"
            //Healthy
            healthyTxt.text = data.healthScore.toString()
            when (data.healthScore) {
                in 90..100 -> healthyTxt.setDynamicallyColor(R.color.caribbean_green)
                in 60..89 -> healthyTxt.setDynamicallyColor(R.color.chineseYellow)
                in 0..59 -> healthyTxt.setDynamicallyColor(R.color.tart_orange)
            }
            //Instructions
            instructionsCount.text = "${data.extendedIngredients!!.size} ${getString(R.string.items)}"
            val instructions = HtmlCompat.fromHtml(data.instructions!!, HtmlCompat.FROM_HTML_MODE_COMPACT)
            instructionsDesc.text = instructions
            initInstructionsList(data.extendedIngredients.toMutableList())
            //Steps
//            initStepsList(data.analyzedInstructions!![0].steps!!.toMutableList())
//            stepsShowMore.setOnClickListener {
//                val direction = DetailFragmentDirections.actionDetailToSteps(data.analyzedInstructions[0])
//                findNavController().navigate(direction)
//            }
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

    private fun initSimilarData(list: MutableList<ResponseSimilar.ResponseSimilarItem>) {
        similarAdapter.setData(list)
        binding.similarList.setupRecyclerView(
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false),
            similarAdapter
        )
        //Click
        similarAdapter.setOnItemClickListener {
            val action = RecipeFragmentDirections.actionToDetail(it)
            findNavController().navigate(action)
        }
    }

    private fun loadSimilarData() {
        binding.apply {
            viewModel.similarData.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is NetworkRequest.Loading -> {
                        similarList.showShimmer()
                    }
                    is NetworkRequest.Success -> {
                        similarList.hideShimmer()
                        response.data?.let { data ->
                            initSimilarData(data)
                        }
                    }
                    is NetworkRequest.Error -> {
                        similarList.hideShimmer()
                        binding.root.showSnackBar(response.message!!)
                    }
                }
            }
        }
    }

    private fun setupChip(list: MutableList<String>, view: ChipGroup) {
        list.forEach {
            val chip = Chip(requireContext())
            val drawable = ChipDrawable.createFromAttributes(requireContext(), null, 0, R.style.DietsChip)
            chip.setChipDrawable(drawable)
            chip.setTextColor(ContextCompat.getColor(requireContext(), R.color.darkGray))
            chip.text = it
            view.addView(chip)
        }
    }

    private fun initInternetLayout(isConnected: Boolean) {
        binding.internetLay.isVisible = isConnected.not()
    }



    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}