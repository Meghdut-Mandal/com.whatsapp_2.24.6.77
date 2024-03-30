package X;

/* renamed from: X.AZf  reason: case insensitive filesystem */
public class C21751AZf implements B35 {
    public int A00;
    public int A01;
    public B35 A02;
    public byte[] A03;
    public byte[] A04;
    public byte[] A05;
    public byte[] A06;
    public boolean A07;
    public boolean A08;

    public C21751AZf(B35 b35, boolean z) {
        this.A02 = b35;
        this.A08 = z;
        int B8o = b35.B8o();
        this.A00 = B8o;
        this.A05 = new byte[B8o];
        this.A03 = new byte[B8o];
        this.A04 = new byte[B8o];
        this.A06 = new byte[B8o];
    }

    public int B8o() {
        return this.A02.B8o();
    }

    public void reset() {
        this.A01 = 0;
        int i = 0;
        while (true) {
            byte[] bArr = this.A03;
            if (i != bArr.length) {
                if (this.A08) {
                    bArr[i] = 0;
                } else {
                    bArr[i] = this.A05[i];
                }
                i++;
            } else {
                this.A02.reset();
                return;
            }
        }
    }

    public String B8R() {
        String str;
        boolean z = this.A08;
        StringBuilder A0u = AnonymousClass000.A0u();
        String B8R = this.A02.B8R();
        if (z) {
            A0u.append(B8R);
            str = "/PGPCFBwithIV";
        } else {
            A0u.append(B8R);
            str = "/PGPCFB";
        }
        return AnonymousClass000.A0q(str, A0u);
    }

    public void BKQ(C16590pl r7, boolean z) {
        B35 b35;
        this.A07 = z;
        if (r7 instanceof C21760AZs) {
            C21760AZs aZs = (C21760AZs) r7;
            byte[] bArr = aZs.A01;
            int length = bArr.length;
            byte[] bArr2 = this.A05;
            int length2 = bArr2.length;
            if (length < length2) {
                int i = length2 - length;
                System.arraycopy(bArr, 0, bArr2, i, length);
                for (int i2 = 0; i2 < i; i2++) {
                    bArr2[i2] = 0;
                }
            } else {
                System.arraycopy(bArr, 0, bArr2, 0, length2);
            }
            reset();
            b35 = this.A02;
            r7 = aZs.A00;
        } else {
            reset();
            b35 = this.A02;
        }
        b35.BKQ(r7, true);
    }

    public int BmM(byte[] bArr, byte[] bArr2, int i, int i2) {
        int i3;
        boolean z = this.A08;
        boolean z2 = this.A07;
        if (z) {
            i3 = this.A00;
            int i4 = i + i3;
            int length = bArr.length;
            if (z2) {
                if (i4 <= length) {
                    int i5 = this.A01;
                    if (i5 == 0) {
                        int i6 = i3 * 2;
                        if (i6 + i2 + 2 <= bArr2.length) {
                            B35 b35 = this.A02;
                            byte[] bArr3 = this.A03;
                            byte[] bArr4 = this.A04;
                            b35.BmM(bArr3, bArr4, 0, 0);
                            for (int i7 = 0; i7 < i3; i7++) {
                                C165577te.A1T(bArr4, bArr2, i7, this.A05[i7], i2 + i7);
                            }
                            System.arraycopy(bArr2, i2, bArr3, 0, i3);
                            b35.BmM(bArr3, bArr4, 0, 0);
                            int i8 = i2 + i3;
                            byte[] bArr5 = this.A05;
                            C165577te.A1T(bArr4, bArr2, 0, bArr5[i3 - 2], i8);
                            C165577te.A1T(bArr4, bArr2, 1, bArr5[i3 - 1], i8 + 1);
                            System.arraycopy(bArr2, i2 + 2, bArr3, 0, i3);
                            b35.BmM(bArr3, bArr4, 0, 0);
                            for (int i9 = 0; i9 < i3; i9++) {
                                C165577te.A1T(bArr4, bArr2, i9, bArr[i + i9], i8 + 2 + i9);
                            }
                            System.arraycopy(bArr2, i8 + 2, bArr3, 0, i3);
                            int i10 = i6 + 2;
                            this.A01 += i10;
                            return i10;
                        }
                        throw new C22697At1("output buffer too short");
                    } else if (i5 >= i3 + 2) {
                        if (i3 + i2 <= bArr2.length) {
                            B35 b352 = this.A02;
                            byte[] bArr6 = this.A03;
                            byte[] bArr7 = this.A04;
                            b352.BmM(bArr6, bArr7, 0, 0);
                            for (int i11 = 0; i11 < i3; i11++) {
                                C165577te.A1T(bArr7, bArr2, i11, bArr[i + i11], i2 + i11);
                            }
                            System.arraycopy(bArr2, i2, bArr6, 0, i3);
                        } else {
                            throw new C22697At1("output buffer too short");
                        }
                    }
                } else {
                    throw C22702At6.A01();
                }
            } else if (i4 > length) {
                throw C22702At6.A01();
            } else if (i2 + i3 <= bArr2.length) {
                int i12 = this.A01;
                if (i12 == 0) {
                    for (int i13 = 0; i13 < i3; i13++) {
                        C165617ti.A0h(bArr, this.A03, i + i13, i13);
                    }
                    this.A02.BmM(this.A03, this.A04, 0, 0);
                    this.A01 += i3;
                    return 0;
                } else if (i12 == i3) {
                    byte[] bArr8 = this.A06;
                    System.arraycopy(bArr, i, bArr8, 0, i3);
                    byte[] bArr9 = this.A03;
                    int i14 = i3 - 2;
                    System.arraycopy(bArr9, 2, bArr9, 0, i14);
                    int i15 = i3 - 2;
                    C165617ti.A0h(bArr8, bArr9, 0, i15);
                    C165617ti.A0h(bArr8, bArr9, 1, i3 - 1);
                    B35 b353 = this.A02;
                    byte[] bArr10 = this.A04;
                    b353.BmM(bArr9, bArr10, 0, 0);
                    for (int i16 = 0; i16 < i15; i16++) {
                        C165577te.A1T(bArr10, bArr2, i16, bArr8[i16 + 2], i2 + i16);
                    }
                    System.arraycopy(bArr8, 2, bArr9, 0, i14);
                    this.A01 += 2;
                    return i14;
                } else if (i12 >= i3 + 2) {
                    byte[] bArr11 = this.A06;
                    System.arraycopy(bArr, i, bArr11, 0, i3);
                    byte b = bArr11[0];
                    int i17 = i3 - 2;
                    byte[] bArr12 = this.A04;
                    C165577te.A1T(bArr12, bArr2, i17, b, i2);
                    C165577te.A1T(bArr12, bArr2, i3 - 1, bArr11[1], i2 + 1);
                    byte[] bArr13 = this.A03;
                    System.arraycopy(bArr11, 0, bArr13, i17, 2);
                    this.A02.BmM(bArr13, bArr12, 0, 0);
                    for (int i18 = 0; i18 < i3 - 2; i18++) {
                        C165577te.A1T(bArr12, bArr2, i18, bArr11[i18 + 2], i2 + i18 + 2);
                    }
                    System.arraycopy(bArr11, 2, bArr13, 0, i17);
                    return i3;
                }
            } else {
                throw C22697At1.A00();
            }
        } else {
            i3 = this.A00;
            int i19 = i + i3;
            int length2 = bArr.length;
            if (z2) {
                if (i19 > length2) {
                    throw C22702At6.A01();
                } else if (i3 + i2 <= bArr2.length) {
                    B35 b354 = this.A02;
                    byte[] bArr14 = this.A03;
                    byte[] bArr15 = this.A04;
                    b354.BmM(bArr14, bArr15, 0, 0);
                    for (int i20 = 0; i20 < i3; i20++) {
                        C165577te.A1T(bArr15, bArr2, i20, bArr[i + i20], i2 + i20);
                    }
                    for (int i21 = 0; i21 < i3; i21++) {
                        C165617ti.A0h(bArr2, bArr14, i2 + i21, i21);
                    }
                } else {
                    throw C22697At1.A00();
                }
            } else if (i19 > length2) {
                throw C22702At6.A01();
            } else if (i3 + i2 <= bArr2.length) {
                B35 b355 = this.A02;
                byte[] bArr16 = this.A03;
                byte[] bArr17 = this.A04;
                b355.BmM(bArr16, bArr17, 0, 0);
                for (int i22 = 0; i22 < i3; i22++) {
                    C165577te.A1T(bArr17, bArr2, i22, bArr[i + i22], i2 + i22);
                }
                for (int i23 = 0; i23 < i3; i23++) {
                    C165617ti.A0h(bArr, bArr16, i + i23, i23);
                }
            } else {
                throw C22697At1.A00();
            }
        }
        return i3;
    }
}
