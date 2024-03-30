package X;

import java.util.List;

/* renamed from: X.0Au  reason: invalid class name and case insensitive filesystem */
public abstract class C02540Au implements C02530At {
    public AnonymousClass0Y1 A00;
    public int A01;
    public int A02 = 0;
    public C02500Aq A03;
    public C02560Aw A04 = new C02560Aw(this);
    public C02560Aw A05 = new C02560Aw(this);
    public AnonymousClass0Ax A06 = new AnonymousClass0Ax(this);
    public Integer A07;
    public boolean A08 = false;
    public Integer A09 = C023109s.A00;

    public abstract void A09();

    public abstract void A0A();

    public abstract void A0B();

    public abstract boolean A0C();

    public abstract void BwU(C02530At r1);

    public static final C02560Aw A00(AnonymousClass0Az r3) {
        AnonymousClass0Az r0 = r3.A03;
        if (r0 == null) {
            return null;
        }
        C02500Aq r2 = r0.A05;
        int intValue = r0.A06.intValue();
        if (intValue == 1) {
            return r2.A0c.A05;
        }
        if (intValue == 3) {
            return r2.A0c.A04;
        }
        if (intValue == 2) {
            return r2.A0d.A05;
        }
        if (intValue == 5) {
            return r2.A0d.A01;
        }
        if (intValue == 4) {
            return r2.A0d.A04;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
        if (r1 != 4) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C02560Aw A01(X.AnonymousClass0Az r3, int r4) {
        /*
            X.0Az r1 = r3.A03
            r3 = 0
            if (r1 == 0) goto L_0x001d
            X.0Aq r0 = r1.A05
            if (r4 != 0) goto L_0x001e
            X.0Av r2 = r0.A0c
        L_0x000b:
            java.lang.Integer r0 = r1.A06
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0024
            r0 = 3
            if (r1 == r0) goto L_0x0021
            r0 = 2
            if (r1 == r0) goto L_0x0024
            r0 = 4
            if (r1 == r0) goto L_0x0021
        L_0x001d:
            return r3
        L_0x001e:
            X.0Ay r2 = r0.A0d
            goto L_0x000b
        L_0x0021:
            X.0Aw r3 = r2.A04
            return r3
        L_0x0024:
            X.0Aw r3 = r2.A05
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02540Au.A01(X.0Az, int):X.0Aw");
    }

    public static final void A02(C02560Aw r1, C02560Aw r2, int i) {
        r1.A08.add(r2);
        r1.A04 = i;
        r2.A07.add(r1);
    }

    public final int A05(int i, int i2) {
        int i3;
        int i4;
        C02500Aq r0 = this.A03;
        if (i2 == 0) {
            i3 = r0.A0F;
            i4 = r0.A0H;
        } else {
            i3 = r0.A0E;
            i4 = r0.A0G;
        }
        int max = Math.max(i4, i);
        if (i3 > 0) {
            max = Math.min(i3, i);
        }
        if (max != i) {
            return max;
        }
        return i;
    }

    public final void A07(C02560Aw r3, C02560Aw r4, AnonymousClass0Ax r5, int i) {
        List list = r3.A08;
        list.add(r4);
        list.add(this.A06);
        r3.A00 = i;
        r3.A01 = r5;
        r4.A07.add(r3);
        r5.A07.add(r3);
    }

    public long A08() {
        AnonymousClass0Ax r1 = this.A06;
        if (r1.A0B) {
            return (long) r1.A05;
        }
        return 0;
    }

    public C02540Au(C02500Aq r2) {
        this.A03 = r2;
    }

    public static void A03(C02560Aw r0, Object obj, List list) {
        list.add(r0);
        r0.A08.add(obj);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0052, code lost:
        if (r1.A01 == 3) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(X.AnonymousClass0Az r16, X.AnonymousClass0Az r17, int r18) {
        /*
            r15 = this;
            X.0Aw r8 = A00(r16)
            X.0Aw r7 = A00(r17)
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x0066
            boolean r0 = r7.A0B
            if (r0 == 0) goto L_0x0066
            int r6 = r8.A05
            int r0 = r16.A00()
            int r6 = r6 + r0
            int r5 = r7.A05
            int r0 = r17.A00()
            int r5 = r5 - r0
            int r9 = r5 - r6
            X.0Ax r4 = r15.A06
            boolean r0 = r4.A0B
            r3 = r18
            if (r0 != 0) goto L_0x0054
            java.lang.Integer r0 = r15.A07
            java.lang.Integer r13 = X.C023109s.A0C
            if (r0 != r13) goto L_0x0054
            r0 = r9
            int r1 = r15.A01
            if (r1 == 0) goto L_0x00b4
            r10 = 1
            if (r1 == r10) goto L_0x008f
            r0 = 2
            r14 = 1056964608(0x3f000000, float:0.5)
            if (r1 == r0) goto L_0x009a
            r12 = 3
            if (r1 != r12) goto L_0x0054
            X.0Aq r11 = r15.A03
            X.0Av r2 = r11.A0c
            java.lang.Integer r0 = r2.A07
            if (r0 != r13) goto L_0x00bf
            int r0 = r2.A01
            if (r0 != r12) goto L_0x00bf
            X.0Ay r1 = r11.A0d
            java.lang.Integer r0 = r1.A07
            if (r0 != r13) goto L_0x00bf
            int r0 = r1.A01
            if (r0 != r12) goto L_0x00bf
        L_0x0054:
            boolean r0 = r4.A0B
            if (r0 == 0) goto L_0x0066
            int r1 = r4.A05
            if (r1 != r9) goto L_0x0067
            X.0Aw r0 = r15.A05
            r0.A01(r6)
            X.0Aw r1 = r15.A04
        L_0x0063:
            r1.A01(r5)
        L_0x0066:
            return
        L_0x0067:
            X.0Aq r0 = r15.A03
            if (r18 != 0) goto L_0x008c
            float r3 = r0.A02
        L_0x006d:
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r8 != r7) goto L_0x0077
            int r6 = r8.A05
            int r5 = r7.A05
            r3 = 1056964608(0x3f000000, float:0.5)
        L_0x0077:
            int r5 = r5 - r6
            int r5 = r5 - r1
            X.0Aw r2 = r15.A05
            float r1 = (float) r6
            float r1 = r1 + r0
            float r0 = (float) r5
            float r0 = r0 * r3
            float r1 = r1 + r0
            int r0 = (int) r1
            r2.A01(r0)
            X.0Aw r1 = r15.A04
            int r5 = r2.A05
            int r0 = r4.A05
            int r5 = r5 + r0
            goto L_0x0063
        L_0x008c:
            float r3 = r0.A06
            goto L_0x006d
        L_0x008f:
            int r0 = r4.A00
            int r0 = r15.A05(r0, r3)
            int r0 = java.lang.Math.min(r0, r9)
            goto L_0x00d3
        L_0x009a:
            X.0Aq r1 = r15.A03
            X.0Aq r0 = r1.A0Z
            if (r0 == 0) goto L_0x0054
            if (r18 != 0) goto L_0x00bc
            X.0Av r0 = r0.A0c
        L_0x00a4:
            X.0Ax r2 = r0.A06
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0054
            if (r18 != 0) goto L_0x00b9
            float r1 = r1.A04
        L_0x00ae:
            int r0 = r2.A05
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r14
            int r0 = (int) r0
        L_0x00b4:
            int r0 = r15.A05(r0, r3)
            goto L_0x00d3
        L_0x00b9:
            float r1 = r1.A03
            goto L_0x00ae
        L_0x00bc:
            X.0Ay r0 = r0.A0d
            goto L_0x00a4
        L_0x00bf:
            if (r18 != 0) goto L_0x00c3
            X.0Ay r2 = r11.A0d
        L_0x00c3:
            X.0Ax r2 = r2.A06
            boolean r0 = r2.A0B
            if (r0 == 0) goto L_0x0054
            float r1 = r11.A01
            int r0 = r2.A05
            float r0 = (float) r0
            if (r3 != r10) goto L_0x00d8
            float r0 = r0 / r1
            float r0 = r0 + r14
            int r0 = (int) r0
        L_0x00d3:
            r4.A01(r0)
            goto L_0x0054
        L_0x00d8:
            float r1 = r1 * r0
            float r1 = r1 + r14
            int r0 = (int) r1
            goto L_0x00d3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C02540Au.A06(X.0Az, X.0Az, int):void");
    }
}
