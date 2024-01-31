package com.example.recipeapp.ui.detail;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.core.text.HtmlCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import coil.request.CachePolicy;
import com.example.recipeapp.R;
import com.example.recipeapp.adapter.InstructionsAdapter;
import com.example.recipeapp.adapter.StepsAdapter;
import com.example.recipeapp.databinding.FragmentDetailBinding;
import com.example.recipeapp.models.detail.ResponseDetail;
import com.example.recipeapp.utils.Constants;
import com.example.recipeapp.utils.NetworkRequest;
import com.example.recipeapp.viewmodel.DetailViewModel;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;
import com.google.android.material.chip.ChipGroup;
import dagger.hilt.android.AndroidEntryPoint;
import javax.inject.Inject;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\"\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002J\u0016\u0010\'\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020(0%H\u0002J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020+H\u0003J\b\u0010,\u001a\u00020#H\u0002J$\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u0001022\b\u00103\u001a\u0004\u0018\u000104H\u0016J\b\u00105\u001a\u00020#H\u0016J\u001a\u00106\u001a\u00020#2\u0006\u00107\u001a\u00020.2\b\u00103\u001a\u0004\u0018\u000104H\u0017J\u001e\u00108\u001a\u00020#2\f\u0010$\u001a\b\u0012\u0004\u0012\u0002090%2\u0006\u00107\u001a\u00020:H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006;"}, d2 = {"Lcom/example/recipeapp/ui/detail/DetailFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/recipeapp/databinding/FragmentDetailBinding;", "args", "Lcom/example/recipeapp/ui/detail/DetailFragmentArgs;", "getArgs", "()Lcom/example/recipeapp/ui/detail/DetailFragmentArgs;", "args$delegate", "Landroidx/navigation/NavArgsLazy;", "binding", "getBinding", "()Lcom/example/recipeapp/databinding/FragmentDetailBinding;", "instructionsAdapter", "Lcom/example/recipeapp/adapter/InstructionsAdapter;", "getInstructionsAdapter", "()Lcom/example/recipeapp/adapter/InstructionsAdapter;", "setInstructionsAdapter", "(Lcom/example/recipeapp/adapter/InstructionsAdapter;)V", "recipeId", "", "stepsAdapter", "Lcom/example/recipeapp/adapter/StepsAdapter;", "getStepsAdapter", "()Lcom/example/recipeapp/adapter/StepsAdapter;", "setStepsAdapter", "(Lcom/example/recipeapp/adapter/StepsAdapter;)V", "viewModel", "Lcom/example/recipeapp/viewmodel/DetailViewModel;", "getViewModel", "()Lcom/example/recipeapp/viewmodel/DetailViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "initInstructionsList", "", "list", "", "Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient;", "initStepsList", "Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step;", "initViewsWithData", "data", "Lcom/example/recipeapp/models/detail/ResponseDetail;", "loadDetailDataFromApi", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "setupChip", "", "Lcom/google/android/material/chip/ChipGroup;", "app_debug"})
public final class DetailFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.example.recipeapp.databinding.FragmentDetailBinding _binding;
    @javax.inject.Inject
    public com.example.recipeapp.adapter.InstructionsAdapter instructionsAdapter;
    @javax.inject.Inject
    public com.example.recipeapp.adapter.StepsAdapter stepsAdapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy viewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.navigation.NavArgsLazy args$delegate = null;
    private int recipeId = 0;
    
    public DetailFragment() {
        super();
    }
    
    private final com.example.recipeapp.databinding.FragmentDetailBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.adapter.InstructionsAdapter getInstructionsAdapter() {
        return null;
    }
    
    public final void setInstructionsAdapter(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.adapter.InstructionsAdapter p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.adapter.StepsAdapter getStepsAdapter() {
        return null;
    }
    
    public final void setStepsAdapter(@org.jetbrains.annotations.NotNull
    com.example.recipeapp.adapter.StepsAdapter p0) {
    }
    
    private final com.example.recipeapp.viewmodel.DetailViewModel getViewModel() {
        return null;
    }
    
    private final com.example.recipeapp.ui.detail.DetailFragmentArgs getArgs() {
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
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void loadDetailDataFromApi() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void initViewsWithData(com.example.recipeapp.models.detail.ResponseDetail data) {
    }
    
    private final void setupChip(java.util.List<java.lang.String> list, com.google.android.material.chip.ChipGroup view) {
    }
    
    private final void initInstructionsList(java.util.List<com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient> list) {
    }
    
    private final void initStepsList(java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step> list) {
    }
}