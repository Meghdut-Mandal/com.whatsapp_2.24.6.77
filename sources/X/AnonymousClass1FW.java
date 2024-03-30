package X;

/* renamed from: X.1FW  reason: invalid class name */
public final class AnonymousClass1FW {
    public final AnonymousClass12P A00;

    public AnonymousClass1FW(AnonymousClass12P r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x003f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0042, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0046, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(long r7) {
        /*
            r6 = this;
            X.12P r0 = r6.A00
            X.1M0 r3 = r0.get()
            X.14e r5 = r3.A02     // Catch:{ all -> 0x0040 }
            java.lang.String r4 = "SELECT pn_requested_ts FROM lid_chat_state WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0040 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0040 }
            r2[r1] = r0     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "LidChatStateStore/GET_PN_REQUESTED_TS"
            android.database.Cursor r2 = r5.A09(r4, r0, r2)     // Catch:{ all -> 0x0040 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x0040 }
            java.lang.String r0 = "pn_requested_ts"
            int r1 = r2.getColumnIndex(r0)     // Catch:{ all -> 0x0039 }
            if (r1 < 0) goto L_0x0030
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0030
            long r0 = r2.getLong(r1)     // Catch:{ all -> 0x0039 }
            goto L_0x0032
        L_0x0030:
            r0 = 0
        L_0x0032:
            r2.close()     // Catch:{ all -> 0x0040 }
            r3.close()
            return r0
        L_0x0039:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003b }
        L_0x003b:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0040 }
            throw r0     // Catch:{ all -> 0x0040 }
        L_0x0040:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FW.A00(long):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x004b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004c, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x004f, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean A01(long r7) {
        /*
            r6 = this;
            X.12P r0 = r6.A00
            X.1M0 r4 = r0.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x0049 }
            java.lang.String r3 = "SELECT is_pn_shared FROM lid_chat_state WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0049 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0049 }
            r2[r1] = r0     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "LidChatStateStore/GET_PN_SHARED_BY_JID"
            android.database.Cursor r3 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x0049 }
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "is_pn_shared"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0042 }
            r2 = 0
            if (r1 < 0) goto L_0x003b
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x0042 }
            if (r0 == 0) goto L_0x003b
            int r1 = r3.getInt(r1)     // Catch:{ all -> 0x0042 }
            r0 = 0
            if (r1 == 0) goto L_0x0037
            r0 = 1
            if (r1 == r0) goto L_0x0037
            goto L_0x003b
        L_0x0037:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x0042 }
        L_0x003b:
            r3.close()     // Catch:{ all -> 0x0049 }
            r4.close()
            return r2
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0049 }
            throw r0     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FW.A01(long):java.lang.Boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0044, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0045, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0048, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(long r7) {
        /*
            r6 = this;
            X.12P r0 = r6.A00
            X.1M0 r4 = r0.get()
            X.14e r5 = r4.A02     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "SELECT pnh_duplicate_lid_thread FROM lid_chat_state WHERE jid_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0042 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0042 }
            r2[r1] = r0     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "LidChatStateStore/GET_LID_DUPLICATE_FLAG"
            android.database.Cursor r3 = r5.A09(r3, r0, r2)     // Catch:{ all -> 0x0042 }
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x0042 }
            java.lang.String r0 = "pnh_duplicate_lid_thread"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x003b }
            r2 = 0
            if (r1 < 0) goto L_0x0034
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x003b }
            if (r0 == 0) goto L_0x0034
            int r1 = r3.getInt(r1)     // Catch:{ all -> 0x003b }
            r0 = 1
            if (r1 != r0) goto L_0x0034
            r2 = 1
        L_0x0034:
            r3.close()     // Catch:{ all -> 0x0042 }
            r4.close()
            return r2
        L_0x003b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0042 }
            throw r0     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FW.A02(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004a, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(long r8, long r10) {
        /*
            r7 = this;
            X.12P r0 = r7.A00     // Catch:{ all -> 0x004b }
            X.1M0 r5 = r0.A05()     // Catch:{ all -> 0x004b }
            X.AnonymousClass00C.A0B(r5)     // Catch:{ all -> 0x0044 }
            X.71s r6 = r5.B1k()     // Catch:{ all -> 0x0044 }
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x003d }
            r4.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x003d }
            r4.put(r1, r0)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "pn_requested_ts"
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ all -> 0x003d }
            r4.put(r1, r0)     // Catch:{ all -> 0x003d }
            java.lang.String r3 = "LidChatStateStore/SET_PN_REQUESTED_TS"
            X.14e r2 = r5.A02     // Catch:{ all -> 0x003d }
            java.lang.String r1 = "lid_chat_state"
            r0 = 5
            r2.A08(r1, r3, r4, r0)     // Catch:{ all -> 0x003d }
            r6.A00()     // Catch:{ all -> 0x003d }
            r6.close()     // Catch:{ all -> 0x0044 }
            r0 = 1
            r5.close()     // Catch:{ all -> 0x004b }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x004b }
            goto L_0x0051
        L_0x003d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003f }
        L_0x003f:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x0044 }
            throw r0     // Catch:{ all -> 0x0044 }
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x004b }
            throw r0     // Catch:{ all -> 0x004b }
        L_0x004b:
            r0 = move-exception
            X.03N r2 = new X.03N
            r2.<init>(r0)
        L_0x0051:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r2)
            if (r1 == 0) goto L_0x005c
            java.lang.String r0 = "{LidChatStateStore/}failed to set phone requested time"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x005c:
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r2 instanceof X.AnonymousClass03N
            if (r0 == 0) goto L_0x0066
            r2 = r1
        L_0x0066:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r0 = r2.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FW.A03(long, long):boolean");
    }
}
