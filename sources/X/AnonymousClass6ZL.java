package X;

import android.database.DatabaseErrorHandler;

/* renamed from: X.6ZL  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6ZL implements DatabaseErrorHandler {
    public final /* synthetic */ C130666Ly A00;
    public final /* synthetic */ C114455hH A01;

    public /* synthetic */ AnonymousClass6ZL(C130666Ly r1, C114455hH r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005b, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005c, code lost:
        if (r0 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005e, code lost:
        r1 = r0.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r1.hasNext() != false) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0068, code lost:
        r0 = ((android.util.Pair) r1.next()).second;
        X.AnonymousClass00C.A07(r0);
        X.C130666Ly.A01((java.lang.String) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0079, code lost:
        r0 = r1.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007d, code lost:
        if (r0 != null) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007f, code lost:
        X.C130666Ly.A01(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0082, code lost:
        throw r2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005b A[ExcHandler: all (r2v1 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r0 
      PHI: (r0v7 java.util.List) = (r0v6 java.util.List), (r0v14 java.util.List), (r0v14 java.util.List) binds: [B:7:0x0039, B:9:0x003b, B:10:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:7:0x0039] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            X.5hH r1 = r3.A01
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            if (r4 != 0) goto L_0x0015
            java.lang.String r0 = "LOAD_PARAM"
            X.AnonymousClass00C.A0F(r0)
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r0 = "Redex: Unreachable code after no-return invoke"
            r1.<init>(r0)
            throw r1
        L_0x0015:
            X.6iP r2 = X.C109375Xi.A00(r4, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Corruption reported by sqlite on database: "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ".path"
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)
            java.lang.String r0 = "SupportSQLite"
            android.util.Log.e(r0, r1)
            android.database.sqlite.SQLiteDatabase r1 = r2.A00
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L_0x0083
            r0 = 0
            java.util.List r0 = r2.A01     // Catch:{ SQLiteException -> 0x003b, all -> 0x005b }
        L_0x003b:
            r2.close()     // Catch:{ IOException -> 0x003e, all -> 0x005b }
        L_0x003e:
            if (r0 == 0) goto L_0x0083
            java.util.Iterator r1 = r0.iterator()
        L_0x0044:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.AnonymousClass00C.A07(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.C130666Ly.A01(r0)
            goto L_0x0044
        L_0x005b:
            r2 = move-exception
            if (r0 == 0) goto L_0x0079
            java.util.Iterator r1 = r0.iterator()
        L_0x0062:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r1.next()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            X.AnonymousClass00C.A07(r0)
            java.lang.String r0 = (java.lang.String) r0
            X.C130666Ly.A01(r0)
            goto L_0x0062
        L_0x0079:
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x0082
            X.C130666Ly.A01(r0)
        L_0x0082:
            throw r2
        L_0x0083:
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L_0x008c
            X.C130666Ly.A01(r0)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6ZL.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
