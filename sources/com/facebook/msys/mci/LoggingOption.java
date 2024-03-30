package com.facebook.msys.mci;

import com.facebook.simplejni.NativeHolder;

public class LoggingOption {
    public final NativeHolder mNativeHolder;

    public static native NativeHolder initNativeHolder(Integer num, TraceInfo traceInfo, Number number, String str, String str2, PrivacyContext privacyContext, boolean z, Number number2);

    private native boolean nativeEquals(Object obj);

    public native Number getInstanceId();

    public native Number getLocalDataId();

    public native Integer getMessageSource();

    public native String getNavigationChain();

    public native PrivacyContext getPrivacyContext();

    public native String getSendAttribution();

    public native boolean getShouldStartHealthReport();

    public native TraceInfo getTraceInfo();

    public native int hashCode();

    public native String toString();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof LoggingOption)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public LoggingOption(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public LoggingOption(Integer num, TraceInfo traceInfo, Number number, String str, String str2, PrivacyContext privacyContext, boolean z, Number number2) {
        this.mNativeHolder = initNativeHolder(num, traceInfo, number, str, str2, privacyContext, z, number2);
    }
}
