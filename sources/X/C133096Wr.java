package X;

/* renamed from: X.6Wr  reason: invalid class name and case insensitive filesystem */
public final class C133096Wr {
    public double A00;
    public AnonymousClass5T2 A01;
    public final int A02;
    public final int A03;

    public C133096Wr(AnonymousClass5T2 r3, int i, int i2) {
        AnonymousClass00C.A0D(r3, 3);
        this.A02 = i;
        this.A03 = i2;
        this.A01 = r3;
        this.A00 = 0.0d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004b, code lost:
        if (r3 == 0.0d) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00db, code lost:
        if (A02(r0, r2) != false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e3, code lost:
        if (A00(r0, r2) > 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00f0, code lost:
        if (A00(r0, r2) < 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00f8, code lost:
        if (A00(r0, r2) <= 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0122, code lost:
        if (r4 >= 0) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0128, code lost:
        if (r0 == 0.0d) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x012a, code lost:
        r0 = 0.0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0130, code lost:
        if (r0 == 0.0d) goto L_0x0132;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0134, code lost:
        if (r2 != 0.0d) goto L_0x004d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final double A03(X.AnonymousClass6YB r11, java.util.ArrayList r12, int r13) {
        /*
            r10 = this;
            r0 = 2
            r3 = 18
            X.AnonymousClass00C.A0D(r11, r0)
            int r4 = r10.A02
            java.lang.String r9 = "Object has operation field set to "
            r2 = -1
            r1 = 19
            if (r4 != r2) goto L_0x0030
            int r0 = r10.A03
            if (r0 != r2) goto L_0x01b3
            X.5T2 r2 = r10.A01
            int r0 = r2.ordinal()
            if (r0 == r1) goto L_0x002d
            if (r0 != r3) goto L_0x0137
            java.lang.Object r0 = r12.get(r13)
            X.AnonymousClass00C.A08(r0)
            double r0 = X.C90504aG.A01(r0)
            r10.A00 = r0
        L_0x002a:
            double r0 = r10.A00
            return r0
        L_0x002d:
            double r0 = r10.A00
            goto L_0x0051
        L_0x0030:
            if (r4 == r2) goto L_0x01b3
            int r3 = r10.A03
            if (r3 != r2) goto L_0x0059
            X.6Wr r0 = r11.A0B(r4)
            double r3 = r0.A03(r11, r12, r4)
            X.5T2 r2 = r10.A01
            int r1 = r2.ordinal()
            r0 = 0
            if (r1 != r0) goto L_0x0149
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x012a
        L_0x004d:
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x004f:
            r10.A00 = r0
        L_0x0051:
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r12.set(r13, r0)
            goto L_0x002a
        L_0x0059:
            if (r4 == r2) goto L_0x01b3
            if (r3 == r2) goto L_0x01b3
            X.6Wr r0 = r11.A0B(r4)
            double r0 = r0.A03(r11, r12, r4)
            X.6Wr r2 = r11.A0B(r3)
            double r2 = r2.A03(r11, r12, r3)
            X.5T2 r8 = r10.A01
            int r7 = r8.ordinal()
            java.lang.String r6 = "Division by zero found. rightValue="
            r4 = 0
            switch(r7) {
                case 1: goto L_0x0126;
                case 2: goto L_0x012e;
                case 3: goto L_0x00d7;
                case 4: goto L_0x0117;
                case 5: goto L_0x00df;
                case 6: goto L_0x00e7;
                case 7: goto L_0x00ec;
                case 8: goto L_0x00f4;
                case 9: goto L_0x00fc;
                case 10: goto L_0x00ff;
                case 11: goto L_0x0102;
                case 12: goto L_0x008c;
                case 13: goto L_0x0105;
                case 14: goto L_0x010b;
                case 15: goto L_0x0094;
                case 16: goto L_0x0111;
                case 17: goto L_0x00ce;
                default: goto L_0x007a;
            }
        L_0x007a:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)
            java.lang.String r0 = r8.name()
            r1.append(r0)
            java.lang.String r0 = " which is not defined for two operands!"
            X.78L r0 = X.AnonymousClass78L.A00(r0, r1)
            throw r0
        L_0x008c:
            boolean r4 = A02(r2, r4)
            if (r4 != 0) goto L_0x015b
            double r0 = r0 / r2
            goto L_0x004f
        L_0x0094:
            boolean r6 = A02(r0, r4)
            if (r6 != 0) goto L_0x019c
            int r6 = A00(r0, r4)
            if (r6 < 0) goto L_0x018e
            r6 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            boolean r6 = A02(r0, r6)
            if (r6 != 0) goto L_0x0180
            boolean r6 = A02(r2, r4)
            if (r6 != 0) goto L_0x0172
            int r4 = A00(r2, r4)
            if (r4 < 0) goto L_0x0164
            r5 = 0
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x00cb
            r5 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r4 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r4 == 0) goto L_0x00cb
            double r4 = java.lang.Math.log(r2)
            double r2 = java.lang.Math.log(r0)
            double r0 = r4 / r2
            goto L_0x004f
        L_0x00cb:
            r0 = 9221120237041090560(0x7ff8000000000000, double:NaN)
            goto L_0x004f
        L_0x00ce:
            boolean r4 = A02(r2, r4)
            if (r4 != 0) goto L_0x01aa
            double r0 = r0 % r2
            goto L_0x004f
        L_0x00d7:
            boolean r0 = A02(r0, r2)
            if (r0 == 0) goto L_0x012a
            goto L_0x004d
        L_0x00df:
            int r0 = A00(r0, r2)
            if (r0 <= 0) goto L_0x012a
            goto L_0x004d
        L_0x00e7:
            int r4 = A00(r0, r2)
            goto L_0x0122
        L_0x00ec:
            int r0 = A00(r0, r2)
            if (r0 >= 0) goto L_0x012a
            goto L_0x004d
        L_0x00f4:
            int r0 = A00(r0, r2)
            if (r0 > 0) goto L_0x012a
            goto L_0x004d
        L_0x00fc:
            double r0 = r0 + r2
            goto L_0x004f
        L_0x00ff:
            double r0 = r0 - r2
            goto L_0x004f
        L_0x0102:
            double r0 = r0 * r2
            goto L_0x004f
        L_0x0105:
            double r0 = java.lang.Math.min(r0, r2)
            goto L_0x004f
        L_0x010b:
            double r0 = java.lang.Math.max(r0, r2)
            goto L_0x004f
        L_0x0111:
            double r0 = java.lang.Math.pow(r0, r2)
            goto L_0x004f
        L_0x0117:
            double r2 = X.C90504aG.A00(r0, r2)
            r0 = 4442235333156365461(0x3da5fd7fe1796495, double:1.0E-11)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
        L_0x0122:
            if (r4 < 0) goto L_0x012a
            goto L_0x004d
        L_0x0126:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0132
        L_0x012a:
            r0 = 0
            goto L_0x004f
        L_0x012e:
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x004d
        L_0x0132:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x004d
            goto L_0x012a
        L_0x0137:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)
            java.lang.String r0 = r2.name()
            r1.append(r0)
            java.lang.String r0 = " which is not defined for zero operands!"
            X.78L r0 = X.AnonymousClass78L.A00(r0, r1)
            throw r0
        L_0x0149:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r9)
            java.lang.String r0 = r2.name()
            r1.append(r0)
            java.lang.String r0 = " which is not defined for one operand!"
            X.78L r0 = X.AnonymousClass78L.A00(r0, r1)
            throw r0
        L_0x015b:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r6)
            X.78L r0 = A01(r0, r2)
            throw r0
        L_0x0164:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "x of log is negative. rightValue="
            r1.append(r0)
            X.78L r0 = A01(r1, r2)
            throw r0
        L_0x0172:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "x of log is zero. rightValue="
            r1.append(r0)
            X.78L r0 = A01(r1, r2)
            throw r0
        L_0x0180:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "Base of log is one. leftValue="
            r3.append(r2)
            X.78L r0 = A01(r3, r0)
            throw r0
        L_0x018e:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "Base of log is negative. leftValue="
            r3.append(r2)
            X.78L r0 = A01(r3, r0)
            throw r0
        L_0x019c:
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "Base of log is zero. leftValue="
            r3.append(r2)
            X.78L r0 = A01(r3, r0)
            throw r0
        L_0x01aa:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0v(r6)
            X.78L r0 = A01(r0, r2)
            throw r0
        L_0x01b3:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Object has incorrect fields, can not represent an actual operation node. leftChildIndex="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", rightChildIndex="
            r2.append(r0)
            int r0 = r10.A03
            r2.append(r0)
            java.lang.String r0 = ", operation="
            r2.append(r0)
            X.5T2 r0 = r10.A01
            r2.append(r0)
            java.lang.String r0 = ", value="
            r2.append(r0)
            double r0 = r10.A00
            X.78L r0 = A01(r2, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C133096Wr.A03(X.6YB, java.util.ArrayList, int):double");
    }

    public static final int A00(double d, double d2) {
        if (C90504aG.A00(d, d2) < 1.0E-11d) {
            return 0;
        }
        if (d < d2) {
            return -1;
        }
        return 1;
    }

    public static AnonymousClass78L A01(StringBuilder sb, double d) {
        sb.append(d);
        return new AnonymousClass78L(sb.toString());
    }

    public static final boolean A02(double d, double d2) {
        return C36431kI.A1P((C90504aG.A00(d, d2) > 1.0E-11d ? 1 : (C90504aG.A00(d, d2) == 1.0E-11d ? 0 : -1)));
    }

    public C133096Wr(AnonymousClass5T2 r4, int i) {
        AnonymousClass00C.A0D(r4, 2);
        this.A02 = i;
        this.A03 = -1;
        this.A01 = r4;
        this.A00 = 0.0d;
    }

    public C133096Wr(double d) {
        AnonymousClass5T2 r1 = AnonymousClass5T2.CONSTANT;
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = r1;
        this.A00 = d;
    }

    public C133096Wr() {
        AnonymousClass5T2 r3 = AnonymousClass5T2.VALUE;
        this.A02 = -1;
        this.A03 = -1;
        this.A01 = r3;
        this.A00 = 0.0d;
    }
}
