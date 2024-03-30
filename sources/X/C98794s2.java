package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4s2  reason: invalid class name and case insensitive filesystem */
public final class C98794s2 extends C10440eF {
    public static final Parcelable.Creator CREATOR = new C205289rP();
    public final String A00;
    public final String A01;
    public final byte[] A02;
    public final int A03;

    public final String toString() {
        Object valueOf;
        int i = this.A03;
        String str = this.A00;
        byte[] bArr = this.A02;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String valueOf2 = String.valueOf(valueOf);
        StringBuilder A0h = C90524aI.A0h(C90474aD.A05(str) + 43 + C90474aD.A05(valueOf2));
        A0h.append("MessageEventParcelable[");
        A0h.append(i);
        A0h.append(",");
        A0h.append(str);
        A0h.append(", size=");
        A0h.append(valueOf2);
        return C90474aD.A0g(A0h);
    }

    public C98794s2(String str, String str2, byte[] bArr, int i) {
        this.A03 = i;
        this.A00 = str;
        this.A02 = bArr;
        this.A01 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A012 = AnonymousClass0Z9.A01(parcel);
        AnonymousClass0Z9.A08(parcel, 2, this.A03);
        AnonymousClass0Z9.A0C(parcel, this.A00, 3, false);
        AnonymousClass0Z9.A0F(parcel, this.A02, 4, false);
        AnonymousClass0Z9.A0C(parcel, this.A01, 5, false);
        AnonymousClass0Z9.A07(parcel, A012);
    }
}
