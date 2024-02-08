package com.example.recipeapp.data.source

import com.example.recipeapp.data.network.ApiServices
import com.example.recipeapp.models.register.BodyRegister
import javax.inject.Inject
import javax.inject.Named

class RemoteDataSource @Inject constructor(
    @Named("Api1") private val api1: ApiServices,
    @Named("Api2") private val api2: ApiServices
)  {

    suspend fun postRegister(body: BodyRegister) = api2.postRegister(body)
    suspend fun getRecipes(queries: Map<String, String>) = api1.getRecipes(queries)
    suspend fun getDetail(id: Int, apiKey: String) = api1.getDetail(id, apiKey)
    suspend fun getSimilarRecipes(id: Int, apiKey: String) = api1.getSimilarRecipes(id, apiKey)
    suspend fun getRandomRecipe(queries: Map<String, String>) = api1.getRandomRecipe(queries)


}