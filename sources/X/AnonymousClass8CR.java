package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CR  reason: invalid class name */
public class AnonymousClass8CR extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205019qw();
    public String A00;
    public String A01;

    public AnonymousClass8CR(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, C10440eF.A06(parcel, this.A00));
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8CR() {
    }
}
