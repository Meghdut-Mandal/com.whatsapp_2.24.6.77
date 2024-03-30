package com.facebook.native_bridge;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public class NativeDataPromise implements Promise {
    public final HybridData mHybridData;

    public native void setException(String str);

    public native void setValue(Object obj);

    static {
        SoLoader.A06("native_bridge");
    }

    public NativeDataPromise(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
