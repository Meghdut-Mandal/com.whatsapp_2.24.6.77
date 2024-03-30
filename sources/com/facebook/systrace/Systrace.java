package com.facebook.systrace;

import X.AnonymousClass000;
import X.AnonymousClass9TR;
import X.AnonymousClass9Z0;
import X.C129846Ir;
import X.C196559a3;
import X.C197049b3;
import X.C198819eF;
import X.C201899kg;
import X.C21845AbN;
import android.os.Build;
import android.os.Process;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class Systrace {
    public static final ThreadLocal A00 = new C21845AbN();
    public static final AtomicInteger A01 = new AtomicInteger();
    public static final String[][] A02 = {new String[]{"com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onActivate", "com.facebook.common.fury.FBSystraceReqContextLifecycleCallbacks.onDeactivate"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.pluginMarkerEnd"}, new String[]{"com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsStart", "com.facebook.common.plugins.fblogging.FbPluginsLogger.onSocketGetPluginsEnd"}};

    static {
        C198819eF r0 = C201899kg.A01;
        if (C197049b3.A03) {
            Method method = C197049b3.A02;
            if (method != null) {
                Object[] objArr = new Object[1];
                AnonymousClass000.A1N(objArr, 0, true);
                C197049b3.A00(method, objArr);
            } else {
                throw new AssertionError();
            }
        }
        C201899kg.A00(false);
        AnonymousClass9Z0 r02 = AnonymousClass9Z0.$redex_init_class;
    }

    public static void A00() {
        if (Build.VERSION.SDK_INT >= 30) {
            C196559a3.A00();
        }
        if ((32 & C201899kg.A02) == 0) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeEndSection();
        } else {
            C129846Ir.A00("E");
        }
    }

    public static void A01(String str) {
        if (Build.VERSION.SDK_INT >= 30) {
            C196559a3.A00();
        }
        if ((32 & C201899kg.A02) == 0) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeBeginSection(str);
            return;
        }
        FileOutputStream fileOutputStream = C129846Ir.A00;
        AnonymousClass9TR r3 = new AnonymousClass9TR('B');
        int myPid = Process.myPid();
        StringBuilder sb = r3.A00;
        sb.append('|');
        sb.append(myPid);
        r3.A00(str);
        C129846Ir.A00(r3.toString());
    }

    public static void A02(String str, int i, String str2) {
        if (Build.VERSION.SDK_INT >= 30) {
            C196559a3.A00();
        }
        if ((64 & C201899kg.A02) == 0) {
            return;
        }
        if (TraceDirect.checkNative()) {
            TraceDirect.nativeTraceMetadata(str, str2, i);
            return;
        }
        FileOutputStream fileOutputStream = C129846Ir.A00;
        AnonymousClass9TR r3 = new AnonymousClass9TR('M');
        int myPid = Process.myPid();
        StringBuilder sb = r3.A00;
        sb.append('|');
        sb.append(myPid);
        r3.A00(str);
        sb.append('|');
        sb.append(i);
        r3.A00(str2);
        C129846Ir.A00(r3.toString());
    }
}
