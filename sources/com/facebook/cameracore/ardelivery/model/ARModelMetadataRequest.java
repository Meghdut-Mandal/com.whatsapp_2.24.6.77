package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.C36381kD;

public class ARModelMetadataRequest {
    public VersionedCapability mCapability;
    public boolean mForceDownload;
    public boolean mIsMinVersionTranslatedToNmlml;
    public int mMinVersion;
    public int mPreferredVersion;
    public int mRequestId;

    public ARModelMetadataRequest(int i, int i2, int i3) {
        this(VersionedCapability.fromXplatValue(i), i2, i2, false);
        this.mRequestId = i3;
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public boolean getForceDownloadFlag() {
        return this.mForceDownload;
    }

    public boolean getIsMinVersionTranslatedToNmlmlFlag() {
        return this.mIsMinVersionTranslatedToNmlml;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int getPreferredVersion() {
        return this.mPreferredVersion;
    }

    public int getRequestId() {
        return this.mRequestId;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(this.mCapability);
        A0u.append("-");
        A0u.append(this.mMinVersion);
        A0u.append("-");
        return C36381kD.A10(A0u, this.mPreferredVersion);
    }

    public ARModelMetadataRequest(VersionedCapability versionedCapability, int i, int i2, boolean z) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
        this.mPreferredVersion = i2;
        this.mForceDownload = z;
        this.mIsMinVersionTranslatedToNmlml = false;
    }

    public ARModelMetadataRequest(VersionedCapability versionedCapability, int i, int i2, boolean z, boolean z2) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
        this.mPreferredVersion = i2;
        this.mForceDownload = z;
        this.mIsMinVersionTranslatedToNmlml = z2;
    }
}
