package X;

/* renamed from: X.1FA  reason: invalid class name */
public final class AnonymousClass1FA {
    public final AnonymousClass1FB A00;
    public final AnonymousClass1FC A01;
    public final AnonymousClass16J A02;
    public final AnonymousClass1F4 A03;
    public final AnonymousClass005 A04;

    public AnonymousClass1FA(AnonymousClass1FB r2, AnonymousClass1FC r3, AnonymousClass16J r4, AnonymousClass1F4 r5, AnonymousClass005 r6) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r5, 5);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = r6;
        this.A03 = r5;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0065, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0066, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0069, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C106265Iz r7) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.1FB r1 = r6.A00
            X.3Kh r0 = r7.A01
            java.lang.Object r3 = r0.A00
            X.72O r3 = (X.AnonymousClass72O) r3
            if (r3 != 0) goto L_0x0014
            java.lang.String r0 = "MessageCallLogStore/insertOrUpdateMessageCallLog call log is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0014:
            X.12P r0 = r1.A00
            X.1M0 r5 = r0.A05()
            r0 = 2
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x0063 }
            r4.<init>(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "message_row_id"
            long r0 = r7.A1N     // Catch:{ all -> 0x0063 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0063 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "call_log_row_id"
            long r0 = r3.A02()     // Catch:{ all -> 0x0063 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0063 }
            r4.put(r2, r0)     // Catch:{ all -> 0x0063 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x0063 }
            java.lang.String r2 = "message_call_log"
            r1 = 5
            java.lang.String r0 = "INSERT_OR_UPDATE_CALL_LOG_MESSAGE"
            long r3 = r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x0063 }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x005f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0063 }
            r2.<init>()     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = "MessageCallLogStore/insertOrUpdateMessageCallLog/insert error, rowId="
            r2.append(r0)     // Catch:{ all -> 0x0063 }
            long r0 = r7.A1N     // Catch:{ all -> 0x0063 }
            r2.append(r0)     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0063 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0063 }
        L_0x005f:
            r5.close()
            return
        L_0x0063:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1FA.A00(X.5Iz):void");
    }
}
