package com.facebook.cameracore.logging.spars.xplatimpl;

import X.AnonymousClass00C;
import X.C113985gS;
import X.C165567td;
import X.C1894593w;
import X.C22776Avm;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import java.util.List;

public final class XplatSparsLogger {
    public static final C1894593w Companion = new C1894593w();
    public final HybridData mHybridData = initHybrid();

    public static final native boolean consistencyHelperHasError();

    public static final native int consistencyHelperNumProcessedSessions();

    public static final native void debugExpectSessionOpen(String str);

    public static final native void flushAndDestroyConsistencyHelper();

    public static final native void flushConsistencyHelper();

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid();

    public static final XplatSparsLogger makeInstance(C22776Avm avm) {
        AnonymousClass00C.A0D(avm, 0);
        return new XplatSparsLogger(new XplatRawEventLogger(avm));
    }

    public void logSessionClosure(String str, boolean z) {
        AnonymousClass00C.A0D(str, 0);
        logSessionClosureNative(str, z);
    }

    public final native void logSessionClosureNative(String str, boolean z);

    public void logSessionCreation(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        C165567td.A1K(str, str2, str3);
        AnonymousClass00C.A0D(str5, 4);
        String str7 = str6;
        AnonymousClass00C.A0D(str7, 6);
        List list = C113985gS.A00;
        logSessionCreationNative("unknown", str, str2, str3, str4, str5, z, str7);
    }

    public final native void logSessionCreationNative(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7);

    public final native void setRawEventLogger(XplatRawEventLogger xplatRawEventLogger);

    static {
        SoLoader.A06("camera-xplat-spars-jni");
    }

    public XplatSparsLogger(XplatRawEventLogger xplatRawEventLogger) {
        setRawEventLogger(xplatRawEventLogger);
    }

    public XplatSparsLogger() {
    }

    public static final XplatSparsLogger makeInstance(XplatRawEventLogger xplatRawEventLogger) {
        XplatSparsLogger xplatSparsLogger;
        if (xplatRawEventLogger != null) {
            return xplatSparsLogger;
        }
        xplatSparsLogger = new XplatSparsLogger();
        return xplatSparsLogger;
    }

    public static final XplatSparsLogger makeInstance() {
        return new XplatSparsLogger();
    }
}
