package com.facebook.wearable.airshield.security;

import X.AnonymousClass00C;
import X.C05250Oz;
import X.C1896794t;
import X.C90474aD;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class PrivateKey {
    public static final C1896794t Companion = new C1896794t();
    public final HybridData mHybridData;

    public /* synthetic */ PrivateKey(C05250Oz r1) {
        this();
    }

    private final native Hash deriveNative(long j);

    private final native boolean equalsNative(long j);

    /* access modifiers changed from: private */
    public final native void generate();

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setRaw(byte[] bArr);

    private final native Signature signNative(long j);

    public final Hash derive(PublicKey publicKey) {
        AnonymousClass00C.A0D(publicKey, 0);
        return deriveNative(publicKey.getNative());
    }

    public native int hashCode();

    public final native PublicKey recoverPublicKey();

    public final native byte[] serialize();

    public final Signature sign(Hash hash) {
        AnonymousClass00C.A0D(hash, 0);
        return signNative(hash.getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed());
    }

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
        AnonymousClass00C.A0E(obj, "null cannot be cast to non-null type com.facebook.wearable.airshield.security.PrivateKey");
        return equalsNative(((PrivateKey) obj).getHandleNative());
    }

    public PrivateKey() {
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }
}
