package X;

/* renamed from: X.1YE  reason: invalid class name */
public class AnonymousClass1YE {
    public final C19700wN A00;
    public final C19730wQ A01;
    public final AnonymousClass1DT A02;
    public final C19970wo A03;
    public final AnonymousClass1C7 A04;
    public final C20310xM A05;
    public final C25151Fe A06;
    public final AnonymousClass1TN A07;
    public final AnonymousClass1FN A08;
    public final C26171Jd A09;
    public final AnonymousClass1DL A0A;
    public final C26191Jf A0B;
    public final AnonymousClass19L A0C;
    public final C28361Si A0D;
    public final AnonymousClass1A1 A0E;
    public final AnonymousClass005 A0F;
    public final AnonymousClass1DP A0G;

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        if (r14 == 8) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0017, code lost:
        if (r0.A02 != false) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x009a, code lost:
        if (r14 == 9) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a7, code lost:
        if (r2 == false) goto L_0x00a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        if (r1 == false) goto L_0x002b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass1YE r12, X.AnonymousClass2bM r13, int r14) {
        /*
            X.3Qa r0 = r13.A1J
            X.11F r7 = r0.A00
            X.0wQ r6 = r12.A01
            boolean r0 = X.C66013Ui.A0R(r6, r13)
            r3 = 0
            if (r0 != 0) goto L_0x0019
            X.3Qa r0 = r13.A1Z()
            X.C18740tg.A06(r0)
            boolean r0 = r0.A02
            r1 = 0
            if (r0 == 0) goto L_0x001a
        L_0x0019:
            r1 = 1
        L_0x001a:
            int r8 = r13.A1I
            java.util.List r4 = X.C65733Tg.A00
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            boolean r0 = r4.contains(r2)
            if (r0 == 0) goto L_0x002b
            r0 = 1
            if (r1 != 0) goto L_0x002c
        L_0x002b:
            r0 = 0
        L_0x002c:
            if (r7 == 0) goto L_0x0038
            if (r0 != 0) goto L_0x0039
            X.1Jd r0 = r12.A09
            boolean r0 = r0.A0N(r13)
            if (r0 != 0) goto L_0x0039
        L_0x0038:
            return
        L_0x0039:
            boolean r5 = X.C65733Tg.A03(r13)
            boolean r0 = X.C66013Ui.A0R(r6, r13)
            if (r0 != 0) goto L_0x0056
            X.3Qa r0 = r13.A1Z()
            X.C18740tg.A06(r0)
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x008b
            int r1 = r13.A0D
            r0 = 17
            if (r1 != r0) goto L_0x008b
            if (r5 != 0) goto L_0x008b
        L_0x0056:
            X.1Jd r6 = r12.A09
            long r0 = r13.A1N
            boolean r2 = r4.contains(r2)
            if (r2 == 0) goto L_0x0065
            X.163 r2 = r6.A05
            r2.A0J(r7, r0)
        L_0x0065:
            X.1A1 r1 = r12.A0E
            X.3Qa r0 = r13.A1Z()
            X.3T1 r1 = r1.A03(r0)
            if (r1 == 0) goto L_0x0038
            boolean r0 = r13 instanceof X.C180868mY
            if (r0 != 0) goto L_0x007d
            boolean r0 = r13 instanceof X.C180858mX
            if (r0 != 0) goto L_0x007d
            boolean r0 = r13 instanceof X.C46762bd
            if (r0 == 0) goto L_0x0038
        L_0x007d:
            X.35M r0 = new X.35M
            r0.<init>(r1, r13)
            r6.A0I(r7, r0)
            X.1DP r0 = r12.A0G
            r0.A02(r7, r3)
            return
        L_0x008b:
            r0 = 1
            if (r14 == r0) goto L_0x0093
            r0 = 8
            r4 = 0
            if (r14 != r0) goto L_0x0094
        L_0x0093:
            r4 = 1
        L_0x0094:
            r0 = 2
            if (r14 == r0) goto L_0x009c
            r0 = 9
            r2 = 0
            if (r14 != r0) goto L_0x009d
        L_0x009c:
            r2 = 1
        L_0x009d:
            r1 = 3
            r0 = 0
            if (r14 != r1) goto L_0x00a2
            r0 = 1
        L_0x00a2:
            if (r5 == 0) goto L_0x00b2
            if (r0 != 0) goto L_0x00a9
            r9 = -1
            if (r2 != 0) goto L_0x00aa
        L_0x00a9:
            r9 = 0
        L_0x00aa:
            X.1Jd r6 = r12.A09
            long r10 = r13.A1N
            r6.A0H(r7, r8, r9, r10)
            goto L_0x0065
        L_0x00b2:
            if (r4 != 0) goto L_0x00b6
            if (r0 == 0) goto L_0x00a9
        L_0x00b6:
            r9 = 1
            goto L_0x00aa
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1YE.A00(X.1YE, X.2bM, int):void");
    }

    public void A01(AnonymousClass2bM r4) {
        this.A04.A01(new C35701j7(this, r4, 34), 53);
    }

    public AnonymousClass1YE(C19700wN r2, C19730wQ r3, AnonymousClass1DT r4, C19970wo r5, AnonymousClass1C7 r6, AnonymousClass1DP r7, C20310xM r8, C25151Fe r9, AnonymousClass1TN r10, AnonymousClass1FN r11, C26171Jd r12, AnonymousClass1DL r13, C26191Jf r14, AnonymousClass19L r15, C28361Si r16, AnonymousClass1A1 r17, AnonymousClass005 r18) {
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A0A = r13;
        this.A0G = r7;
        this.A02 = r4;
        this.A05 = r8;
        this.A0E = r17;
        this.A04 = r6;
        this.A0B = r14;
        this.A0F = r18;
        this.A0C = r15;
        this.A09 = r12;
        this.A0D = r16;
        this.A07 = r10;
        this.A08 = r11;
        this.A06 = r9;
    }
}
