package X;

/* renamed from: X.3d2  reason: invalid class name and case insensitive filesystem */
public final class C69133d2 implements C19710wO, C159417jK {
    public final AnonymousClass1A6 A00;
    public final C19970wo A01;
    public final C220412q A02;
    public final C24381Cf A03;
    public final C20810yC A04;
    public final C61543Cj A05;
    public final AnonymousClass377 A06;
    public final AnonymousClass1CR A07;
    public final C19770wU A08;

    public C69133d2(AnonymousClass1A6 r2, C19970wo r3, C220412q r4, C24381Cf r5, C20810yC r6, C61543Cj r7, AnonymousClass377 r8, AnonymousClass1CR r9, C19770wU r10) {
        AnonymousClass00C.A0D(r6, 1);
        C36321k7.A1A(r9, r10, r5, r4, 2);
        AnonymousClass00C.A0D(r3, 7);
        AnonymousClass00C.A0D(r2, 9);
        this.A04 = r6;
        this.A07 = r9;
        this.A06 = r8;
        this.A08 = r10;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
        this.A05 = r7;
        this.A00 = r2;
    }

    public String BIB() {
        return "AutoMuteManager";
    }

    public /* synthetic */ void BRL() {
    }

    public void BRM() {
        this.A03.registerObserver(new AnonymousClass4YE(this, 17));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0072, code lost:
        r10 = r15.A02;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV1() {
        /*
            r15 = this;
            X.0yC r9 = r15.A04
            r0 = 4447(0x115f, float:6.232E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 == 0) goto L_0x0104
            X.1A6 r0 = r15.A00
            java.util.ArrayList r0 = r0.A04()
            java.util.Iterator r14 = r0.iterator()
        L_0x0014:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0104
            X.11F r8 = X.C36401kF.A0a(r14)
            X.AnonymousClass00C.A0B(r8)
            r4 = 0
            X.AnonymousClass00C.A0D(r8, r4)
            boolean r0 = r8 instanceof com.whatsapp.jid.GroupJid
            if (r0 == 0) goto L_0x0056
            X.12q r1 = r15.A02
            r0 = r8
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r3 = r1.A05(r0)
            r0 = 3
            java.lang.Integer[] r2 = new java.lang.Integer[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            r2[r4] = r0
            r1 = 2
            X.AnonymousClass000.A1K(r2, r1)
            r0 = 6
            X.AnonymousClass000.A1L(r2, r0, r1)
            java.util.List r1 = java.util.Arrays.asList(r2)
            X.AnonymousClass00C.A08(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            boolean r0 = r1.contains(r0)
            r0 = r0 ^ 1
            if (r0 != 0) goto L_0x0014
        L_0x0056:
            X.1CR r12 = r15.A07
            X.3LI r1 = X.C36361kB.A0d(r8, r12)
            boolean r0 = r1.A0A()
            if (r0 != 0) goto L_0x0014
            int r2 = r1.A02
            r1 = 1
            r0 = 2
            if (r2 == r0) goto L_0x0014
            if (r2 == r1) goto L_0x0014
            r0 = 4332(0x10ec, float:6.07E-42)
            int r11 = r9.A07(r0)
            if (r11 < 0) goto L_0x0014
            X.12q r10 = r15.A02
            X.3Qp r2 = r10.A09(r8, r4)
            if (r2 == 0) goto L_0x0014
            int r0 = r2.A08
            long r6 = (long) r0
            X.0wo r13 = r15.A01
            long r0 = X.C19970wo.A00(r13)
            double r4 = (double) r0
            long r2 = r2.A0Y
            double r0 = (double) r2
            double r4 = r4 - r0
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            double r0 = (double) r2
            double r4 = r4 / r0
            double r3 = java.lang.Math.ceil(r4)
            r1 = 0
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0014
            double r0 = (double) r6
            double r0 = r0 / r3
            double r2 = (double) r11
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x0014
            X.3Qp r7 = X.C36371kC.A0W(r10, r8)
            if (r7 == 0) goto L_0x0014
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 4333(0x10ed, float:6.072E-42)
            long r0 = X.C36441kJ.A0B(r9, r0)
            long r5 = r2.toMillis(r0)
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0014
            long r0 = r7.A0Y
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0014
            long r3 = X.C19970wo.A00(r13)
            long r3 = r3 - r5
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0014
            r0 = 4334(0x10ee, float:6.073E-42)
            boolean r0 = r9.A0E(r0)
            if (r0 == 0) goto L_0x0014
            X.377 r6 = r15.A06
            r2 = -1
            r0 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.196 r5 = r6.A00
            r4 = 1
            long r0 = r0.longValue()
            java.util.Set r1 = r5.A03(r8, r0, r4)
            X.AnonymousClass00C.A08(r1)
            X.1CR r0 = r6.A01
            boolean r0 = r0.A0m(r8, r2)
            if (r0 == 0) goto L_0x00ff
            r5.A0Q(r1)
            r12.A0b(r8, r4)
            X.3Cj r0 = r15.A05
            r0.A00(r4)
            goto L_0x0014
        L_0x00ff:
            r5.A0P(r1)
            goto L_0x0014
        L_0x0104:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C69133d2.BV1():void");
    }
}
