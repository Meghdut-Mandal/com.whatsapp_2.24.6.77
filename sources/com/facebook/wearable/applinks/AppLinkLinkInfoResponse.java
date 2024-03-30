package com.facebook.wearable.applinks;

import X.AZS;
import X.AnonymousClass001;
import X.C172818Ph;
import X.C173418Rp;
import X.C206199ss;
import X.C23122B6c;
import android.os.Parcelable;
import java.util.List;
import org.microg.safeparcel.SafeParcelable;

public class AppLinkLinkInfoResponse extends AZS {
    public static final Parcelable.Creator CREATOR = new C206199ss(AppLinkLinkInfoResponse.class);
    @SafeParcelable.Field(subClass = AppLinkLinkAddress.class, value = 1)
    public List addressList;
    @SafeParcelable.Field(7)
    public byte[] buildFlavor;
    @SafeParcelable.Field(5)
    public byte[] deviceImageAssetURI;
    @SafeParcelable.Field(6)
    public byte[] deviceModelName;
    @SafeParcelable.Field(8)
    public byte[] deviceName;
    @SafeParcelable.Field(4)
    public byte[] deviceSerial;
    @SafeParcelable.Field(3)
    public byte[] firmwareVersion;
    @SafeParcelable.Field(9)
    public byte[] hardwareType;

    public AppLinkLinkInfoResponse(C173418Rp r4) {
        C23122B6c<C172818Ph> b6c = r4.addresses_;
        this.addressList = AnonymousClass001.A0I();
        for (C172818Ph appLinkLinkAddress : b6c) {
            this.addressList.add(new AppLinkLinkAddress(appLinkLinkAddress));
        }
        this.firmwareVersion = r4.firmwareVersion_.A06();
        this.deviceSerial = r4.deviceSerial_.A06();
        this.deviceImageAssetURI = r4.deviceImageAssetURI_.A06();
        this.deviceModelName = r4.deviceModelName_.A06();
        this.buildFlavor = r4.buildFlavor_.A06();
        this.deviceName = r4.deviceName_.A06();
        this.hardwareType = r4.hardwareType_.A06();
    }

    public AppLinkLinkInfoResponse() {
    }
}
