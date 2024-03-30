package com.facebook.wearable.airshield.security;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C1896894u;
import X.C36321k7;
import X.C90474aD;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class PublicKey {
    public static final C1896894u Companion = new C1896894u();
    public final HybridData mHybridData;

    private final native boolean equalsNative(long j);

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    private final native boolean verifySignatureNative(long j, long j2);

    public native int hashCode();

    public final native byte[] serialize();

    static {
        SoLoader.A06("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PublicKey(HybridData hybridData, int i, C05250Oz r4) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!AnonymousClass00C.A0J(getClass(), C90474aD.A0W(obj))) {
            return false;
        }
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.PublicKey");
        return equalsNative(((PublicKey) obj).getHandleNative());
    }

    public final long getNative() {
        return getHandleNative();
    }

    public final boolean verifySignature(Hash hash, Signature signature) {
        C36321k7.A0w(hash, signature);
        return verifySignatureNative(hash.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed(), signature.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

    public PublicKey(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
