package com.example.recipeapp.data.source

import com.example.recipeapp.data.database.RecipeAppDao
import com.example.recipeapp.data.database.RecipeEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(private val dao: RecipeAppDao) {

    //Recipes
    suspend fun saveRecipes(entity: RecipeEntity) = dao.saveRecipes(entity)
    fun loadRecipes() = dao.loadRecipes()
}