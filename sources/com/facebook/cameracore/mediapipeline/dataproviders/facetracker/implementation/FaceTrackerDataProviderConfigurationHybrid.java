package com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation;

import X.AnonymousClass940;
import X.AnonymousClass9MH;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.ServiceConfiguration;
import com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler;
import com.facebook.jni.HybridData;

public final class FaceTrackerDataProviderConfigurationHybrid extends ServiceConfiguration {
    public static final AnonymousClass940 Companion = new AnonymousClass940();
    public final AnonymousClass9MH configuration;

    public static final native HybridData initHybrid(int i, String[] strArr, String[] strArr2, String str, FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler faceTrackerDataProviderConfiguration$FaceTrackerErrorHandler, boolean z, Integer num, Integer num2);

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FaceTrackerDataProviderConfigurationHybrid(X.AnonymousClass9MH r9) {
        /*
            r8 = this;
            java.lang.Integer r0 = r9.A01
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x0024
            r0 = 1
        L_0x0009:
            java.lang.String[] r1 = r9.A04
            X.AnonymousClass00C.A08(r1)
            java.lang.String[] r2 = r9.A03
            X.AnonymousClass00C.A08(r2)
            java.lang.String r3 = r9.A02
            com.facebook.cameracore.mediapipeline.dataproviders.facetracker.interfaces.FaceTrackerDataProviderConfiguration$FaceTrackerErrorHandler r4 = r9.A00
            r6 = 0
            r5 = 0
            r7 = r6
            com.facebook.jni.HybridData r0 = initHybrid(r0, r1, r2, r3, r4, r5, r6, r7)
            r8.<init>(r0)
            r8.configuration = r9
            return
        L_0x0024:
            r0 = 0
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.dataproviders.facetracker.implementation.FaceTrackerDataProviderConfigurationHybrid.<init>(X.9MH):void");
    }
}
