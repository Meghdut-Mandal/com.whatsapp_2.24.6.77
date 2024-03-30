package X;

/* renamed from: X.4hG  reason: invalid class name and case insensitive filesystem */
public final class C93864hG extends C93904hK {
    public final boolean A00;
    public final C93904hK A01;
    public final boolean A02;

    public void A0B() {
        C93904hK r0;
        this.A02 = true;
        if (this.A02 && (r0 = this.A01) != null) {
            r0.A0B();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = r5.A07;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C93864hG(X.C93904hK r5, X.C006302t r6, X.C006302t r7, boolean r8, boolean r9) {
        /*
            r4 = this;
            X.72d r3 = X.C1496472d.A04
            if (r5 == 0) goto L_0x0008
            X.02t r0 = r5.A07
            if (r0 != 0) goto L_0x0012
        L_0x0008:
            java.util.concurrent.atomic.AtomicReference r0 = X.AnonymousClass6YQ.A08
            java.lang.Object r0 = r0.get()
            X.4hK r0 = (X.C93904hK) r0
            X.02t r0 = r0.A07
        L_0x0012:
            X.02t r2 = X.AnonymousClass6YQ.A0B(r6, r0, r8)
            if (r5 == 0) goto L_0x001c
            X.02t r1 = r5.A08
            if (r1 != 0) goto L_0x0026
        L_0x001c:
            java.util.concurrent.atomic.AtomicReference r0 = X.AnonymousClass6YQ.A08
            java.lang.Object r0 = r0.get()
            X.4hK r0 = (X.C93904hK) r0
            X.02t r1 = r0.A08
        L_0x0026:
            if (r7 == 0) goto L_0x0041
            if (r1 == 0) goto L_0x0036
            boolean r0 = r7.equals(r1)
            if (r0 != 0) goto L_0x0036
            X.7Tp r0 = new X.7Tp
            r0.<init>(r7, r1)
            r7 = r0
        L_0x0036:
            r0 = 0
            r4.<init>(r3, r2, r7, r0)
            r4.A01 = r5
            r4.A00 = r8
            r4.A02 = r9
            return
        L_0x0041:
            r7 = r1
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93864hG.<init>(X.4hK, X.02t, X.02t, boolean, boolean):void");
    }

    public static final C93904hK A00(C93864hG r0) {
        C93904hK r02 = r0.A01;
        if (r02 == null) {
            return (C93904hK) AnonymousClass6YQ.A08.get();
        }
        return r02;
    }
}
