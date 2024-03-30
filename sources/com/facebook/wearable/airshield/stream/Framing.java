package com.facebook.wearable.airshield.stream;

import X.C05250Oz;
import X.C188418zY;
import X.C1897294y;
import X.C36321k7;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

public final class Framing {
    public static final C1897294y Companion = new C1897294y();
    public final HybridData mHybridData;

    private final native int cipherPayloadSizeNative(ByteBuffer byteBuffer, int i, int i2);

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    private final native int lastErrorNative();

    /* access modifiers changed from: private */
    public final native int outerFrameSizeNative(int i);

    private final native int packNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    private final native int unpackNative(ByteBuffer byteBuffer, int i, int i2, ByteBuffer byteBuffer2, int i3, int i4);

    public final C188418zY pack(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        C36321k7.A0w(byteBuffer, byteBuffer2);
        int outerFrameSizeNative = outerFrameSizeNative(byteBuffer.remaining());
        if (byteBuffer2.remaining() < outerFrameSizeNative) {
            return C188418zY.BUFFER_TOO_SMALL;
        }
        int packNative = packNative(byteBuffer3, byteBuffer.position(), byteBuffer.remaining(), byteBuffer4, byteBuffer2.position(), byteBuffer2.remaining());
        if (packNative == -1) {
            int lastErrorNative = lastErrorNative();
            for (C188418zY r5 : C188418zY.values()) {
                if (r5.rawValue == lastErrorNative) {
                    return r5;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        byteBuffer.position(byteBuffer.position() + packNative);
        byteBuffer2.position(byteBuffer2.position() + outerFrameSizeNative);
        return C188418zY.SUCCESS;
    }

    public final C188418zY unpack(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        ByteBuffer byteBuffer3 = byteBuffer;
        ByteBuffer byteBuffer4 = byteBuffer2;
        C36321k7.A0w(byteBuffer, byteBuffer2);
        if (byteBuffer2.remaining() < cipherPayloadSizeNative(byteBuffer, byteBuffer.position(), byteBuffer.remaining())) {
            return C188418zY.BUFFER_TOO_SMALL;
        }
        int unpackNative = unpackNative(byteBuffer3, byteBuffer.position(), byteBuffer.remaining(), byteBuffer4, byteBuffer2.position(), byteBuffer2.remaining());
        if (unpackNative == -1) {
            int lastErrorNative = lastErrorNative();
            for (C188418zY r5 : C188418zY.values()) {
                if (r5.rawValue == lastErrorNative) {
                    return r5;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }
        byteBuffer.position(byteBuffer.position() + outerFrameSizeNative(unpackNative));
        byteBuffer2.position(byteBuffer2.position() + unpackNative);
        return C188418zY.SUCCESS;
    }

    static {
        SoLoader.A06("airshield_light_mbed_jni");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Framing(HybridData hybridData, int i, C05250Oz r4) {
        this((i & 1) != 0 ? null : hybridData);
    }

    public Framing(HybridData hybridData) {
        this.mHybridData = hybridData == null ? initHybrid() : hybridData;
    }
}
