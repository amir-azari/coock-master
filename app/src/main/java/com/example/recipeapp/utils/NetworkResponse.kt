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
            response.code() == 409 -> NetworkRequest.Error("Username is already taken")
            response.isSuccessful -> NetworkRequest.Success(response.body()!!)
            else -> NetworkRequest.Error(response.message().toString())
        }
    }
    fun loginNetworkResponse() : NetworkRequest<T> {
        return when {
            response.code() == 401 -> NetworkRequest.Error("Invalid username or password")
            response.code() == 404 -> NetworkRequest.Error("User not found")
            response.isSuccessful -> NetworkRequest.Success(response.body()!!)
            else -> NetworkRequest.Error(response.message().toString())
        }
    }
    fun changePassNetworkResponse() : NetworkRequest<T> {
        return when {
            response.code() == 400 -> NetworkRequest.Error("New password must be different from the old password")
            response.code() == 401 -> NetworkRequest.Error("Incorrect old password")
            response.code() == 404 -> NetworkRequest.Error("User not found")
            response.isSuccessful -> NetworkRequest.Success(response.body()!!)
            else -> NetworkRequest.Error(response.message().toString())
        }
    }
}