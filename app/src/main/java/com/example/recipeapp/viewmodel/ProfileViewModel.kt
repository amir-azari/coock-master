package com.example.recipeapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.recipeapp.data.repository.LoginRepository
import com.example.recipeapp.data.repository.ProfileRepository
import com.example.recipeapp.models.login.BodyLogin
import com.example.recipeapp.models.login.ResponseLogin
import com.example.recipeapp.models.profile.ResponseProfile
import com.example.recipeapp.utils.NetworkRequest
import com.example.recipeapp.utils.NetworkResponse
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(private val repository: ProfileRepository) : ViewModel(){
    //API
    val profileData = MutableLiveData<NetworkRequest<ResponseProfile>>()

    fun callInformationApi(username: String) = viewModelScope.launch {
        profileData.value = NetworkRequest.Loading()
        val response = repository.getUserInfo(username)
        profileData.value = NetworkResponse(response).generalNetworkResponse()

    }

    //datastore
    fun saveToStore(username: String, firstname: String, lastname: String)
            = viewModelScope.launch(Dispatchers.IO) {
        repository.saveProfileData(username , firstname, lastname)
    }

    val readProfileStoredItems = repository.readProfileData
}