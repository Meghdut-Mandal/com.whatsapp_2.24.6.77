package X;

import androidx.core.view.inputmethod.EditorInfoCompat;

/* renamed from: X.AZz  reason: case insensitive filesystem */
public class C21766AZz implements B3H {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public int A0G;
    public int A0H;
    public int A0I;
    public final B35 A0J;
    public final byte[] A0K;
    public final byte[] A0L;

    public C21766AZz() {
        this.A0L = new byte[1];
        this.A0K = new byte[16];
        this.A0D = 0;
        this.A0J = null;
    }

    public int BDk() {
        return 16;
    }

    public void BwT(byte b) {
        byte[] bArr = this.A0L;
        bArr[0] = b;
        update(bArr, 0, 1);
    }

    public void reset() {
        this.A0D = 0;
        this.A0I = 0;
        this.A0H = 0;
        this.A0G = 0;
        this.A0F = 0;
        this.A0E = 0;
    }

    public void update(byte[] bArr, int i, int i2) {
        int i3 = 0;
        while (i2 > i3) {
            int i4 = this.A0D;
            if (i4 == 16) {
                A02();
                this.A0D = 0;
                i4 = 0;
            }
            int min = Math.min(i2 - i3, 16 - i4);
            System.arraycopy(bArr, i3 + i, this.A0K, i4, min);
            i3 += min;
            this.A0D += min;
        }
    }

    private void A02() {
        int i = this.A0D;
        int i2 = i;
        if (i < 16) {
            byte[] bArr = this.A0K;
            bArr[i] = 1;
            while (true) {
                i++;
                if (i >= 16) {
                    break;
                }
                bArr[i] = 0;
            }
        }
        byte[] bArr2 = this.A0K;
        long A0B2 = ((long) C165577te.A0B(bArr2, 0)) & 4294967295L;
        long A0B3 = ((long) C165577te.A0B(bArr2, 4)) & 4294967295L;
        long A0B4 = ((long) C165577te.A0B(bArr2, 8)) & 4294967295L;
        long A0B5 = 4294967295L & ((long) C165577te.A0B(bArr2, 12));
        int i3 = (int) (((long) this.A0E) + (A0B2 & 67108863));
        this.A0E = i3;
        int i4 = (int) (((long) this.A0F) + ((((A0B3 << 32) | A0B2) >>> 26) & 67108863));
        int i5 = i4;
        this.A0F = i4;
        int i6 = (int) (((long) this.A0G) + (((A0B3 | (A0B4 << 32)) >>> 20) & 67108863));
        int i7 = i6;
        this.A0G = i6;
        int i8 = (int) (((long) this.A0H) + ((((A0B5 << 32) | A0B4) >>> 14) & 67108863));
        this.A0H = i8;
        int i9 = (int) (((long) this.A0I) + (A0B5 >>> 8));
        this.A0I = i9;
        if (i2 == 16) {
            i9 += EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING;
            this.A0I = i9;
        }
        int i10 = this.A04;
        long A0C2 = C165597tg.A0C(i3) * ((long) i10);
        int i11 = this.A0C;
        long A012 = A01(i5, i11, A0C2);
        int i12 = this.A0B;
        long A013 = A01(i7, i12, A012);
        int i13 = this.A0A;
        long A014 = A01(i9, this.A09, A01(i8, i13, A013));
        int i14 = this.A05;
        long A015 = A01(i9, i13, A01(i8, i12, A01(i7, i11, A01(i5, i10, C165597tg.A0C(i3) * ((long) i14)))));
        int i15 = this.A06;
        long A016 = A01(i9, i12, A01(i8, i11, A01(i7, i10, A01(i5, i14, C165597tg.A0C(i3) * ((long) i15)))));
        int i16 = this.A07;
        long A017 = A01(i9, i11, A01(i8, i10, A01(i7, i14, A01(i5, i15, C165597tg.A0C(i3) * ((long) i16)))));
        long A018 = A01(i9, i10, A01(i8, i14, A01(i7, i15, A01(i5, i16, C165597tg.A0C(i3) * ((long) this.A08)))));
        long j = A015 + (A014 >>> 26);
        long j2 = A016 + (j >>> 26);
        this.A0G = ((int) j2) & 67108863;
        long j3 = A017 + (j2 >>> 26);
        this.A0H = ((int) j3) & 67108863;
        long j4 = A018 + (j3 >>> 26);
        this.A0I = ((int) j4) & 67108863;
        int i17 = (((int) A014) & 67108863) + (((int) (j4 >>> 26)) * 5);
        this.A0F = (((int) j) & 67108863) + (i17 >>> 26);
        this.A0E = i17 & 67108863;
    }

    public int B5n(byte[] bArr, int i) {
        if (i + 16 <= bArr.length) {
            if (this.A0D > 0) {
                A02();
            }
            int i2 = this.A0F;
            int i3 = this.A0E;
            int i4 = i2 + (i3 >>> 26);
            int i5 = this.A0G + (i4 >>> 26);
            int i6 = this.A0H + (i5 >>> 26);
            int i7 = i5 & 67108863;
            int i8 = this.A0I + (i6 >>> 26);
            int i9 = i6 & 67108863;
            int i10 = (i3 & 67108863) + ((i8 >>> 26) * 5);
            int i11 = i8 & 67108863;
            int i12 = (i4 & 67108863) + (i10 >>> 26);
            int i13 = i10 & 67108863;
            int i14 = i13 + 5;
            int i15 = (i14 >>> 26) + i12;
            int i16 = (i15 >>> 26) + i7;
            int i17 = (i16 >>> 26) + i9;
            int i18 = 67108863 & i17;
            int i19 = ((i17 >>> 26) + i11) - 67108864;
            int i20 = (i19 >>> 31) - 1;
            int i21 = ~i20;
            int i22 = (i13 & i21) | (i14 & 67108863 & i20);
            this.A0E = i22;
            int i23 = (i12 & i21) | (i15 & 67108863 & i20);
            this.A0F = i23;
            int i24 = (i7 & i21) | (i16 & 67108863 & i20);
            this.A0G = i24;
            int i25 = (i18 & i20) | (i9 & i21);
            this.A0H = i25;
            int i26 = (i11 & i21) | (i19 & i20);
            this.A0I = i26;
            long j = (((long) (i22 | (i23 << 26))) & 4294967295L) + (((long) this.A00) & 4294967295L);
            long j2 = (((long) ((i23 >>> 6) | (i24 << 20))) & 4294967295L) + (((long) this.A01) & 4294967295L);
            long j3 = (((long) ((i24 >>> 12) | (i25 << 14))) & 4294967295L) + (((long) this.A02) & 4294967295L);
            C165587tf.A1S(bArr, (int) j, i);
            long j4 = j2 + (j >>> 32);
            C165587tf.A1S(bArr, (int) j4, i + 4);
            long j5 = j3 + (j4 >>> 32);
            C165587tf.A1S(bArr, (int) j5, i + 8);
            C165587tf.A1S(bArr, (int) ((((long) ((i25 >>> 18) | (i26 << 8))) & 4294967295L) + (4294967295L & ((long) this.A03)) + (j5 >>> 32)), i + 12);
            reset();
            return 16;
        }
        throw new C22697At1("Output buffer is too short.");
    }

    public void BKO(C16590pl r11) {
        byte[] bArr;
        B35 b35 = this.A0J;
        if (b35 == null) {
            bArr = null;
        } else if (r11 instanceof C21760AZs) {
            C21760AZs aZs = (C21760AZs) r11;
            bArr = aZs.A01;
            r11 = aZs.A00;
        } else {
            throw AnonymousClass001.A08("Poly1305 requires an IV when used with a block cipher.");
        }
        if (r11 instanceof AZr) {
            byte[] bArr2 = ((AZr) r11).A00;
            if (bArr2.length == 32) {
                int i = 16;
                if (b35 == null || (bArr != null && bArr.length == 16)) {
                    int A0B2 = C165577te.A0B(bArr2, 0);
                    int A0B3 = C165577te.A0B(bArr2, 4);
                    int A0B4 = C165577te.A0B(bArr2, 8);
                    int A0B5 = C165577te.A0B(bArr2, 12);
                    this.A04 = 67108863 & A0B2;
                    int i2 = ((A0B2 >>> 26) | (A0B3 << 6)) & 67108611;
                    this.A05 = i2;
                    int i3 = ((A0B3 >>> 20) | (A0B4 << 12)) & 67092735;
                    this.A06 = i3;
                    int i4 = ((A0B4 >>> 14) | (A0B5 << 18)) & 66076671;
                    this.A07 = i4;
                    int i5 = (A0B5 >>> 8) & 1048575;
                    this.A08 = i5;
                    this.A09 = i2 * 5;
                    this.A0A = i3 * 5;
                    this.A0B = i4 * 5;
                    this.A0C = i5 * 5;
                    if (b35 != null) {
                        byte[] bArr3 = new byte[16];
                        b35.BKQ(new AZr(bArr2, 16, 16), true);
                        b35.BmM(bArr, bArr3, 0, 0);
                        bArr2 = bArr3;
                        i = 0;
                    }
                    this.A00 = C165577te.A0B(bArr2, i);
                    this.A01 = C165577te.A0B(bArr2, i + 4);
                    this.A02 = C165577te.A0B(bArr2, i + 8);
                    this.A03 = C165577te.A0B(bArr2, i + 12);
                    reset();
                    return;
                }
                throw AnonymousClass001.A08("Poly1305 requires a 128 bit IV.");
            }
            throw AnonymousClass001.A08("Poly1305 key must be 256 bits.");
        }
        throw AnonymousClass001.A08("Poly1305 requires a key.");
    }

    public C21766AZz(B35 b35) {
        this.A0L = new byte[1];
        this.A0K = new byte[16];
        this.A0D = 0;
        if (b35.B8o() == 16) {
            this.A0J = b35;
            return;
        }
        throw AnonymousClass001.A08("Poly1305 requires a 128 bit block cipher.");
    }

    public static final long A00(int i, int i2) {
        return C165597tg.A0C(i) * ((long) i2);
    }

    public static long A01(int i, int i2, long j) {
        return j + A00(i, i2);
    }
}
