package com.facebook.cameracore.mediapipeline.services.avatars;

import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;

public class AvatarsDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static native HybridData initHybrid(String str, String str2, int i, AvatarsDataProviderDelegateBridge avatarsDataProviderDelegateBridge, AvatarsNativeInputDelegate avatarsNativeInputDelegate);

    static {
        SoLoader.A06("avatarsdataprovider");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AvatarsDataProviderConfigurationHybrid(X.AnonymousClass843 r6) {
        /*
            r5 = this;
            java.lang.String r4 = r6.A02
            java.lang.String r3 = ""
            if (r4 != 0) goto L_0x0007
            r4 = r3
        L_0x0007:
            java.lang.String r0 = r6.A01
            if (r0 == 0) goto L_0x000c
            r3 = r0
        L_0x000c:
            r2 = 3
            X.5mv r0 = r6.A00
            com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderDelegateBridge r1 = new com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderDelegateBridge
            r1.<init>(r0)
            com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate r0 = new com.facebook.cameracore.mediapipeline.services.avatars.AvatarsNativeInputDelegate
            r0.<init>()
            com.facebook.jni.HybridData r0 = initHybrid(r4, r3, r2, r1, r0)
            r5.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.avatars.AvatarsDataProviderConfigurationHybrid.<init>(X.843):void");
    }
}
