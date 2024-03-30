package com.facebook.jni;

import X.AnonymousClass000;
import X.AnonymousClass10O;
import X.AnonymousClass10W;

public class HybridData {
    public final Destructor mDestructor = new Destructor(this);

    public class Destructor extends AnonymousClass10W {
        public volatile long mNativePointer;

        public static native void deleteNative(long j);

        public final void destruct() {
            deleteNative(this.mNativePointer);
            this.mNativePointer = 0;
        }

        public Destructor(Object obj) {
            super(obj);
        }
    }

    public synchronized void resetNative() {
        this.mDestructor.destruct();
    }

    static {
        AnonymousClass10O.A00("fbjni");
    }

    public boolean isValid() {
        return AnonymousClass000.A1P((this.mDestructor.mNativePointer > 0 ? 1 : (this.mDestructor.mNativePointer == 0 ? 0 : -1)));
    }
}
