package com.example.recipeapp.ui.recipe

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.asLiveData
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.paging.LoadState
import androidx.paging.PagingData
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearSnapHelper
import com.example.recipeapp.adapter.PopularAdapter
import com.example.recipeapp.R
import com.example.recipeapp.adapter.LoadMoreAdapter
import com.example.recipeapp.adapter.RecentAdapter
import com.example.recipeapp.data.SessionManager
import com.example.recipeapp.databinding.FragmentRecipeBinding
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.models.recipe.ResponseRecipes.Result
import com.example.recipeapp.ui.menu.MenuFragmentDirections
import com.example.recipeapp.utils.Constants
import com.example.recipeapp.utils.NetworkChecker
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.isVisible
import com.example.recipeapp.utils.onceObserve
import com.example.recipeapp.utils.setupRecyclerView
import com.example.recipeapp.utils.showSnackBar
import com.example.recipeapp.viewmodel.LoginViewModel
import com.example.recipeapp.viewmodel.ProfileViewModel
import com.example.recipeapp.viewmodel.RecipeViewModel
import com.example.recipeapp.viewmodel.RegisterViewModel
import com.todkars.shimmer.ShimmerRecyclerView
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
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

    @Inject
    lateinit var sessionManager: SessionManager

    @Inject
    lateinit var networkChecker : NetworkChecker

    //Other
    private val recipeViewModel: RecipeViewModel by viewModels()
    private val profileViewModel: ProfileViewModel by viewModels()
    private val args: RecipeFragmentArgs by navArgs()
    private var atuScrollIndex = 0
    private var token = ""

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRecipeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        lifecycleScope.launch {
            lifecycleScope.launch {
                viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.CREATED) {
                    token = sessionManager.getToken.first().toString()
                    Log.d("TokenLog", token.toString())
                    showUsername()
                }
            }
        }

        binding.avatarImg.setOnClickListener {
            findNavController().navigate(RecipeFragmentDirections.actionToProfileFragment(token))
        }

        //Call data
        callPopularData()
        callRecentData()
        callProfileData()
        //Load data
        loadPopularData()
        loadProfileData()
    }
    //---Profile---
    private fun callProfileData(){
        profileViewModel.readProfileStoredItems.asLiveData().onceObserve(viewLifecycleOwner){
            if (it.firstname.isNullOrEmpty() && it.username.isNullOrEmpty() && it.lastname.isNullOrEmpty() ){
                profileViewModel.callInformationApi(token)
            }
        }
    }
    private fun loadProfileData() {

        binding.apply {

            profileViewModel.profileData.observe(viewLifecycleOwner) { response ->
                when (response) {
                    is NetworkRequest.Loading -> {
                    }

                    is NetworkRequest.Success -> {
                        response.data?.let { data ->
                            if (data.data != null){
                                lifecycleScope.launchWhenStarted {
                                    networkChecker.checkNetworkAvailability().collect { state ->
                                        if (state){
                                            data.data.lastName?.let {
                                                data.data.username?.let { it1 ->
                                                    data.data.firstName?.let { it2 ->
                                                        profileViewModel.saveToStore(
                                                            it1, it2, it
                                                        )
                                                    }
                                                }
                                            }
                                        } else {
                                            Toast.makeText(requireContext(), "No internet connection", Toast.LENGTH_SHORT).show()
                                        }
                                    }
                                }
                            }
                        }
                    }

                    is NetworkRequest.Error -> {
                        binding.root.showSnackBar(response.message!!)
                    }

                    else -> {}
                }
            }
        }
    }
    //---Popular---
    private fun callPopularData() {
        initPopularRecycler()
        recipeViewModel.readPopularFromDb.onceObserve(viewLifecycleOwner) { database ->
            if (database.isNotEmpty()) {
                database[0].response.results?.let { result ->
                    setupLoading(false, binding.popularList)
                    fillPopularAdapter(result.toMutableList())
                }
            } else {
                recipeViewModel.callPopularApi(recipeViewModel.popularQueries())
            }
        }
    }

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
                                fillPopularAdapter(data.results.toMutableList())
                            }
                        }
                    }

                    is NetworkRequest.Error -> {
                        setupLoading(false, popularList)
                        binding.root.showSnackBar(response.message!!)
                    }

                    else -> {}
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
            gotoDetailPage(it)
        }
    }

    private fun autoScrollPopular(list: List<Result>) {
        lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.CREATED) {
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
    }
    //---Recent--

    private fun callRecentData() {

        initRecentRecycler()

        if (args.isUpdateData) {
            lifecycleScope.launch {
                recipeViewModel.clearData()
            }
        }


        //Loading
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


        //Load more
        binding.recipesList.adapter = recentAdapter.withLoadStateFooter(
            LoadMoreAdapter{
                recentAdapter.retry()
            }
        )

        //Empty
        recentAdapter.addLoadStateListener { loadState ->

            if (loadState.append.endOfPaginationReached) {
                if (recentAdapter.itemCount < 1)
                    binding.apply {
                        emptyLay.visibility = View.VISIBLE
                    }
                else
                    binding.apply {
                        recipesList.visibility = View.VISIBLE
                        emptyLay.visibility = View.GONE
                    }

            }
        }


        recipeViewModel.readRecentFromDb.onceObserve(viewLifecycleOwner) { database ->
            if (database.isNotEmpty() && database.size > 1 && !args.isUpdateData) {
                lifecycleScope.launch {
                    database.let { result ->
                        val pagingData = PagingData.from(result)
                        recentAdapter.submitData(pagingData)
                        binding.recipesList.isVisible(true, binding.emptyLay)
                    }
                }
            } else {
                recipeViewModel.recentQueries()
                //Load data
                lifecycleScope.launch {
                    repeatOnLifecycle(Lifecycle.State.CREATED) {
                        recipeViewModel.recentData.collect {
                            recentAdapter.submitData(it)
                            binding.recipesList.visibility = View.VISIBLE

                        }
                    }
                }
            }
        }

    }

    private fun showToast(message: String) {
        Toast.makeText(requireContext(), message, Toast.LENGTH_SHORT).show()
    }


    private fun initRecentRecycler() {

        binding.recipesList.setupRecyclerView(
            LinearLayoutManager(requireContext(), LinearLayoutManager.VERTICAL, false),
            recentAdapter
        )

        //Click
        recentAdapter.setOnItemClickListener {
            gotoDetailPage(it)
        }
    }


    private fun setupLoading(isShownLoading: Boolean, shimmer: ShimmerRecyclerView) {
        shimmer.apply {
            if (isShownLoading) showShimmer() else hideShimmer()
        }
    }

    private fun fillPopularAdapter(result: MutableList<ResponseRecipes.Result>) {
        popularAdapter.setData(result)
        autoScrollPopular(result)
    }

    @SuppressLint("SetTextI18n")
    suspend fun showUsername() {
        val token = sessionManager.getToken.first()
        Log.d("TokenLog" , token.toString())
        if (!token.isNullOrEmpty()) {
            binding.usernameTxt.text =
                "${getString(R.string.hello)} , $token ${gttEmojiByUnicode()}"

        }
    }


    private fun gttEmojiByUnicode(): String {
        return String(Character.toChars(0x1f44b))
    }

    private fun gotoDetailPage(id: Int) {
        val action = RecipeFragmentDirections.actionToDetail(id)
        findNavController().navigate(action)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}