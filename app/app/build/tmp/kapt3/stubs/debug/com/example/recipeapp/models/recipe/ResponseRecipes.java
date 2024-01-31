package com.example.recipeapp.models.recipe;

import com.google.gson.annotations.SerializedName;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001dB3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJD\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001a\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000bR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lcom/example/recipeapp/models/recipe/ResponseRecipes;", "", "number", "", "offset", "results", "", "Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result;", "totalResults", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)V", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffset", "getResults", "()Ljava/util/List;", "getTotalResults", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Integer;)Lcom/example/recipeapp/models/recipe/ResponseRecipes;", "equals", "", "other", "hashCode", "toString", "", "Result", "app_debug"})
public final class ResponseRecipes {
    @com.google.gson.annotations.SerializedName(value = "number")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer number = null;
    @com.google.gson.annotations.SerializedName(value = "offset")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer offset = null;
    @com.google.gson.annotations.SerializedName(value = "results")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result> results = null;
    @com.google.gson.annotations.SerializedName(value = "totalResults")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer totalResults = null;
    
    public ResponseRecipes(@org.jetbrains.annotations.Nullable
    java.lang.Integer number, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result> results, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalResults) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getOffset() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result> getResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getTotalResults() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.models.recipe.ResponseRecipes copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer number, @org.jetbrains.annotations.Nullable
    java.lang.Integer offset, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result> results, @org.jetbrains.annotations.Nullable
    java.lang.Integer totalResults) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0006\n\u0002\b`\b\u0086\b\u0018\u00002\u00020\u0001:\u0001zB\u00f7\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0010\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0005\u0012\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\u0010\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0005\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b\u0012\b\u0010#\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010$\u001a\u0004\u0018\u00010\b\u0012\b\u0010%\u001a\u0004\u0018\u00010\b\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010\'\u001a\u0004\u0018\u00010\b\u0012\b\u0010(\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010)J\u0010\u0010S\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010T\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010U\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010V\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u0010\u0010W\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010X\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010[\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0013\u0010\\\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u0013\u0010^\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010_\u001a\u0004\u0018\u00010\u001bH\u00c6\u0003\u00a2\u0006\u0002\u0010DJ\u0010\u0010`\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u0010\u0010a\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010b\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010c\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u000b\u0010g\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010i\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010j\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010k\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010l\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0010\u0010m\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u0010\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010o\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0013\u0010p\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010q\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00100J\u0013\u0010r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0005H\u00c6\u0003J\u0013\u0010s\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0005H\u00c6\u0003J\u00c2\u0003\u0010t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u0012\b\u0002\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00052\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\u0012\b\u0002\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00052\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u0010uJ\u0013\u0010v\u001a\u00020\b2\b\u0010w\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010x\u001a\u00020\u0003H\u00d6\u0001J\t\u0010y\u001a\u00020\u000bH\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b2\u0010+R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R \u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010.R\u001a\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b6\u00100R \u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010.R \u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010.R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u00104R\u001a\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b:\u00100R\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b;\u0010+R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b<\u0010+R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00104R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00104R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b@\u00100R \u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010.R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\bB\u0010+R\u001a\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\bF\u0010+R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\bG\u0010+R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u00104R\u0018\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u00104R\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u00104R\u001a\u0010\"\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\bL\u00100R\u0018\u0010#\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u00104R\u001a\u0010$\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\bN\u00100R\u001a\u0010%\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\bO\u00100R\u001a\u0010&\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\bP\u00100R\u001a\u0010\'\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\bQ\u00100R\u001a\u0010(\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\bR\u0010+\u00a8\u0006{"}, d2 = {"Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result;", "", "aggregateLikes", "", "analyzedInstructions", "", "Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction;", "cheap", "", "cookingMinutes", "creditsText", "", "cuisines", "dairyFree", "diets", "dishTypes", "gaps", "glutenFree", "healthScore", "id", "image", "imageType", "license", "lowFodmap", "occasions", "preparationMinutes", "pricePerServing", "", "readyInMinutes", "servings", "sourceName", "sourceUrl", "spoonacularSourceUrl", "summary", "sustainable", "title", "vegan", "vegetarian", "veryHealthy", "veryPopular", "weightWatcherSmartPoints", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)V", "getAggregateLikes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnalyzedInstructions", "()Ljava/util/List;", "getCheap", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCookingMinutes", "getCreditsText", "()Ljava/lang/String;", "getCuisines", "getDairyFree", "getDiets", "getDishTypes", "getGaps", "getGlutenFree", "getHealthScore", "getId", "getImage", "getImageType", "getLicense", "getLowFodmap", "getOccasions", "getPreparationMinutes", "getPricePerServing", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getReadyInMinutes", "getServings", "getSourceName", "getSourceUrl", "getSpoonacularSourceUrl", "getSummary", "getSustainable", "getTitle", "getVegan", "getVegetarian", "getVeryHealthy", "getVeryPopular", "getWeightWatcherSmartPoints", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;)Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result;", "equals", "other", "hashCode", "toString", "AnalyzedInstruction", "app_debug"})
    public static final class Result {
        @com.google.gson.annotations.SerializedName(value = "aggregateLikes")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer aggregateLikes = null;
        @com.google.gson.annotations.SerializedName(value = "analyzedInstructions")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction> analyzedInstructions = null;
        @com.google.gson.annotations.SerializedName(value = "cheap")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean cheap = null;
        @com.google.gson.annotations.SerializedName(value = "cookingMinutes")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer cookingMinutes = null;
        @com.google.gson.annotations.SerializedName(value = "creditsText")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String creditsText = null;
        @com.google.gson.annotations.SerializedName(value = "cuisines")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> cuisines = null;
        @com.google.gson.annotations.SerializedName(value = "dairyFree")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean dairyFree = null;
        @com.google.gson.annotations.SerializedName(value = "diets")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> diets = null;
        @com.google.gson.annotations.SerializedName(value = "dishTypes")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> dishTypes = null;
        @com.google.gson.annotations.SerializedName(value = "gaps")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String gaps = null;
        @com.google.gson.annotations.SerializedName(value = "glutenFree")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean glutenFree = null;
        @com.google.gson.annotations.SerializedName(value = "healthScore")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer healthScore = null;
        @com.google.gson.annotations.SerializedName(value = "id")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer id = null;
        @com.google.gson.annotations.SerializedName(value = "image")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String image = null;
        @com.google.gson.annotations.SerializedName(value = "imageType")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String imageType = null;
        @com.google.gson.annotations.SerializedName(value = "license")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String license = null;
        @com.google.gson.annotations.SerializedName(value = "lowFodmap")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean lowFodmap = null;
        @com.google.gson.annotations.SerializedName(value = "occasions")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> occasions = null;
        @com.google.gson.annotations.SerializedName(value = "preparationMinutes")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer preparationMinutes = null;
        @com.google.gson.annotations.SerializedName(value = "pricePerServing")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Double pricePerServing = null;
        @com.google.gson.annotations.SerializedName(value = "readyInMinutes")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer readyInMinutes = null;
        @com.google.gson.annotations.SerializedName(value = "servings")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer servings = null;
        @com.google.gson.annotations.SerializedName(value = "sourceName")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String sourceName = null;
        @com.google.gson.annotations.SerializedName(value = "sourceUrl")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String sourceUrl = null;
        @com.google.gson.annotations.SerializedName(value = "spoonacularSourceUrl")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String spoonacularSourceUrl = null;
        @com.google.gson.annotations.SerializedName(value = "summary")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String summary = null;
        @com.google.gson.annotations.SerializedName(value = "sustainable")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean sustainable = null;
        @com.google.gson.annotations.SerializedName(value = "title")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String title = null;
        @com.google.gson.annotations.SerializedName(value = "vegan")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean vegan = null;
        @com.google.gson.annotations.SerializedName(value = "vegetarian")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean vegetarian = null;
        @com.google.gson.annotations.SerializedName(value = "veryHealthy")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean veryHealthy = null;
        @com.google.gson.annotations.SerializedName(value = "veryPopular")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Boolean veryPopular = null;
        @com.google.gson.annotations.SerializedName(value = "weightWatcherSmartPoints")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer weightWatcherSmartPoints = null;
        
        public Result(@org.jetbrains.annotations.Nullable
        java.lang.Integer aggregateLikes, @org.jetbrains.annotations.Nullable
        java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction> analyzedInstructions, @org.jetbrains.annotations.Nullable
        java.lang.Boolean cheap, @org.jetbrains.annotations.Nullable
        java.lang.Integer cookingMinutes, @org.jetbrains.annotations.Nullable
        java.lang.String creditsText, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> cuisines, @org.jetbrains.annotations.Nullable
        java.lang.Boolean dairyFree, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> diets, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> dishTypes, @org.jetbrains.annotations.Nullable
        java.lang.String gaps, @org.jetbrains.annotations.Nullable
        java.lang.Boolean glutenFree, @org.jetbrains.annotations.Nullable
        java.lang.Integer healthScore, @org.jetbrains.annotations.Nullable
        java.lang.Integer id, @org.jetbrains.annotations.Nullable
        java.lang.String image, @org.jetbrains.annotations.Nullable
        java.lang.String imageType, @org.jetbrains.annotations.Nullable
        java.lang.String license, @org.jetbrains.annotations.Nullable
        java.lang.Boolean lowFodmap, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> occasions, @org.jetbrains.annotations.Nullable
        java.lang.Integer preparationMinutes, @org.jetbrains.annotations.Nullable
        java.lang.Double pricePerServing, @org.jetbrains.annotations.Nullable
        java.lang.Integer readyInMinutes, @org.jetbrains.annotations.Nullable
        java.lang.Integer servings, @org.jetbrains.annotations.Nullable
        java.lang.String sourceName, @org.jetbrains.annotations.Nullable
        java.lang.String sourceUrl, @org.jetbrains.annotations.Nullable
        java.lang.String spoonacularSourceUrl, @org.jetbrains.annotations.Nullable
        java.lang.String summary, @org.jetbrains.annotations.Nullable
        java.lang.Boolean sustainable, @org.jetbrains.annotations.Nullable
        java.lang.String title, @org.jetbrains.annotations.Nullable
        java.lang.Boolean vegan, @org.jetbrains.annotations.Nullable
        java.lang.Boolean vegetarian, @org.jetbrains.annotations.Nullable
        java.lang.Boolean veryHealthy, @org.jetbrains.annotations.Nullable
        java.lang.Boolean veryPopular, @org.jetbrains.annotations.Nullable
        java.lang.Integer weightWatcherSmartPoints) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getAggregateLikes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction> getAnalyzedInstructions() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getCheap() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getCookingMinutes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getCreditsText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getCuisines() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getDairyFree() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getDiets() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getDishTypes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getGaps() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getGlutenFree() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getHealthScore() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getImage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getImageType() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getLicense() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getLowFodmap() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getOccasions() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getPreparationMinutes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Double getPricePerServing() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getReadyInMinutes() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getServings() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSourceName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSourceUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSpoonacularSourceUrl() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getSummary() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getSustainable() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getVegan() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getVegetarian() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getVeryHealthy() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean getVeryPopular() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer getWeightWatcherSmartPoints() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component13() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component15() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component16() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component17() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component18() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component19() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Double component20() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component21() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component22() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component23() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component24() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component25() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component26() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component27() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component28() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component29() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component3() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component30() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component31() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component32() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component33() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Integer component4() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component5() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Boolean component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.recipeapp.models.recipe.ResponseRecipes.Result copy(@org.jetbrains.annotations.Nullable
        java.lang.Integer aggregateLikes, @org.jetbrains.annotations.Nullable
        java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction> analyzedInstructions, @org.jetbrains.annotations.Nullable
        java.lang.Boolean cheap, @org.jetbrains.annotations.Nullable
        java.lang.Integer cookingMinutes, @org.jetbrains.annotations.Nullable
        java.lang.String creditsText, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> cuisines, @org.jetbrains.annotations.Nullable
        java.lang.Boolean dairyFree, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> diets, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> dishTypes, @org.jetbrains.annotations.Nullable
        java.lang.String gaps, @org.jetbrains.annotations.Nullable
        java.lang.Boolean glutenFree, @org.jetbrains.annotations.Nullable
        java.lang.Integer healthScore, @org.jetbrains.annotations.Nullable
        java.lang.Integer id, @org.jetbrains.annotations.Nullable
        java.lang.String image, @org.jetbrains.annotations.Nullable
        java.lang.String imageType, @org.jetbrains.annotations.Nullable
        java.lang.String license, @org.jetbrains.annotations.Nullable
        java.lang.Boolean lowFodmap, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> occasions, @org.jetbrains.annotations.Nullable
        java.lang.Integer preparationMinutes, @org.jetbrains.annotations.Nullable
        java.lang.Double pricePerServing, @org.jetbrains.annotations.Nullable
        java.lang.Integer readyInMinutes, @org.jetbrains.annotations.Nullable
        java.lang.Integer servings, @org.jetbrains.annotations.Nullable
        java.lang.String sourceName, @org.jetbrains.annotations.Nullable
        java.lang.String sourceUrl, @org.jetbrains.annotations.Nullable
        java.lang.String spoonacularSourceUrl, @org.jetbrains.annotations.Nullable
        java.lang.String summary, @org.jetbrains.annotations.Nullable
        java.lang.Boolean sustainable, @org.jetbrains.annotations.Nullable
        java.lang.String title, @org.jetbrains.annotations.Nullable
        java.lang.Boolean vegan, @org.jetbrains.annotations.Nullable
        java.lang.Boolean vegetarian, @org.jetbrains.annotations.Nullable
        java.lang.Boolean veryHealthy, @org.jetbrains.annotations.Nullable
        java.lang.Boolean veryPopular, @org.jetbrains.annotations.Nullable
        java.lang.Integer weightWatcherSmartPoints) {
            return null;
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0015B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0003J)\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction;", "", "name", "", "steps", "", "Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getSteps", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Step", "app_debug"})
        public static final class AnalyzedInstruction {
            @com.google.gson.annotations.SerializedName(value = "name")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String name = null;
            @com.google.gson.annotations.SerializedName(value = "steps")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step> steps = null;
            
            public AnalyzedInstruction(@org.jetbrains.annotations.Nullable
            java.lang.String name, @org.jetbrains.annotations.Nullable
            java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step> steps) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getName() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step> getSteps() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction copy(@org.jetbrains.annotations.Nullable
            java.lang.String name, @org.jetbrains.annotations.Nullable
            java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step> steps) {
                return null;
            }
            
            @java.lang.Override
            public boolean equals(@org.jetbrains.annotations.Nullable
            java.lang.Object other) {
                return false;
            }
            
            @java.lang.Override
            public int hashCode() {
                return 0;
            }
            
            @java.lang.Override
            @org.jetbrains.annotations.NotNull
            public java.lang.String toString() {
                return null;
            }
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003$%&BG\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0013\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u00c6\u0003JZ\u0010\u001d\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\nH\u00d6\u0001J\t\u0010#\u001a\u00020\fH\u00d6\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\'"}, d2 = {"Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step;", "", "equipment", "", "Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Equipment;", "ingredients", "Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Ingredient;", "length", "Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Length;", "number", "", "step", "", "(Ljava/util/List;Ljava/util/List;Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Length;Ljava/lang/Integer;Ljava/lang/String;)V", "getEquipment", "()Ljava/util/List;", "getIngredients", "getLength", "()Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Length;", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStep", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Length;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step;", "equals", "", "other", "hashCode", "toString", "Equipment", "Ingredient", "Length", "app_debug"})
            public static final class Step {
                @com.google.gson.annotations.SerializedName(value = "equipment")
                @org.jetbrains.annotations.Nullable
                private final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Equipment> equipment = null;
                @com.google.gson.annotations.SerializedName(value = "ingredients")
                @org.jetbrains.annotations.Nullable
                private final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Ingredient> ingredients = null;
                @com.google.gson.annotations.SerializedName(value = "length")
                @org.jetbrains.annotations.Nullable
                private final com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Length length = null;
                @com.google.gson.annotations.SerializedName(value = "number")
                @org.jetbrains.annotations.Nullable
                private final java.lang.Integer number = null;
                @com.google.gson.annotations.SerializedName(value = "step")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String step = null;
                
                public Step(@org.jetbrains.annotations.Nullable
                java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Equipment> equipment, @org.jetbrains.annotations.Nullable
                java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Ingredient> ingredients, @org.jetbrains.annotations.Nullable
                com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Length length, @org.jetbrains.annotations.Nullable
                java.lang.Integer number, @org.jetbrains.annotations.Nullable
                java.lang.String step) {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Equipment> getEquipment() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Ingredient> getIngredients() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Length getLength() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.Integer getNumber() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.String getStep() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Equipment> component1() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Ingredient> component2() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Length component3() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.Integer component4() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.String component5() {
                    return null;
                }
                
                @org.jetbrains.annotations.NotNull
                public final com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step copy(@org.jetbrains.annotations.Nullable
                java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Equipment> equipment, @org.jetbrains.annotations.Nullable
                java.util.List<com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Ingredient> ingredients, @org.jetbrains.annotations.Nullable
                com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Length length, @org.jetbrains.annotations.Nullable
                java.lang.Integer number, @org.jetbrains.annotations.Nullable
                java.lang.String step) {
                    return null;
                }
                
                @java.lang.Override
                public boolean equals(@org.jetbrains.annotations.Nullable
                java.lang.Object other) {
                    return false;
                }
                
                @java.lang.Override
                public int hashCode() {
                    return 0;
                }
                
                @java.lang.Override
                @org.jetbrains.annotations.NotNull
                public java.lang.String toString() {
                    return null;
                }
                
                @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Equipment;", "", "id", "", "image", "", "localizedName", "name", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "()Ljava/lang/String;", "getLocalizedName", "getName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Equipment;", "equals", "", "other", "hashCode", "toString", "app_debug"})
                public static final class Equipment {
                    @com.google.gson.annotations.SerializedName(value = "id")
                    @org.jetbrains.annotations.Nullable
                    private final java.lang.Integer id = null;
                    @com.google.gson.annotations.SerializedName(value = "image")
                    @org.jetbrains.annotations.Nullable
                    private final java.lang.String image = null;
                    @com.google.gson.annotations.SerializedName(value = "localizedName")
                    @org.jetbrains.annotations.Nullable
                    private final java.lang.String localizedName = null;
                    @com.google.gson.annotations.SerializedName(value = "name")
                    @org.jetbrains.annotations.Nullable
                    private final java.lang.String name = null;
                    
                    public Equipment(@org.jetbrains.annotations.Nullable
                    java.lang.Integer id, @org.jetbrains.annotations.Nullable
                    java.lang.String image, @org.jetbrains.annotations.Nullable
                    java.lang.String localizedName, @org.jetbrains.annotations.Nullable
                    java.lang.String name) {
                        super();
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Integer getId() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String getImage() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String getLocalizedName() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String getName() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Integer component1() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String component2() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String component3() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String component4() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull
                    public final com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Equipment copy(@org.jetbrains.annotations.Nullable
                    java.lang.Integer id, @org.jetbrains.annotations.Nullable
                    java.lang.String image, @org.jetbrains.annotations.Nullable
                    java.lang.String localizedName, @org.jetbrains.annotations.Nullable
                    java.lang.String name) {
                        return null;
                    }
                    
                    @java.lang.Override
                    public boolean equals(@org.jetbrains.annotations.Nullable
                    java.lang.Object other) {
                        return false;
                    }
                    
                    @java.lang.Override
                    public int hashCode() {
                        return 0;
                    }
                    
                    @java.lang.Override
                    @org.jetbrains.annotations.NotNull
                    public java.lang.String toString() {
                        return null;
                    }
                }
                
                @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Ingredient;", "", "id", "", "image", "", "localizedName", "name", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "()Ljava/lang/String;", "getLocalizedName", "getName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Ingredient;", "equals", "", "other", "hashCode", "toString", "app_debug"})
                public static final class Ingredient {
                    @com.google.gson.annotations.SerializedName(value = "id")
                    @org.jetbrains.annotations.Nullable
                    private final java.lang.Integer id = null;
                    @com.google.gson.annotations.SerializedName(value = "image")
                    @org.jetbrains.annotations.Nullable
                    private final java.lang.String image = null;
                    @com.google.gson.annotations.SerializedName(value = "localizedName")
                    @org.jetbrains.annotations.Nullable
                    private final java.lang.String localizedName = null;
                    @com.google.gson.annotations.SerializedName(value = "name")
                    @org.jetbrains.annotations.Nullable
                    private final java.lang.String name = null;
                    
                    public Ingredient(@org.jetbrains.annotations.Nullable
                    java.lang.Integer id, @org.jetbrains.annotations.Nullable
                    java.lang.String image, @org.jetbrains.annotations.Nullable
                    java.lang.String localizedName, @org.jetbrains.annotations.Nullable
                    java.lang.String name) {
                        super();
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Integer getId() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String getImage() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String getLocalizedName() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String getName() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Integer component1() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String component2() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String component3() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String component4() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull
                    public final com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Ingredient copy(@org.jetbrains.annotations.Nullable
                    java.lang.Integer id, @org.jetbrains.annotations.Nullable
                    java.lang.String image, @org.jetbrains.annotations.Nullable
                    java.lang.String localizedName, @org.jetbrains.annotations.Nullable
                    java.lang.String name) {
                        return null;
                    }
                    
                    @java.lang.Override
                    public boolean equals(@org.jetbrains.annotations.Nullable
                    java.lang.Object other) {
                        return false;
                    }
                    
                    @java.lang.Override
                    public int hashCode() {
                        return 0;
                    }
                    
                    @java.lang.Override
                    @org.jetbrains.annotations.NotNull
                    public java.lang.String toString() {
                        return null;
                    }
                }
                
                @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Length;", "", "number", "", "unit", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnit", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/recipeapp/models/recipe/ResponseRecipes$Result$AnalyzedInstruction$Step$Length;", "equals", "", "other", "hashCode", "toString", "app_debug"})
                public static final class Length {
                    @com.google.gson.annotations.SerializedName(value = "number")
                    @org.jetbrains.annotations.Nullable
                    private final java.lang.Integer number = null;
                    @com.google.gson.annotations.SerializedName(value = "unit")
                    @org.jetbrains.annotations.Nullable
                    private final java.lang.String unit = null;
                    
                    public Length(@org.jetbrains.annotations.Nullable
                    java.lang.Integer number, @org.jetbrains.annotations.Nullable
                    java.lang.String unit) {
                        super();
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Integer getNumber() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String getUnit() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.Integer component1() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.Nullable
                    public final java.lang.String component2() {
                        return null;
                    }
                    
                    @org.jetbrains.annotations.NotNull
                    public final com.example.recipeapp.models.recipe.ResponseRecipes.Result.AnalyzedInstruction.Step.Length copy(@org.jetbrains.annotations.Nullable
                    java.lang.Integer number, @org.jetbrains.annotations.Nullable
                    java.lang.String unit) {
                        return null;
                    }
                    
                    @java.lang.Override
                    public boolean equals(@org.jetbrains.annotations.Nullable
                    java.lang.Object other) {
                        return false;
                    }
                    
                    @java.lang.Override
                    public int hashCode() {
                        return 0;
                    }
                    
                    @java.lang.Override
                    @org.jetbrains.annotations.NotNull
                    public java.lang.String toString() {
                        return null;
                    }
                }
            }
        }
    }
}