package com.example.recipeapp.data.repository

import com.example.recipeapp.data.source.RemoteDataSource
import com.example.recipeapp.models.profile.BodyEditeInfo
import com.example.recipeapp.models.profile.BodyPassword
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class ChangePasswordRepository @Inject constructor(
    private val remote: RemoteDataSource
) {
    suspend fun changePassword(username: String , body : BodyPassword) = remote.changePassword(username , body)

}