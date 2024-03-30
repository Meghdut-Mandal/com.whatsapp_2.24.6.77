package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/* renamed from: X.9up  reason: invalid class name and case insensitive filesystem */
public class C207269up implements Parcelable, C22912AyO {
    public static final Parcelable.Creator CREATOR = C23180B8o.A00(15);
    public int A00;
    public C206769tw A01;
    public C134726bV A02;
    public C206459tR A03;
    public C132386Tk A04;
    public String A05;
    public BigDecimal A06;
    public List A07;
    public boolean A08;
    public final long A09;
    public final C206589te A0A;
    public final C134736bW A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final boolean A0H;

    public final void A00(C46852bm r4) {
        AnonymousClass00C.A0D(r4, 0);
        r4.A06 = this.A0F;
        r4.A09 = this.A05;
        r4.A04 = this.A0C;
        C132386Tk r0 = this.A04;
        if (r0 != null) {
            r4.A03 = r0.A00;
            BigDecimal bigDecimal = this.A06;
            r4.A0A = bigDecimal;
            C134726bV r1 = this.A02;
            if (r1 != null) {
                Date date = new Date();
                if (bigDecimal == null) {
                    bigDecimal = null;
                } else if (r1.A00(date)) {
                    bigDecimal = r1.A00;
                }
                r4.A0B = bigDecimal;
            }
        }
        r4.A08 = this.A0G;
        r4.A07 = this.A0E;
        r4.A00 = this.A07.size();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        String str;
        AnonymousClass00C.A0D(parcel, 0);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A05);
        parcel.writeString(this.A0C);
        BigDecimal bigDecimal = this.A06;
        String str2 = null;
        if (bigDecimal != null) {
            str = bigDecimal.toString();
        } else {
            str = null;
        }
        parcel.writeString(str);
        C132386Tk r0 = this.A04;
        if (r0 != null) {
            str2 = r0.A00;
        }
        parcel.writeString(str2);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0G);
        parcel.writeTypedList(this.A07);
        parcel.writeParcelable(this.A01, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0D);
        parcel.writeByte(this.A0H ? (byte) 1 : 0);
        parcel.writeByte(this.A08 ? (byte) 1 : 0);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeLong(this.A09);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeParcelable(this.A03, i);
    }

    public final boolean A01() {
        C206769tw r0 = this.A01;
        if ((r0 == null || r0.A00 == 0) && !A02() && !this.A08) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        String str = this.A0D;
        if ("FETCH_FAILED".equals(str) || "PARTIAL_FETCH".equals(str)) {
            return true;
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C207269up) {
            C207269up r7 = (C207269up) obj;
            if (AnonymousClass14B.A0G(this.A0F, r7.A0F) && AnonymousClass14B.A0G(this.A05, r7.A05) && AnonymousClass14B.A0G(this.A0C, r7.A0C) && AnonymousClass00C.A0J(this.A04, r7.A04) && AnonymousClass00C.A0J(this.A06, r7.A06) && this.A09 == r7.A09 && AnonymousClass14B.A0G(this.A0E, r7.A0E) && AnonymousClass14B.A0G(this.A0G, r7.A0G) && AnonymousClass00C.A0J(this.A01, r7.A01) && AnonymousClass00C.A0J(this.A02, r7.A02) && AnonymousClass00C.A0J(this.A07, r7.A07) && this.A0H == r7.A0H && this.A08 == r7.A08 && this.A00 == r7.A00 && AnonymousClass00C.A0J(this.A0A, r7.A0A) && AnonymousClass00C.A0J(this.A0B, r7.A0B)) {
                return AnonymousClass00C.A0J(this.A03, r7.A03);
            }
        }
        return false;
    }

    public int hashCode() {
        Object[] objArr = new Object[16];
        objArr[0] = this.A0F;
        objArr[1] = this.A05;
        objArr[2] = this.A0C;
        objArr[3] = this.A06;
        objArr[4] = this.A04;
        objArr[5] = this.A0E;
        objArr[6] = this.A0G;
        objArr[7] = this.A07;
        objArr[8] = this.A01;
        objArr[9] = this.A02;
        objArr[10] = Long.valueOf(this.A09);
        objArr[11] = Boolean.valueOf(this.A08);
        objArr[12] = Integer.valueOf(this.A00);
        objArr[13] = this.A0A;
        objArr[14] = this.A0B;
        return AnonymousClass000.A0M(this.A03, objArr, 15);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0027, code lost:
        if (r4.length() == 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C207269up(android.os.Parcel r7) {
        /*
            r6 = this;
            r6.<init>()
            java.lang.String r0 = r7.readString()
            java.lang.String r5 = "Required value was null."
            if (r0 == 0) goto L_0x00bd
            r6.A0F = r0
            java.lang.String r0 = r7.readString()
            if (r0 == 0) goto L_0x00b8
            r6.A05 = r0
            java.lang.String r0 = r7.readString()
            r6.A0C = r0
            java.lang.String r4 = r7.readString()
            r2 = 0
            if (r4 == 0) goto L_0x0029
            int r1 = r4.length()
            r0 = 0
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            r3 = 0
            if (r0 == 0) goto L_0x00ad
            r0 = r3
        L_0x002e:
            r6.A06 = r0
            java.lang.String r1 = r7.readString()
            if (r1 == 0) goto L_0x0041
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0041
            X.6Tk r3 = new X.6Tk
            r3.<init>(r1)
        L_0x0041:
            r6.A04 = r3
            java.lang.String r0 = r7.readString()
            r6.A0E = r0
            java.lang.String r0 = r7.readString()
            r6.A0G = r0
            android.os.Parcelable$Creator r0 = X.C206759tv.CREATOR
            java.util.ArrayList r0 = r7.createTypedArrayList(r0)
            if (r0 == 0) goto L_0x00b3
            r6.A07 = r0
            java.lang.Class<X.9tw> r0 = X.C206769tw.class
            android.os.Parcelable r0 = X.C36411kG.A0H(r7, r0)
            X.9tw r0 = (X.C206769tw) r0
            r6.A01 = r0
            java.lang.Class<X.6bV> r0 = X.C134726bV.class
            android.os.Parcelable r0 = X.C36411kG.A0H(r7, r0)
            X.6bV r0 = (X.C134726bV) r0
            r6.A02 = r0
            java.lang.String r0 = r7.readString()
            r6.A0D = r0
            boolean r0 = X.C165567td.A1Y(r7)
            r6.A0H = r0
            byte r0 = r7.readByte()
            if (r0 == 0) goto L_0x0080
            r2 = 1
        L_0x0080:
            r6.A08 = r2
            int r0 = r7.readInt()
            r6.A00 = r0
            java.lang.Class<X.9te> r0 = X.C206589te.class
            android.os.Parcelable r0 = X.C36411kG.A0H(r7, r0)
            X.9te r0 = (X.C206589te) r0
            r6.A0A = r0
            long r0 = r7.readLong()
            r6.A09 = r0
            java.lang.Class<X.6bW> r0 = X.C134736bW.class
            android.os.Parcelable r0 = X.C36411kG.A0H(r7, r0)
            X.6bW r0 = (X.C134736bW) r0
            r6.A0B = r0
            java.lang.Class<X.9tR> r0 = X.C206459tR.class
            android.os.Parcelable r0 = X.C36411kG.A0H(r7, r0)
            X.9tR r0 = (X.C206459tR) r0
            r6.A03 = r0
            return
        L_0x00ad:
            java.math.BigDecimal r0 = X.C165617ti.A0b(r4)
            goto L_0x002e
        L_0x00b3:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r5)
            throw r0
        L_0x00b8:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r5)
            throw r0
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A09(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C207269up.<init>(android.os.Parcel):void");
    }

    public void Bqv(C206459tR r1) {
        this.A03 = r1;
    }

    public C207269up(C206589te r6, C206769tw r7, C134726bV r8, C134736bW r9, C132386Tk r10, String str, String str2, String str3, String str4, String str5, String str6, BigDecimal bigDecimal, List list, int i, long j, boolean z, boolean z2) {
        List list2 = list;
        C36321k7.A0x(str, str2);
        AnonymousClass00C.A0D(list2, 8);
        this.A0F = str;
        this.A05 = str2;
        BigDecimal bigDecimal2 = bigDecimal;
        if (bigDecimal == null || r10 == null) {
            this.A06 = null;
            this.A04 = null;
        } else {
            this.A06 = bigDecimal2;
            this.A04 = r10;
        }
        this.A0E = str4;
        this.A0G = str5;
        this.A0C = str3;
        this.A0D = str6;
        this.A07 = A02() ? AnonymousClass001.A0I() : list2;
        this.A01 = r7;
        this.A02 = r8;
        this.A0H = z;
        this.A08 = z2;
        this.A00 = i;
        this.A0A = r6;
        long j2 = j;
        if (j < 0) {
            this.A09 = 99;
        } else {
            this.A09 = j2;
        }
        this.A0B = r9;
    }
}
