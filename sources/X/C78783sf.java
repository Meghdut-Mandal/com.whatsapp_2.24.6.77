package X;

/* renamed from: X.3sf  reason: invalid class name and case insensitive filesystem */
public final class C78783sf implements C17820s5 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;
    public final AnonymousClass005 A02;
    public final AnonymousClass005 A03;

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f9, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00fc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00fd, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0100, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmI(X.AnonymousClass3T1 r11, X.C52942qQ r12) {
        /*
            r10 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r11, r0)
            r1 = 1
            int r0 = r11.A0A
            r0 = r0 & 1
            boolean r0 = X.AnonymousClass000.A1S(r0, r1)
            if (r0 == 0) goto L_0x0117
            X.005 r0 = r10.A02
            java.lang.Object r0 = r0.get()
            X.1TT r0 = (X.AnonymousClass1TT) r0
            X.12P r0 = r0.A00
            X.1M0 r5 = r0.get()
            X.14e r7 = r5.A02     // Catch:{ all -> 0x010d }
            java.lang.String r6 = "SELECT forward_score FROM message_forwarded WHERE message_row_id = ?"
            r4 = 1
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch:{ all -> 0x010d }
            r2 = 0
            long r0 = r11.A1N     // Catch:{ all -> 0x010d }
            X.C36401kF.A1T(r3, r2, r0)     // Catch:{ all -> 0x010d }
            java.lang.String r0 = "GET_FORWARDING_SCORE_FOR_ROW_ID_SQL"
            android.database.Cursor r2 = r7.A09(r6, r0, r3)     // Catch:{ all -> 0x010d }
            if (r2 == 0) goto L_0x003e
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "forward_score"
            int r4 = X.C36351kA.A03(r2, r0)     // Catch:{ all -> 0x0101 }
        L_0x003e:
            r11.A06 = r4     // Catch:{ all -> 0x0101 }
            if (r2 == 0) goto L_0x0045
            r2.close()     // Catch:{ all -> 0x010d }
        L_0x0045:
            r5.close()
            r0 = 32
            boolean r0 = r11.A1R(r0)
            if (r0 == 0) goto L_0x007b
            X.005 r0 = r10.A00
            java.lang.Object r1 = r0.get()
            X.0yB r1 = (X.C20800yB) r1
            r0 = 4652(0x122c, float:6.519E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x007b
            X.005 r0 = r10.A01
            java.lang.Object r0 = r0.get()
            X.38B r0 = (X.AnonymousClass38B) r0
            X.39x r4 = r0.A00
            X.4Fh r3 = new X.4Fh
            r3.<init>(r0, r11)
            X.0wk r2 = r4.A04
            r1 = 29
            X.3vL r0 = new X.3vL
            r0.<init>(r4, r11, r3, r1)
            r2.execute(r0)
        L_0x007b:
            r0 = 128(0x80, float:1.794E-43)
            boolean r0 = r11.A1R(r0)
            if (r0 == 0) goto L_0x0090
            X.005 r0 = r10.A00
            java.lang.Object r1 = r0.get()
            X.0yB r1 = (X.C20800yB) r1
            r0 = 6507(0x196b, float:9.118E-42)
            r1.A0E(r0)
        L_0x0090:
            X.005 r0 = r10.A03
            java.lang.Object r5 = r0.get()
            X.34W r5 = (X.AnonymousClass34W) r5
            r7 = 0
            X.12P r0 = r5.A01
            X.1M0 r2 = r0.get()
            X.14e r6 = r2.A02     // Catch:{ all -> 0x00fa }
            java.lang.String r4 = "SELECT newsletter_jid_row_id,newsletter_server_message_id,newsletter_name FROM forwarded_newsletter_message_info WHERE message_row_id = ?"
            java.lang.String[] r3 = X.C36441kJ.A1R()     // Catch:{ all -> 0x00fa }
            long r0 = r11.A1N     // Catch:{ all -> 0x00fa }
            X.C36351kA.A1V(r3, r7, r0)     // Catch:{ all -> 0x00fa }
            java.lang.String r0 = "GET_FORWARDED_NEWSLETTER_MESSAGE_INFO_FOR_ROW_ID_SQL"
            android.database.Cursor r3 = r6.A09(r4, r0, r3)     // Catch:{ all -> 0x00fa }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x00f3 }
            if (r0 == 0) goto L_0x00e4
            java.lang.String r0 = "newsletter_jid_row_id"
            int r0 = X.C36351kA.A03(r3, r0)     // Catch:{ all -> 0x00f3 }
            long r0 = (long) r0     // Catch:{ all -> 0x00f3 }
            X.12j r5 = r5.A00     // Catch:{ all -> 0x00f3 }
            java.lang.Class<X.1Uw> r4 = X.C28981Uw.class
            com.whatsapp.jid.Jid r5 = r5.A0C(r4, r0)     // Catch:{ all -> 0x00f3 }
            X.1Uw r5 = (X.C28981Uw) r5     // Catch:{ all -> 0x00f3 }
            if (r5 == 0) goto L_0x00e4
            java.lang.String r0 = "newsletter_server_message_id"
            int r9 = X.C36351kA.A03(r3, r0)     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = "newsletter_name"
            java.lang.String r7 = X.C36341k9.A0f(r3, r0)     // Catch:{ all -> 0x00f3 }
            X.AnonymousClass00C.A0B(r7)     // Catch:{ all -> 0x00f3 }
            r6 = 0
            X.3Jw r4 = new X.3Jw     // Catch:{ all -> 0x00f3 }
            r8 = r6
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00f3 }
            r11.A0z(r4)     // Catch:{ all -> 0x00f3 }
        L_0x00e4:
            r3.close()     // Catch:{ all -> 0x00fa }
            r2.close()
            if (r12 == 0) goto L_0x0117
            java.lang.Class<X.3sf> r0 = X.C78783sf.class
            java.lang.NullPointerException r0 = X.C36321k7.A04(r0)
            throw r0
        L_0x00f3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00f5 }
        L_0x00f5:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x00fa }
            throw r0     // Catch:{ all -> 0x00fa }
        L_0x00fa:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00fc }
        L_0x00fc:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x0101:
            r1 = move-exception
            if (r2 == 0) goto L_0x010c
            r2.close()     // Catch:{ all -> 0x0108 }
            goto L_0x010c
        L_0x0108:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x010d }
        L_0x010c:
            throw r1     // Catch:{ all -> 0x010d }
        L_0x010d:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0112 }
            throw r1
        L_0x0112:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0117:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78783sf.BmI(X.3T1, X.2qQ):void");
    }

    public C78783sf(AnonymousClass005 r1, AnonymousClass005 r2, AnonymousClass005 r3, AnonymousClass005 r4) {
        C36321k7.A18(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
    }
}
