package com.example.recipeapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.recipeapp.data.repository.RecipeRepository;
import com.example.recipeapp.models.detail.ResponseDetail;
import com.example.recipeapp.utils.NetworkRequest;
import com.example.recipeapp.utils.NetworkResponse;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/example/recipeapp/viewmodel/DetailViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/recipeapp/data/repository/RecipeRepository;", "(Lcom/example/recipeapp/data/repository/RecipeRepository;)V", "detailData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/recipeapp/utils/NetworkRequest;", "Lcom/example/recipeapp/models/detail/ResponseDetail;", "getDetailData", "()Landroidx/lifecycle/MutableLiveData;", "callDetailApi", "Lkotlinx/coroutines/Job;", "id", "", "apiKey", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DetailViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.recipeapp.data.repository.RecipeRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.recipeapp.utils.NetworkRequest<com.example.recipeapp.models.detail.ResponseDetail>> detailData = null;
    
    @javax.inject.Inject
    public DetailViewModel(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.data.repository.RecipeRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.recipeapp.utils.NetworkRequest<com.example.recipeapp.models.detail.ResponseDetail>> getDetailData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job callDetailApi(int id, @org.jetbrains.annotations.NotNull
    java.lang.String apiKey) {
        return null;
    }
}