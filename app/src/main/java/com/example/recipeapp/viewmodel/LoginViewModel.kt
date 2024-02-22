package com.example.recipeapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.data.repository.LoginRepository
import com.example.recipeapp.data.repository.RegisterRepository
import com.example.recipeapp.models.login.BodyLogin
import com.example.recipeapp.models.login.ResponseLogin
import com.example.recipeapp.models.register.BodyRegister
import com.example.recipeapp.models.register.ResponseRegister
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(private val repository: LoginRepository) : ViewModel() {

    //API
    val loginData = MutableLiveData<NetworkRequest<ResponseLogin>>()

    fun callRegisterApi(body: BodyLogin) = viewModelScope.launch {
        loginData.value = NetworkRequest.Loading()

        val response = repository.postRegister(body)
        loginData.value = NetworkResponse(response).loginNetworkResponse()

    }


}