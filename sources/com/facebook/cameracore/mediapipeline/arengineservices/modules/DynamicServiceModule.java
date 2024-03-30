package com.facebook.cameracore.mediapipeline.arengineservices.modules;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;

public abstract class DynamicServiceModule extends ServiceModule {
    private native HybridData initHybrid(int i);

    private synchronized ServiceModule getBaseInstance() {
        throw null;
    }
}
