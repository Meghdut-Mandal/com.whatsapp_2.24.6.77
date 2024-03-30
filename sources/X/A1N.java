package X;

public final class A1N implements C162197oC {
    public final AnonymousClass5TP A00 = AnonymousClass5TP.HIGH;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C202539m8 A03;

    public A1N(C202539m8 r2, int i, int i2) {
        this.A03 = r2;
        this.A02 = i;
        this.A01 = i2;
    }

    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C162197oC r3 = (C162197oC) obj;
        AnonymousClass00C.A0D(r3, 1);
        return r3.BGF().compareTo(this.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b6, code lost:
        if (r2 != null) goto L_0x00ab;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r14 = this;
        L_0x0000:
            X.9m8 r11 = r14.A03
            int r6 = r11.A00
            r10 = 0
            if (r6 >= r10) goto L_0x0008
            r6 = 0
        L_0x0008:
            int r9 = r14.A02
            int r8 = r14.A01
            X.9CE r5 = r11.A06
            int r0 = r11.A04
            X.0mZ r0 = X.C15040mb.A05(r10, r0)
            java.util.ArrayList r4 = X.C36321k7.A0J(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x001c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0038
            int r2 = X.C165617ti.A05(r3)
            int r2 = r2 + r6
            int r1 = r5.A00
            int r2 = r2 % r1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            if (r2 < 0) goto L_0x0036
            if (r0 == 0) goto L_0x0036
        L_0x0032:
            X.AnonymousClass000.A1F(r4, r2)
            goto L_0x001c
        L_0x0036:
            int r2 = r2 + r1
            goto L_0x0032
        L_0x0038:
            java.util.ArrayList r7 = X.AnonymousClass001.A0I()
            java.util.Iterator r3 = r4.iterator()
        L_0x0040:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x005a
            java.lang.Object r2 = r3.next()
            int r1 = X.AnonymousClass000.A0I(r2)
            java.util.Set r0 = r11.A03
            boolean r0 = X.AnonymousClass000.A1Z(r0, r1)
            if (r0 == 0) goto L_0x0040
            r7.add(r2)
            goto L_0x0040
        L_0x005a:
            java.util.Set r6 = X.C007103b.A0f(r7)
            java.util.concurrent.ConcurrentHashMap r5 = r11.A09
            java.util.Set r0 = r5.keySet()
            X.AnonymousClass00C.A08(r0)
            java.util.Set r0 = X.C13640kC.A05(r6, r0)
            java.util.ArrayDeque r4 = new java.util.ArrayDeque
            r4.<init>(r0)
            java.util.Iterator r13 = r7.iterator()
        L_0x0074:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00b9
            int r12 = X.C36341k9.A0A(r13)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r12)
            java.lang.Object r0 = r5.get(r3)
            if (r0 != 0) goto L_0x0074
            int r1 = r11.A00
            r0 = -1
            if (r1 == r0) goto L_0x0095
            boolean r0 = X.AnonymousClass000.A1Z(r6, r1)
            if (r0 != 0) goto L_0x0095
            goto L_0x0000
        L_0x0095:
            java.lang.Object r2 = r4.pollFirst()
            r0 = 0
            if (r2 == 0) goto L_0x00b2
            java.lang.Object r1 = r5.get(r2)
            X.AU0 r1 = (X.AU0) r1
            if (r1 == 0) goto L_0x00b2
            X.AU0 r0 = X.C202539m8.A01(r1, r11, r12, r9, r8)
            r1.close()
        L_0x00ab:
            r5.remove(r2)
        L_0x00ae:
            r5.put(r3, r0)
            goto L_0x0074
        L_0x00b2:
            X.AU0 r0 = X.C202539m8.A01(r0, r11, r12, r9, r8)
            if (r2 == 0) goto L_0x00ae
            goto L_0x00ab
        L_0x00b9:
            r11.A01 = r7
            java.util.concurrent.atomic.AtomicBoolean r0 = r11.A0A
            r0.set(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A1N.run():void");
    }

    public AnonymousClass5TP BGF() {
        return this.A00;
    }
}
