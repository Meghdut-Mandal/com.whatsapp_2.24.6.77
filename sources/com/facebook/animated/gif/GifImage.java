package com.facebook.animated.gif;

import X.AnonymousClass9N2;
import X.B3Z;
import X.C023109s;
import X.C187788yX;
import java.nio.ByteBuffer;

public class GifImage implements B3Z {
    public static volatile boolean sInitialized;
    public long mNativeContext;

    public static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i, boolean z);

    public static native GifImage nativeCreateFromFileDescriptor(int i, int i2, boolean z);

    public static native GifImage nativeCreateFromNativeMemory(long j, int i, int i2, boolean z);

    private native void nativeDispose();

    private native void nativeFinalize();

    private native int nativeGetDuration();

    /* access modifiers changed from: private */
    /* renamed from: nativeGetFrame */
    public native GifFrame getFrame(int i);

    private native int nativeGetFrameCount();

    private native int[] nativeGetFrameDurations();

    private native int nativeGetHeight();

    private native int nativeGetLoopCount();

    private native int nativeGetSizeInBytes();

    private native int nativeGetWidth();

    private native boolean nativeIsAnimated();

    public boolean doesRenderSupportScaling() {
        return false;
    }

    public GifImage(long j) {
        this.mNativeContext = j;
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
        C187788yX r4;
        GifFrame nativeGetFrame = getFrame(i);
        try {
            int xOffset = nativeGetFrame.getXOffset();
            int yOffset = nativeGetFrame.getYOffset();
            int width = nativeGetFrame.getWidth();
            int height = nativeGetFrame.getHeight();
            Integer num = C023109s.A00;
            int disposalMode = nativeGetFrame.getDisposalMode();
            if (!(disposalMode == 0 || disposalMode == 1)) {
                if (disposalMode == 2) {
                    r4 = C187788yX.DISPOSE_TO_BACKGROUND;
                } else if (disposalMode == 3) {
                    r4 = C187788yX.DISPOSE_TO_PREVIOUS;
                }
                return new AnonymousClass9N2(r4, num, xOffset, yOffset, width, height);
            }
            r4 = C187788yX.DISPOSE_DO_NOT;
            return new AnonymousClass9N2(r4, num, xOffset, yOffset, width, height);
        } finally {
            nativeGetFrame.dispose();
        }
    }

    public int getHeight() {
        return nativeGetHeight();
    }

    public int getLoopCount() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount == -1) {
            return 1;
        }
        int i = nativeGetLoopCount + 1;
        if (nativeGetLoopCount == 0) {
            return 0;
        }
        return i;
    }

    public int getSizeInBytes() {
        return nativeGetSizeInBytes();
    }

    public int getWidth() {
        return nativeGetWidth();
    }

    public boolean isAnimated() {
        return nativeIsAnimated();
    }

    public GifImage() {
    }
}
