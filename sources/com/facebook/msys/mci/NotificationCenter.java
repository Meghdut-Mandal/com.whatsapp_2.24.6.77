package com.facebook.msys.mci;

import X.C17550rb;
import X.C22873AxS;
import com.facebook.simplejni.NativeHolder;

@Deprecated
public class NotificationCenter extends NotificationCenterInternal {
    public NotificationCenter() {
        super(false);
    }

    public synchronized void addObserver(C17550rb r2, String str, int i, C22873AxS axS) {
        super.addObserver(r2, str, i, axS);
    }

    public native void addObserverNative(String str, int i);

    public native NativeHolder initNativeHolder();

    public synchronized void removeEveryObserver(C17550rb r2) {
        super.removeEveryObserver(r2);
    }

    public synchronized void removeObserver(C17550rb r2, String str, C22873AxS axS) {
        super.removeObserver(r2, str, axS);
    }

    public native void removeObserverNative(String str);
}
