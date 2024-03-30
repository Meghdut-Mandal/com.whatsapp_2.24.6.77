package com.facebook.wearable.airshield.security;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C1896594r;
import X.C90474aD;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.nio.ByteBuffer;

public final class Hash {
    public static final C1896594r Companion = new C1896594r();
    public final HybridData mHybridData;

    private final native boolean equalsNative(long j);

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    /* access modifiers changed from: private */
    public final native void hashBytes(byte[] bArr);

    /* access modifiers changed from: private */
    public final native void hashString(String str);

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(ByteBuffer byteBuffer, int i, int i2);

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    public native int hashCode();

    public final native byte[] toByteArray();

    static {
        SoLoader.A06("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Hash(HybridData hybridData, int i, C05250Oz r4) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
            return false;
        }
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.Hash");
        return equalsNative(((Hash) obj).getHandleNative());
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public Hash(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
