package X;

/* renamed from: X.1Zb  reason: invalid class name and case insensitive filesystem */
public final class C30061Zb {
    public final C20310xM A00;
    public final AnonymousClass1TX A01;
    public final AnonymousClass1A1 A02;

    public C30061Zb(C20310xM r2, AnonymousClass1TX r3, AnonymousClass1A1 r4) {
        AnonymousClass00C.A0D(r4, 1);
        AnonymousClass00C.A0D(r2, 2);
        AnonymousClass00C.A0D(r3, 3);
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0070, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0074, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C28981Uw r7, com.whatsapp.jid.UserJid r8) {
        /*
            r6 = this;
            X.1TX r5 = r6.A01
            r4 = 0
            r2 = 1
            r0 = 2
            java.lang.String[] r3 = new java.lang.String[r0]
            X.12j r0 = r5.A01
            long r0 = r0.A07(r7)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r4] = r0
            X.163 r0 = r5.A00
            long r0 = r0.A08(r8)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r3[r2] = r0
            X.12P r0 = r5.A02
            X.1M0 r4 = r0.get()
            X.14e r2 = r4.A02     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = "\n        SELECT invite.message_row_id AS message_row_id \n        FROM message_newsletter_admin_invite invite\n        JOIN available_message_view message  \n        WHERE \n          invite.message_row_id = message._id AND\n          invite.newsletter_jid_row_id = ? AND \n          message.chat_row_id = ? AND \n          message.message_type = 94 AND\n          invite.expiration != 0 \n        ORDER BY message.sort_id DESC\n        "
            java.lang.String r0 = "GET_LAST_SENT_NEWSLETTER_ADMIN_INVITE_MESSAGE_BY_NEWSLETTER_AND_INVITEE_SQL"
            android.database.Cursor r3 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x0071 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x006a }
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = "message_row_id"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006a }
            long r1 = r3.getLong(r0)     // Catch:{ all -> 0x006a }
            r3.close()     // Catch:{ all -> 0x0071 }
            r4.close()
            r3 = -1
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0069
            X.1A1 r0 = r6.A02
            X.175 r0 = r0.A01
            X.3T1 r2 = r0.A01(r1)
            X.2bP r2 = (X.AnonymousClass2bP) r2
            if (r2 == 0) goto L_0x0069
            r0 = 0
            r2.A00 = r0
            X.0xM r1 = r6.A00
            r0 = 21
            r1.A0n(r2, r0)
            return
        L_0x0063:
            r3.close()     // Catch:{ all -> 0x0071 }
            r4.close()
        L_0x0069:
            return
        L_0x006a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006c }
        L_0x006c:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C30061Zb.A00(X.1Uw, com.whatsapp.jid.UserJid):void");
    }
}
