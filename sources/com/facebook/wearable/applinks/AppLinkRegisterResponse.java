package com.facebook.wearable.applinks;

import X.AZS;
import X.C172828Pi;
import X.C206199ss;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkRegisterResponse extends AZS {
    public static final Parcelable.Creator CREATOR = new C206199ss(AppLinkRegisterResponse.class);
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkRegisterResponse(C172828Pi r2) {
        this.serviceUUID = r2.serviceUUID_.A06();
    }

    public AppLinkRegisterResponse() {
    }
}
