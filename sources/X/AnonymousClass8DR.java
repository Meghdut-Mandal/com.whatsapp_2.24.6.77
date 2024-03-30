package X;

import java.util.Arrays;

/* renamed from: X.8DR  reason: invalid class name */
public abstract class AnonymousClass8DR extends C201509jk {
    public int A04() {
        int length;
        int i;
        AnonymousClass8DQ r4 = (AnonymousClass8DQ) this;
        int i2 = 0;
        long j = r4.A01;
        if (j != 0) {
            i2 = 0 + C202569mD.A00(j) + 1;
        }
        AnonymousClass8DP[] r0 = r4.A0B;
        int i3 = 0;
        if (r0 != null && r0.length > 0) {
            int i4 = 0;
            while (true) {
                AnonymousClass8DP[] r1 = r4.A0B;
                if (i4 >= r1.length) {
                    break;
                }
                AnonymousClass8DP r02 = r1[i4];
                if (r02 != null) {
                    int A04 = r02.A04();
                    r02.A00 = A04;
                    i2 += C165567td.A00(A04) + A04 + 1;
                }
                i4++;
            }
        }
        byte[] bArr = r4.A07;
        byte[] bArr2 = AnonymousClass9AU.A00;
        if (!Arrays.equals(bArr, bArr2)) {
            int length2 = bArr.length;
            i2 += C165567td.A00(length2) + length2 + 1;
        }
        if (!Arrays.equals(r4.A08, bArr2)) {
            int length3 = r4.A08.length;
            i2 += C165567td.A00(length3) + length3 + 1;
        }
        AnonymousClass8DE r2 = r4.A04;
        if (r2 != null) {
            boolean z = AnonymousClass8D7.A01;
            int i5 = r2.zzjq;
            if (i5 == -1) {
                i5 = C165597tg.A0J(r2).Byv(r2);
                r2.zzjq = i5;
            }
            i2 += C165567td.A00(i5) + i5 + 1;
        }
        int i6 = r4.A00;
        if (i6 != 0) {
            i2 += C165567td.A00(i6) + 1;
        }
        long j2 = r4.A03;
        if (j2 != 180000) {
            i2 += 1 + C202569mD.A00((j2 >> 63) ^ (j2 << 1));
        }
        long j3 = r4.A02;
        if (j3 != 0) {
            i2 += 2 + C202569mD.A00(j3);
        }
        byte[] bArr3 = r4.A09;
        if (!Arrays.equals(bArr3, bArr2)) {
            int length4 = bArr3.length;
            i2 += 2 + C165567td.A00(length4) + length4;
        }
        int[] iArr = r4.A0A;
        if (iArr != null && (length = iArr.length) > 0) {
            int i7 = 0;
            do {
                int i8 = iArr[i3];
                if (i8 >= 0) {
                    i = C165567td.A00(i8);
                } else {
                    i = 10;
                }
                i7 += i;
                i3++;
            } while (i3 < length);
            i2 = i2 + i7 + (length * 2);
        }
        AnonymousClass8DD r3 = r4.A05;
        if (r3 != null) {
            boolean z2 = AnonymousClass8D7.A01;
            int i9 = r3.zzjq;
            if (i9 == -1) {
                i9 = C165597tg.A0J(r3).Byv(r3);
                r3.zzjq = i9;
            }
            i2 += C194279Ox.A03(i9, 2);
        }
        if (r4.A06) {
            return i2 + 3;
        }
        return i2;
    }

    public AnonymousClass8DR A05() {
        return (AnonymousClass8DR) super.A02();
    }
}
