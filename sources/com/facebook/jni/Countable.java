package com.facebook.jni;

import X.AnonymousClass10O;

public class Countable {
    public long mInstance = 0;

    public native void dispose();

    static {
        AnonymousClass10O.A00("fb");
    }

    public void finalize() {
        dispose();
        super.finalize();
    }
}
