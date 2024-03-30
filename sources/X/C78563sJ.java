package X;

/* renamed from: X.3sJ  reason: invalid class name and case insensitive filesystem */
public final class C78563sJ implements C17810s4 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00cf, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00d0, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00d3, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmI(X.AnonymousClass3T1 r9, X.C52942qQ r10) {
        /*
            r8 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r9, r0)
            r1 = 1
            int r0 = r9.A0A
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x00f1
            X.005 r0 = r8.A01
            java.lang.Object r2 = r0.get()
            X.1TT r2 = (X.AnonymousClass1TT) r2
            long r0 = r9.A1N
            int r3 = r9.A06
            X.12P r2 = r2.A00
            X.1M0 r5 = r2.A05()
            r2 = 2
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x00e7 }
            r4.<init>(r2)     // Catch:{ all -> 0x00e7 }
            java.lang.String r2 = "message_row_id"
            X.C36341k9.A0p(r4, r2, r0)     // Catch:{ all -> 0x00e7 }
            java.lang.String r0 = "forward_score"
            X.C36341k9.A0o(r4, r0, r3)     // Catch:{ all -> 0x00e7 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = "message_forwarded"
            java.lang.String r0 = "INSERT_FORWARDING_SCORE_FOR_ROW_ID_SQL"
            r3.A04(r1, r0, r4)     // Catch:{ all -> 0x00e7 }
            r5.close()
            X.3Jw r0 = r9.A0W()
            if (r0 == 0) goto L_0x0090
            X.005 r0 = r8.A02
            java.lang.Object r7 = r0.get()
            X.34W r7 = (X.AnonymousClass34W) r7
            X.3Jw r3 = r9.A0W()
            if (r3 == 0) goto L_0x0086
            X.12P r0 = r7.A01
            X.1M0 r4 = r0.A05()
            android.content.ContentValues r6 = X.C36441kJ.A0E()     // Catch:{ all -> 0x00cd }
            long r0 = r9.A1N     // Catch:{ all -> 0x00cd }
            X.C36341k9.A0p(r6, r2, r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r5 = "newsletter_jid_row_id"
            X.12j r1 = r7.A00     // Catch:{ all -> 0x00cd }
            X.1Uw r0 = r3.A01     // Catch:{ all -> 0x00cd }
            long r0 = r1.A07(r0)     // Catch:{ all -> 0x00cd }
            X.C36341k9.A0p(r6, r5, r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = "newsletter_server_message_id"
            int r0 = r3.A00     // Catch:{ all -> 0x00cd }
            X.C36341k9.A0o(r6, r1, r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r1 = "newsletter_name"
            java.lang.String r0 = r3.A04     // Catch:{ all -> 0x00cd }
            r6.put(r1, r0)     // Catch:{ all -> 0x00cd }
            X.14e r5 = r4.A02     // Catch:{ all -> 0x00cd }
            java.lang.String r3 = "forwarded_newsletter_message_info"
            r1 = 5
            java.lang.String r0 = "INSERT_FORWARDED_NEWSLETTER_MESSAGE_INFO"
            r5.A08(r3, r0, r6, r1)     // Catch:{ all -> 0x00cd }
            goto L_0x008d
        L_0x0086:
            java.lang.String r0 = "ForwardedNewsletterMessageInfoStore/insertForwardedNewsletterMessageInfo/missing information in the FMessage"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x008d:
            r4.close()
        L_0x0090:
            X.3Ky r0 = r9.A0O()
            if (r0 == 0) goto L_0x00de
            X.005 r0 = r8.A00
            java.lang.Object r6 = r0.get()
            X.38B r6 = (X.AnonymousClass38B) r6
            X.3Ky r3 = r9.A0O()
            if (r3 == 0) goto L_0x00d4
            X.12P r0 = r6.A03
            X.1M0 r4 = r0.A05()
            r0 = 2
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x00cd }
            r5.<init>(r0)     // Catch:{ all -> 0x00cd }
            long r0 = r9.A1N     // Catch:{ all -> 0x00cd }
            X.C36341k9.A0p(r5, r2, r0)     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = "business_owner_jid_row_id"
            X.12j r1 = r6.A01     // Catch:{ all -> 0x00cd }
            com.whatsapp.jid.UserJid r0 = r3.A01     // Catch:{ all -> 0x00cd }
            long r0 = r1.A07(r0)     // Catch:{ all -> 0x00cd }
            X.C36341k9.A0p(r5, r2, r0)     // Catch:{ all -> 0x00cd }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x00cd }
            java.lang.String r2 = "business_message_forward_info"
            r1 = 5
            java.lang.String r0 = "INSERT_BUSINESS_MESSAGE_FORWARD_INFO"
            r3.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x00cd }
            goto L_0x00db
        L_0x00cd:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x00d4:
            java.lang.String r0 = "BusinessMessageForwardInfoStore/insertBusinessMessageForwardInfo/missing BusinessMessageForwardedInfo in message"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        L_0x00db:
            r4.close()
        L_0x00de:
            if (r10 == 0) goto L_0x00f1
            java.lang.Class<X.3sJ> r0 = X.C78563sJ.class
            java.lang.NullPointerException r0 = X.C36321k7.A04(r0)
            throw r0
        L_0x00e7:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x00ec }
            throw r1
        L_0x00ec:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x00f1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78563sJ.BmI(X.3T1, X.2qQ):void");
    }

    public C78563sJ(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3) {
        C36321k7.A11(r1, r2, r3);
        this.A01 = r1;
        this.A00 = r2;
        this.A02 = r3;
    }
}
