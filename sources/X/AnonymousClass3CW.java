package X;

/* renamed from: X.3CW  reason: invalid class name */
public final class AnonymousClass3CW {
    public final AnonymousClass12P A00;

    public AnonymousClass3CW(AnonymousClass12P r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003b, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C62673Hb A00(long r6) {
        /*
            r5 = this;
            X.12P r0 = r5.A00
            X.1M0 r4 = r0.get()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0038 }
            java.lang.String r2 = "SELECT show_mm_disclosure FROM data_sharing_disclosure_metadata WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C36341k9.A1b(r6)     // Catch:{ all -> 0x0038 }
            java.lang.String r0 = "GET_DATA_SHARING_DISCLOSURE_METADATA_FOR_MSG_ROW_ID_SQL"
            android.database.Cursor r2 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x0038 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0031 }
            r1 = 0
            if (r0 == 0) goto L_0x002a
            java.lang.String r0 = "show_mm_disclosure"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0031 }
            boolean r0 = X.C54282sh.A00(r2, r0)     // Catch:{ all -> 0x0031 }
            X.3Hb r1 = new X.3Hb     // Catch:{ all -> 0x0031 }
            r1.<init>(r0)     // Catch:{ all -> 0x0031 }
        L_0x002a:
            r2.close()     // Catch:{ all -> 0x0038 }
            r4.close()
            return r1
        L_0x0031:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0033 }
        L_0x0033:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0038 }
            throw r0     // Catch:{ all -> 0x0038 }
        L_0x0038:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CW.A00(long):X.3Hb");
    }
}
