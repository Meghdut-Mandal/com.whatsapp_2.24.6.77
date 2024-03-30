package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Ca  reason: invalid class name and case insensitive filesystem */
public class C170118Ca extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204959qq();
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;

    public C170118Ca(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
        this.A05 = str;
        this.A07 = str2;
        this.A0D = str3;
        this.A0B = str4;
        this.A08 = str5;
        this.A02 = str6;
        this.A00 = str7;
        this.A01 = str8;
        this.A03 = str9;
        this.A0C = str10;
        this.A09 = str11;
        this.A06 = str12;
        this.A04 = str13;
        this.A0A = str14;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        boolean A062 = C10440eF.A06(parcel, this.A05);
        AnonymousClass0Z9.A0C(parcel, this.A07, 3, A062);
        AnonymousClass0Z9.A0C(parcel, this.A0D, 4, A062);
        AnonymousClass0Z9.A0C(parcel, this.A0B, 5, A062);
        AnonymousClass0Z9.A0C(parcel, this.A08, 6, A062);
        AnonymousClass0Z9.A0C(parcel, this.A02, 7, A062);
        AnonymousClass0Z9.A0C(parcel, this.A00, 8, A062);
        AnonymousClass0Z9.A0C(parcel, this.A01, 9, A062);
        AnonymousClass0Z9.A0C(parcel, this.A03, 10, A062);
        AnonymousClass0Z9.A0C(parcel, this.A0C, 11, A062);
        AnonymousClass0Z9.A0C(parcel, this.A09, 12, A062);
        AnonymousClass0Z9.A0C(parcel, this.A06, 13, A062);
        AnonymousClass0Z9.A0C(parcel, this.A04, 14, A062);
        AnonymousClass0Z9.A0C(parcel, this.A0A, 15, A062);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public C170118Ca() {
    }
}
