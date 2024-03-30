package com.facebook.cameracore.ardelivery.model;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.C163937r0;
import X.C1897595l;
import X.C36381kD;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

public class ARCapabilityMinVersionModeling implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new C163937r0(8);
    public static final long serialVersionUID = 0;
    public VersionedCapability mCapability;
    public int mMinVersion;

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling = (ARCapabilityMinVersionModeling) obj;
            if (!C1897595l.A00(this.mCapability, aRCapabilityMinVersionModeling.mCapability) || !C1897595l.A00(Integer.valueOf(this.mMinVersion), Integer.valueOf(aRCapabilityMinVersionModeling.mMinVersion))) {
                return false;
            }
        }
        return true;
    }

    public int getCapabilityXplatValue() {
        return this.mCapability.getXplatValue();
    }

    public boolean isCapabilityBodyTracking() {
        return C1897595l.A00(this.mCapability, VersionedCapability.BodyTracking);
    }

    public boolean isCapabilityFacetracker() {
        return C1897595l.A00(this.mCapability, VersionedCapability.Facetracker);
    }

    public boolean isCapabilityGazeCorrection() {
        return C1897595l.A00(this.mCapability, VersionedCapability.GazeCorrection);
    }

    public boolean isCapabilityHairSegmentation() {
        return C1897595l.A00(this.mCapability, VersionedCapability.HairSegmentation);
    }

    public boolean isCapabilityHandTracking() {
        return C1897595l.A00(this.mCapability, VersionedCapability.HandTracker);
    }

    public boolean isCapabilitySegmentation() {
        return C1897595l.A00(this.mCapability, VersionedCapability.Segmentation);
    }

    public boolean isCapabilityTargetRecognition() {
        return C1897595l.A00(this.mCapability, VersionedCapability.TargetRecognition);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mCapability.ordinal());
        parcel.writeInt(this.mMinVersion);
    }

    public ARCapabilityMinVersionModeling(Parcel parcel) {
        this.mCapability = VersionedCapability.values()[parcel.readInt()];
        this.mMinVersion = parcel.readInt();
    }

    public VersionedCapability getCapability() {
        return this.mCapability;
    }

    public int getMinVersion() {
        return this.mMinVersion;
    }

    public int hashCode() {
        Object[] A0M = AnonymousClass001.A0M();
        A0M[0] = this.mCapability;
        AnonymousClass000.A1K(A0M, this.mMinVersion);
        return Arrays.hashCode(A0M);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("capability: ");
        A0u.append(this.mCapability);
        A0u.append(", minVersion:");
        return C36381kD.A10(A0u, this.mMinVersion);
    }

    public ARCapabilityMinVersionModeling(int i, int i2) {
        VersionedCapability fromXplatValue = VersionedCapability.fromXplatValue(i);
        Objects.requireNonNull(fromXplatValue);
        this.mCapability = fromXplatValue;
        this.mMinVersion = i2;
    }

    public ARCapabilityMinVersionModeling(VersionedCapability versionedCapability, int i) {
        this.mCapability = versionedCapability;
        this.mMinVersion = i;
    }

    public /* synthetic */ ARCapabilityMinVersionModeling(Parcel parcel, C163937r0 r2) {
        this(parcel);
    }

    public ARCapabilityMinVersionModeling() {
    }
}
