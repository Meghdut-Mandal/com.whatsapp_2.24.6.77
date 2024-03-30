package com.facebook.wearable.applinks;

import X.AZS;
import X.C172598Ol;
import X.C206199ss;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkRegisterRequest extends AZS {
    public static final Parcelable.Creator CREATOR = new C206199ss(AppLinkRegisterRequest.class);
    @SafeParcelable.Field(1)
    public byte[] appPublicKey;

    public AppLinkRegisterRequest(C172598Ol r2) {
        this.appPublicKey = r2.appPublicKey_.A06();
    }

    public AppLinkRegisterRequest() {
    }
}
