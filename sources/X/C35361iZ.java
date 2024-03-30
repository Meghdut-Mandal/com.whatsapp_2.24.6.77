package X;

import java.net.InetSocketAddress;

/* renamed from: X.1iZ  reason: invalid class name and case insensitive filesystem */
public class C35361iZ implements Runnable {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public final int A05;

    public C35361iZ(AnonymousClass1WB r2, AnonymousClass635 r3, InetSocketAddress inetSocketAddress, int i, boolean z) {
        this.A05 = i;
        this.A01 = r2;
        this.A02 = inetSocketAddress;
        this.A00 = 30000;
        this.A04 = z;
        this.A03 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0036, code lost:
        if (r4.A06 == r2) goto L_0x0038;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.A05
            switch(r0) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x0053;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x009a;
                case 5: goto L_0x0017;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r9.A01
            X.1WB r3 = (X.AnonymousClass1WB) r3
            java.lang.Object r2 = r9.A02
            java.net.InetSocketAddress r2 = (java.net.InetSocketAddress) r2
            boolean r1 = r9.A04
            java.lang.Object r0 = r9.A03
            X.635 r0 = (X.AnonymousClass635) r0
            X.AnonymousClass1WB.A01(r3, r0, r2, r1)
        L_0x0016:
            return
        L_0x0017:
            java.lang.Object r5 = r9.A01
            X.1P3 r5 = (X.AnonymousClass1P3) r5
            java.lang.Object r4 = r9.A02
            X.141 r4 = (X.AnonymousClass141) r4
            int r2 = r9.A00
            java.lang.Object r3 = r9.A03
            X.11F r3 = (X.AnonymousClass11F) r3
            X.16K r0 = r5.A04
            boolean r0 = r0.A06(r4)
            if (r0 != 0) goto L_0x0033
            boolean r0 = r4.A0G()
            if (r0 == 0) goto L_0x0038
        L_0x0033:
            int r0 = r4.A06
            r1 = 1
            if (r0 != r2) goto L_0x0039
        L_0x0038:
            r1 = 0
        L_0x0039:
            X.1O7 r0 = r5.A05
            X.16K r0 = r0.A03
            r0.A04(r4)
            X.16I r0 = r5.A03
            r0.A01(r3)
            r0.A00(r3)
            if (r1 == 0) goto L_0x0016
            X.1O8 r2 = r5.A06
            int r1 = r4.A06
            r0 = 2
            r2.A01(r3, r1, r0)
            return
        L_0x0053:
            java.lang.Object r4 = r9.A01
            X.1Xg r4 = (X.C29601Xg) r4
            java.lang.Object r3 = r9.A02
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            boolean r0 = r9.A04
            int r1 = r9.A00
            java.lang.Object r2 = r9.A03
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            if (r3 == 0) goto L_0x0068
            r3.run()
        L_0x0068:
            if (r0 == 0) goto L_0x0016
            r0 = 56
            if (r1 != r0) goto L_0x0076
            X.16J r1 = r4.A02
            r0 = 28
        L_0x0072:
            r1.A05(r2, r0)
            return
        L_0x0076:
            r0 = 67
            if (r1 != r0) goto L_0x007f
            X.16J r1 = r4.A02
            r0 = 31
            goto L_0x0072
        L_0x007f:
            r0 = 68
            if (r1 != r0) goto L_0x0088
            X.16J r1 = r4.A02
            r0 = 30
            goto L_0x0072
        L_0x0088:
            r0 = 79
            if (r1 != r0) goto L_0x0091
            X.16J r1 = r4.A02
            r0 = 36
            goto L_0x0072
        L_0x0091:
            r0 = 93
            if (r1 != r0) goto L_0x0016
            X.16J r1 = r4.A02
            r0 = 42
            goto L_0x0072
        L_0x009a:
            java.lang.Object r5 = r9.A01
            X.1P3 r5 = (X.AnonymousClass1P3) r5
            java.lang.Object r3 = r9.A02
            X.141 r3 = (X.AnonymousClass141) r3
            int r6 = r9.A00
            java.lang.Object r4 = r9.A03
            X.11F r4 = (X.AnonymousClass11F) r4
            r8 = 1
            int r2 = r3.A05
            r1 = 0
            if (r2 == r6) goto L_0x00af
            r2 = 0
        L_0x00af:
            int r0 = r3.A06
            if (r0 != r6) goto L_0x00b4
            r1 = r0
        L_0x00b4:
            X.1O7 r0 = r5.A05
            r0.A00(r3, r2, r1)
            X.1AQ r2 = r5.A07
            java.lang.Class<X.11F> r0 = X.AnonymousClass11F.class
            com.whatsapp.jid.Jid r1 = r3.A06(r0)
            X.1AT r0 = r2.A01
            r0.A01(r1)
            X.1AT r0 = r2.A02
            r0.A01(r1)
            X.17Y r0 = r5.A01
            r7 = 5
            X.1iZ r2 = new X.1iZ
            r2.<init>((X.AnonymousClass141) r3, (X.AnonymousClass11F) r4, (X.AnonymousClass1P3) r5, (int) r6, (int) r7, (boolean) r8)
            r0.A0H(r2)
            return
        L_0x00d7:
            java.lang.Object r1 = r9.A01
            X.1Xg r1 = (X.C29601Xg) r1
            java.lang.Object r2 = r9.A02
            X.3T1 r2 = (X.AnonymousClass3T1) r2
            int r4 = r9.A00
            java.lang.Object r3 = r9.A03
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            boolean r6 = r9.A04
            X.1Xf r0 = r1.A00
            boolean r5 = r0.A01(r2, r4)
            X.C29601Xg.A00(r1, r2, r3, r4, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35361iZ.run():void");
    }

    public C35361iZ(AnonymousClass141 r2, AnonymousClass11F r3, AnonymousClass1P3 r4, int i, int i2, boolean z) {
        this.A05 = 5;
        this.A01 = r4;
        this.A04 = true;
        this.A02 = r2;
        this.A00 = i;
        this.A03 = r3;
    }

    public C35361iZ(Object obj, Object obj2, Object obj3, int i, int i2, boolean z) {
        this.A05 = i2;
        this.A01 = obj;
        this.A02 = obj2;
        this.A00 = i;
        this.A03 = obj3;
        this.A04 = z;
    }

    public C35361iZ(AnonymousClass141 r2, AnonymousClass11F r3, AnonymousClass1P3 r4, int i) {
        this.A05 = 4;
        this.A01 = r4;
        this.A02 = r2;
        this.A00 = i;
        this.A04 = true;
        this.A03 = r3;
    }
}
