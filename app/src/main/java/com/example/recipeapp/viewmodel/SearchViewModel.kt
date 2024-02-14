package com.example.recipeapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.recipeapp.data.repository.SearchRepository
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.paging.RecipePagingSource
import com.example.recipeapp.paging.SearchPagingSource
import com.example.recipeapp.utils.Constants
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

    @HiltViewModel
    class SearchViewModel @Inject constructor(private val repository: SearchRepository) : ViewModel() {
        private val currentSearchQuery = MutableStateFlow(Constants.DEFAULT_SEARCH_QUERY)
        fun searchQueries(search: String): HashMap<String, String> {
            val queries: HashMap<String, String> = HashMap()
            queries[Constants.API_KEY] = Constants.MY_API_KEY
            queries[Constants.NUMBER] = "20"
            queries[Constants.ADD_RECIPE_INFORMATION] = Constants.TRUE
            queries[Constants.QUERY] = search
            return queries
        }

        val searchData = currentSearchQuery.flatMapLatest { searchQuery ->
            Pager(PagingConfig(1)) {
                SearchPagingSource(repository, searchQueries(searchQuery))
            }.flow.cachedIn(viewModelScope)
        }


        fun setSearchQuery(query: String) {
            currentSearchQuery.value = query
        }

    }