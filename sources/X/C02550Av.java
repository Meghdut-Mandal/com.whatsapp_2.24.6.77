package X;

/* renamed from: X.0Av  reason: invalid class name and case insensitive filesystem */
public class C02550Av extends C02540Au {
    public static int[] A00 = new int[2];

    public static void A04(int[] iArr, float f, int i, int i2, int i3, int i4, int i5) {
        int i6;
        int i7;
        int i8 = i2 - i;
        int i9 = i4 - i3;
        if (i5 == -1) {
            i6 = (int) ((((float) i9) * f) + 0.5f);
            i7 = (int) ((((float) i8) / f) + 0.5f);
            if (i6 > i8) {
                if (i7 > i9) {
                    return;
                }
            }
            iArr[0] = i6;
            iArr[1] = i9;
            return;
        } else if (i5 != 0) {
            i7 = (int) ((((float) i8) * f) + 0.5f);
        } else {
            i6 = (int) ((((float) i9) * f) + 0.5f);
            iArr[0] = i6;
            iArr[1] = i9;
            return;
        }
        iArr[0] = i8;
        iArr[1] = i7;
    }

    public void A0B() {
        this.A00 = null;
        this.A05.A00();
        this.A04.A00();
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
        this.A06.A0B = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0071, code lost:
        r5 = r8.A03;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A09() {
        /*
            r8 = this;
            X.0Aq r2 = r8.A03
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x000f
            X.0Ax r1 = r8.A06
            int r0 = r2.A03()
            r1.A01(r0)
        L_0x000f:
            X.0Ax r3 = r8.A06
            boolean r0 = r3.A0B
            if (r0 != 0) goto L_0x006b
            X.0Aq r6 = r8.A03
            java.lang.Integer[] r1 = r6.A0q
            r0 = 0
            r4 = r1[r0]
            r8.A07 = r4
            java.lang.Integer r0 = X.C023109s.A0C
            if (r4 == r0) goto L_0x00b4
            java.lang.Integer r2 = X.C023109s.A0G
            if (r4 != r2) goto L_0x00a9
            X.0Aq r5 = r6.A0Z
            if (r5 == 0) goto L_0x0033
            java.lang.Integer[] r1 = r5.A0q
            r0 = 0
            r1 = r1[r0]
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 == r0) goto L_0x003a
        L_0x0033:
            java.lang.Integer[] r1 = r5.A0q
            r0 = 0
            r0 = r1[r0]
            if (r0 != r2) goto L_0x00a9
        L_0x003a:
            int r4 = r5.A03()
            X.0Az r0 = r6.A0W
            int r2 = r0.A00()
            int r4 = r4 - r2
            X.0Az r0 = r6.A0X
            int r0 = r0.A00()
            int r4 = r4 - r0
            X.0Aw r1 = r8.A05
            X.0Av r0 = r5.A0c
            X.0Aw r0 = r0.A05
            X.C02540Au.A02(r1, r0, r2)
            X.0Aw r2 = r8.A04
            X.0Av r0 = r5.A0c
            X.0Aw r1 = r0.A04
            X.0Aq r0 = r8.A03
            X.0Az r0 = r0.A0X
            int r0 = r0.A00()
            int r0 = -r0
            X.C02540Au.A02(r2, r1, r0)
            r3.A01(r4)
        L_0x006a:
            return
        L_0x006b:
            java.lang.Integer r0 = r8.A07
            java.lang.Integer r2 = X.C023109s.A0G
            if (r0 != r2) goto L_0x00b4
            X.0Aq r5 = r8.A03
            X.0Aq r4 = r5.A0Z
            if (r4 == 0) goto L_0x0080
            java.lang.Integer[] r1 = r4.A0q
            r0 = 0
            r1 = r1[r0]
            java.lang.Integer r0 = X.C023109s.A00
            if (r1 == r0) goto L_0x0087
        L_0x0080:
            java.lang.Integer[] r1 = r4.A0q
            r0 = 0
            r0 = r1[r0]
            if (r0 != r2) goto L_0x00b4
        L_0x0087:
            X.0Aw r2 = r8.A05
            X.0Av r0 = r4.A0c
            X.0Aw r1 = r0.A05
            X.0Az r0 = r5.A0W
            int r0 = r0.A00()
            X.C02540Au.A02(r2, r1, r0)
            X.0Aw r2 = r8.A04
            X.0Av r0 = r4.A0c
            X.0Aw r1 = r0.A04
            X.0Aq r0 = r8.A03
            X.0Az r0 = r0.A0X
            int r0 = r0.A00()
            int r0 = -r0
            X.C02540Au.A02(r2, r1, r0)
            return
        L_0x00a9:
            java.lang.Integer r0 = X.C023109s.A00
            if (r4 != r0) goto L_0x00b4
            int r0 = r6.A03()
            r3.A01(r0)
        L_0x00b4:
            boolean r0 = r3.A0B
            r6 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0152
            X.0Aq r2 = r8.A03
            boolean r0 = r2.A0i
            if (r0 == 0) goto L_0x0152
            X.0Az[] r0 = r2.A0n
            r7 = r0[r6]
            X.0Az r1 = r7.A03
            r6 = r0[r4]
            X.0Az r0 = r6.A03
            if (r1 == 0) goto L_0x010f
            if (r0 == 0) goto L_0x0102
            boolean r0 = r2.A0H()
            if (r0 != 0) goto L_0x0295
            X.0Aw r2 = X.C02540Au.A00(r7)
            if (r2 == 0) goto L_0x00e3
            X.0Aw r1 = r8.A05
            int r0 = r7.A00()
            X.C02540Au.A02(r1, r2, r0)
        L_0x00e3:
            X.0Aq r0 = r8.A03
            X.0Az[] r0 = r0.A0n
            r0 = r0[r4]
            X.0Aw r2 = X.C02540Au.A00(r0)
            if (r2 == 0) goto L_0x00f9
            X.0Aw r1 = r8.A04
            int r0 = r0.A00()
            int r0 = -r0
            X.C02540Au.A02(r1, r2, r0)
        L_0x00f9:
            X.0Aw r0 = r8.A05
            r0.A09 = r4
            X.0Aw r0 = r8.A04
            r0.A09 = r4
            return
        L_0x0102:
            X.0Aw r4 = X.C02540Au.A00(r7)
            if (r4 == 0) goto L_0x006a
            X.0Aw r2 = r8.A05
            int r0 = r7.A00()
            goto L_0x014a
        L_0x010f:
            if (r0 == 0) goto L_0x012a
            X.0Aw r1 = X.C02540Au.A00(r6)
            if (r1 == 0) goto L_0x006a
            X.0Aw r2 = r8.A04
            int r0 = r6.A00()
            int r0 = -r0
            X.C02540Au.A02(r2, r1, r0)
            X.0Aw r1 = r8.A05
            int r0 = r3.A05
            int r0 = -r0
        L_0x0126:
            X.C02540Au.A02(r1, r2, r0)
            return
        L_0x012a:
            boolean r0 = r2 instanceof X.C16650pr
            if (r0 != 0) goto L_0x006a
            X.0Aq r0 = r2.A0Z
            if (r0 == 0) goto L_0x006a
            java.lang.Integer r0 = X.C023109s.A0V
            X.0Az r0 = r2.A06(r0)
            X.0Az r0 = r0.A03
            if (r0 != 0) goto L_0x006a
            X.0Aq r1 = r8.A03
            X.0Aq r0 = r1.A0Z
            X.0Av r0 = r0.A0c
            X.0Aw r4 = r0.A05
            X.0Aw r2 = r8.A05
            int r0 = r1.A04()
        L_0x014a:
            X.C02540Au.A02(r2, r4, r0)
            X.0Aw r1 = r8.A04
            int r0 = r3.A05
            goto L_0x0126
        L_0x0152:
            java.lang.Integer r1 = r8.A07
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x01bf
            X.0Aq r5 = r8.A03
            int r2 = r5.A0D
            r0 = 2
            if (r2 == r0) goto L_0x0238
            r1 = 3
            if (r2 != r1) goto L_0x01bf
            int r0 = r5.A0C
            if (r0 != r1) goto L_0x01fe
            X.0Aw r0 = r8.A05
            r0.A06 = r8
            X.0Aw r0 = r8.A04
            r0.A06 = r8
            X.0Ay r1 = r5.A0d
            X.0Aw r0 = r1.A05
            r0.A06 = r8
            X.0Aw r0 = r1.A04
            r0.A06 = r8
            r3.A06 = r8
            boolean r0 = r5.A0I()
            if (r0 == 0) goto L_0x01e8
            java.util.List r2 = r3.A08
            X.0Ax r0 = r1.A06
            r2.add(r0)
            X.0Aq r0 = r8.A03
            X.0Ay r0 = r0.A0d
            X.0Ax r0 = r0.A06
            java.util.List r0 = r0.A07
            r0.add(r3)
            X.0Aq r0 = r8.A03
            X.0Ay r1 = r0.A0d
            X.0Ax r0 = r1.A06
            r0.A06 = r8
            X.0Aw r0 = r1.A05
            r2.add(r0)
            X.0Aq r0 = r8.A03
            X.0Ay r0 = r0.A0d
            X.0Aw r0 = r0.A04
            r2.add(r0)
            X.0Aq r0 = r8.A03
            X.0Ay r0 = r0.A0d
            X.0Aw r0 = r0.A05
            java.util.List r0 = r0.A07
            r0.add(r3)
            X.0Aq r0 = r8.A03
            X.0Ay r0 = r0.A0d
            X.0Aw r0 = r0.A04
            java.util.List r1 = r0.A07
        L_0x01bb:
            r0 = r3
        L_0x01bc:
            r1.add(r0)
        L_0x01bf:
            X.0Aq r5 = r8.A03
            X.0Az[] r0 = r5.A0n
            r7 = r0[r6]
            X.0Az r1 = r7.A03
            r6 = r0[r4]
            X.0Az r0 = r6.A03
            if (r1 == 0) goto L_0x0264
            if (r0 == 0) goto L_0x0257
            boolean r0 = r5.A0H()
            if (r0 != 0) goto L_0x0295
            X.0Aw r1 = X.C02540Au.A00(r7)
            X.0Aw r0 = X.C02540Au.A00(r6)
            r1.A02(r8)
            r0.A02(r8)
            java.lang.Integer r0 = X.C023109s.A0G
            r8.A09 = r0
            return
        L_0x01e8:
            boolean r0 = r5.A0H()
            X.0Ax r2 = r1.A06
            if (r0 == 0) goto L_0x0235
            java.util.List r0 = r2.A08
            r0.add(r3)
            java.util.List r1 = r3.A07
            X.0Aq r0 = r8.A03
            X.0Ay r0 = r0.A0d
            X.0Ax r0 = r0.A06
            goto L_0x01bc
        L_0x01fe:
            X.0Ay r0 = r5.A0d
            X.0Ax r1 = r0.A06
            java.util.List r0 = r3.A08
            r0.add(r1)
            java.util.List r0 = r1.A07
            r0.add(r3)
            X.0Aq r0 = r8.A03
            X.0Ay r0 = r0.A0d
            X.0Aw r0 = r0.A05
            java.util.List r0 = r0.A07
            r0.add(r3)
            X.0Aq r0 = r8.A03
            X.0Ay r0 = r0.A0d
            X.0Aw r0 = r0.A04
            java.util.List r0 = r0.A07
            r0.add(r3)
            r3.A09 = r4
            java.util.List r1 = r3.A07
            X.0Aw r0 = r8.A05
            r1.add(r0)
            X.0Aw r2 = r8.A04
            r1.add(r2)
            java.util.List r0 = r0.A08
            r0.add(r3)
        L_0x0235:
            java.util.List r1 = r2.A08
            goto L_0x01bb
        L_0x0238:
            X.0Aq r0 = r5.A0Z
            if (r0 == 0) goto L_0x01bf
            X.0Ay r0 = r0.A0d
            X.0Ax r1 = r0.A06
            java.util.List r0 = r3.A08
            r0.add(r1)
            java.util.List r0 = r1.A07
            r0.add(r3)
            r3.A09 = r4
            java.util.List r1 = r3.A07
            X.0Aw r0 = r8.A05
            r1.add(r0)
            X.0Aw r0 = r8.A04
            goto L_0x01bc
        L_0x0257:
            X.0Aw r1 = X.C02540Au.A00(r7)
            if (r1 == 0) goto L_0x006a
            X.0Aw r2 = r8.A05
            int r0 = r7.A00()
            goto L_0x028f
        L_0x0264:
            if (r0 == 0) goto L_0x027d
            X.0Aw r1 = X.C02540Au.A00(r6)
            if (r1 == 0) goto L_0x006a
            X.0Aw r2 = r8.A04
            int r0 = r6.A00()
            int r0 = -r0
            X.C02540Au.A02(r2, r1, r0)
            X.0Aw r0 = r8.A05
            r4 = -1
        L_0x0279:
            r8.A07(r0, r2, r3, r4)
            return
        L_0x027d:
            boolean r0 = r5 instanceof X.C16650pr
            if (r0 != 0) goto L_0x006a
            X.0Aq r0 = r5.A0Z
            if (r0 == 0) goto L_0x006a
            X.0Av r0 = r0.A0c
            X.0Aw r1 = r0.A05
            X.0Aw r2 = r8.A05
            int r0 = r5.A04()
        L_0x028f:
            X.C02540Au.A02(r2, r1, r0)
            X.0Aw r0 = r8.A04
            goto L_0x0279
        L_0x0295:
            X.0Aw r1 = r8.A05
            int r0 = r7.A00()
            r1.A04 = r0
            X.0Aw r1 = r8.A04
            int r0 = r6.A00()
            int r0 = -r0
            r1.A04 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02550Av.A09():void");
    }

    public void A0A() {
        C02560Aw r2 = this.A05;
        if (r2.A0B) {
            this.A03.A0P = r2.A05;
        }
    }

    public boolean A0C() {
        if (this.A07 != C023109s.A0C || this.A03.A0D == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01bb, code lost:
        if (r11 != false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x021c, code lost:
        if (r12 != false) goto L_0x021e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BwU(X.C02530At r23) {
        /*
            r22 = this;
            r3 = r22
            java.lang.Integer r0 = r3.A09
            int r0 = r0.intValue()
            r8 = 2
            r7 = 3
            r5 = 1
            r2 = 0
            if (r0 == r5) goto L_0x001c
            if (r0 == r8) goto L_0x001c
            if (r0 != r7) goto L_0x001c
            X.0Aq r0 = r3.A03
            X.0Az r1 = r0.A0W
            X.0Az r0 = r0.A0X
            r3.A06(r1, r0, r2)
        L_0x001b:
            return
        L_0x001c:
            X.0Ax r4 = r3.A06
            boolean r0 = r4.A0B
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x004e
            java.lang.Integer r1 = r3.A07
            java.lang.Integer r0 = X.C023109s.A0C
            if (r1 != r0) goto L_0x004e
            X.0Aq r6 = r3.A03
            int r0 = r6.A0D
            if (r0 == r8) goto L_0x027b
            if (r0 != r7) goto L_0x004e
            int r0 = r6.A0C
            r10 = -1
            if (r0 == 0) goto L_0x0072
            if (r0 == r7) goto L_0x0072
            int r0 = r6.A08
            if (r0 == r10) goto L_0x0067
            if (r0 != 0) goto L_0x0067
            X.0Ay r0 = r6.A0d
            X.0Ax r0 = r0.A06
            int r0 = r0.A05
            float r1 = (float) r0
            float r0 = r6.A01
            float r1 = r1 / r0
        L_0x0049:
            float r1 = r1 + r14
            int r0 = (int) r1
            r4.A01(r0)
        L_0x004e:
            X.0Aw r8 = r3.A05
            boolean r0 = r8.A0A
            if (r0 == 0) goto L_0x001b
            X.0Aw r6 = r3.A04
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x028f
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x028f
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x028f
            return
        L_0x0067:
            X.0Ay r0 = r6.A0d
            X.0Ax r0 = r0.A06
            int r0 = r0.A05
            float r1 = (float) r0
            float r6 = r6.A01
            goto L_0x028c
        L_0x0072:
            X.0Ay r0 = r6.A0d
            X.0Aw r1 = r0.A05
            X.0Aw r9 = r0.A04
            X.0Az r0 = r6.A0W
            X.0Az r0 = r0.A03
            r13 = 0
            if (r0 == 0) goto L_0x0080
            r13 = 1
        L_0x0080:
            X.0Az r0 = r6.A0Y
            X.0Az r0 = r0.A03
            r12 = 0
            if (r0 == 0) goto L_0x0088
            r12 = 1
        L_0x0088:
            X.0Az r0 = r6.A0X
            X.0Az r0 = r0.A03
            r11 = 0
            if (r0 == 0) goto L_0x0090
            r11 = 1
        L_0x0090:
            X.0Az r0 = r6.A0S
            X.0Az r7 = r0.A03
            r0 = 0
            if (r7 == 0) goto L_0x0098
            r0 = 1
        L_0x0098:
            int r8 = r6.A08
            if (r13 == 0) goto L_0x021c
            if (r12 == 0) goto L_0x01bb
            if (r11 == 0) goto L_0x021e
            if (r0 == 0) goto L_0x01bd
            float r13 = r6.A01
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x00f9
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x00f9
            X.0Aw r7 = r3.A05
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x001b
            X.0Aw r6 = r3.A04
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r7.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r14 = r0.A05
            int r0 = r7.A04
            int r14 = r14 + r0
            java.util.List r0 = r6.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r7 = r0.A05
            int r0 = r6.A04
            int r7 = r7 - r0
            int r6 = r1.A05
            int r0 = r1.A04
            int r6 = r6 + r0
            int r1 = r9.A05
            int r0 = r9.A04
            int r1 = r1 - r0
            int[] r12 = A00
            r17 = r1
            r18 = r8
            r15 = r7
            r16 = r6
            A04(r12, r13, r14, r15, r16, r17, r18)
            r0 = r12[r2]
            r4.A01(r0)
            X.0Aq r0 = r3.A03
            X.0Ay r0 = r0.A0d
            X.0Ax r1 = r0.A06
            r0 = r12[r5]
            r1.A01(r0)
            return
        L_0x00f9:
            X.0Aw r7 = r3.A05
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0152
            X.0Aw r6 = r3.A04
            boolean r0 = r6.A0B
            if (r0 == 0) goto L_0x0152
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x001b
            int r12 = r7.A05
            int r0 = r7.A04
            int r12 = r12 + r0
            int r11 = r6.A05
            int r0 = r6.A04
            int r11 = r11 - r0
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r10 = r0.A05
            int r0 = r1.A04
            int r10 = r10 + r0
            java.util.List r0 = r9.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r6 = r0.A05
            int r0 = r9.A04
            int r6 = r6 - r0
            int[] r15 = A00
            r16 = r13
            r17 = r12
            r18 = r11
            r19 = r10
            r20 = r6
            r21 = r8
            A04(r15, r16, r17, r18, r19, r20, r21)
            r0 = r15[r2]
            r4.A01(r0)
            X.0Aq r0 = r3.A03
            X.0Ay r0 = r0.A0d
            X.0Ax r6 = r0.A06
            r0 = r15[r5]
            r6.A01(r0)
        L_0x0152:
            boolean r0 = r7.A0A
            if (r0 == 0) goto L_0x001b
            X.0Aw r6 = r3.A04
            boolean r0 = r6.A0A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r7.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r10 = r0.A05
            int r0 = r7.A04
            int r10 = r10 + r0
            java.util.List r0 = r6.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r7 = r0.A05
            int r0 = r6.A04
            int r7 = r7 - r0
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r6 = r0.A05
            int r0 = r1.A04
            int r6 = r6 + r0
            java.util.List r0 = r9.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r1 = r0.A05
            int r0 = r9.A04
            int r1 = r1 - r0
            int[] r15 = A00
            r16 = r13
            r17 = r10
            r18 = r7
            r19 = r6
            r20 = r1
            r21 = r8
            A04(r15, r16, r17, r18, r19, r20, r21)
            r0 = r15[r2]
            r4.A01(r0)
            X.0Aq r0 = r3.A03
            X.0Ay r0 = r0.A0d
            X.0Ax r1 = r0.A06
            r0 = r15[r5]
            r1.A01(r0)
            goto L_0x004e
        L_0x01bb:
            if (r11 == 0) goto L_0x004e
        L_0x01bd:
            X.0Aw r1 = r3.A05
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001b
            X.0Aw r9 = r3.A04
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x001b
            float r7 = r6.A01
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r6 = r0.A05
            int r0 = r1.A04
            int r6 = r6 + r0
            java.util.List r0 = r9.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r1 = r0.A05
            int r0 = r9.A04
            int r1 = r1 - r0
            if (r8 == r10) goto L_0x020a
            if (r8 == 0) goto L_0x020a
            int r1 = r1 - r6
            int r6 = r3.A05(r1, r2)
            float r0 = (float) r6
            float r0 = r0 / r7
            float r0 = r0 + r14
            int r0 = (int) r0
            int r1 = r3.A05(r0, r5)
            if (r0 == r1) goto L_0x01fc
            float r0 = (float) r1
            float r0 = r0 * r7
        L_0x01fa:
            float r0 = r0 + r14
            int r6 = (int) r0
        L_0x01fc:
            r4.A01(r6)
            X.0Aq r0 = r3.A03
            X.0Ay r0 = r0.A0d
            X.0Ax r0 = r0.A06
            r0.A01(r1)
            goto L_0x004e
        L_0x020a:
            int r1 = r1 - r6
            int r6 = r3.A05(r1, r2)
            float r0 = (float) r6
            float r0 = r0 * r7
            float r0 = r0 + r14
            int r0 = (int) r0
            int r1 = r3.A05(r0, r5)
            if (r0 == r1) goto L_0x01fc
            float r0 = (float) r1
            float r0 = r0 / r7
            goto L_0x01fa
        L_0x021c:
            if (r12 == 0) goto L_0x004e
        L_0x021e:
            if (r0 == 0) goto L_0x004e
            boolean r0 = r1.A0A
            if (r0 == 0) goto L_0x001b
            boolean r0 = r9.A0A
            if (r0 == 0) goto L_0x001b
            float r7 = r6.A01
            java.util.List r0 = r1.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r6 = r0.A05
            int r0 = r1.A04
            int r6 = r6 + r0
            java.util.List r0 = r9.A08
            java.lang.Object r0 = r0.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            int r1 = r0.A05
            int r0 = r9.A04
            int r1 = r1 - r0
            if (r8 == r10) goto L_0x0269
            if (r8 != 0) goto L_0x0269
            int r1 = r1 - r6
            int r6 = r3.A05(r1, r5)
            float r0 = (float) r6
            float r0 = r0 * r7
            float r0 = r0 + r14
            int r0 = (int) r0
            int r1 = r3.A05(r0, r2)
            if (r0 == r1) goto L_0x025b
            float r0 = (float) r1
            float r0 = r0 / r7
        L_0x0259:
            float r0 = r0 + r14
            int r6 = (int) r0
        L_0x025b:
            r4.A01(r1)
            X.0Aq r0 = r3.A03
            X.0Ay r0 = r0.A0d
            X.0Ax r0 = r0.A06
            r0.A01(r6)
            goto L_0x004e
        L_0x0269:
            int r1 = r1 - r6
            int r6 = r3.A05(r1, r5)
            float r0 = (float) r6
            float r0 = r0 / r7
            float r0 = r0 + r14
            int r0 = (int) r0
            int r1 = r3.A05(r0, r2)
            if (r0 == r1) goto L_0x025b
            float r0 = (float) r1
            float r0 = r0 * r7
            goto L_0x0259
        L_0x027b:
            X.0Aq r0 = r6.A0Z
            if (r0 == 0) goto L_0x004e
            X.0Av r0 = r0.A0c
            X.0Ax r1 = r0.A06
            boolean r0 = r1.A0B
            if (r0 == 0) goto L_0x004e
            float r6 = r6.A04
            int r0 = r1.A05
            float r1 = (float) r0
        L_0x028c:
            float r1 = r1 * r6
            goto L_0x0049
        L_0x028f:
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x0311
            java.lang.Integer r9 = r3.A07
            java.lang.Integer r7 = X.C023109s.A0C
            if (r9 != r7) goto L_0x02cb
            X.0Aq r1 = r3.A03
            int r0 = r1.A0D
            if (r0 != 0) goto L_0x02cb
            boolean r0 = r1.A0H()
            if (r0 != 0) goto L_0x02cb
            java.util.List r0 = r8.A08
            java.lang.Object r3 = r0.get(r2)
            X.0Aw r3 = (X.C02560Aw) r3
            java.util.List r0 = r6.A08
            java.lang.Object r1 = r0.get(r2)
            X.0Aw r1 = (X.C02560Aw) r1
            int r2 = r3.A05
            int r0 = r8.A04
            int r2 = r2 + r0
            int r1 = r1.A05
            int r0 = r6.A04
            int r1 = r1 + r0
            int r0 = r1 - r2
            r8.A01(r2)
            r6.A01(r1)
            r4.A01(r0)
            return
        L_0x02cb:
            if (r9 != r7) goto L_0x0311
            int r0 = r3.A01
            if (r0 != r5) goto L_0x0311
            java.util.List r5 = r8.A08
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0311
            java.util.List r1 = r6.A08
            int r0 = r1.size()
            if (r0 <= 0) goto L_0x0311
            java.lang.Object r0 = r5.get(r2)
            X.0Aw r0 = (X.C02560Aw) r0
            java.lang.Object r1 = r1.get(r2)
            X.0Aw r1 = (X.C02560Aw) r1
            int r5 = r0.A05
            int r0 = r8.A04
            int r5 = r5 + r0
            int r1 = r1.A05
            int r0 = r6.A04
            int r1 = r1 + r0
            int r1 = r1 - r5
            int r0 = r4.A00
            int r5 = java.lang.Math.min(r1, r0)
            X.0Aq r0 = r3.A03
            int r1 = r0.A0F
            int r0 = r0.A0H
            int r0 = java.lang.Math.max(r0, r5)
            if (r1 <= 0) goto L_0x030e
            int r0 = java.lang.Math.min(r1, r0)
        L_0x030e:
            r4.A01(r0)
        L_0x0311:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x001b
            java.util.List r0 = r8.A08
            java.lang.Object r11 = r0.get(r2)
            X.0Aw r11 = (X.C02560Aw) r11
            java.util.List r0 = r6.A08
            java.lang.Object r10 = r0.get(r2)
            X.0Aw r10 = (X.C02560Aw) r10
            int r9 = r11.A05
            int r0 = r8.A04
            int r7 = r9 + r0
            int r1 = r10.A05
            int r0 = r6.A04
            int r5 = r1 + r0
            X.0Aq r0 = r3.A03
            float r2 = r0.A02
            if (r11 != r10) goto L_0x033b
            r7 = r9
            r5 = r1
            r2 = 1056964608(0x3f000000, float:0.5)
        L_0x033b:
            int r5 = r5 - r7
            int r0 = r4.A05
            int r5 = r5 - r0
            float r1 = (float) r7
            float r1 = r1 + r14
            float r0 = (float) r5
            float r0 = r0 * r2
            float r1 = r1 + r0
            int r0 = (int) r1
            r8.A01(r0)
            int r1 = r8.A05
            int r0 = r4.A05
            int r1 = r1 + r0
            r6.A01(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02550Av.BwU(X.0At):void");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("HorizontalRun ");
        sb.append(this.A03.A0f);
        return sb.toString();
    }

    public C02550Av(C02500Aq r3) {
        super(r3);
        this.A05.A03 = C023109s.A0G;
        this.A04.A03 = C023109s.A0R;
        this.A02 = 0;
    }
}
