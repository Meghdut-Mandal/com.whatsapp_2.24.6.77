package com.facebook.cameracore.ardelivery.effectasyncassetfetcher.listener;

import X.C1893993p;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class OnAsyncAssetFetchCompletedListenerImpl extends OnAsyncAssetFetchCompletedListener {
    public static final C1893993p Companion = new C1893993p();

    public native void onAsyncAssetFetchCompleted(String str, String str2);

    static {
        SoLoader.A06("ard-android-async-asset-fetcher-listener");
    }

    public OnAsyncAssetFetchCompletedListenerImpl(HybridData hybridData) {
        super(hybridData);
    }
}
