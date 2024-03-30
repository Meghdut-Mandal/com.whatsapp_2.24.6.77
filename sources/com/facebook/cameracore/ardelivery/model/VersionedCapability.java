package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass6YR;
import X.C107965Ro;
import android.util.SparseArray;
import java.util.Locale;
import java.util.Map;

public enum VersionedCapability {
    ;
    
    public static final String TAG = "VersionedCapability";
    public static final Map UPPER_STRING_TO_CAPABILITY_MAP = null;
    public static final SparseArray XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = null;
    public final XplatAssetType mAssetType;
    public final C107965Ro mMLFrameworkType;
    public final int mXplatValue;

    /* access modifiers changed from: public */
    static {
        XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP = new SparseArray(values().length + 1);
        UPPER_STRING_TO_CAPABILITY_MAP = AnonymousClass001.A0J();
        for (VersionedCapability versionedCapability : values()) {
            UPPER_STRING_TO_CAPABILITY_MAP.put(versionedCapability.name().toUpperCase(Locale.US), versionedCapability);
            XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.put(versionedCapability.getXplatValue(), versionedCapability);
        }
    }

    public static VersionedCapability fromServerValue(String str) {
        VersionedCapability versionedCapability = (VersionedCapability) UPPER_STRING_TO_CAPABILITY_MAP.get(str.toUpperCase(Locale.US));
        if (versionedCapability != null) {
            return versionedCapability;
        }
        AnonymousClass6YR.A0H(TAG, "Unsupported capability: %s", AnonymousClass000.A1b(str));
        return null;
    }

    public static VersionedCapability fromXplatValue(int i) {
        return (VersionedCapability) XPLAT_VALUE_TO_VERSIONED_CAPABILITY_MAP.get(i);
    }

    /* access modifiers changed from: public */
    VersionedCapability(C107965Ro r3, int i, XplatAssetType xplatAssetType) {
        this.mMLFrameworkType = r3;
        this.mXplatValue = i;
        this.mAssetType = xplatAssetType;
    }

    public C107965Ro getMLFrameworkType() {
        return this.mMLFrameworkType;
    }

    public XplatAssetType getXplatAssetType() {
        return this.mAssetType;
    }

    public int getXplatValue() {
        return this.mXplatValue;
    }

    public String toServerValue() {
        return name();
    }
}
