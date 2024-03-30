package X;

/* renamed from: X.AtE  reason: case insensitive filesystem */
public class C22710AtE extends C21788AaL {
    public int A00;
    public int[] A01 = new int[80];
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;

    public C22710AtE() {
        reset();
    }

    public C22710AtE(C22710AtE atE) {
        super(atE);
        A0J(atE);
    }

    private void A0J(C22710AtE atE) {
        this.A02 = atE.A02;
        this.A03 = atE.A03;
        this.A04 = atE.A04;
        this.A05 = atE.A05;
        this.A06 = atE.A06;
        int[] iArr = atE.A01;
        System.arraycopy(iArr, 0, this.A01, 0, iArr.length);
        this.A00 = atE.A00;
    }

    public B21 B3i() {
        return new C22710AtE(this);
    }

    public int B5n(byte[] bArr, int i) {
        A0R();
        C202779me.A02(bArr, this.A02, i);
        C202779me.A02(bArr, this.A03, i + 4);
        C202779me.A02(bArr, this.A04, i + 8);
        C202779me.A02(bArr, this.A05, i + 12);
        C202779me.A02(bArr, this.A06, i + 16);
        reset();
        return 20;
    }

    public String B8R() {
        return "SHA-1";
    }

    public int BB8() {
        return 20;
    }

    public void BoU(B21 b21) {
        C22710AtE atE = (C22710AtE) b21;
        super.A0S(atE);
        A0J(atE);
    }

    public void reset() {
        super.reset();
        this.A02 = 1732584193;
        this.A03 = -271733879;
        this.A04 = -1732584194;
        this.A05 = 271733878;
        this.A06 = -1009589776;
        this.A00 = 0;
        int i = 0;
        while (true) {
            int[] iArr = this.A01;
            if (i != iArr.length) {
                iArr[i] = 0;
                i++;
            } else {
                return;
            }
        }
    }

    public static int A0F(int i) {
        return (i >>> 2) | (i << 30);
    }

    public static int A0G(int i, int i2, int i3, int i4) {
        return ((i << 5) | (i >>> 27)) + ((i2 ^ i3) ^ i4);
    }

    public static int A0H(int i, int i2, int i3, int i4) {
        return ((i << 5) | (i >>> 27)) + ((i2 & i4) | (i2 & i3) | (i3 & i4));
    }

    public static int A0I(int[] iArr, int i, int i2, int i3, int i4) {
        return i4 + i2 + iArr[i] + i3;
    }

    public void A0U() {
        int[] iArr;
        int i = 16;
        do {
            iArr = this.A01;
            int i2 = ((iArr[i - 3] ^ iArr[i - 8]) ^ iArr[i - 14]) ^ iArr[i - 16];
            iArr[i] = (i2 >>> 31) | (i2 << 1);
            i++;
        } while (i < 80);
        int i3 = this.A02;
        int i4 = i3;
        int i5 = this.A03;
        int i6 = i5;
        int i7 = this.A04;
        int i8 = i7;
        int i9 = this.A05;
        int i10 = i9;
        int i11 = this.A06;
        int i12 = i11;
        int i13 = 0;
        int i14 = 0;
        do {
            int i15 = i14 + 1;
            int A08 = i11 + C21788AaL.A08(i7, i5, i9, (i3 << 5) | (i3 >>> 27)) + iArr[i14] + 1518500249;
            int A0F = A0F(i5);
            int i16 = i15 + 1;
            int A0I = A0I(iArr, i15, C21788AaL.A08(A0F, i3, i7, (A08 << 5) | (A08 >>> 27)), 1518500249, i9);
            int A0F2 = A0F(i3);
            int i17 = i16 + 1;
            int A0I2 = A0I(iArr, i16, C21788AaL.A08(A0F2, A08, A0F, (A0I << 5) | (A0I >>> 27)), 1518500249, i7);
            i11 = A0F(A08);
            int i18 = i17 + 1;
            i5 = A0I(iArr, i17, C21788AaL.A08(i11, A0I, A0F2, (A0I2 << 5) | (A0I2 >>> 27)), 1518500249, A0F);
            i9 = A0F(A0I);
            i14 = i18 + 1;
            i3 = A0I(iArr, i18, C21788AaL.A08(i9, A0I2, i11, (i5 << 5) | (i5 >>> 27)), 1518500249, A0F2);
            i7 = A0F(A0I2);
            i13++;
        } while (i13 < 4);
        int i19 = 0;
        do {
            int i20 = i14 + 1;
            int A0G = i11 + A0G(i3, i5, i7, i9) + iArr[i14] + 1859775393;
            int A0F3 = A0F(i5);
            int i21 = i20 + 1;
            int A0I3 = A0I(iArr, i20, A0G(A0G, i3, A0F3, i7), 1859775393, i9);
            int A0F4 = A0F(i3);
            int i22 = i21 + 1;
            int A0I4 = A0I(iArr, i21, A0G(A0I3, A0G, A0F4, A0F3), 1859775393, i7);
            i11 = A0F(A0G);
            int i23 = i22 + 1;
            i5 = A0I(iArr, i22, A0G(A0I4, A0I3, i11, A0F4), 1859775393, A0F3);
            i9 = A0F(A0I3);
            i14 = i23 + 1;
            i3 = A0I(iArr, i23, A0G(i5, A0I4, i9, i11), 1859775393, A0F4);
            i7 = A0F(A0I4);
            i19++;
        } while (i19 < 4);
        int i24 = 0;
        do {
            int i25 = i14 + 1;
            int A0H = i11 + ((A0H(i3, i5, i7, i9) + iArr[i14]) - 1894007588);
            int A0F5 = A0F(i5);
            int i26 = i25 + 1;
            int A0I5 = A0I(iArr, i25, A0H(A0H, i3, A0F5, i7), -1894007588, i9);
            int A0F6 = A0F(i3);
            int i27 = i26 + 1;
            int A0I6 = A0I(iArr, i26, A0H(A0I5, A0H, A0F6, A0F5), -1894007588, i7);
            i11 = A0F(A0H);
            int i28 = i27 + 1;
            i5 = A0I(iArr, i27, A0H(A0I6, A0I5, i11, A0F6), -1894007588, A0F5);
            i9 = A0F(A0I5);
            i14 = i28 + 1;
            i3 = A0I(iArr, i28, A0H(i5, A0I6, i9, i11), -1894007588, A0F6);
            i7 = A0F(A0I6);
            i24++;
        } while (i24 < 4);
        int i29 = 0;
        do {
            int i30 = i14 + 1;
            int A0G2 = i11 + ((A0G(i3, i5, i7, i9) + iArr[i14]) - 899497514);
            int A0F7 = A0F(i5);
            int i31 = i30 + 1;
            int A0I7 = A0I(iArr, i30, A0G(A0G2, i3, A0F7, i7), -899497514, i9);
            int A0F8 = A0F(i3);
            int i32 = i31 + 1;
            int A0I8 = A0I(iArr, i31, A0G(A0I7, A0G2, A0F8, A0F7), -899497514, i7);
            i11 = A0F(A0G2);
            int i33 = i32 + 1;
            i5 = A0I(iArr, i32, A0G(A0I8, A0I7, i11, A0F8), -899497514, A0F7);
            i9 = A0F(A0I7);
            i14 = i33 + 1;
            i3 = A0I(iArr, i33, A0G(i5, A0I8, i9, i11), -899497514, A0F8);
            i7 = A0F(A0I8);
            i29++;
        } while (i29 <= 3);
        this.A02 = i4 + i3;
        this.A03 = i6 + i5;
        this.A04 = i8 + i7;
        this.A05 = i10 + i9;
        this.A06 = i12 + i11;
        this.A00 = 0;
        int i34 = 0;
        do {
            iArr[i34] = 0;
            i34++;
        } while (i34 < 16);
    }
}
