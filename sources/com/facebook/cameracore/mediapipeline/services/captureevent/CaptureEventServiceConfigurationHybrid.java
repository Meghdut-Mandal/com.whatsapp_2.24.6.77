package com.facebook.cameracore.mediapipeline.services.captureevent;

import X.AnonymousClass845;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class CaptureEventServiceConfigurationHybrid extends ServiceConfiguration {
    public final CaptureEventInputWrapper mCaptureEventInputWrapper;
    public final AnonymousClass845 mConfiguration;

    public static native HybridData initHybrid(CaptureEventInputWrapper captureEventInputWrapper);

    public CaptureEventServiceConfigurationHybrid(AnonymousClass845 r3) {
        this.mConfiguration = r3;
        CaptureEventInputWrapper captureEventInputWrapper = new CaptureEventInputWrapper(r3.A00);
        this.mCaptureEventInputWrapper = captureEventInputWrapper;
        this.mHybridData = initHybrid(captureEventInputWrapper);
    }
}
