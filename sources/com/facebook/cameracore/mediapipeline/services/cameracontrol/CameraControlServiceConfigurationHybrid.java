package com.facebook.cameracore.mediapipeline.services.cameracontrol;

import X.C1690783u;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public abstract class CameraControlServiceConfigurationHybrid extends ServiceConfiguration {
    public final C1690783u mConfiguration;

    public static native HybridData initHybrid(CameraControlServiceDelegateWrapper cameraControlServiceDelegateWrapper);
}
