package X;

/* renamed from: X.AZe  reason: case insensitive filesystem */
public class C21750AZe implements B35 {
    public int A00;
    public int A01;
    public B35 A02;
    public byte[] A03;
    public byte[] A04;
    public boolean A05;
    public byte[] A06;

    public C21750AZe(B35 b35) {
        this.A02 = b35;
        int B8o = b35.B8o();
        this.A00 = B8o;
        this.A06 = new byte[B8o];
        this.A03 = new byte[B8o];
        this.A04 = new byte[B8o];
    }

    public int B8o() {
        return this.A02.B8o();
    }

    public void BKQ(C16590pl r3, boolean z) {
        this.A05 = z;
        reset();
        this.A02.BKQ(r3, true);
    }

    public void reset() {
        this.A01 = 0;
        byte[] bArr = this.A06;
        byte[] bArr2 = this.A03;
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        this.A02.reset();
    }

    public int BmM(byte[] bArr, byte[] bArr2, int i, int i2) {
        boolean z = this.A05;
        int i3 = this.A00;
        int i4 = i + i3;
        int length = bArr.length;
        if (z) {
            if (i4 > length) {
                throw C22702At6.A01();
            } else if (i2 + i3 <= bArr2.length) {
                int i5 = this.A01;
                int i6 = 2;
                if (i5 > i3) {
                    byte[] bArr3 = this.A03;
                    byte b = bArr[i];
                    byte[] bArr4 = this.A04;
                    byte b2 = (byte) (b ^ bArr4[i3 - 2]);
                    bArr2[i2] = b2;
                    bArr3[i3 - 2] = b2;
                    byte b3 = (byte) (bArr[i + 1] ^ bArr4[i3 - 1]);
                    bArr2[i2 + 1] = b3;
                    bArr3[i3 - 1] = b3;
                    this.A02.BmM(bArr3, bArr4, 0, 0);
                    while (i6 < i3) {
                        int i7 = i6 - 2;
                        byte b4 = (byte) (bArr[i + i6] ^ bArr4[i7]);
                        bArr2[i2 + i6] = b4;
                        bArr3[i7] = b4;
                        i6++;
                    }
                } else if (i5 == 0) {
                    B35 b35 = this.A02;
                    byte[] bArr5 = this.A03;
                    byte[] bArr6 = this.A04;
                    b35.BmM(bArr5, bArr6, 0, 0);
                    for (int i8 = 0; i8 < i3; i8++) {
                        byte b5 = (byte) (bArr[i + i8] ^ bArr6[i8]);
                        bArr2[i2 + i8] = b5;
                        bArr5[i8] = b5;
                    }
                } else if (i5 == i3) {
                    B35 b352 = this.A02;
                    byte[] bArr7 = this.A03;
                    byte[] bArr8 = this.A04;
                    b352.BmM(bArr7, bArr8, 0, 0);
                    C165577te.A1T(bArr8, bArr2, 0, bArr[i], i2);
                    C165577te.A1T(bArr8, bArr2, 1, bArr[i + 1], i2 + 1);
                    int i9 = i3 - 2;
                    System.arraycopy(bArr7, 2, bArr7, 0, i9);
                    System.arraycopy(bArr2, i2, bArr7, i9, 2);
                    b352.BmM(bArr7, bArr8, 0, 0);
                    while (i6 < i3) {
                        int i10 = i6 - 2;
                        byte b6 = (byte) (bArr[i + i6] ^ bArr8[i10]);
                        bArr2[i2 + i6] = b6;
                        bArr7[i10] = b6;
                        i6++;
                    }
                }
                return i3;
            } else {
                throw C22697At1.A00();
            }
        } else if (i4 > length) {
            throw C22702At6.A01();
        } else if (i2 + i3 <= bArr2.length) {
            int i11 = this.A01;
            int i12 = 2;
            if (i11 > i3) {
                byte b7 = bArr[i];
                byte[] bArr9 = this.A03;
                bArr9[i3 - 2] = b7;
                byte[] bArr10 = this.A04;
                C165577te.A1T(bArr10, bArr2, i3 - 2, b7, i2);
                byte b8 = bArr[i + 1];
                bArr9[i3 - 1] = b8;
                C165577te.A1T(bArr10, bArr2, i3 - 1, b8, i2 + 1);
                this.A02.BmM(bArr9, bArr10, 0, 0);
                while (i12 < i3) {
                    byte b9 = bArr[i + i12];
                    int i13 = i12 - 2;
                    bArr9[i13] = b9;
                    C165577te.A1T(bArr10, bArr2, i13, b9, i2 + i12);
                    i12++;
                }
            } else if (i11 == 0) {
                B35 b353 = this.A02;
                byte[] bArr11 = this.A03;
                byte[] bArr12 = this.A04;
                b353.BmM(bArr11, bArr12, 0, 0);
                for (int i14 = 0; i14 < i3; i14++) {
                    int i15 = i + i14;
                    C165617ti.A0h(bArr, bArr11, i15, i14);
                    C165607th.A1R(bArr2, bArr[i15], bArr12[i14], i14);
                }
            } else if (i11 == i3) {
                B35 b354 = this.A02;
                byte[] bArr13 = this.A03;
                byte[] bArr14 = this.A04;
                b354.BmM(bArr13, bArr14, 0, 0);
                byte b10 = bArr[i];
                byte b11 = bArr[i + 1];
                C165577te.A1T(bArr14, bArr2, 0, b10, i2);
                C165577te.A1T(bArr14, bArr2, 1, b11, i2 + 1);
                System.arraycopy(bArr13, 2, bArr13, 0, i3 - 2);
                bArr13[i3 - 2] = b10;
                bArr13[i3 - 1] = b11;
                b354.BmM(bArr13, bArr14, 0, 0);
                while (i12 < i3) {
                    byte b12 = bArr[i + i12];
                    int i16 = i12 - 2;
                    bArr13[i16] = b12;
                    C165577te.A1T(bArr14, bArr2, i16, b12, i2 + i12);
                    i12++;
                }
            }
            return i3;
        } else {
            throw C22697At1.A00();
        }
        this.A01 += i3;
        return i3;
    }

    public String B8R() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C165597tg.A1J(A0u, this.A02);
        return AnonymousClass000.A0q("/OpenPGPCFB", A0u);
    }
}
