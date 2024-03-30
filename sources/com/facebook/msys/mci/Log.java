package com.facebook.msys.mci;

import X.AnonymousClass00h;
import X.C000600g;
import X.C1891192h;
import java.lang.reflect.Method;

public class Log {
    public static boolean sRegistered;

    public static int getWaLogLevel(int i) {
        if (i == 2) {
            return 5;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 7 ? 1 : 0;
        }
        return 2;
    }

    public static native void registerLoggerNative(long j, int i, boolean z, int i2);

    public static native void setLogLevel(int i);

    public static synchronized boolean registerLogger(C1891192h r2) {
        synchronized (Log.class) {
            Method method = C000600g.A03;
            AnonymousClass00h.A01("registerLogger");
            try {
                if (!sRegistered) {
                    throw new NullPointerException("loggingCategories");
                }
            } finally {
                AnonymousClass00h.A00();
            }
        }
        return false;
    }

    public static void log(int i, String str) {
        int waLogLevel = getWaLogLevel(i);
        StringBuilder sb = new StringBuilder();
        sb.append("wamsys/");
        sb.append(str);
        com.whatsapp.util.Log.log(waLogLevel, sb.toString());
    }
}
