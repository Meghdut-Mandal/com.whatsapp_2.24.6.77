package com.facebook.wearable.applinks;

import X.AZS;
import X.AnonymousClass8QW;
import X.C206199ss;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkLinkInfoRequest extends AZS {
    public static final Parcelable.Creator CREATOR = new C206199ss(AppLinkLinkInfoRequest.class);
    @SafeParcelable.Field(2)
    public int linkType;
    @SafeParcelable.Field(3)
    public int requestType;
    @SafeParcelable.Field(1)
    public byte[] serviceUUID;

    public AppLinkLinkInfoRequest(AnonymousClass8QW r2) {
        this.serviceUUID = r2.serviceUUID_.A06();
        this.linkType = r2.linkType_;
        this.requestType = r2.requestType_;
    }

    public AppLinkLinkInfoRequest() {
    }
}
