package com.facebook.cameracore.audiograph;

import X.AnonymousClass93r;
import X.C20974A1k;
import android.os.Build;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;

public abstract class AudioPipelineImpl {
    public static final boolean IS_UNIT_TEST = "robolectric".equals(Build.FINGERPRINT);
    public static final AnonymousClass93r sEmptyAudioPerfStatsProvider = new AnonymousClass93r();
    public static final C20974A1k sEmptyStateCallback = new C20974A1k();
    public HybridData mHybridData;

    private native int createFbaProcessingGraphInternal(int i, int i2, boolean z);

    private native int createManualProcessingGraphInternal(int i, int i2);

    private native HybridData initHybrid(int i, float f, int i2, boolean z);

    private native int startInputInternal();

    private native int stopInputInternal();

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native String getDebugInfo();

    public native String getFBAProfileInfo(int i);

    public abstract void handleAudioCallback(byte[] bArr, long j, long j2);

    public abstract void handleDebugEvent(String str);

    public native boolean isSubgraphInserted();

    public native void onReceivedAudioMixingMode(int i);

    public native int pause();

    public native int processAndPullSpeaker(byte[] bArr, int i);

    public native int processAndPullSpeakerWithByteBuffer(ByteBuffer byteBuffer, int i);

    public native int processByteBuffer(ByteBuffer byteBuffer, int i);

    public native int processData(byte[] bArr, int i);

    public native int pullCaptureSinkQueue(ByteBuffer byteBuffer, int i);

    public native int resume();

    public abstract boolean setAudioMixing(int i);

    public abstract int startPlatformInput();

    public abstract int startPlatformOutput();

    public abstract int stopPlatformInput();

    public abstract int stopPlatformOutput();

    public native void updateOutputRouteState(int i);
}