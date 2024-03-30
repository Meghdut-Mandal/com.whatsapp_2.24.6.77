package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.0Kk  reason: invalid class name and case insensitive filesystem */
public class C04380Kk extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C07870Zp();
    public final int A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final boolean A05;

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        objArr[2] = this.A04;
        objArr[3] = Boolean.valueOf(this.A05);
        return AnonymousClass000.A0M(Integer.valueOf(this.A00), objArr, 4);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C04380Kk) {
            C04380Kk r4 = (C04380Kk) obj;
            if (!AnonymousClass0QM.A00(this.A01, r4.A01) || !AnonymousClass0QM.A00(this.A04, r4.A04) || !AnonymousClass0QM.A00(this.A02, r4.A02) || !AnonymousClass0QM.A00(Boolean.valueOf(this.A05), Boolean.valueOf(r4.A05)) || this.A00 != r4.A00) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C04380Kk(String str, String str2, String str3, String str4, int i, boolean z) {
        AnonymousClass006.A01(str);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = str4;
        this.A05 = z;
        this.A00 = i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A01, 1, false);
        AnonymousClass0Z9.A0C(parcel, this.A02, 2, false);
        AnonymousClass0Z9.A0C(parcel, this.A03, 3, false);
        AnonymousClass0Z9.A0C(parcel, this.A04, 4, false);
        AnonymousClass0Z9.A0A(parcel, 5, this.A05);
        AnonymousClass0Z9.A08(parcel, 6, this.A00);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
