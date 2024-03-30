package com.facebook.wearable.applinks;

import X.AZS;
import X.C206199ss;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkDeviceStateResponse extends AZS {
    public static final Parcelable.Creator CREATOR = new C206199ss(AppLinkDeviceStateResponse.class);
    @SafeParcelable.Field(2)
    public AppLinkDeviceConnectionStatus deviceConnectionStatus;
    @SafeParcelable.Field(3)
    public AppLinkDeviceHardwareState deviceHardwareState;
    @SafeParcelable.Field(4)
    public AppLinkDevicePeakPowerState devicePeakPowerState;
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
    }

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus, AppLinkDeviceHardwareState appLinkDeviceHardwareState, AppLinkDevicePeakPowerState appLinkDevicePeakPowerState) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
        this.deviceHardwareState = appLinkDeviceHardwareState;
        this.devicePeakPowerState = appLinkDevicePeakPowerState;
    }

    public AppLinkDeviceStateResponse(byte[] bArr, AppLinkDeviceConnectionStatus appLinkDeviceConnectionStatus, AppLinkDeviceHardwareState appLinkDeviceHardwareState) {
        this.serviceUUID = bArr;
        this.deviceConnectionStatus = appLinkDeviceConnectionStatus;
        this.deviceHardwareState = appLinkDeviceHardwareState;
    }

    public AppLinkDeviceStateResponse() {
    }
}
