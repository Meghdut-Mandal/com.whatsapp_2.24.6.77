package com.facebook.systrace;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass10M;
import X.AnonymousClass10O;
import X.C198819eF;
import X.C201899kg;
import X.C21760zl;
import X.C36331k8;
import android.util.Log;
import com.facebook.common.util.TriState;

public class TraceDirect {
    public static final boolean sForceJavaImpl = "true".equals(C21760zl.A02("debug.fbsystrace.force_java"));
    public static volatile TriState sNativeAvailable = TriState.UNSET;
    public static volatile int sPrevSoLoaderSourcesVersion = -1;
    public static final boolean sTraceLoad = "true".equals(C21760zl.A02("debug.fbsystrace.trace_load"));

    public static native void nativeAsyncTraceBegin(String str, int i, long j);

    public static native void nativeAsyncTraceCancel(String str, int i);

    public static native void nativeAsyncTraceEnd(String str, int i, long j);

    public static native void nativeAsyncTraceRename(String str, String str2, int i);

    public static native void nativeAsyncTraceStageBegin(String str, int i, long j, String str2);

    public static native void nativeBeginSection(String str);

    public static native void nativeBeginSectionWithArgs(String str, String[] strArr, int i);

    public static native void nativeEndAsyncFlow(String str, int i);

    public static native void nativeEndSection();

    public static native void nativeEndSectionWithArgs(String[] strArr, int i);

    public static native void nativeSetEnabledTags(long j);

    public static native void nativeStartAsyncFlow(String str, int i);

    public static native void nativeStepAsyncFlow(String str, int i);

    public static native void nativeTraceCounter(String str, int i);

    public static native void nativeTraceInstant(String str, String str2, char c);

    public static native void nativeTraceMetadata(String str, String str2, int i);

    public static boolean checkNative() {
        boolean A1V;
        int i;
        Exception exc;
        AnonymousClass10M r0;
        if (sNativeAvailable == TriState.UNSET) {
            if (sForceJavaImpl) {
                Log.i("TraceDirect", "Forcing java implementation.");
                sNativeAvailable = TriState.NO;
            } else {
                Class<AnonymousClass10O> cls = AnonymousClass10O.class;
                synchronized (cls) {
                    A1V = AnonymousClass000.A1V(AnonymousClass10O.A00);
                }
                if (A1V) {
                    synchronized (cls) {
                        r0 = AnonymousClass10O.A00;
                        if (r0 == null) {
                            throw AnonymousClass001.A09("NativeLoader has not been initialized.  To use standard native library loading, call NativeLoader.init(new SystemDelegate()).");
                        }
                    }
                    i = r0.BHj();
                } else {
                    i = -1;
                }
                if (i != sPrevSoLoaderSourcesVersion) {
                    sPrevSoLoaderSourcesVersion = i;
                    Object[] A0M = AnonymousClass001.A0M();
                    C36331k8.A1X(A0M, sPrevSoLoaderSourcesVersion, 0, i, 1);
                    String format = String.format("Attempting to load fbsystrace.so [%d|%d].", A0M);
                    if (sTraceLoad) {
                        exc = new Exception();
                    } else {
                        exc = null;
                    }
                    Log.d("TraceDirect", format, exc);
                    try {
                        AnonymousClass10O.A00("fbsystrace");
                        C198819eF r02 = C201899kg.A01;
                        nativeSetEnabledTags(C21760zl.A00("debug.fbsystrace.tags"));
                        nativeBeginSection("fbsystrace.so loaded");
                        nativeEndSection();
                        sNativeAvailable = TriState.YES;
                        Log.i("TraceDirect", "fbsystrace.so loaded.");
                    } catch (UnsatisfiedLinkError unused) {
                        Log.w("TraceDirect", "fbsystrace.so could not be loaded - switching to Java implementation.");
                    }
                }
            }
        }
        if (sNativeAvailable != TriState.YES) {
            return false;
        }
        return true;
    }
}
