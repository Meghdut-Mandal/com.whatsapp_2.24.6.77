package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4s6  reason: invalid class name and case insensitive filesystem */
public final class C98834s6 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205299rQ();
    public final int A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C98834s6)) {
            return false;
        }
        return ((C98834s6) obj).A01.equals(this.A01);
    }

    public final int hashCode() {
        return this.A01.hashCode();
    }

    public final String toString() {
        String str = this.A02;
        String str2 = this.A01;
        int i = this.A00;
        boolean z = this.A03;
        StringBuilder A0h = C90524aI.A0h(C90474aD.A05(str) + 45 + C90474aD.A05(str2));
        A0h.append("Node{");
        A0h.append(str);
        A0h.append(", id=");
        A0h.append(str2);
        A0h.append(", hops=");
        A0h.append(i);
        A0h.append(", isNearby=");
        A0h.append(z);
        return AnonymousClass000.A0q("}", A0h);
    }

    public C98834s6(String str, String str2, int i, boolean z) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = i;
        this.A03 = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A0C(parcel, this.A01, 2, false);
        AnonymousClass0Z9.A0C(parcel, this.A02, 3, false);
        AnonymousClass0Z9.A08(parcel, 4, this.A00);
        AnonymousClass0Z9.A0A(parcel, 5, this.A03);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}
