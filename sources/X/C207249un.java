package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9un  reason: invalid class name and case insensitive filesystem */
public abstract class C207249un implements Parcelable {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04;
    public long A05;
    public long A06;
    public C202159l8 A07 = C202159l8.A0G;
    public C175898bF A08;
    public C135086c7 A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public byte[] A0D;

    public static C207249un A05(C202159l8 r12, String str, String str2, String str3, int i) {
        C202159l8 r5 = r12;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i2 = i;
        if (i2 != 1) {
            if (i2 == 2) {
                C175748az r9 = new C175748az(r5, 0, 0, -1, -1);
                r9.A0A = str5;
                r9.A0E(str6);
                r9.A0B = str4;
                return r9;
            } else if (i2 == 3) {
                BigDecimal bigDecimal = BigDecimal.ZERO;
                C175778b2 r4 = new C175778b2(r12, r12.A05, 0, 0);
                r4.A0A = str2;
                r4.A0E(str3);
                r4.A0F(r12, bigDecimal);
                r4.A08 = null;
                return r4;
            } else if (!(i2 == 4 || i2 == 6 || i2 == 8)) {
                return null;
            }
        }
        return new C175798b4(r5, str5, str4, str6, i2, 0, 0, 0, 0, C175798b4.A01(str));
    }

    public static String A07(int i) {
        switch (i) {
            case 1:
                return "Debit";
            case 2:
                return "Bank Account";
            case 3:
                return "PaymentWallet";
            case 4:
                return "Credit";
            case 5:
                return "Business Account";
            case 6:
                return "Combo";
            case 8:
                return "Prepaid";
            default:
                return null;
        }
    }

    public void A0B(int i) {
        int A092;
        if (i != 1 || this.A07.A01 == (A092 = A09())) {
            this.A00 = i;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: ");
        A0u.append(A092);
        throw AnonymousClass000.A0c(" in country cannot be legacy primary account type", A0u);
    }

    public void A0C(int i) {
        int A092;
        if (i != 1 || this.A07.A00 == (A092 = A09())) {
            this.A01 = i;
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PAY: ");
        A0u.append(A092);
        throw AnonymousClass000.A0c(" in country cannot be legacy primary account type", A0u);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0009, code lost:
        r1 = ((X.C207249un) r4).A0A;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r2 = 1
            if (r3 == r4) goto L_0x0019
            boolean r1 = r4 instanceof X.C207249un
            r0 = 0
            if (r1 != 0) goto L_0x0009
            return r0
        L_0x0009:
            X.9un r4 = (X.C207249un) r4
            java.lang.String r1 = r4.A0A
            if (r1 == 0) goto L_0x0018
            java.lang.String r0 = r3.A0A
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
            return r2
        L_0x0018:
            r2 = 0
        L_0x0019:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207249un.equals(java.lang.Object):boolean");
    }

    public static Object A06(C207249un r0) {
        C135086c7 r02 = r0.A09;
        if (r02 == null) {
            return null;
        }
        return r02.A00;
    }

    public int A09() {
        if (this instanceof C175778b2) {
            return 3;
        }
        if (this instanceof C175788b3) {
            return 9;
        }
        if (this instanceof C175768b1) {
            return 5;
        }
        if (this instanceof C175798b4) {
            return ((C175798b4) this).A00;
        }
        if (this instanceof C175748az) {
            return 2;
        }
        return 0;
    }

    public Bitmap A0A() {
        byte[] bArr;
        int A092;
        if (((this instanceof C175758b0) || (A092 = A09()) == 1 || A092 == 2 || A092 == 3 || A092 == 4 || A092 == 6 || A092 == 7) && (bArr = this.A0D) != null) {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        }
        return null;
    }

    public int hashCode() {
        String str = this.A0A;
        if (str == null) {
            return super.hashCode();
        }
        return str.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int length;
        parcel.writeString(this.A0A);
        parcel.writeString(this.A07.A03);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0C);
        parcel.writeInt(this.A04);
        parcel.writeLong(this.A05);
        parcel.writeLong(this.A06);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        byte[] bArr = this.A0D;
        if (bArr == null) {
            length = 0;
        } else {
            length = bArr.length;
        }
        parcel.writeInt(length);
        byte[] bArr2 = this.A0D;
        if (bArr2 != null) {
            parcel.writeByteArray(bArr2);
        }
        parcel.writeByte(AnonymousClass000.A1V(this.A08) ? (byte) 1 : 0);
        C175898bF r0 = this.A08;
        if (r0 != null) {
            parcel.writeParcelable(r0, 0);
        }
    }

    public static int A04(String str) {
        boolean z;
        int i = 2;
        if (!TextUtils.isEmpty(str)) {
            switch (str.hashCode()) {
                case -1211756856:
                    z = str.equals("VERIFIED");
                    i = 3;
                    break;
                case 35394935:
                    z = str.equals("PENDING");
                    i = 1;
                    break;
                case 2066319421:
                    z = str.equals("FAILED");
                    break;
            }
            if (!z) {
                return 0;
            }
            return i;
        }
        return 0;
    }

    public static ArrayList A08(C202159l8 r5, List list) {
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C207249un A0S = C165607th.A0S(it);
            if (AnonymousClass6XG.A03(r5.A09, A0S.A09())) {
                if (A0S.A01 == 2) {
                    A0I.add(0, A0S);
                } else {
                    A0I.add(A0S);
                }
            }
        }
        return A0I;
    }

    public void A0D(Parcel parcel) {
        this.A0A = parcel.readString();
        this.A07 = C202159l8.A00(C165617ti.A0Z(parcel.readString().trim()));
        this.A09 = (C135086c7) C36411kG.A0H(parcel, C135086c7.class);
        this.A0B = parcel.readString();
        this.A0C = parcel.readString();
        this.A04 = parcel.readInt();
        this.A05 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        int readInt = parcel.readInt();
        this.A0D = null;
        if (readInt != 0) {
            byte[] bArr = new byte[readInt];
            this.A0D = bArr;
            parcel.readByteArray(bArr);
        }
        this.A08 = null;
        if (parcel.readByte() == 1) {
            this.A08 = (C175898bF) C36411kG.A0H(parcel, C206279t0.class);
        }
    }

    public void A0E(String str) {
        this.A09 = C165617ti.A0P(C146356vT.A00(), String.class, str, "bankName");
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("credential-id: ");
        A0u.append(this.A0A);
        A0u.append(" country: ");
        A0u.append(this.A07.A03);
        A0u.append(" issuerName: ");
        A0u.append(this.A0B);
        A0u.append(" payment-mode: ");
        A0u.append(this.A01);
        A0u.append(" payout-mode: ");
        A0u.append(this.A00);
        A0u.append(" merchant-credential-id: ");
        A0u.append(this.A0C);
        A0u.append(" payout-verification-status: ");
        A0u.append(this.A04);
        A0u.append(" countrydata: ");
        return AnonymousClass000.A0o(this.A08, A0u);
    }
}
