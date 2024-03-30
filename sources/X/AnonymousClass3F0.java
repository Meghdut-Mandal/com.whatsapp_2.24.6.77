package X;

/* renamed from: X.3F0  reason: invalid class name */
public final class AnonymousClass3F0 {
    public final AnonymousClass3CJ A00;
    public final AnonymousClass1KJ A01;
    public final AnonymousClass16D A02;
    public final AnonymousClass163 A03;
    public final C20810yC A04;
    public final AnonymousClass1DV A05;
    public final C25031Es A06;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r2 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00a8, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00ab, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00af, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.AnonymousClass11F r11) {
        /*
            r10 = this;
            r7 = 0
            X.AnonymousClass00C.A0D(r11, r7)
            boolean r0 = r11 instanceof com.whatsapp.jid.UserJid
            if (r0 == 0) goto L_0x00b4
            X.16D r2 = r10.A02
            X.141 r0 = r2.A08(r11)
            if (r0 == 0) goto L_0x00b4
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x00b4
            X.1DV r6 = r10.A05
            int r1 = r6.A00(r11)
            X.1Es r0 = r10.A06
            boolean r0 = r0.A02(r1)
            if (r0 != 0) goto L_0x00b4
            r9 = r10
            monitor-enter(r9)
            X.141 r2 = r2.A08(r11)     // Catch:{ all -> 0x00b0 }
            if (r2 == 0) goto L_0x00b3
            boolean r0 = r2.A0D()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0042
            X.0yC r1 = r10.A04     // Catch:{ all -> 0x00b0 }
            r0 = 4873(0x1309, float:6.829E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0042
            java.lang.String r0 = "WabaiUtilsImpl/sendWelcomeMessageIfNotRequested 1p, abprop disabled"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x00b3
        L_0x0042:
            boolean r0 = r2.A0E()     // Catch:{ all -> 0x00b0 }
            if (r0 == 0) goto L_0x0058
            X.0yC r1 = r10.A04     // Catch:{ all -> 0x00b0 }
            r0 = 5587(0x15d3, float:7.829E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x00b0 }
            if (r0 != 0) goto L_0x0058
            java.lang.String r0 = "WabaiUtilsImpl/sendWelcomeMessageIfNotRequested 3p, abprop disabled."
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00b0 }
            goto L_0x00b3
        L_0x0058:
            X.3CJ r1 = r10.A00     // Catch:{ all -> 0x00b0 }
            X.163 r0 = r10.A03     // Catch:{ all -> 0x00b0 }
            long r4 = r0.A08(r11)     // Catch:{ all -> 0x00b0 }
            X.12P r0 = r1.A00     // Catch:{ all -> 0x00b0 }
            X.1M0 r3 = r0.get()     // Catch:{ all -> 0x00b0 }
            X.14e r8 = r3.A02     // Catch:{ all -> 0x00a9 }
            java.lang.String r2 = "SELECT welcome_request_message_sent FROM bot_chat_info WHERE chat_row_id = ?"
            java.lang.String[] r1 = X.C36441kJ.A1R()     // Catch:{ all -> 0x00a9 }
            X.C36351kA.A1V(r1, r7, r4)     // Catch:{ all -> 0x00a9 }
            java.lang.String r0 = "BotChatInfoStoreGET_IS_WELCOME_REQUEST_MESSAGE_SENT"
            android.database.Cursor r2 = r8.A09(r2, r0, r1)     // Catch:{ all -> 0x00a9 }
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x00a2 }
            if (r0 != 0) goto L_0x0084
            r2.close()     // Catch:{ all -> 0x00a9 }
            r3.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x0095
        L_0x0084:
            java.lang.String r0 = "welcome_request_message_sent"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00a2 }
            boolean r0 = X.C54282sh.A00(r2, r0)     // Catch:{ all -> 0x00a2 }
            r2.close()     // Catch:{ all -> 0x00a9 }
            r3.close()     // Catch:{ all -> 0x00b0 }
            goto L_0x0096
        L_0x0095:
            r0 = 0
        L_0x0096:
            r1 = 1
            if (r0 != 0) goto L_0x00b3
            X.1KJ r0 = r10.A01     // Catch:{ all -> 0x00b0 }
            r0.A00(r11, r7)     // Catch:{ all -> 0x00b0 }
            r6.A01(r11, r1)     // Catch:{ all -> 0x00b0 }
            goto L_0x00b3
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x00a9 }
            throw r0     // Catch:{ all -> 0x00a9 }
        L_0x00a9:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ab }
        L_0x00ab:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x00b0 }
            throw r0     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        L_0x00b3:
            monitor-exit(r9)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3F0.A00(X.11F):void");
    }

    public AnonymousClass3F0(AnonymousClass3CJ r2, AnonymousClass1KJ r3, AnonymousClass16D r4, AnonymousClass163 r5, C20810yC r6, AnonymousClass1DV r7, C25031Es r8) {
        C36321k7.A11(r6, r5, r4);
        C36381kD.A1K(r2, 5, r8);
        this.A04 = r6;
        this.A03 = r5;
        this.A02 = r4;
        this.A05 = r7;
        this.A00 = r2;
        this.A01 = r3;
        this.A06 = r8;
    }
}
