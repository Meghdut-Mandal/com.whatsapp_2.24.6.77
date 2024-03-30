package X;

/* renamed from: X.Aa3  reason: case insensitive filesystem */
public class C21770Aa3 implements C23069B2y {
    public B35 A00;
    public AZr A01;
    public byte[] A02 = null;
    public boolean A03;
    public byte[] A04;
    public byte[] A05;

    public C21770Aa3(B35 b35) {
        byte[] bArr = {-90, 89, 89, -90};
        this.A04 = bArr;
        this.A05 = bArr;
        this.A00 = b35;
    }

    public String B8R() {
        return this.A00.B8R();
    }

    public byte[] BxW(byte[] bArr, int i, int i2) {
        if (this.A03) {
            byte[] bArr2 = new byte[8];
            byte[] bArr3 = new byte[4];
            int i3 = i2;
            C202779me.A02(bArr3, i3, 0);
            byte[] bArr4 = this.A05;
            int i4 = 0;
            System.arraycopy(bArr4, 0, bArr2, 0, bArr4.length);
            System.arraycopy(bArr3, 0, bArr2, this.A05.length, 4);
            byte[] bArr5 = new byte[i3];
            System.arraycopy(bArr, 0, bArr5, 0, i3);
            int i5 = (8 - (i2 % 8)) % 8;
            int i6 = i2 + i5;
            byte[] bArr6 = new byte[i6];
            System.arraycopy(bArr5, 0, bArr6, 0, i3);
            if (i5 != 0) {
                System.arraycopy(new byte[i5], 0, bArr6, i3, i5);
            }
            if (i6 == 8) {
                byte[] bArr7 = new byte[16];
                System.arraycopy(bArr2, 0, bArr7, 0, 8);
                System.arraycopy(bArr6, 0, bArr7, 8, i6);
                B35 b35 = this.A00;
                b35.BKQ(this.A01, true);
                do {
                    b35.BmM(bArr7, bArr7, i4, i4);
                    i4 += b35.B8o();
                } while (i4 < 16);
                return bArr7;
            }
            B35 b352 = this.A00;
            C21760AZs aZs = new C21760AZs(this.A01, bArr2);
            byte[] bArr8 = aZs.A01;
            C16590pl r1 = aZs.A00;
            int length = bArr8.length;
            if (length == 8) {
                int i7 = i6 / 8;
                if (i7 * 8 == i6) {
                    byte[] bArr9 = new byte[(i6 + 8)];
                    byte[] bArr10 = new byte[16];
                    System.arraycopy(bArr8, 0, bArr9, 0, length);
                    System.arraycopy(bArr6, 0, bArr9, length, i6);
                    b352.BKQ(r1, true);
                    int i8 = 0;
                    do {
                        for (int i9 = 1; i9 <= i7; i9++) {
                            System.arraycopy(bArr9, 0, bArr10, 0, length);
                            int i10 = i9 * 8;
                            System.arraycopy(bArr9, i10, bArr10, length, 8);
                            b352.BmM(bArr10, bArr10, 0, 0);
                            int i11 = (i7 * i8) + i9;
                            int i12 = 1;
                            while (i11 != 0) {
                                int i13 = length - i12;
                                C165607th.A1R(bArr10, (byte) i11, bArr10[i13], i13);
                                i11 >>>= 8;
                                i12++;
                            }
                            System.arraycopy(bArr10, 0, bArr9, 0, 8);
                            System.arraycopy(bArr10, 8, bArr9, i10, 8);
                        }
                        i8++;
                    } while (i8 != 6);
                    return bArr9;
                }
                throw new C22702At6("wrap data must be a multiple of 8 bytes");
            }
            throw AnonymousClass001.A08("IV not equal to 8");
        }
        throw AnonymousClass001.A09("not set for wrapping");
    }

    public void BKQ(C16590pl r3, boolean z) {
        this.A03 = z;
        if (r3 instanceof C21759AZn) {
            r3 = ((C21759AZn) r3).A01;
        }
        if (r3 instanceof AZr) {
            this.A01 = (AZr) r3;
            this.A05 = this.A04;
        } else if (r3 instanceof C21760AZs) {
            C21760AZs aZs = (C21760AZs) r3;
            byte[] bArr = aZs.A01;
            this.A05 = bArr;
            this.A01 = (AZr) aZs.A00;
            if (bArr.length != 4) {
                throw AnonymousClass001.A08("IV length not equal to 4");
            }
        }
    }

    public byte[] BwP(byte[] bArr, int i, int i2) {
        byte[] bArr2;
        int i3 = i2;
        if (!this.A03) {
            int i4 = i2 / 8;
            if (i4 * 8 != i3) {
                throw new C22696At0("unwrap data must be a multiple of 8 bytes");
            } else if (i4 > 1) {
                byte[] bArr3 = new byte[i3];
                byte[] bArr4 = bArr;
                System.arraycopy(bArr4, 0, bArr3, 0, i3);
                byte[] bArr5 = new byte[i3];
                if (i4 == 2) {
                    B35 b35 = this.A00;
                    b35.BKQ(this.A01, false);
                    for (int i5 = 0; i5 < i3; i5 += b35.B8o()) {
                        b35.BmM(bArr3, bArr5, i5, i5);
                    }
                    byte[] bArr6 = new byte[8];
                    this.A02 = bArr6;
                    System.arraycopy(bArr5, 0, bArr6, 0, 8);
                    int length = this.A02.length;
                    int i6 = i2 - length;
                    bArr2 = new byte[i6];
                    System.arraycopy(bArr5, length, bArr2, 0, i6);
                } else {
                    int i7 = i2 - 8;
                    bArr2 = new byte[i7];
                    byte[] bArr7 = new byte[8];
                    byte[] bArr8 = new byte[16];
                    System.arraycopy(bArr4, 0, bArr7, 0, 8);
                    System.arraycopy(bArr4, 8, bArr2, 0, i7);
                    B35 b352 = this.A00;
                    b352.BKQ(this.A01, false);
                    int i8 = (i2 / 8) - 1;
                    int i9 = 5;
                    do {
                        for (int i10 = i8; i10 >= 1; i10--) {
                            System.arraycopy(bArr7, 0, bArr8, 0, 8);
                            int i11 = (i10 - 1) * 8;
                            System.arraycopy(bArr2, i11, bArr8, 8, 8);
                            int i12 = (i8 * i9) + i10;
                            int i13 = 1;
                            while (i12 != 0) {
                                int i14 = 8 - i13;
                                C165607th.A1R(bArr8, (byte) i12, bArr8[i14], i14);
                                i12 >>>= 8;
                                i13++;
                            }
                            b352.BmM(bArr8, bArr8, 0, 0);
                            System.arraycopy(bArr8, 0, bArr7, 0, 8);
                            System.arraycopy(bArr8, 8, bArr2, i11, 8);
                        }
                        i9--;
                    } while (i9 >= 0);
                    this.A02 = bArr7;
                }
                int i15 = 4;
                byte[] bArr9 = new byte[4];
                byte[] bArr10 = new byte[4];
                System.arraycopy(this.A02, 0, bArr9, 0, 4);
                System.arraycopy(this.A02, 4, bArr10, 0, 4);
                int A032 = C165577te.A03(bArr10[0] << 24, bArr10, (bArr10[1] & 255) << 16, 1);
                boolean A012 = AnonymousClass124.A01(bArr9, this.A05);
                int length2 = bArr2.length;
                if (A032 <= length2 - 8) {
                    A012 = false;
                }
                if (A032 > length2) {
                    A012 = false;
                }
                int i16 = length2 - A032;
                if (i16 >= 8 || i16 < 0) {
                    A012 = false;
                } else {
                    i15 = i16;
                }
                byte[] bArr11 = new byte[i15];
                System.arraycopy(bArr2, length2 - i15, bArr11, 0, i15);
                if (!AnonymousClass124.A01(bArr11, new byte[i15]) || !A012) {
                    throw new C22696At0("checksum failed");
                }
                byte[] bArr12 = new byte[A032];
                System.arraycopy(bArr2, 0, bArr12, 0, A032);
                return bArr12;
            } else {
                throw new C22696At0("unwrap data must be at least 16 bytes");
            }
        } else {
            throw AnonymousClass001.A09("not set for unwrapping");
        }
    }
}
