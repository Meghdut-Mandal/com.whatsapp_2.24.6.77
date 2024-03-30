package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kt  reason: invalid class name and case insensitive filesystem */
public final class C04470Kt extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C08640b4();
    public String A00;
    public final int A01;

    public C04470Kt(int i, String str) {
        this.A01 = i;
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A08(parcel, 1, this.A01);
        C10440eF.A04(parcel, this.A00, A002);
    }

    public C04470Kt() {
        this.A01 = 1;
    }
}
