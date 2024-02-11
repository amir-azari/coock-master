package com.example.recipeapp

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.recipeapp.data.database.entity.RecipeEntity
import com.example.recipeapp.data.network.ApiServices
import com.example.recipeapp.data.repository.RecipeRepository
import com.example.recipeapp.data.source.RemoteDataSource
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.utils.Constants
import javax.inject.Inject

class RecipePagingSource @Inject constructor(
    private val repository: RecipeRepository,
    private val queries: Map<String, String>
) : PagingSource<Int, ResponseRecipes.Result>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ResponseRecipes.Result> {
        try {
            val page = params.key ?: 0
            val response = repository.remote.getRecipes(queries + mapOf("offset" to page.toString()))

            val data = response.body()?.results ?: emptyList()
            val prevKey = if (page > 0) page - 1 else null
            val nextKey = if (data.isNotEmpty()) page + 1 else null

            return LoadResult.Page(
                data = data,
                prevKey = prevKey,
                nextKey = nextKey
            )
        } catch (e: Exception) {
            return LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, ResponseRecipes.Result>): Int? {
        return state.anchorPosition
    }
}
