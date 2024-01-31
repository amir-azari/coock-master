package com.example.recipeapp.models.detail;

import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlinx.parcelize.Parceler;
import kotlinx.parcelize.Parcelize;
import kotlinx.parcelize.RawValue;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b_\b\u0086\b\u0018\u00002\u00020\u0001:\u0006\u008a\u0001\u008b\u0001\u008c\u0001B\u00a1\u0003\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005\u0012\u0010\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\b\u0012\u0010\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\b\u0010!\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010#\u001a\u0004\u0018\u00010\u001e\u0012\b\u0010$\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010%\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010&\u001a\u0004\u0018\u00010\b\u0012\b\u0010\'\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010(\u001a\u0004\u0018\u00010\b\u0012\b\u0010)\u001a\u0004\u0018\u00010\b\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010\b\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010-\u001a\u0004\u0018\u00010.\u00a2\u0006\u0002\u0010/J\u0010\u0010_\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0011\u0010`\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010e\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0013\u0010i\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010j\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u0010l\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010m\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\u0010\u0010n\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u0010\u0010o\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010p\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010r\u001a\u0004\u0018\u00010\u001eH\u00c6\u0003\u00a2\u0006\u0002\u0010MJ\u000b\u0010s\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010u\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010v\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u000b\u0010w\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0010\u0010x\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010y\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010z\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010{\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0010\u0010|\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010}\u001a\u0004\u0018\u00010.H\u00c6\u0003J\u0010\u0010~\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u00101J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0014\u0010\u0080\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005H\u00c6\u0003J\u0011\u0010\u0081\u0001\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u00106J\u0012\u0010\u0082\u0001\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0005H\u00c6\u0003J\u0014\u0010\u0083\u0001\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0005H\u00c6\u0003J\u00f6\u0003\u0010\u0084\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00052\u0012\b\u0002\u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00052\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00052\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0012\b\u0002\u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00052\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\'\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.H\u00c6\u0001\u00a2\u0006\u0003\u0010\u0085\u0001J\u0015\u0010\u0086\u0001\u001a\u00020\b2\t\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\n\u0010\u0088\u0001\u001a\u00020\u0003H\u00d6\u0001J\n\u0010\u0089\u0001\u001a\u00020\u000bH\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b0\u00101R\u001e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b5\u00106R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b8\u00101R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R \u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u00104R\u001a\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b<\u00106R\u001e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u00104R \u0010\u000f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u00104R\u001e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u00104R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010:R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bA\u00106R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\bB\u00101R\u001a\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\bC\u00101R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010:R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010:R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010:R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bG\u00106R \u0010\u001a\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bH\u00104R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bI\u0010JR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\bK\u00101R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bL\u0010MR\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\bO\u00101R\u001a\u0010 \u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\bP\u00101R\u0018\u0010!\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bQ\u0010:R\u0018\u0010\"\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bR\u0010:R\u001a\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010N\u001a\u0004\bS\u0010MR\u0018\u0010$\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bT\u0010:R\u0018\u0010%\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bU\u0010:R\u001a\u0010&\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bV\u00106R\u0018\u0010\'\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bW\u0010:R\u001a\u0010(\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bX\u00106R\u001a\u0010)\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bY\u00106R\u001a\u0010*\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\bZ\u00106R\u001a\u0010+\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00107\u001a\u0004\b[\u00106R\u001a\u0010,\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u00102\u001a\u0004\b\\\u00101R\u0018\u0010-\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b]\u0010^\u00a8\u0006\u008d\u0001"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail;", "", "aggregateLikes", "", "analyzedInstructions", "", "Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction;", "cheap", "", "cookingMinutes", "creditsText", "", "cuisines", "dairyFree", "diets", "dishTypes", "extendedIngredients", "Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient;", "gaps", "glutenFree", "healthScore", "id", "image", "imageType", "instructions", "lowFodmap", "occasions", "originalId", "preparationMinutes", "pricePerServing", "", "readyInMinutes", "servings", "sourceName", "sourceUrl", "spoonacularScore", "spoonacularSourceUrl", "summary", "sustainable", "title", "vegan", "vegetarian", "veryHealthy", "veryPopular", "weightWatcherSmartPoints", "winePairing", "Lcom/example/recipeapp/models/detail/ResponseDetail$WinePairing;", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/example/recipeapp/models/detail/ResponseDetail$WinePairing;)V", "getAggregateLikes", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAnalyzedInstructions", "()Ljava/util/List;", "getCheap", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCookingMinutes", "getCreditsText", "()Ljava/lang/String;", "getCuisines", "getDairyFree", "getDiets", "getDishTypes", "getExtendedIngredients", "getGaps", "getGlutenFree", "getHealthScore", "getId", "getImage", "getImageType", "getInstructions", "getLowFodmap", "getOccasions", "getOriginalId", "()Ljava/lang/Object;", "getPreparationMinutes", "getPricePerServing", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getReadyInMinutes", "getServings", "getSourceName", "getSourceUrl", "getSpoonacularScore", "getSpoonacularSourceUrl", "getSummary", "getSustainable", "getTitle", "getVegan", "getVegetarian", "getVeryHealthy", "getVeryPopular", "getWeightWatcherSmartPoints", "getWinePairing", "()Lcom/example/recipeapp/models/detail/ResponseDetail$WinePairing;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/example/recipeapp/models/detail/ResponseDetail$WinePairing;)Lcom/example/recipeapp/models/detail/ResponseDetail;", "equals", "other", "hashCode", "toString", "AnalyzedInstruction", "ExtendedIngredient", "WinePairing", "app_debug"})
public final class ResponseDetail {
    @com.google.gson.annotations.SerializedName(value = "aggregateLikes")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer aggregateLikes = null;
    @com.google.gson.annotations.SerializedName(value = "analyzedInstructions")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction> analyzedInstructions = null;
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
    private final java.util.List<java.lang.Object> cuisines = null;
    @com.google.gson.annotations.SerializedName(value = "dairyFree")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean dairyFree = null;
    @com.google.gson.annotations.SerializedName(value = "diets")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> diets = null;
    @com.google.gson.annotations.SerializedName(value = "dishTypes")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.Object> dishTypes = null;
    @com.google.gson.annotations.SerializedName(value = "extendedIngredients")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient> extendedIngredients = null;
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
    @com.google.gson.annotations.SerializedName(value = "instructions")
    @org.jetbrains.annotations.Nullable
    private final java.lang.String instructions = null;
    @com.google.gson.annotations.SerializedName(value = "lowFodmap")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean lowFodmap = null;
    @com.google.gson.annotations.SerializedName(value = "occasions")
    @org.jetbrains.annotations.Nullable
    private final java.util.List<java.lang.String> occasions = null;
    @com.google.gson.annotations.SerializedName(value = "originalId")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Object originalId = null;
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
    @com.google.gson.annotations.SerializedName(value = "spoonacularScore")
    @org.jetbrains.annotations.Nullable
    private final java.lang.Double spoonacularScore = null;
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
    @com.google.gson.annotations.SerializedName(value = "winePairing")
    @org.jetbrains.annotations.Nullable
    private final com.example.recipeapp.models.detail.ResponseDetail.WinePairing winePairing = null;
    
    public ResponseDetail(@org.jetbrains.annotations.Nullable
    java.lang.Integer aggregateLikes, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction> analyzedInstructions, @org.jetbrains.annotations.Nullable
    java.lang.Boolean cheap, @org.jetbrains.annotations.Nullable
    java.lang.Integer cookingMinutes, @org.jetbrains.annotations.Nullable
    java.lang.String creditsText, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> cuisines, @org.jetbrains.annotations.Nullable
    java.lang.Boolean dairyFree, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> diets, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> dishTypes, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient> extendedIngredients, @org.jetbrains.annotations.Nullable
    java.lang.String gaps, @org.jetbrains.annotations.Nullable
    java.lang.Boolean glutenFree, @org.jetbrains.annotations.Nullable
    java.lang.Integer healthScore, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    java.lang.String imageType, @org.jetbrains.annotations.Nullable
    java.lang.String instructions, @org.jetbrains.annotations.Nullable
    java.lang.Boolean lowFodmap, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> occasions, @org.jetbrains.annotations.Nullable
    java.lang.Object originalId, @org.jetbrains.annotations.Nullable
    java.lang.Integer preparationMinutes, @org.jetbrains.annotations.Nullable
    java.lang.Double pricePerServing, @org.jetbrains.annotations.Nullable
    java.lang.Integer readyInMinutes, @org.jetbrains.annotations.Nullable
    java.lang.Integer servings, @org.jetbrains.annotations.Nullable
    java.lang.String sourceName, @org.jetbrains.annotations.Nullable
    java.lang.String sourceUrl, @org.jetbrains.annotations.Nullable
    java.lang.Double spoonacularScore, @org.jetbrains.annotations.Nullable
    java.lang.String spoonacularSourceUrl, @org.jetbrains.annotations.Nullable
    java.lang.String summary, @org.jetbrains.annotations.Nullable
    java.lang.Boolean sustainable, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.Boolean vegan, @org.jetbrains.annotations.Nullable
    java.lang.Boolean vegetarian, @org.jetbrains.annotations.Nullable
    java.lang.Boolean veryHealthy, @org.jetbrains.annotations.Nullable
    java.lang.Boolean veryPopular, @org.jetbrains.annotations.Nullable
    java.lang.Integer weightWatcherSmartPoints, @org.jetbrains.annotations.Nullable
    com.example.recipeapp.models.detail.ResponseDetail.WinePairing winePairing) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getAggregateLikes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction> getAnalyzedInstructions() {
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
    public final java.util.List<java.lang.Object> getCuisines() {
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
    public final java.util.List<java.lang.Object> getDishTypes() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient> getExtendedIngredients() {
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
    public final java.lang.String getInstructions() {
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
    public final java.lang.Object getOriginalId() {
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
    public final java.lang.Double getSpoonacularScore() {
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
    public final com.example.recipeapp.models.detail.ResponseDetail.WinePairing getWinePairing() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component14() {
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
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component18() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<java.lang.String> component19() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object component20() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component21() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Double component22() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component23() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component24() {
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
    public final java.lang.Double component27() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component28() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component29() {
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
    public final java.lang.String component31() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component32() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component33() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component34() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component35() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component36() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.example.recipeapp.models.detail.ResponseDetail.WinePairing component37() {
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
    public final java.util.List<java.lang.Object> component6() {
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
    public final java.util.List<java.lang.Object> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.recipeapp.models.detail.ResponseDetail copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer aggregateLikes, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction> analyzedInstructions, @org.jetbrains.annotations.Nullable
    java.lang.Boolean cheap, @org.jetbrains.annotations.Nullable
    java.lang.Integer cookingMinutes, @org.jetbrains.annotations.Nullable
    java.lang.String creditsText, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> cuisines, @org.jetbrains.annotations.Nullable
    java.lang.Boolean dairyFree, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> diets, @org.jetbrains.annotations.Nullable
    java.util.List<? extends java.lang.Object> dishTypes, @org.jetbrains.annotations.Nullable
    java.util.List<com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient> extendedIngredients, @org.jetbrains.annotations.Nullable
    java.lang.String gaps, @org.jetbrains.annotations.Nullable
    java.lang.Boolean glutenFree, @org.jetbrains.annotations.Nullable
    java.lang.Integer healthScore, @org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    java.lang.String imageType, @org.jetbrains.annotations.Nullable
    java.lang.String instructions, @org.jetbrains.annotations.Nullable
    java.lang.Boolean lowFodmap, @org.jetbrains.annotations.Nullable
    java.util.List<java.lang.String> occasions, @org.jetbrains.annotations.Nullable
    java.lang.Object originalId, @org.jetbrains.annotations.Nullable
    java.lang.Integer preparationMinutes, @org.jetbrains.annotations.Nullable
    java.lang.Double pricePerServing, @org.jetbrains.annotations.Nullable
    java.lang.Integer readyInMinutes, @org.jetbrains.annotations.Nullable
    java.lang.Integer servings, @org.jetbrains.annotations.Nullable
    java.lang.String sourceName, @org.jetbrains.annotations.Nullable
    java.lang.String sourceUrl, @org.jetbrains.annotations.Nullable
    java.lang.Double spoonacularScore, @org.jetbrains.annotations.Nullable
    java.lang.String spoonacularSourceUrl, @org.jetbrains.annotations.Nullable
    java.lang.String summary, @org.jetbrains.annotations.Nullable
    java.lang.Boolean sustainable, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.Boolean vegan, @org.jetbrains.annotations.Nullable
    java.lang.Boolean vegetarian, @org.jetbrains.annotations.Nullable
    java.lang.Boolean veryHealthy, @org.jetbrains.annotations.Nullable
    java.lang.Boolean veryPopular, @org.jetbrains.annotations.Nullable
    java.lang.Integer weightWatcherSmartPoints, @org.jetbrains.annotations.Nullable
    com.example.recipeapp.models.detail.ResponseDetail.WinePairing winePairing) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001dB$\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0013\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\b\u0007\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0016\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\b\u0007H\u00c6\u0003J,\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0015\b\u0002\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\b\u0007H\u00c6\u0001J\t\u0010\u0010\u001a\u00020\u0011H\u00d6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0011H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u0004\u001a\u000f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u00a2\u0006\u0002\b\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u001e"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction;", "Landroid/os/Parcelable;", "name", "", "steps", "", "Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step;", "Lkotlinx/parcelize/RawValue;", "(Ljava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getSteps", "()Ljava/util/List;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Step", "app_debug"})
    @kotlinx.parcelize.Parcelize
    public static final class AnalyzedInstruction implements android.os.Parcelable {
        @com.google.gson.annotations.SerializedName(value = "name")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String name = null;
        @com.google.gson.annotations.SerializedName(value = "steps")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step> steps = null;
        
        public AnalyzedInstruction(@org.jetbrains.annotations.Nullable
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step> steps) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step> getSteps() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step> component2() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction copy(@org.jetbrains.annotations.Nullable
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step> steps) {
            return null;
        }
        
        @java.lang.Override
        public int describeContents() {
            return 0;
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
        
        @java.lang.Override
        public void writeToParcel(@org.jetbrains.annotations.NotNull
        android.os.Parcel parcel, int flags) {
        }
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0003$%&BG\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\rJ\u0013\u0010\u0018\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0013\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\fH\u00c6\u0003JZ\u0010\u001d\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\nH\u00d6\u0001J\t\u0010#\u001a\u00020\fH\u00d6\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\'"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step;", "", "equipment", "", "Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Equipment;", "ingredients", "Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Ingredient;", "length", "Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Length;", "number", "", "step", "", "(Ljava/util/List;Ljava/util/List;Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Length;Ljava/lang/Integer;Ljava/lang/String;)V", "getEquipment", "()Ljava/util/List;", "getIngredients", "getLength", "()Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Length;", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getStep", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Length;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step;", "equals", "", "other", "hashCode", "toString", "Equipment", "Ingredient", "Length", "app_debug"})
        public static final class Step {
            @com.google.gson.annotations.SerializedName(value = "equipment")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Equipment> equipment = null;
            @com.google.gson.annotations.SerializedName(value = "ingredients")
            @org.jetbrains.annotations.Nullable
            private final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Ingredient> ingredients = null;
            @com.google.gson.annotations.SerializedName(value = "length")
            @org.jetbrains.annotations.Nullable
            private final com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Length length = null;
            @com.google.gson.annotations.SerializedName(value = "number")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Integer number = null;
            @com.google.gson.annotations.SerializedName(value = "step")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String step = null;
            
            public Step(@org.jetbrains.annotations.Nullable
            java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Equipment> equipment, @org.jetbrains.annotations.Nullable
            java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Ingredient> ingredients, @org.jetbrains.annotations.Nullable
            com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Length length, @org.jetbrains.annotations.Nullable
            java.lang.Integer number, @org.jetbrains.annotations.Nullable
            java.lang.String step) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Equipment> getEquipment() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Ingredient> getIngredients() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Length getLength() {
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
            public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Equipment> component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Ingredient> component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Length component3() {
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
            public final com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step copy(@org.jetbrains.annotations.Nullable
            java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Equipment> equipment, @org.jetbrains.annotations.Nullable
            java.util.List<com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Ingredient> ingredients, @org.jetbrains.annotations.Nullable
            com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Length length, @org.jetbrains.annotations.Nullable
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
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Equipment;", "", "id", "", "image", "", "localizedName", "name", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "()Ljava/lang/String;", "getLocalizedName", "getName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Equipment;", "equals", "", "other", "hashCode", "toString", "app_debug"})
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
                public final com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Equipment copy(@org.jetbrains.annotations.Nullable
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
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J>\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u001b"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Ingredient;", "", "id", "", "image", "", "localizedName", "name", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "()Ljava/lang/String;", "getLocalizedName", "getName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Ingredient;", "equals", "", "other", "hashCode", "toString", "app_debug"})
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
                public final com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Ingredient copy(@org.jetbrains.annotations.Nullable
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
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0014\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Length;", "", "number", "", "unit", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "getNumber", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUnit", "()Ljava/lang/String;", "component1", "component2", "copy", "(Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/recipeapp/models/detail/ResponseDetail$AnalyzedInstruction$Step$Length;", "equals", "", "other", "hashCode", "toString", "app_debug"})
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
                public final com.example.recipeapp.models.detail.ResponseDetail.AnalyzedInstruction.Step.Length copy(@org.jetbrains.annotations.Nullable
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b(\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001:B\u0085\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\u000b\u0010.\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u0013\u00100\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\rH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u00a6\u0001\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\b\u0002\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001\u00a2\u0006\u0002\u00104J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00108\u001a\u00020\bH\u00d6\u0001J\t\u00109\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR \u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0015R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0015R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0015R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0015\u00a8\u0006;"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient;", "", "aisle", "", "amount", "", "consistency", "id", "", "image", "measures", "Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures;", "meta", "", "name", "nameClean", "original", "originalName", "unit", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAisle", "()Ljava/lang/String;", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getConsistency", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "getMeasures", "()Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures;", "getMeta", "()Ljava/util/List;", "getName", "getNameClean", "getOriginal", "getOriginalName", "getUnit", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient;", "equals", "", "other", "hashCode", "toString", "Measures", "app_debug"})
    public static final class ExtendedIngredient {
        @com.google.gson.annotations.SerializedName(value = "aisle")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String aisle = null;
        @com.google.gson.annotations.SerializedName(value = "amount")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Double amount = null;
        @com.google.gson.annotations.SerializedName(value = "consistency")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String consistency = null;
        @com.google.gson.annotations.SerializedName(value = "id")
        @org.jetbrains.annotations.Nullable
        private final java.lang.Integer id = null;
        @com.google.gson.annotations.SerializedName(value = "image")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String image = null;
        @com.google.gson.annotations.SerializedName(value = "measures")
        @org.jetbrains.annotations.Nullable
        private final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures measures = null;
        @com.google.gson.annotations.SerializedName(value = "meta")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> meta = null;
        @com.google.gson.annotations.SerializedName(value = "name")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String name = null;
        @com.google.gson.annotations.SerializedName(value = "nameClean")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String nameClean = null;
        @com.google.gson.annotations.SerializedName(value = "original")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String original = null;
        @com.google.gson.annotations.SerializedName(value = "originalName")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String originalName = null;
        @com.google.gson.annotations.SerializedName(value = "unit")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String unit = null;
        
        public ExtendedIngredient(@org.jetbrains.annotations.Nullable
        java.lang.String aisle, @org.jetbrains.annotations.Nullable
        java.lang.Double amount, @org.jetbrains.annotations.Nullable
        java.lang.String consistency, @org.jetbrains.annotations.Nullable
        java.lang.Integer id, @org.jetbrains.annotations.Nullable
        java.lang.String image, @org.jetbrains.annotations.Nullable
        com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures measures, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> meta, @org.jetbrains.annotations.Nullable
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.lang.String nameClean, @org.jetbrains.annotations.Nullable
        java.lang.String original, @org.jetbrains.annotations.Nullable
        java.lang.String originalName, @org.jetbrains.annotations.Nullable
        java.lang.String unit) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getAisle() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Double getAmount() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getConsistency() {
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
        public final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures getMeasures() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getMeta() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getNameClean() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getOriginal() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getOriginalName() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getUnit() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component10() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component11() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component12() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.Double component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component3() {
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
        public final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures component6() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component7() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient copy(@org.jetbrains.annotations.Nullable
        java.lang.String aisle, @org.jetbrains.annotations.Nullable
        java.lang.Double amount, @org.jetbrains.annotations.Nullable
        java.lang.String consistency, @org.jetbrains.annotations.Nullable
        java.lang.Integer id, @org.jetbrains.annotations.Nullable
        java.lang.String image, @org.jetbrains.annotations.Nullable
        com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures measures, @org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> meta, @org.jetbrains.annotations.Nullable
        java.lang.String name, @org.jetbrains.annotations.Nullable
        java.lang.String nameClean, @org.jetbrains.annotations.Nullable
        java.lang.String original, @org.jetbrains.annotations.Nullable
        java.lang.String originalName, @org.jetbrains.annotations.Nullable
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\u0015\u0016B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0014H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures;", "", "metric", "Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures$Metric;", "us", "Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures$Us;", "(Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures$Metric;Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures$Us;)V", "getMetric", "()Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures$Metric;", "getUs", "()Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures$Us;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Metric", "Us", "app_debug"})
        public static final class Measures {
            @com.google.gson.annotations.SerializedName(value = "metric")
            @org.jetbrains.annotations.Nullable
            private final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Metric metric = null;
            @com.google.gson.annotations.SerializedName(value = "us")
            @org.jetbrains.annotations.Nullable
            private final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Us us = null;
            
            public Measures(@org.jetbrains.annotations.Nullable
            com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Metric metric, @org.jetbrains.annotations.Nullable
            com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Us us) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Metric getMetric() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Us getUs() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Metric component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Us component2() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures copy(@org.jetbrains.annotations.Nullable
            com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Metric metric, @org.jetbrains.annotations.Nullable
            com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Us us) {
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
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures$Metric;", "", "amount", "", "unitLong", "", "unitShort", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUnitLong", "()Ljava/lang/String;", "getUnitShort", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures$Metric;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
            public static final class Metric {
                @com.google.gson.annotations.SerializedName(value = "amount")
                @org.jetbrains.annotations.Nullable
                private final java.lang.Double amount = null;
                @com.google.gson.annotations.SerializedName(value = "unitLong")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String unitLong = null;
                @com.google.gson.annotations.SerializedName(value = "unitShort")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String unitShort = null;
                
                public Metric(@org.jetbrains.annotations.Nullable
                java.lang.Double amount, @org.jetbrains.annotations.Nullable
                java.lang.String unitLong, @org.jetbrains.annotations.Nullable
                java.lang.String unitShort) {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.Double getAmount() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.String getUnitLong() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.String getUnitShort() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.Double component1() {
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
                
                @org.jetbrains.annotations.NotNull
                public final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Metric copy(@org.jetbrains.annotations.Nullable
                java.lang.Double amount, @org.jetbrains.annotations.Nullable
                java.lang.String unitLong, @org.jetbrains.annotations.Nullable
                java.lang.String unitShort) {
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
            
            @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f\u00a8\u0006\u0019"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures$Us;", "", "amount", "", "unitLong", "", "unitShort", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)V", "getAmount", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUnitLong", "()Ljava/lang/String;", "getUnitShort", "component1", "component2", "component3", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;)Lcom/example/recipeapp/models/detail/ResponseDetail$ExtendedIngredient$Measures$Us;", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
            public static final class Us {
                @com.google.gson.annotations.SerializedName(value = "amount")
                @org.jetbrains.annotations.Nullable
                private final java.lang.Double amount = null;
                @com.google.gson.annotations.SerializedName(value = "unitLong")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String unitLong = null;
                @com.google.gson.annotations.SerializedName(value = "unitShort")
                @org.jetbrains.annotations.Nullable
                private final java.lang.String unitShort = null;
                
                public Us(@org.jetbrains.annotations.Nullable
                java.lang.Double amount, @org.jetbrains.annotations.Nullable
                java.lang.String unitLong, @org.jetbrains.annotations.Nullable
                java.lang.String unitShort) {
                    super();
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.Double getAmount() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.String getUnitLong() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.String getUnitShort() {
                    return null;
                }
                
                @org.jetbrains.annotations.Nullable
                public final java.lang.Double component1() {
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
                
                @org.jetbrains.annotations.NotNull
                public final com.example.recipeapp.models.detail.ResponseDetail.ExtendedIngredient.Measures.Us copy(@org.jetbrains.annotations.Nullable
                java.lang.Double amount, @org.jetbrains.annotations.Nullable
                java.lang.String unitLong, @org.jetbrains.annotations.Nullable
                java.lang.String unitShort) {
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
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0018B3\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\bJ\u0013\u0010\u000e\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003J\u0013\u0010\u0010\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003H\u00c6\u0003J=\u0010\u0011\u001a\u00020\u00002\u0012\b\u0002\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0015\u001a\u00020\u0016H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0004H\u00d6\u0001R \u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR \u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n\u00a8\u0006\u0019"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$WinePairing;", "", "pairedWines", "", "", "pairingText", "productMatches", "Lcom/example/recipeapp/models/detail/ResponseDetail$WinePairing$ProductMatche;", "(Ljava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getPairedWines", "()Ljava/util/List;", "getPairingText", "()Ljava/lang/String;", "getProductMatches", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ProductMatche", "app_debug"})
    public static final class WinePairing {
        @com.google.gson.annotations.SerializedName(value = "pairedWines")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<java.lang.String> pairedWines = null;
        @com.google.gson.annotations.SerializedName(value = "pairingText")
        @org.jetbrains.annotations.Nullable
        private final java.lang.String pairingText = null;
        @com.google.gson.annotations.SerializedName(value = "productMatches")
        @org.jetbrains.annotations.Nullable
        private final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.WinePairing.ProductMatche> productMatches = null;
        
        public WinePairing(@org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> pairedWines, @org.jetbrains.annotations.Nullable
        java.lang.String pairingText, @org.jetbrains.annotations.Nullable
        java.util.List<com.example.recipeapp.models.detail.ResponseDetail.WinePairing.ProductMatche> productMatches) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> getPairedWines() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String getPairingText() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.WinePairing.ProductMatche> getProductMatches() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<java.lang.String> component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.lang.String component2() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable
        public final java.util.List<com.example.recipeapp.models.detail.ResponseDetail.WinePairing.ProductMatche> component3() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.example.recipeapp.models.detail.ResponseDetail.WinePairing copy(@org.jetbrains.annotations.Nullable
        java.util.List<java.lang.String> pairedWines, @org.jetbrains.annotations.Nullable
        java.lang.String pairingText, @org.jetbrains.annotations.Nullable
        java.util.List<com.example.recipeapp.models.detail.ResponseDetail.WinePairing.ProductMatche> productMatches) {
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
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jz\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010+\u001a\u00020\u0007H\u00d6\u0001J\t\u0010,\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001a\u0010\u0010R\u001a\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u001b\u0010\u0010R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0013\u00a8\u0006-"}, d2 = {"Lcom/example/recipeapp/models/detail/ResponseDetail$WinePairing$ProductMatche;", "", "averageRating", "", "description", "", "id", "", "imageUrl", "link", "price", "ratingCount", "score", "title", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getAverageRating", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDescription", "()Ljava/lang/String;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImageUrl", "getLink", "getPrice", "getRatingCount", "getScore", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Double;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/example/recipeapp/models/detail/ResponseDetail$WinePairing$ProductMatche;", "equals", "", "other", "hashCode", "toString", "app_debug"})
        public static final class ProductMatche {
            @com.google.gson.annotations.SerializedName(value = "averageRating")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Double averageRating = null;
            @com.google.gson.annotations.SerializedName(value = "description")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String description = null;
            @com.google.gson.annotations.SerializedName(value = "id")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Integer id = null;
            @com.google.gson.annotations.SerializedName(value = "imageUrl")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String imageUrl = null;
            @com.google.gson.annotations.SerializedName(value = "link")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String link = null;
            @com.google.gson.annotations.SerializedName(value = "price")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String price = null;
            @com.google.gson.annotations.SerializedName(value = "ratingCount")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Double ratingCount = null;
            @com.google.gson.annotations.SerializedName(value = "score")
            @org.jetbrains.annotations.Nullable
            private final java.lang.Double score = null;
            @com.google.gson.annotations.SerializedName(value = "title")
            @org.jetbrains.annotations.Nullable
            private final java.lang.String title = null;
            
            public ProductMatche(@org.jetbrains.annotations.Nullable
            java.lang.Double averageRating, @org.jetbrains.annotations.Nullable
            java.lang.String description, @org.jetbrains.annotations.Nullable
            java.lang.Integer id, @org.jetbrains.annotations.Nullable
            java.lang.String imageUrl, @org.jetbrains.annotations.Nullable
            java.lang.String link, @org.jetbrains.annotations.Nullable
            java.lang.String price, @org.jetbrains.annotations.Nullable
            java.lang.Double ratingCount, @org.jetbrains.annotations.Nullable
            java.lang.Double score, @org.jetbrains.annotations.Nullable
            java.lang.String title) {
                super();
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Double getAverageRating() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getDescription() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer getId() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getImageUrl() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getLink() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getPrice() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Double getRatingCount() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Double getScore() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String getTitle() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Double component1() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component2() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Integer component3() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component4() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component5() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component6() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Double component7() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.Double component8() {
                return null;
            }
            
            @org.jetbrains.annotations.Nullable
            public final java.lang.String component9() {
                return null;
            }
            
            @org.jetbrains.annotations.NotNull
            public final com.example.recipeapp.models.detail.ResponseDetail.WinePairing.ProductMatche copy(@org.jetbrains.annotations.Nullable
            java.lang.Double averageRating, @org.jetbrains.annotations.Nullable
            java.lang.String description, @org.jetbrains.annotations.Nullable
            java.lang.Integer id, @org.jetbrains.annotations.Nullable
            java.lang.String imageUrl, @org.jetbrains.annotations.Nullable
            java.lang.String link, @org.jetbrains.annotations.Nullable
            java.lang.String price, @org.jetbrains.annotations.Nullable
            java.lang.Double ratingCount, @org.jetbrains.annotations.Nullable
            java.lang.Double score, @org.jetbrains.annotations.Nullable
            java.lang.String title) {
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