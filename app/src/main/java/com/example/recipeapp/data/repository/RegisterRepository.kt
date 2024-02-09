package com.example.recipeapp.data.repository

import android.content.Context
import com.example.recipeapp.data.source.RemoteDataSource
import com.example.recipeapp.models.register.BodyRegister
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityRetainedScoped

import javax.inject.Inject

@ActivityRetainedScoped
class RegisterRepository @Inject constructor(
    @ApplicationContext private val context: Context,
    private val remote: RemoteDataSource,
) {
    //Api
    suspend fun postRegister(body: BodyRegister) = remote.postRegister(body)

}