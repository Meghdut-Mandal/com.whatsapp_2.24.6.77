package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.AnonymousClass00C;
import X.AnonymousClass93o;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public abstract class OnAsyncAssetFetchCompletedListener {
    public static final AnonymousClass93o Companion = new AnonymousClass93o();
    public final HybridData mHybridData;

    public OnAsyncAssetFetchCompletedListener(HybridData hybridData) {
        AnonymousClass00C.A0D(hybridData, 1);
        this.mHybridData = hybridData;
    }

    public abstract void onAsyncAssetFetchCompleted(String str, String str2);

    static {
        SoLoader.A06("ard-android-async-asset-fetcher-listener");
    }
}
