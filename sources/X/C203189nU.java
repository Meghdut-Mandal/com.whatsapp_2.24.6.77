package X;

/* renamed from: X.9nU  reason: invalid class name and case insensitive filesystem */
public final class C203189nU {
    public static final int[] A0o = {0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 0, 0, 1, 2, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, -1, 0, -1, -1, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -3, -4, -3, -4, -3, -3, -3, -3, -1, -2, 1, 1, 1, 2, 2, 2, 0, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, -1, -2, 0, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, -2, -1, -2, -1, -2, 0, 1, 0, 1, -1, -1, 0, 0, 1, 1, -1, 0, -1, 0, 0, 0, -3, -1, -1, -3, -3, -1, -1, -1, -1, -1, -1, -2, -2, -2, -2, -2, -2, -2, -2, 0, 1, 0, -1, -1, -1, -2, -1, -2, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, -1, -1, 0, 0, -1, -1, 0, 0};
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
    public C202959n0 A0C;
    public C202959n0 A0D;
    public C202959n0 A0E;
    public C202959n0 A0F;
    public C202959n0 A0G;
    public C202959n0 A0H;
    public C201329jL A0I;
    public C201639k2 A0J;
    public C201639k2 A0K;
    public C201639k2 A0L;
    public C201639k2 A0M;
    public C201639k2 A0N;
    public C201639k2 A0O;
    public C193729Mq A0P;
    public C193729Mq A0Q;
    public C201489jh A0R;
    public C201489jh A0S;
    public C203189nU A0T = null;
    public boolean A0U;
    public boolean A0V;
    public int[] A0W;
    public int[] A0X;
    public C202959n0[] A0Y;
    public C202959n0[] A0Z;
    public int A0a;
    public int A0b;
    public C201489jh A0c;
    public final int A0d;
    public final int A0e;
    public final int A0f;
    public final int A0g;
    public final int A0h;
    public final int A0i;
    public final String A0j;
    public final String A0k;
    public final C201639k2 A0l = new C201639k2();
    public final C203329nn A0m;
    public final int[] A0n;

    public C203189nU(String str, String str2, String str3, C203329nn r8, String[] strArr, int i, int i2) {
        int A082;
        int length;
        this.A0m = r8;
        this.A0d = "<init>".equals(str) ? 262144 | i : i;
        this.A0g = r8.A08(str);
        this.A0k = str;
        this.A0f = r8.A08(str2);
        this.A0j = str2;
        if (str3 == null) {
            A082 = 0;
        } else {
            A082 = r8.A08(str3);
        }
        this.A0i = A082;
        if (strArr != null && (length = strArr.length) > 0) {
            this.A0h = length;
            this.A0n = new int[length];
            for (int i3 = 0; i3 < this.A0h; i3++) {
                this.A0n[i3] = C203329nn.A03(strArr[i3], r8, 7).A02;
            }
        }
        this.A0e = i2;
        if (i2 != 0) {
            int A012 = C203309nl.A01(str2) >> 2;
            A012 = (i & 8) != 0 ? A012 - 1 : A012;
            this.A05 = A012;
            this.A0a = A012;
            C201489jh r0 = new C201489jh();
            this.A0S = r0;
            A0G(r0);
        }
    }

    private void A00() {
        if (this.A0e == 1) {
            this.A0R.A08 = (short) this.A06;
            this.A0R = null;
        }
    }

    private void A01(int i, int i2) {
        String str;
        int i3;
        char c;
        while (i < i2) {
            C203329nn r4 = this.A0m;
            int i4 = this.A0W[i];
            C201639k2 r3 = this.A0O;
            int i5 = (-67108864 & i4) >> 26;
            if (i5 == 0) {
                int i6 = 1048575 & i4;
                int i7 = i4 & 62914560;
                if (i7 == 4194304) {
                    r3.A05(i6);
                    i++;
                } else if (i7 == 8388608) {
                    r3.A05(7);
                    str = r4.A09[i6].A08;
                    i3 = C203329nn.A03(str, r4, 7).A02;
                } else if (i7 == 12582912) {
                    r3.A05(8);
                    i3 = (int) r4.A09[i6].A05;
                } else if (i7 == 16777216) {
                    r3.A05(8);
                    C201489jh r42 = r4.A0B[(int) r4.A09[i6].A05].A02;
                    if ((r42.A05 & 4) == 0) {
                        C201489jh.A00(r42, 0, 805306368, r3.A00);
                    }
                    i3 = r42.A00;
                } else {
                    throw new AssertionError();
                }
            } else {
                StringBuilder A0u = AnonymousClass000.A0u();
                while (true) {
                    int i8 = i5 - 1;
                    if (i5 <= 0) {
                        break;
                    }
                    A0u.append('[');
                    i5 = i8;
                }
                if ((i4 & 62914560) == 8388608) {
                    A0u.append('L');
                    A0u.append(r4.A09[i4 & 1048575].A08);
                    c = ';';
                } else {
                    int i9 = i4 & 1048575;
                    c = 'I';
                    if (i9 != 1) {
                        c = 'F';
                        if (i9 != 2) {
                            c = 'D';
                            if (i9 != 3) {
                                if (i9 != 4) {
                                    switch (i9) {
                                        case 9:
                                            c = 'Z';
                                            break;
                                        case 10:
                                            c = 'B';
                                            break;
                                        case 11:
                                            c = 'C';
                                            break;
                                        case 12:
                                            c = 'S';
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } else {
                                    c = 'J';
                                }
                            }
                        }
                    }
                }
                A0u.append(c);
                r3.A05(7);
                str = A0u.toString();
                i3 = C203329nn.A03(str, r4, 7).A02;
            }
            r3.A07(i3);
            i++;
        }
    }

    private void A02(Object obj) {
        if (obj instanceof Integer) {
            this.A0O.A05(AnonymousClass000.A0I(obj));
            return;
        }
        boolean z = obj instanceof String;
        C201639k2 r2 = this.A0O;
        if (z) {
            r2.A05(7);
            C201639k2.A01((String) obj, r2, this.A0m, 7);
            return;
        }
        r2.A05(8);
        C201489jh r5 = (C201489jh) obj;
        C201639k2 r3 = this.A0O;
        if ((r5.A05 & 4) == 0) {
            C201489jh.A00(r5, 0, 805306368, r3.A00);
        }
        r3.A07(r5.A00);
    }

    private void A03(C201489jh r4, int i) {
        C201489jh r2 = this.A0R;
        r2.A01 = new C193269Ku(r2.A01, r4, i);
    }

    public static void A04(C201489jh r4, C203189nU r5, C201489jh[] r6) {
        if (r5.A0R != null) {
            if (r5.A0e == 1) {
                int i = r5.A09 - 1;
                r5.A09 = i;
                r5.A03(r4, i);
                for (C201489jh A032 : r6) {
                    r5.A03(A032, i);
                }
            }
            r5.A00();
        }
    }

    public C202959n0 A05(String str, AnonymousClass9R7 r8, int[] iArr, C201489jh[] r10, C201489jh[] r11, int i, boolean z) {
        C201639k2 r3 = new C201639k2();
        r3.A05(i >>> 24);
        int length = r10.length;
        r3.A07(length);
        for (int i2 = 0; i2 < length; i2++) {
            r3.A07(r10[i2].A00);
            r3.A07(r11[i2].A00 - r10[i2].A00);
            r3.A07(iArr[i2]);
        }
        if (r8 == null) {
            r3.A05(0);
        } else {
            byte[] bArr = r8.A01;
            int i3 = r8.A00;
            r3.A0C(bArr, i3, (bArr[i3] * 2) + 1);
        }
        C203329nn r4 = this.A0m;
        C201639k2.A00(str, r3, r4);
        r3.A07(0);
        if (z) {
            C202959n0 r1 = new C202959n0(this.A0D, r3, r4, true);
            this.A0D = r1;
            return r1;
        }
        C202959n0 r12 = new C202959n0(this.A0C, r3, r4, true);
        this.A0C = r12;
        return r12;
    }

    public void A06() {
        char c;
        int i;
        int[] iArr = this.A0X;
        if (iArr != null) {
            C201639k2 r11 = this.A0O;
            if (r11 == null) {
                r11 = new C201639k2();
                this.A0O = r11;
            }
            int[] iArr2 = this.A0W;
            int i2 = iArr2[1];
            int i3 = iArr2[2];
            int i4 = 0;
            if (this.A0m.A03 < 50) {
                r11.A07(iArr2[0]);
                r11.A07(i2);
                int i5 = i2 + 3;
                A01(3, i5);
                this.A0O.A07(i3);
                A01(i5, i3 + i5);
            } else {
                int i6 = this.A0A;
                int i7 = iArr2[0];
                if (i6 != 0) {
                    i7 = (i7 - iArr[0]) - 1;
                }
                int i8 = iArr[1];
                int i9 = i2 - i8;
                if (i3 == 0) {
                    switch (i9) {
                        case -3:
                        case -2:
                        case -1:
                            c = 248;
                            break;
                        case 0:
                            c = 251;
                            if (i7 < 64) {
                                c = 0;
                                break;
                            }
                            break;
                        case 1:
                        case 2:
                        case 3:
                            c = 252;
                            break;
                    }
                    i = 3;
                    while (true) {
                        if (i4 < i8 || i4 >= i2) {
                            if (c != 0) {
                                if (c == '@') {
                                    r11.A05(i7 + 64);
                                } else if (c == 247) {
                                    r11.A05(247);
                                    r11.A07(i7);
                                } else if (c == 248) {
                                    r11.A05(i9 + 251);
                                    r11.A07(i7);
                                } else if (c == 251) {
                                    r11.A05(251);
                                    r11.A07(i7);
                                } else if (c == 252) {
                                    r11.A05(i9 + 251);
                                    r11.A07(i7);
                                    A01(i8 + 3, i2 + 3);
                                }
                                A01(i2 + 3, i2 + 4);
                            } else {
                                r11.A05(i7);
                            }
                        } else if (iArr2[i] == iArr[i]) {
                            i++;
                            i4++;
                        }
                    }
                } else if (i9 == 0 && i3 == 1) {
                    c = 247;
                    if (i7 < 63) {
                        c = '@';
                    }
                    i = 3;
                    while (true) {
                        if (i4 < i8) {
                        }
                        i++;
                        i4++;
                    }
                }
                r11.A05(255);
                r11.A07(i7);
                r11.A07(i2);
                int i10 = i2 + 3;
                A01(3, i10);
                this.A0O.A07(i3);
                A01(i10, i3 + i10);
            }
            this.A0A++;
        }
        this.A0X = this.A0W;
        this.A0W = null;
    }

    public void A07(int i) {
        C201639k2 r1 = this.A0l;
        this.A01 = r1.A00;
        r1.A05(i);
        C201489jh r2 = this.A0R;
        if (r2 != null) {
            if (this.A0e == 3) {
                r2.A02.A0D((C202499m2) null, (C203329nn) null, i, 0);
            } else {
                int i2 = this.A09 + A0o[i];
                if (i2 > this.A06) {
                    this.A06 = i2;
                }
                this.A09 = i2;
            }
            if (i < 172) {
                return;
            }
            if (i <= 177 || i == 191) {
                A00();
            }
        }
    }

    public void A08(int i, int i2) {
        int i3;
        C201639k2 r1 = this.A0l;
        this.A01 = r1.A00;
        if (i > 255 || i2 > 127 || i2 < -128) {
            r1.A05(196);
            r1.A09(132, i);
            r1.A07(i2);
        } else {
            r1.A05(132);
            r1.A08(i, i2);
        }
        C201489jh r2 = this.A0R;
        if (r2 != null && this.A0e == 3) {
            r2.A02.A0D((C202499m2) null, (C203329nn) null, 132, i);
        }
        if (this.A0e != 0 && (i3 = i + 1) > this.A05) {
            this.A05 = i3;
        }
    }

    public void A09(int i, int i2) {
        C201639k2 r1 = this.A0l;
        this.A01 = r1.A00;
        if (i == 17) {
            r1.A09(i, i2);
        } else {
            r1.A08(i, i2);
        }
        C201489jh r2 = this.A0R;
        if (r2 == null) {
            return;
        }
        if (this.A0e == 3) {
            r2.A02.A0D((C202499m2) null, (C203329nn) null, i, i2);
        } else if (i != 188) {
            int i3 = this.A09 + 1;
            if (i3 > this.A06) {
                this.A06 = i3;
            }
            this.A09 = i3;
        }
    }

    public void A0A(int i, int i2) {
        int i3 = this.A0e;
        short s = 1;
        if (i3 == 1) {
            for (C193729Mq r7 = this.A0P; r7 != null; r7 = r7.A00) {
                C201489jh r6 = r7.A03;
                C201489jh r3 = r7.A02;
                for (C201489jh r4 = r7.A04; r4 != r3; r4 = r4.A03) {
                    if ((r4.A05 & 16) == 0) {
                        r4.A01 = new C193269Ku(r4.A01, r6, Integer.MAX_VALUE);
                    } else {
                        C193269Ku r2 = r4.A01.A00;
                        r2.A00 = new C193269Ku(r2.A00, r6, Integer.MAX_VALUE);
                    }
                }
            }
            if (this.A0V) {
                C201489jh r42 = this.A0S;
                r42.A02(1);
                short s2 = 1;
                do {
                    C201489jh r22 = r42;
                    do {
                        if ((r22.A05 & 16) != 0 && r22.A0A == s) {
                            C201489jh r1 = r22.A01.A00.A02;
                            if (r1.A0A == 0) {
                                s2 = (short) (s2 + 1);
                                r1.A02(s2);
                            }
                        }
                        r22 = r22.A03;
                    } while (r22 != null);
                    s = (short) (s + 1);
                } while (s <= s2);
                do {
                    if ((r42.A05 & 16) != 0) {
                        C201489jh r62 = r42.A01.A00.A02;
                        C201489jh r32 = C201489jh.A0D;
                        r62.A04 = r32;
                        C201489jh r23 = r32;
                        while (r62 != r32) {
                            C201489jh r5 = r62.A04;
                            r62.A04 = r23;
                            if (!((r62.A05 & 64) == 0 || r62.A0A == r42.A0A)) {
                                short s3 = r62.A09;
                                r62.A01 = new C193269Ku(r62.A01, r42.A01.A02, s3);
                            }
                            C193269Ku r24 = r62.A01;
                            C193269Ku r12 = r24;
                            while (r24 != null) {
                                if (((r62.A05 & 16) == 0 || r24 != r12.A00) && r24.A02.A04 == null) {
                                    C201489jh r0 = r24.A02;
                                    r0.A04 = r5;
                                    r5 = r0;
                                }
                                r24 = r24.A00;
                            }
                            r23 = r62;
                            r62 = r5;
                        }
                        while (r23 != r32) {
                            C201489jh r13 = r23.A04;
                            r23.A04 = null;
                            r23 = r13;
                        }
                    }
                    r42 = r42.A03;
                } while (r42 != null);
            }
            C201489jh r72 = this.A0S;
            C201489jh r63 = C201489jh.A0D;
            r72.A04 = r63;
            int i4 = this.A07;
            while (r72 != r63) {
                C201489jh r14 = r72.A04;
                short s4 = r72.A06;
                int i5 = r72.A08 + s4;
                if (i5 > i4) {
                    i4 = i5;
                }
                C193269Ku r33 = r72.A01;
                if ((r72.A05 & 16) != 0) {
                    r33 = r33.A00;
                }
                r72 = r14;
                while (r33 != null) {
                    C201489jh r25 = r33.A02;
                    if (r25.A04 == null) {
                        int i6 = r33.A01;
                        int i7 = i6 + s4;
                        if (i6 == Integer.MAX_VALUE) {
                            i7 = 1;
                        }
                        r25.A06 = (short) i7;
                        r25.A04 = r72;
                        r72 = r25;
                    }
                    r33 = r33.A00;
                }
            }
            this.A07 = i4;
        } else if (i3 == 2) {
            this.A07 = this.A06;
        } else {
            this.A07 = i;
            this.A05 = i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0044, code lost:
        if (r5 == 57) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(int r5, int r6) {
        /*
            r4 = this;
            X.9k2 r2 = r4.A0l
            int r0 = r2.A00
            r4.A01 = r0
            r3 = 169(0xa9, float:2.37E-43)
            r1 = 54
            r0 = 4
            if (r6 >= r0) goto L_0x0071
            if (r5 == r3) goto L_0x007e
            int r0 = r5 + -54
            int r0 = r0 << 2
            int r0 = r0 + 59
            if (r5 >= r1) goto L_0x001d
            int r0 = r5 + -21
            int r0 = r0 << 2
            int r0 = r0 + 26
        L_0x001d:
            int r0 = r0 + r6
            r2.A05(r0)
        L_0x0021:
            X.9jh r2 = r4.A0R
            if (r2 == 0) goto L_0x0030
            int r1 = r4.A0e
            r0 = 3
            if (r1 != r0) goto L_0x004f
            X.9oQ r1 = r2.A02
            r0 = 0
            r1.A0D(r0, r0, r5, r6)
        L_0x0030:
            int r0 = r4.A0e
            if (r0 == 0) goto L_0x004e
            r0 = 22
            if (r5 == r0) goto L_0x0046
            r0 = 24
            if (r5 == r0) goto L_0x0046
            r0 = 55
            if (r5 == r0) goto L_0x0046
            r0 = 57
            int r1 = r6 + 1
            if (r5 != r0) goto L_0x0048
        L_0x0046:
            int r1 = r6 + 2
        L_0x0048:
            int r0 = r4.A05
            if (r1 <= r0) goto L_0x004e
            r4.A05 = r1
        L_0x004e:
            return
        L_0x004f:
            if (r5 != r3) goto L_0x0061
            short r0 = r2.A05
            r0 = r0 | 64
            short r0 = (short) r0
            r2.A05 = r0
            int r0 = r4.A09
            short r0 = (short) r0
            r2.A09 = r0
            r4.A00()
            goto L_0x0030
        L_0x0061:
            int r1 = r4.A09
            int[] r0 = A0o
            r0 = r0[r5]
            int r1 = r1 + r0
            int r0 = r4.A06
            if (r1 <= r0) goto L_0x006e
            r4.A06 = r1
        L_0x006e:
            r4.A09 = r1
            goto L_0x0030
        L_0x0071:
            r0 = 256(0x100, float:3.59E-43)
            if (r6 < r0) goto L_0x007e
            r0 = 196(0xc4, float:2.75E-43)
            r2.A05(r0)
            r2.A09(r5, r6)
            goto L_0x0021
        L_0x007e:
            r2.A08(r5, r6)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203189nU.A0B(int, int):void");
    }

    public void A0C(int i, String str) {
        C201639k2 r1 = this.A0l;
        this.A01 = r1.A00;
        C203329nn r4 = this.A0m;
        C202499m2 A032 = C203329nn.A03(str, r4, 7);
        r1.A09(i, A032.A02);
        C201489jh r2 = this.A0R;
        if (r2 == null) {
            return;
        }
        if (this.A0e == 3) {
            r2.A02.A0D(A032, r4, i, this.A01);
        } else if (i == 187) {
            int i2 = this.A09 + 1;
            if (i2 > this.A06) {
                this.A06 = i2;
            }
            this.A09 = i2;
        }
    }

    public void A0D(int i, String str, String str2, String str3) {
        int i2;
        C201639k2 r1 = this.A0l;
        this.A01 = r1.A00;
        C203329nn r4 = this.A0m;
        C202499m2 A012 = C203329nn.A01(str, str2, str3, r4, 9);
        r1.A09(i, A012.A02);
        C201489jh r2 = this.A0R;
        if (r2 != null) {
            int i3 = 0;
            if (this.A0e == 3) {
                r2.A02.A0D(A012, r4, i, 0);
                return;
            }
            char charAt = str3.charAt(0);
            int i4 = 1;
            int i5 = -2;
            int i6 = this.A09;
            switch (i) {
                case 178:
                    if (charAt == 'D' || charAt == 'J') {
                        i4 = 2;
                    }
                    i2 = i6 + i4;
                    break;
                case 179:
                    if (!(charAt == 'D' || charAt == 'J')) {
                        i5 = -1;
                        break;
                    }
                case 180:
                    if (charAt == 'D' || charAt == 'J') {
                        i3 = 1;
                    }
                    i2 = i6 + i3;
                    break;
                default:
                    if (charAt == 'D' || charAt == 'J') {
                        i5 = -3;
                        break;
                    }
            }
            i2 = i6 + i5;
            if (i2 > this.A06) {
                this.A06 = i2;
            }
            this.A09 = i2;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0E(java.lang.Object r11) {
        /*
            r10 = this;
            X.9k2 r2 = r10.A0l
            int r0 = r2.A00
            r10.A01 = r0
            X.9nn r6 = r10.A0m
            X.9m2 r7 = r6.A0C(r11)
            int r8 = r7.A02
            int r1 = r7.A03
            r9 = 1
            r5 = 0
            r0 = 5
            if (r1 == r0) goto L_0x002a
            r0 = 6
            if (r1 == r0) goto L_0x002a
            r0 = 17
            if (r1 != r0) goto L_0x004d
            java.lang.String r0 = r7.A08
            char r1 = r0.charAt(r5)
            r0 = 74
            if (r1 == r0) goto L_0x002a
            r0 = 68
            if (r1 != r0) goto L_0x004d
        L_0x002a:
            r4 = 1
        L_0x002b:
            r3 = 18
            r0 = 20
            if (r4 != 0) goto L_0x0037
            r0 = 256(0x100, float:3.59E-43)
            if (r8 < r0) goto L_0x0049
            r0 = 19
        L_0x0037:
            r2.A09(r0, r8)
        L_0x003a:
            X.9jh r2 = r10.A0R
            if (r2 == 0) goto L_0x0048
            int r1 = r10.A0e
            r0 = 3
            if (r1 != r0) goto L_0x004f
            X.9oQ r0 = r2.A02
            r0.A0D(r7, r6, r3, r5)
        L_0x0048:
            return
        L_0x0049:
            r2.A08(r3, r8)
            goto L_0x003a
        L_0x004d:
            r4 = 0
            goto L_0x002b
        L_0x004f:
            int r1 = r10.A09
            if (r4 == 0) goto L_0x0054
            r9 = 2
        L_0x0054:
            int r1 = r1 + r9
            int r0 = r10.A06
            if (r1 <= r0) goto L_0x005b
            r10.A06 = r1
        L_0x005b:
            r10.A09 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C203189nU.A0E(java.lang.Object):void");
    }

    public void A0F(String str, String str2, String str3, int i, boolean z) {
        C201639k2 r2 = this.A0l;
        this.A01 = r2.A00;
        C203329nn r3 = this.A0m;
        int i2 = 10;
        if (z) {
            i2 = 11;
        }
        C202499m2 A012 = C203329nn.A01(str, str2, str3, r3, i2);
        int i3 = A012.A02;
        if (i == 185) {
            r2.A09(185, i3);
            int i4 = A012.A00;
            if (i4 == 0) {
                i4 = C203309nl.A01(A012.A08);
                A012.A00 = i4;
            }
            r2.A08(i4 >> 2, 0);
        } else {
            r2.A09(i, i3);
        }
        C201489jh r22 = this.A0R;
        if (r22 == null) {
            return;
        }
        if (this.A0e == 3) {
            r22.A02.A0D(A012, r3, i, 0);
            return;
        }
        int i5 = A012.A00;
        if (i5 == 0) {
            i5 = C203309nl.A01(A012.A08);
            A012.A00 = i5;
        }
        int i6 = this.A09 + ((i5 & 3) - (i5 >> 2));
        if (i == 184) {
            i6++;
        }
        if (i6 > this.A06) {
            this.A06 = i6;
        }
        this.A09 = i6;
    }

    public void A0G(C201489jh r15) {
        int A022;
        boolean z = this.A0U;
        C201639k2 r0 = this.A0l;
        byte[] bArr = r0.A01;
        C201639k2 r6 = this.A0O;
        int i = r0.A00;
        short s = (short) (r15.A05 | 4);
        r15.A05 = s;
        r15.A00 = i;
        int[] iArr = r15.A0B;
        boolean z2 = false;
        if (iArr != null) {
            for (int i2 = iArr[0]; i2 > 0; i2 -= 2) {
                int i3 = iArr[i2 - 1];
                int i4 = iArr[i2];
                int i5 = i - i3;
                int i6 = 268435455 & i4;
                int i7 = i4 & -268435456;
                if (i7 == 268435456) {
                    if (i5 < -32768 || i5 > 32767) {
                        byte b = bArr[i3] & 255;
                        int i8 = b + 20;
                        if (b < 198) {
                            i8 = b + 49;
                        }
                        bArr[i3] = (byte) i8;
                        z2 = true;
                    }
                    A022 = i6 + 1;
                    bArr[i6] = (byte) (i5 >>> 8);
                } else if (i7 == 536870912) {
                    int i9 = i6 + 1;
                    int A023 = C165617ti.A02(i5 >>> 24, bArr, i6, i9);
                    A022 = C165617ti.A02(i5 >>> 16, bArr, i9, A023);
                    bArr[A023] = (byte) (i5 >>> 8);
                } else {
                    byte[] bArr2 = r6.A01;
                    bArr2[i6] = (byte) (i >>> 8);
                    bArr2[i6 + 1] = (byte) i;
                }
                bArr[A022] = (byte) i5;
            }
        }
        this.A0U = z | z2;
        if ((s & 1) == 0) {
            int i10 = this.A0e;
            if (i10 == 3) {
                C201489jh r02 = this.A0R;
                if (r02 != null) {
                    r02.A02.A00 = r15;
                    return;
                }
            } else if (i10 == 1) {
                C201489jh r1 = this.A0R;
                if (r1 != null) {
                    r1.A08 = (short) this.A06;
                    A03(r15, this.A09);
                }
                this.A0R = r15;
                this.A09 = 0;
                this.A06 = 0;
                C201489jh r03 = this.A0c;
                if (r03 != null) {
                    r03.A03 = r15;
                }
                this.A0c = r15;
                return;
            } else if (!(i10 == 2 && this.A0R == null)) {
                return;
            }
            this.A0R = r15;
        }
    }

    public void A0H(C201489jh r12, int i) {
        boolean z;
        C201639k2 r7 = this.A0l;
        int i2 = r7.A00;
        this.A01 = i2;
        int i3 = 200;
        int i4 = i;
        if (i >= 200) {
            i4 = i - 33;
        }
        if ((r12.A05 & 4) == 0 || r12.A00 - i2 >= -32768) {
            if (i4 != i) {
                r7.A05(i);
                r12.A01(r7, r7.A00 - 1, true);
            } else {
                r7.A05(i4);
                r12.A01(r7, r7.A00 - 1, false);
            }
            z = false;
        } else {
            if (i4 != 167) {
                if (i4 == 168) {
                    i3 = 201;
                } else {
                    int i5 = ((i4 + 1) ^ 1) - 1;
                    if (i4 >= 198) {
                        i5 = i4 ^ 1;
                    }
                    r7.A05(i5);
                    r7.A07(8);
                    r7.A05(220);
                    this.A0U = true;
                    z = true;
                    r12.A01(r7, r7.A00 - 1, true);
                }
            }
            r7.A05(i3);
            z = false;
            r12.A01(r7, r7.A00 - 1, true);
        }
        C201489jh r72 = this.A0R;
        if (r72 != null) {
            int i6 = this.A0e;
            if (i6 == 3) {
                r72.A02.A0D((C202499m2) null, (C203329nn) null, i4, 0);
            } else if (i6 == 2) {
                this.A09 += A0o[i4];
            } else if (i4 == 168) {
                short s = r12.A05;
                if ((s & 32) == 0) {
                    r12.A05 = (short) (s | 32);
                    this.A0V = true;
                }
                r72.A05 = (short) (r72.A05 | 16);
                A03(r12, this.A09 + 1);
                C201489jh r1 = new C201489jh();
                if (z) {
                    r1.A05 = (short) (r1.A05 | 2);
                }
                A0G(r1);
                return;
            } else {
                int i7 = this.A09 + A0o[i4];
                this.A09 = i7;
                A03(r12, i7);
            }
            if (i4 == 167) {
                A00();
            }
        }
    }

    public void A0I(C201489jh r7, C201489jh[] r8, int i, int i2) {
        C201639k2 r5 = this.A0l;
        this.A01 = r5.A00;
        r5.A05(170);
        r5.A0C((byte[]) null, 0, (4 - (r5.A00 % 4)) % 4);
        r7.A01(r5, this.A01, true);
        r5.A06(i);
        r5.A06(i2);
        for (C201489jh A012 : r8) {
            A012.A01(r5, this.A01, true);
        }
        A04(r7, this, r8);
    }

    public void A0J(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        C201639k2 r2;
        int i4;
        int i5 = this.A0e;
        if (i5 == 3) {
            C201489jh r0 = this.A0R;
            C203629oQ r4 = r0.A02;
            if (r4 == null) {
                C22582ArA arA = new C22582ArA(r0);
                r0.A02 = arA;
                arA.A0B(this.A0j, this.A0m, this.A0d, i2);
            } else if (i == -1) {
                C203329nn r5 = this.A0m;
                int i6 = 0;
                for (int i7 = 0; i7 < i2; i7++) {
                    int i8 = i6 + 1;
                    r4.A05[i6] = C203629oQ.A01(objArr[i7], r5);
                    if (objArr[i7] == B4E.A03 || objArr[i7] == B4E.A00) {
                        i6 = i8 + 1;
                        r4.A05[i8] = 4194304;
                    } else {
                        i6 = i8;
                    }
                }
                while (true) {
                    int[] iArr = r4.A05;
                    if (i6 >= iArr.length) {
                        break;
                    }
                    iArr[i6] = 4194304;
                    i6++;
                }
                int i9 = 0;
                for (int i10 = 0; i10 < i3; i10++) {
                    if (objArr2[i10] == B4E.A03 || objArr2[i10] == B4E.A00) {
                        i9++;
                    }
                }
                r4.A06 = new int[(i9 + i3)];
                int i11 = 0;
                for (int i12 = 0; i12 < i3; i12++) {
                    int i13 = i11 + 1;
                    r4.A06[i11] = C203629oQ.A01(objArr2[i12], r5);
                    if (objArr2[i12] == B4E.A03 || objArr2[i12] == B4E.A00) {
                        i11 = i13 + 1;
                        r4.A06[i13] = 4194304;
                    } else {
                        i11 = i13;
                    }
                }
                r4.A03 = 0;
                r4.A01 = 0;
            }
            this.A0R.A02.A0C(this);
        } else {
            if (i == -1) {
                if (this.A0X == null) {
                    String str = this.A0j;
                    C203629oQ r22 = new C203629oQ(new C201489jh());
                    r22.A0B(str, this.A0m, this.A0d, C203309nl.A01(str) >> 2);
                    r22.A0C(this);
                }
                this.A0a = i2;
                int i14 = this.A0l.A00;
                int i15 = i2 + 3 + i3;
                int[] iArr2 = this.A0W;
                if (iArr2 == null || iArr2.length < i15) {
                    iArr2 = new int[i15];
                    this.A0W = iArr2;
                }
                iArr2[0] = i14;
                iArr2[1] = i2;
                iArr2[2] = i3;
                int i16 = 3;
                int i17 = 0;
                while (i17 < i2) {
                    this.A0W[i16] = C203629oQ.A01(objArr[i17], this.A0m);
                    i17++;
                    i16++;
                }
                int i18 = 0;
                while (i18 < i3) {
                    this.A0W[i16] = C203629oQ.A01(objArr2[i18], this.A0m);
                    i18++;
                    i16++;
                }
                A06();
            } else if (this.A0m.A03 >= 50) {
                C201639k2 r6 = this.A0O;
                if (r6 == null) {
                    r6 = new C201639k2();
                    this.A0O = r6;
                    r2 = this.A0l;
                    i4 = r2.A00;
                } else {
                    r2 = this.A0l;
                    i4 = (r2.A00 - this.A0b) - 1;
                    if (i4 < 0) {
                        if (i != 3) {
                            throw C165617ti.A0V();
                        }
                        return;
                    }
                }
                if (i == 0) {
                    this.A0a = i2;
                    r6.A05(255);
                    r6.A07(i4);
                    r6.A07(i2);
                    for (int i19 = 0; i19 < i2; i19++) {
                        A02(objArr[i19]);
                    }
                    this.A0O.A07(i3);
                    for (int i20 = 0; i20 < i3; i20++) {
                        A02(objArr2[i20]);
                    }
                } else if (i != 1) {
                    int i21 = 251;
                    if (i == 2) {
                        this.A0a -= i2;
                        i21 = 251 - i2;
                    } else if (i != 3) {
                        if (i == 4) {
                            if (i4 < 64) {
                                r6.A05(i4 + 64);
                            } else {
                                r6.A05(247);
                                r6.A07(i4);
                            }
                            A02(objArr2[0]);
                        } else {
                            throw C165617ti.A0U();
                        }
                    } else if (i4 < 64) {
                        r6.A05(i4);
                    }
                    r6.A05(i21);
                    r6.A07(i4);
                } else {
                    this.A0a += i2;
                    r6.A05(i2 + 251);
                    r6.A07(i4);
                    for (int i22 = 0; i22 < i2; i22++) {
                        A02(objArr[i22]);
                    }
                }
                this.A0b = r2.A00;
                this.A0A++;
            } else {
                throw AnonymousClass001.A08("Class versions V1_5 or less must use F_NEW frames.");
            }
            if (i5 == 2) {
                this.A09 = i3;
                int i23 = i3;
                for (int i24 = 0; i24 < i3; i24++) {
                    if (objArr2[i24] == B4E.A03 || objArr2[i24] == B4E.A00) {
                        i23++;
                        this.A09 = i23;
                    }
                }
                if (i23 > this.A06) {
                    this.A06 = i23;
                }
            }
        }
        this.A07 = Math.max(this.A07, i3);
        this.A05 = Math.max(this.A05, this.A0a);
    }
}
