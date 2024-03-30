package X;

/* renamed from: X.3vf  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C80603vf implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C70643fU A02;
    public final /* synthetic */ C46812bi A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C80603vf(C70643fU r1, C46812bi r2, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A04 = z;
        this.A01 = i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0054, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r19 = this;
            r0 = r19
            X.3fU r5 = r0.A02
            X.2bi r7 = r0.A03
            int r8 = r0.A00
            boolean r10 = r0.A04
            int r9 = r0.A01
            r4 = 0
            X.005 r0 = r5.A0C
            java.lang.Object r1 = r0.get()
            X.357 r1 = (X.AnonymousClass357) r1
            X.3Qa r0 = r7.A1J
            X.11F r12 = r0.A00
            if (r12 == 0) goto L_0x005b
            X.0xM r11 = r1.A00
            long r14 = r7.A1N
            r2 = 1
            long r14 = r14 + r2
            r13 = 1
            r18 = 0
            r16 = -1
            X.36f r0 = X.C20310xM.A00(r11, r12, r13, r14, r16, r18)
            android.database.Cursor r2 = r0.A00
            if (r2 == 0) goto L_0x005b
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0058
            X.1A1 r0 = r1.A01     // Catch:{ all -> 0x0051 }
            X.3T1 r6 = r0.A00(r2)     // Catch:{ all -> 0x0051 }
            boolean r0 = r6 instanceof X.C46812bi     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0058
            r1 = r6
            X.2bi r1 = (X.C46812bi) r1     // Catch:{ all -> 0x0051 }
            X.3Qa r0 = r1.A1J     // Catch:{ all -> 0x0051 }
            boolean r0 = r0.A02     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x005d
            X.3Qj r0 = X.AnonymousClass2bU.A00(r1)     // Catch:{ all -> 0x0051 }
            boolean r0 = r0.A0V     // Catch:{ all -> 0x0051 }
            if (r0 != 0) goto L_0x005d
            goto L_0x0058
        L_0x0051:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0053 }
        L_0x0053:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x0058:
            r2.close()
        L_0x005b:
            r6 = r4
            goto L_0x0060
        L_0x005d:
            r2.close()
        L_0x0060:
            X.17Y r0 = r5.A01
            X.3vq r4 = new X.3vq
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.A0H(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80603vf.run():void");
    }
}
