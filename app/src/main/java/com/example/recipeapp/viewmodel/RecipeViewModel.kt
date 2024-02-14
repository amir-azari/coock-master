package com.example.recipeapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.recipeapp.paging.RecipePagingSource
import com.example.recipeapp.data.database.entity.RecipeEntity
import com.example.recipeapp.data.repository.MenuRepository
import com.example.recipeapp.data.repository.RecipeRepository
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.utils.Constants
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class RecipeViewModel @Inject constructor(
    private val repository: RecipeRepository,
    private val menuRepository: MenuRepository
) : ViewModel() {

    //---Popular---//
    //Queries
    fun popularQueries(): HashMap<String, String> {
        val queries: HashMap<String, String> = HashMap()
        queries[Constants.API_KEY] = Constants.MY_API_KEY
        queries[Constants.SORT] = Constants.POPULARITY
        queries[Constants.NUMBER] = "10"
        queries[Constants.ADD_RECIPE_INFORMATION] = Constants.TRUE
        return queries
    }

    //Api
    val popularData = MutableLiveData<NetworkRequest<ResponseRecipes>>()
    fun callPopularApi(queries: Map<String, String>) = viewModelScope.launch {
        popularData.value = NetworkRequest.Loading()
        val response = repository.remote.getRecipes(queries)
        popularData.value = NetworkResponse(response).generalNetworkResponse()
        //Cache
        val cache = popularData.value?.data
        if (cache != null)
            offlinePopular(cache)
    }

    //Local
    private fun savePopular(entity: RecipeEntity) = viewModelScope.launch(Dispatchers.IO) {
        repository.local.saveRecipes(entity)
    }

    val readPopularFromDb = repository.local.loadRecipes().asLiveData()

    private fun offlinePopular(response: ResponseRecipes) {
        val entity = RecipeEntity(0, response)
        savePopular(entity)
    }

    //---Recent---//
    //Queries
    private var mealType = ""
    private var dietType = ""
    private var cuisineType = ""
    private var sorting = ""
    private var order = ""
    private var time = 0


    fun recentQueries(): HashMap<String, String> {
        viewModelScope.launch {
            menuRepository.readMenuData.collect {
                mealType = it.meal
                dietType = it.diet
                cuisineType = it.cuisine
                sorting = it.sorting
                order = it.order
                time = it.hourValue * 60 + it.minValue
            }
        }
        val queries: HashMap<String, String> = HashMap()
        queries[Constants.API_KEY] = Constants.MY_API_KEY
        queries[Constants.TYPE] = mealType
        queries[Constants.DIET] = dietType
        queries[Constants.CUISINE] = cuisineType
        queries[Constants.SORT] = sorting
        Log.d("order check", order.toString())
        queries[Constants.ORDER] = if (order != "") {
            order
        } else
            "desc"
        if (time != 0) {
            queries[Constants.MAXREADYTIME] = time.toString()
        }
        queries[Constants.NUMBER] = "20"
        queries[Constants.ADD_RECIPE_INFORMATION] = Constants.TRUE
        return queries
    }

    //Api
    val recentData = Pager(PagingConfig(1)) {
        RecipePagingSource(repository, recentQueries())
    }.flow.cachedIn(viewModelScope)

    suspend fun clearData() = repository.local.clearRecentData()

    //Local
    val readRecentFromDb = repository.local.loadRecentRecipes().asLiveData()

}