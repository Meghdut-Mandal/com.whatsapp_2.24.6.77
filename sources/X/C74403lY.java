package X;

/* renamed from: X.3lY  reason: invalid class name and case insensitive filesystem */
public final class C74403lY implements AnonymousClass1EI {
    public final AnonymousClass12P A00;
    public final AnonymousClass1A1 A01;
    public final AnonymousClass1G3 A02;
    public final C20810yC A03;

    public boolean BQ5(AnonymousClass3IP r3, AnonymousClass3T1 r4) {
        AnonymousClass3KQ A0N;
        if (!this.A03.A0E(7075) || !r4.A1R(256) || (A0N = r4.A0N()) == null || !A0N.A07.isEmpty()) {
            return false;
        }
        return true;
    }

    public C74403lY(AnonymousClass1G3 r1, AnonymousClass12P r2, C20810yC r3, AnonymousClass1A1 r4) {
        C36321k7.A18(r3, r4, r2, r1);
        this.A03 = r3;
        this.A01 = r4;
        this.A00 = r2;
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BON(X.AnonymousClass3IP r7, X.AnonymousClass3T1 r8) {
        /*
            r6 = this;
            boolean r0 = r6.BQ5(r7, r8)
            if (r0 == 0) goto L_0x0049
            X.3KQ r0 = r8.A0N()
            if (r0 == 0) goto L_0x0049
            java.util.ArrayList r5 = r0.A07
            r5.clear()
            java.util.ArrayList r4 = X.AnonymousClass001.A0I()
            X.12P r0 = r6.A00
            X.1M0 r3 = r0.get()
            long r1 = r8.A1N
            X.2ow r0 = X.C52132ow.A02
            android.database.Cursor r2 = X.AnonymousClass1G3.A00(r3, r0, r1)
        L_0x0023:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
            X.1A1 r0 = r6.A01     // Catch:{ all -> 0x0042 }
            X.3T1 r1 = r0.A00(r2)     // Catch:{ all -> 0x0042 }
            boolean r0 = r1 instanceof X.AnonymousClass2bV     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x0023
            X.2bV r1 = (X.AnonymousClass2bV) r1     // Catch:{ all -> 0x0042 }
            if (r1 == 0) goto L_0x0023
            r4.add(r1)     // Catch:{ all -> 0x0042 }
            goto L_0x0023
        L_0x003b:
            r2.close()
            r5.addAll(r4)
            return
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74403lY.BON(X.3IP, X.3T1):void");
    }
}
