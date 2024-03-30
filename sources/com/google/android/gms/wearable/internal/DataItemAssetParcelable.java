package com.google.android.gms.wearable.internal;

import X.AnonymousClass000;
import X.AnonymousClass006;
import X.AnonymousClass0Z9;
import X.C10440eF;
import X.C165567td;
import X.C205109r7;
import X.C22813AwO;
import X.C90504aG;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.ReflectedParcelable;

@KeepName
public class DataItemAssetParcelable extends C10440eF implements ReflectedParcelable, C22813AwO {
    public static final Parcelable.Creator CREATOR = new C205109r7();
    public final String A00;
    public final String A01;

    public DataItemAssetParcelable(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("DataItemAssetParcelable[@");
        C90504aG.A0z(hashCode(), A0u);
        String str = this.A00;
        if (str == null) {
            A0u.append(",noid");
        } else {
            A0u.append(",");
            A0u.append(str);
        }
        A0u.append(", key=");
        return C165567td.A0Y(this.A01, A0u);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, C10440eF.A06(parcel, this.A00));
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public DataItemAssetParcelable(C22813AwO awO) {
        DataItemAssetParcelable dataItemAssetParcelable = (DataItemAssetParcelable) awO;
        String str = dataItemAssetParcelable.A00;
        AnonymousClass006.A01(str);
        this.A00 = str;
        String str2 = dataItemAssetParcelable.A01;
        AnonymousClass006.A01(str2);
        this.A01 = str2;
    }
}
