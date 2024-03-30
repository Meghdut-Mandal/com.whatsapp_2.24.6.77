package com.facebook.wearable.airshield.security;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C1896694s;
import X.C90474aD;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.nio.ByteBuffer;

public final class InitializationVector {
    public static final C1896694s Companion = new C1896694s();
    public final HybridData mHybridData;

    public /* synthetic */ InitializationVector(C05250Oz r1) {
        this();
    }

    private final native boolean equalsNative(long j);

    /* access modifiers changed from: private */
    public final native void generate();

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(ByteBuffer byteBuffer, int i, int i2);

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public native int hashCode();

    public final native int size();

    public final native byte[] toByteArray();

    static {
        SoLoader.A06("airshield_light_mbed_jni");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
            return false;
        }
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.InitializationVector");
        return equalsNative(((InitializationVector) obj).getHandleNative());
    }

    public InitializationVector() {
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }
}
