package com.facebook.cameracore.musiceffect;

import X.AnonymousClass948;
import android.os.Build;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public final class AudioServiceConfigurationAnnouncer {
    public static final AnonymousClass948 Companion = new AnonymousClass948();
    public HybridData mHybridData;

    private final native boolean announce(String str, String str2, String str3, String str4, long j, long j2, String str5);

    public static final native HybridData initHybrid();

    public final native float audioClipProgress();

    public final native boolean pause();

    public final native boolean resume();

    static {
        SoLoader.A06("musiceffect-native");
    }

    public AudioServiceConfigurationAnnouncer() {
        if (!"robolectric".equals(Build.FINGERPRINT)) {
            this.mHybridData = initHybrid();
        }
    }
}
