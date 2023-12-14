package com.example.recipeapp.ui.recipe

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.example.recipeapp.adapter.PopularAdapter
import com.example.recipeapp.R
import com.example.recipeapp.adapter.RecentAdapter
import com.example.recipeapp.databinding.FragmentRecipeBinding
import com.example.recipeapp.models.recipe.ResponseRecipes.Result
import com.example.recipeapp.utils.Constants
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.setupRecyclerView
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.RecipeViewModel
import com.example.recipeapp.viewmodel.RegisterViewModel
import com.todkars.shimmer.ShimmerRecyclerView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.delay
import javax.inject.Inject

@AndroidEntryPoint
class RecipeFragment : Fragment() {

    //Binding
    private var _binding: FragmentRecipeBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var popularAdapter: PopularAdapter
    @Inject
    lateinit var recentAdapter: RecentAdapter

    //Other
    private val recipeViewModel: RecipeViewModel by viewModels()
    private val registerViewModel: RegisterViewModel by viewModels()
    private var atuScrollIndex = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        _binding = FragmentRecipeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //InitView
        binding.apply {
            //Show username
            lifecycleScope.launchWhenCreated { showUsername() }
            //Call Api
            recipeViewModel.callPopularApi(recipeViewModel.popularQueries())
            recipeViewModel.callRecentApi(recipeViewModel.recentQueries())
            //Load Data
            loadPopularData()
            loadRecentData()




        }
    }

    //---Popular---
    private fun loadPopularData() {
        binding.apply {
            recipeViewModel.popularData.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is NetworkRequest.Loading -> {
                        setupLoading(true, popularList)
                    }

                    is NetworkRequest.Success -> {
                        setupLoading(false, popularList)
                        response.data?.let { data ->
                            if (data.results!!.isNotEmpty()) {
                                popularAdapter.setData(data.results)
                                initPopularRecycler()
                                atuScrollPopular(data.results)

                            }

                        }
                    }

                    is NetworkRequest.Error -> {
                        setupLoading(false, popularList)
                        binding.root.showSnackBar(response.message!!)
                    }
                }
            }
        }

    }

    private fun initPopularRecycler() {
        val snapHelper = LinearSnapHelper()


        binding.popularList.setupRecyclerView(
            LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false),
            popularAdapter

        )
        //Snap
        snapHelper.attachToRecyclerView(binding.popularList)

        //Click
        popularAdapter.setOnItemClickListener {
            //TODO
        }
    }

    private fun atuScrollPopular(list: List<Result>) {
        lifecycleScope.launchWhenCreated {
            repeat(Constants.REPEAT_TIME) {
                delay(Constants.DELAY_TIME.toLong())
                if (atuScrollIndex < list.size) {
                    atuScrollIndex += 1

                } else {
                    atuScrollIndex = 0
                }
                binding.popularList.smoothScrollToPosition(atuScrollIndex)
            }

        }
    }
    //---Recent--

    private fun loadRecentData(){
        binding.apply {
            recipeViewModel.recentData.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is NetworkRequest.Loading -> {
                        setupLoading(true, recipesList)
                    }

                    is NetworkRequest.Success -> {
                        setupLoading(false, recipesList)
                        response.data?.let { data ->
                            if (data.results!!.isNotEmpty()) {
                                recentAdapter.setData(data.results)
                                initRecentRecycler()
                                atuScrollPopular(data.results)

                            }

                        }
                    }

                    is NetworkRequest.Error -> {
                        setupLoading(false, recipesList)
                        binding.root.showSnackBar(response.message!!)
                    }
                }
            }
        }

    }
    private fun initRecentRecycler() {

        binding.recipesList.setupRecyclerView(
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false),
            recentAdapter
        )

        //Click
        recentAdapter.setOnItemClickListener {
            //TODO
        }
    }


    private fun setupLoading(isShownLoading: Boolean, shimmer: ShimmerRecyclerView) {
        shimmer.apply {
            if (isShownLoading) {
                showShimmer()
            } else {
                hideShimmer()
            }
        }


    }

    @SuppressLint("SetTextI18n")
    suspend fun showUsername() {
        registerViewModel.readData.collect() {
            binding.usernameTxt.text =
                "${getString(R.string.hello)} , ${it.username} ${gttEmojiByUnicode()}"

        }
    }

    private fun gttEmojiByUnicode(): String {
        return String(Character.toChars(0x1f44b))
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}