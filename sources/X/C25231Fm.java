package X;

/* renamed from: X.1Fm  reason: invalid class name and case insensitive filesystem */
public final class C25231Fm {
    public final AnonymousClass163 A00;
    public final AnonymousClass12P A01;

    public C25231Fm(AnonymousClass163 r2, AnonymousClass12P r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0042, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0045, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C65073Qp r7) {
        /*
            r6 = this;
            X.3Id r2 = r7.A0a
            if (r2 == 0) goto L_0x0049
            android.content.ContentValues r5 = new android.content.ContentValues
            r5.<init>()
            int r0 = r2.A00
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "ephemeral_trigger"
            r5.put(r0, r1)
            java.lang.Boolean r1 = r2.A01
            if (r1 == 0) goto L_0x001d
            java.lang.String r0 = "ephemeral_initiated_by_me"
            r5.put(r0, r1)
        L_0x001d:
            X.163 r1 = r6.A00
            X.11F r0 = r7.A0q
            long r0 = r1.A08(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "chat_row_id"
            r5.put(r0, r1)
            X.12P r0 = r6.A01
            X.1M0 r4 = r0.A05()
            X.14e r3 = r4.A02     // Catch:{ all -> 0x003f }
            java.lang.String r2 = "chat_ephemeral"
            r1 = 5
            java.lang.String r0 = "INSERT_OR_UPDATE_EPEHEMERAL_CHATS_SQL"
            r3.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x003f }
            goto L_0x0046
        L_0x003f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x0046:
            r4.close()
        L_0x0049:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25231Fm.A00(X.3Qp):void");
    }
}
