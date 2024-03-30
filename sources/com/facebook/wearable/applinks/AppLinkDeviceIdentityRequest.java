package com.facebook.wearable.applinks;

import X.AZS;
import X.C172588Ok;
import X.C206199ss;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkDeviceIdentityRequest extends AZS {
    public static final Parcelable.Creator CREATOR = new C206199ss(AppLinkDeviceIdentityRequest.class);
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkDeviceIdentityRequest(C172588Ok r2) {
        this.serviceUUID = r2.serviceUUID_.A06();
    }

    public AppLinkDeviceIdentityRequest() {
    }
}
