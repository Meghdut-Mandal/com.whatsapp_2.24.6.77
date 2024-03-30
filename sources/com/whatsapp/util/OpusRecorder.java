package com.whatsapp.util;

import java.io.Closeable;

public class OpusRecorder implements Closeable {
    public long nativeHandle;

    private native void allocateNative(String str, int i, boolean z);

    private native void freeNative();

    public native long getPageNumber();

    public native boolean isRecording();

    public native void pause();

    public native void prepare();

    public native void setInitialVariablesForResume(long j, long j2);

    public native void start();

    public native void stop();

    public OpusRecorder(String str, int i, boolean z) {
        allocateNative(str, i, z);
    }

    public void close() {
        freeNative();
    }

    public void finalize() {
        super.finalize();
        if (this.nativeHandle != 0) {
            freeNative();
        }
    }
}
