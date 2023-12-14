package com.example.recipeapp.utils

import retrofit2.Response

open class NetworkResponse<T>(private val response: Response<T>) {

    fun generalNetworkResponse() : NetworkRequest<T> {
        return when{
            response.message().contains("timeout") -> NetworkRequest.Error("Time out")

            response.code() == 401 -> NetworkRequest.Error("You ate not authorized")
            response.code() == 402 -> NetworkRequest.Error("You free plan finished")
            response.code() == 422 -> NetworkRequest.Error("Api key not found!!!")
            response.code() == 500 -> NetworkRequest.Error("Try again!")
            response.isSuccessful -> NetworkRequest.Success(response.body()!!)
            else -> NetworkRequest.Error(response.message())
        }
    }
}