package com.example.recipeapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.data.repository.ChangePasswordRepository
import com.example.recipeapp.models.profile.BodyPassword
import com.example.recipeapp.models.profile.ResponsChangePassword
import com.example.recipeapp.models.profile.ResponseProfile
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


import javax.inject.Inject

@HiltViewModel
class ChangePasswordViewModel @Inject constructor(private val repository: ChangePasswordRepository) : ViewModel(){
    val data = MutableLiveData<NetworkRequest<ResponsChangePassword>>()

    fun callRegisterApi(username : String ,body: BodyPassword) = viewModelScope.launch {
        data.value = NetworkRequest.Loading()
        val response = repository.changePassword(username, body)
        data.value  = NetworkResponse(response).changePassNetworkResponse()
    }

}
