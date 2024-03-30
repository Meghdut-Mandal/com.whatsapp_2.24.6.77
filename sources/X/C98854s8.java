package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4s8  reason: invalid class name and case insensitive filesystem */
public final class C98854s8 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205409rb();
    public final byte A00;
    public final byte A01;
    public final byte A02;
    public final byte A03;
    public final int A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C98854s8 r5 = (C98854s8) obj;
            if (this.A04 != r5.A04 || this.A00 != r5.A00 || this.A01 != r5.A01 || this.A02 != r5.A02 || this.A03 != r5.A03 || !this.A05.equals(r5.A05)) {
                return false;
            }
            String str = this.A06;
            String str2 = r5.A06;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            if (!this.A07.equals(r5.A07) || !this.A08.equals(r5.A08) || !this.A09.equals(r5.A09)) {
                return false;
            }
            String str3 = this.A0A;
            String str4 = r5.A0A;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            String str5 = this.A0B;
            String str6 = r5.A0B;
            if (str5 != null) {
                return str5.equals(str6);
            }
            if (str6 != null) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int A082 = C36381kD.A08(this.A05, (this.A04 + 31) * 31);
        String str = this.A06;
        int i3 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int A083 = C36381kD.A08(this.A09, C36381kD.A08(this.A08, C36381kD.A08(this.A07, (A082 + i) * 31)));
        String str2 = this.A0A;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i4 = (((((((((A083 + i2) * 31) + this.A00) * 31) + this.A01) * 31) + this.A02) * 31) + this.A03) * 31;
        String str3 = this.A0B;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return i4 + i3;
    }

    public final String toString() {
        int i = this.A04;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A07;
        String str4 = this.A08;
        String str5 = this.A09;
        String str6 = this.A0A;
        byte b = this.A00;
        byte b2 = this.A01;
        byte b3 = this.A02;
        byte b4 = this.A03;
        String str7 = this.A0B;
        int A052 = C90474aD.A05(str);
        int A053 = C90474aD.A05(str2);
        int A054 = C90474aD.A05(str3);
        int A055 = C90474aD.A05(str4);
        int A056 = C90474aD.A05(str5);
        StringBuilder A0h = C90524aI.A0h(A052 + 211 + A053 + A054 + A055 + A056 + C90474aD.A05(str6) + C90474aD.A05(str7));
        A0h.append("AncsNotificationParcelable{, id=");
        A0h.append(i);
        A0h.append(", appId='");
        A0h.append(str);
        A0h.append("', dateTime='");
        A0h.append(str2);
        A0h.append("', notificationText='");
        A0h.append(str3);
        A0h.append("', title='");
        A0h.append(str4);
        A0h.append("', subtitle='");
        A0h.append(str5);
        A0h.append("', displayName='");
        A0h.append(str6);
        A0h.append("', eventId=");
        A0h.append(b);
        A0h.append(", eventFlags=");
        A0h.append(b2);
        A0h.append(", categoryId=");
        A0h.append(b3);
        A0h.append(", categoryCount=");
        A0h.append(b4);
        A0h.append(", packageName='");
        A0h.append(str7);
        return AnonymousClass000.A0q("'}", A0h);
    }

    public C98854s8(String str, String str2, String str3, String str4, String str5, String str6, String str7, byte b, byte b2, byte b3, byte b4, int i) {
        this.A04 = i;
        this.A05 = str;
        this.A06 = str2;
        this.A07 = str3;
        this.A08 = str4;
        this.A09 = str5;
        this.A0A = str6;
        this.A00 = b;
        this.A01 = b2;
        this.A02 = b3;
        this.A03 = b4;
        this.A0B = str7;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A04);
        String str = this.A05;
        AnonymousClass0Z9.A0C(parcel, str, 3, false);
        AnonymousClass0Z9.A0C(parcel, this.A06, 4, false);
        AnonymousClass0Z9.A0C(parcel, this.A07, 5, false);
        AnonymousClass0Z9.A0C(parcel, this.A08, 6, false);
        AnonymousClass0Z9.A0C(parcel, this.A09, 7, false);
        String str2 = this.A0A;
        if (str2 == null) {
            str2 = str;
        }
        AnonymousClass0Z9.A0C(parcel, str2, 8, false);
        AnonymousClass0Z9.A05(parcel, this.A00, 9);
        AnonymousClass0Z9.A05(parcel, this.A01, 10);
        AnonymousClass0Z9.A05(parcel, this.A02, 11);
        AnonymousClass0Z9.A05(parcel, this.A03, 12);
        AnonymousClass0Z9.A0C(parcel, this.A0B, 13, false);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}
