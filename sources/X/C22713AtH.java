package X;

/* renamed from: X.AtH  reason: case insensitive filesystem */
public class C22713AtH extends C21788AaL {
    public static final int[] A0A = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};
    public int A00;
    public int[] A01 = new int[64];
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;

    public C22713AtH() {
        reset();
    }

    public C22713AtH(C22713AtH atH) {
        super(atH);
        A0H(atH);
    }

    public static int A0F(int i) {
        return ((i << 10) | (i >>> 22)) ^ (((i >>> 2) | (i << 30)) ^ ((i >>> 13) | (i << 19)));
    }

    private void A0H(C22713AtH atH) {
        super.A0S(atH);
        this.A02 = atH.A02;
        this.A03 = atH.A03;
        this.A04 = atH.A04;
        this.A05 = atH.A05;
        this.A06 = atH.A06;
        this.A07 = atH.A07;
        this.A08 = atH.A08;
        this.A09 = atH.A09;
        int[] iArr = atH.A01;
        System.arraycopy(iArr, 0, this.A01, 0, iArr.length);
        this.A00 = atH.A00;
    }

    public B21 B3i() {
        return new C22713AtH(this);
    }

    public int B5n(byte[] bArr, int i) {
        A0R();
        C202779me.A02(bArr, this.A02, i);
        C202779me.A02(bArr, this.A03, i + 4);
        C202779me.A02(bArr, this.A04, i + 8);
        C202779me.A02(bArr, this.A05, i + 12);
        C202779me.A02(bArr, this.A06, i + 16);
        C202779me.A02(bArr, this.A07, i + 20);
        C202779me.A02(bArr, this.A08, i + 24);
        reset();
        return 28;
    }

    public String B8R() {
        return "SHA-224";
    }

    public int BB8() {
        return 28;
    }

    public void BoU(B21 b21) {
        A0H((C22713AtH) b21);
    }

    public void reset() {
        super.reset();
        this.A02 = -1056596264;
        this.A03 = 914150663;
        this.A04 = 812702999;
        this.A05 = -150054599;
        this.A06 = -4191439;
        this.A07 = 1750603025;
        this.A08 = 1694076839;
        this.A09 = -1090891868;
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

    public static int A0G(int[] iArr, int i, int i2, int i3, int i4) {
        return (((i << 7) | (i >>> 25)) ^ (((i >>> 6) | (i << 26)) ^ ((i >>> 11) | (i << 21)))) + (((~i) & i3) ^ (i2 & i)) + iArr[i4];
    }

    public void A0U() {
        int[] iArr;
        int i = 16;
        do {
            iArr = this.A01;
            C21788AaL.A0E(iArr, i);
            i++;
        } while (i <= 63);
        int i2 = this.A02;
        int i3 = i2;
        int i4 = this.A03;
        int i5 = i4;
        int i6 = this.A04;
        int i7 = i6;
        int i8 = this.A05;
        int i9 = i8;
        int i10 = this.A06;
        int i11 = i10;
        int i12 = this.A07;
        int i13 = i12;
        int i14 = this.A08;
        int i15 = i14;
        int i16 = this.A09;
        int i17 = i16;
        int i18 = 0;
        int i19 = 0;
        do {
            int i20 = (~i10) & i14;
            int[] iArr2 = A0A;
            int A0C = C165607th.A0C(iArr, i19, (((i10 << 7) | (i10 >>> 25)) ^ (((i10 >>> 6) | (i10 << 26)) ^ ((i10 >>> 11) | (i10 << 21)))) + (i20 ^ (i12 & i10)) + iArr2[i19], i16);
            int i21 = i8 + A0C;
            int i22 = i2 & i4;
            int A0F = A0C + A0F(i2) + (((i2 & i6) ^ i22) ^ (i4 & i6));
            int i23 = i19 + 1;
            int A0C2 = C165607th.A0C(iArr, i23, A0G(iArr2, i21, i10, i12, i23), i14);
            int i24 = i6 + A0C2;
            int i25 = A0F & i2;
            int A092 = A0C2 + C21788AaL.A09(A0F & i4, i25, i22, A0F(A0F));
            int i26 = i23 + 1;
            int A0C3 = C165607th.A0C(iArr, i26, A0G(iArr2, i24, i21, i10, i26), i12);
            int i27 = i4 + A0C3;
            int i28 = A092 & A0F;
            int A093 = A0C3 + C21788AaL.A09(A092 & i2, i28, i25, A0F(A092));
            int i29 = i26 + 1;
            int A0C4 = C165607th.A0C(iArr, i29, A0G(iArr2, i27, i24, i21, i29), i10);
            int i30 = i2 + A0C4;
            int i31 = A093 & A092;
            int A094 = A0C4 + C21788AaL.A09(A093 & A0F, i31, i28, A0F(A093));
            int i32 = i29 + 1;
            int A0C5 = C165607th.A0C(iArr, i32, A0G(iArr2, i30, i27, i24, i32), i21);
            i16 = A0F + A0C5;
            int i33 = A094 & A093;
            i8 = A0C5 + C21788AaL.A09(A094 & A092, i33, i31, A0F(A094));
            int i34 = i32 + 1;
            int A0C6 = C165607th.A0C(iArr, i34, A0G(iArr2, i16, i30, i27, i34), i24);
            i14 = A092 + A0C6;
            int i35 = i8 & A094;
            i6 = A0C6 + C21788AaL.A09(i8 & A093, i35, i33, A0F(i8));
            int i36 = i34 + 1;
            int A0C7 = C165607th.A0C(iArr, i36, A0G(iArr2, i14, i16, i30, i36), i27);
            i12 = A093 + A0C7;
            int i37 = i6 & i8;
            i4 = A0C7 + C21788AaL.A09(i6 & A094, i37, i35, A0F(i6));
            int i38 = i36 + 1;
            int A0C8 = C165607th.A0C(iArr, i38, A0G(iArr2, i12, i14, i16, i38), i30);
            i10 = A094 + A0C8;
            int i39 = i4 & i8;
            i2 = A0C8 + C21788AaL.A09(i39, i4 & i6, i37, A0F(i4));
            i19 = i38 + 1;
            i18++;
        } while (i18 < 8);
        this.A02 = i3 + i2;
        this.A03 = i5 + i4;
        this.A04 = i7 + i6;
        this.A05 = i9 + i8;
        this.A06 = i11 + i10;
        this.A07 = i13 + i12;
        this.A08 = i15 + i14;
        this.A09 = i17 + i16;
        this.A00 = 0;
        int i40 = 0;
        do {
            iArr[i40] = 0;
            i40++;
        } while (i40 < 16);
    }
}
