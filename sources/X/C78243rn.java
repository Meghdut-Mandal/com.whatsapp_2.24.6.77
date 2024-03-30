package X;

/* renamed from: X.3rn  reason: invalid class name and case insensitive filesystem */
public final class C78243rn implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;

    public C78243rn(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B7J(X.AnonymousClass3T1 r11) {
        /*
            r10 = this;
            r2 = 0
            X.AnonymousClass00C.A0D(r11, r2)
            X.005 r0 = r10.A00
            java.lang.Object r5 = r0.get()
            X.1TX r5 = (X.AnonymousClass1TX) r5
            X.2bP r11 = (X.AnonymousClass2bP) r11
            X.AnonymousClass00C.A0D(r11, r2)
            r9 = 1
            java.lang.String[] r3 = new java.lang.String[r9]
            long r0 = r11.A1N
            X.C36351kA.A1V(r3, r2, r0)
            X.12P r0 = r5.A02
            X.1M0 r7 = r0.get()
            X.14e r2 = r7.A02     // Catch:{ all -> 0x0065 }
            java.lang.String r1 = "SELECT newsletter_jid_row_id, newsletter_name, expiration FROM message_newsletter_admin_invite WHERE message_row_id = ? "
            java.lang.String r0 = "GET_NEWSLETTER_ADMIN_INVITE_MESSAGE_BY_ROW_ID_SQL"
            android.database.Cursor r8 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x0065 }
            boolean r0 = r8.moveToNext()     // Catch:{ all -> 0x005e }
            if (r0 == 0) goto L_0x0057
            java.lang.String r0 = "expiration"
            long r3 = X.C36351kA.A07(r8, r0)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "newsletter_jid_row_id"
            long r1 = X.C36351kA.A07(r8, r0)     // Catch:{ all -> 0x005e }
            java.lang.String r0 = "newsletter_name"
            java.lang.String r6 = X.C36341k9.A0f(r8, r0)     // Catch:{ all -> 0x005e }
            X.12j r5 = r5.A01     // Catch:{ all -> 0x005e }
            java.lang.Class<X.1Uw> r0 = X.C28981Uw.class
            com.whatsapp.jid.Jid r0 = r5.A0C(r0, r1)     // Catch:{ all -> 0x005e }
            X.1Uw r0 = (X.C28981Uw) r0     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x004e
            r9 = 0
        L_0x004e:
            X.C18740tg.A0C(r9)     // Catch:{ all -> 0x005e }
            r11.A01 = r0     // Catch:{ all -> 0x005e }
            r11.A03 = r6     // Catch:{ all -> 0x005e }
            r11.A00 = r3     // Catch:{ all -> 0x005e }
        L_0x0057:
            r8.close()     // Catch:{ all -> 0x0065 }
            r7.close()
            return
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.C05600Qi.A00(r8, r1)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78243rn.B7J(X.3T1):void");
    }

    public void BKi(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((AnonymousClass1TX) this.A00.get()).A00((AnonymousClass2bP) r2);
    }

    public void BwV(AnonymousClass3T1 r2) {
        AnonymousClass00C.A0D(r2, 0);
        ((AnonymousClass1TX) this.A00.get()).A00((AnonymousClass2bP) r2);
    }
}
