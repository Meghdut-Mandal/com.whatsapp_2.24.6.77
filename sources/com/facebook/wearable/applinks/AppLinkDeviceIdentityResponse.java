package com.facebook.wearable.applinks;

import X.AZS;
import X.AnonymousClass8QV;
import X.C206199ss;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkDeviceIdentityResponse extends AZS {
    public static final Parcelable.Creator CREATOR = new C206199ss(AppLinkDeviceIdentityResponse.class);
    @SafeParcelable.Field(2)
    public byte[] devicePublicKey;
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkDeviceIdentityResponse(AnonymousClass8QV r2) {
        this.serviceUUID = r2.serviceUUID_.A06();
        this.devicePublicKey = r2.devicePublicKey_.A06();
    }

    public AppLinkDeviceIdentityResponse() {
    }
}
