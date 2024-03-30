package X;

/* renamed from: X.13I  reason: invalid class name */
public final class AnonymousClass13I extends C19580wB {
    public boolean A00;
    public final C19630wG A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass13I(C19630wG r2, AnonymousClass005 r3) {
        super(r3);
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0025, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.A00
            if (r0 == r4) goto L_0x0046
            r3.A00 = r4
            X.0wG r0 = r3.A01     // Catch:{ IOException -> 0x0026 }
            android.content.Context r2 = r0.A00     // Catch:{ IOException -> 0x0026 }
            java.lang.String r1 = "login_failed"
            r0 = 0
            java.io.FileOutputStream r0 = r2.openFileOutput(r1, r0)     // Catch:{ IOException -> 0x0026 }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x0026 }
            r2.<init>(r0)     // Catch:{ IOException -> 0x0026 }
            boolean r0 = r3.A00     // Catch:{ all -> 0x001f }
            r2.writeBoolean(r0)     // Catch:{ all -> 0x001f }
            r2.close()     // Catch:{ IOException -> 0x0026 }
            goto L_0x002c
        L_0x001f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ IOException -> 0x0026 }
            throw r0     // Catch:{ IOException -> 0x0026 }
        L_0x0026:
            r1 = move-exception
            java.lang.String r0 = "loginmanager/failed/save login_failed"
            com.whatsapp.util.Log.w(r0, r1)
        L_0x002c:
            java.lang.Iterable r0 = r3.getObservers()
            java.util.Iterator r1 = r0.iterator()
        L_0x0034:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r1.next()
            X.1X9 r0 = (X.AnonymousClass1X9) r0
            if (r0 == 0) goto L_0x0034
            r0.BaM(r4)
            goto L_0x0034
        L_0x0046:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass13I.A00(boolean):void");
    }

    public final boolean A01() {
        return this.A00;
    }
}
