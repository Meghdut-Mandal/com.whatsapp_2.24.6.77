package com.facebook.wearable.airshield.security;

import X.AnonymousClass00T;
import X.C05250Oz;
import X.C1896994v;
import X.C22261AjO;
import X.C36431kI;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class Random {
    public static final C1896994v Companion = new C1896994v();
    public static final AnonymousClass00T instance = C36431kI.A1I(C22261AjO.A00);
    public final HybridData mHybridData;

    public /* synthetic */ Random(C05250Oz r1) {
        this();
    }

    /* access modifiers changed from: private */
    public final native void bytesNative(byte[] bArr);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    static {
        SoLoader.A06("airshield_light_mbed_jni");
    }

    public Random() {
        this.mHybridData = initHybrid();
    }
}
