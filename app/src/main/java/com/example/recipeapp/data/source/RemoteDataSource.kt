package com.example.recipeapp.data.source

import com.example.recipeapp.data.network.ApiServices
import com.example.recipeapp.models.login.BodyLogin
import com.example.recipeapp.models.profile.BodyEditeInfo
import com.example.recipeapp.models.profile.BodyPassword
import com.example.recipeapp.models.register.BodyRegister
import javax.inject.Inject
import javax.inject.Named

class RemoteDataSource @Inject constructor(
    @Named("Api1") private val api1: ApiServices,
    @Named("Api2") private val api2: ApiServices
)  {
    //Api2
    suspend fun postRegister(body: BodyRegister) = api2.postRegister(body)
    suspend fun postLogin(body: BodyLogin) = api2.postLogin(body)
    suspend fun getUserInfo(username: String) = api2.getUserInfo(username)
    suspend fun editeUserInfo(username: String , body : BodyEditeInfo) = api2.editeUserInfo(username , body)
    suspend fun changePassword(username: String , body : BodyPassword) = api2.changePassword(username , body)

    //Api1
    suspend fun getRecipes(queries: Map<String, String>) = api1.getRecipes(queries)
    suspend fun getDetail(id: Int, apiKey: String) = api1.getDetail(id, apiKey)
    suspend fun getSimilarRecipes(id: Int, apiKey: String) = api1.getSimilarRecipes(id, apiKey)
    suspend fun getRandomRecipe(queries: Map<String, String>) = api1.getRandomRecipe(queries)


}