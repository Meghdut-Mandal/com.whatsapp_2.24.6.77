package com.facebook.cameracore.mediapipeline.services.touch.interfaces;

import com.facebook.jni.HybridData;

public abstract class TouchService {
    public HybridData mHybridData;

    public interface HitTestCallback {
        void hitTestResult(long j, boolean z);
    }

    public TouchService(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
