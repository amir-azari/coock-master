package com.example.recipeapp.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/recipeapp/utils/NetworkChecker;", "Landroid/net/ConnectivityManager$NetworkCallback;", "connectivityManager", "Landroid/net/ConnectivityManager;", "request", "Landroid/net/NetworkRequest;", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;)V", "capabilities", "Landroid/net/NetworkCapabilities;", "isNetworkAvailable", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "checkNetworkAvailability", "onAvailable", "", "network", "Landroid/net/Network;", "onLost", "app_debug"})
public final class NetworkChecker extends android.net.ConnectivityManager.NetworkCallback {
    @org.jetbrains.annotations.NotNull
    private final android.net.ConnectivityManager connectivityManager = null;
    @org.jetbrains.annotations.NotNull
    private final android.net.NetworkRequest request = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> isNetworkAvailable = null;
    @org.jetbrains.annotations.Nullable
    private android.net.NetworkCapabilities capabilities;
    
    @javax.inject.Inject
    public NetworkChecker(@org.jetbrains.annotations.NotNull
    android.net.ConnectivityManager connectivityManager, @org.jetbrains.annotations.NotNull
    android.net.NetworkRequest request) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> checkNetworkAvailability() {
        return null;
    }
    
    @java.lang.Override
    public void onAvailable(@org.jetbrains.annotations.NotNull
    android.net.Network network) {
    }
    
    @java.lang.Override
    public void onLost(@org.jetbrains.annotations.NotNull
    android.net.Network network) {
    }
}