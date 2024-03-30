package X;

/* renamed from: X.7LB  reason: invalid class name */
public final class AnonymousClass7LB extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass66M this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7LB(AnonymousClass66M r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r12.length() == 0) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0096, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a1, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r13 = this;
            java.lang.String r0 = "[WAFFLE] StatusCrosspostingUnsentSessionManager/initializing unsentCrosspostStatusSessionCache lazy"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.66M r0 = r13.this$0
            X.6VF r0 = r0.A00
            java.util.LinkedHashMap r7 = X.C36431kI.A1G()
            X.12P r0 = r0.A00
            X.1M0 r6 = r0.get()
            X.14e r3 = r6.A02     // Catch:{ all -> 0x009b }
            java.lang.String r2 = "SELECT status_message_row_id,crossposting_session_id, destination FROM status_crossposting_v3 WHERE state IN (1, 7)"
            java.lang.String r1 = "[WAFFLE] WaffleStatusCrosspostingStore/SELECT_UNSENT_CROSSPOST_UNSENT_SESSIONS"
            r0 = 0
            android.database.Cursor r8 = r3.A09(r2, r1, r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "status_message_row_id"
            int r10 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "crossposting_session_id"
            int r9 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0094 }
            java.lang.String r0 = "destination"
            int r5 = r8.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0094 }
        L_0x0030:
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x0094 }
            if (r0 == 0) goto L_0x007f
            long r2 = r8.getLong(r10)     // Catch:{ all -> 0x0094 }
            java.lang.String r12 = r8.getString(r9)     // Catch:{ all -> 0x0094 }
            int r11 = r8.getInt(r5)     // Catch:{ all -> 0x0094 }
            if (r12 == 0) goto L_0x004b
            int r1 = r12.length()     // Catch:{ all -> 0x0094 }
            r0 = 0
            if (r1 != 0) goto L_0x004c
        L_0x004b:
            r0 = 1
        L_0x004c:
            if (r0 == 0) goto L_0x0055
            java.lang.String r1 = "[WAFFLE] WaffleStatusCrosspostingStore//found empty session id during offline retry"
            r0 = 0
            X.C18740tg.A0D(r0, r1)     // Catch:{ all -> 0x0094 }
            goto L_0x0030
        L_0x0055:
            X.AnonymousClass00C.A0B(r12)     // Catch:{ all -> 0x0094 }
            java.lang.Object r4 = r7.get(r12)     // Catch:{ all -> 0x0094 }
            if (r4 != 0) goto L_0x006e
            java.util.LinkedHashSet r1 = X.C36441kJ.A17()     // Catch:{ all -> 0x0094 }
            java.util.HashSet r0 = X.C36441kJ.A16()     // Catch:{ all -> 0x0094 }
            X.6A9 r4 = new X.6A9     // Catch:{ all -> 0x0094 }
            r4.<init>(r1, r0)     // Catch:{ all -> 0x0094 }
            r7.put(r12, r4)     // Catch:{ all -> 0x0094 }
        L_0x006e:
            X.6A9 r4 = (X.AnonymousClass6A9) r4     // Catch:{ all -> 0x0094 }
            java.util.LinkedHashSet r0 = r4.A00     // Catch:{ all -> 0x0094 }
            X.C36391kE.A1W(r0, r2)     // Catch:{ all -> 0x0094 }
            java.util.Set r1 = r4.A01     // Catch:{ all -> 0x0094 }
            X.5Tq r0 = X.C110595av.A00(r11)     // Catch:{ all -> 0x0094 }
            r1.add(r0)     // Catch:{ all -> 0x0094 }
            goto L_0x0030
        L_0x007f:
            r8.close()     // Catch:{ all -> 0x009b }
            r6.close()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "[WAFFLE] StatusCrosspostingUnsentSessionManager/initializing result: "
            X.C36321k7.A1K(r7, r0, r1)
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r7)
            return r0
        L_0x0094:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x009b }
            throw r0     // Catch:{ all -> 0x009b }
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LB.invoke():java.lang.Object");
    }
}
