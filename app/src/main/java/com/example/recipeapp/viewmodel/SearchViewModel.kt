package com.example.recipeapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.recipeapp.data.repository.SearchMenuRepository
import com.example.recipeapp.data.repository.SearchRepository
import com.example.recipeapp.paging.SearchPagingSource
import com.example.recipeapp.utils.Constants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.flatMapLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val searchRepository: SearchRepository,
    private val searchMenuRepository: SearchMenuRepository
) : ViewModel() {


    private var sorting = ""
    private var order = ""
    private var time = 0

    private val currentSearchQuery = MutableStateFlow(Constants.DEFAULT_SEARCH_QUERY)
    fun searchQueries(search: String): HashMap<String, String> {
        viewModelScope.launch {
            searchMenuRepository.readMenuData.collect {
                sorting = it.sorting
                order = it.order
                time = it.hourValue * 60 + it.minValue
            }
        }
        val queries: HashMap<String, String> = HashMap()
        queries[Constants.API_KEY] = Constants.MY_API_KEY
        queries[Constants.NUMBER] = "20"
        queries[Constants.ADD_RECIPE_INFORMATION] = Constants.TRUE
        queries[Constants.QUERY] = search
        if (time != 0) {
            queries[Constants.MAXREADYTIME] = time.toString()
        }
        queries[Constants.SORT] = sorting
        queries[Constants.ORDER] = if (order != "") {
            order
        } else
            "desc"

        return queries
    }

    val searchData = currentSearchQuery.flatMapLatest { searchQuery ->
        Pager(PagingConfig(1)) {
            SearchPagingSource(searchRepository, searchQueries(searchQuery))
        }.flow.cachedIn(viewModelScope)
    }


    fun setSearchQuery(query: String) {
        currentSearchQuery.value = query
    }


}