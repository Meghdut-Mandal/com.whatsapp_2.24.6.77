package X;

import java.util.Arrays;

/* renamed from: X.Aa6  reason: case insensitive filesystem */
public class C21773Aa6 implements C23130B6l {
    public int A00;
    public int A01;
    public int A02;
    public B3H A03;
    public C22708AtC A04;
    public boolean A05;
    public byte[] A06;
    public byte[] A07;
    public boolean A08;
    public byte[] A09;
    public byte[] A0A;
    public byte[] A0B;

    private void A01() {
        if (!this.A08) {
            this.A08 = true;
            B3H b3h = this.A03;
            b3h.B5n(this.A09, 0);
            int i = this.A00;
            byte[] bArr = new byte[i];
            bArr[i - 1] = 2;
            b3h.update(bArr, 0, i);
        }
    }

    public byte[] BDj() {
        int i = this.A02;
        byte[] bArr = new byte[i];
        System.arraycopy(this.A07, 0, bArr, 0, i);
        return bArr;
    }

    public int BEq(int i) {
        int i2 = i + this.A01;
        boolean z = this.A05;
        int i3 = this.A02;
        if (z) {
            return i2 + i3;
        }
        int i4 = i2;
        int i5 = i2 - i3;
        if (i4 < i3) {
            return 0;
        }
        return i5;
    }

    public int BIi(int i) {
        int i2 = i + this.A01;
        if (!this.A05) {
            int i3 = this.A02;
            int i4 = i2;
            i2 -= i3;
            if (i4 < i3) {
                return 0;
            }
        }
        return i2 - (i2 % this.A00);
    }

    private void A00() {
        byte[] bArr = new byte[this.A00];
        int i = 0;
        this.A03.B5n(bArr, 0);
        while (true) {
            byte[] bArr2 = this.A07;
            if (i < bArr2.length) {
                C165607th.A1R(bArr2, this.A0B[i] ^ this.A09[i], bArr[i], i);
                i++;
            } else {
                return;
            }
        }
    }

    private void A02(boolean z) {
        this.A04.reset();
        B3H b3h = this.A03;
        b3h.reset();
        this.A01 = 0;
        Arrays.fill(this.A06, (byte) 0);
        if (z) {
            Arrays.fill(this.A07, (byte) 0);
        }
        int i = this.A00;
        byte[] bArr = new byte[i];
        bArr[i - 1] = 1;
        b3h.update(bArr, 0, i);
        this.A08 = false;
        byte[] bArr2 = this.A0A;
        if (bArr2 != null) {
            BmL(bArr2, 0, bArr2.length);
        }
    }

    public B35 BIf() {
        return this.A04.A00;
    }

    public void BKQ(C16590pl r8, boolean z) {
        byte[] bArr;
        int BDk;
        C16590pl r1;
        this.A05 = z;
        if (r8 instanceof AZo) {
            AZo aZo = (AZo) r8;
            bArr = AnonymousClass124.A02(aZo.A03);
            this.A0A = AnonymousClass124.A02(aZo.A02);
            BDk = aZo.A00 / 8;
            this.A02 = BDk;
            r1 = aZo.A01;
        } else if (r8 instanceof C21760AZs) {
            C21760AZs aZs = (C21760AZs) r8;
            bArr = aZs.A01;
            this.A0A = null;
            BDk = this.A03.BDk() / 2;
            this.A02 = BDk;
            r1 = aZs.A00;
        } else {
            throw AnonymousClass001.A08("invalid parameters passed to EAX");
        }
        int i = this.A00;
        int i2 = i;
        if (!z) {
            i += BDk;
        }
        this.A06 = new byte[i];
        byte[] bArr2 = new byte[i2];
        B3H b3h = this.A03;
        b3h.BKO(r1);
        bArr2[i2 - 1] = 0;
        b3h.update(bArr2, 0, i2);
        b3h.update(bArr, 0, bArr.length);
        byte[] bArr3 = this.A0B;
        b3h.B5n(bArr3, 0);
        this.A04.BKQ(new C21760AZs((C16590pl) null, bArr3), true);
        A02(true);
    }

    public void BmL(byte[] bArr, int i, int i2) {
        if (!this.A08) {
            this.A03.update(bArr, i, i2);
            return;
        }
        throw AnonymousClass001.A09("AAD data cannot be added after encryption/decryption processing has begun.");
    }

    public C21773Aa6(B35 b35) {
        int B8o = b35.B8o();
        this.A00 = B8o;
        C21765AZy aZy = new C21765AZy(b35);
        this.A03 = aZy;
        this.A07 = new byte[B8o];
        int i = aZy.A01;
        this.A09 = new byte[i];
        this.A0B = new byte[i];
        this.A04 = new C22708AtC(b35);
    }

    public int B5n(byte[] bArr, int i) {
        A01();
        int i2 = this.A01;
        byte[] bArr2 = this.A06;
        byte[] bArr3 = new byte[bArr2.length];
        this.A01 = 0;
        if (this.A05) {
            int i3 = i + i2;
            if (bArr.length >= this.A02 + i3) {
                this.A04.BmM(bArr2, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr, i, i2);
                this.A03.update(bArr3, 0, i2);
                A00();
                System.arraycopy(this.A07, 0, bArr, i3, this.A02);
                A02(false);
                return i2 + this.A02;
            }
            throw new C22697At1("Output buffer too short");
        }
        int i4 = this.A02;
        if (i2 < i4) {
            throw new C22696At0("data too short");
        } else if (bArr.length >= (i + i2) - i4) {
            if (i2 > i4) {
                this.A03.update(bArr2, 0, i2 - i4);
                this.A04.BmM(this.A06, bArr3, 0, 0);
                System.arraycopy(bArr3, 0, bArr, i, i2 - this.A02);
            }
            A00();
            byte[] bArr4 = this.A06;
            int i5 = this.A02;
            int i6 = i2 - i5;
            byte b = 0;
            for (int i7 = 0; i7 < i5; i7++) {
                b |= this.A07[i7] ^ bArr4[i6 + i7];
            }
            if (b == 0) {
                A02(false);
                return i2 - this.A02;
            }
            throw new C22696At0("mac check in EAX failed");
        } else {
            throw new C22697At1("Output buffer too short");
        }
    }

    public String B8R() {
        StringBuilder A0u = AnonymousClass000.A0u();
        C165597tg.A1J(A0u, this.A04.A00);
        return AnonymousClass000.A0q("/EAX", A0u);
    }

    public int BmN(byte[] bArr, int i, int i2, byte[] bArr2, int i3) {
        int i4;
        A01();
        if (bArr.length >= i + i2) {
            int i5 = 0;
            for (int i6 = 0; i6 != i2; i6++) {
                byte b = bArr[i + i6];
                int i7 = i3 + i5;
                byte[] bArr3 = this.A06;
                int i8 = this.A01;
                int i9 = i8 + 1;
                this.A01 = i9;
                bArr3[i8] = b;
                if (i9 == bArr3.length) {
                    int length = bArr2.length;
                    int i10 = this.A00;
                    if (length >= i7 + i10) {
                        if (this.A05) {
                            i4 = this.A04.BmM(bArr3, bArr2, 0, i7);
                            this.A03.update(bArr2, i7, i10);
                        } else {
                            this.A03.update(bArr3, 0, i10);
                            i4 = this.A04.BmM(this.A06, bArr2, 0, i7);
                        }
                        this.A01 = 0;
                        if (!this.A05) {
                            byte[] bArr4 = this.A06;
                            System.arraycopy(bArr4, i10, bArr4, 0, this.A02);
                            this.A01 = this.A02;
                        }
                    } else {
                        throw new C22697At1("Output buffer is too short");
                    }
                } else {
                    i4 = 0;
                }
                i5 += i4;
            }
            return i5;
        }
        throw new C22702At6("Input buffer too short");
    }
}
