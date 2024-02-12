package com.example.recipeapp.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.graphics.Rect
import android.util.Log
import android.view.inputmethod.EditorInfo
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeapp.adapter.RecentAdapter
import com.example.recipeapp.databinding.FragmentSearchBinding
import com.example.recipeapp.ui.recipe.RecipeFragmentDirections
import com.example.recipeapp.utils.NetworkChecker
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.isVisible
import com.example.recipeapp.utils.setupRecyclerView
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.SearchViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collect
import javax.inject.Inject
import kotlin.properties.Delegates

@AndroidEntryPoint
class SearchFragment : Fragment() {
    //Binding
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var recentAdapter: RecentAdapter

    @Inject
    lateinit var networkChecker: NetworkChecker

    //Other
    private val viewModel: SearchViewModel by viewModels()
    private var isNetworkAvailable by Delegates.notNull<Boolean>()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        _binding = FragmentSearchBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //InitViews
        binding.apply {
//            Keyboard listener
            requireActivity().window.decorView.viewTreeObserver.addOnGlobalLayoutListener {
                val rect = Rect()
                requireActivity().window.decorView.getWindowVisibleDisplayFrame(rect)
                val height = requireActivity().window.decorView.height
                if (height - rect.bottom <= height * 0.1399)
                    rootMotion.transitionToStart()
                else
                    rootMotion.transitionToEnd()
            }
            //Check internet
            lifecycleScope.launchWhenStarted {
                networkChecker.checkNetworkAvailability().collect { state ->
                    initInternetLayout(state)
                    isNetworkAvailable = state
                }
            }

            //Search
            searchEdt.addTextChangedListener {
                if (it.toString().length > 2 && isNetworkAvailable) {
                    searchEdt.isVisible = true
                    viewModel.callSearchApi(viewModel.searchQueries(it.toString()))
                } else {
                    // Check for internet connection
                    if (isNetworkAvailable) {
                        // Internet is available, but the list is empty
                        emptyLay.isVisible(true, searchList)
                    } else {
                        // Internet is not available
                        internetLay.isVisible(true, searchList)
                    }
                }
            }
        }

        // Show data
        loadRecentData()
    }

    // Inside the loadRecentData function
    private fun loadRecentData() {
        binding.apply {
            viewModel.searchData.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is NetworkRequest.Loading -> {
                        searchList.showShimmer()
                    }
                    is NetworkRequest.Success -> {
                        searchList.hideShimmer()
                        response.data?.let { data ->
                            if (data.results!!.isNotEmpty()) {
                                // List is not empty
                                searchList.isVisible = true
                                emptyLay.isVisible(false, searchList)
//                                recentAdapter.setData(data.results)
                                initRecentRecycler()
                            } else {
                                // List is empty
                                searchList.isVisible = false
                                emptyLay.isVisible(true, searchList)
                            }
                        }
                    }
                    is NetworkRequest.Error -> {
                        searchList.hideShimmer()
                        binding.root.showSnackBar(response.message!!)
                    }
                }
            }
        }
    }


    private fun initRecentRecycler() {
        binding.searchList.setupRecyclerView(
            LinearLayoutManager(requireContext()),
            recentAdapter
        )
        //Click
        recentAdapter.setOnItemClickListener {
            gotoDetailPage(it)
        }
    }

    private fun gotoDetailPage(id: Int) {
        val action = RecipeFragmentDirections.actionToDetail(id)
        findNavController().navigate(action)
    }

    private fun initInternetLayout(isConnected: Boolean) {
        binding.internetLay.visibility = if (isConnected) View.GONE else View.VISIBLE
        binding.emptyLay.visibility = View.GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        networkChecker.unregisterNetworkCallback()
        _binding = null
    }


}