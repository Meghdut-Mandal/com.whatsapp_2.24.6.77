package com.facebook.cameracore.mediapipeline.dataproviders.platformevents.implementation;

import com.facebook.jni.HybridData;

public abstract class PlatformEventsServiceObjectsWrapper {
    public final HybridData mHybridData;

    private final native void enqueueEventNative(String str);

    private final native HybridData initHybrid();

    public abstract void didReceiveEngineEvent(String str);

    public abstract void start();
}
