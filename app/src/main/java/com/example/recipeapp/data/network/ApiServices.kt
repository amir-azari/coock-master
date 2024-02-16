package com.example.recipeapp.data.network

import com.example.recipeapp.models.detail.ResponseDetail
import com.example.recipeapp.models.detail.ResponseSimilar
import com.example.recipeapp.models.login.BodyLogin
import com.example.recipeapp.models.login.ResponseLogin
import com.example.recipeapp.models.lucky.ResponseLucky
import com.example.recipeapp.models.profile.BodyEditeInfo
import com.example.recipeapp.models.profile.ResponseProfile
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.models.register.BodyRegister
import com.example.recipeapp.models.register.ResponseRegister
import com.example.recipeapp.utils.Constants.API_KEY
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface ApiServices {

    // BASE_URL_API2 endpoints
    @POST("register")
    suspend fun postRegister(@Body body: BodyRegister): Response<ResponseRegister>
    @POST("login")
    suspend fun postLogin(@Body body: BodyLogin): Response<ResponseLogin>
    @GET("information/{username}")
    suspend fun getUserInfo(@Path("username") username : String): Response<ResponseProfile>

    @PUT("editeInfo/{username}")
    suspend fun editeUserInfo(@Path("username") username : String , @Body body: BodyEditeInfo): Response<ResponseProfile>


    // BASE_URL_API1 endpoints
    @GET("recipes/complexSearch")
    suspend fun getRecipes(@QueryMap queries: Map<String, String>): Response<ResponseRecipes>

    @GET("recipes/{id}/information")
    suspend fun getDetail(@Path("id") id: Int, @Query(API_KEY) apiKey: String): Response<ResponseDetail>

    @GET("recipes/{id}/similar")
    suspend fun getSimilarRecipes(@Path("id") id: Int, @Query(API_KEY) apiKey: String): Response<ResponseSimilar>

    @GET("recipes/random")
    suspend fun getRandomRecipe(@QueryMap queries: Map<String, String>): Response<ResponseLucky>
}