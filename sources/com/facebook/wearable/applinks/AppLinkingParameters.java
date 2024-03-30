package com.facebook.wearable.applinks;

import X.AZS;
import X.C206199ss;
import android.os.ParcelUuid;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkingParameters extends AZS {
    public static final Parcelable.Creator CREATOR = new C206199ss(AppLinkingParameters.class);
    @SafeParcelable.Field(3)
    public byte[] devicePublicKey;
    @SafeParcelable.Field(2)
    public byte[] linkedAppPrivateKey;
    @SafeParcelable.Field(1)
    public ParcelUuid serviceUUID;

    public AppLinkingParameters(ParcelUuid parcelUuid, byte[] bArr, byte[] bArr2) {
        this.serviceUUID = parcelUuid;
        this.linkedAppPrivateKey = bArr;
        this.devicePublicKey = bArr2;
    }

    public AppLinkingParameters() {
    }
}
