package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.AnonymousClass001;
import X.C1690883v;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public class MotionDataProviderConfigurationHybrid extends ServiceConfiguration {
    public final C1690883v mConfiguration;
    public final MotionDataSourceWrapper mMotionDataSourceWrapper;

    public static native HybridData initHybrid(MotionDataSourceWrapper motionDataSourceWrapper);

    public MotionDataProviderConfigurationHybrid(C1690883v r2) {
        this.mConfiguration = r2;
        throw AnonymousClass001.A0A("getMotionDataSource");
    }

    public MotionDataSourceWrapper getDataSource() {
        return this.mMotionDataSourceWrapper;
    }
}
