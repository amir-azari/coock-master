package com.example.recipeapp.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.recipeapp.data.database.RecipeEntity;
import com.example.recipeapp.data.repository.MenuRepository;
import com.example.recipeapp.data.repository.RecipeRepository;
import com.example.recipeapp.models.recipe.ResponseRecipes;
import com.example.recipeapp.utils.Constants;
import com.example.recipeapp.utils.NetworkRequest;
import com.example.recipeapp.utils.NetworkResponse;
import dagger.hilt.android.lifecycle.HiltViewModel;
import kotlinx.coroutines.Dispatchers;
import retrofit2.Response;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001a\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001dJ\u001a\u0010\u001e\u001a\u00020\u001b2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u001dJ\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\rH\u0002J\u0010\u0010\"\u001a\u00020 2\u0006\u0010!\u001a\u00020\rH\u0002J\"\u0010#\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0$j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`%J\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\'H\u0002J\"\u0010(\u001a\u001e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0$j\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b`%J\u0010\u0010)\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0013H\u0002J\u0010\u0010+\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u0013H\u0002R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u001d\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/example/recipeapp/viewmodel/RecipeViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/recipeapp/data/repository/RecipeRepository;", "menuRepository", "Lcom/example/recipeapp/data/repository/MenuRepository;", "(Lcom/example/recipeapp/data/repository/RecipeRepository;Lcom/example/recipeapp/data/repository/MenuRepository;)V", "dietType", "", "mealType", "popularData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/recipeapp/utils/NetworkRequest;", "Lcom/example/recipeapp/models/recipe/ResponseRecipes;", "getPopularData", "()Landroidx/lifecycle/MutableLiveData;", "readPopularFromDb", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/recipeapp/data/database/RecipeEntity;", "getReadPopularFromDb", "()Landroidx/lifecycle/LiveData;", "readRecentFromDb", "getReadRecentFromDb", "recentData", "getRecentData", "callPopularApi", "Lkotlinx/coroutines/Job;", "queries", "", "callRecentApi", "offlinePopular", "", "response", "offlineRecent", "popularQueries", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "recentNetworkResponse", "Lretrofit2/Response;", "recentQueries", "savePopular", "entity", "saveRecent", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class RecipeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.recipeapp.data.repository.RecipeRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.recipeapp.data.repository.MenuRepository menuRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.recipeapp.utils.NetworkRequest<com.example.recipeapp.models.recipe.ResponseRecipes>> popularData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.recipeapp.data.database.RecipeEntity>> readPopularFromDb = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String mealType = "main course";
    @org.jetbrains.annotations.NotNull
    private java.lang.String dietType = "Gluten Free";
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.recipeapp.utils.NetworkRequest<com.example.recipeapp.models.recipe.ResponseRecipes>> recentData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.recipeapp.data.database.RecipeEntity>> readRecentFromDb = null;
    
    @javax.inject.Inject
    public RecipeViewModel(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.data.repository.RecipeRepository repository, @org.jetbrains.annotations.NotNull
    com.example.recipeapp.data.repository.MenuRepository menuRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.HashMap<java.lang.String, java.lang.String> popularQueries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.recipeapp.utils.NetworkRequest<com.example.recipeapp.models.recipe.ResponseRecipes>> getPopularData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job callPopularApi(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> queries) {
        return null;
    }
    
    private final kotlinx.coroutines.Job savePopular(com.example.recipeapp.data.database.RecipeEntity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.recipeapp.data.database.RecipeEntity>> getReadPopularFromDb() {
        return null;
    }
    
    private final void offlinePopular(com.example.recipeapp.models.recipe.ResponseRecipes response) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.HashMap<java.lang.String, java.lang.String> recentQueries() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.recipeapp.utils.NetworkRequest<com.example.recipeapp.models.recipe.ResponseRecipes>> getRecentData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job callRecentApi(@org.jetbrains.annotations.NotNull
    java.util.Map<java.lang.String, java.lang.String> queries) {
        return null;
    }
    
    private final kotlinx.coroutines.Job saveRecent(com.example.recipeapp.data.database.RecipeEntity entity) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.recipeapp.data.database.RecipeEntity>> getReadRecentFromDb() {
        return null;
    }
    
    private final void offlineRecent(com.example.recipeapp.models.recipe.ResponseRecipes response) {
    }
    
    private final com.example.recipeapp.utils.NetworkRequest<com.example.recipeapp.models.recipe.ResponseRecipes> recentNetworkResponse(retrofit2.Response<com.example.recipeapp.models.recipe.ResponseRecipes> response) {
        return null;
    }
}