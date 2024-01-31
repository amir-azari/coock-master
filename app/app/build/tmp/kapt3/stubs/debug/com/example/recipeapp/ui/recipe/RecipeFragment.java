package com.example.recipeapp.ui.recipe;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSnapHelper;
import com.example.recipeapp.adapter.PopularAdapter;
import com.example.recipeapp.R;
import com.example.recipeapp.adapter.RecentAdapter;
import com.example.recipeapp.databinding.FragmentRecipeBinding;
import com.example.recipeapp.models.recipe.ResponseRecipes;
import com.example.recipeapp.models.recipe.ResponseRecipes.Result;
import com.example.recipeapp.utils.Constants;
import com.example.recipeapp.utils.NetworkRequest;
import com.example.recipeapp.viewmodel.RecipeViewModel;
import com.example.recipeapp.viewmodel.RegisterViewModel;
import com.todkars.shimmer.ShimmerRecyclerView;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\'\u001a\u00020(2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*H\u0002J\b\u0010,\u001a\u00020(H\u0002J\b\u0010-\u001a\u00020(H\u0002J\u0016\u0010.\u001a\u00020(2\f\u0010/\u001a\b\u0012\u0004\u0012\u00020+00H\u0002J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020(H\u0002J\b\u00104\u001a\u00020(H\u0002J\b\u00105\u001a\u00020(H\u0002J\b\u00106\u001a\u00020(H\u0002J$\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:2\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\b\u0010?\u001a\u00020(H\u0016J\u001a\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u0002082\b\u0010=\u001a\u0004\u0018\u00010>H\u0016J\u0018\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020FH\u0002J\u0011\u0010G\u001a\u00020(H\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010HR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010%\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006I"}, d2 = {"Lcom/example/recipeapp/ui/recipe/RecipeFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/recipeapp/databinding/FragmentRecipeBinding;", "args", "Lcom/example/recipeapp/ui/recipe/RecipeFragmentArgs;", "getArgs", "()Lcom/example/recipeapp/ui/recipe/RecipeFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "atuScrollIndex", "", "binding", "getBinding", "()Lcom/example/recipeapp/databinding/FragmentRecipeBinding;", "popularAdapter", "Lcom/example/recipeapp/adapter/PopularAdapter;", "getPopularAdapter", "()Lcom/example/recipeapp/adapter/PopularAdapter;", "setPopularAdapter", "(Lcom/example/recipeapp/adapter/PopularAdapter;)V", "recentAdapter", "Lcom/example/recipeapp/adapter/RecentAdapter;", "getRecentAdapter", "()Lcom/example/recipeapp/adapter/RecentAdapter;", "setRecentAdapter", "(Lcom/example/recipeapp/adapter/RecentAdapter;)V", "recipeViewModel", "Lcom/example/recipeapp/viewmodel/RecipeViewModel;", "getRecipeViewModel", "()Lcom/example/recipeapp/viewmodel/RecipeViewModel;", "recipeViewModel$delegate", "Lkotlin/Lazy;", "registerViewModel", "Lcom/example/recipeapp/viewmodel/RegisterViewModel;", "getRegisterViewModel", "()Lcom/example/recipeapp/viewmodel/RegisterViewModel;", "registerViewModel$delegate", "autoScrollPopular", "", "list", "", "Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result;", "callPopularData", "callRecentData", "fillPopularAdapter", "result", "", "gttEmojiByUnicode", "", "initPopularRecycler", "initRecentRecycler", "loadPopularData", "loadRecentData", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onViewCreated", "view", "setupLoading", "isShownLoading", "", "shimmer", "Lcom/todkars/shimmer/ShimmerRecyclerView;", "showUsername", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RecipeFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.example.recipeapp.databinding.FragmentRecipeBinding _binding;
    @javax.inject.Inject
    public com.example.recipeapp.adapter.PopularAdapter popularAdapter;
    @javax.inject.Inject
    public com.example.recipeapp.adapter.RecentAdapter recentAdapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy recipeViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy registerViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private int atuScrollIndex = 0;
    
    public RecipeFragment() {
        super();
    }
    
    private final com.example.recipeapp.databinding.FragmentRecipeBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.adapter.PopularAdapter getPopularAdapter() {
        return null;
    }
    
    public final void setPopularAdapter(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.adapter.PopularAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.adapter.RecentAdapter getRecentAdapter() {
        return null;
    }
    
    public final void setRecentAdapter(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.adapter.RecentAdapter p0) {
    }
    
    private final com.example.recipeapp.viewmodel.RecipeViewModel getRecipeViewModel() {
        return null;
    }
    
    private final com.example.recipeapp.viewmodel.RegisterViewModel getRegisterViewModel() {
        return null;
    }
    
    private final com.example.recipeapp.ui.recipe.RecipeFragmentArgs getArgs() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void callPopularData() {
    }
    
    private final void loadPopularData() {
    }
    
    private final void initPopularRecycler() {
    }
    
    private final void autoScrollPopular(java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result> list) {
    }
    
    private final void callRecentData() {
    }
    
    private final void loadRecentData() {
    }
    
    private final void initRecentRecycler() {
    }
    
    private final void setupLoading(boolean isShownLoading, com.todkars.shimmer.ShimmerRecyclerView shimmer) {
    }
    
    private final void fillPopularAdapter(java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result> result) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object showUsername(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final java.lang.String gttEmojiByUnicode() {
        return null;
    }
    
    @java.lang.Override
    public void onDestroy() {
    }
}