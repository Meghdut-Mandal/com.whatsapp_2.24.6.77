package com.facebook.cameracore.ardelivery.networkconsentmanager.impl;

import X.AnonymousClass5T7;
import X.C1894093q;
import X.C36321k7;
import com.facebook.cameracore.ardelivery.networkconsentmanager.interfaces.NetworkConsentStorage;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.common.util.TriState;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class NetworkConsentManagerJNI {
    public static final C1894093q Companion = new C1894093q();
    public final HybridData mHybridData;

    public static /* synthetic */ void getMHybridData$annotations() {
    }

    public static final native HybridData initHybrid(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger);

    private final native void setUserConsent(String str, boolean z, int i);

    public native TriState hasUserAllowedNetworking(String str);

    public void setUserConsent(String str, boolean z, AnonymousClass5T7 r4) {
        C36321k7.A0v(str, 0, r4);
        setUserConsent(str, z, r4.mCppValue);
    }

    static {
        SoLoader.A06("ard-android-network-consent-manager-impl");
    }

    public NetworkConsentManagerJNI(NetworkConsentStorage networkConsentStorage, AnalyticsLogger analyticsLogger) {
        C36321k7.A0x(networkConsentStorage, analyticsLogger);
        this.mHybridData = initHybrid(networkConsentStorage, analyticsLogger);
    }
}
