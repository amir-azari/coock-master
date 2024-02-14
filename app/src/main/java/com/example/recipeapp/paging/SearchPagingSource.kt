package com.example.recipeapp.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.recipeapp.data.database.entity.RecentRecipeEntity
import com.example.recipeapp.data.repository.RecipeRepository
import com.example.recipeapp.data.repository.SearchRepository
import com.example.recipeapp.models.recipe.ResponseRecipes
import retrofit2.HttpException
import javax.inject.Inject

class SearchPagingSource @Inject constructor(
    private val repository: SearchRepository,
    private val queries: Map<String, String>,
) : PagingSource<Int, ResponseRecipes.Result>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, ResponseRecipes.Result> {
        return try {
            val page = params.key ?: 0
            val response =
                repository.getSearchRecipe(queries + mapOf("offset" to page.toString()))
            val data = response.body()?.results?: emptyList()

            LoadResult.Page(
                data = data,
                prevKey = if (page == 0) null else page - 1,
                nextKey = if (data.isEmpty()) null else page + 20

            )

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
