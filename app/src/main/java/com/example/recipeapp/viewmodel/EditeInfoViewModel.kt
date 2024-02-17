package com.example.recipeapp.viewmodel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.data.repository.EditeInformationRepository
import com.example.recipeapp.data.repository.ProfileRepository
import com.example.recipeapp.models.login.BodyLogin
import com.example.recipeapp.models.login.ResponseLogin
import com.example.recipeapp.models.profile.BodyEditeInfo
import com.example.recipeapp.models.profile.ResponseProfile
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class EditeInfoViewModel @Inject constructor(private val repository: EditeInformationRepository) : ViewModel(){

    val editeData = MutableLiveData<NetworkRequest<ResponseProfile>>()

    fun callRegisterApi(username : String ,body: BodyEditeInfo) = viewModelScope.launch {
        editeData.value = NetworkRequest.Loading()

        val response = repository.editeUserInfo(username, body)
        editeData.value = NetworkResponse(response).generalNetworkResponse()
    }


}