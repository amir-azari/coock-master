package com.example.recipeapp.data.network

import com.example.recipeapp.models.detail.ResponseDetail
import com.example.recipeapp.models.recipe.ResponseRecipes
import com.example.recipeapp.models.register.BodyRegister
import com.example.recipeapp.models.register.ResponseRegister
import com.example.recipeapp.utils.Constants
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface ApiServices {

    @POST("users/connect")
    suspend fun postRegister(@Query(Constants.API_KEY) apiKey : String , @Body body : BodyRegister) : Response<ResponseRegister>

    @GET("recipes/complexSearch")
    suspend fun getRecipes(@QueryMap queries: Map<String , String>) : Response<ResponseRecipes>

    @GET("/recipes/{id}/information")
    suspend fun getDetail(@Path("id")id:Int , @Query(Constants.API_KEY) apiKey : String ) : Response<ResponseDetail>
}