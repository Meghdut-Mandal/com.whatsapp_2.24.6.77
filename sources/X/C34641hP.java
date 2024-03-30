package X;

/* renamed from: X.1hP  reason: invalid class name and case insensitive filesystem */
public final class C34641hP {
    public final C34651hQ A00;

    public C34641hP(C34651hQ r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00() {
        /*
            r6 = this;
            X.1hQ r4 = r6.A00
            r3 = 0
            X.12P r0 = r4.A02     // Catch:{ all -> 0x0031 }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x0031 }
            X.14e r2 = r5.A02     // Catch:{ all -> 0x002a }
            java.lang.String r1 = "SELECT _id, jid_row_id, favorite_type, sort_order FROM favorite ORDER BY sort_order ASC"
            java.lang.String r0 = "FavoriteStore/FAVORITE_GET_ALL_FAVORITES"
            android.database.Cursor r2 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x002a }
            X.AnonymousClass00C.A0B(r2)     // Catch:{ all -> 0x0023 }
            java.util.ArrayList r0 = X.C34651hQ.A01(r2, r4)     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x001f
            r2.close()     // Catch:{ all -> 0x002a }
        L_0x001f:
            r5.close()     // Catch:{ all -> 0x0031 }
            return r0
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x002a }
            throw r0     // Catch:{ all -> 0x002a }
        L_0x002a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x002c }
        L_0x002c:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0031 }
            throw r0     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
            java.lang.Throwable r2 = r0.exception
            if (r2 == 0) goto L_0x0047
            java.lang.String r0 = "FavoriteStore/getAllFavorites failed to retrieve all favorites"
            com.whatsapp.util.Log.e(r0, r2)
            X.0wN r1 = r4.A00
            java.lang.String r0 = "FavoriteStore/getAllFavorites"
            r1.A0D(r0, r3, r2)
        L_0x0047:
            X.09w r0 = X.C023409w.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C34641hP.A00():java.util.List");
    }
}
