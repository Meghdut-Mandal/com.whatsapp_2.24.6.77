package X;

import java.util.Arrays;

/* renamed from: X.AZt  reason: case insensitive filesystem */
public class C21761AZt implements C23129B6k {
    public static long[] A06 = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};
    public int A00;
    public int A01;
    public int A02;
    public boolean A03;
    public byte[] A04;
    public long[] A05;

    public C21761AZt() {
        this(256);
    }

    private void A01() {
        long j;
        long[] jArr = this.A05;
        int i = 0;
        long j2 = jArr[0];
        boolean z = true;
        long j3 = jArr[1];
        long j4 = jArr[2];
        char c = 3;
        long j5 = jArr[3];
        long j6 = jArr[4];
        long j7 = jArr[5];
        long j8 = jArr[6];
        long j9 = jArr[7];
        long j10 = jArr[8];
        long j11 = jArr[9];
        long j12 = jArr[10];
        long j13 = jArr[11];
        long j14 = jArr[12];
        long j15 = jArr[13];
        long j16 = jArr[14];
        long j17 = jArr[15];
        long j18 = jArr[16];
        long j19 = jArr[17];
        long j20 = jArr[18];
        long j21 = jArr[19];
        long j22 = jArr[20];
        long j23 = jArr[21];
        long j24 = jArr[22];
        long j25 = jArr[23];
        long j26 = jArr[24];
        do {
            long j27 = (((j2 ^ j7) ^ j12) ^ j17) ^ j22;
            long j28 = (((j3 ^ j8) ^ j13) ^ j18) ^ j23;
            long j29 = (((j4 ^ j9) ^ j14) ^ j19) ^ j24;
            long j30 = (((j5 ^ j10) ^ j15) ^ j20) ^ j25;
            long j31 = (((j6 ^ j11) ^ j16) ^ j21) ^ j26;
            long j32 = ((j28 << (z ? 1 : 0)) | (j28 >>> -1)) ^ j31;
            long j33 = ((j29 << z) | (j29 >>> -1)) ^ j27;
            long j34 = ((j30 << z) | (j30 >>> -1)) ^ j28;
            long j35 = ((j31 << z) | (j31 >>> -1)) ^ j29;
            long j36 = ((j27 << z) | (j27 >>> -1)) ^ j30;
            long j37 = j2 ^ j32;
            long j38 = j7 ^ j32;
            long j39 = j12 ^ j32;
            long j40 = j17 ^ j32;
            long j41 = j22 ^ j32;
            long j42 = j3 ^ j33;
            long j43 = j8 ^ j33;
            long j44 = j13 ^ j33;
            long j45 = j18 ^ j33;
            long j46 = j23 ^ j33;
            long j47 = j4 ^ j34;
            long j48 = j9 ^ j34;
            long j49 = j14 ^ j34;
            long j50 = j19 ^ j34;
            long j51 = j24 ^ j34;
            long j52 = j5 ^ j35;
            long j53 = j10 ^ j35;
            long j54 = j15 ^ j35;
            long j55 = j20 ^ j35;
            long j56 = j25 ^ j35;
            long j57 = j6 ^ j36;
            long j58 = j11 ^ j36;
            long j59 = j16 ^ j36;
            long j60 = j21 ^ j36;
            long j61 = j26 ^ j36;
            long j62 = (j42 << z) | (j42 >>> 63);
            long j63 = (j43 << 44) | (j43 >>> 20);
            long j64 = (j58 << 20) | (j58 >>> 44);
            long j65 = (j51 << 61) | (j51 >>> c);
            long j66 = (j59 << 39) | (j59 >>> 25);
            long j67 = (j41 << 18) | (j41 >>> 46);
            long j68 = (j47 << 62) | (j47 >>> 2);
            long j69 = (j49 << 43) | (j49 >>> 21);
            long j70 = (j54 << 25) | (j54 >>> 39);
            long j71 = (j60 << 8) | (j60 >>> 56);
            long j72 = (j56 << 56) | (j56 >>> 8);
            long j73 = (j40 << 41) | (j40 >>> 23);
            long j74 = (j57 << 27) | (j57 >>> 37);
            long j75 = (j61 << 14) | (j61 >>> 50);
            long j76 = (j46 << 2) | (j46 >>> 62);
            long j77 = (j53 << 55) | (j53 >>> 9);
            long j78 = (j45 << 45) | (j45 >>> 19);
            long j79 = (j38 << 36) | (j38 >>> 28);
            long j80 = (j52 << 28) | (j52 >>> 36);
            long j81 = (j55 << 21) | (j55 >>> 43);
            long j82 = (j50 << 15) | (j50 >>> 49);
            long j83 = (j44 << 10) | (j44 >>> 54);
            long j84 = (j48 << 6) | (j48 >>> 58);
            long j85 = (j39 << 3) | (j39 >>> 61);
            j3 = ((~j69) & j81) ^ j63;
            j4 = j69 ^ ((~j81) & j75);
            j5 = j81 ^ ((~j75) & j37);
            j6 = j75 ^ ((~j37) & j63);
            j7 = j80 ^ ((~j64) & j85);
            j8 = ((~j85) & j78) ^ j64;
            j9 = ((~j78) & j65) ^ j85;
            j10 = j78 ^ ((~j65) & j80);
            j11 = ((~j80) & j64) ^ j65;
            j12 = j62 ^ ((~j84) & j70);
            j13 = ((~j70) & j71) ^ j84;
            j14 = ((~j71) & j67) ^ j70;
            j15 = j71 ^ ((~j67) & j62);
            j16 = ((~j62) & j84) ^ j67;
            j17 = j74 ^ ((~j79) & j83);
            j18 = ((~j83) & j82) ^ j79;
            j19 = j83 ^ ((~j82) & j72);
            j20 = ((~j72) & j74) ^ j82;
            j21 = ((~j74) & j79) ^ j72;
            j22 = j68 ^ ((~j77) & j66);
            j23 = ((~j66) & j73) ^ j77;
            j24 = j66 ^ ((~j73) & j76);
            j25 = ((~j76) & j68) ^ j73;
            j26 = ((~j68) & j77) ^ j76;
            j = (((~j63) & j69) ^ j37) ^ A06[i];
            i++;
            c = 3;
            z = true;
            j2 = j;
        } while (i < 24);
        jArr[0] = j;
        jArr[1] = j3;
        jArr[2] = j4;
        jArr[3] = j5;
        jArr[4] = j6;
        jArr[5] = j7;
        jArr[6] = j8;
        jArr[7] = j9;
        jArr[8] = j10;
        jArr[9] = j11;
        jArr[10] = j12;
        jArr[11] = j13;
        jArr[12] = j14;
        jArr[13] = j15;
        jArr[14] = j16;
        jArr[15] = j17;
        jArr[16] = j18;
        jArr[17] = j19;
        jArr[18] = j20;
        jArr[19] = j21;
        jArr[20] = j22;
        jArr[21] = j23;
        jArr[22] = j24;
        jArr[23] = j25;
        jArr[24] = j26;
    }

    public int B5n(byte[] bArr, int i) {
        int i2 = this.A00;
        if (i2 % 8 != 0) {
            throw AnonymousClass001.A09("attempt to absorb with odd length queue");
        } else if (!this.A03) {
            byte[] bArr2 = this.A04;
            bArr2[i2 >>> 3] = (byte) (2 & ((1 << 2) - 1));
            int i3 = i2 + 2;
            this.A00 = i3;
            long j = (long) this.A01;
            int i4 = i3 >>> 3;
            C165587tf.A1T(bArr2, bArr2[i4], (byte) (1 << (i3 & 7)), i4);
            int i5 = i3 + 1;
            this.A00 = i5;
            int i6 = 0;
            if (i5 == this.A02) {
                A03(bArr2, 0);
            } else {
                int i7 = i5 >>> 6;
                int i8 = i5 & 63;
                int i9 = 0;
                for (int i10 = 0; i10 < i7; i10++) {
                    long[] jArr = this.A05;
                    jArr[i10] = jArr[i10] ^ A00(bArr2, i9);
                    i9 += 8;
                }
                if (i8 > 0) {
                    long[] jArr2 = this.A05;
                    jArr2[i7] = (((1 << i8) - 1) & A00(bArr2, i9)) ^ jArr2[i7];
                }
            }
            long[] jArr3 = this.A05;
            int i11 = (this.A02 - 1) >>> 6;
            jArr3[i11] = jArr3[i11] ^ Long.MIN_VALUE;
            this.A00 = 0;
            this.A03 = true;
            long j2 = 0;
            if (j % 8 != 0) {
                throw AnonymousClass001.A09("outputLength not a multiple of 8");
            }
            while (j2 < j) {
                if (i6 == 0) {
                    A01();
                    i6 = this.A02;
                    int i12 = i6 >>> 6;
                    int i13 = 0;
                    for (int i14 = 0; i14 < i12; i14++) {
                        C202779me.A04(bArr2, i13, jArr3[i14]);
                        i13 += 8;
                    }
                    this.A00 = i6;
                }
                int min = (int) Math.min((long) i6, j - j2);
                System.arraycopy(bArr2, (this.A02 - i6) / 8, bArr, ((int) (j2 / 8)) + i, min / 8);
                i6 = this.A00 - min;
                this.A00 = i6;
                j2 += (long) min;
            }
            reset();
            return this.A01 / 8;
        } else {
            throw AnonymousClass001.A09("attempt to absorb while squeezing");
        }
    }

    public int B96() {
        return this.A02 / 8;
    }

    public int BB8() {
        return this.A01 / 8;
    }

    public void reset() {
        A02(this.A01);
    }

    public C21761AZt(int i) {
        if (i == 224 || i == 256 || i == 384 || i == 512) {
            this.A05 = new long[25];
            this.A04 = new byte[192];
            A02(i);
            return;
        }
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("'bitLength' ");
        A0u.append(i);
        throw AnonymousClass000.A0c(" not supported for SHA-3", A0u);
    }

    private void A02(int i) {
        if (i == 128 || i == 224 || i == 256 || i == 288 || i == 384 || i == 512) {
            int i2 = 1600 - (i << 1);
            if (i2 <= 0 || i2 >= 1600 || i2 % 64 != 0) {
                throw AnonymousClass001.A09("invalid rate value");
            }
            this.A02 = i2;
            int i3 = 0;
            while (true) {
                long[] jArr = this.A05;
                if (i3 < 25) {
                    jArr[i3] = 0;
                    i3++;
                } else {
                    Arrays.fill(this.A04, (byte) 0);
                    this.A00 = 0;
                    this.A03 = false;
                    this.A01 = (1600 - i2) / 2;
                    return;
                }
            }
        } else {
            throw AnonymousClass001.A08("bitLength must be one of 128, 224, 256, 288, 384, or 512.");
        }
    }

    private void A03(byte[] bArr, int i) {
        int i2 = this.A02 >>> 6;
        for (int i3 = 0; i3 < i2; i3++) {
            long[] jArr = this.A05;
            jArr[i3] = jArr[i3] ^ A00(bArr, i);
            i += 8;
        }
        long[] jArr2 = this.A05;
        byte[] bArr2 = new byte[200];
        int i4 = 0;
        int i5 = 0;
        do {
            C202779me.A04(bArr2, i5, jArr2[i4]);
            i5 += 8;
            i4++;
        } while (i4 != 25);
        AnonymousClass11q.A02(C202439lp.A03(bArr2, 0, 200));
        A01();
    }

    public void BwT(byte b) {
        int i = this.A00;
        if (i % 8 != 0) {
            throw AnonymousClass001.A09("attempt to absorb with odd length queue");
        } else if (!this.A03) {
            byte[] bArr = this.A04;
            bArr[i >>> 3] = b;
            int i2 = i + 8;
            this.A00 = i2;
            if (i2 == this.A02) {
                A03(bArr, 0);
                this.A00 = 0;
            }
        } else {
            throw AnonymousClass001.A09("attempt to absorb while squeezing");
        }
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = this.A00;
        if (i5 % 8 != 0) {
            throw AnonymousClass001.A09("attempt to absorb with odd length queue");
        } else if (!this.A03) {
            int i6 = i5 >>> 3;
            int i7 = this.A02 >>> 3;
            int i8 = i7 - i6;
            if (i2 < i8) {
                System.arraycopy(bArr, i, this.A04, i6, i2);
                i4 = this.A00 + (i2 << 3);
            } else {
                if (i6 > 0) {
                    byte[] bArr2 = this.A04;
                    System.arraycopy(bArr, i, bArr2, i6, i8);
                    A03(bArr2, 0);
                } else {
                    i8 = 0;
                }
                while (true) {
                    i3 = i2 - i8;
                    if (i3 < i7) {
                        break;
                    }
                    A03(bArr, i + i8);
                    i8 += i7;
                }
                System.arraycopy(bArr, i + i8, this.A04, 0, i3);
                i4 = i3 << 3;
            }
            this.A00 = i4;
        } else {
            throw AnonymousClass001.A09("attempt to absorb while squeezing");
        }
    }

    public static long A00(byte[] bArr, int i) {
        return ((((long) C165577te.A0B(bArr, i + 4)) & 4294967295L) << 32) | (((long) C165577te.A0B(bArr, i)) & 4294967295L);
    }

    public String B8R() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SHA3-");
        return C36381kD.A10(A0u, this.A01);
    }
}
