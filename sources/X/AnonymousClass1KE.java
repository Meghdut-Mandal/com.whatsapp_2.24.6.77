package X;

/* renamed from: X.1KE  reason: invalid class name */
public final class AnonymousClass1KE {
    public final AnonymousClass12P A00;
    public final C25681Hg A01;

    public AnonymousClass1KE(C25681Hg r2, AnonymousClass12P r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0069, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x006d, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0070, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass2LZ A00(X.C65073Qp r9) {
        /*
            r8 = this;
            r7 = 0
            boolean r0 = r9 instanceof X.AnonymousClass2LZ
            if (r0 == 0) goto L_0x0008
            X.2LZ r9 = (X.AnonymousClass2LZ) r9
            return r9
        L_0x0008:
            X.11F r0 = r9.A06()
            boolean r0 = X.C197029b1.A00(r0)
            r6 = 0
            if (r0 == 0) goto L_0x0071
            X.1Hg r0 = r8.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0071
            X.12P r0 = r8.A00
            X.1M0 r3 = r0.get()
            X.14e r5 = r3.A02     // Catch:{ all -> 0x006a }
            java.lang.String r4 = "SELECT pip_enabled FROM bot_chat_info WHERE chat_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x006a }
            java.lang.Long r0 = r9.A07()     // Catch:{ all -> 0x006a }
            long r0 = r0.longValue()     // Catch:{ all -> 0x006a }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x006a }
            r2[r7] = r0     // Catch:{ all -> 0x006a }
            java.lang.String r0 = "BonsaiChatInfoStore/GET_CHAT_INFO"
            android.database.Cursor r2 = r5.A09(r4, r0, r2)     // Catch:{ all -> 0x006a }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0063 }
            if (r0 != 0) goto L_0x004b
            monitor-enter(r9)     // Catch:{ all -> 0x0063 }
            monitor-exit(r9)     // Catch:{ all -> 0x0063 }
            r2.close()     // Catch:{ all -> 0x006a }
            r3.close()
            return r6
        L_0x004b:
            monitor-enter(r9)     // Catch:{ all -> 0x0063 }
            monitor-exit(r9)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "pip_enabled"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0063 }
            boolean r1 = X.C54282sh.A00(r2, r0)     // Catch:{ all -> 0x0063 }
            X.2LZ r0 = new X.2LZ     // Catch:{ all -> 0x0063 }
            r0.<init>(r9, r1)     // Catch:{ all -> 0x0063 }
            r2.close()     // Catch:{ all -> 0x006a }
            r3.close()
            return r0
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x006a }
            throw r0     // Catch:{ all -> 0x006a }
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        L_0x0071:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1KE.A00(X.3Qp):X.2LZ");
    }
}
