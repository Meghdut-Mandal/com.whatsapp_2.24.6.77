package X;

/* renamed from: X.7LA  reason: invalid class name */
public final class AnonymousClass7LA extends AnonymousClass00R implements AnonymousClass00S {
    public final /* synthetic */ AnonymousClass66L this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7LA(AnonymousClass66L r2) {
        super(0);
        this.this$0 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003f, code lost:
        if (r6.length() == 0) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bd, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00cc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00d0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00d3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00d4, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke() {
        /*
            r15 = this;
            java.lang.String r0 = "[XFAM] StatusCrosspostUnsentSessionManager/initializing unsentCrosspostStatusSessionCache lazily"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.66L r0 = r15.this$0
            X.6Tl r0 = r0.A00
            java.util.LinkedHashMap r9 = X.C36431kI.A1G()
            X.12P r10 = r0.A00
            X.1M0 r2 = r10.get()
            X.14e r4 = r2.A02     // Catch:{ all -> 0x00d1 }
            java.lang.String r3 = "SELECT status_message_row_id, crossposting_session_id FROM status_crossposting WHERE state IN (1,7)"
            java.lang.String r1 = "XFamilyStatusCrosspostingStore/SELECT_UNSENT_CROSSPOST"
            r0 = 0
            android.database.Cursor r3 = r4.A09(r3, r1, r0)     // Catch:{ all -> 0x00d1 }
            java.lang.String r0 = "status_message_row_id"
            int r8 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "crossposting_session_id"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00ca }
        L_0x002a:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00ca }
            if (r0 == 0) goto L_0x00be
            long r4 = r3.getLong(r8)     // Catch:{ all -> 0x00ca }
            java.lang.String r6 = r3.getString(r7)     // Catch:{ all -> 0x00ca }
            if (r6 == 0) goto L_0x0041
            int r1 = r6.length()     // Catch:{ all -> 0x00ca }
            r0 = 0
            if (r1 != 0) goto L_0x0042
        L_0x0041:
            r0 = 1
        L_0x0042:
            if (r0 == 0) goto L_0x009e
            java.lang.StringBuilder r11 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00ca }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore//found empty session id during offline retry, record detail: "
            r11.append(r0)     // Catch:{ all -> 0x00ca }
            X.1M0 r6 = r10.get()     // Catch:{ all -> 0x00ca }
            X.14e r13 = r6.A02     // Catch:{ all -> 0x00b7 }
            r1 = 1
            java.lang.StringBuilder r12 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "SELECT * FROM status_crossposting WHERE status_message_row_id IN ("
            r12.append(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "?"
            java.util.List r14 = java.util.Collections.nCopies(r1, r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = ","
            java.lang.String r0 = android.text.TextUtils.join(r0, r14)     // Catch:{ all -> 0x00b7 }
            r12.append(r0)     // Catch:{ all -> 0x00b7 }
            java.lang.String r12 = X.C90474aD.A0f(r12)     // Catch:{ all -> 0x00b7 }
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ all -> 0x00b7 }
            r0 = 0
            X.C36351kA.A1V(r1, r0, r4)     // Catch:{ all -> 0x00b7 }
            java.lang.String r0 = "XFamilyStatusCrosspostingStore/GET_CROSSPOSTING_DATA_BY_MESSAGE_ROW_IDS"
            android.database.Cursor r5 = r13.A09(r12, r0, r1)     // Catch:{ all -> 0x00b7 }
            r4 = 0
            r1 = r4
        L_0x007e:
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0089
            X.6Cs r1 = X.C132396Tl.A00(r5)     // Catch:{ all -> 0x00b0 }
            goto L_0x007e
        L_0x0089:
            r5.close()     // Catch:{ all -> 0x00b7 }
            r6.close()     // Catch:{ all -> 0x00ca }
            if (r1 == 0) goto L_0x0095
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x00ca }
        L_0x0095:
            java.lang.String r1 = X.AnonymousClass000.A0q(r4, r11)     // Catch:{ all -> 0x00ca }
            r0 = 0
            X.C18740tg.A0D(r0, r1)     // Catch:{ all -> 0x00ca }
            goto L_0x002a
        L_0x009e:
            X.AnonymousClass00C.A0B(r6)     // Catch:{ all -> 0x00ca }
            java.lang.Object r1 = X.C36391kE.A0s(r6, r9)     // Catch:{ all -> 0x00ca }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x00ca }
            java.lang.Long r0 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x00ca }
            r1.add(r0)     // Catch:{ all -> 0x00ca }
            goto L_0x002a
        L_0x00b0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b2 }
        L_0x00b2:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00b7 }
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x00b7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b9 }
        L_0x00b9:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x00ca }
            throw r0     // Catch:{ all -> 0x00ca }
        L_0x00be:
            r3.close()     // Catch:{ all -> 0x00d1 }
            r2.close()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>(r9)
            return r0
        L_0x00ca:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x00d1 }
            throw r0     // Catch:{ all -> 0x00d1 }
        L_0x00d1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d3 }
        L_0x00d3:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7LA.invoke():java.lang.Object");
    }
}
