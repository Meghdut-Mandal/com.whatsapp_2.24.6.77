package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CY  reason: invalid class name */
public class AnonymousClass8CY extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204969qr();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public AnonymousClass8CY(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.A01 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = str4;
        this.A03 = str5;
        this.A02 = str6;
        this.A06 = str7;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        boolean A062 = C10440eF.A06(parcel, this.A01);
        AnonymousClass0Z9.A0C(parcel, this.A05, 3, A062);
        AnonymousClass0Z9.A0C(parcel, this.A04, 4, A062);
        AnonymousClass0Z9.A0C(parcel, this.A00, 5, A062);
        AnonymousClass0Z9.A0C(parcel, this.A03, 6, A062);
        AnonymousClass0Z9.A0C(parcel, this.A02, 7, A062);
        AnonymousClass0Z9.A0C(parcel, this.A06, 8, A062);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8CY() {
    }
}
