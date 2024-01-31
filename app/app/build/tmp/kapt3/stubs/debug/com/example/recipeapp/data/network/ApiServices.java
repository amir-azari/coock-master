package com.example.recipeapp.data.network;

import com.example.recipeapp.models.detail.ResponseDetail;
import com.example.recipeapp.models.recipe.ResponseRecipes;
import com.example.recipeapp.models.register.BodyRegister;
import com.example.recipeapp.models.register.ResponseRegister;
import com.example.recipeapp.utils.Constants;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ-\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00032\u0014\b\u0001\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\rH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00032\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/recipeapp/data/network/ApiServices;", "", "getDetail", "Lretrofit2/Response;", "Lcom/example/recipeapp/models/detail/ResponseDetail;", "id", "", "apiKey", "", "(ILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRecipes", "Lcom/example/recipeapp/models/recipe/ResponseRecipes;", "queries", "", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postRegister", "Lcom/example/recipeapp/models/register/ResponseRegister;", "body", "Lcom/example/recipeapp/models/register/BodyRegister;", "(Ljava/lang/String;Lcom/example/recipeapp/models/register/BodyRegister;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface ApiServices {
    
    @retrofit2.http.POST(value = "users/connect")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object postRegister(@retrofit2.http.Query(value = "apiKey")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.recipeapp.models.register.BodyRegister body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.recipeapp.models.register.ResponseRegister>> $completion);
    
    @retrofit2.http.GET(value = "recipes/complexSearch")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRecipes(@retrofit2.http.QueryMap
    @org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> queries, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.recipeapp.models.recipe.ResponseRecipes>> $completion);
    
    @retrofit2.http.GET(value = "/recipes/{id}/information")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDetail(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Query(value = "apiKey")
    @org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.recipeapp.models.detail.ResponseDetail>> $completion);
}