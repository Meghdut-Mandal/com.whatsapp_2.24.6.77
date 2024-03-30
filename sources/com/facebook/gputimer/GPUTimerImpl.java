package com.facebook.gputimer;

import X.AnonymousClass000;
import X.AnonymousClass5YL;
import X.AnonymousClass6YR;
import X.C90484aE;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class GPUTimerImpl {
    public static final AnonymousClass5YL Companion = new AnonymousClass5YL();
    public static final Class TAG;
    public final HybridData mHybridData = initHybrid();

    public static final native HybridData initHybrid();

    public native void beginFrame();

    public native void beginMarker(int i);

    public native int createTimerHandle(String str);

    public native void endFrame();

    public native void endMarker();

    static {
        Class<GPUTimerImpl> cls = GPUTimerImpl.class;
        TAG = cls;
        try {
            if (AnonymousClass6YR.A01.BMH(3)) {
                AnonymousClass6YR.A00(cls, StringFormatUtil.formatStrLocaleSafe("Loading library: %s", (Object) "gputimer-jni"));
            }
            SoLoader.A06("gputimer-jni");
            if (AnonymousClass6YR.A01.BMH(3)) {
                AnonymousClass6YR.A00(cls, StringFormatUtil.formatStrLocaleSafe("Successfully loaded: %s", (Object) "gputimer-jni"));
            }
        } catch (UnsatisfiedLinkError e) {
            Object[] A1b = AnonymousClass000.A1b("gputimer-jni");
            if (C90484aE.A1P()) {
                AnonymousClass6YR.A09(cls.getSimpleName(), StringFormatUtil.formatStrLocaleSafe("Failed to load: %s", A1b), e);
            }
        }
    }
}
