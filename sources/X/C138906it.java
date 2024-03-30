package X;

/* renamed from: X.6it  reason: invalid class name and case insensitive filesystem */
public final class C138906it implements C158967iX {
    public final AnonymousClass6Q8 A00;
    public final AnonymousClass6P9 A01;
    public final AnonymousClass6P9 A02;
    public final C97124oV A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.6Au} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.String} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C128086Au BI6(X.AnonymousClass69L r8) {
        /*
            r7 = this;
            java.lang.String r4 = r8.A01
            int r3 = r8.A00
            java.lang.String r1 = "SELECT * FROM SystemIdInfo WHERE work_spec_id=? AND generation=?"
            r2 = 2
            java.util.TreeMap r0 = X.C138686iW.A08
            X.6iW r6 = X.C109355Xg.A00(r1, r2)
            r0 = 1
            r6.B1q(r0, r4)
            long r0 = (long) r3
            r6.B1o(r2, r0)
            X.6Q8 r1 = r7.A00
            r1.A05()
            r0 = 0
            r5 = 0
            android.database.Cursor r4 = X.C109365Xh.A00(r1, r6, r0)
            java.lang.String r0 = "work_spec_id"
            int r3 = X.AnonymousClass6GJ.A01(r4, r0)     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "generation"
            int r2 = X.AnonymousClass6GJ.A01(r4, r0)     // Catch:{ all -> 0x0057 }
            java.lang.String r0 = "system_id"
            int r1 = X.AnonymousClass6GJ.A01(r4, r0)     // Catch:{ all -> 0x0057 }
            boolean r0 = r4.moveToFirst()     // Catch:{ all -> 0x0057 }
            if (r0 == 0) goto L_0x0050
            boolean r0 = r4.isNull(r3)     // Catch:{ all -> 0x0057 }
            if (r0 != 0) goto L_0x0042
            java.lang.String r5 = r4.getString(r3)     // Catch:{ all -> 0x0057 }
        L_0x0042:
            int r2 = r4.getInt(r2)     // Catch:{ all -> 0x0057 }
            int r1 = r4.getInt(r1)     // Catch:{ all -> 0x0057 }
            X.6Au r0 = new X.6Au     // Catch:{ all -> 0x0057 }
            r0.<init>(r5, r2, r1)     // Catch:{ all -> 0x0057 }
            r5 = r0
        L_0x0050:
            r4.close()
            r6.A00()
            return r5
        L_0x0057:
            r0 = move-exception
            r4.close()
            r6.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138906it.BI6(X.69L):X.6Au");
    }

    public void BKk(C128086Au r3) {
        AnonymousClass6Q8 r1 = this.A00;
        r1.A05();
        r1.A06();
        try {
            this.A03.A04(r3);
            r1.A07();
        } finally {
            AnonymousClass6Q8.A01(r1);
        }
    }

    public C138906it(AnonymousClass6Q8 r3) {
        this.A00 = r3;
        this.A03 = new C162537ok(r3, this, 2);
        this.A01 = new C162547ol(r3, this, 0);
        this.A02 = new C162547ol(r3, this, 1);
    }
}
