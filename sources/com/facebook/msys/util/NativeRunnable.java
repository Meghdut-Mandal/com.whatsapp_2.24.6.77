package com.facebook.msys.util;

import com.facebook.simplejni.NativeHolder;

public final class NativeRunnable implements Runnable {
    public NativeHolder mNativeHolder;

    public native void run();

    public NativeRunnable(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }
}
