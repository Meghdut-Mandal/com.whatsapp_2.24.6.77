package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import X.AnonymousClass942;
import X.C1690983w;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;

public abstract class PlatformEventsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final AnonymousClass942 Companion = new AnonymousClass942();
    public final C1690983w configuration;
    public final PlatformEventsServiceObjectsWrapper objectsWrapper;

    public static final native HybridData initHybrid(PlatformEventsServiceObjectsWrapper platformEventsServiceObjectsWrapper);
}
