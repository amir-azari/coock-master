package com.example.recipeapp.ui.search

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import android.graphics.Rect
import android.util.Log
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.paging.LOGGER
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.recyclerview.widget.ConcatAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recipeapp.adapter.LoadMoreAdapter
import com.example.recipeapp.adapter.RecentAdapter
import com.example.recipeapp.adapter.SearchAdapter
import com.example.recipeapp.databinding.FragmentSearchBinding
import com.example.recipeapp.ui.recipe.RecipeFragmentDirections
import com.example.recipeapp.utils.NetworkChecker
import com.example.recipeapp.utils.isVisible
import com.example.recipeapp.utils.setupRecyclerView
import com.example.recipeapp.viewmodel.SearchViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import okhttp3.internal.notifyAll
import javax.inject.Inject
import kotlin.properties.Delegates

@AndroidEntryPoint
class SearchFragment : Fragment() {
    //Binding
    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    @Inject
    lateinit var recentAdapter: SearchAdapter

    @Inject
    lateinit var networkChecker: NetworkChecker


    //Other
    private val viewModel: SearchViewModel by viewModels()
    private var isNetworkAvailable by Delegates.notNull<Boolean>()


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
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
            searchEdt.addTextChangedListener { editable ->
                val query = editable?.toString()?.trim() ?: ""

                if (query.length > 2 && isNetworkAvailable ) {
                    viewModel.setSearchQuery(query)
                    searchList.isVisible(true, emptyLay)

                    lifecycleScope.launch {
                        viewModel.searchData.collectLatest {

                            recentAdapter.submitData(PagingData.empty())
                            recentAdapter.notifyDataSetChanged()
                            recentAdapter.submitData(it)


                        }
                    }
                }
            }
        }


        // Show data
        loadRecentData()
    }

    private fun loadRecentData() {

        initRecentRecycler()


        //Load more
        binding.searchList.adapter = recentAdapter.withLoadStateFooter(
            LoadMoreAdapter {
                recentAdapter.retry()
            }
        )

        //loading
        lifecycleScope.launch {
            repeatOnLifecycle(Lifecycle.State.CREATED) {
                recentAdapter.loadStateFlow.collectLatest { loadState ->
                    val state = loadState.refresh
                    binding.shimmerRecipeLay.isVisible = state is LoadState.Loading

                    if (state is LoadState.Error) {
                        when (state.error) {

                            is Exception -> state.error

                            else -> showToast("Unknown error")
                        }

                        showToast("Error: ${state.error.message}")

                    }
                }

            }
        }
        //Empty
        recentAdapter.addLoadStateListener { loadState ->

            if (loadState.append.endOfPaginationReached) {
                if (recentAdapter.itemCount < 1)
                    binding.apply {
                        emptyLay.visibility = View.VISIBLE
                    }
                else
                    binding.apply {
                        searchList.visibility = View.VISIBLE
                        emptyLay.visibility = View.GONE
                    }

            }
        }

    }
    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
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
        binding.searchList.visibility = View.GONE
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}