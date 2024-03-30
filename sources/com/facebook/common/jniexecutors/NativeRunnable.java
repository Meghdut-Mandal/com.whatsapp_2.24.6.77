package com.facebook.common.jniexecutors;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass10O;
import X.AnonymousClass6YR;
import X.C201899kg;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.jni.HybridData;
import com.facebook.systrace.Systrace;
import java.util.IllegalFormatException;

public class NativeRunnable implements Runnable {
    public HybridData mHybridData;
    public volatile String mNativeExecutor;

    private native void nativeRun();

    static {
        AnonymousClass10O.A00("jniexecutors");
    }

    public void run() {
        String str = "%s";
        String[][] strArr = Systrace.A02;
        if ((32 & C201899kg.A02) != 0) {
            try {
                str = StringFormatUtil.formatStrLocaleSafe(str, (Object) this);
            } catch (IllegalFormatException e) {
                AnonymousClass6YR.A0C("Tracer", "Bad format string", e);
            }
            AnonymousClass00C.A0B(str);
            Systrace.A01(str);
        }
        try {
            nativeRun();
        } finally {
            Systrace.A00();
        }
    }

    public String toString() {
        String str = this.mNativeExecutor;
        if (str == null) {
            return "NativeRunnable";
        }
        return AnonymousClass000.A0p("NativeRunnable - ", str, AnonymousClass000.A0u());
    }

    public NativeRunnable(HybridData hybridData) {
        this.mHybridData = hybridData;
    }
}
