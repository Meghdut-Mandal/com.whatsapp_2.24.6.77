package X;

/* renamed from: X.1TX  reason: invalid class name */
public final class AnonymousClass1TX {
    public final AnonymousClass163 A00;
    public final C219712j A01;
    public final AnonymousClass12P A02;

    public AnonymousClass1TX(AnonymousClass163 r2, C219712j r3, AnonymousClass12P r4) {
        AnonymousClass00C.A0D(r3, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0053, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass2bP r7) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.12P r0 = r6.A02
            X.1M0 r4 = r0.A05()
            long r0 = r7.A1N     // Catch:{ all -> 0x004d }
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x004d }
            r5.<init>()     // Catch:{ all -> 0x004d }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "message_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x004d }
            X.1Uw r1 = r7.A01     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x002d
            X.12j r0 = r6.A01     // Catch:{ all -> 0x004d }
            long r0 = r0.A07(r1)     // Catch:{ all -> 0x004d }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "newsletter_jid_row_id"
            r5.put(r0, r1)     // Catch:{ all -> 0x004d }
        L_0x002d:
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "newsletter_name"
            r5.put(r0, r1)     // Catch:{ all -> 0x004d }
            long r0 = r7.A00     // Catch:{ all -> 0x004d }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x004d }
            java.lang.String r0 = "expiration"
            r5.put(r0, r1)     // Catch:{ all -> 0x004d }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "message_newsletter_admin_invite"
            r1 = 5
            java.lang.String r0 = "INSERT_NEWSLETTER_ADMIN_INVITE_MESSAGE_SQL"
            r3.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x004d }
            r4.close()
            return
        L_0x004d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004f }
        L_0x004f:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1TX.A00(X.2bP):void");
    }
}
