package com.facebook.cameracore.mediapipeline.services.targetrecognition.interfaces;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public abstract class NativeTargetRecognitionResponseCallback implements TargetRecognitionResponseCallback {
    public final HybridData mHybridData;

    public native void handleError(String str, long j);

    public native void handleResponse(String str);

    static {
        SoLoader.A06("target-recognition-android");
    }
}
