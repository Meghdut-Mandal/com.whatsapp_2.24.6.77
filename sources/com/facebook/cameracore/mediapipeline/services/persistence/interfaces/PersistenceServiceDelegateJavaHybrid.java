package com.facebook.cameracore.mediapipeline.services.persistence.interfaces;

import com.facebook.jni.HybridData;

public abstract class PersistenceServiceDelegateJavaHybrid extends PersistenceServiceDelegateHybrid {
    private native HybridData initHybrid();

    public abstract String get(String str);

    public abstract boolean remove(String str);

    public abstract boolean set(String str, String str2);
}
