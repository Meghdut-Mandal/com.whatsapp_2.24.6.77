package com.facebook.msys.mci;

import X.AnonymousClass00h;
import X.C000600g;
import java.lang.reflect.Method;

public class JsonSerialization {
    public static boolean sInitialized;

    public static native void nativeInitialize();

    public static synchronized boolean initialize() {
        boolean z;
        synchronized (JsonSerialization.class) {
            Method method = C000600g.A03;
            AnonymousClass00h.A01("JsonSerialization.initialize");
            try {
                if (sInitialized) {
                    z = false;
                } else {
                    nativeInitialize();
                    z = true;
                    sInitialized = true;
                }
            } finally {
                AnonymousClass00h.A00();
            }
        }
        return z;
    }

    public static boolean isMCPEnabledForJsonSerialization() {
        return false;
    }
}
