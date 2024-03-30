package com.facebook.animated.webp;

import X.AnonymousClass6I9;
import X.AnonymousClass9N2;
import X.AnonymousClass9WW;
import X.B3Z;
import X.C023109s;
import X.C187788yX;
import java.nio.ByteBuffer;
import java.util.Objects;

public class WebPImage implements B3Z {
    public long mNativeContext;

    public static native WebPImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer);

    public static native WebPImage nativeCreateFromNativeMemory(long j, int i);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* access modifiers changed from: private */
    /* renamed from: nativeGetFrame */
    public native WebPFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    public boolean doesRenderSupportScaling() {
        return true;
    }

    public WebPImage(long j) {
        this.mNativeContext = j;
    }

    public static WebPImage createFromByteArray(byte[] bArr, AnonymousClass9WW r2) {
        AnonymousClass6I9.A00();
        Objects.requireNonNull(bArr);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(bArr.length);
        allocateDirect.put(bArr);
        allocateDirect.rewind();
        return nativeCreateFromDirectByteBuffer(allocateDirect);
    }

    public void dispose() {
        nativeDispose();
    }

    public void finalize() {
        nativeFinalize();
    }

    public int getDuration() {
        return nativeGetDuration();
    }

    public int getFrameCount() {
        return nativeGetFrameCount();
    }

    public int[] getFrameDurations() {
        return nativeGetFrameDurations();
    }

    public AnonymousClass9N2 getFrameInfo(int i) {
        Integer num;
        C187788yX r3;
        WebPFrame nativeGetFrame = getFrame(i);
        try {
            int xOffset = nativeGetFrame.getXOffset();
            int yOffset = nativeGetFrame.getYOffset();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            if (nativeGetFrame.isBlendWithPreviousFrame()) {
                num = C023109s.A00;
            } else {
                num = C023109s.A01;
            }
            if (nativeGetFrame.shouldDisposeToBackgroundColor()) {
                r3 = C187788yX.DISPOSE_TO_BACKGROUND;
            } else {
                r3 = C187788yX.DISPOSE_DO_NOT;
            }
            return new AnonymousClass9N2(r3, num, xOffset, yOffset, width, height);
        } finally {
            nativeGetFrame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        return nativeGetLoopCount();
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public WebPImage() {
    }

    public WebPFrame getFrame(int i) {
        return getFrame(i);
    }
}
