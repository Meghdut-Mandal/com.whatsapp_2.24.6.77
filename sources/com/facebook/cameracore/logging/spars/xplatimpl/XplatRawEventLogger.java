package com.facebook.cameracore.logging.spars.xplatimpl;

import X.AnonymousClass00C;
import X.C1894493v;
import X.C22776Avm;
import X.C36321k7;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class XplatRawEventLogger {
    public static final C1894493v Companion = new C1894493v();
    public final C22776Avm logWriter;
    public final HybridData mHybridData = initHybrid();

    public XplatRawEventLogger(C22776Avm avm) {
        AnonymousClass00C.A0D(avm, 1);
        this.logWriter = avm;
    }

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    private final native HybridData initHybrid();

    static {
        SoLoader.A06("camera-xplat-spars-jni");
    }

    public final void logEvent(String str, String str2) {
        C36321k7.A0w(str, str2);
    }
}
