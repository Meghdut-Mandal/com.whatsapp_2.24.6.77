package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6YR;
import X.C108425Tl;
import X.C36431kI;
import X.C90464aC;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.HashMap;
import java.util.Map;

public class ModelPathsHolder {
    public static final String TAG = "ModelPathsHolder";
    public static final int UNKNOWN_VERSION = -1;
    public final VersionedCapability mCapability;
    public final Map mModelPaths;
    public final int mVersion;

    public String getModelPath(C108425Tl r5) {
        String A1A = C36431kI.A1A(r5, this.mModelPaths);
        if (A1A == null) {
            AnonymousClass6YR.A08(TAG, StringFormatUtil.formatStrLocaleSafe("Failed to get model path for model asset type: %s, for capability: %s", r5.name(), this.mCapability.name()));
        }
        return A1A;
    }

    public boolean modelPathsExists(C108425Tl r2) {
        return this.mModelPaths.containsKey(r2);
    }

    public ModelPathsHolder(VersionedCapability versionedCapability, int i, Map map) {
        this.mCapability = versionedCapability;
        this.mVersion = i;
        this.mModelPaths = map;
    }

    public static ModelPathsHolder create(int i, int i2, int[] iArr, String[] strArr) {
        HashMap A0J = AnonymousClass001.A0J();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            A0J.put(C108425Tl.values()[iArr[i3]], strArr[i3]);
        }
        return new ModelPathsHolder(VersionedCapability.fromXplatValue(i), i2, A0J);
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getVersion() {
        return this.mVersion;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ModelPathsHolder{mCapability=");
        A0u.append(this.mCapability);
        A0u.append(", mVersion=");
        A0u.append(this.mVersion);
        A0u.append(", mModelPaths=");
        return C90464aC.A0X(this.mModelPaths, A0u);
    }
}
