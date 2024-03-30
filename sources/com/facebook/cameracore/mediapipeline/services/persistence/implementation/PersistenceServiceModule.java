package com.facebook.cameracore.mediapipeline.services.persistence.implementation;

import X.AnonymousClass947;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceModule;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class PersistenceServiceModule extends ServiceModule {
    public static final AnonymousClass947 Companion = new AnonymousClass947();

    public static final native HybridData initHybrid();

    static {
        SoLoader.A06("arpersistenceservice");
    }

    public PersistenceServiceModule() {
        this.mHybridData = initHybrid();
    }
}
