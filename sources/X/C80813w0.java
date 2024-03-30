package X;

/* renamed from: X.3w0  reason: invalid class name and case insensitive filesystem */
public class C80813w0 implements Runnable {
    public final C19730wQ A00;
    public final AnonymousClass1A6 A01;
    public final C21060yb A02;
    public final C19630wG A03;
    public final C220412q A04;
    public final C24541Cv A05;
    public final C34061gO A06;
    public final C26041Iq A07;
    public final AnonymousClass1CR A08;

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005b, code lost:
        if (r0.A0J() != null) goto L_0x005d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r9 = this;
            X.1A6 r0 = r9.A01
            java.util.ArrayList r0 = r0.A09()
            java.util.Iterator r8 = r0.iterator()
            r3 = 0
        L_0x000b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x007f
            X.11F r2 = X.C36401kF.A0a(r8)
            X.12q r1 = r9.A04
            boolean r0 = r1.A0Q(r2)
            if (r0 != 0) goto L_0x000b
            int r5 = r1.A02(r2)
            if (r5 <= 0) goto L_0x000b
            X.1CR r4 = r9.A08
            X.3LI r0 = X.C36361kB.A0d(r2, r4)
            boolean r0 = r0.A0B()
            if (r0 != 0) goto L_0x007d
            X.1Cv r1 = r9.A05
            r0 = 7
            int r0 = java.lang.Math.min(r5, r0)
            java.util.ArrayList r0 = r1.A07(r2, r0)
            java.util.Iterator r7 = r0.iterator()
        L_0x003e:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x000b
            X.3T1 r6 = X.C36391kE.A0l(r7)
            java.util.List r1 = r6.A0w
            X.0wQ r0 = r9.A00
            boolean r2 = X.C65713Te.A05(r0, r1)
            X.3T1 r0 = r6.A0S()
            if (r0 == 0) goto L_0x005d
            X.11F r0 = r0.A0J()
            r1 = 1
            if (r0 == 0) goto L_0x005e
        L_0x005d:
            r1 = 0
        L_0x005e:
            X.3Qa r0 = r6.A1J
            X.11F r0 = r0.A00
            boolean r0 = X.AnonymousClass143.A0G(r0)
            if (r0 == 0) goto L_0x003e
            if (r1 != 0) goto L_0x006c
            if (r2 == 0) goto L_0x003e
        L_0x006c:
            X.11F r0 = r6.A0J()
            X.C18740tg.A06(r0)
            X.3LI r0 = X.C36361kB.A0d(r0, r4)
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x003e
        L_0x007d:
            int r3 = r3 + r5
            goto L_0x000b
        L_0x007f:
            X.1gO r0 = r9.A06
            X.C34061gO.A01(r0)
            java.util.List r0 = r0.A00
            int r0 = r0.size()
            int r3 = r3 + r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "widgetprovider/updatebadgecount:"
            X.C36321k7.A1T(r0, r1, r3)
            X.1Iq r2 = r9.A07
            X.0wG r0 = r9.A03
            android.content.Context r1 = r0.A00
            X.0yb r0 = r9.A02
            r2.A03(r1, r0, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80813w0.run():void");
    }

    public C80813w0(C19730wQ r1, AnonymousClass1A6 r2, C21060yb r3, C19630wG r4, C220412q r5, C24541Cv r6, C34061gO r7, C26041Iq r8, AnonymousClass1CR r9) {
        this.A03 = r4;
        this.A00 = r1;
        this.A04 = r5;
        this.A07 = r8;
        this.A02 = r3;
        this.A05 = r6;
        this.A08 = r9;
        this.A01 = r2;
        this.A06 = r7;
    }
}
