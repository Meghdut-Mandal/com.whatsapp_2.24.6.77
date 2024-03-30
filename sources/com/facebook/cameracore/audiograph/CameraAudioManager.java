package com.facebook.cameracore.audiograph;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public abstract class CameraAudioManager {
    public HybridData mHybridData;

    private native HybridData initHybrid(float f);

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native int getNumSamples();

    public native float getSampleRate();

    public native boolean getSpeakers();

    public native int getState();

    public native String getStateStr(int i);

    public abstract void onAudioData(byte[] bArr, long j);

    public native void setSpeakers(boolean z);

    public native int setState(int i);

    public native int setStateSync(int i);

    static {
        SoLoader.A06("audiograph-native");
    }
}
