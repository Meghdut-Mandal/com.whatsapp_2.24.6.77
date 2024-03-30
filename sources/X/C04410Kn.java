package X;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kn  reason: invalid class name and case insensitive filesystem */
public final class C04410Kn extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07940Zw();
    public final Uri A00;
    public final C04450Kr A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public boolean equals(Object obj) {
        if (obj instanceof C04410Kn) {
            C04410Kn r4 = (C04410Kn) obj;
            if (!AnonymousClass0QM.A00(this.A02, r4.A02) || !AnonymousClass0QM.A00(this.A03, r4.A03) || !AnonymousClass0QM.A00(this.A04, r4.A04) || !AnonymousClass0QM.A00(this.A05, r4.A05) || !AnonymousClass0QM.A00(this.A00, r4.A00) || !AnonymousClass0QM.A00(this.A06, r4.A06) || !AnonymousClass0QM.A00(this.A07, r4.A07) || !AnonymousClass0QM.A00(this.A08, r4.A08) || !AnonymousClass0QM.A00(this.A01, r4.A01)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A02;
        objArr[1] = this.A03;
        objArr[2] = this.A04;
        objArr[3] = this.A05;
        objArr[4] = this.A00;
        objArr[5] = this.A06;
        objArr[6] = this.A07;
        objArr[7] = this.A08;
        return AnonymousClass000.A0M(this.A01, objArr, 8);
    }

    public C04410Kn(Uri uri, C04450Kr r2, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        AnonymousClass006.A03(str);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A05 = str4;
        this.A00 = uri;
        this.A06 = str5;
        this.A07 = str6;
        this.A08 = str7;
        this.A01 = r2;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A02, 1, false);
        AnonymousClass0Z9.A0C(parcel, this.A03, 2, false);
        AnonymousClass0Z9.A0C(parcel, this.A04, 3, false);
        AnonymousClass0Z9.A0C(parcel, this.A05, 4, false);
        AnonymousClass0Z9.A0B(parcel, this.A00, 5, i, false);
        AnonymousClass0Z9.A0C(parcel, this.A06, 6, false);
        AnonymousClass0Z9.A0C(parcel, this.A07, 7, false);
        AnonymousClass0Z9.A0C(parcel, this.A08, 8, false);
        AnonymousClass0Z9.A0B(parcel, this.A01, 9, i, false);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
