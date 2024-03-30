package com.facebook.cameracore.mediapipeline.services.touch.implementation;

import X.AnonymousClass3OC;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.Gesture;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchEvent;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.jni.HybridData;

public class TouchServiceImpl extends TouchService {
    public final AnonymousClass3OC mGestureProcessor = new AnonymousClass3OC(this);

    public static native HybridData initHybrid();

    public native void enqueueForHitTestNative(Gesture gesture, TouchService.HitTestCallback hitTestCallback);

    public native void sendNativeGesture(Gesture gesture);

    public native void sendNativeTouchEvent(TouchEvent touchEvent);

    public TouchServiceImpl() {
        super(initHybrid());
    }
}
