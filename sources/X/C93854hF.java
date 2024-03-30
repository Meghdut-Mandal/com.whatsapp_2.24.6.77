package X;

/* renamed from: X.4hF  reason: invalid class name and case insensitive filesystem */
public final class C93854hF extends C93904hK {
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C93854hF(X.C1496472d r6, int r7) {
        /*
            r5 = this;
            java.lang.Object r4 = X.AnonymousClass6YQ.A07
            monitor-enter(r4)
            java.util.List r3 = X.AnonymousClass6YQ.A03     // Catch:{ all -> 0x0023 }
            r2 = 0
            int r1 = r3.size()     // Catch:{ all -> 0x0023 }
            r0 = 1
            if (r1 != r0) goto L_0x001b
            java.lang.Object r1 = r3.get(r2)     // Catch:{ all -> 0x0023 }
        L_0x0011:
            X.02t r1 = (X.C006302t) r1     // Catch:{ all -> 0x0023 }
            if (r1 != 0) goto L_0x001d
            X.7RC r1 = new X.7RC     // Catch:{ all -> 0x0023 }
            r1.<init>(r3)     // Catch:{ all -> 0x0023 }
            goto L_0x001d
        L_0x001b:
            r1 = 0
            goto L_0x0011
        L_0x001d:
            monitor-exit(r4)
            r0 = 0
            r5.<init>(r6, r0, r1, r7)
            return
        L_0x0023:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C93854hF.<init>(X.72d, int):void");
    }

    public void A0B() {
        synchronized (AnonymousClass6YQ.A07) {
            int i = this.A01;
            if (i >= 0) {
                AnonymousClass6YQ.A0D(i);
                this.A01 = -1;
            }
        }
    }
}
