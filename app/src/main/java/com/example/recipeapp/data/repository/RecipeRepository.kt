package com.example.recipeapp.data.repository

import com.example.recipeapp.data.source.LocalDataSource
import com.example.recipeapp.data.source.RemoteDataSource
import com.example.recipeapp.models.register.BodyRegister
import dagger.hilt.android.scopes.ActivityRetainedScoped
import javax.inject.Inject

@ActivityRetainedScoped
class RecipeRepository @Inject constructor(remoteDataSource :RemoteDataSource , localDataSource: LocalDataSource){
    val remote = remoteDataSource
    val local = localDataSource
}