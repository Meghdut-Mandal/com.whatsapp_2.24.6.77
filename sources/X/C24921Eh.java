package X;

/* renamed from: X.1Eh  reason: invalid class name and case insensitive filesystem */
public class C24921Eh {
    public final AnonymousClass12P A00;
    public final AnonymousClass1EH A01;

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
        if (r15.A03 != null) goto L_0x0029;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0131  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C24921Eh r14, X.AnonymousClass2bV r15, boolean r16) {
        /*
            java.lang.String r0 = r15.A04
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r15.A05
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            java.lang.String r0 = r15.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0029
            com.whatsapp.TextData r0 = r15.A02
            if (r0 != 0) goto L_0x0029
            int r0 = r15.A01
            if (r0 != 0) goto L_0x0029
            int r0 = r15.A00
            if (r0 != 0) goto L_0x0029
            java.lang.String r1 = r15.A03
            r0 = 0
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            java.lang.String r10 = "message_text"
            r7 = 0
            r3 = 1
            if (r0 == 0) goto L_0x00ff
            X.12P r0 = r14.A00
            X.1M0 r2 = r0.A05()
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x011b }
            r9.<init>()     // Catch:{ all -> 0x011b }
            long r0 = r15.A1N     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Long r1 = java.lang.Long.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = "message_row_id"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = r15.A04     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r1 = "description"
            if (r0 != 0) goto L_0x00db
            java.lang.String r0 = r15.A04     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
        L_0x0055:
            java.lang.String r0 = r15.A05     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r1 = "page_title"
            if (r0 != 0) goto L_0x00d7
            java.lang.String r0 = r15.A05     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
        L_0x0064:
            java.lang.String r0 = r15.A06     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r1 = "url"
            if (r0 != 0) goto L_0x00d3
            java.lang.String r0 = r15.A06     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
        L_0x0073:
            com.whatsapp.TextData r0 = r15.A02     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r1 = "background_color"
            java.lang.String r5 = "text_color"
            java.lang.String r4 = "font_style"
            if (r0 == 0) goto L_0x00c9
            int r0 = r0.fontStyle     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r9.put(r4, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            com.whatsapp.TextData r0 = r15.A02     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            int r0 = r0.textColor     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r9.put(r5, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            com.whatsapp.TextData r0 = r15.A02     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            int r0 = r0.backgroundColor     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r9.put(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
        L_0x009c:
            int r0 = r15.A01     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = "preview_type"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            int r0 = r15.A00     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = "invite_link_group_type"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r1 = r15.A03     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = "counter_abuse_token"
            r9.put(r0, r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            X.14e r1 = r2.A02     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            java.lang.String r0 = "INSERT_MESSAGE_TEXT_SQL"
            long r5 = r1.A05(r10, r0, r9)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            long r0 = r15.A1N     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            if (r4 != 0) goto L_0x00e1
            goto L_0x00e0
        L_0x00c9:
            r9.putNull(r4)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r9.putNull(r5)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x009c
        L_0x00d3:
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x0073
        L_0x00d7:
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x0064
        L_0x00db:
            r9.putNull(r1)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x0055
        L_0x00e0:
            r1 = 1
        L_0x00e1:
            java.lang.String r0 = "TextMessageStore/insertOrUpdateTextMessage/inserted row should has same row_id"
            X.C18740tg.A0F(r1, r0)     // Catch:{ SQLiteConstraintException -> 0x00e7 }
            goto L_0x0125
        L_0x00e7:
            r4 = move-exception
            X.14e r8 = r2.A02     // Catch:{ all -> 0x011b }
            java.lang.String r11 = "message_row_id = ?"
            java.lang.String[] r13 = new java.lang.String[r3]     // Catch:{ all -> 0x011b }
            long r0 = r15.A1N     // Catch:{ all -> 0x011b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x011b }
            r13[r7] = r0     // Catch:{ all -> 0x011b }
            java.lang.String r12 = "UPDATE_MESSAGE_TEXT_SQL"
            int r0 = r8.A01(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x011b }
            if (r0 == r3) goto L_0x0125
            throw r4     // Catch:{ all -> 0x011b }
        L_0x00ff:
            if (r16 == 0) goto L_0x0128
            X.12P r0 = r14.A00
            X.1M0 r2 = r0.A05()
            X.14e r5 = r2.A02     // Catch:{ all -> 0x011b }
            java.lang.String r4 = "message_row_id = ?"
            java.lang.String[] r3 = new java.lang.String[r3]     // Catch:{ all -> 0x011b }
            long r0 = r15.A1N     // Catch:{ all -> 0x011b }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x011b }
            r3[r7] = r0     // Catch:{ all -> 0x011b }
            java.lang.String r0 = "DELETE_MESSAGE_TEXT_SQL"
            r5.A03(r10, r4, r0, r3)     // Catch:{ all -> 0x011b }
            goto L_0x0125
        L_0x011b:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x0120 }
            throw r1
        L_0x0120:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0125:
            r2.close()
        L_0x0128:
            byte[] r1 = r15.A1c()
            if (r1 == 0) goto L_0x0137
            int r0 = r1.length
            if (r0 == 0) goto L_0x0137
            X.1EH r0 = r14.A01
            r0.A03(r15, r1)
        L_0x0136:
            return
        L_0x0137:
            if (r16 == 0) goto L_0x0136
            X.1EH r0 = r14.A01
            r0.A02(r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C24921Eh.A00(X.1Eh, X.2bV, boolean):void");
    }

    public static void A01(AnonymousClass2bV r8) {
        boolean z = false;
        boolean z2 = false;
        if (r8.A1N > 0) {
            z2 = true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("TextMessageStore/isValidMessage/message must have row_id set; key=");
        C64933Qa r2 = r8.A1J;
        sb.append(r2);
        C18740tg.A0E(z2, sb.toString());
        if (r8.A0H() == 1) {
            z = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TextMessageStore/isValidMessage/message in main storage; key=");
        sb2.append(r2);
        C18740tg.A0E(z, sb2.toString());
    }

    public C24921Eh(AnonymousClass12P r1, AnonymousClass1EH r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
