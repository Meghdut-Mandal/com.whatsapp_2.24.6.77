package X;

/* renamed from: X.05F  reason: invalid class name */
public abstract class AnonymousClass05F {
    public int A00;
    public C15340nB A01;
    public AnonymousClass0UH[] A02;
    public int A03;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001d  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass0UH A09() {
        /*
            r4 = this;
            monitor-enter(r4)
            X.0UH[] r0 = r4.A02     // Catch:{ all -> 0x0060 }
            r1 = 2
            if (r0 != 0) goto L_0x0034
            X.0UH[] r0 = r4.A0C(r1)     // Catch:{ all -> 0x0060 }
        L_0x000a:
            r4.A02 = r0     // Catch:{ all -> 0x0060 }
        L_0x000c:
            int r3 = r4.A03     // Catch:{ all -> 0x0060 }
        L_0x000e:
            r2 = r0[r3]     // Catch:{ all -> 0x0060 }
            if (r2 != 0) goto L_0x0018
            X.0UH r2 = r4.A0B()     // Catch:{ all -> 0x0060 }
            r0[r3] = r2     // Catch:{ all -> 0x0060 }
        L_0x0018:
            int r3 = r3 + 1
            int r1 = r0.length     // Catch:{ all -> 0x0060 }
            if (r3 < r1) goto L_0x001e
            r3 = 0
        L_0x001e:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>"
            X.AnonymousClass00C.A0E(r2, r1)     // Catch:{ all -> 0x0060 }
            boolean r1 = r2.A00(r4)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x000e
            r4.A03 = r3     // Catch:{ all -> 0x0060 }
            int r0 = r4.A00     // Catch:{ all -> 0x0060 }
            int r0 = r0 + 1
            r4.A00 = r0     // Catch:{ all -> 0x0060 }
            X.0nB r1 = r4.A01     // Catch:{ all -> 0x0060 }
            goto L_0x0045
        L_0x0034:
            int r2 = r4.A00     // Catch:{ all -> 0x0060 }
            int r1 = r0.length     // Catch:{ all -> 0x0060 }
            if (r2 < r1) goto L_0x000c
            int r1 = r1 * 2
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)     // Catch:{ all -> 0x0060 }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x0060 }
            X.0UH[] r0 = (X.AnonymousClass0UH[]) r0     // Catch:{ all -> 0x0060 }
            goto L_0x000a
        L_0x0045:
            monitor-exit(r4)
            if (r1 == 0) goto L_0x005f
            monitor-enter(r1)
            java.lang.Object r0 = X.C15340nB.A00(r1)     // Catch:{ all -> 0x005b }
            int r0 = X.AnonymousClass000.A0I(r0)     // Catch:{ all -> 0x005b }
            int r0 = r0 + 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x005b }
            r1.BwB(r0)     // Catch:{ all -> 0x005b }
            goto L_0x005e
        L_0x005b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x005e:
            monitor-exit(r1)
        L_0x005f:
            return r2
        L_0x0060:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass05F.A09():X.0UH");
    }

    public final void A0A(AnonymousClass0UH r7) {
        C15340nB r5;
        int i;
        C023509x[] A012;
        synchronized (this) {
            int i2 = this.A00 - 1;
            this.A00 = i2;
            r5 = this.A01;
            if (i2 == 0) {
                this.A03 = 0;
            }
            AnonymousClass00C.A0E(r7, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
            A012 = r7.A01(this);
        }
        for (C023509x r1 : A012) {
            if (r1 != null) {
                r1.resumeWith(AnonymousClass0AJ.A00);
            }
        }
        if (r5 != null) {
            synchronized (r5) {
                r5.BwB(Integer.valueOf(AnonymousClass000.A0I(C15340nB.A00(r5)) - 1));
            }
        }
    }

    public abstract AnonymousClass0UH A0B();

    public abstract AnonymousClass0UH[] A0C(int i);
}
