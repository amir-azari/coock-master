package com.example.recipeapp

import android.util.Log
import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.recipeapp.data.database.entity.RecipeEntity
import com.example.recipeapp.data.network.ApiServices
import com.example.recipeapp.data.repository.RecipeRepository
import com.example.recipeapp.data.source.RemoteDataSource
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.utils.Constants
import com.example.recipeapp.utils.NetworkRequest
import retrofit2.HttpException
import javax.inject.Inject

class RecipePagingSource @Inject constructor(
    private val repository: RecipeRepository,
    private val queries: Map<String, String>
) : PagingSource<Int, ResponseRecipes.Result>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ResponseRecipes.Result> {
        return try {
            val page = params.key ?: 0
            val response = repository.remote.getRecipes(queries + mapOf("offset" to page.toString()))

            if (response.isSuccessful) {
                val data = response.body()?.results ?: emptyList()

                LoadResult.Page(
                    data = data,
                    prevKey = if (page == 0) null else page - 1,
                    nextKey = if (data.isEmpty()) null else page + 40
                )
            } else {
                when (val errorCode = response.code()) {
                    401 -> {
                        LoadResult.Error(Exception("You are not authorized"))
                    }
                    402 -> {
                        LoadResult.Error(Exception("Your free plan has finished"))
                    }
                    422 -> {
                        LoadResult.Error(Exception("API key not found!"))
                    }
                    500 -> {
                        LoadResult.Error(Exception("Try again later"))
                    }
                    else -> {
                        LoadResult.Error(Exception("Error loading recipes. Code: $errorCode"))
                    }
                }
            }
        } catch (e: Exception) {
            LoadResult.Error(e)
        } catch (e: HttpException) {
            LoadResult.Error(e)
        }
    }


    override fun getRefreshKey(state: PagingState<Int, ResponseRecipes.Result>): Int? {
        return null
    }
}
