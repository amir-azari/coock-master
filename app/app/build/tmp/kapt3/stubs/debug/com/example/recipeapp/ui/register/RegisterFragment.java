package com.example.recipeapp.ui.register;

import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.example.recipeapp.R;
import com.example.recipeapp.databinding.FragmentRegisterBinding;
import com.example.recipeapp.models.register.BodyRegister;
import com.example.recipeapp.utils.Constants;
import com.example.recipeapp.utils.NetworkChecker;
import com.example.recipeapp.utils.NetworkRequest;
import com.example.recipeapp.viewmodel.RegisterViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\b\u0010#\u001a\u00020$H\u0002J$\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'2\b\u0010(\u001a\u0004\u0018\u00010)2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\b\u0010,\u001a\u00020$H\u0016J\u001a\u0010-\u001a\u00020$2\u0006\u0010.\u001a\u00020\"2\b\u0010*\u001a\u0004\u0018\u00010+H\u0016J\u0010\u0010/\u001a\u00020\u001e2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u00100\u001a\u00020\u001e2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002J\u0010\u00103\u001a\u00020\u001e2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001a\u00a8\u00064"}, d2 = {"Lcom/example/recipeapp/ui/register/RegisterFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/recipeapp/databinding/FragmentRegisterBinding;", "binding", "getBinding", "()Lcom/example/recipeapp/databinding/FragmentRegisterBinding;", "body", "Lcom/example/recipeapp/models/register/BodyRegister;", "getBody", "()Lcom/example/recipeapp/models/register/BodyRegister;", "setBody", "(Lcom/example/recipeapp/models/register/BodyRegister;)V", "email", "", "networkChecker", "Lcom/example/recipeapp/utils/NetworkChecker;", "getNetworkChecker", "()Lcom/example/recipeapp/utils/NetworkChecker;", "setNetworkChecker", "(Lcom/example/recipeapp/utils/NetworkChecker;)V", "username", "viewModel", "Lcom/example/recipeapp/viewmodel/RegisterViewModel;", "getViewModel", "()Lcom/example/recipeapp/viewmodel/RegisterViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "handleEditorAction", "", "actionId", "", "nextField", "Landroid/view/View;", "loadRegisterData", "", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "validateEmail", "validateFields", "firstName", "lastName", "validateUsername", "app_debug"})
public final class RegisterFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.example.recipeapp.databinding.FragmentRegisterBinding _binding;
    @javax.inject.Inject
    public com.example.recipeapp.models.register.BodyRegister body;
    @javax.inject.Inject
    public com.example.recipeapp.utils.NetworkChecker networkChecker;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String email = "";
    @org.jetbrains.annotations.NotNull
    private java.lang.String username = "";
    
    public RegisterFragment() {
        super();
    }
    
    private final com.example.recipeapp.databinding.FragmentRegisterBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.models.register.BodyRegister getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.models.register.BodyRegister p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.utils.NetworkChecker getNetworkChecker() {
        return null;
    }
    
    public final void setNetworkChecker(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.utils.NetworkChecker p0) {
    }
    
    private final com.example.recipeapp.viewmodel.RegisterViewModel getViewModel() {
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
    
    private final boolean validateEmail(java.lang.String email) {
        return false;
    }
    
    private final boolean validateFields(java.lang.String firstName, java.lang.String lastName, java.lang.String username) {
        return false;
    }
    
    private final boolean validateUsername(java.lang.String username) {
        return false;
    }
    
    private final void loadRegisterData() {
    }
    
    private final boolean handleEditorAction(int actionId, android.view.View nextField) {
        return false;
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}