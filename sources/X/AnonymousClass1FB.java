package X;

/* renamed from: X.1FB  reason: invalid class name */
public final class AnonymousClass1FB {
    public final AnonymousClass12P A00;

    public AnonymousClass1FB(AnonymousClass12P r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0054, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0055, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0058, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(X.C106265Iz r8) {
        /*
            r7 = this;
            r6 = 0
            X.AnonymousClass00C.A0D(r8, r6)
            X.12P r0 = r7.A00
            X.1M0 r4 = r0.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x0052 }
            java.lang.String r3 = "SELECT call_log_row_id FROM message_call_log WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0052 }
            long r0 = r8.A1N     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0052 }
            r2[r6] = r0     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = "GET_CALL_LOG_MESSAGE_BY_ROW_ID"
            android.database.Cursor r5 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x0052 }
            boolean r0 = r5.moveToLast()     // Catch:{ all -> 0x004b }
            r2 = -1
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "call_log_row_id"
            int r1 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x004b }
            boolean r0 = r5.isNull(r1)     // Catch:{ all -> 0x004b }
            if (r0 == 0) goto L_0x0039
            java.lang.String r0 = "MessageCallLogStore/getCallLogRowId callLogRowId is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x004b }
            goto L_0x0044
        L_0x0039:
            long r0 = r5.getLong(r1)     // Catch:{ all -> 0x004b }
            r5.close()     // Catch:{ all -> 0x0052 }
            r4.close()
            return r0
        L_0x0044:
            r5.close()     // Catch:{ all -> 0x0052 }
            r4.close()
            return r2
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0052 }
            throw r0     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0054 }
        L_0x0054:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FB.A00(X.5Iz):long");
    }
}
