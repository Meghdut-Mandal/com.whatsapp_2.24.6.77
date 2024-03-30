package X;

/* renamed from: X.3vv  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80763vv implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ C45682Sh A04;
    public final /* synthetic */ AnonymousClass11F A05;
    public final /* synthetic */ C28081Rg A06;

    public /* synthetic */ C80763vv(C45682Sh r1, AnonymousClass11F r2, C28081Rg r3, int i, int i2, int i3, long j) {
        this.A06 = r3;
        this.A04 = r1;
        this.A00 = i;
        this.A03 = j;
        this.A05 = r2;
        this.A01 = i2;
        this.A02 = i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011b, code lost:
        if (r2 != false) goto L_0x011d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            X.1Rg r6 = r11.A06
            X.2Sh r5 = r11.A04
            int r4 = r11.A00
            long r0 = r11.A03
            X.11F r3 = r11.A05
            int r8 = r11.A01
            int r2 = r11.A02
            if (r5 != 0) goto L_0x0015
            X.2Sh r5 = new X.2Sh
            r5.<init>()
        L_0x0015:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r4)
            r5.A05 = r7
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0B = r0
            r7 = 3
            if (r4 != r7) goto L_0x0031
            if (r3 == 0) goto L_0x0031
            boolean r0 = r3 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x0164
            r0 = 1
        L_0x002b:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
        L_0x002f:
            r5.A04 = r9
        L_0x0031:
            if (r8 <= 0) goto L_0x0042
            long r0 = (long) r8
            r9 = 32
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x003c
            r0 = 32
        L_0x003c:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A0A = r0
        L_0x0042:
            if (r2 <= 0) goto L_0x005d
            long r0 = (long) r2
            r9 = 32
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 > 0) goto L_0x004d
            r0 = 32
        L_0x004d:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r5.A09 = r0
            int r0 = X.AnonymousClass3UK.A00(r2)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A03 = r0
        L_0x005d:
            com.whatsapp.jid.GroupJid r1 = X.C36441kJ.A0l(r3)
            r2 = 0
            if (r1 == 0) goto L_0x0079
            X.16D r0 = r6.A06
            X.141 r0 = r0.A0A(r1)
            if (r0 == 0) goto L_0x0079
            boolean r0 = r0.A0j
            if (r0 == 0) goto L_0x0079
            X.12q r0 = r6.A09
            boolean r0 = r0.A0P(r1)
            if (r0 == 0) goto L_0x0079
            r2 = 1
        L_0x0079:
            boolean r1 = X.AnonymousClass143.A0I(r3)
            r8 = 1
            if (r4 == r7) goto L_0x0118
            r0 = 8
            if (r4 == r0) goto L_0x0112
            r0 = 10
            if (r4 != r0) goto L_0x008e
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x008c:
            r5.A00 = r0
        L_0x008e:
            java.lang.Integer r0 = r5.A05
            int r1 = r0.intValue()
            r0 = 12
            X.0yW r3 = r6.A0E
            if (r1 != r0) goto L_0x010e
            X.0u5 r0 = new X.0u5
            r0.<init>(r8, r8)
            r3.Blx(r5, r0)
        L_0x00a2:
            X.2Ny r4 = new X.2Ny
            r4.<init>()
            X.19J r0 = r6.A05
            int r2 = r0.A04
            r1 = 2
            r0 = 0
            if (r2 != r1) goto L_0x00b0
            r0 = 1
        L_0x00b0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4.A00 = r0
            r3.Bly(r4)
            X.0yC r4 = r6.A0D
            r0 = 7747(0x1e43, float:1.0856E-41)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x00e1
            X.2Ox r2 = new X.2Ox
            r2.<init>()
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double r0 = java.lang.Double.valueOf(r0)
            r2.A00 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)
            r2.A01 = r0
            r3.Bly(r2)
            X.2N5 r0 = new X.2N5
            r0.<init>()
            r3.Bly(r0)
        L_0x00e1:
            r0 = 8011(0x1f4b, float:1.1226E-41)
            boolean r0 = r4.A0E(r0)
            if (r0 == 0) goto L_0x010d
            java.util.Random r1 = r6.A0K
            r0 = 100
            int r0 = r1.nextInt(r0)
            if (r0 != 0) goto L_0x010d
            X.2ND r2 = new X.2ND
            r2.<init>()
            r0 = 4248(0x1098, double:2.099E-320)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r2.A00 = r1
            r3.Bly(r2)
            X.2O2 r0 = new X.2O2
            r0.<init>()
            r0.A00 = r1
            r3.Bly(r0)
        L_0x010d:
            return
        L_0x010e:
            r3.Bly(r5)
            goto L_0x00a2
        L_0x0112:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            goto L_0x008c
        L_0x0118:
            if (r1 != 0) goto L_0x011d
            r0 = 0
            if (r2 == 0) goto L_0x011e
        L_0x011d:
            r0 = 1
        L_0x011e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A00 = r0
            if (r3 == 0) goto L_0x014f
            X.0v5 r1 = r6.A00
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r0 = r1.A02()
            X.1HX r0 = (X.AnonymousClass1HX) r0
            X.1Hg r0 = r0.A00
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r2 = r1.A02()
            X.1HX r2 = (X.AnonymousClass1HX) r2
            r1 = 0
            boolean r0 = X.C197029b1.A00(r3)
            if (r0 == 0) goto L_0x015f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
        L_0x014d:
            r5.A01 = r0
        L_0x014f:
            X.1DT r0 = r6.A03
            int r0 = r0.A0B(r3)
            if (r0 == 0) goto L_0x008e
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r5.A02 = r0
            goto L_0x008e
        L_0x015f:
            X.AnonymousClass1HX.A00(r2, r3)
            r0 = 0
            goto L_0x014d
        L_0x0164:
            boolean r0 = r3 instanceof X.AnonymousClass147
            r9 = 0
            if (r0 == 0) goto L_0x0188
            X.12q r1 = r6.A09
            r0 = r3
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            int r1 = r1.A06(r0)
            if (r1 != r7) goto L_0x0177
            r0 = 4
            goto L_0x002b
        L_0x0177:
            r0 = 2
            if (r1 == r0) goto L_0x0182
            r0 = 6
            if (r1 == r0) goto L_0x0182
            if (r1 != 0) goto L_0x002f
            r0 = 2
            goto L_0x002b
        L_0x0182:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r7)
            goto L_0x002f
        L_0x0188:
            boolean r0 = r3 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x002f
            r0 = 5
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80763vv.run():void");
    }
}
