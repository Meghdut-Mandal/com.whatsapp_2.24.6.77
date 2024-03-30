package com.facebook.hybridlogsink;

import X.C196309Yt;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class HybridLogSink {
    public static final C196309Yt Companion = new C196309Yt();
    public final HybridData mHybridData = initHybrid(1000);

    public static final native HybridData initHybrid(int i);

    public final native String[] getLogMessages();

    static {
        SoLoader.A06("hybridlogsinkjni");
    }
}
