package X;

/* renamed from: X.1Xi  reason: invalid class name and case insensitive filesystem */
public final class C29621Xi {
    public final AnonymousClass12P A00;
    public final C20810yC A01;

    public C29621Xi(AnonymousClass12P r2, C20810yC r3) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0073, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x007a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass3T1 r8) {
        /*
            r7 = this;
            r6 = 0
            X.0yC r2 = r7.A01
            r1 = 5718(0x1656, float:8.013E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x008c
            X.12P r0 = r7.A00     // Catch:{ all -> 0x007b }
            X.1M0 r3 = r0.get()     // Catch:{ all -> 0x007b }
            X.14e r5 = r3.A02     // Catch:{ all -> 0x0074 }
            java.lang.String r4 = "SELECT reporting_tag, reporting_token_content, version FROM reporting_token WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0074 }
            long r0 = r8.A1N     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0074 }
            r2[r6] = r0     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "GET_REPORTING_TOKEN_INFO"
            android.database.Cursor r4 = r5.A09(r4, r0, r2)     // Catch:{ all -> 0x0074 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x006d }
            r6 = 0
            if (r0 == 0) goto L_0x0064
            java.lang.String r0 = "reporting_token_content"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006d }
            byte[] r5 = r4.getBlob(r0)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "reporting_tag"
            int r0 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006d }
            byte[] r2 = r4.getBlob(r0)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "version"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006d }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x006d }
            if (r0 != 0) goto L_0x0057
            int r0 = r4.getInt(r1)     // Catch:{ all -> 0x006d }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x006d }
        L_0x0057:
            if (r2 == 0) goto L_0x0064
            int r0 = r2.length     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x0064
            X.9WK r0 = new X.9WK     // Catch:{ all -> 0x006d }
            r0.<init>(r6, r2, r5)     // Catch:{ all -> 0x006d }
            r8.A0y(r0)     // Catch:{ all -> 0x006d }
        L_0x0064:
            X.0AJ r1 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x006d }
            r4.close()     // Catch:{ all -> 0x0074 }
            r3.close()     // Catch:{ all -> 0x007b }
            goto L_0x0081
        L_0x006d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x0074 }
            throw r0     // Catch:{ all -> 0x0074 }
        L_0x0074:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x007b }
            throw r0     // Catch:{ all -> 0x007b }
        L_0x007b:
            r0 = move-exception
            X.03N r1 = new X.03N
            r1.<init>(r0)
        L_0x0081:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r1)
            if (r1 == 0) goto L_0x008c
            java.lang.String r0 = "ReportingTokenStore/failed to retrieve message reporting token data"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29621Xi.A01(X.3T1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0056, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass3T1 r7) {
        /*
            r6 = this;
            X.0yC r2 = r6.A01
            r1 = 5718(0x1656, float:8.013E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x006a
            X.9WK r3 = r7.A0Z
            if (r3 == 0) goto L_0x006a
            X.12P r0 = r6.A00     // Catch:{ all -> 0x005b }
            X.1M0 r4 = r0.A05()     // Catch:{ all -> 0x005b }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0054 }
            r5.<init>()     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "message_row_id"
            long r0 = r7.A1N     // Catch:{ all -> 0x0054 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0054 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "version"
            java.lang.Integer r0 = r3.A00     // Catch:{ all -> 0x0054 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "reporting_token_content"
            byte[] r0 = r3.A02     // Catch:{ all -> 0x0054 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r1 = "reporting_tag"
            byte[] r0 = r3.A01     // Catch:{ all -> 0x0054 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "timestamp"
            long r0 = r7.A0I     // Catch:{ all -> 0x0054 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0054 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0054 }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x0054 }
            java.lang.String r2 = "reporting_token"
            r1 = 3
            java.lang.String r0 = "ReportingTokenStore/insertMessage"
            r3.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x0054 }
            r4.close()     // Catch:{ all -> 0x005b }
            return
        L_0x0054:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0056 }
        L_0x0056:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x005b }
            throw r0     // Catch:{ all -> 0x005b }
        L_0x005b:
            r1 = move-exception
            X.03N r0 = new X.03N
            r0.<init>(r1)
            java.lang.Throwable r1 = r0.exception
            if (r1 == 0) goto L_0x006a
            java.lang.String r0 = "ReportingTokenStore/failed to insert message reporting token data"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29621Xi.A00(X.3T1):void");
    }
}
