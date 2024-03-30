package X;

/* renamed from: X.3Fg  reason: invalid class name and case insensitive filesystem */
public class C62223Fg {
    public final AnonymousClass1VE A00;

    public synchronized boolean A00(String str, String str2) {
        boolean z;
        AnonymousClass1VE r2 = this.A00;
        String A0t = C36371kC.A0t(AnonymousClass1VE.A00(r2), AnonymousClass1VE.A01(str, "auth/token"));
        if (A0t == null) {
            z = false;
        } else {
            z = A0t.equals(str2);
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0020, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean A01(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            r3 = 0
            if (r6 == 0) goto L_0x001f
            X.1VE r2 = r4.A00     // Catch:{ all -> 0x001c }
            java.lang.String r0 = "request/token"
            java.lang.String r1 = X.AnonymousClass1VE.A01(r5, r0)     // Catch:{ all -> 0x001c }
            android.content.SharedPreferences r0 = X.AnonymousClass1VE.A00(r2)     // Catch:{ all -> 0x001c }
            java.lang.String r0 = X.C36371kC.A0t(r0, r1)     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001f
            boolean r0 = r6.equals(r0)     // Catch:{ all -> 0x001c }
            monitor-exit(r4)
            return r0
        L_0x001c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x001f:
            monitor-exit(r4)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62223Fg.A01(java.lang.String, java.lang.String):boolean");
    }

    public C62223Fg(AnonymousClass1VE r1) {
        this.A00 = r1;
    }
}
