package X;

/* renamed from: X.72b  reason: invalid class name and case insensitive filesystem */
public final class C1496272b implements Iterable, AnonymousClass00W {
    public final int A00;
    public final C1496372c A01;
    public final int A02;

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r1 = r4.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.Iterator iterator() {
        /*
            r5 = this;
            X.72c r4 = r5.A01
            int r1 = r4.A03
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0041
            int r3 = r5.A02
            java.util.HashMap r2 = r4.A05
            if (r2 == 0) goto L_0x002b
            boolean r0 = r4.A06
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003a
            if (r3 < 0) goto L_0x002b
            int r0 = r4.A00
            if (r3 >= r0) goto L_0x002b
            java.util.ArrayList r1 = r4.A04
            int r0 = X.AnonymousClass6QR.A01(r1, r3, r0)
            if (r0 < 0) goto L_0x002b
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L_0x002b
            r2.get(r0)
        L_0x002b:
            int r1 = r3 + 1
            int[] r0 = r4.A07
            int r0 = X.C90524aI.A05(r0, r3)
            int r3 = r3 + r0
            X.76U r0 = new X.76U
            r0.<init>(r4, r1, r3)
            return r0
        L_0x003a:
            java.lang.String r0 = "use active SlotWriter to crate an anchor for location instead"
            java.lang.RuntimeException r0 = X.AnonymousClass6XJ.A01(r0)
            throw r0
        L_0x0041:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1496272b.iterator():java.util.Iterator");
    }

    public C1496272b(C1496372c r1, int i, int i2) {
        this.A01 = r1;
        this.A02 = i;
        this.A00 = i2;
    }
}
