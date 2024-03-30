package com.facebook.cdl.gltfmemorypointerholder;

import X.AnonymousClass94A;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class GltfMemoryPointerWrapper {
    public static final AnonymousClass94A Companion = new AnonymousClass94A();
    public final HybridData mHybridData = initHybrid();

    private final native HybridData initHybrid();

    public final native boolean hasColorizationData();

    static {
        SoLoader.A06("gltfholdernew");
    }
}
