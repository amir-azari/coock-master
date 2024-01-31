package com.example.recipeapp.data.repository;

import com.example.recipeapp.data.source.LocalDataSource;
import com.example.recipeapp.data.source.RemoteDataSource;
import com.example.recipeapp.models.register.BodyRegister;
import dagger.hilt.android.scopes.ActivityRetainedScoped;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\n\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lcom/example/recipeapp/data/repository/RecipeRepository;", "", "remoteDataSource", "Lcom/example/recipeapp/data/source/RemoteDataSource;", "localDataSource", "Lcom/example/recipeapp/data/source/LocalDataSource;", "(Lcom/example/recipeapp/data/source/RemoteDataSource;Lcom/example/recipeapp/data/source/LocalDataSource;)V", "local", "getLocal", "()Lcom/example/recipeapp/data/source/LocalDataSource;", "remote", "getRemote", "()Lcom/example/recipeapp/data/source/RemoteDataSource;", "app_debug"})
@dagger.hilt.android.scopes.ActivityRetainedScoped
public final class RecipeRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.recipeapp.data.source.RemoteDataSource remote = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.recipeapp.data.source.LocalDataSource local = null;
    
    @javax.inject.Inject
    public RecipeRepository(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.data.source.RemoteDataSource remoteDataSource, @org.jetbrains.annotations.NotNull
    com.example.recipeapp.data.source.LocalDataSource localDataSource) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.data.source.RemoteDataSource getRemote() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.data.source.LocalDataSource getLocal() {
        return null;
    }
}