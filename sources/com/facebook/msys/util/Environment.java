package com.facebook.msys.util;

import X.C18740tg;

public class Environment {
    public static native synchronized boolean setenvNative(String str, String str2, boolean z);

    public static boolean setenv(String str, String str2, boolean z) {
        C18740tg.A06(str);
        C18740tg.A06(str2);
        return setenvNative(str, str2, z);
    }

    public static boolean setenv(String str, String str2) {
        return setenv(str, str2, true);
    }
}
