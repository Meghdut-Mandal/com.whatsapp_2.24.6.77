package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8CW  reason: invalid class name */
public class AnonymousClass8CW extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204939qo();
    public AnonymousClass8CZ A00;
    public AnonymousClass8CZ A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;

    public AnonymousClass8CW(AnonymousClass8CZ r1, AnonymousClass8CZ r2, String str, String str2, String str3, String str4, String str5) {
        this.A06 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = str5;
        this.A01 = r1;
        this.A00 = r2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        boolean A062 = C10440eF.A06(parcel, this.A06);
        AnonymousClass0Z9.A0C(parcel, this.A02, 3, A062);
        AnonymousClass0Z9.A0C(parcel, this.A03, 4, A062);
        AnonymousClass0Z9.A0C(parcel, this.A04, 5, A062);
        AnonymousClass0Z9.A0C(parcel, this.A05, 6, A062);
        AnonymousClass0Z9.A0B(parcel, this.A01, 7, i, A062);
        AnonymousClass0Z9.A0B(parcel, this.A00, 8, i, A062);
        AnonymousClass0Z9.A07(parcel, A002);
    }

    public AnonymousClass8CW() {
    }
}
