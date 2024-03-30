package com.whatsapp.voipcalling;

import java.nio.FloatBuffer;

public class GlVideoRenderer {
    public long nativeHandle;

    public static native void initNative();

    public native boolean init(int i, int i2);

    public native void release();

    public native void renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5);

    public native void renderOesTexture(int i, int i2, int i3, FloatBuffer floatBuffer);

    public native boolean setBackgroundColor(float[] fArr);

    public native void setCornerRadius(float f);

    public native void setScaleType(int i);

    public native void setWindow(int i, int i2, int i3, int i4);

    static {
        initNative();
    }
}
