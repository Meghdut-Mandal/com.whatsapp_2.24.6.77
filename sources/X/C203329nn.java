package X;

/* renamed from: X.9nn  reason: invalid class name and case insensitive filesystem */
public final class C203329nn {
    public int A00;
    public int A01 = 1;
    public int A02;
    public int A03;
    public int A04;
    public String A05;
    public C201639k2 A06;
    public C201639k2 A07 = new C201639k2();
    public C202499m2[] A08 = new C202499m2[256];
    public C202499m2[] A09;
    public C193279Kv[] A0A;
    public C193279Kv[] A0B;
    public int A0C;
    public final AnonymousClass9Xc A0D;

    public static C202499m2 A01(String str, String str2, String str3, C203329nn r11, int i) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i2 = i;
        int hashCode = (i + (str.hashCode() * str2.hashCode() * str3.hashCode())) & Integer.MAX_VALUE;
        for (C202499m2 A042 = A04(r11, hashCode); A042 != null; A042 = A042.A01) {
            if (A042.A03 == i && A042.A04 == hashCode && A042.A07.equals(str4) && A042.A06.equals(str2) && A042.A08.equals(str3)) {
                return A042;
            }
        }
        r11.A07.A0A(i, A03(str4, r11, 7).A02, r11.A0B(str2, str3));
        int i3 = r11.A01;
        r11.A01 = i3 + 1;
        C202499m2 r2 = new C202499m2(str4, str5, str6, i3, i2, hashCode, 0);
        A07(r2, r11);
        return r2;
    }

    public static C202499m2 A02(String str, String str2, C203329nn r14, int i, int i2) {
        String str3 = str;
        String str4 = str2;
        int i3 = i2;
        int i4 = i;
        int hashCode = (i + (str.hashCode() * str2.hashCode() * (i2 + 1))) & Integer.MAX_VALUE;
        for (C202499m2 A042 = A04(r14, hashCode); A042 != null; A042 = A042.A01) {
            if (A042.A03 == i && A042.A04 == hashCode && A042.A05 == ((long) i3) && A042.A06.equals(str) && A042.A08.equals(str2)) {
                return A042;
            }
        }
        r14.A07.A0A(i, i3, r14.A0B(str, str2));
        int i5 = r14.A01;
        r14.A01 = i5 + 1;
        C202499m2 r5 = new C202499m2((String) null, str3, str4, i5, i4, hashCode, (long) i3);
        A07(r5, r14);
        return r5;
    }

    public static C202499m2 A05(C203329nn r10, int i, int i2) {
        int i3 = i;
        int i4 = (i + i2) & Integer.MAX_VALUE;
        for (C202499m2 A042 = A04(r10, i4); A042 != null; A042 = A042.A01) {
            if (A042.A03 == i && A042.A04 == i4 && A042.A05 == ((long) i2)) {
                return A042;
            }
        }
        C201639k2 r0 = r10.A07;
        r0.A05(i);
        r0.A06(i2);
        int i5 = r10.A01;
        r10.A01 = i5 + 1;
        C202499m2 r4 = new C202499m2(i5, i3, (long) i2, i4);
        A07(r4, r10);
        return r4;
    }

    public static C202499m2 A06(C203329nn r12, int i, long j) {
        long j2 = j;
        int i2 = (int) j;
        int i3 = i;
        int A0D2 = C90514aH.A0D(j);
        int i4 = (i + i2 + A0D2) & Integer.MAX_VALUE;
        for (C202499m2 A042 = A04(r12, i4); A042 != null; A042 = A042.A01) {
            if (A042.A03 == i && A042.A04 == i4 && A042.A05 == j) {
                return A042;
            }
        }
        int i5 = r12.A01;
        C201639k2 r4 = r12.A07;
        r4.A05(i);
        int i6 = r4.A00;
        if (i6 + 8 > r4.A01.length) {
            C201639k2.A02(r4, 8);
        }
        byte[] bArr = r4.A01;
        int i7 = i6 + 1;
        int A022 = C165617ti.A02(A0D2 >>> 24, bArr, i6, i7);
        int A023 = C165617ti.A02(A0D2 >>> 16, bArr, i7, A022);
        int A024 = C165617ti.A02(A0D2 >>> 8, bArr, A022, A023);
        int A025 = C165617ti.A02(A0D2, bArr, A023, A024);
        int A026 = C165617ti.A02(i2 >>> 24, bArr, A024, A025);
        bArr[A025] = (byte) (i2 >>> 16);
        C201639k2.A04(r4, bArr, A026, i2);
        r12.A01 += 2;
        C202499m2 r6 = new C202499m2(i5, i3, j2, i4);
        A07(r6, r12);
        return r6;
    }

    public int A08(String str) {
        int hashCode = (str.hashCode() + 1) & Integer.MAX_VALUE;
        for (C202499m2 A042 = A04(this, hashCode); A042 != null; A042 = A042.A01) {
            if (A042.A03 == 1 && A042.A04 == hashCode && A042.A08.equals(str)) {
                return A042.A02;
            }
        }
        C201639k2 r9 = this.A07;
        r9.A05(1);
        int length = str.length();
        if (length <= 65535) {
            int i = r9.A00;
            if (i + 2 + length > r9.A01.length) {
                C201639k2.A02(r9, length + 2);
            }
            byte[] bArr = r9.A01;
            int i2 = i + 1;
            int A022 = C165617ti.A02(length >>> 8, bArr, i, i2);
            bArr[i2] = (byte) length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    r9.A00 = A022;
                    break;
                }
                char charAt = str.charAt(i3);
                if (charAt < 1 || charAt > 127) {
                    r9.A00 = A022;
                    r9.A0B(str, i3, 65535);
                } else {
                    i3 = C165617ti.A02(charAt, bArr, A022, i3);
                    A022++;
                }
            }
            r9.A00 = A022;
            r9.A0B(str, i3, 65535);
            int i4 = this.A01;
            this.A01 = i4 + 1;
            C202499m2 r0 = new C202499m2(i4, 1, str, hashCode);
            A07(r0, this);
            return r0.A02;
        }
        throw AnonymousClass001.A08("UTF8 string too large");
    }

    public static int A00(C202499m2 r4, C203329nn r5) {
        C202499m2[] r3 = r5.A09;
        if (r3 == null) {
            r3 = new C202499m2[16];
            r5.A09 = r3;
        }
        int i = r5.A04;
        int length = r3.length;
        if (i == length) {
            C202499m2[] r1 = new C202499m2[(length * 2)];
            System.arraycopy(r3, 0, r1, 0, length);
            r5.A09 = r1;
            r3 = r1;
        }
        int i2 = r5.A04;
        r5.A04 = i2 + 1;
        r3[i2] = r4;
        A07(r4, r5);
        return r4.A02;
    }

    public static C202499m2 A04(C203329nn r1, int i) {
        C202499m2[] r12 = r1.A08;
        return r12[i % r12.length];
    }

    public static void A07(C202499m2 r9, C203329nn r10) {
        int i = r10.A0C;
        C202499m2[] r7 = r10.A08;
        int length = r7.length;
        if (i > (length * 3) / 4) {
            int i2 = (length * 2) + 1;
            C202499m2[] r5 = new C202499m2[i2];
            for (int i3 = length - 1; i3 >= 0; i3--) {
                C202499m2 r3 = r7[i3];
                while (r3 != null) {
                    int i4 = r3.A04 % i2;
                    C202499m2 r1 = r3.A01;
                    r3.A01 = r5[i4];
                    r5[i4] = r3;
                    r3 = r1;
                }
            }
            r10.A08 = r5;
            r7 = r5;
        }
        r10.A0C = i + 1;
        int length2 = r9.A04 % r7.length;
        r9.A01 = r7[length2];
        r7[length2] = r9;
    }

    public int A09(String str) {
        int A0B2 = C90504aG.A0B(str, 128) & Integer.MAX_VALUE;
        for (C202499m2 A042 = A04(this, A0B2); A042 != null; A042 = A042.A01) {
            if (A042.A03 == 128 && A042.A04 == A0B2 && A042.A08.equals(str)) {
                return A042.A02;
            }
        }
        return A00(new C202499m2(this.A04, 128, str, A0B2), this);
    }

    public int A0A(String str, int i) {
        String str2 = str;
        int A0B2 = (C90504aG.A0B(str, 129) + i) & Integer.MAX_VALUE;
        for (C202499m2 A042 = A04(this, A0B2); A042 != null; A042 = A042.A01) {
            if (A042.A03 == 129 && A042.A04 == A0B2 && A042.A05 == ((long) i) && A042.A08.equals(str)) {
                return A042.A02;
            }
        }
        return A00(new C202499m2(str2, this.A04, 129, A0B2, (long) i), this);
    }

    public int A0B(String str, String str2) {
        int hashCode = ((str.hashCode() * str2.hashCode()) + 12) & Integer.MAX_VALUE;
        C202499m2 A042 = A04(this, hashCode);
        while (true) {
            if (A042 != null) {
                if (A042.A03 == 12 && A042.A04 == hashCode && A042.A06.equals(str) && A042.A08.equals(str2)) {
                    break;
                }
                A042 = A042.A01;
            } else {
                this.A07.A0A(12, A08(str), A08(str2));
                int i = this.A01;
                this.A01 = i + 1;
                A042 = new C202499m2(i, hashCode, str, str2);
                A07(A042, this);
                break;
            }
        }
        return A042.A02;
    }

    public C202499m2 A0C(Object obj) {
        int intValue;
        if (!(obj instanceof Integer) && !(obj instanceof Byte)) {
            if (obj instanceof Character) {
                intValue = ((Character) obj).charValue();
            } else if (!(obj instanceof Short)) {
                if (obj instanceof Boolean) {
                    intValue = AnonymousClass000.A1X(obj);
                } else if (obj instanceof Float) {
                    return A05(this, 4, Float.floatToRawIntBits(C36441kJ.A03(obj)));
                } else {
                    if (obj instanceof Long) {
                        return A06(this, 5, C36431kI.A09(obj));
                    }
                    if (obj instanceof Double) {
                        return A06(this, 6, Double.doubleToRawLongBits(C90504aG.A01(obj)));
                    }
                    if (obj instanceof String) {
                        return A03((String) obj, this, 8);
                    }
                    if (obj instanceof C203309nl) {
                        C203309nl r11 = (C203309nl) obj;
                        int i = r11.A00;
                        if (i == 12 || i == 10) {
                            return A03(r11.A03.substring(r11.A01, r11.A02), this, 7);
                        }
                        String A062 = r11.A06();
                        if (i == 11) {
                            return A03(A062, this, 16);
                        }
                        return A03(A062, this, 7);
                    } else if (obj instanceof AnonymousClass9X1) {
                        AnonymousClass9X1 r112 = (AnonymousClass9X1) obj;
                        return A0D(r112.A03, r112.A02, r112.A01, r112.A00, r112.A04);
                    } else if (obj instanceof AnonymousClass9Wn) {
                        AnonymousClass9Wn r113 = (AnonymousClass9Wn) obj;
                        return A02(r113.A01, r113.A00, this, 17, A0E(r113.A02, r113.A03).A02);
                    } else {
                        throw C90464aC.A0P(obj, "value ", AnonymousClass000.A0u());
                    }
                }
            }
            return A05(this, 3, intValue);
        }
        intValue = ((Number) obj).intValue();
        return A05(this, 3, intValue);
    }

    public C202499m2 A0D(String str, String str2, String str3, int i, boolean z) {
        int i2;
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        int i3 = i;
        int hashCode = ((str4.hashCode() * str5.hashCode() * str6.hashCode() * i) + 15) & Integer.MAX_VALUE;
        for (C202499m2 A042 = A04(this, hashCode); A042 != null; A042 = A042.A01) {
            if (A042.A03 == 15 && A042.A04 == hashCode && A042.A05 == ((long) i3) && A042.A07.equals(str4) && A042.A06.equals(str5) && A042.A08.equals(str6)) {
                return A042;
            }
        }
        C201639k2 r7 = this.A07;
        if (i3 <= 4) {
            i2 = 9;
        } else {
            i2 = 10;
            if (z) {
                i2 = 11;
            }
        }
        int i4 = A01(str4, str5, str6, this, i2).A02;
        int i5 = r7.A00;
        if (i5 + 4 > r7.A01.length) {
            C201639k2.A02(r7, 4);
        }
        byte[] bArr = r7.A01;
        int i6 = i5 + 1;
        int A022 = C165617ti.A02(15, bArr, i5, i6);
        bArr[i6] = (byte) i3;
        C201639k2.A04(r7, bArr, A022, i4);
        int i7 = this.A01;
        this.A01 = i7 + 1;
        C202499m2 r8 = new C202499m2(str4, str5, str6, i7, 15, hashCode, (long) i3);
        A07(r8, this);
        return r8;
    }

    public C202499m2 A0E(AnonymousClass9X1 r17, Object... objArr) {
        C201639k2 r7 = this.A06;
        if (r7 == null) {
            r7 = new C201639k2();
            this.A06 = r7;
        }
        int[] iArr = new int[r4];
        for (int i = 0; i < r4; i++) {
            iArr[i] = A0C(objArr[i]).A02;
        }
        int i2 = r7.A00;
        AnonymousClass9X1 r8 = r17;
        r7.A07(A0D(r8.A03, r8.A02, r8.A01, r8.A00, r8.A04).A02);
        r7.A07(r4);
        for (int i3 = 0; i3 < r4; i3++) {
            r7.A07(iArr[i3]);
        }
        int i4 = r7.A00 - i2;
        int hashCode = r8.hashCode();
        for (Object hashCode2 : objArr) {
            hashCode ^= hashCode2.hashCode();
        }
        int i5 = hashCode & Integer.MAX_VALUE;
        C201639k2 r6 = this.A06;
        byte[] bArr = r6.A01;
        for (C202499m2 A042 = A04(this, i5); A042 != null; A042 = A042.A01) {
            if (A042.A03 == 64 && A042.A04 == i5) {
                int i6 = (int) A042.A05;
                int i7 = 0;
                while (i7 < i4) {
                    if (bArr[i2 + i7] == bArr[i6 + i7]) {
                        i7++;
                    }
                }
                r6.A00 = i2;
                return A042;
            }
        }
        int i8 = this.A00;
        this.A00 = i8 + 1;
        C202499m2 r10 = new C202499m2(i8, 64, (long) i2, i5);
        A07(r10, this);
        return r10;
    }

    public C203329nn(AnonymousClass9Xc r2) {
        this.A0D = r2;
    }

    public static C202499m2 A03(String str, C203329nn r4, int i) {
        int A0B2 = C90504aG.A0B(str, i) & Integer.MAX_VALUE;
        for (C202499m2 A042 = A04(r4, A0B2); A042 != null; A042 = A042.A01) {
            if (A042.A03 == i && A042.A04 == A0B2 && A042.A08.equals(str)) {
                return A042;
            }
        }
        r4.A07.A09(i, r4.A08(str));
        int i2 = r4.A01;
        r4.A01 = i2 + 1;
        C202499m2 r0 = new C202499m2(i2, i, str, A0B2);
        A07(r0, r4);
        return r0;
    }
}
