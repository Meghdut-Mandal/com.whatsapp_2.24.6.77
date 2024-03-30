package com.whatsapp.voipcalling;

import X.AnonymousClass7dH;
import X.C1272467n;
import X.C159747jr;
import android.content.Context;
import android.graphics.Point;
import android.view.SurfaceHolder;

public interface VideoPort {
    public static final int ERROR_CREATE_EGL = -5;
    public static final int ERROR_CREATE_RENDERER = -2;
    public static final int ERROR_NO_EGL = -6;
    public static final int ERROR_NO_SURFACE = -1;
    public static final int ERROR_POST_TO_LOOPER = -100;
    public static final int ERROR_STALE_TEXTURE = -7;
    public static final int ERROR_SWAP_BUFFERS = -3;
    public static final int ERROR_UPDATE_WINDOW_SIZE = -4;
    public static final int SUCCESS = 0;

    C1272467n createSurfaceTexture();

    @Deprecated
    Context getContext();

    @Deprecated
    SurfaceHolder getSurfaceHolder();

    @Deprecated
    Point getWindowSize();

    void release();

    void releaseSurfaceTexture(C1272467n r1);

    int renderNativeFrame(long j, int i, int i2, int i3, int i4, int i5);

    void renderTexture(C1272467n r1, int i, int i2);

    int resetBlackScreen();

    void setCornerRadius(float f);

    void setListener(AnonymousClass7dH r1);

    void setPassthroughVideoPortCallback(C159747jr r1);

    int setScaleType(int i);
}
