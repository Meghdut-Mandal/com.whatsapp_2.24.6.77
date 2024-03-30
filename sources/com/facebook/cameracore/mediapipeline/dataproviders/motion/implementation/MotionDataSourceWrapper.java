package com.facebook.cameracore.mediapipeline.dataproviders.motion.implementation;

import X.AnonymousClass001;
import X.C22777Avn;
import com.facebook.jni.HybridData;

public class MotionDataSourceWrapper {
    public final C22777Avn mDataSource;
    public final HybridData mHybridData = initHybrid();
    public boolean mIsAlive = true;

    private native HybridData initHybrid();

    private native void setData(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4, long j);

    private native void setRawSensorResult(int i, float[] fArr, long j);

    public void destroy() {
        this.mIsAlive = false;
        this.mHybridData.resetNative();
    }

    public int getExecutionMode() {
        throw AnonymousClass001.A0A("getExecutionMode");
    }

    public boolean hasRawData() {
        throw AnonymousClass001.A0A("hasRawData");
    }

    public boolean isSensorAvailable(int i) {
        throw AnonymousClass001.A0A("isSensorAvailable");
    }

    public void start() {
        throw AnonymousClass001.A0A("start");
    }

    public void stop() {
        throw AnonymousClass001.A0A("stop");
    }

    public MotionDataSourceWrapper(C22777Avn avn) {
        this.mDataSource = avn;
        throw AnonymousClass001.A0A("addListener");
    }
}
