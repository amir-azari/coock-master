package com.example.recipeapp.data.source;

import com.example.recipeapp.data.database.RecipeAppDao;
import com.example.recipeapp.data.database.RecipeEntity;
import kotlinx.coroutines.flow.Flow;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0019\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/recipeapp/data/source/LocalDataSource;", "", "dao", "Lcom/example/recipeapp/data/database/RecipeAppDao;", "(Lcom/example/recipeapp/data/database/RecipeAppDao;)V", "loadRecipes", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/recipeapp/data/database/RecipeEntity;", "saveRecipes", "", "entity", "(Lcom/example/recipeapp/data/database/RecipeEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class LocalDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.example.recipeapp.data.database.RecipeAppDao dao = null;
    
    @javax.inject.Inject
    public LocalDataSource(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.data.database.RecipeAppDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object saveRecipes(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.data.database.RecipeEntity entity, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.recipeapp.data.database.RecipeEntity>> loadRecipes() {
        return null;
    }
}