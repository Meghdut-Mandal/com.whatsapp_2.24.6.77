package X;

/* renamed from: X.9oZ  reason: invalid class name and case insensitive filesystem */
public class C203699oZ {
    public final int A00;
    public final int A01;
    @Deprecated
    public final byte[] A02;
    public final byte[] A03;
    public final int[] A04;
    public final int[] A05;
    public final String[] A06;
    public final AnonymousClass9Wn[] A07;

    public static String A08(C203699oZ r7, char[] cArr, int i, int i2) {
        int i3;
        int i4;
        int i5 = i2 + i;
        byte[] bArr = r7.A03;
        int i6 = 0;
        while (i < i5) {
            int i7 = i + 1;
            byte b = bArr[i];
            if ((b & 128) == 0) {
                i3 = i6 + 1;
                i4 = b & Byte.MAX_VALUE;
            } else {
                i3 = i6 + 1;
                if ((b & 224) == 192) {
                    i = i7 + 1;
                    cArr[i6] = (char) (((b & 31) << 6) + (bArr[i7] & 63));
                    i6 = i3;
                } else {
                    int i8 = i7 + 1;
                    i7 = i8 + 1;
                    i4 = ((b & 15) << 12) + ((bArr[i7] & 63) << 6) + (bArr[i8] & 63);
                }
            }
            cArr[i6] = (char) i4;
            i = i7;
            i6 = i3;
        }
        return new String(cArr, 0, i6);
    }

    public static C201329jL A09(String str, C203699oZ r5, C201329jL[] r6, int i, int i2) {
        C201329jL r1;
        int length = r6.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                r1 = new C201329jL(str);
                break;
            }
            r1 = r6[i3];
            if (r1.A02.equals(str)) {
                break;
            }
            i3++;
        }
        C201329jL r3 = new C201329jL(r1.A02);
        byte[] bArr = new byte[i2];
        r3.A01 = bArr;
        System.arraycopy(r5.A03, i, bArr, 0, i2);
        return r3;
    }

    public static int A00(String str, C202959n0 r12, C203699oZ r13, char[] cArr, int i) {
        C202959n0 r1;
        int i2;
        Object obj;
        int i3 = 0;
        byte[] bArr = r13.A03;
        if (r12 == null) {
            byte b = bArr[i] & 255;
            r1 = null;
            if (b == 64) {
                return A01((C202959n0) null, r13, cArr, i + 3, true);
            }
            if (b != 91) {
                int i4 = i + 5;
                if (b != 101) {
                    return i + 3;
                }
                return i4;
            }
            i2 = i + 1;
        } else {
            int i5 = i + 1;
            byte b2 = bArr[i] & 255;
            if (b2 != 64) {
                if (b2 != 70) {
                    if (b2 == 83) {
                        obj = Short.valueOf((short) r13.A0F(r13.A05[C165587tf.A09(bArr, i5)]));
                    } else if (b2 == 99) {
                        String A0J = r13.A0J(cArr, i5);
                        obj = C203309nl.A04(A0J, 0, A0J.length());
                    } else if (b2 == 101) {
                        String A0J2 = r13.A0J(cArr, i5);
                        String A0J3 = r13.A0J(cArr, i5 + 2);
                        r12.A00++;
                        if (r12.A04) {
                            C201639k2.A00(str, r12.A02, r12.A03);
                        }
                        C201639k2 r2 = r12.A02;
                        C203329nn r14 = r12.A03;
                        r2.A09(101, r14.A08(A0J2));
                        C201639k2.A00(A0J3, r2, r14);
                        return i5 + 4;
                    } else if (b2 == 115) {
                        obj = r13.A0J(cArr, i5);
                    } else if (!(b2 == 73 || b2 == 74)) {
                        if (b2 != 90) {
                            if (b2 != 91) {
                                switch (b2) {
                                    case 66:
                                        obj = Byte.valueOf((byte) r13.A0F(r13.A05[C165587tf.A09(bArr, i5)]));
                                        break;
                                    case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                        obj = Character.valueOf((char) r13.A0F(r13.A05[C165587tf.A09(bArr, i5)]));
                                        break;
                                    case 68:
                                        break;
                                    default:
                                        throw C165617ti.A0U();
                                }
                            } else {
                                int A09 = C165587tf.A09(bArr, i5);
                                int i6 = i5 + 2;
                                if (A09 == 0) {
                                    r1 = r12.A07(str);
                                    i2 = i6 - 2;
                                } else {
                                    byte b3 = bArr[i6] & 255;
                                    if (b3 == 70) {
                                        float[] fArr = new float[A09];
                                        while (i3 < A09) {
                                            fArr[i3] = Float.intBitsToFloat(A03(r13, i6));
                                            i6 += 3;
                                            i3++;
                                        }
                                        r12.A09(str, fArr);
                                        return i6;
                                    } else if (b3 == 83) {
                                        short[] sArr = new short[A09];
                                        while (i3 < A09) {
                                            sArr[i3] = (short) A03(r13, i6);
                                            i6 += 3;
                                            i3++;
                                        }
                                        r12.A09(str, sArr);
                                        return i6;
                                    } else if (b3 == 90) {
                                        boolean[] zArr = new boolean[A09];
                                        for (int i7 = 0; i7 < A09; i7++) {
                                            zArr[i7] = AnonymousClass000.A1P(A03(r13, i6));
                                            i6 += 3;
                                        }
                                        r12.A09(str, zArr);
                                        return i6;
                                    } else if (b3 == 73) {
                                        int[] iArr = new int[A09];
                                        while (i3 < A09) {
                                            iArr[i3] = A03(r13, i6);
                                            i6 += 3;
                                            i3++;
                                        }
                                        r12.A09(str, iArr);
                                        return i6;
                                    } else if (b3 != 74) {
                                        switch (b3) {
                                            case 66:
                                                byte[] bArr2 = new byte[A09];
                                                while (i3 < A09) {
                                                    bArr2[i3] = (byte) A03(r13, i6);
                                                    i6 += 3;
                                                    i3++;
                                                }
                                                r12.A09(str, bArr2);
                                                return i6;
                                            case AnonymousClass8SX.BOT_INVOKE_MESSAGE_FIELD_NUMBER:
                                                char[] cArr2 = new char[A09];
                                                while (i3 < A09) {
                                                    cArr2[i3] = (char) A03(r13, i6);
                                                    i6 += 3;
                                                    i3++;
                                                }
                                                r12.A09(str, cArr2);
                                                return i6;
                                            case 68:
                                                double[] dArr = new double[A09];
                                                while (i3 < A09) {
                                                    dArr[i3] = Double.longBitsToDouble(r13.A0H(r13.A05[C165587tf.A09(bArr, i6 + 1)]));
                                                    i6 += 3;
                                                    i3++;
                                                }
                                                r12.A09(str, dArr);
                                                return i6;
                                            default:
                                                return A01(r12.A07(str), r13, cArr, i6 - 2, false);
                                        }
                                    } else {
                                        long[] jArr = new long[A09];
                                        while (i3 < A09) {
                                            jArr[i3] = r13.A0H(r13.A05[C165587tf.A09(bArr, i6 + 1)]);
                                            i6 += 3;
                                            i3++;
                                        }
                                        r12.A09(str, jArr);
                                        return i6;
                                    }
                                }
                            }
                        } else if (r13.A0F(r13.A05[C165587tf.A09(bArr, i5)]) == 0) {
                            obj = Boolean.FALSE;
                        } else {
                            obj = Boolean.TRUE;
                        }
                    }
                    r12.A09(str, obj);
                    return i5 + 2;
                }
                obj = r13.A0I(cArr, C165587tf.A09(bArr, i5));
                r12.A09(str, obj);
                return i5 + 2;
            }
            String A0J4 = r13.A0J(cArr, i5);
            r12.A00++;
            if (r12.A04) {
                C201639k2.A00(str, r12.A02, r12.A03);
            }
            C201639k2 r3 = r12.A02;
            C203329nn r22 = r12.A03;
            r3.A09(64, r22.A08(A0J4));
            r3.A07(0);
            return A01(new C202959n0((C202959n0) null, r3, r22, true), r13, cArr, i5 + 2, true);
        }
        return A01(r1, r13, cArr, i2, false);
    }

    public static int A01(C202959n0 r4, C203699oZ r5, char[] cArr, int i, boolean z) {
        int A09 = C165587tf.A09(r5.A03, i);
        int i2 = i + 2;
        if (!z) {
            while (true) {
                int i3 = A09 - 1;
                if (A09 <= 0) {
                    break;
                }
                i2 = A00((String) null, r4, r5, cArr, i2);
                A09 = i3;
            }
        } else {
            while (true) {
                int i4 = A09 - 1;
                if (A09 <= 0) {
                    break;
                }
                i2 = A00(r5.A0J(cArr, i2), r4, r5, cArr, i2 + 2);
                A09 = i4;
            }
        }
        if (r4 != null) {
            r4.A08();
        }
        return i2;
    }

    public static int A02(C203699oZ r1, int i) {
        return r1.A0G(i + 2);
    }

    public static int A03(C203699oZ r2, int i) {
        return r2.A0F(r2.A05[r2.A0G(i + 1)]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
        r5[r8] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        r5[r8] = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0038, code lost:
        return r1 + 2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A05(X.C203699oZ r3, char[] r4, java.lang.Object[] r5, X.C201489jh[] r6, int r7, int r8) {
        /*
            byte[] r2 = r3.A03
            int r1 = r7 + 1
            byte r0 = r2[r7]
            r0 = r0 & 255(0xff, float:3.57E-43)
            switch(r0) {
                case 0: goto L_0x0010;
                case 1: goto L_0x0013;
                case 2: goto L_0x0016;
                case 3: goto L_0x0019;
                case 4: goto L_0x001c;
                case 5: goto L_0x001f;
                case 6: goto L_0x0022;
                case 7: goto L_0x0027;
                case 8: goto L_0x002c;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x0010:
            java.lang.Integer r0 = X.B4E.A05
            goto L_0x0024
        L_0x0013:
            java.lang.Integer r0 = X.B4E.A02
            goto L_0x0024
        L_0x0016:
            java.lang.Integer r0 = X.B4E.A01
            goto L_0x0024
        L_0x0019:
            java.lang.Integer r0 = X.B4E.A00
            goto L_0x0024
        L_0x001c:
            java.lang.Integer r0 = X.B4E.A03
            goto L_0x0024
        L_0x001f:
            java.lang.Integer r0 = X.B4E.A04
            goto L_0x0024
        L_0x0022:
            java.lang.Integer r0 = X.B4E.A06
        L_0x0024:
            r5[r8] = r0
            return r1
        L_0x0027:
            java.lang.String r0 = A07(r3, r4, r1)
            goto L_0x0034
        L_0x002c:
            int r0 = X.C165587tf.A09(r2, r1)
            X.9jh r0 = A0A(r6, r0)
        L_0x0034:
            r5[r8] = r0
            int r1 = r1 + 2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203699oZ.A05(X.9oZ, char[], java.lang.Object[], X.9jh[], int, int):int");
    }

    public static int A06(C203699oZ r1, int[] iArr, int i) {
        if (iArr == null || i >= iArr.length) {
            return -1;
        }
        int i2 = iArr[i];
        byte[] bArr = r1.A03;
        if ((bArr[i2] & 255) >= 67) {
            return C165587tf.A09(bArr, i2 + 1);
        }
        return -1;
    }

    public static String A07(C203699oZ r2, char[] cArr, int i) {
        return r2.A0J(cArr, r2.A05[C165587tf.A09(r2.A03, i)]);
    }

    public static C201489jh A0A(C201489jh[] r1, int i) {
        if (r1[i] == null) {
            r1[i] = new C201489jh();
        }
        C201489jh r12 = r1[i];
        r12.A05 = (short) (r12.A05 & -2);
        return r12;
    }

    public static void A0B(C203699oZ r10, C194149Oh r11, C203189nU r12, int i, boolean z) {
        C202959n0[] r7;
        byte[] bArr = r10.A03;
        int i2 = i + 1;
        byte b = bArr[i] & 255;
        if (z) {
            r12.A0B = b;
        } else {
            r12.A00 = b;
        }
        char[] cArr = r11.A0B;
        for (int i3 = 0; i3 < b; i3++) {
            int A09 = C165587tf.A09(bArr, i2);
            i2 += 2;
            while (true) {
                int i4 = A09 - 1;
                if (A09 <= 0) {
                    break;
                }
                String A0J = r10.A0J(cArr, i2);
                int i5 = i2 + 2;
                if (z) {
                    r7 = r12.A0Z;
                    if (r7 == null) {
                        r7 = new C202959n0[C203309nl.A00(r12.A0j)];
                        r12.A0Z = r7;
                    }
                } else {
                    r7 = r12.A0Y;
                    if (r7 == null) {
                        r7 = new C202959n0[C203309nl.A00(r12.A0j)];
                        r12.A0Y = r7;
                    }
                }
                C202959n0 A012 = C202959n0.A01(A0J, r7[i3], r12.A0m);
                r7[i3] = A012;
                i2 = A01(A012, r10, cArr, i5, true);
                A09 = i4;
            }
        }
    }

    public static void A0C(C201489jh[] r1, int i) {
        if (r1[i] == null) {
            r1[i] = new C201489jh();
            C201489jh r12 = r1[i];
            r12.A05 = (short) (r12.A05 | 1);
        }
    }

    public static int[] A0D(C203699oZ r12, C194149Oh r13, C203189nU r14, int i, boolean z) {
        int i2;
        C202959n0 A022;
        char[] cArr = r13.A0B;
        byte[] bArr = r12.A03;
        int A09 = C165587tf.A09(bArr, i);
        int[] iArr = new int[A09];
        int i3 = i + 2;
        for (int i4 = 0; i4 < A09; i4++) {
            iArr[i4] = i3;
            int A0F = r12.A0F(i3);
            int i5 = A0F >>> 24;
            if (i5 != 23) {
                switch (i5) {
                    case 16:
                    case 17:
                    case 18:
                        break;
                    default:
                        switch (i5) {
                            case 64:
                            case AnonymousClass8SX.SCHEDULED_CALL_EDIT_MESSAGE_FIELD_NUMBER:
                                int A092 = C165587tf.A09(bArr, i3 + 1);
                                i2 = i3 + 3;
                                while (true) {
                                    int i6 = A092 - 1;
                                    if (A092 <= 0) {
                                        break;
                                    } else {
                                        int A093 = C165587tf.A09(bArr, i2);
                                        int A023 = A02(r12, i2);
                                        i2 += 6;
                                        C201489jh[] r0 = r13.A0I;
                                        A0A(r0, A093);
                                        A0A(r0, A093 + A023);
                                        A092 = i6;
                                    }
                                }
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
                                i2 = i3 + 4;
                                break;
                            default:
                                throw C165617ti.A0U();
                        }
                        break;
                }
            }
            i2 = i3 + 3;
            byte b = bArr[i2] & 255;
            AnonymousClass9R7 r9 = null;
            if (i5 == 66) {
                if (b != 0) {
                    r9 = new AnonymousClass9R7(bArr, i2);
                }
                int i7 = i2 + (b * 2) + 1;
                String A0J = r12.A0J(cArr, i7);
                int i8 = i7 + 2;
                int i9 = A0F & -256;
                C203329nn r1 = r14.A0m;
                if (z) {
                    A022 = C202959n0.A02(A0J, r14.A0D, r1, r9, i9);
                    r14.A0D = A022;
                } else {
                    A022 = C202959n0.A02(A0J, r14.A0C, r1, r9, i9);
                    r14.A0C = A022;
                }
                i3 = A01(A022, r12, cArr, i8, true);
            } else {
                i3 = A01((C202959n0) null, r12, cArr, i2 + (b * 2) + 3, true);
            }
        }
        return iArr;
    }

    public final int A0E() {
        int i = this.A00;
        byte[] bArr = this.A03;
        int A09 = i + 8 + (C165587tf.A09(bArr, i + 6) * 2);
        int A092 = C165587tf.A09(bArr, A09);
        int i2 = A09 + 2;
        while (true) {
            int i3 = A092 - 1;
            if (A092 <= 0) {
                break;
            }
            int A093 = C165587tf.A09(bArr, i2 + 6);
            i2 += 8;
            while (true) {
                int i4 = A093 - 1;
                A092 = i3;
                if (A093 > 0) {
                    i2 += A0F(i2 + 2) + 6;
                    A093 = i4;
                }
            }
        }
        int A094 = C165587tf.A09(bArr, i2);
        int i5 = i2 + 2;
        while (true) {
            int i6 = A094 - 1;
            if (A094 <= 0) {
                return i5 + 2;
            }
            int A095 = C165587tf.A09(bArr, i5 + 6);
            i5 += 8;
            while (true) {
                int i7 = A095 - 1;
                A094 = i6;
                if (A095 > 0) {
                    i5 += A0F(i5 + 2) + 6;
                    A095 = i7;
                }
            }
        }
    }

    public int A0F(int i) {
        byte[] bArr = this.A03;
        return (bArr[i + 3] & 255) | C165597tg.A08(bArr, i + 2, C165607th.A0B(bArr, i + 1, (bArr[i] & 255) << 24));
    }

    public int A0G(int i) {
        return C165587tf.A09(this.A03, i);
    }

    public Object A0I(char[] cArr, int i) {
        int[] iArr = this.A05;
        int i2 = iArr[i];
        byte[] bArr = this.A03;
        byte b = bArr[i2 - 1];
        switch (b) {
            case 3:
                return Integer.valueOf(A0F(i2));
            case 4:
                return Float.valueOf(Float.intBitsToFloat(A0F(i2)));
            case 5:
                return Long.valueOf(A0H(i2));
            case 6:
                return Double.valueOf(Double.longBitsToDouble(A0H(i2)));
            case 7:
                String A0J = A0J(cArr, i2);
                int i3 = 12;
                if (A0J.charAt(0) == '[') {
                    i3 = 9;
                }
                return new C203309nl(i3, 0, A0J, A0J.length());
            case 8:
                return A0J(cArr, i2);
            default:
                switch (b) {
                    case 15:
                        byte b2 = bArr[i2] & 255;
                        int i4 = iArr[C165587tf.A09(bArr, i2 + 1)];
                        int i5 = iArr[A02(this, i4)];
                        return new AnonymousClass9X1(A07(this, cArr, i4), A0J(cArr, i5), A0J(cArr, i5 + 2), b2, AnonymousClass000.A1S(bArr[i4 - 1], 11));
                    case 16:
                        String A0J2 = A0J(cArr, i2);
                        return new C203309nl(11, 0, A0J2, A0J2.length());
                    case 17:
                        AnonymousClass9Wn[] r9 = this.A07;
                        AnonymousClass9Wn r5 = r9[i];
                        if (r5 != null) {
                            return r5;
                        }
                        int i6 = iArr[A02(this, i2)];
                        String A0J3 = A0J(cArr, i6);
                        String A0J4 = A0J(cArr, i6 + 2);
                        int i7 = this.A04[C165587tf.A09(bArr, i2)];
                        AnonymousClass9X1 r6 = (AnonymousClass9X1) A0I(cArr, C165587tf.A09(bArr, i7));
                        int A022 = A02(this, i7);
                        Object[] objArr = new Object[A022];
                        int i8 = i7 + 4;
                        for (int i9 = 0; i9 < A022; i9++) {
                            objArr[i9] = A0I(cArr, C165587tf.A09(bArr, i8));
                            i8 += 2;
                        }
                        AnonymousClass9Wn r52 = new AnonymousClass9Wn(A0J3, A0J4, r6, objArr);
                        r9[i] = r52;
                        return r52;
                    default:
                        throw C165617ti.A0U();
                }
        }
    }

    public String A0J(char[] cArr, int i) {
        byte[] bArr = this.A03;
        int A09 = C165587tf.A09(bArr, i);
        if (i == 0 || A09 == 0) {
            return null;
        }
        String[] strArr = this.A06;
        String str = strArr[A09];
        if (str != null) {
            return str;
        }
        int i2 = this.A05[A09];
        String A08 = A08(this, cArr, i2 + 2, C165587tf.A09(bArr, i2));
        strArr[A09] = A08;
        return A08;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0041, code lost:
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        r1 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        r4 = r4 + r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C203699oZ(byte[] r11) {
        /*
            r10 = this;
            r10.<init>()
            r10.A03 = r11
            r10.A02 = r11
            r0 = 8
            int r8 = X.C165587tf.A09(r11, r0)
            int[] r9 = new int[r8]
            r10.A05 = r9
            java.lang.String[] r0 = new java.lang.String[r8]
            r10.A06 = r0
            r4 = 10
            r7 = 0
            r6 = 0
            r5 = 0
            r0 = 1
        L_0x001b:
            if (r0 >= r8) goto L_0x004b
            int r3 = r0 + 1
            int r2 = r4 + 1
            r9[r0] = r2
            byte r0 = r11[r4]
            r1 = 3
            switch(r0) {
                case 1: goto L_0x0035;
                case 2: goto L_0x0029;
                case 3: goto L_0x002e;
                case 4: goto L_0x002e;
                case 5: goto L_0x0030;
                case 6: goto L_0x0030;
                case 7: goto L_0x0041;
                case 8: goto L_0x0041;
                case 9: goto L_0x002e;
                case 10: goto L_0x002e;
                case 11: goto L_0x002e;
                case 12: goto L_0x002e;
                case 13: goto L_0x0029;
                case 14: goto L_0x0029;
                case 15: goto L_0x0040;
                case 16: goto L_0x0041;
                case 17: goto L_0x0043;
                case 18: goto L_0x0046;
                case 19: goto L_0x0041;
                case 20: goto L_0x0041;
                default: goto L_0x0029;
            }
        L_0x0029:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x002e:
            r0 = r3
            goto L_0x0048
        L_0x0030:
            r1 = 9
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0035:
            byte[] r0 = r10.A03
            int r0 = X.C165587tf.A09(r0, r2)
            int r1 = r1 + r0
            if (r1 <= r7) goto L_0x0041
            r7 = r1
            goto L_0x0041
        L_0x0040:
            r1 = 4
        L_0x0041:
            r0 = r3
            goto L_0x0049
        L_0x0043:
            r0 = r3
            r6 = 1
            goto L_0x0047
        L_0x0046:
            r0 = r3
        L_0x0047:
            r5 = 1
        L_0x0048:
            r1 = 5
        L_0x0049:
            int r4 = r4 + r1
            goto L_0x001b
        L_0x004b:
            r10.A01 = r7
            r10.A00 = r4
            r4 = 0
            if (r6 == 0) goto L_0x009b
            X.9Wn[] r0 = new X.AnonymousClass9Wn[r8]
        L_0x0054:
            r10.A07 = r0
            if (r5 == 0) goto L_0x00a2
            char[] r5 = new char[r7]
            int r1 = r10.A0E()
            int r2 = r1 + -2
            byte[] r0 = r10.A03
            int r4 = X.C165587tf.A09(r0, r2)
        L_0x0066:
            if (r4 <= 0) goto L_0x009d
            java.lang.String r3 = r10.A0J(r5, r1)
            int r0 = r1 + 2
            int r2 = r10.A0F(r0)
            int r1 = r1 + 6
            java.lang.String r0 = "BootstrapMethods"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x0097
            byte[] r0 = r10.A03
            int r3 = X.C165587tf.A09(r0, r1)
            int[] r4 = new int[r3]
            int r2 = r1 + 2
            r1 = 0
        L_0x0087:
            if (r1 >= r3) goto L_0x00a2
            r4[r1] = r2
            int r0 = A02(r10, r2)
            int r0 = r0 * 2
            int r0 = r0 + 4
            int r2 = r2 + r0
            int r1 = r1 + 1
            goto L_0x0087
        L_0x0097:
            int r1 = r1 + r2
            int r4 = r4 + -1
            goto L_0x0066
        L_0x009b:
            r0 = r4
            goto L_0x0054
        L_0x009d:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x00a2:
            r10.A04 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203699oZ.<init>(byte[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0056, code lost:
        r8 = r8 & -256;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        r7 = r15 + 3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int A04(X.C203699oZ r13, X.C194149Oh r14, int r15) {
        /*
            int r8 = r13.A0F(r15)
            int r1 = r8 >>> 24
            r0 = 1
            if (r1 == 0) goto L_0x0061
            if (r1 == r0) goto L_0x0061
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            switch(r1) {
                case 16: goto L_0x0056;
                case 17: goto L_0x0056;
                case 18: goto L_0x0056;
                case 19: goto L_0x005d;
                case 20: goto L_0x005d;
                case 21: goto L_0x005d;
                case 22: goto L_0x0061;
                case 23: goto L_0x0056;
                default: goto L_0x0010;
            }
        L_0x0010:
            switch(r1) {
                case 64: goto L_0x0018;
                case 65: goto L_0x0018;
                case 66: goto L_0x0056;
                case 67: goto L_0x0059;
                case 68: goto L_0x0059;
                case 69: goto L_0x0059;
                case 70: goto L_0x0059;
                case 71: goto L_0x0067;
                case 72: goto L_0x0067;
                case 73: goto L_0x0067;
                case 74: goto L_0x0067;
                case 75: goto L_0x0067;
                default: goto L_0x0013;
            }
        L_0x0013:
            java.lang.IllegalArgumentException r0 = X.C165617ti.A0U()
            throw r0
        L_0x0018:
            r8 = r8 & r0
            int r0 = r15 + 1
            byte[] r10 = r13.A03
            int r9 = X.C165587tf.A09(r10, r0)
            int r7 = r15 + 3
            X.9jh[] r11 = new X.C201489jh[r9]
            r14.A0H = r11
            X.9jh[] r6 = new X.C201489jh[r9]
            r14.A0G = r6
            int[] r5 = new int[r9]
            r14.A0C = r5
            r4 = 0
        L_0x0030:
            if (r4 >= r9) goto L_0x006d
            int r12 = X.C165587tf.A09(r10, r7)
            int r3 = A02(r13, r7)
            int r0 = r7 + 4
            int r2 = X.C165587tf.A09(r10, r0)
            int r7 = r7 + 6
            X.9jh[] r1 = r14.A0I
            X.9jh r0 = A0A(r1, r12)
            r11[r4] = r0
            int r12 = r12 + r3
            X.9jh r0 = A0A(r1, r12)
            r6[r4] = r0
            r5[r4] = r2
            int r4 = r4 + 1
            goto L_0x0030
        L_0x0056:
            r8 = r8 & -256(0xffffffffffffff00, float:NaN)
            goto L_0x005a
        L_0x0059:
            r8 = r8 & r0
        L_0x005a:
            int r7 = r15 + 3
            goto L_0x006d
        L_0x005d:
            r8 = r8 & r0
            int r7 = r15 + 1
            goto L_0x006d
        L_0x0061:
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r8 = r8 & r0
            int r7 = r15 + 2
            goto L_0x006d
        L_0x0067:
            r0 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r8 = r8 & r0
            int r7 = r15 + 4
        L_0x006d:
            r14.A06 = r8
            byte[] r1 = r13.A03
            byte r0 = r1[r7]
            r2 = r0 & 255(0xff, float:3.57E-43)
            if (r2 != 0) goto L_0x0080
            r0 = 0
        L_0x0078:
            r14.A0A = r0
            int r1 = r7 + 1
            int r0 = r2 * 2
            int r1 = r1 + r0
            return r1
        L_0x0080:
            X.9R7 r0 = new X.9R7
            r0.<init>(r1, r7)
            goto L_0x0078
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203699oZ.A04(X.9oZ, X.9Oh, int):int");
    }

    public long A0H(int i) {
        return (((long) A0F(i)) << 32) | C165597tg.A0C(A0F(i + 4));
    }
}
