package X;

/* renamed from: X.3sc  reason: invalid class name and case insensitive filesystem */
public final class C78753sc implements C17820s5 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b5, code lost:
        if (r4.size() > 0) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00e5, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x00e8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmI(X.AnonymousClass3T1 r13, X.C52942qQ r14) {
        /*
            r12 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r13, r0)
            X.005 r0 = r12.A01
            java.lang.Object r0 = r0.get()
            X.12P r0 = (X.AnonymousClass12P) r0
            X.1M0 r2 = r0.get()
            X.3Qa r0 = r13.A1J     // Catch:{ all -> 0x00e2 }
            X.11F r1 = r0.A00     // Catch:{ all -> 0x00e2 }
            boolean r0 = r1 instanceof X.C177618e5     // Catch:{ all -> 0x00e2 }
            if (r0 == 0) goto L_0x00de
            boolean r0 = r1 instanceof X.C177528dw     // Catch:{ all -> 0x00e2 }
            if (r0 != 0) goto L_0x00de
            X.005 r0 = r12.A00     // Catch:{ all -> 0x00e2 }
            java.lang.Object r5 = r0.get()     // Catch:{ all -> 0x00e2 }
            X.34S r5 = (X.AnonymousClass34S) r5     // Catch:{ all -> 0x00e2 }
            boolean r0 = r13 instanceof X.AnonymousClass2bI     // Catch:{ all -> 0x00e2 }
            if (r0 != 0) goto L_0x00d5
            java.util.HashSet r4 = X.C36441kJ.A16()     // Catch:{ all -> 0x00e2 }
            X.12P r8 = r5.A01     // Catch:{ all -> 0x00e2 }
            X.1M0 r3 = r8.get()     // Catch:{ all -> 0x00e2 }
            X.14e r11 = r3.A02     // Catch:{ all -> 0x00cb }
            java.lang.String r10 = "SELECT receipt_device_jid_row_id, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?"
            r6 = 1
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ all -> 0x00cb }
            long r0 = r13.A1N     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x00cb }
            r9 = 0
            r7[r9] = r0     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "GET_DEVICE_RECEIPTS_SQL"
            android.database.Cursor r7 = r11.A09(r10, r0, r7)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "receipt_device_jid_row_id"
            int r10 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bf }
        L_0x004e:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x006a
            X.12j r11 = r5.A00     // Catch:{ all -> 0x00bf }
            long r0 = r7.getLong(r10)     // Catch:{ all -> 0x00bf }
            com.whatsapp.jid.Jid r0 = r11.A09(r0)     // Catch:{ all -> 0x00bf }
            com.whatsapp.jid.DeviceJid r0 = com.whatsapp.jid.DeviceJid.of(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x004e
            com.whatsapp.jid.UserJid r0 = r0.userJid     // Catch:{ all -> 0x00bf }
            r4.add(r0)     // Catch:{ all -> 0x00bf }
            goto L_0x004e
        L_0x006a:
            r7.close()     // Catch:{ all -> 0x00cb }
            r3.close()     // Catch:{ all -> 0x00e2 }
            int r0 = r4.size()     // Catch:{ all -> 0x00e2 }
            if (r0 > 0) goto L_0x00b7
            X.1M0 r3 = r8.get()     // Catch:{ all -> 0x00e2 }
            X.14e r8 = r3.A02     // Catch:{ all -> 0x00cb }
            java.lang.String r7 = "SELECT receipt_user_jid_row_id,receipt_timestamp,read_timestamp,played_timestamp FROM receipt_user WHERE message_row_id = ?"
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ all -> 0x00cb }
            long r0 = r13.A1N     // Catch:{ all -> 0x00cb }
            X.C36351kA.A1V(r6, r9, r0)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "GET_MESSAGE_RECEIPTS_USER_SQL"
            android.database.Cursor r7 = r8.A09(r7, r0, r6)     // Catch:{ all -> 0x00cb }
            java.lang.String r0 = "receipt_user_jid_row_id"
            int r8 = r7.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bf }
        L_0x0091:
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x00ab
            X.12j r6 = r5.A00     // Catch:{ all -> 0x00bf }
            long r0 = r7.getLong(r8)     // Catch:{ all -> 0x00bf }
            com.whatsapp.jid.Jid r0 = r6.A09(r0)     // Catch:{ all -> 0x00bf }
            com.whatsapp.jid.UserJid r0 = X.C36401kF.A0b(r0)     // Catch:{ all -> 0x00bf }
            if (r0 == 0) goto L_0x0091
            r4.add(r0)     // Catch:{ all -> 0x00bf }
            goto L_0x0091
        L_0x00ab:
            r7.close()     // Catch:{ all -> 0x00cb }
            r3.close()     // Catch:{ all -> 0x00e2 }
            int r0 = r4.size()     // Catch:{ all -> 0x00e2 }
            if (r0 <= 0) goto L_0x00d5
        L_0x00b7:
            java.util.ArrayList r0 = X.C36441kJ.A15(r4)     // Catch:{ all -> 0x00e2 }
            r13.A19(r0)     // Catch:{ all -> 0x00e2 }
            goto L_0x00d5
        L_0x00bf:
            r1 = move-exception
            if (r7 == 0) goto L_0x00ca
            r7.close()     // Catch:{ all -> 0x00c6 }
            goto L_0x00ca
        L_0x00c6:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00cb }
        L_0x00ca:
            throw r1     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x00d0 }
            goto L_0x00d4
        L_0x00d0:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x00e2 }
        L_0x00d4:
            throw r1     // Catch:{ all -> 0x00e2 }
        L_0x00d5:
            if (r14 == 0) goto L_0x00de
            java.lang.Class<X.3sc> r0 = X.C78753sc.class
            java.lang.NullPointerException r0 = X.C36321k7.A04(r0)     // Catch:{ all -> 0x00e2 }
            throw r0     // Catch:{ all -> 0x00e2 }
        L_0x00de:
            r2.close()
            return
        L_0x00e2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00e4 }
        L_0x00e4:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78753sc.BmI(X.3T1, X.2qQ):void");
    }

    public C78753sc(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
