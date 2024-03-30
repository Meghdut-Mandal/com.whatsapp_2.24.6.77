package com.facebook.cameracore.mediapipeline.arengineservices.whatsapp;

import X.C1894893z;
import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.common.ARClass;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHost;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.cameracore.mediapipeline.services.networking.interfaces.NetworkClient;
import com.facebook.cameracore.mediapipeline.services.touch.implementation.TouchServiceImpl;
import com.facebook.cameracore.mediapipeline.services.touch.interfaces.TouchService;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.util.List;

public final class WhatsAppEffectServiceHost extends EffectServiceHost {
    public static final C1894893z Companion = new C1894893z();
    public final AnalyticsLogger analyticsLogger;
    public final ARExperimentConfig arExperimentConfig;
    public final Context context;
    public final NetworkClient networkClient;
    public TouchService touchService;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public WhatsAppEffectServiceHost(android.content.Context r11, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig r12, X.C111595cX r13, com.facebook.cameracore.mediapipeline.arclass.common.ARClass r14, X.C114735hk r15, X.AnonymousClass9LG r16) {
        /*
            r10 = this;
            r0 = 3
            r8 = r13
            X.AnonymousClass00C.A0D(r13, r0)
            X.93y r5 = new X.93y
            r5.<init>()
            X.09w r6 = X.C023409w.A00
            r7 = 0
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r10.context = r11
            X.8zO r0 = X.C188318zO.OVERRIDE_DISABLE_OPTIMIZED
            com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl r5 = new com.facebook.cameracore.mediapipeline.services.analyticslogger.implementation.AnalyticsLoggerImpl
            r1 = r16
            r5.<init>(r1, r7, r0)
            r10.analyticsLogger = r5
            com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl r7 = new com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl
            r7.<init>(r13)
            r10.arExperimentConfig = r7
            com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl r6 = new com.facebook.cameracore.mediapipeline.services.networking.implementation.NetworkClientImpl
            r6.<init>(r15)
            r10.networkClient = r6
            java.util.List r9 = r10.mServiceModules
            r8 = r14
            r3 = r10
            com.facebook.jni.HybridData r0 = r3.initHybrid(r4, r5, r6, r7, r8, r9)
            r10.mHybridData = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.arengineservices.whatsapp.WhatsAppEffectServiceHost.<init>(android.content.Context, com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectServiceHostConfig, X.5cX, com.facebook.cameracore.mediapipeline.arclass.common.ARClass, X.5hk, X.9LG):void");
    }

    private final native HybridData initHybrid(EffectServiceHostConfig effectServiceHostConfig, AnalyticsLogger analyticsLogger2, NetworkClient networkClient2, ARExperimentConfig aRExperimentConfig, ARClass aRClass, List list);

    public void destroyTouchService() {
        this.touchService = null;
    }

    static {
        SoLoader.A06("graphicsengine-arengineservices-whatsappservicehost-native");
    }

    public TouchService createTouchService() {
        TouchService touchService2 = this.touchService;
        if (touchService2 != null) {
            return touchService2;
        }
        TouchServiceImpl touchServiceImpl = new TouchServiceImpl();
        this.touchService = touchServiceImpl;
        return touchServiceImpl;
    }

    public void destroy() {
        super.destroy();
        HybridData hybridData = this.arExperimentConfig.mHybridData;
        if (hybridData != null) {
            hybridData.resetNative();
        }
        AnalyticsLoggerImpl analyticsLoggerImpl = (AnalyticsLoggerImpl) this.analyticsLogger;
        analyticsLoggerImpl.mHybridData.resetNative();
        analyticsLoggerImpl.mCameraARAnalyticsLogger = null;
        HybridData hybridData2 = this.networkClient.mHybridData;
        if (hybridData2 != null) {
            hybridData2.resetNative();
        }
    }
}
