package X;

import java.lang.reflect.Array;

/* renamed from: X.AaO  reason: case insensitive filesystem */
public class C21791AaO implements B21, C23129B6k {
    public static final byte[] A0I = {0, -1, 0, -1, 0, -1, 0, -1, -1, 0, -1, 0, -1, 0, -1, 0, 0, -1, -1, 0, -1, 0, 0, -1, -1, 0, 0, 0, -1, -1, 0, -1};
    public int A00;
    public long A01;
    public B35 A02;
    public byte[] A03;
    public byte[] A04 = new byte[32];
    public byte[] A05;
    public byte[] A06 = new byte[32];
    public byte[] A07;
    public byte[] A08;
    public byte[] A09;
    public byte[] A0A;
    public byte[] A0B;
    public short[] A0C;
    public short[] A0D;
    public byte[][] A0E;
    public byte[] A0F = new byte[32];
    public byte[] A0G = new byte[32];
    public byte[] A0H;

    private void A01(byte[] bArr) {
        byte[] bArr2;
        int i = 0;
        do {
            bArr2 = this.A0A;
            C165577te.A1T(bArr, bArr2, i + 8, bArr[i], i);
            i++;
        } while (i < 8);
        System.arraycopy(bArr, 8, bArr, 0, 24);
        System.arraycopy(bArr2, 0, bArr, 24, 8);
    }

    public void A03(byte[] bArr) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4 = this.A0G;
        System.arraycopy(bArr, 0, bArr4, 0, 32);
        byte[] bArr5 = this.A0F;
        byte[] bArr6 = this.A07;
        System.arraycopy(bArr5, 0, bArr6, 0, 32);
        System.arraycopy(bArr4, 0, this.A08, 0, 32);
        int i = 0;
        do {
            bArr2 = this.A09;
            C165607th.A1R(bArr2, bArr6[i], this.A08[i], i);
            i++;
        } while (i < 32);
        int i2 = 0;
        do {
            bArr3 = this.A03;
            int i3 = i2 * 4;
            C165617ti.A0h(bArr2, bArr3, i2, i3);
            C165617ti.A0h(bArr2, bArr3, i2 + 8, i3 + 1);
            C165617ti.A0h(bArr2, bArr3, i2 + 16, i3 + 2);
            C165617ti.A0h(bArr2, bArr3, i2 + 24, i3 + 3);
            i2++;
        } while (i2 < 8);
        byte[] bArr7 = this.A05;
        B35 b35 = this.A02;
        b35.BKQ(new AZr(bArr3), true);
        b35.BmM(bArr5, bArr7, 0, 0);
        int i4 = 1;
        do {
            A01(bArr6);
            int i5 = 0;
            do {
                C165607th.A1R(bArr6, bArr6[i5], this.A0E[i4][i5], i5);
                i5++;
            } while (i5 < 32);
            byte[] bArr8 = this.A08;
            A01(bArr8);
            A01(bArr8);
            this.A08 = bArr8;
            int i6 = 0;
            do {
                C165607th.A1R(bArr2, bArr6[i6], bArr8[i6], i6);
                i6++;
            } while (i6 < 32);
            int i7 = 0;
            do {
                int i8 = i7 * 4;
                C165617ti.A0h(bArr2, bArr3, i7, i8);
                C165617ti.A0h(bArr2, bArr3, i7 + 8, i8 + 1);
                C165617ti.A0h(bArr2, bArr3, i7 + 16, i8 + 2);
                C165617ti.A0h(bArr2, bArr3, i7 + 24, i8 + 3);
                i7++;
            } while (i7 < 8);
            int i9 = i4 * 8;
            b35.BKQ(new AZr(bArr3), true);
            b35.BmM(bArr5, bArr7, i9, i9);
            i4++;
        } while (i4 < 4);
        int i10 = 0;
        do {
            A02(bArr7);
            i10++;
        } while (i10 < 12);
        int i11 = 0;
        do {
            C165587tf.A1U(bArr7, bArr4, i11);
            i11++;
        } while (i11 < 32);
        A02(bArr7);
        int i12 = 0;
        do {
            C165607th.A1R(bArr7, bArr5[i12], bArr7[i12], i12);
            i12++;
        } while (i12 < 32);
        int i13 = 0;
        do {
            A02(bArr7);
            i13++;
        } while (i13 < 61);
        System.arraycopy(bArr7, 0, bArr5, 0, 32);
    }

    public B21 B3i() {
        return new C21791AaO(this);
    }

    public String B8R() {
        return "GOST3411";
    }

    public int B96() {
        return 32;
    }

    public int BB8() {
        return 32;
    }

    public void BoU(B21 b21) {
        C21791AaO aaO = (C21791AaO) b21;
        byte[] bArr = aaO.A0H;
        this.A0H = bArr;
        this.A02.BKQ(new C21757AZl(bArr), true);
        reset();
        System.arraycopy(aaO.A0F, 0, this.A0F, 0, 32);
        System.arraycopy(aaO.A04, 0, this.A04, 0, 32);
        System.arraycopy(aaO.A0G, 0, this.A0G, 0, 32);
        System.arraycopy(aaO.A06, 0, this.A06, 0, 32);
        byte[][] bArr2 = aaO.A0E;
        byte[] bArr3 = bArr2[1];
        byte[][] bArr4 = this.A0E;
        System.arraycopy(bArr3, 0, bArr4[1], 0, bArr3.length);
        byte[] bArr5 = bArr2[2];
        System.arraycopy(bArr5, 0, bArr4[2], 0, bArr5.length);
        byte[] bArr6 = bArr2[3];
        System.arraycopy(bArr6, 0, bArr4[3], 0, bArr6.length);
        System.arraycopy(aaO.A0B, 0, this.A0B, 0, 32);
        this.A00 = aaO.A00;
        this.A01 = aaO.A01;
    }

    public void reset() {
        byte[][] bArr;
        this.A01 = 0;
        this.A00 = 0;
        int i = 0;
        while (true) {
            byte[] bArr2 = this.A0F;
            if (i >= 32) {
                break;
            }
            bArr2[i] = 0;
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.A04;
            if (i2 >= 32) {
                break;
            }
            bArr3[i2] = 0;
            i2++;
        }
        int i3 = 0;
        while (true) {
            byte[] bArr4 = this.A0G;
            if (i3 >= 32) {
                break;
            }
            bArr4[i3] = 0;
            i3++;
        }
        int i4 = 0;
        while (true) {
            bArr = this.A0E;
            byte[] bArr5 = bArr[1];
            if (i4 >= bArr5.length) {
                break;
            }
            bArr5[i4] = 0;
            i4++;
        }
        int i5 = 0;
        while (true) {
            byte[] bArr6 = bArr[3];
            if (i5 >= bArr6.length) {
                break;
            }
            bArr6[i5] = 0;
            i5++;
        }
        int i6 = 0;
        while (true) {
            byte[] bArr7 = this.A06;
            if (i6 >= 32) {
                break;
            }
            bArr7[i6] = 0;
            i6++;
        }
        int i7 = 0;
        while (true) {
            byte[] bArr8 = this.A0B;
            if (i7 < 32) {
                bArr8[i7] = 0;
                i7++;
            } else {
                System.arraycopy(A0I, 0, bArr[2], 0, 32);
                return;
            }
        }
    }

    public static void A00(C21791AaO aaO, int[] iArr) {
        aaO.A0E = (byte[][]) Array.newInstance(byte.class, iArr);
        aaO.A0B = new byte[32];
        aaO.A02 = new C21754AZi();
        aaO.A03 = new byte[32];
        aaO.A0A = new byte[8];
        aaO.A0C = new short[16];
        aaO.A0D = new short[16];
        aaO.A05 = new byte[32];
        aaO.A07 = new byte[32];
        aaO.A08 = new byte[32];
        aaO.A09 = new byte[32];
    }

    private void A02(byte[] bArr) {
        short[] sArr = this.A0C;
        int i = 0;
        do {
            int i2 = i * 2;
            sArr[i] = (short) ((bArr[i2] & 255) | ((bArr[i2 + 1] << 8) & 65280));
            i++;
        } while (i < 16);
        short[] sArr2 = this.A0D;
        sArr2[15] = (short) (((((sArr[0] ^ sArr[1]) ^ sArr[2]) ^ sArr[3]) ^ sArr[12]) ^ sArr[15]);
        System.arraycopy(sArr, 1, sArr2, 0, 15);
        int i3 = 0;
        do {
            int i4 = i3 * 2;
            short s = sArr2[i3];
            bArr[i4 + 1] = (byte) (s >> 8);
            i3 = C165617ti.A02(s, bArr, i4, i3);
        } while (i3 < 16);
    }

    public int B5n(byte[] bArr, int i) {
        byte[] bArr2 = this.A04;
        C202779me.A04(bArr2, 0, this.A01 * 8);
        while (this.A00 != 0) {
            BwT((byte) 0);
        }
        A03(bArr2);
        A03(this.A06);
        System.arraycopy(this.A0F, 0, bArr, i, 32);
        reset();
        return 32;
    }

    public void BwT(byte b) {
        byte[] bArr = this.A0B;
        int i = this.A00;
        int i2 = i + 1;
        this.A00 = i2;
        bArr[i] = b;
        if (i2 == 32) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte[] bArr2 = this.A06;
                if (i3 == 32) {
                    break;
                }
                int i5 = (bArr2[i3] & 255) + (bArr[i3] & 255) + i4;
                bArr2[i3] = (byte) i5;
                i4 = i5 >>> 8;
                i3++;
            }
            A03(bArr);
            this.A00 = 0;
        }
        this.A01++;
    }

    public void update(byte[] bArr, int i, int i2) {
        while (this.A00 != 0 && i2 > 0) {
            BwT(bArr[i]);
            i++;
            i2--;
        }
        while (true) {
            byte[] bArr2 = this.A0B;
            if (i2 <= 32) {
                break;
            }
            System.arraycopy(bArr, i, bArr2, 0, 32);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                byte[] bArr3 = this.A06;
                if (i3 == 32) {
                    break;
                }
                int i5 = (bArr3[i3] & 255) + (bArr2[i3] & 255) + i4;
                bArr3[i3] = (byte) i5;
                i4 = i5 >>> 8;
                i3++;
            }
            A03(bArr2);
            i += 32;
            i2 -= 32;
            this.A01 += (long) 32;
        }
        while (i2 > 0) {
            BwT(bArr[i]);
            i++;
            i2--;
        }
    }

    public C21791AaO(C21791AaO aaO) {
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 4;
        A1O[1] = 32;
        A00(this, A1O);
        BoU(aaO);
    }

    public C21791AaO() {
        int[] A1O = C36441kJ.A1O();
        // fill-array-data instruction
        A1O[0] = 4;
        A1O[1] = 32;
        A00(this, A1O);
        byte[] bArr = (byte[]) C21754AZi.A03.get(AnonymousClass11q.A01("D-A"));
        if (bArr != null) {
            byte[] A022 = AnonymousClass124.A02(bArr);
            this.A0H = A022;
            this.A02.BKQ(new C21757AZl(A022), true);
            reset();
            return;
        }
        throw AnonymousClass001.A08("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }
}
