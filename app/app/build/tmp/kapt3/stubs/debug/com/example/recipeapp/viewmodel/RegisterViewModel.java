package com.example.recipeapp.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.example.recipeapp.data.repository.RegisterRepository;
import com.example.recipeapp.models.register.BodyRegister;
import com.example.recipeapp.models.register.ResponseRegister;
import com.example.recipeapp.utils.NetworkRequest;
import com.example.recipeapp.utils.NetworkResponse;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.scopes.ActivityScoped;
import kotlinx.coroutines.Dispatchers;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015J\u0016\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/recipeapp/viewmodel/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/recipeapp/data/repository/RegisterRepository;", "(Lcom/example/recipeapp/data/repository/RegisterRepository;)V", "readData", "Lkotlinx/coroutines/flow/Flow;", "Lcom/example/recipeapp/models/register/RegisterStoredModel;", "getReadData", "()Lkotlinx/coroutines/flow/Flow;", "registerData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/recipeapp/utils/NetworkRequest;", "Lcom/example/recipeapp/models/register/ResponseRegister;", "getRegisterData", "()Landroidx/lifecycle/MutableLiveData;", "callRegisterApi", "Lkotlinx/coroutines/Job;", "apiKey", "", "body", "Lcom/example/recipeapp/models/register/BodyRegister;", "saveData", "username", "hash", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.recipeapp.data.repository.RegisterRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.recipeapp.utils.NetworkRequest<com.example.recipeapp.models.register.ResponseRegister>> registerData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<com.example.recipeapp.models.register.RegisterStoredModel> readData = null;
    
    @javax.inject.Inject
    public RegisterViewModel(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.data.repository.RegisterRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.example.recipeapp.utils.NetworkRequest<com.example.recipeapp.models.register.ResponseRegister>> getRegisterData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job callRegisterApi(@org.jetbrains.annotations.NotNull
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull
    com.example.recipeapp.models.register.BodyRegister body) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job saveData(@org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String hash) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.example.recipeapp.models.register.RegisterStoredModel> getReadData() {
        return null;
    }
}