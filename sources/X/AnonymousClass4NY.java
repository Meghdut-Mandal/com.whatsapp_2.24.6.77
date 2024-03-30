package X;

/* renamed from: X.4NY  reason: invalid class name */
public final class AnonymousClass4NY extends C005502l {
    public final AnonymousClass3Dw A00 = new AnonymousClass3Dw();

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (r1.A01 == false) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A04(X.C005102h r3) {
        /*
            r2 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            X.03P r0 = X.C36401kF.A0y()
            boolean r1 = r0.A04(r3)
            r0 = 1
            if (r1 != 0) goto L_0x001d
            X.3Dw r1 = r2.A00
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x001a
            boolean r1 = r1.A01
            r0 = 0
            if (r1 != 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            r0 = r0 ^ 1
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4NY.A04(X.02h):boolean");
    }

    public void A03(Runnable runnable, C005102h r6) {
        C36321k7.A0w(r6, runnable);
        AnonymousClass3Dw r3 = this.A00;
        AnonymousClass03P A0y = C36401kF.A0y();
        if (A0y.A04(r6) || r3.A00 || !r3.A01) {
            A0y.A03(new AnonymousClass75C((Object) r3, (Object) runnable, 3), r6);
        } else if (r3.A03.offer(runnable)) {
            r3.A00();
        } else {
            throw AnonymousClass001.A09("cannot enqueue any more runnables");
        }
    }
}
