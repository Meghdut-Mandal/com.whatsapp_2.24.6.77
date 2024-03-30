package X;

/* renamed from: X.9k2  reason: invalid class name and case insensitive filesystem */
public class C201639k2 {
    public int A00;
    public byte[] A01;

    public static void A03(C201639k2 r3, C201639k2 r4) {
        r4.A0C(r3.A01, 0, r3.A00);
    }

    public static void A02(C201639k2 r4, int i) {
        int i2 = r4.A00;
        byte[] bArr = r4.A01;
        int length = bArr.length;
        if (i2 <= length) {
            int i3 = length * 2;
            int i4 = i + i2;
            if (i3 <= i4) {
                i3 = i4;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, 0, bArr2, 0, i2);
            r4.A01 = bArr2;
            return;
        }
        throw C90524aI.A0Y("Internal error");
    }

    public static void A04(C201639k2 r3, byte[] bArr, int i, int i2) {
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 8);
        bArr[i3] = (byte) i2;
        r3.A00 = i3 + 1;
    }

    public void A05(int i) {
        int i2 = this.A00;
        int i3 = i2 + 1;
        if (i3 > this.A01.length) {
            A02(this, 1);
        }
        this.A01[i2] = (byte) i;
        this.A00 = i3;
    }

    public void A06(int i) {
        int i2 = this.A00;
        if (i2 + 4 > this.A01.length) {
            A02(this, 4);
        }
        byte[] bArr = this.A01;
        int i3 = i2 + 1;
        int A02 = C165617ti.A02(i >>> 24, bArr, i2, i3);
        bArr[i3] = (byte) (i >>> 16);
        A04(this, bArr, A02, i);
    }

    public void A07(int i) {
        int i2 = this.A00;
        if (i2 + 2 > this.A01.length) {
            A02(this, 2);
        }
        A04(this, this.A01, i2, i);
    }

    public final void A08(int i, int i2) {
        int i3 = this.A00;
        if (i3 + 2 > this.A01.length) {
            A02(this, 2);
        }
        byte[] bArr = this.A01;
        int i4 = i3 + 1;
        int A02 = C165617ti.A02(i, bArr, i3, i4);
        bArr[i4] = (byte) i2;
        this.A00 = A02;
    }

    public final void A09(int i, int i2) {
        int i3 = this.A00;
        if (i3 + 3 > this.A01.length) {
            A02(this, 3);
        }
        byte[] bArr = this.A01;
        bArr[i3] = (byte) i;
        A04(this, bArr, i3 + 1, i2);
    }

    public final void A0A(int i, int i2, int i3) {
        int i4 = this.A00;
        if (i4 + 5 > this.A01.length) {
            A02(this, 5);
        }
        byte[] bArr = this.A01;
        int i5 = i4 + 1;
        int A02 = C165617ti.A02(i, bArr, i4, i5);
        int A022 = C165617ti.A02(i2 >>> 8, bArr, i5, A02);
        bArr[A02] = (byte) i2;
        A04(this, bArr, A022, i3);
    }

    public void A0C(byte[] bArr, int i, int i2) {
        if (this.A00 + i2 > this.A01.length) {
            A02(this, i2);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i, this.A01, this.A00, i2);
        }
        this.A00 += i2;
    }

    public C201639k2(int i) {
        this.A01 = new byte[i];
    }

    public static void A00(String str, C201639k2 r1, C203329nn r2) {
        r1.A07(r2.A08(str));
    }

    public static void A01(String str, C201639k2 r1, C203329nn r2, int i) {
        r1.A07(C203329nn.A03(str, r2, i).A02);
    }

    public final void A0B(String str, int i, int i2) {
        byte[] bArr;
        int A02;
        int length = str.length();
        int i3 = i;
        for (int i4 = i; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (charAt >= 1) {
                if (charAt <= 127) {
                    i3++;
                } else if (charAt > 2047) {
                    i3 += 3;
                }
            }
            i3 += 2;
        }
        if (i3 <= i2) {
            int i5 = this.A00;
            int i6 = (i5 - i) - 2;
            if (i6 >= 0) {
                C165607th.A15(i3 >>> 8, this.A01, i6, i3);
            }
            if ((i5 + i3) - i > this.A01.length) {
                A02(this, i3 - i);
            }
            int i7 = this.A00;
            while (i < length) {
                char charAt2 = str.charAt(i);
                if (charAt2 >= 1) {
                    if (charAt2 <= 127) {
                        bArr = this.A01;
                        A02 = i7 + 1;
                    } else if (charAt2 > 2047) {
                        bArr = this.A01;
                        int i8 = i7 + 1;
                        i7 = C165617ti.A02(((charAt2 >> 12) & 15) | 224, bArr, i7, i8);
                        A02 = C165617ti.A02(((charAt2 >> 6) & 63) | 128, bArr, i8, i7);
                        charAt2 = (charAt2 & '?') | 128;
                    }
                    bArr[i7] = (byte) charAt2;
                    i7 = A02;
                    i++;
                }
                byte[] bArr2 = this.A01;
                int i9 = i7 + 1;
                i7 = C165617ti.A02(((charAt2 >> 6) & 31) | 192, bArr2, i7, i9);
                bArr2[i9] = (byte) ((charAt2 & '?') | 128);
                i++;
            }
            this.A00 = i7;
            return;
        }
        throw AnonymousClass001.A08("UTF8 string too large");
    }

    public C201639k2() {
        this.A01 = new byte[64];
    }
}
