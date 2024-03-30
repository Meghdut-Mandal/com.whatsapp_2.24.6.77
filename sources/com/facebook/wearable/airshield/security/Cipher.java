package com.facebook.wearable.airshield.security;

import X.AnonymousClass001;
import X.C05250Oz;
import X.C187708yP;
import X.C1896494q;
import X.C36321k7;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public final class Cipher {
    public static final C1896494q Companion = new C1896494q();
    public final HybridData mHybridData;
    public final C187708yP operation;

    public /* synthetic */ Cipher(C187708yP r1, C05250Oz r2) {
        this(r1);
    }

    private final native long getHandleNative();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    /* access modifiers changed from: private */
    public final native void setup(long j, boolean z, long j2);

    private final native int size();

    private final native boolean update(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3);

    public final boolean update(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        C36321k7.A0w(byteBuffer, byteBuffer2);
        if (!byteBuffer.isDirect() || !byteBuffer2.isDirect()) {
            throw AnonymousClass001.A08("Byte buffer must be direct!");
        }
        return update(byteBuffer3, byteBuffer.position(), byteBuffer.remaining(), byteBuffer4, byteBuffer2.position());
    }

    public Cipher(C187708yP r2) {
        this.operation = r2;
        this.mHybridData = initHybrid();
    }

    public final long getNative$fbandroid_java_com_facebook_wearable_airshield_airshield_mbed() {
        return getHandleNative();
    }

    public final C187708yP getOperation() {
        return this.operation;
    }

    public final int getSize() {
        return size();
    }
}
