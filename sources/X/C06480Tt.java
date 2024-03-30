package X;

/* renamed from: X.0Tt  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C06480Tt {
    public final /* synthetic */ AnonymousClass0WW A00;
    public final /* synthetic */ String A01;

    public /* synthetic */ C06480Tt(AnonymousClass0WW r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0071, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0073, code lost:
        r2 = r7.query(X.AnonymousClass0WD.A02, (java.lang.String[]) null, (java.lang.String) null, new java.lang.String[]{r3}, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007f, code lost:
        if (r2 == null) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0085, code lost:
        if (r2.moveToFirst() != false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0087, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r4 != X.AnonymousClass0WD.A00) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008c, code lost:
        X.AnonymousClass0WD.A01.put(r3, (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0091, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0093, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r1 = r2.getString(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x009a, code lost:
        if (r1 == null) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        if (r1.equals((java.lang.Object) null) == false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a2, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a3, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00a6, code lost:
        if (r4 != X.AnonymousClass0WD.A00) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        X.AnonymousClass0WD.A01.put(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00ad, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ae, code lost:
        if (r1 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00b0, code lost:
        r5 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00b4, code lost:
        return r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00b5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b8, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00b9, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00bc, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00bd, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00() {
        /*
            r13 = this;
            X.0WW r0 = r13.A00
            java.lang.String r3 = r13.A01
            android.content.Context r0 = r0.A00
            android.content.ContentResolver r7 = r0.getContentResolver()
            r9 = 0
            java.lang.Class<X.0WD> r6 = X.AnonymousClass0WD.class
            monitor-enter(r6)
            java.util.HashMap r0 = X.AnonymousClass0WD.A01     // Catch:{ all -> 0x00be }
            r1 = 1
            r2 = 0
            r5 = 0
            if (r0 != 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicBoolean r0 = X.AnonymousClass0WD.A08     // Catch:{ all -> 0x00be }
            r0.set(r2)     // Catch:{ all -> 0x00be }
            java.util.HashMap r0 = X.AnonymousClass001.A0J()     // Catch:{ all -> 0x00be }
            X.AnonymousClass0WD.A01 = r0     // Catch:{ all -> 0x00be }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00be }
            r0.<init>()     // Catch:{ all -> 0x00be }
            X.AnonymousClass0WD.A00 = r0     // Catch:{ all -> 0x00be }
            android.net.Uri r4 = X.AnonymousClass0WD.A02     // Catch:{ all -> 0x00be }
            X.0De r0 = new X.0De     // Catch:{ all -> 0x00be }
            r0.<init>()     // Catch:{ all -> 0x00be }
            r7.registerContentObserver(r4, r1, r0)     // Catch:{ all -> 0x00be }
        L_0x0031:
            java.lang.Object r4 = X.AnonymousClass0WD.A00     // Catch:{ all -> 0x00be }
            java.util.HashMap r0 = X.AnonymousClass0WD.A01     // Catch:{ all -> 0x00be }
            boolean r0 = r0.containsKey(r3)     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0072
            java.util.HashMap r0 = X.AnonymousClass0WD.A01     // Catch:{ all -> 0x00be }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ all -> 0x00be }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0070
            goto L_0x006f
        L_0x0046:
            java.util.concurrent.atomic.AtomicBoolean r0 = X.AnonymousClass0WD.A08     // Catch:{ all -> 0x00be }
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x00be }
            if (r0 == 0) goto L_0x0031
            java.util.HashMap r0 = X.AnonymousClass0WD.A01     // Catch:{ all -> 0x00be }
            r0.clear()     // Catch:{ all -> 0x00be }
            java.util.HashMap r0 = X.AnonymousClass0WD.A04     // Catch:{ all -> 0x00be }
            r0.clear()     // Catch:{ all -> 0x00be }
            java.util.HashMap r0 = X.AnonymousClass0WD.A05     // Catch:{ all -> 0x00be }
            r0.clear()     // Catch:{ all -> 0x00be }
            java.util.HashMap r0 = X.AnonymousClass0WD.A06     // Catch:{ all -> 0x00be }
            r0.clear()     // Catch:{ all -> 0x00be }
            java.util.HashMap r0 = X.AnonymousClass0WD.A07     // Catch:{ all -> 0x00be }
            r0.clear()     // Catch:{ all -> 0x00be }
            java.lang.Object r0 = new java.lang.Object     // Catch:{ all -> 0x00be }
            r0.<init>()     // Catch:{ all -> 0x00be }
            X.AnonymousClass0WD.A00 = r0     // Catch:{ all -> 0x00be }
            goto L_0x0031
        L_0x006f:
            r5 = r0
        L_0x0070:
            monitor-exit(r6)     // Catch:{ all -> 0x00be }
            return r5
        L_0x0072:
            monitor-exit(r6)     // Catch:{ all -> 0x00be }
            android.net.Uri r8 = X.AnonymousClass0WD.A02
            java.lang.String[] r11 = new java.lang.String[r1]
            r11[r2] = r3
            r12 = r9
            r10 = r9
            android.database.Cursor r2 = r7.query(r8, r9, r10, r11, r12)
            if (r2 == 0) goto L_0x00bd
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x0096
            monitor-enter(r6)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = X.AnonymousClass0WD.A00     // Catch:{ all -> 0x0093 }
            if (r4 != r0) goto L_0x0091
            java.util.HashMap r0 = X.AnonymousClass0WD.A01     // Catch:{ all -> 0x0093 }
            r0.put(r3, r9)     // Catch:{ all -> 0x0093 }
        L_0x0091:
            monitor-exit(r6)     // Catch:{ all -> 0x0093 }
            goto L_0x00b1
        L_0x0093:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0093 }
            goto L_0x00b7
        L_0x0096:
            java.lang.String r1 = r2.getString(r1)     // Catch:{ all -> 0x00b8 }
            if (r1 == 0) goto L_0x00a3
            boolean r0 = r1.equals(r9)     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00a3
            r1 = r9
        L_0x00a3:
            monitor-enter(r6)     // Catch:{ all -> 0x00b8 }
            java.lang.Object r0 = X.AnonymousClass0WD.A00     // Catch:{ all -> 0x00b5 }
            if (r4 != r0) goto L_0x00ad
            java.util.HashMap r0 = X.AnonymousClass0WD.A01     // Catch:{ all -> 0x00b5 }
            r0.put(r3, r1)     // Catch:{ all -> 0x00b5 }
        L_0x00ad:
            monitor-exit(r6)     // Catch:{ all -> 0x00b5 }
            if (r1 == 0) goto L_0x00b1
            r5 = r1
        L_0x00b1:
            r2.close()
            return r5
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00b5 }
        L_0x00b7:
            throw r0     // Catch:{ all -> 0x00b8 }
        L_0x00b8:
            r0 = move-exception
            r2.close()
            throw r0
        L_0x00bd:
            return r5
        L_0x00be:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00be }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06480Tt.A00():java.lang.String");
    }
}
