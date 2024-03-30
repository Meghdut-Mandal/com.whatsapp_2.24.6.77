package com.facebook.jni;

import X.AnonymousClass10O;

public class ThreadScopeSupport {
    public static native void runStdFunctionImpl(long j);

    static {
        AnonymousClass10O.A00("fbjni");
    }

    public static void runStdFunction(long j) {
        runStdFunctionImpl(j);
    }
}
