package com.facebook.cameracore.mediapipeline.services.captureevent;

import X.C20956A0n;
import X.C22779Avp;
import com.facebook.jni.HybridData;

public class CaptureEventInputWrapper {
    public final C22779Avp mCaptureEventInput;
    public final HybridData mHybridData = initHybrid(0, 0, 0, 0, 1.0f);

    public static native HybridData initHybrid(int i, int i2, int i3, int i4, float f);

    public native void capturePhoto();

    public native void finishCapturePhoto();

    public native void setCaptureContext(int i);

    public native void setCaptureDevicePosition(int i);

    public native void setCaptureDeviceSize(int i, int i2);

    public native void setEffectSafeAreaInsets(int i, int i2, int i3, int i4);

    public native void setPreviewViewInfo(int i, int i2, float f);

    public native void setRotation(int i);

    public native void setZoomFactor(float f);

    public native void startRecording();

    public native void stopRecording();

    public CaptureEventInputWrapper(C22779Avp avp) {
        this.mCaptureEventInput = avp;
        ((C20956A0n) avp).A00.add(this);
    }
}
