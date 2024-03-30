package com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common;

import X.AnonymousClass00C;
import X.C111595cX;
import com.facebook.cameracore.mediapipeline.services.experimentconfig.interfaces.ARExperimentConfig;
import com.facebook.jni.HybridData;

public final class ARExperimentConfigImpl extends ARExperimentConfig {
    public final C111595cX arExperimentUtil;

    private final native HybridData initHybrid();

    public String getString(int i, String str) {
        AnonymousClass00C.A0D(str, 1);
        return str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getBool(int r3, boolean r4) {
        /*
            r2 = this;
            X.5cX r0 = r2.arExperimentUtil
            if (r0 == 0) goto L_0x000f
            if (r3 < 0) goto L_0x0010
            X.8y8[] r1 = X.C190959Az.A00
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0010
            r0 = r1[r3]
            if (r0 != 0) goto L_0x0012
        L_0x000f:
            return r4
        L_0x0010:
            X.8y8 r0 = X.C187578y8.A01
        L_0x0012:
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x001e
            r0 = 129(0x81, float:1.81E-43)
            if (r1 == r0) goto L_0x001e
            return r4
        L_0x001e:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl.getBool(int, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        if (r0 == null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getBoolWithoutLogging(int r3, boolean r4) {
        /*
            r2 = this;
            X.5cX r0 = r2.arExperimentUtil
            if (r0 == 0) goto L_0x000f
            if (r3 < 0) goto L_0x0010
            X.8y8[] r1 = X.C190959Az.A00
            int r0 = r1.length
            if (r3 >= r0) goto L_0x0010
            r0 = r1[r3]
            if (r0 != 0) goto L_0x0012
        L_0x000f:
            return r4
        L_0x0010:
            X.8y8 r0 = X.C187578y8.A01
        L_0x0012:
            int r1 = r0.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x001e
            r0 = 129(0x81, float:1.81E-43)
            if (r1 == r0) goto L_0x001e
            return r4
        L_0x001e:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.common.ARExperimentConfigImpl.getBoolWithoutLogging(int, boolean):boolean");
    }

    public ARExperimentConfigImpl(C111595cX r2) {
        this.mHybridData = initHybrid();
        this.arExperimentUtil = r2;
    }

    public double getDouble(int i, double d) {
        return d;
    }

    public long getLong(int i, long j) {
        return j;
    }

    public ARExperimentConfigImpl() {
        this((C111595cX) null);
    }
}
