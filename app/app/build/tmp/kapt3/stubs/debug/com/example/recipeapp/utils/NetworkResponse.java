package com.example.recipeapp.utils;

import retrofit2.Response;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u00a2\u0006\u0002\u0010\u0005J\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/recipeapp/utils/NetworkResponse;", "T", "", "response", "Lretrofit2/Response;", "(Lretrofit2/Response;)V", "generalNetworkResponse", "Lcom/example/recipeapp/utils/NetworkRequest;", "app_debug"})
public class NetworkResponse<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull
    private final retrofit2.Response<T> response = null;
    
    public NetworkResponse(@org.jetbrains.annotations.NotNull
    retrofit2.Response<T> response) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.utils.NetworkRequest<T> generalNetworkResponse() {
        return null;
    }
}