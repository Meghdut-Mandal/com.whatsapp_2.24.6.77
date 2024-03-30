package X;

import java.util.Arrays;

/* renamed from: X.0B3  reason: invalid class name */
public class AnonymousClass0B3 {
    public static int A0E = 1000;
    public static boolean A0F = true;
    public static long A0G;
    public static long A0H;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public AnonymousClass0B5 A04;
    public boolean A05;
    public AnonymousClass0B6[] A06;
    public int A07;
    public int A08;
    public int A09;
    public AnonymousClass0B5 A0A;
    public AnonymousClass0B4[] A0B;
    public boolean[] A0C;
    public final AnonymousClass0B7 A0D;

    public static final void A05(AnonymousClass0B5 r9, AnonymousClass0B3 r10) {
        for (int i = 0; i < r10.A01; i++) {
            r10.A0C[i] = false;
        }
        int i2 = 0;
        while (true) {
            i2++;
            if (i2 < r10.A01 * 2) {
                AnonymousClass0B4 r0 = ((AnonymousClass0B6) r9).A02;
                if (r0 != null) {
                    r10.A0C[r0.A04] = true;
                }
                boolean[] zArr = r10.A0C;
                AnonymousClass0B4 BFw = r9.BFw(r10, zArr);
                if (BFw != null) {
                    int i3 = BFw.A04;
                    if (!zArr[i3]) {
                        zArr[i3] = true;
                        float f = Float.MAX_VALUE;
                        int i4 = -1;
                        for (int i5 = 0; i5 < r10.A02; i5++) {
                            AnonymousClass0B6 r1 = r10.A06[i5];
                            if (r1.A02.A07 != C023109s.A00 && !r1.A04 && r1.A01.B3X(BFw)) {
                                float B7u = r1.A01.B7u(BFw);
                                if (B7u < 0.0f) {
                                    float f2 = (-r1.A00) / B7u;
                                    if (f2 < f) {
                                        i4 = i5;
                                        f = f2;
                                    }
                                }
                            }
                        }
                        if (i4 > -1) {
                            AnonymousClass0B6 r12 = r10.A06[i4];
                            r12.A02.A03 = -1;
                            r12.A03(BFw);
                            AnonymousClass0B4 r02 = r12.A02;
                            r02.A03 = i4;
                            r02.A04(r12);
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public AnonymousClass0B4 A09(Object obj) {
        AnonymousClass0B4 r3 = null;
        if (obj != null) {
            if (this.A01 + 1 >= this.A00) {
                A02();
            }
            if (obj instanceof AnonymousClass0Az) {
                AnonymousClass0Az r5 = (AnonymousClass0Az) obj;
                r3 = r5.A02;
                if (r3 == null) {
                    r5.A03();
                    r3 = r5.A02;
                }
                int i = r3.A04;
                if (i != -1) {
                    if (i > this.A03 || this.A0D.A03[i] == null) {
                        if (i != -1) {
                            r3.A00();
                        }
                    }
                }
                int i2 = this.A03 + 1;
                this.A03 = i2;
                this.A01++;
                r3.A04 = i2;
                r3.A07 = C023109s.A00;
                this.A0D.A03[i2] = r3;
            }
        }
        return r3;
    }

    public void A0A() {
        AnonymousClass0B7 r5;
        AnonymousClass0B4[] r10;
        AnonymousClass0B5 r0;
        int i = 0;
        while (true) {
            r5 = this.A0D;
            r10 = r5.A03;
            if (i >= r10.length) {
                break;
            }
            AnonymousClass0B4 r02 = r10[i];
            if (r02 != null) {
                r02.A00();
            }
            i++;
        }
        AnonymousClass0B8 r9 = r5.A02;
        AnonymousClass0B4[] r8 = this.A0B;
        int i2 = this.A09;
        AnonymousClass0B9 r92 = (AnonymousClass0B9) r9;
        int length = r8.length;
        if (i2 > length) {
            i2 = length;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            AnonymousClass0B4 r3 = r8[i3];
            int i4 = r92.A00;
            Object[] objArr = r92.A01;
            if (i4 < 256) {
                objArr[i4] = r3;
                r92.A00 = i4 + 1;
            }
        }
        this.A09 = 0;
        Arrays.fill(r10, (Object) null);
        this.A03 = 0;
        this.A04.clear();
        this.A01 = 1;
        for (int i5 = 0; i5 < this.A02; i5++) {
        }
        A03();
        this.A02 = 0;
        if (A0F) {
            r0 = new AnonymousClass0BE(r5, this);
        } else {
            r0 = new AnonymousClass0B6(r5);
        }
        this.A0A = r0;
    }

    public static int A00(Object obj) {
        AnonymousClass0B4 r0 = ((AnonymousClass0Az) obj).A02;
        if (r0 != null) {
            return (int) (r0.A02 + 0.5f);
        }
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.0B4} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private X.AnonymousClass0B4 A01(java.lang.Integer r6) {
        /*
            r5 = this;
            X.0B7 r0 = r5.A0D
            X.0B8 r4 = r0.A02
            X.0B9 r4 = (X.AnonymousClass0B9) r4
            int r0 = r4.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0043
            int r1 = r0 + -1
            java.lang.Object[] r0 = r4.A01
            r3 = r0[r1]
            r0[r1] = r2
            r4.A00 = r1
        L_0x0015:
            X.0B4 r3 = (X.AnonymousClass0B4) r3
            if (r3 != 0) goto L_0x003f
            X.0B4 r3 = new X.0B4
            r3.<init>(r6)
        L_0x001e:
            r3.A07 = r6
            int r1 = r5.A09
            int r0 = A0E
            if (r1 < r0) goto L_0x0034
            int r1 = r0 * 2
            A0E = r1
            X.0B4[] r0 = r5.A0B
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            X.0B4[] r0 = (X.AnonymousClass0B4[]) r0
            r5.A0B = r0
        L_0x0034:
            X.0B4[] r2 = r5.A0B
            int r1 = r5.A09
            int r0 = r1 + 1
            r5.A09 = r0
            r2[r1] = r3
            return r3
        L_0x003f:
            r3.A00()
            goto L_0x001e
        L_0x0043:
            r3 = r2
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B3.A01(java.lang.Integer):X.0B4");
    }

    private void A02() {
        int i = this.A07 * 2;
        this.A07 = i;
        this.A06 = (AnonymousClass0B6[]) Arrays.copyOf(this.A06, i);
        AnonymousClass0B7 r2 = this.A0D;
        r2.A03 = (AnonymousClass0B4[]) Arrays.copyOf(r2.A03, this.A07);
        int i2 = this.A07;
        this.A0C = new boolean[i2];
        this.A00 = i2;
        this.A08 = i2;
    }

    private void A03() {
        int i = 0;
        if (A0F) {
            while (true) {
                AnonymousClass0B6[] r5 = this.A06;
                if (i < r5.length) {
                    AnonymousClass0B6 r4 = r5[i];
                    if (r4 != null) {
                        AnonymousClass0B9 r3 = (AnonymousClass0B9) this.A0D.A01;
                        int i2 = r3.A00;
                        Object[] objArr = r3.A01;
                        if (i2 < 256) {
                            objArr[i2] = r4;
                            r3.A00 = i2 + 1;
                        }
                    }
                    r5[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            while (true) {
                AnonymousClass0B6[] r52 = this.A06;
                if (i < r52.length) {
                    AnonymousClass0B6 r42 = r52[i];
                    if (r42 != null) {
                        AnonymousClass0B9 r32 = (AnonymousClass0B9) this.A0D.A00;
                        int i3 = r32.A00;
                        Object[] objArr2 = r32.A01;
                        if (i3 < 256) {
                            objArr2[i3] = r42;
                            r32.A00 = i3 + 1;
                        }
                    }
                    r52[i] = null;
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    private final void A04(AnonymousClass0B6 r8) {
        AnonymousClass0B8 r3;
        boolean z = A0F;
        AnonymousClass0B6[] r6 = this.A06;
        int i = this.A02;
        AnonymousClass0B6 r4 = r6[i];
        if (z) {
            if (r4 != null) {
                r3 = this.A0D.A01;
            }
            r6[i] = r8;
            AnonymousClass0B4 r1 = r8.A02;
            r1.A03 = i;
            this.A02 = i + 1;
            r1.A04(r8);
        }
        if (r4 != null) {
            r3 = this.A0D.A00;
        }
        r6[i] = r8;
        AnonymousClass0B4 r12 = r8.A02;
        r12.A03 = i;
        this.A02 = i + 1;
        r12.A04(r8);
        AnonymousClass0B9 r32 = (AnonymousClass0B9) r3;
        int i2 = r32.A00;
        Object[] objArr = r32.A01;
        if (i2 < 256) {
            objArr[i2] = r4;
            r32.A00 = i2 + 1;
        }
        r6[i] = r8;
        AnonymousClass0B4 r122 = r8.A02;
        r122.A03 = i;
        this.A02 = i + 1;
        r122.A04(r8);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.0B6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.0B6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: X.0B6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0B6 A06() {
        /*
            r8 = this;
            boolean r0 = A0F
            r6 = 1
            X.0B7 r5 = r8.A0D
            if (r0 == 0) goto L_0x0032
            X.0B8 r3 = r5.A01
            X.0B9 r3 = (X.AnonymousClass0B9) r3
            int r0 = r3.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0030
            int r1 = r0 + -1
            java.lang.Object[] r0 = r3.A01
            r4 = r0[r1]
            r0[r1] = r2
            r3.A00 = r1
        L_0x001b:
            X.0B6 r4 = (X.AnonymousClass0B6) r4
            if (r4 != 0) goto L_0x0056
            X.0BE r4 = new X.0BE
            r4.<init>(r5, r8)
            long r0 = A0H
            long r0 = r0 + r6
            A0H = r0
        L_0x0029:
            int r0 = X.AnonymousClass0B4.A0C
            int r0 = r0 + 1
            X.AnonymousClass0B4.A0C = r0
            return r4
        L_0x0030:
            r4 = r2
            goto L_0x001b
        L_0x0032:
            X.0B8 r3 = r5.A00
            X.0B9 r3 = (X.AnonymousClass0B9) r3
            int r0 = r3.A00
            r2 = 0
            if (r0 <= 0) goto L_0x0054
            int r1 = r0 + -1
            java.lang.Object[] r0 = r3.A01
            r4 = r0[r1]
            r0[r1] = r2
            r3.A00 = r1
        L_0x0045:
            X.0B6 r4 = (X.AnonymousClass0B6) r4
            if (r4 != 0) goto L_0x0056
            X.0B6 r4 = new X.0B6
            r4.<init>(r5)
            long r0 = A0G
            long r0 = r0 + r6
            A0G = r0
            goto L_0x0029
        L_0x0054:
            r4 = r2
            goto L_0x0045
        L_0x0056:
            r0 = 0
            r4.A02 = r0
            X.0BB r0 = r4.A01
            r0.clear()
            r0 = 0
            r4.A00 = r0
            r0 = 0
            r4.A04 = r0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B3.A06():X.0B6");
    }

    public AnonymousClass0B4 A07() {
        if (this.A01 + 1 >= this.A00) {
            A02();
        }
        AnonymousClass0B4 A012 = A01(C023109s.A0C);
        int i = this.A03 + 1;
        this.A03 = i;
        this.A01++;
        A012.A04 = i;
        this.A0D.A03[i] = A012;
        return A012;
    }

    public AnonymousClass0B4 A08(int i) {
        if (this.A01 + 1 >= this.A00) {
            A02();
        }
        AnonymousClass0B4 A012 = A01(C023109s.A0G);
        int i2 = this.A03 + 1;
        this.A03 = i2;
        this.A01++;
        A012.A04 = i2;
        A012.A05 = i;
        this.A0D.A03[i2] = A012;
        this.A04.B0N(A012);
        return A012;
    }

    /* JADX WARNING: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x018f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0B(X.AnonymousClass0B6 r18) {
        /*
            r17 = this;
            r3 = r17
            int r0 = r3.A02
            r2 = 1
            int r1 = r0 + 1
            int r0 = r3.A08
            if (r1 >= r0) goto L_0x0013
            int r0 = r3.A01
            int r1 = r0 + 1
            int r0 = r3.A00
            if (r1 < r0) goto L_0x0016
        L_0x0013:
            r3.A02()
        L_0x0016:
            r4 = r18
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x019d
            X.0B6[] r0 = r3.A06
            int r0 = r0.length
            if (r0 != 0) goto L_0x0108
        L_0x0021:
            X.0B4 r0 = r4.A02
            if (r0 != 0) goto L_0x0035
            float r1 = r4.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            X.0BB r0 = r4.A01
            int r0 = r0.BAh()
            if (r0 != 0) goto L_0x0035
        L_0x0034:
            return
        L_0x0035:
            float r1 = r4.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0046
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r1 = r1 * r0
            r4.A00 = r1
            X.0BB r0 = r4.A01
            r0.BKr()
        L_0x0046:
            X.0BB r8 = r4.A01
            int r7 = r8.BAh()
            r9 = 0
            r16 = 0
            r15 = r9
            r6 = 0
            r14 = 0
            r13 = 0
            r12 = 0
            r11 = 0
        L_0x0055:
            if (r6 >= r7) goto L_0x009f
            float r10 = r8.BIt(r6)
            X.0B4 r5 = r8.BIs(r6)
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x0080
            if (r9 == 0) goto L_0x0077
            int r0 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0077
            if (r14 != 0) goto L_0x0074
            int r0 = r5.A06
            if (r0 > r2) goto L_0x0074
            r12 = r10
            r9 = r5
            r14 = 1
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x0055
        L_0x0077:
            int r0 = r5.A06
            r14 = 1
            if (r0 <= r2) goto L_0x007d
            r14 = 0
        L_0x007d:
            r12 = r10
            r9 = r5
            goto L_0x0074
        L_0x0080:
            if (r9 != 0) goto L_0x0074
            int r0 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0074
            if (r15 == 0) goto L_0x0096
            int r0 = (r11 > r10 ? 1 : (r11 == r10 ? 0 : -1))
            if (r0 > 0) goto L_0x0096
            if (r13 != 0) goto L_0x0074
            int r0 = r5.A06
            if (r0 > r2) goto L_0x0074
            r11 = r10
            r15 = r5
            r13 = 1
            goto L_0x0074
        L_0x0096:
            int r0 = r5.A06
            r13 = 1
            if (r0 <= r2) goto L_0x009c
            r13 = 0
        L_0x009c:
            r11 = r10
            r15 = r5
            goto L_0x0074
        L_0x009f:
            if (r9 != 0) goto L_0x0100
            r9 = r15
            if (r15 != 0) goto L_0x0100
            r1 = 1
        L_0x00a5:
            X.0BB r0 = r4.A01
            int r0 = r0.BAh()
            if (r0 != 0) goto L_0x00af
            r4.A04 = r2
        L_0x00af:
            if (r1 == 0) goto L_0x0105
            int r0 = r3.A01
            int r1 = r0 + 1
            int r0 = r3.A00
            if (r1 < r0) goto L_0x00bc
            r3.A02()
        L_0x00bc:
            java.lang.Integer r0 = X.C023109s.A0C
            X.0B4 r7 = r3.A01(r0)
            int r0 = r3.A03
            int r1 = r0 + 1
            r3.A03 = r1
            int r0 = r3.A01
            int r0 = r0 + 1
            r3.A01 = r0
            r7.A04 = r1
            X.0B7 r0 = r3.A0D
            X.0B4[] r0 = r0.A03
            r0[r1] = r7
            r4.A02 = r7
            r3.A04(r4)
            X.0B5 r8 = r3.A0A
            X.0B6 r8 = (X.AnonymousClass0B6) r8
            r0 = 0
            r8.A02 = r0
            X.0BB r0 = r8.A01
            r0.clear()
            r6 = 0
        L_0x00e8:
            X.0BB r1 = r4.A01
            int r0 = r1.BAh()
            if (r6 >= r0) goto L_0x0165
            X.0B4 r5 = r1.BIs(r6)
            float r1 = r1.BIt(r6)
            X.0BB r0 = r8.A01
            r0.B0C(r5, r1, r2)
            int r6 = r6 + 1
            goto L_0x00e8
        L_0x0100:
            r4.A03(r9)
            r1 = 0
            goto L_0x00a5
        L_0x0105:
            r2 = 0
            goto L_0x018b
        L_0x0108:
            X.0BB r8 = r4.A01
            int r7 = r8.BAh()
            r6 = 0
        L_0x010f:
            if (r6 >= r7) goto L_0x0126
            X.0B4 r5 = r8.BIs(r6)
            int r1 = r5.A03
            r0 = -1
            if (r1 != r0) goto L_0x011e
            boolean r0 = r5.A09
            if (r0 == 0) goto L_0x0123
        L_0x011e:
            java.util.ArrayList r0 = r4.A03
            r0.add(r5)
        L_0x0123:
            int r6 = r6 + 1
            goto L_0x010f
        L_0x0126:
            java.util.ArrayList r9 = r4.A03
            int r0 = r9.size()
            if (r0 <= 0) goto L_0x0021
            java.util.Iterator r8 = r9.iterator()
        L_0x0132:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0161
            java.lang.Object r7 = r8.next()
            X.0B4 r7 = (X.AnonymousClass0B4) r7
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x0157
            X.0BB r6 = r4.A01
            float r5 = r6.B7u(r7)
            float r1 = r4.A00
            float r0 = r7.A02
            float r0 = r0 * r5
            float r1 = r1 + r0
            r4.A00 = r1
            r6.Bnb(r7, r2)
            r7.A03(r4)
            goto L_0x0132
        L_0x0157:
            X.0B6[] r1 = r3.A06
            int r0 = r7.A03
            r0 = r1[r0]
            r4.A06(r0, r2)
            goto L_0x0132
        L_0x0161:
            r9.clear()
            goto L_0x0108
        L_0x0165:
            X.0B5 r0 = r3.A0A
            A05(r0, r3)
            int r1 = r7.A03
            r0 = -1
            if (r1 != r0) goto L_0x018b
            X.0B4 r0 = r4.A02
            if (r0 != r7) goto L_0x017d
            r0 = 0
            X.0B4 r0 = X.AnonymousClass0B6.A00(r4, r7, r0)
            if (r0 == 0) goto L_0x017d
            r4.A03(r0)
        L_0x017d:
            boolean r0 = r4.A04
            if (r0 != 0) goto L_0x0186
            X.0B4 r0 = r4.A02
            r0.A04(r4)
        L_0x0186:
            int r0 = r3.A02
            int r0 = r0 - r2
            r3.A02 = r0
        L_0x018b:
            X.0B4 r0 = r4.A02
            if (r0 == 0) goto L_0x0034
            java.lang.Integer r1 = r0.A07
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 == r0) goto L_0x019b
            float r0 = r4.A00
            int r0 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x0034
        L_0x019b:
            if (r2 != 0) goto L_0x0034
        L_0x019d:
            r3.A04(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0B3.A0B(X.0B6):void");
    }

    public void A0C(AnonymousClass0B4 r4, int i) {
        AnonymousClass0B6 r2;
        AnonymousClass0BB r1;
        float f;
        int i2 = r4.A03;
        if (i2 == -1) {
            r4.A01((float) i);
            return;
        }
        if (i2 != -1) {
            AnonymousClass0B6 r12 = this.A06[i2];
            if (!r12.A04) {
                if (r12.A01.BAh() == 0) {
                    r12.A04 = true;
                } else {
                    r2 = A06();
                    if (i < 0) {
                        r2.A00 = (float) (-i);
                        r1 = r2.A01;
                        f = 1.0f;
                    } else {
                        r2.A00 = (float) i;
                        r1 = r2.A01;
                        f = -1.0f;
                    }
                    r1.BmZ(r4, f);
                }
            }
            r12.A00 = (float) i;
            return;
        }
        r2 = A06();
        r2.A02 = r4;
        float f2 = (float) i;
        r4.A02 = f2;
        r2.A00 = f2;
        r2.A04 = true;
        A0B(r2);
    }

    public void A0D(AnonymousClass0B4 r7, AnonymousClass0B4 r8, int i, int i2) {
        if (i2 == 8 && r8.A09 && r7.A03 == -1) {
            r7.A01(r8.A02 + ((float) i));
            return;
        }
        AnonymousClass0B6 A062 = A06();
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i = -i;
                z = true;
            }
            A062.A00 = (float) i;
        }
        AnonymousClass0BB r0 = A062.A01;
        if (!z) {
            r0.BmZ(r7, -1.0f);
            A062.A01.BmZ(r8, 1.0f);
        } else {
            r0.BmZ(r7, 1.0f);
            A062.A01.BmZ(r8, -1.0f);
        }
        if (i2 != 8) {
            A062.A01.BmZ(A08(i2), 1.0f);
            A062.A01.BmZ(A08(i2), -1.0f);
        }
        A0B(A062);
    }

    public AnonymousClass0B3() {
        AnonymousClass0B5 r0;
        this.A03 = 0;
        this.A07 = 32;
        this.A00 = 32;
        this.A06 = null;
        this.A05 = false;
        this.A0C = new boolean[32];
        this.A01 = 1;
        this.A02 = 0;
        this.A08 = 32;
        this.A0B = new AnonymousClass0B4[A0E];
        this.A09 = 0;
        this.A06 = new AnonymousClass0B6[32];
        A03();
        AnonymousClass0B7 r1 = new AnonymousClass0B7();
        this.A0D = r1;
        this.A04 = new AnonymousClass0BA(r1);
        if (A0F) {
            r0 = new AnonymousClass0BE(r1, this);
        } else {
            r0 = new AnonymousClass0B6(r1);
        }
        this.A0A = r0;
    }

    public void A0E(AnonymousClass0B4 r5, AnonymousClass0B4 r6, int i, int i2) {
        AnonymousClass0B6 A062 = A06();
        AnonymousClass0B4 A072 = A07();
        A072.A05 = 0;
        A062.A04(r5, r6, A072, i);
        if (i2 != 8) {
            int B7u = (int) (A062.A01.B7u(A072) * -1.0f);
            A062.A01.BmZ(A08(i2), (float) B7u);
        }
        A0B(A062);
    }

    public void A0F(AnonymousClass0B4 r5, AnonymousClass0B4 r6, int i, int i2) {
        AnonymousClass0B6 A062 = A06();
        AnonymousClass0B4 A072 = A07();
        A072.A05 = 0;
        A062.A05(r5, r6, A072, i);
        if (i2 != 8) {
            int B7u = (int) (A062.A01.B7u(A072) * -1.0f);
            A062.A01.BmZ(A08(i2), (float) B7u);
        }
        A0B(A062);
    }

    public void A0G(AnonymousClass0B4 r7, AnonymousClass0B4 r8, AnonymousClass0B4 r9, AnonymousClass0B4 r10, float f, int i, int i2, int i3) {
        float f2;
        int i4;
        AnonymousClass0B6 A062 = A06();
        if (r8 == r9) {
            A062.A01.BmZ(r7, 1.0f);
            A062.A01.BmZ(r10, 1.0f);
            A062.A01.BmZ(r8, -2.0f);
        } else {
            if (f == 0.5f) {
                A062.A01.BmZ(r7, 1.0f);
                A062.A01.BmZ(r8, -1.0f);
                A062.A01.BmZ(r9, -1.0f);
                A062.A01.BmZ(r10, 1.0f);
                if (i > 0 || i2 > 0) {
                    i4 = (-i) + i2;
                }
            } else {
                if (f <= 0.0f) {
                    A062.A01.BmZ(r7, -1.0f);
                    A062.A01.BmZ(r8, 1.0f);
                    f2 = (float) i;
                } else if (f >= 1.0f) {
                    A062.A01.BmZ(r10, -1.0f);
                    A062.A01.BmZ(r9, 1.0f);
                    i4 = -i2;
                } else {
                    float f3 = 1.0f - f;
                    A062.A01.BmZ(r7, f3 * 1.0f);
                    A062.A01.BmZ(r8, f3 * -1.0f);
                    A062.A01.BmZ(r9, -1.0f * f);
                    A062.A01.BmZ(r10, 1.0f * f);
                    if (i > 0 || i2 > 0) {
                        f2 = (((float) (-i)) * f3) + (((float) i2) * f);
                    }
                }
                A062.A00 = f2;
            }
            f2 = (float) i4;
            A062.A00 = f2;
        }
        if (i3 != 8) {
            A062.A01.BmZ(A08(i3), 1.0f);
            A062.A01.BmZ(A08(i3), -1.0f);
        }
        A0B(A062);
    }
}
