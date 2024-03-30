package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Ce  reason: invalid class name and case insensitive filesystem */
public final class C170158Ce extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C204539qA();
    public final int A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public C170158Ce(AnonymousClass90D r5, String str, int i) {
        AnonymousClass006.A01(str);
        this.A04 = str;
        this.A03 = i;
        this.A00 = -1;
        this.A01 = "VISION";
        this.A05 = null;
        this.A06 = null;
        this.A07 = true;
        this.A08 = false;
        this.A02 = r5.value;
    }

    public C170158Ce(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, boolean z2) {
        this.A04 = str;
        this.A03 = i;
        this.A00 = i2;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = z;
        this.A01 = str4;
        this.A08 = z2;
        this.A02 = i3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C170158Ce) {
                C170158Ce r5 = (C170158Ce) obj;
                if (!(AnonymousClass0QM.A00(this.A04, r5.A04) && this.A03 == r5.A03 && this.A00 == r5.A00 && AnonymousClass0QM.A00(this.A01, r5.A01) && AnonymousClass0QM.A00(this.A05, r5.A05) && AnonymousClass0QM.A00(this.A06, r5.A06) && this.A07 == r5.A07 && this.A08 == r5.A08 && this.A02 == r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[9];
        objArr[0] = this.A04;
        AnonymousClass000.A1K(objArr, this.A03);
        C36331k8.A1V(objArr, this.A00);
        objArr[3] = this.A01;
        objArr[4] = this.A05;
        objArr[5] = this.A06;
        objArr[6] = Boolean.valueOf(this.A07);
        objArr[7] = Boolean.valueOf(this.A08);
        return AnonymousClass000.A0M(Integer.valueOf(this.A02), objArr, 8);
    }

    public final String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PlayLoggerContext[");
        A0u.append("package=");
        A0u.append(this.A04);
        A0u.append(',');
        A0u.append("packageVersionCode=");
        A0u.append(this.A03);
        A0u.append(',');
        A0u.append("logSource=");
        A0u.append(this.A00);
        A0u.append(',');
        A0u.append("logSourceName=");
        A0u.append(this.A01);
        A0u.append(',');
        A0u.append("uploadAccount=");
        A0u.append(this.A05);
        A0u.append(',');
        A0u.append("loggingId=");
        A0u.append(this.A06);
        A0u.append(',');
        A0u.append("logAndroidId=");
        A0u.append(this.A07);
        A0u.append(',');
        A0u.append("isAnonymous=");
        A0u.append(this.A08);
        A0u.append(',');
        A0u.append("qosTier=");
        A0u.append(this.A02);
        return C90474aD.A0g(A0u);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        boolean A062 = C10440eF.A06(parcel, this.A04);
        AnonymousClass0Z9.A08(parcel, 3, this.A03);
        AnonymousClass0Z9.A08(parcel, 4, this.A00);
        AnonymousClass0Z9.A0C(parcel, this.A05, 5, A062);
        AnonymousClass0Z9.A0C(parcel, this.A06, 6, A062);
        AnonymousClass0Z9.A0A(parcel, 7, this.A07);
        AnonymousClass0Z9.A0C(parcel, this.A01, 8, A062);
        AnonymousClass0Z9.A0A(parcel, 9, this.A08);
        AnonymousClass0Z9.A08(parcel, 10, this.A02);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
