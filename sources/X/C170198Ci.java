package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8Ci  reason: invalid class name and case insensitive filesystem */
public final class C170198Ci extends C10440eF implements Parcelable, C161397mq {
    public static final Parcelable.Creator CREATOR = new C205089r3();
    public final String A00;
    public final String A01;
    public final String A02;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C170198Ci) {
                C170198Ci r5 = (C170198Ci) obj;
                if (!this.A00.equals(r5.A00) || !AnonymousClass0QM.A00(r5.A01, this.A01) || !AnonymousClass0QM.A00(r5.A02, this.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        String str = this.A00;
        int i = 0;
        for (char c : str.toCharArray()) {
            i += c;
        }
        String trim = str.trim();
        int length = trim.length();
        if (length > 25) {
            String substring = trim.substring(0, 10);
            String substring2 = trim.substring(length - 10, length);
            StringBuilder A0h = C90524aI.A0h(C90474aD.A05(substring) + 16 + C90474aD.A05(substring2));
            A0h.append(substring);
            A0h.append("...");
            A0h.append(substring2);
            trim = AnonymousClass000.A0r("::", A0h, i);
        }
        String str2 = this.A01;
        String str3 = this.A02;
        StringBuilder A0h2 = C90524aI.A0h(C90474aD.A05(trim) + 31 + C90474aD.A05(str2) + C90474aD.A05(str3));
        A0h2.append("Channel{token=");
        A0h2.append(trim);
        A0h2.append(", nodeId=");
        A0h2.append(str2);
        A0h2.append(", path=");
        A0h2.append(str3);
        return AnonymousClass000.A0q("}", A0h2);
    }

    public C170198Ci(String str, String str2, String str3) {
        AnonymousClass006.A01(str);
        this.A00 = str;
        AnonymousClass006.A01(str2);
        this.A01 = str2;
        AnonymousClass006.A01(str3);
        this.A02 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = AnonymousClass0Z9.A00(parcel);
        boolean A06 = C10440eF.A06(parcel, this.A00);
        AnonymousClass0Z9.A0C(parcel, this.A01, 3, A06);
        AnonymousClass0Z9.A0C(parcel, this.A02, 4, A06);
        AnonymousClass0Z9.A07(parcel, A002);
    }
}
