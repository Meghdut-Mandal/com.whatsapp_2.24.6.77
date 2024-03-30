package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.8b1  reason: invalid class name and case insensitive filesystem */
public final class C175768b1 extends C207249un {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(33);
    public int A00;
    public String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;

    public int describeContents() {
        return 0;
    }

    public C175768b1(Parcel parcel) {
        A0D(parcel);
        this.A01 = parcel.readString();
        boolean z = false;
        this.A03 = AnonymousClass000.A1S(parcel.readByte(), 1);
        this.A04 = parcel.readByte() == 1 ? true : z;
        this.A02 = parcel.readString();
        this.A00 = parcel.readInt();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("[ MERCHANT: ");
        A0u.append(super.toString());
        A0u.append(" merchantId: ");
        A0u.append(this.A01);
        A0u.append(" p2mEligible: ");
        A0u.append(this.A03);
        A0u.append(" p2pEligible: ");
        A0u.append(this.A04);
        A0u.append(" logoUri: ");
        A0u.append(this.A02);
        A0u.append("maxInstallmentCount: ");
        A0u.append(this.A00);
        return AnonymousClass000.A0q(" ]", A0u);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A01);
        parcel.writeByte(this.A03 ? (byte) 1 : 0);
        parcel.writeByte(this.A04 ? (byte) 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A00);
    }

    public C175768b1(C202159l8 r1, C175898bF r2, String str, String str2, String str3, String str4, int i, boolean z, boolean z2) {
        this.A01 = str3;
        this.A03 = z;
        this.A04 = z2;
        this.A02 = str2;
        this.A00 = i;
        C18740tg.A06(r1);
        this.A07 = r1;
        this.A0A = str;
        this.A08 = r2;
        A0E(str4);
    }
}
