package X;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1Y6  reason: invalid class name */
public class AnonymousClass1Y6 {
    public final C24041Av A00;
    public final C20810yC A01;
    public final AnonymousClass1EJ A02;
    public final AnonymousClass1D8 A03;
    public final C23981Ap A04;
    public final AnonymousClass1GX A05;
    public final AnonymousClass1SV A06;
    public final C19730wQ A07;

    public static boolean A00(C158357gn r4, AnonymousClass3SC r5, Object obj) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (AnonymousClass2bU r1 : C007103b.A0Y(r5.A02)) {
            synchronized (r1) {
                C65013Qj r0 = r1.A01;
                C18740tg.A06(r0);
                if (r4.B1E(r0, r1, obj)) {
                    atomicBoolean.set(true);
                }
            }
        }
        return atomicBoolean.get();
    }

    public static boolean A01(AnonymousClass2bU r4, boolean z) {
        synchronized (r4) {
            C65013Qj r3 = r4.A01;
            C18740tg.A06(r3);
            if (r4.A0D != 1) {
                return false;
            }
            r4.A0g();
            r3.A0f = false;
            r3.A0V = false;
            r3.A0Q = z;
            r3.A0E = 0;
            return true;
        }
    }

    public AnonymousClass1Y6(C19730wQ r1, C24041Av r2, C20810yC r3, AnonymousClass1EJ r4, AnonymousClass1D8 r5, C23981Ap r6, AnonymousClass1GX r7, AnonymousClass1SV r8) {
        this.A01 = r3;
        this.A07 = r1;
        this.A05 = r7;
        this.A04 = r6;
        this.A03 = r5;
        this.A06 = r8;
        this.A02 = r4;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        if (r0 != false) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000a, code lost:
        if (r0 != false) goto L_0x000c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C65013Qj r4, X.C129146Fj r5, X.AnonymousClass2bU r6) {
        /*
            r3 = this;
            java.lang.String r0 = r5.A05()
            if (r0 != 0) goto L_0x000c
            monitor-enter(r5)
            boolean r0 = r5.A0G     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0012
        L_0x000c:
            java.lang.String r0 = r5.A05()
            r6.A03 = r0
        L_0x0012:
            java.lang.String r0 = r5.A06()
            if (r0 != 0) goto L_0x001e
            monitor-enter(r5)
            boolean r0 = r5.A0H     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0024
        L_0x001e:
            java.lang.String r0 = r5.A06()
            r6.A04 = r0
        L_0x0024:
            monitor-enter(r5)
            java.lang.String r0 = r5.A0B     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0030
            monitor-enter(r5)
            java.lang.String r0 = r5.A0B     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            r6.A05 = r0
        L_0x0030:
            monitor-enter(r5)
            X.5r3 r0 = r5.A02     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x0050
            X.6Q6 r2 = r6.A1Y()
            X.C18740tg.A06(r2)
            byte[] r1 = r0.A00
            int[] r0 = r0.A01
            r2.A03(r1, r0)
            X.6Q6 r1 = r6.A1Y()
            X.0yC r0 = r3.A01
            boolean r0 = X.AnonymousClass3T2.A01(r0, r6)
            r1.A05 = r0
        L_0x0050:
            if (r4 == 0) goto L_0x00d2
            byte[] r0 = r5.A0C()
            if (r0 == 0) goto L_0x005e
            byte[] r0 = r5.A0C()
            r4.A0W = r0
        L_0x005e:
            monitor-enter(r5)
            byte[] r0 = r5.A0K     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x006a
            monitor-enter(r5)
            byte[] r0 = r5.A0K     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            r4.A0Y = r0
        L_0x006a:
            byte[] r0 = r5.A0D()
            if (r0 == 0) goto L_0x0076
            byte[] r0 = r5.A0D()
            r4.A0Z = r0
        L_0x0076:
            X.6Rx r0 = r5.A00()
            if (r0 == 0) goto L_0x008c
            X.6Rx r0 = r5.A00()
            byte[] r0 = r0.A01
            r4.A0a = r0
            X.6Rx r0 = r5.A00()
            long r0 = r0.A00
            r4.A0D = r0
        L_0x008c:
            java.lang.Integer r0 = r5.A01()
            if (r0 == 0) goto L_0x009c
            java.lang.Integer r0 = r5.A01()
            int r0 = r0.intValue()
            r4.A06 = r0
        L_0x009c:
            java.lang.Integer r0 = r5.A02()
            if (r0 == 0) goto L_0x00ac
            java.lang.Integer r0 = r5.A02()
            int r0 = r0.intValue()
            r4.A0A = r0
        L_0x00ac:
            monitor-enter(r5)
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x00b8
            monitor-enter(r5)
            java.lang.String r0 = r5.A0D     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            r4.A0O = r0
        L_0x00b8:
            monitor-enter(r5)
            byte[] r0 = r5.A0J     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            if (r0 == 0) goto L_0x00c4
            monitor-enter(r5)
            byte[] r0 = r5.A0J     // Catch:{ all -> 0x00d3 }
            monitor-exit(r5)
            r4.A0X = r0
        L_0x00c4:
            X.3Qa r0 = r6.A1J
            X.11F r0 = r0.A00
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = r5.A04()
            r4.A0M = r0
        L_0x00d2:
            return
        L_0x00d3:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1Y6.A02(X.3Qj, X.6Fj, X.2bU):void");
    }
}
