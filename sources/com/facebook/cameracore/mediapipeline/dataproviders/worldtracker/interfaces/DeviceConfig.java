package com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces;

import X.AnonymousClass000;
import X.C165567td;
import X.C206309t6;
import X.C23179B8n;
import X.C36411kG;
import android.os.Parcel;
import android.os.Parcelable;

public class DeviceConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = C23179B8n.A00(35);
    public final double attitudeTimeDelay;
    public final double imuFromLandscapeCameraX;
    public final double imuFromLandscapeCameraY;
    public final double imuFromLandscapeCameraZ;
    public final boolean isCalibratedDeviceConfig;
    public final boolean isSlamCapable;
    public C206309t6 mCameraConfig;
    public final boolean skipAttitudeInput;
    public final String slamConfigurationParams;
    public final boolean useVisionOnlySlam;

    public int describeContents() {
        return 0;
    }

    public double getCameraDistortion1() {
        return this.mCameraConfig.A00;
    }

    public double getCameraDistortion2() {
        return this.mCameraConfig.A01;
    }

    public double getCameraFocalLength() {
        return this.mCameraConfig.A02;
    }

    public double getCameraPrincipalPointX() {
        return this.mCameraConfig.A03;
    }

    public double getCameraPrincipalPointY() {
        return this.mCameraConfig.A04;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeDouble(this.imuFromLandscapeCameraX);
        parcel.writeDouble(this.imuFromLandscapeCameraY);
        parcel.writeDouble(this.imuFromLandscapeCameraZ);
        parcel.writeByte(this.skipAttitudeInput ? (byte) 1 : 0);
        parcel.writeDouble(this.attitudeTimeDelay);
        parcel.writeByte(this.useVisionOnlySlam ? (byte) 1 : 0);
        parcel.writeByte(this.isSlamCapable ? (byte) 1 : 0);
        parcel.writeString(this.slamConfigurationParams);
        parcel.writeParcelable(this.mCameraConfig, i);
        parcel.writeByte(this.isCalibratedDeviceConfig ? (byte) 1 : 0);
    }

    public DeviceConfig(Parcel parcel) {
        this.imuFromLandscapeCameraX = parcel.readDouble();
        this.imuFromLandscapeCameraY = parcel.readDouble();
        this.imuFromLandscapeCameraZ = parcel.readDouble();
        boolean z = true;
        this.skipAttitudeInput = AnonymousClass000.A1P(parcel.readByte());
        this.attitudeTimeDelay = parcel.readDouble();
        this.useVisionOnlySlam = C165567td.A1Y(parcel);
        this.isSlamCapable = C165567td.A1Y(parcel);
        this.slamConfigurationParams = parcel.readString();
        this.mCameraConfig = (C206309t6) C36411kG.A0H(parcel, C206309t6.class);
        this.isCalibratedDeviceConfig = parcel.readByte() == 0 ? false : z;
    }

    public C206309t6 getCameraConfig() {
        return this.mCameraConfig;
    }
}
