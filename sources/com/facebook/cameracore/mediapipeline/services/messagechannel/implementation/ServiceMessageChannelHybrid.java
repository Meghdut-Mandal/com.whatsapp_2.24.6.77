package com.facebook.cameracore.mediapipeline.services.messagechannel.implementation;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public abstract class ServiceMessageChannelHybrid extends ServiceConfiguration {
    public static final native HybridData initHybrid(ServiceMessageDataSourceHybrid serviceMessageDataSourceHybrid, int i);
}
