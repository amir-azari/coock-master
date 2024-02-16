package com.example.recipeapp.data.repository

import com.example.recipeapp.data.source.RemoteDataSource
import com.example.recipeapp.models.profile.BodyEditeInfo
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class EditeInformationRepository @Inject constructor(
    private val remote: RemoteDataSource
) {
    //Api
    suspend fun editeUserInfo(username: String , body : BodyEditeInfo) = remote.editeUserInfo(username , body)

}