package X;

/* renamed from: X.AtF  reason: case insensitive filesystem */
public class C22711AtF extends C21788AaL {
    public int A00;
    public int[] A01 = new int[16];
    public int A02;
    public int A03;
    public int A04;
    public int A05;

    public C22711AtF() {
        reset();
    }

    public C22711AtF(C22711AtF atF) {
        super(atF);
        A0F(atF);
    }

    private void A0F(C22711AtF atF) {
        super.A0S(atF);
        this.A02 = atF.A02;
        this.A03 = atF.A03;
        this.A04 = atF.A04;
        this.A05 = atF.A05;
        int[] iArr = atF.A01;
        System.arraycopy(iArr, 0, this.A01, 0, iArr.length);
        this.A00 = atF.A00;
    }

    public B21 B3i() {
        return new C22711AtF(this);
    }

    public int B5n(byte[] bArr, int i) {
        A0R();
        A0G(bArr, this.A02, i);
        A0G(bArr, this.A03, i + 4);
        A0G(bArr, this.A04, i + 8);
        A0G(bArr, this.A05, i + 12);
        reset();
        return 16;
    }

    public String B8R() {
        return "MD5";
    }

    public int BB8() {
        return 16;
    }

    public void BoU(B21 b21) {
        A0F((C22711AtF) b21);
    }

    public void reset() {
        super.reset();
        this.A02 = 1732584193;
        this.A03 = -271733879;
        this.A04 = -1732584194;
        this.A05 = 271733878;
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

    public void A0U() {
        int i = this.A02;
        int i2 = i;
        int i3 = this.A03;
        int i4 = this.A04;
        int i5 = this.A05;
        int A08 = C21788AaL.A08(i4, i3, i5, i);
        int[] iArr = this.A01;
        int i6 = iArr[0];
        int A012 = C21788AaL.A01((A08 + i6) - 680876936, i3);
        int A082 = C21788AaL.A08(i3, A012, i4, i5);
        int i7 = iArr[1];
        int i8 = (A082 + i7) - 389564586;
        int A0A = C21788AaL.A0A(i8, 20, i8 << 12, A012);
        int A083 = C21788AaL.A08(A012, A0A, i3, i4);
        int i9 = iArr[2];
        int i10 = A083 + i9 + 606105819;
        int A0A2 = C21788AaL.A0A(i10, 15, i10 << 17, A0A);
        int A084 = C21788AaL.A08(A0A, A0A2, A012, i3);
        int i11 = iArr[3];
        int i12 = (A084 + i11) - 1044525330;
        int A0A3 = C21788AaL.A0A(i12, 10, i12 << 22, A0A2);
        int A085 = C21788AaL.A08(A0A2, A0A3, A0A, A012);
        int i13 = iArr[4];
        int A013 = C21788AaL.A01((A085 + i13) - 176418897, A0A3);
        int A086 = C21788AaL.A08(A0A3, A013, A0A2, A0A);
        int i14 = iArr[5];
        int i15 = A086 + i14 + 1200080426;
        int A0A4 = C21788AaL.A0A(i15, 20, i15 << 12, A013);
        int A087 = C21788AaL.A08(A013, A0A4, A0A3, A0A2);
        int i16 = iArr[6];
        int i17 = (A087 + i16) - 1473231341;
        int A0A5 = C21788AaL.A0A(i17, 15, i17 << 17, A0A4);
        int A088 = C21788AaL.A08(A0A4, A0A5, A013, A0A3);
        int i18 = iArr[7];
        int i19 = (A088 + i18) - 45705983;
        int A0A6 = C21788AaL.A0A(i19, 10, i19 << 22, A0A5);
        int A089 = C21788AaL.A08(A0A5, A0A6, A0A4, A013);
        int i20 = iArr[8];
        int A014 = C21788AaL.A01(A089 + i20 + 1770035416, A0A6);
        int A0810 = C21788AaL.A08(A0A6, A014, A0A5, A0A4);
        int i21 = iArr[9];
        int i22 = (A0810 + i21) - 1958414417;
        int A0A7 = C21788AaL.A0A(i22, 20, i22 << 12, A014);
        int A0811 = C21788AaL.A08(A014, A0A7, A0A6, A0A5);
        int i23 = iArr[10];
        int i24 = (A0811 + i23) - 42063;
        int A0A8 = C21788AaL.A0A(i24, 15, i24 << 17, A0A7);
        int A0812 = C21788AaL.A08(A0A7, A0A8, A014, A0A6);
        int i25 = iArr[11];
        int i26 = (A0812 + i25) - 1990404162;
        int A0A9 = C21788AaL.A0A(i26, 10, i26 << 22, A0A8);
        int A0813 = C21788AaL.A08(A0A8, A0A9, A0A7, A014);
        int i27 = iArr[12];
        int A015 = C21788AaL.A01(A0813 + i27 + 1804603682, A0A9);
        int A0814 = C21788AaL.A08(A0A9, A015, A0A8, A0A7);
        int i28 = iArr[13];
        int i29 = (A0814 + i28) - 40341101;
        int A0A10 = C21788AaL.A0A(i29, 20, i29 << 12, A015);
        int i30 = ~A0A10;
        int i31 = i30;
        int i32 = iArr[14];
        int i33 = ((A0A8 + ((i30 & A0A9) | (A015 & A0A10))) + i32) - 1502002290;
        int A0A11 = C21788AaL.A0A(i33, 15, i33 << 17, A0A10);
        int i34 = ~A0A11;
        int i35 = iArr[15];
        int i36 = A0A9 + ((i34 & A015) | (A0A10 & A0A11)) + i35 + 1236535329;
        int A0A12 = C21788AaL.A0A(i36, 10, i36 << 22, A0A11);
        int i37 = ((A015 + ((A0A12 & A0A10) | (A0A11 & i31))) + i7) - 165796510;
        int A0A13 = C21788AaL.A0A(i37, 27, i37 << 5, A0A12);
        int A07 = C21788AaL.A07(A0A10 + ((A0A13 & A0A11) | (A0A12 & i34)) + i16, -1069501632, A0A13);
        int A0B = C21788AaL.A0B(A07, A0A12, A0A13, A0A11, i25) + 643717713;
        int A0A14 = C21788AaL.A0A(A0B, 18, A0B << 14, A07);
        int A0B2 = C21788AaL.A0B(A0A14, A0A13, A07, A0A12, i6) - 373897302;
        int A0A15 = C21788AaL.A0A(A0B2, 12, A0B2 << 20, A0A14);
        int A0B3 = C21788AaL.A0B(A0A15, A07, A0A14, A0A13, i14) - 701558691;
        int A0A16 = C21788AaL.A0A(A0B3, 27, A0B3 << 5, A0A15);
        int A072 = C21788AaL.A07(C21788AaL.A0B(A0A16, A0A14, A0A15, A07, i23), 38016083, A0A16);
        int A0B4 = C21788AaL.A0B(A072, A0A15, A0A16, A0A14, i35) - 660478335;
        int A0A17 = C21788AaL.A0A(A0B4, 18, A0B4 << 14, A072);
        int A0B5 = C21788AaL.A0B(A0A17, A0A16, A072, A0A15, i13) - 405537848;
        int A0A18 = C21788AaL.A0A(A0B5, 12, A0B5 << 20, A0A17);
        int A0B6 = C21788AaL.A0B(A0A18, A072, A0A17, A0A16, i21) + 568446438;
        int A0A19 = C21788AaL.A0A(A0B6, 27, A0B6 << 5, A0A18);
        int A073 = C21788AaL.A07(C21788AaL.A0B(A0A19, A0A17, A0A18, A072, i32), -1019803690, A0A19);
        int A0B7 = C21788AaL.A0B(A073, A0A18, A0A19, A0A17, i11) - 187363961;
        int A0A20 = C21788AaL.A0A(A0B7, 18, A0B7 << 14, A073);
        int A0B8 = C21788AaL.A0B(A0A20, A0A19, A073, A0A18, i20) + 1163531501;
        int A0A21 = C21788AaL.A0A(A0B8, 12, A0B8 << 20, A0A20);
        int A0B9 = C21788AaL.A0B(A0A21, A073, A0A20, A0A19, i28) - 1444681467;
        int A0A22 = C21788AaL.A0A(A0B9, 27, A0B9 << 5, A0A21);
        int A074 = C21788AaL.A07(C21788AaL.A0B(A0A22, A0A20, A0A21, A073, i9), -51403784, A0A22);
        int A0B10 = C21788AaL.A0B(A074, A0A21, A0A22, A0A20, i18) + 1735328473;
        int A0A23 = C21788AaL.A0A(A0B10, 18, A0B10 << 14, A074);
        int A0B11 = C21788AaL.A0B(A0A23, A0A22, A074, A0A21, i27) - 1926607734;
        int A0A24 = C21788AaL.A0A(A0B11, 12, A0B11 << 20, A0A23);
        int A0C = C21788AaL.A0C(A0A24, A0A23, A074, A0A22, i14) - 378558;
        int A0A25 = C21788AaL.A0A(A0C, 28, A0C << 4, A0A24);
        int A06 = C21788AaL.A06(C21788AaL.A0C(A0A25, A0A24, A0A23, A074, i20), -2022574463, A0A25);
        int A0C2 = C21788AaL.A0C(A06, A0A25, A0A24, A0A23, i25) + 1839030562;
        int A0A26 = C21788AaL.A0A(A0C2, 16, A0C2 << 16, A06);
        int A0C3 = C21788AaL.A0C(A0A26, A06, A0A25, A0A24, i32) - 35309556;
        int A0A27 = C21788AaL.A0A(A0C3, 9, A0C3 << 23, A0A26);
        int A0C4 = C21788AaL.A0C(A0A27, A0A26, A06, A0A25, i7) - 1530992060;
        int A0A28 = C21788AaL.A0A(A0C4, 28, A0C4 << 4, A0A27);
        int A062 = C21788AaL.A06(C21788AaL.A0C(A0A28, A0A27, A0A26, A06, i13), 1272893353, A0A28);
        int A0C5 = C21788AaL.A0C(A062, A0A28, A0A27, A0A26, i18) - 155497632;
        int A0A29 = C21788AaL.A0A(A0C5, 16, A0C5 << 16, A062);
        int A0C6 = C21788AaL.A0C(A0A29, A062, A0A28, A0A27, i23) - 1094730640;
        int A0A30 = C21788AaL.A0A(A0C6, 9, A0C6 << 23, A0A29);
        int A0C7 = C21788AaL.A0C(A0A30, A0A29, A062, A0A28, i28) + 681279174;
        int A0A31 = C21788AaL.A0A(A0C7, 28, A0C7 << 4, A0A30);
        int A063 = C21788AaL.A06(C21788AaL.A0C(A0A31, A0A30, A0A29, A062, i6), -358537222, A0A31);
        int A0C8 = C21788AaL.A0C(A063, A0A31, A0A30, A0A29, i11) - 722521979;
        int A0A32 = C21788AaL.A0A(A0C8, 16, A0C8 << 16, A063);
        int A0C9 = C21788AaL.A0C(A0A32, A063, A0A31, A0A30, i16) + 76029189;
        int A0A33 = C21788AaL.A0A(A0C9, 9, A0C9 << 23, A0A32);
        int A0C10 = C21788AaL.A0C(A0A33, A0A32, A063, A0A31, i21) - 640364487;
        int A0A34 = C21788AaL.A0A(A0C10, 28, A0C10 << 4, A0A33);
        int A064 = C21788AaL.A06(C21788AaL.A0C(A0A34, A0A33, A0A32, A063, i27), -421815835, A0A34);
        int A0C11 = C21788AaL.A0C(A064, A0A34, A0A33, A0A32, i35) + 530742520;
        int A0A35 = C21788AaL.A0A(A0C11, 16, A0C11 << 16, A064);
        int A0C12 = C21788AaL.A0C(A0A35, A064, A0A34, A0A33, i9) - 995338651;
        int A0A36 = C21788AaL.A0A(A0C12, 9, A0C12 << 23, A0A35);
        int A022 = C21788AaL.A02(C21788AaL.A0D(A064, A0A36, A0A35, A0A34, i6) - 198630844, A0A36);
        int A002 = C21788AaL.A00(C21788AaL.A0D(A0A35, A022, A0A36, A064, i18) + 1126891415) + A022;
        int A052 = C21788AaL.A05(C21788AaL.A0D(A0A36, A002, A022, A0A35, i32), -1416354905, A002);
        int A0D = C21788AaL.A0D(A022, A052, A002, A0A36, i14) - 57434055;
        int A0A37 = C21788AaL.A0A(A0D, 11, A0D << 21, A052);
        int A023 = C21788AaL.A02(C21788AaL.A0D(A002, A0A37, A052, A022, i27) + 1700485571, A0A37);
        int A003 = C21788AaL.A00(C21788AaL.A0D(A052, A023, A0A37, A002, i11) - 1894986606) + A023;
        int A053 = C21788AaL.A05(C21788AaL.A0D(A0A37, A003, A023, A052, i23), -1051523, A003);
        int A0D2 = C21788AaL.A0D(A023, A053, A003, A0A37, i7) - 2054922799;
        int A0A38 = C21788AaL.A0A(A0D2, 11, A0D2 << 21, A053);
        int A024 = C21788AaL.A02(C21788AaL.A0D(A003, A0A38, A053, A023, i20) + 1873313359, A0A38);
        int A004 = C21788AaL.A00(C21788AaL.A0D(A053, A024, A0A38, A003, i35) - 30611744) + A024;
        int A054 = C21788AaL.A05(C21788AaL.A0D(A0A38, A004, A024, A053, i16), -1560198380, A004);
        int A0D3 = C21788AaL.A0D(A024, A054, A004, A0A38, i28) + 1309151649;
        int A0A39 = C21788AaL.A0A(A0D3, 11, A0D3 << 21, A054);
        int A025 = C21788AaL.A02(C21788AaL.A0D(A004, A0A39, A054, A024, i13) - 145523070, A0A39);
        int A005 = C21788AaL.A00(C21788AaL.A0D(A054, A025, A0A39, A004, i25) - 1120210379) + A025;
        int A055 = C21788AaL.A05(C21788AaL.A0D(A0A39, A005, A025, A054, i9), 718787259, A005);
        int A0D4 = C21788AaL.A0D(A025, A055, A005, A0A39, i21) - 343485551;
        int A0A40 = C21788AaL.A0A(A0D4, 11, A0D4 << 21, A055);
        this.A02 = i2 + A025;
        this.A03 = i3 + A0A40;
        this.A04 = i4 + A055;
        this.A05 = i5 + A005;
        this.A00 = 0;
        for (int i38 = 0; i38 != iArr.length; i38++) {
            iArr[i38] = 0;
        }
    }

    public static void A0G(byte[] bArr, int i, int i2) {
        bArr[C165617ti.A07(bArr, i, i2)] = (byte) (i >>> 8);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 3] = (byte) (i >>> 24);
    }
}
