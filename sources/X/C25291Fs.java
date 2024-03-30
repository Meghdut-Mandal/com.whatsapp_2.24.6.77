package X;

/* renamed from: X.1Fs  reason: invalid class name and case insensitive filesystem */
public final class C25291Fs {
    public final C19700wN A00;
    public final C25301Ft A01;
    public final AnonymousClass1G3 A02;
    public final AnonymousClass1A1 A03;
    public final AnonymousClass005 A04;

    public C25291Fs(C19700wN r2, AnonymousClass1G3 r3, C25301Ft r4, AnonymousClass1A1 r5, AnonymousClass005 r6) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r5, 2);
        AnonymousClass00C.A0D(r4, 3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r3, 5);
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r4;
        this.A04 = r6;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C26911Lz r4, int r5, long r6, boolean r8) {
        /*
            r3 = this;
            X.2ow r0 = X.C52132ow.A02
            android.database.Cursor r2 = X.AnonymousClass1G3.A00(r4, r0, r6)
        L_0x0006:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0020
            X.1A1 r0 = r3.A03     // Catch:{ all -> 0x0024 }
            X.3T1 r1 = r0.A00(r2)     // Catch:{ all -> 0x0024 }
            if (r1 == 0) goto L_0x0006
            X.005 r0 = r3.A04     // Catch:{ all -> 0x0024 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0024 }
            X.0xM r0 = (X.C20310xM) r0     // Catch:{ all -> 0x0024 }
            r0.A0o(r1, r5, r8)     // Catch:{ all -> 0x0024 }
            goto L_0x0006
        L_0x0020:
            r2.close()
            return
        L_0x0024:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0026 }
        L_0x0026:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25291Fs.A00(X.1Lz, int, long, boolean):void");
    }
}
