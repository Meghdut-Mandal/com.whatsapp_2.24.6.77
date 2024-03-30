package X;

/* renamed from: X.9n0  reason: invalid class name and case insensitive filesystem */
public final class C202959n0 {
    public int A00;
    public C202959n0 A01;
    public final C201639k2 A02;
    public final C203329nn A03;
    public final boolean A04;
    public final int A05;
    public final C202959n0 A06;

    public static int A00(C202959n0 r2, C202959n0 r3, C202959n0 r4, C202959n0 r5) {
        int i = 0;
        if (r2 != null) {
            i = 0 + r2.A06("RuntimeVisibleAnnotations");
        }
        if (r3 != null) {
            i += r3.A06("RuntimeInvisibleAnnotations");
        }
        if (r4 != null) {
            i += r4.A06("RuntimeVisibleTypeAnnotations");
        }
        if (r5 != null) {
            return i + r5.A06("RuntimeInvisibleTypeAnnotations");
        }
        return i;
    }

    public static void A04(C201639k2 r1, C203329nn r2, int i, int i2) {
        r1.A09(i2, C203329nn.A05(r2, 3, i).A02);
    }

    public void A0A(C201639k2 r6, int i) {
        int i2 = 2;
        C202959n0 r3 = null;
        int i3 = 0;
        for (C202959n0 r1 = this; r1 != null; r1 = r1.A06) {
            r1.A08();
            i2 += r1.A02.A00;
            i3++;
            r3 = r1;
        }
        r6.A07(i);
        r6.A06(i2);
        r6.A07(i3);
        while (r3 != null) {
            C201639k2.A03(r3.A02, r6);
            r3 = r3.A01;
        }
    }

    public static C202959n0 A01(String str, C202959n0 r4, C203329nn r5) {
        C201639k2 r2 = new C201639k2();
        C201639k2.A00(str, r2, r5);
        r2.A07(0);
        return new C202959n0(r4, r2, r5, true);
    }

    public static C202959n0 A02(String str, C202959n0 r5, C203329nn r6, AnonymousClass9R7 r7, int i) {
        C201639k2 r3 = new C201639k2();
        int i2 = i >>> 24;
        if (!(i2 == 0 || i2 == 1)) {
            switch (i2) {
                case 16:
                case 17:
                case 18:
                case 23:
                    r3.A09(i2, (i & 16776960) >> 8);
                    break;
                case 19:
                case 20:
                case 21:
                    r3.A05(i2);
                    break;
                case 22:
                    break;
                default:
                    switch (i2) {
                        case 66:
                        case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                        case 68:
                        case AnonymousClass8SX.CALL_LOG_MESSSAGE_FIELD_NUMBER:
                        case AnonymousClass8SX.MESSAGE_HISTORY_BUNDLE_FIELD_NUMBER:
                            break;
                        case AnonymousClass8SX.ENC_COMMENT_MESSAGE_FIELD_NUMBER:
                        case 72:
                        case 73:
                        case AnonymousClass8SX.LOTTIE_STICKER_MESSAGE_FIELD_NUMBER:
                        case AnonymousClass8SX.EVENT_MESSAGE_FIELD_NUMBER:
                            r3.A06(i);
                            break;
                        default:
                            throw C165617ti.A0U();
                    }
                    r3.A09(i2, (i & 16776960) >> 8);
                    break;
            }
        }
        r3.A07(i >>> 16);
        if (r7 == null) {
            r3.A05(0);
        } else {
            byte[] bArr = r7.A01;
            int i3 = r7.A00;
            r3.A0C(bArr, i3, (bArr[i3] * 2) + 1);
        }
        C201639k2.A00(str, r3, r6);
        r3.A07(0);
        return new C202959n0(r5, r3, r6, true);
    }

    public static void A03(C202959n0 r1, C202959n0 r2, C202959n0 r3, C202959n0 r4, C201639k2 r5, C203329nn r6) {
        if (r1 != null) {
            r1.A0A(r5, r6.A08("RuntimeVisibleAnnotations"));
        }
        if (r2 != null) {
            r2.A0A(r5, r6.A08("RuntimeInvisibleAnnotations"));
        }
        if (r3 != null) {
            r3.A0A(r5, r6.A08("RuntimeVisibleTypeAnnotations"));
        }
        if (r4 != null) {
            r4.A0A(r5, r6.A08("RuntimeInvisibleTypeAnnotations"));
        }
    }

    public static void A05(C201639k2 r6, C202959n0[] r7, int i, int i2) {
        int A062;
        int i3 = (i2 * 2) + 1;
        for (int i4 = 0; i4 < i2; i4++) {
            C202959n0 r0 = r7[i4];
            if (r0 == null) {
                A062 = 0;
            } else {
                A062 = r0.A06((String) null) - 8;
            }
            i3 += A062;
        }
        r6.A07(i);
        r6.A06(i3);
        r6.A05(i2);
        for (int i5 = 0; i5 < i2; i5++) {
            C202959n0 r2 = null;
            int i6 = 0;
            for (C202959n0 r3 = r7[i5]; r3 != null; r3 = r3.A06) {
                r3.A08();
                i6++;
                r2 = r3;
            }
            r6.A07(i6);
            while (r2 != null) {
                C201639k2.A03(r2.A02, r6);
                r2 = r2.A01;
            }
        }
    }

    public int A06(String str) {
        if (str != null) {
            this.A03.A08(str);
        }
        int i = 8;
        for (C202959n0 r1 = this; r1 != null; r1 = r1.A06) {
            i += r1.A02.A00;
        }
        return i;
    }

    public C202959n0 A07(String str) {
        this.A00++;
        if (this.A04) {
            C201639k2.A00(str, this.A02, this.A03);
        }
        C201639k2 r4 = this.A02;
        r4.A09(91, 0);
        return new C202959n0((C202959n0) null, r4, this.A03, false);
    }

    public void A08() {
        int i = this.A05;
        if (i != -1) {
            byte[] bArr = this.A02.A01;
            int i2 = this.A00;
            C165607th.A15(i2 >>> 8, bArr, i, i2);
        }
    }

    public void A09(String str, Object obj) {
        int i;
        C201639k2 r3;
        C203329nn r0;
        String A062;
        int i2;
        this.A00++;
        if (this.A04) {
            C201639k2.A00(str, this.A02, this.A03);
        }
        if (obj instanceof String) {
            r3 = this.A02;
            i = 115;
            r0 = this.A03;
            A062 = (String) obj;
        } else {
            i = 66;
            if (obj instanceof Byte) {
                r3 = this.A02;
                i2 = C203329nn.A05(this.A03, 3, ((Number) obj).byteValue()).A02;
                r3.A09(i, i2);
            } else if (obj instanceof Boolean) {
                A04(this.A02, this.A03, AnonymousClass000.A1X(obj) ? 1 : 0, 90);
                return;
            } else if (obj instanceof Character) {
                A04(this.A02, this.A03, ((Character) obj).charValue(), 67);
                return;
            } else if (obj instanceof Short) {
                A04(this.A02, this.A03, ((Number) obj).shortValue(), 83);
                return;
            } else if (obj instanceof C203309nl) {
                r3 = this.A02;
                i = 99;
                r0 = this.A03;
                A062 = ((C203309nl) obj).A06();
            } else {
                int i3 = 0;
                if (obj instanceof byte[]) {
                    byte[] bArr = (byte[]) obj;
                    C201639k2 r32 = this.A02;
                    int length = bArr.length;
                    r32.A09(91, length);
                    while (i3 < length) {
                        A04(r32, this.A03, bArr[i3], 66);
                        i3++;
                    }
                    return;
                } else if (obj instanceof boolean[]) {
                    boolean[] zArr = (boolean[]) obj;
                    C201639k2 r33 = this.A02;
                    int length2 = zArr.length;
                    r33.A09(91, length2);
                    while (i3 < length2) {
                        A04(r33, this.A03, zArr[i3] ? 1 : 0, 90);
                        i3++;
                    }
                    return;
                } else if (obj instanceof short[]) {
                    short[] sArr = (short[]) obj;
                    C201639k2 r34 = this.A02;
                    int length3 = sArr.length;
                    r34.A09(91, length3);
                    while (i3 < length3) {
                        A04(r34, this.A03, sArr[i3], 83);
                        i3++;
                    }
                    return;
                } else if (obj instanceof char[]) {
                    char[] cArr = (char[]) obj;
                    C201639k2 r35 = this.A02;
                    int length4 = cArr.length;
                    r35.A09(91, length4);
                    while (i3 < length4) {
                        A04(r35, this.A03, cArr[i3], 67);
                        i3++;
                    }
                    return;
                } else if (obj instanceof int[]) {
                    int[] iArr = (int[]) obj;
                    C201639k2 r4 = this.A02;
                    int length5 = iArr.length;
                    r4.A09(91, length5);
                    while (i3 < length5) {
                        A04(r4, this.A03, iArr[i3], 73);
                        i3++;
                    }
                    return;
                } else if (obj instanceof long[]) {
                    long[] jArr = (long[]) obj;
                    C201639k2 r6 = this.A02;
                    int length6 = jArr.length;
                    r6.A09(91, length6);
                    while (i3 < length6) {
                        r6.A09(74, C203329nn.A06(this.A03, 5, jArr[i3]).A02);
                        i3++;
                    }
                    return;
                } else if (obj instanceof float[]) {
                    float[] fArr = (float[]) obj;
                    C201639k2 r5 = this.A02;
                    int length7 = fArr.length;
                    r5.A09(91, length7);
                    while (i3 < length7) {
                        r5.A09(70, C203329nn.A05(this.A03, 4, Float.floatToRawIntBits(fArr[i3])).A02);
                        i3++;
                    }
                    return;
                } else if (obj instanceof double[]) {
                    double[] dArr = (double[]) obj;
                    C201639k2 r62 = this.A02;
                    int length8 = dArr.length;
                    r62.A09(91, length8);
                    while (i3 < length8) {
                        r62.A09(68, C203329nn.A06(this.A03, 6, Double.doubleToRawLongBits(dArr[i3])).A02);
                        i3++;
                    }
                    return;
                } else {
                    C202499m2 A0C = this.A03.A0C(obj);
                    this.A02.A09(".s.IFJDCS".charAt(A0C.A03), A0C.A02);
                    return;
                }
            }
        }
        i2 = r0.A08(A062);
        r3.A09(i, i2);
    }

    public C202959n0(C202959n0 r3, C201639k2 r4, C203329nn r5, boolean z) {
        this.A03 = r5;
        this.A04 = z;
        this.A02 = r4;
        int i = r4.A00;
        this.A05 = i == 0 ? -1 : i - 2;
        this.A06 = r3;
        if (r3 != null) {
            r3.A01 = this;
        }
    }
}
