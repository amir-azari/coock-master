package com.example.recipeapp.utils;

import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.example.recipeapp.R;
import com.google.android.material.snackbar.Snackbar;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001a\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002\u001a\n\u0010\u0006\u001a\u00020\u0007*\u00020\b\u001a,\u0010\t\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u000b2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\n0\u000f\u001a\u0012\u0010\u0010\u001a\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\b\u001a\u001e\u0010\u0013\u001a\u00020\u0001*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\n\u0010\u0017\u001a\u0006\u0012\u0002\b\u00030\u0018\u001a\u0012\u0010\u0019\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0007\u00a8\u0006\u001b"}, d2 = {"isVisible", "", "Landroid/view/View;", "isShownLoading", "", "container", "minToHour", "", "", "onceObserve", "T", "Landroidx/lifecycle/LiveData;", "owner", "Landroidx/lifecycle/LifecycleOwner;", "observe", "Landroidx/lifecycle/Observer;", "setDynamicallyColor", "Landroid/widget/TextView;", "color", "setupRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "myLayoutManager", "Landroidx/recyclerview/widget/RecyclerView$LayoutManager;", "myAdapter", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "showSnackBar", "message", "app_debug"})
public final class ExtentionsKt {
    
    public static final void showSnackBar(@org.jetbrains.annotations.NotNull
    android.view.View $this$showSnackBar, @org.jetbrains.annotations.NotNull
    java.lang.String message) {
    }
    
    public static final void setupRecyclerView(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView $this$setupRecyclerView, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.LayoutManager myLayoutManager, @org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.Adapter<?> myAdapter) {
    }
    
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String minToHour(int $this$minToHour) {
        return null;
    }
    
    public static final void setDynamicallyColor(@org.jetbrains.annotations.NotNull
    android.widget.TextView $this$setDynamicallyColor, int color) {
    }
    
    public static final <T extends java.lang.Object>void onceObserve(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.LiveData<T> $this$onceObserve, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.LifecycleOwner owner, @org.jetbrains.annotations.NotNull
    androidx.lifecycle.Observer<T> observe) {
    }
    
    public static final void isVisible(@org.jetbrains.annotations.NotNull
    android.view.View $this$isVisible, boolean isShownLoading, @org.jetbrains.annotations.NotNull
    android.view.View container) {
    }
}