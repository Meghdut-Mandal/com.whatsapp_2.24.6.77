package com.facebook.wearable.applinks;

import X.AZS;
import X.C172818Ph;
import X.C1888090u;
import X.C206199ss;
import android.os.Parcelable;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkLinkAddress extends AZS {
    public static final Parcelable.Creator CREATOR = new C206199ss(AppLinkLinkAddress.class);
    @SafeParcelable.Field(2)
    public String address;
    @SafeParcelable.Field(1)
    public int addressType;

    public AppLinkLinkAddress(C172818Ph r3) {
        C1888090u r0;
        this.address = r3.data_.A04();
        int i = r3.addressType_;
        if (i == 0) {
            r0 = C1888090u.EMPTY;
        } else if (i == 1) {
            r0 = C1888090u.IPV4;
        } else if (i == 2) {
            r0 = C1888090u.IPV6;
        } else if (i != 3) {
            r0 = C1888090u.UNRECOGNIZED;
        } else {
            r0 = C1888090u.BTC;
        }
        this.addressType = r0.BEY();
    }

    public AppLinkLinkAddress() {
    }
}
