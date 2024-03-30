package X;

import java.util.List;

/* renamed from: X.0Ay  reason: invalid class name and case insensitive filesystem */
public class C02570Ay extends C02540Au {
    public AnonymousClass0Ax A00 = null;
    public C02560Aw A01;

    public void A0B() {
        this.A00 = null;
        this.A05.A00();
        this.A04.A00();
        this.A01.A00();
        this.A06.A00();
        this.A08 = false;
    }

    public void A0D() {
        this.A08 = false;
        C02560Aw r0 = this.A05;
        r0.A00();
        r0.A0B = false;
        C02560Aw r02 = this.A04;
        r02.A00();
        r02.A0B = false;
        C02560Aw r03 = this.A01;
        r03.A00();
        r03.A0B = false;
        this.A06.A0B = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0075, code lost:
        r4 = r12.A03;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x023a  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x026a  */
    /* JADX WARNING: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0195  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01f6  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0207  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r12 = this;
            X.0Aq r2 = r12.A03
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x000f
            X.0Ax r1 = r12.A06
            int r0 = r2.A02()
            r1.A01(r0)
        L_0x000f:
            X.0Ax r3 = r12.A06
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x006f
            X.0Aq r6 = r12.A03
            java.lang.Integer[] r1 = r6.A0q
            r0 = 1
            r2 = r1[r0]
            r12.A07 = r2
            boolean r0 = r6.A0h
            if (r0 == 0) goto L_0x0029
            X.0GL r0 = new X.0GL
            r0.<init>(r12)
            r12.A00 = r0
        L_0x0029:
            java.lang.Integer r0 = X.C023109s.A0C
            if (r2 == r0) goto L_0x00b1
            java.lang.Integer r0 = X.C023109s.A0G
            if (r2 != r0) goto L_0x00a6
            X.0Aq r5 = r6.A0Z
            if (r5 == 0) goto L_0x00a6
            java.lang.Integer[] r1 = r5.A0q
            r0 = 1
            r1 = r1[r0]
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x00a6
            int r4 = r5.A02()
            X.0Az r0 = r6.A0Y
            int r2 = r0.A00()
            int r4 = r4 - r2
            X.0Az r0 = r6.A0S
            int r0 = r0.A00()
            int r4 = r4 - r0
            X.0Aw r1 = r12.A05
            X.0Ay r0 = r5.A0d
            X.0Aw r0 = r0.A05
            X.C02540Au.A02(r1, r0, r2)
            X.0Aw r2 = r12.A04
            X.0Ay r0 = r5.A0d
            X.0Aw r1 = r0.A04
            X.0Aq r0 = r12.A03
            X.0Az r0 = r0.A0S
            int r0 = r0.A00()
            int r0 = -r0
            X.C02540Au.A02(r2, r1, r0)
            r3.A01(r4)
        L_0x006e:
            return
        L_0x006f:
            java.lang.Integer r1 = r12.A07
            java.lang.Integer r0 = X.C023109s.A0G
            if (r1 != r0) goto L_0x00b1
            X.0Aq r4 = r12.A03
            X.0Aq r5 = r4.A0Z
            if (r5 == 0) goto L_0x00b1
            java.lang.Integer[] r1 = r5.A0q
            r0 = 1
            r1 = r1[r0]
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 != r0) goto L_0x00b1
            X.0Aw r2 = r12.A05
            X.0Ay r0 = r5.A0d
            X.0Aw r1 = r0.A05
            X.0Az r0 = r4.A0Y
            int r0 = r0.A00()
            X.C02540Au.A02(r2, r1, r0)
            X.0Aw r4 = r12.A04
            X.0Ay r0 = r5.A0d
            X.0Aw r2 = r0.A04
            X.0Aq r0 = r12.A03
            X.0Az r0 = r0.A0S
            int r0 = r0.A00()
            int r0 = -r0
        L_0x00a2:
            X.C02540Au.A02(r4, r2, r0)
            return
        L_0x00a6:
            java.lang.Integer r0 = X.C023109s.A00
            if (r2 != r0) goto L_0x00b1
            int r0 = r6.A02()
            r3.A01(r0)
        L_0x00b1:
            boolean r0 = r3.A0B
            r4 = 0
            r11 = 4
            r2 = 1
            r6 = 2
            r5 = 3
            if (r0 == 0) goto L_0x0195
            X.0Aq r7 = r12.A03
            boolean r0 = r7.A0i
            if (r0 == 0) goto L_0x02c1
            X.0Az[] r1 = r7.A0n
            r6 = r1[r6]
            X.0Az r0 = r6.A03
            if (r0 == 0) goto L_0x012d
            r4 = r1[r5]
            X.0Az r0 = r4.A03
            if (r0 == 0) goto L_0x0120
            boolean r0 = r7.A0I()
            if (r0 == 0) goto L_0x00f2
            X.0Aw r1 = r12.A05
            int r0 = r6.A00()
            r1.A04 = r0
            X.0Aw r1 = r12.A04
            int r0 = r4.A00()
            int r0 = -r0
            r1.A04 = r0
        L_0x00e5:
            X.0Aq r1 = r12.A03
            boolean r0 = r1.A0h
            if (r0 == 0) goto L_0x006e
            X.0Aw r4 = r12.A01
            X.0Aw r2 = r12.A05
            int r0 = r1.A07
            goto L_0x00a2
        L_0x00f2:
            X.0Aw r3 = X.C02540Au.A00(r6)
            if (r3 == 0) goto L_0x0101
            X.0Aw r1 = r12.A05
            int r0 = r6.A00()
            X.C02540Au.A02(r1, r3, r0)
        L_0x0101:
            X.0Aq r0 = r12.A03
            X.0Az[] r0 = r0.A0n
            r0 = r0[r5]
            X.0Aw r3 = X.C02540Au.A00(r0)
            if (r3 == 0) goto L_0x0117
            X.0Aw r1 = r12.A04
            int r0 = r0.A00()
            int r0 = -r0
            X.C02540Au.A02(r1, r3, r0)
        L_0x0117:
            X.0Aw r0 = r12.A05
            r0.A09 = r2
            X.0Aw r0 = r12.A04
            r0.A09 = r2
            goto L_0x00e5
        L_0x0120:
            X.0Aw r2 = X.C02540Au.A00(r6)
            if (r2 == 0) goto L_0x006e
            X.0Aw r4 = r12.A05
            int r0 = r6.A00()
            goto L_0x018d
        L_0x012d:
            r2 = r1[r5]
            X.0Az r0 = r2.A03
            if (r0 == 0) goto L_0x014c
            X.0Aw r1 = X.C02540Au.A00(r2)
            if (r1 == 0) goto L_0x00e5
            X.0Aw r4 = r12.A04
            int r0 = r2.A00()
            int r0 = -r0
            X.C02540Au.A02(r4, r1, r0)
            X.0Aw r1 = r12.A05
            int r0 = r3.A05
            int r0 = -r0
        L_0x0148:
            X.C02540Au.A02(r1, r4, r0)
            goto L_0x00e5
        L_0x014c:
            r1 = r1[r11]
            X.0Az r0 = r1.A03
            if (r0 == 0) goto L_0x016d
            X.0Aw r0 = X.C02540Au.A00(r1)
            if (r0 == 0) goto L_0x006e
            X.0Aw r1 = r12.A01
            X.C02540Au.A02(r1, r0, r4)
            X.0Aw r2 = r12.A05
            X.0Aq r0 = r12.A03
            int r0 = r0.A07
            int r0 = -r0
            X.C02540Au.A02(r2, r1, r0)
            X.0Aw r4 = r12.A04
            int r0 = r3.A05
            goto L_0x00a2
        L_0x016d:
            boolean r0 = r7 instanceof X.C16650pr
            if (r0 != 0) goto L_0x006e
            X.0Aq r0 = r7.A0Z
            if (r0 == 0) goto L_0x006e
            java.lang.Integer r0 = X.C023109s.A0V
            X.0Az r0 = r7.A06(r0)
            X.0Az r0 = r0.A03
            if (r0 != 0) goto L_0x006e
            X.0Aq r1 = r12.A03
            X.0Aq r0 = r1.A0Z
            X.0Ay r0 = r0.A0d
            X.0Aw r2 = r0.A05
            X.0Aw r4 = r12.A05
            int r0 = r1.A05()
        L_0x018d:
            X.C02540Au.A02(r4, r2, r0)
            X.0Aw r1 = r12.A04
            int r0 = r3.A05
            goto L_0x0148
        L_0x0195:
            java.lang.Integer r1 = r12.A07
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x02c1
            X.0Aq r1 = r12.A03
            int r0 = r1.A0C
            if (r0 == r6) goto L_0x02b9
            if (r0 != r5) goto L_0x01c9
            boolean r0 = r1.A0I()
            if (r0 != 0) goto L_0x01c9
            int r0 = r1.A0D
            if (r0 == r5) goto L_0x01c9
            X.0Av r0 = r1.A0c
        L_0x01af:
            X.0Ax r1 = r0.A06
            java.util.List r0 = r3.A08
            r0.add(r1)
            java.util.List r0 = r1.A07
            r0.add(r3)
            r3.A09 = r2
            java.util.List r1 = r3.A07
            X.0Aw r0 = r12.A05
            r1.add(r0)
            X.0Aw r0 = r12.A04
            r1.add(r0)
        L_0x01c9:
            X.0Aq r7 = r12.A03
            X.0Az[] r10 = r7.A0n
            r9 = r10[r6]
            X.0Az r1 = r9.A03
            if (r1 == 0) goto L_0x021d
            r6 = r10[r5]
            X.0Az r0 = r6.A03
            if (r0 == 0) goto L_0x021d
            boolean r0 = r7.A0I()
            if (r0 == 0) goto L_0x020a
            X.0Aw r1 = r12.A05
            int r0 = r9.A00()
            r1.A04 = r0
            X.0Aw r1 = r12.A04
            int r0 = r6.A00()
            int r0 = -r0
            r1.A04 = r0
        L_0x01f0:
            X.0Aq r0 = r12.A03
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x01ff
            X.0Aw r1 = r12.A01
            X.0Aw r4 = r12.A05
            X.0Ax r0 = r12.A00
        L_0x01fc:
            r12.A07(r1, r4, r0, r2)
        L_0x01ff:
            java.util.List r0 = r3.A08
            int r0 = r0.size()
            if (r0 != 0) goto L_0x006e
            r3.A0A = r2
            return
        L_0x020a:
            X.0Aw r1 = X.C02540Au.A00(r9)
            X.0Aw r0 = X.C02540Au.A00(r6)
            r1.A02(r12)
            r0.A02(r12)
            java.lang.Integer r0 = X.C023109s.A0G
            r12.A09 = r0
            goto L_0x01f0
        L_0x021d:
            r8 = 0
            if (r1 == 0) goto L_0x026a
            X.0Aw r1 = X.C02540Au.A00(r9)
            if (r1 == 0) goto L_0x01ff
            X.0Aw r4 = r12.A05
            int r0 = r9.A00()
        L_0x022c:
            X.C02540Au.A02(r4, r1, r0)
            X.0Aw r0 = r12.A04
            r12.A07(r0, r4, r3, r2)
            X.0Aq r0 = r12.A03
            boolean r0 = r0.A0h
            if (r0 == 0) goto L_0x0241
            X.0Aw r1 = r12.A01
            X.0Ax r0 = r12.A00
            r12.A07(r1, r4, r0, r2)
        L_0x0241:
            java.lang.Integer r0 = r12.A07
            java.lang.Integer r4 = X.C023109s.A0C
            if (r0 != r4) goto L_0x01ff
            X.0Aq r1 = r12.A03
            float r0 = r1.A01
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x01ff
            X.0Av r1 = r1.A0c
            java.lang.Integer r0 = r1.A07
            if (r0 != r4) goto L_0x01ff
            X.0Ax r0 = r1.A06
            java.util.List r0 = r0.A07
            r0.add(r3)
            java.util.List r1 = r3.A08
            X.0Aq r0 = r12.A03
            X.0Av r0 = r0.A0c
            X.0Ax r0 = r0.A06
            r1.add(r0)
            r3.A06 = r12
            goto L_0x01ff
        L_0x026a:
            r6 = r10[r5]
            X.0Az r0 = r6.A03
            r5 = -1
            if (r0 == 0) goto L_0x0288
            X.0Aw r4 = X.C02540Au.A00(r6)
            if (r4 == 0) goto L_0x01ff
            X.0Aw r1 = r12.A04
            int r0 = r6.A00()
            int r0 = -r0
            X.C02540Au.A02(r1, r4, r0)
            X.0Aw r0 = r12.A05
            r12.A07(r0, r1, r3, r5)
            goto L_0x01f0
        L_0x0288:
            r1 = r10[r11]
            X.0Az r0 = r1.A03
            if (r0 == 0) goto L_0x02a5
            X.0Aw r0 = X.C02540Au.A00(r1)
            if (r0 == 0) goto L_0x01ff
            X.0Aw r1 = r12.A01
            X.C02540Au.A02(r1, r0, r4)
            X.0Aw r4 = r12.A05
            X.0Ax r0 = r12.A00
            r12.A07(r4, r1, r0, r5)
            X.0Aw r1 = r12.A04
            r0 = r3
            goto L_0x01fc
        L_0x02a5:
            boolean r0 = r7 instanceof X.C16650pr
            if (r0 != 0) goto L_0x01ff
            X.0Aq r0 = r7.A0Z
            if (r0 == 0) goto L_0x01ff
            X.0Ay r0 = r0.A0d
            X.0Aw r1 = r0.A05
            X.0Aw r4 = r12.A05
            int r0 = r7.A05()
            goto L_0x022c
        L_0x02b9:
            X.0Aq r0 = r1.A0Z
            if (r0 == 0) goto L_0x01c9
            X.0Ay r0 = r0.A0d
            goto L_0x01af
        L_0x02c1:
            r3.A02(r12)
            goto L_0x01c9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02570Ay.A09():void");
    }

    public void A0A() {
        C02560Aw r2 = this.A05;
        if (r2.A0B) {
            this.A03.A0Q = r2.A05;
        }
    }

    public boolean A0C() {
        if (this.A07 != C023109s.A0C || this.A03.A0C == 0) {
            return true;
        }
        return false;
    }

    public void BwU(C02530At r13) {
        float f;
        float f2;
        float f3;
        int intValue = this.A09.intValue();
        if (intValue == 1 || intValue == 2 || intValue != 3) {
            AnonymousClass0Ax r5 = this.A06;
            if (r5.A0A && !r5.A0B && this.A07 == C023109s.A0C) {
                C02500Aq r6 = this.A03;
                int i = r6.A0C;
                if (i == 2) {
                    C02500Aq r0 = r6.A0Z;
                    if (r0 != null) {
                        AnonymousClass0Ax r1 = r0.A0d.A06;
                        if (r1.A0B) {
                            f = r6.A03;
                            f2 = (float) r1.A05;
                        }
                    }
                } else if (i == 3) {
                    AnonymousClass0Ax r2 = r6.A0c.A06;
                    if (r2.A0B) {
                        int i2 = r6.A08;
                        if (i2 == -1 || i2 != 0) {
                            f3 = ((float) r2.A05) / r6.A01;
                            r5.A01((int) (f3 + 0.5f));
                        } else {
                            f2 = (float) r2.A05;
                            f = r6.A01;
                        }
                    }
                }
                f3 = f2 * f;
                r5.A01((int) (f3 + 0.5f));
            }
            C02560Aw r7 = this.A05;
            if (r7.A0A) {
                C02560Aw r62 = this.A04;
                if (!r62.A0A) {
                    return;
                }
                if (!r7.A0B || !r62.A0B || !r5.A0B) {
                    if (!r5.A0B) {
                        Integer num = this.A07;
                        Integer num2 = C023109s.A0C;
                        if (num == num2) {
                            C02500Aq r12 = this.A03;
                            if (r12.A0D == 0 && !r12.A0I()) {
                                int i3 = ((C02560Aw) r7.A08.get(0)).A05 + r7.A04;
                                int i4 = ((C02560Aw) r62.A08.get(0)).A05 + r62.A04;
                                r7.A01(i3);
                                r62.A01(i4);
                                r5.A01(i4 - i3);
                                return;
                            }
                        }
                        if (num == num2 && this.A01 == 1) {
                            List list = r7.A08;
                            if (list.size() > 0) {
                                List list2 = r62.A08;
                                if (list2.size() > 0) {
                                    int i5 = (((C02560Aw) list2.get(0)).A05 + r62.A04) - (((C02560Aw) list.get(0)).A05 + r7.A04);
                                    int i6 = r5.A00;
                                    if (i5 < i6) {
                                        r5.A01(i5);
                                    } else {
                                        r5.A01(i6);
                                    }
                                }
                            }
                        }
                    }
                    if (r5.A0B) {
                        List list3 = r7.A08;
                        if (list3.size() > 0) {
                            List list4 = r62.A08;
                            if (list4.size() > 0) {
                                C02560Aw r10 = (C02560Aw) list3.get(0);
                                C02560Aw r9 = (C02560Aw) list4.get(0);
                                int i7 = r10.A05;
                                int i8 = i7 + r7.A04;
                                int i9 = r9.A05;
                                int i10 = i9 + r62.A04;
                                float f4 = this.A03.A06;
                                if (r10 == r9) {
                                    i8 = i7;
                                    i10 = i9;
                                    f4 = 0.5f;
                                }
                                r7.A01((int) (((float) i8) + 0.5f + (((float) ((i10 - i8) - r5.A05)) * f4)));
                                r62.A01(r7.A05 + r5.A05);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        C02500Aq r02 = this.A03;
        A06(r02.A0Y, r02.A0S, 1);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("VerticalRun ");
        sb.append(this.A03.A0f);
        return sb.toString();
    }

    public C02570Ay(C02500Aq r4) {
        super(r4);
        C02560Aw r2 = new C02560Aw(this);
        this.A01 = r2;
        this.A05.A03 = C023109s.A0S;
        this.A04.A03 = C023109s.A0V;
        r2.A03 = C023109s.A0W;
        this.A02 = 1;
    }
}
