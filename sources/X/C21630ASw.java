package X;

/* renamed from: X.ASw  reason: case insensitive filesystem */
public final class C21630ASw implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C21630ASw(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b4, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b7, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B7J(X.AnonymousClass3T1 r13) {
        /*
            r12 = this;
            r7 = 0
            X.AnonymousClass00C.A0D(r13, r7)
            X.005 r0 = r12.A00
            java.lang.Object r1 = r0.get()
            X.30b r1 = (X.C585330b) r1
            boolean r0 = r13 instanceof X.C180828mU
            if (r0 == 0) goto L_0x00b8
            X.12P r0 = r1.A00
            X.1M0 r2 = r0.get()
            X.14e r6 = r2.A02     // Catch:{ all -> 0x00b1 }
            java.lang.String r5 = "SELECT bot_feedback_kind, bot_feedback_text, bot_feedback_key_remote_jid, bot_feedback_key_from_me, bot_feedback_key_id, bot_feedback_kind_negative, bot_feedback_kind_positive FROM message_bot_feedback WHERE message_row_id = ?"
            r4 = 1
            java.lang.String[] r3 = new java.lang.String[r4]     // Catch:{ all -> 0x00b1 }
            X.8mU r13 = (X.C180828mU) r13     // Catch:{ all -> 0x00b1 }
            long r0 = r13.A1N     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00b1 }
            r3[r7] = r0     // Catch:{ all -> 0x00b1 }
            java.lang.String r0 = "GET_MESSAGE_BOT_FEEDBACK"
            android.database.Cursor r3 = r6.A09(r5, r0, r3)     // Catch:{ all -> 0x00b1 }
            boolean r0 = r3.moveToLast()     // Catch:{ all -> 0x00aa }
            r11 = 0
            if (r0 == 0) goto L_0x00a3
            java.lang.String r0 = "bot_feedback_kind"
            int r10 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "bot_feedback_kind_positive"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "bot_feedback_kind_negative"
            int r9 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "bot_feedback_text"
            int r8 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "bot_feedback_key_remote_jid"
            int r7 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "bot_feedback_key_from_me"
            int r6 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "bot_feedback_key_id"
            int r5 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00aa }
            int r0 = r3.getInt(r10)     // Catch:{ all -> 0x00aa }
            X.91F r0 = X.AnonymousClass91F.A00(r0)     // Catch:{ all -> 0x00aa }
            X.AnonymousClass00C.A08(r0)     // Catch:{ all -> 0x00aa }
            r13.A02 = r0     // Catch:{ all -> 0x00aa }
            int r0 = r3.getInt(r1)     // Catch:{ all -> 0x00aa }
            long r0 = (long) r0     // Catch:{ all -> 0x00aa }
            r13.A01 = r0     // Catch:{ all -> 0x00aa }
            int r0 = r3.getInt(r9)     // Catch:{ all -> 0x00aa }
            long r0 = (long) r0     // Catch:{ all -> 0x00aa }
            r13.A00 = r0     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = r3.getString(r8)     // Catch:{ all -> 0x00aa }
            if (r1 == 0) goto L_0x0085
            int r0 = r1.length()     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x0086
        L_0x0085:
            r1 = r11
        L_0x0086:
            r13.A04 = r1     // Catch:{ all -> 0x00aa }
            X.13q r0 = X.AnonymousClass11F.A00     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = r3.getString(r7)     // Catch:{ all -> 0x00aa }
            X.11F r1 = X.C222713q.A01(r0)     // Catch:{ all -> 0x00aa }
            int r0 = r3.getInt(r6)     // Catch:{ all -> 0x00aa }
            if (r0 == r4) goto L_0x0099
            r4 = 0
        L_0x0099:
            java.lang.String r0 = r3.getString(r5)     // Catch:{ all -> 0x00aa }
            X.3Qa r0 = X.C165617ti.A0R(r1, r0, r4)     // Catch:{ all -> 0x00aa }
            r13.A03 = r0     // Catch:{ all -> 0x00aa }
        L_0x00a3:
            r3.close()     // Catch:{ all -> 0x00b1 }
            r2.close()
            return
        L_0x00aa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x00b1 }
            throw r0     // Catch:{ all -> 0x00b1 }
        L_0x00b1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b3 }
        L_0x00b3:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x00b8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21630ASw.B7J(X.3T1):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ac, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ad, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b0, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BKi(X.AnonymousClass3T1 r7) {
        /*
            r6 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r7, r0)
            X.005 r0 = r6.A00
            java.lang.Object r1 = r0.get()
            X.30b r1 = (X.C585330b) r1
            boolean r0 = r7 instanceof X.C180828mU
            if (r0 == 0) goto L_0x00ba
            X.8mU r7 = (X.C180828mU) r7
            X.3Qa r2 = r7.A03
            if (r2 == 0) goto L_0x00b1
            X.11F r0 = r2.A00
            if (r0 == 0) goto L_0x00b1
            X.12P r0 = r1.A00
            X.1M0 r5 = r0.A05()
            r0 = 8
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x00aa }
            r4.<init>(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "message_row_id"
            long r0 = r7.A1N     // Catch:{ all -> 0x00aa }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00aa }
            r4.put(r3, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "bot_feedback_kind"
            X.91F r0 = r7.A02     // Catch:{ all -> 0x00aa }
            int r0 = r0.value     // Catch:{ all -> 0x00aa }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00aa }
            r4.put(r1, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "bot_feedback_kind_positive"
            long r0 = r7.A01     // Catch:{ all -> 0x00aa }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00aa }
            r4.put(r3, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r3 = "bot_feedback_kind_negative"
            long r0 = r7.A00     // Catch:{ all -> 0x00aa }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00aa }
            r4.put(r3, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "bot_feedback_text"
            java.lang.String r0 = r7.A04     // Catch:{ all -> 0x00aa }
            if (r0 != 0) goto L_0x005d
            java.lang.String r0 = ""
        L_0x005d:
            r4.put(r1, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "bot_feedback_key_remote_jid"
            X.11F r0 = r2.A00     // Catch:{ all -> 0x00aa }
            X.AnonymousClass00C.A0B(r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = r0.getRawString()     // Catch:{ all -> 0x00aa }
            r4.put(r1, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "bot_feedback_key_from_me"
            boolean r0 = r2.A02     // Catch:{ all -> 0x00aa }
            boolean r0 = X.AnonymousClass000.A1P(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00aa }
            r4.put(r1, r0)     // Catch:{ all -> 0x00aa }
            java.lang.String r1 = "bot_feedback_key_id"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x00aa }
            r4.put(r1, r0)     // Catch:{ all -> 0x00aa }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = "message_bot_feedback"
            r1 = 5
            java.lang.String r0 = "BotFeedbackMessageStoreImpl/insertOrUpdateBotFeedbackMessage"
            long r3 = r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x00aa }
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00a6
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00aa }
            java.lang.String r0 = "BotFeedbackMessageStoreImpl/insertOrUpdateBotFeedbackMessage/insert error, rowId="
            r2.append(r0)     // Catch:{ all -> 0x00aa }
            long r0 = r7.A1N     // Catch:{ all -> 0x00aa }
            r2.append(r0)     // Catch:{ all -> 0x00aa }
            X.C90504aG.A1G(r2)     // Catch:{ all -> 0x00aa }
        L_0x00a6:
            r5.close()
            return
        L_0x00aa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ac }
        L_0x00ac:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        L_0x00b1:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "BotFeedbackMessageStore/insertOrUpdateBotFeedbackMessage feedbackMsgKey is "
            X.C36321k7.A1J(r2, r0, r1)
        L_0x00ba:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21630ASw.BKi(X.3T1):void");
    }

    public void BwV(AnonymousClass3T1 r1) {
    }
}
