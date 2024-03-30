package X;

/* renamed from: X.6zF  reason: invalid class name and case insensitive filesystem */
public final class C148676zF implements AnonymousClass4S2, AnonymousClass4S3, AnonymousClass4S4, C17760rz {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x009f, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        X.C05600Qi.A00(r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bf, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.C05600Qi.A00(r6, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c3, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c6, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00c7, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ca, code lost:
        throw r0;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:35:0x00b6=Splitter:B:35:0x00b6, B:20:0x0099=Splitter:B:20:0x0099} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void B7J(X.AnonymousClass3T1 r12) {
        /*
            r11 = this;
            r7 = 0
            X.AnonymousClass00C.A0D(r12, r7)
            X.005 r0 = r11.A00
            java.lang.Object r5 = r0.get()
            X.5pg r5 = (X.C119355pg) r5
            X.5Ix r12 = (X.C106245Ix) r12
            X.AnonymousClass00C.A0D(r12, r7)
            X.12P r0 = r5.A01
            X.1M0 r2 = r0.get()
            X.14e r6 = r2.A02     // Catch:{ all -> 0x00c4 }
            java.lang.String r4 = "SELECT bcall_session_row_id FROM message_bcall_session WHERE message_row_id = ?"
            java.lang.String[] r3 = X.C36441kJ.A1R()     // Catch:{ all -> 0x00c4 }
            long r0 = r12.A1N     // Catch:{ all -> 0x00c4 }
            X.C36351kA.A1V(r3, r7, r0)     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = "MessageBCallSessionStore/getSessionRowId"
            android.database.Cursor r6 = r6.A09(r4, r0, r3)     // Catch:{ all -> 0x00c4 }
            boolean r0 = r6.moveToLast()     // Catch:{ all -> 0x00bd }
            if (r0 == 0) goto L_0x00b6
            java.lang.String r0 = "bcall_session_row_id"
            int r1 = r6.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x00bd }
            boolean r0 = r6.isNull(r1)     // Catch:{ all -> 0x00bd }
            if (r0 != 0) goto L_0x00b1
            long r3 = r6.getLong(r1)     // Catch:{ all -> 0x00bd }
            r6.close()     // Catch:{ all -> 0x00c4 }
            r2.close()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00b0
            X.5lO r0 = r5.A00
            X.12P r0 = r0.A00
            X.1M0 r2 = r0.get()
            X.14e r6 = r2.A02     // Catch:{ all -> 0x00c4 }
            java.lang.String r5 = "SELECT * FROM bcall_session WHERE _id = ?"
            java.lang.String[] r1 = X.C36441kJ.A1R()     // Catch:{ all -> 0x00c4 }
            X.C36351kA.A1V(r1, r7, r3)     // Catch:{ all -> 0x00c4 }
            java.lang.String r0 = "BCallSessionStore/getSessionByRowId"
            android.database.Cursor r3 = r6.A09(r5, r0, r1)     // Catch:{ all -> 0x00c4 }
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x009d }
            r4 = 0
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "session_id"
            java.lang.String r5 = X.C36341k9.A0f(r3, r0)     // Catch:{ all -> 0x009d }
            X.AnonymousClass00C.A08(r5)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "media_type"
            int r8 = X.C36351kA.A03(r3, r0)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "master_key"
            int r0 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x009d }
            byte[] r7 = r3.getBlob(r0)     // Catch:{ all -> 0x009d }
            X.AnonymousClass00C.A08(r7)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "caption"
            java.lang.String r6 = X.C36341k9.A0f(r3, r0)     // Catch:{ all -> 0x009d }
            java.lang.String r0 = "_id"
            long r9 = X.C36351kA.A07(r3, r0)     // Catch:{ all -> 0x009d }
            X.67Y r4 = new X.67Y     // Catch:{ all -> 0x009d }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x009d }
        L_0x0099:
            r3.close()     // Catch:{ all -> 0x00c4 }
            goto L_0x00a4
        L_0x009d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x009f }
        L_0x009f:
            r1 = move-exception
            X.C05600Qi.A00(r3, r0)     // Catch:{ all -> 0x00c4 }
            goto L_0x00c3
        L_0x00a4:
            r2.close()
            if (r4 != 0) goto L_0x00ae
            java.lang.String r0 = "MessageBCallSessionStore/fillMessage cannot load session"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x00ae:
            r12.A00 = r4
        L_0x00b0:
            return
        L_0x00b1:
            java.lang.String r0 = "MessageBCallSessionStore/getSessionRowId bcall_session_row_id is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00bd }
        L_0x00b6:
            r6.close()     // Catch:{ all -> 0x00c4 }
            r2.close()
            return
        L_0x00bd:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            r1 = move-exception
            X.C05600Qi.A00(r6, r0)     // Catch:{ all -> 0x00c4 }
        L_0x00c3:
            throw r1     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c6 }
        L_0x00c6:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148676zF.B7J(X.3T1):void");
    }

    public void BwV(AnonymousClass3T1 r1) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00de, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00df, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00e2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0123, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0124, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0127, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BKi(X.AnonymousClass3T1 r19) {
        /*
            r18 = this;
            r5 = r19
            r0 = 0
            X.AnonymousClass00C.A0D(r5, r0)
            boolean r0 = r5 instanceof X.C106245Ix
            if (r0 == 0) goto L_0x0128
            X.5Ix r5 = (X.C106245Ix) r5
            X.67Y r7 = r5.A00
            if (r7 != 0) goto L_0x0016
            java.lang.String r0 = "FMessageBCallDatabase/insert no session"
        L_0x0012:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x0016:
            long r1 = r7.A01
            r9 = 0
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            r6 = r18
            if (r0 > 0) goto L_0x00a1
            X.005 r0 = r6.A01
            java.lang.Object r0 = r0.get()
            X.5lO r0 = (X.C116905lO) r0
            r8 = 0
            X.12P r0 = r0.A00
            X.1M0 r4 = r0.A05()
            android.content.ContentValues r12 = X.C36441kJ.A0E()     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = r7.A03     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "session_id"
            r12.put(r0, r1)     // Catch:{ all -> 0x00dc }
            int r0 = r7.A00     // Catch:{ all -> 0x00dc }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "media_type"
            r12.put(r0, r1)     // Catch:{ all -> 0x00dc }
            byte[] r1 = r7.A04     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "master_key"
            r12.put(r0, r1)     // Catch:{ all -> 0x00dc }
            java.lang.String r1 = r7.A02     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "caption"
            r12.put(r0, r1)     // Catch:{ all -> 0x00dc }
            long r0 = r7.A01     // Catch:{ all -> 0x00dc }
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 <= 0) goto L_0x0083
            X.14e r11 = r4.A02     // Catch:{ all -> 0x00dc }
            java.lang.String r13 = "bcall_session"
            java.lang.String r14 = "_id = ?"
            r3 = 1
            java.lang.String[] r2 = new java.lang.String[r3]     // Catch:{ all -> 0x00dc }
            X.C36351kA.A1V(r2, r8, r0)     // Catch:{ all -> 0x00dc }
            r17 = 4
            java.lang.String r15 = "BCallSessionStore/updateSession"
            r16 = r2
            int r2 = r11.A02(r12, r13, r14, r15, r16, r17)     // Catch:{ all -> 0x00dc }
            if (r2 == r3) goto L_0x009e
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "BCallSessionStore/updateSession affects "
            r1.append(r0)     // Catch:{ all -> 0x00dc }
            r1.append(r2)     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = " rows, supposed to be only one row"
            X.C36321k7.A1Z(r1, r0)     // Catch:{ all -> 0x00dc }
            goto L_0x009e
        L_0x0083:
            X.14e r3 = r4.A02     // Catch:{ all -> 0x00dc }
            java.lang.String r2 = "bcall_session"
            r1 = 5
            java.lang.String r0 = "BCallSessionStore/insertSession"
            long r2 = r3.A08(r2, r0, r12, r1)     // Catch:{ all -> 0x00dc }
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            r7.A01 = r2     // Catch:{ all -> 0x00dc }
            goto L_0x009e
        L_0x0095:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x00dc }
            java.lang.String r0 = "BCallSessionStore/insertSession failed, return="
            X.C36341k9.A1M(r0, r1, r2)     // Catch:{ all -> 0x00dc }
        L_0x009e:
            r4.close()
        L_0x00a1:
            X.005 r0 = r6.A00
            java.lang.Object r6 = r0.get()
            X.5pg r6 = (X.C119355pg) r6
            r4 = 0
            long r1 = r5.A1N
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00c3
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageBCallSessionStore/insertSession bad message rowId="
            r2.append(r0)
            long r0 = r5.A1N
            java.lang.String r0 = X.C36411kG.A11(r2, r0)
        L_0x00bf:
            X.C18740tg.A0D(r4, r0)
            return
        L_0x00c3:
            X.67Y r7 = r5.A00
            if (r7 != 0) goto L_0x00cb
            java.lang.String r0 = "MessageBCallSessionStore/insertSession session is null"
            goto L_0x0012
        L_0x00cb:
            long r2 = r7.A01
            int r0 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r0 > 0) goto L_0x00e3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "MessageBCallSessionStore/insertSession bad session rowId="
            java.lang.String r0 = X.C36381kD.A0z(r0, r1, r2)
            goto L_0x00bf
        L_0x00dc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00de }
        L_0x00de:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x00e3:
            X.12P r0 = r6.A01
            X.1M0 r6 = r0.A05()
            android.content.ContentValues r4 = X.C36441kJ.A0E()     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "message_row_id"
            long r0 = r5.A1N     // Catch:{ all -> 0x0121 }
            X.C36341k9.A0p(r4, r2, r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "bcall_session_row_id"
            long r0 = r7.A01     // Catch:{ all -> 0x0121 }
            X.C36341k9.A0p(r4, r2, r0)     // Catch:{ all -> 0x0121 }
            X.14e r3 = r6.A02     // Catch:{ all -> 0x0121 }
            java.lang.String r2 = "message_bcall_session"
            r1 = 4
            java.lang.String r0 = "MessageBCallSessionStore/insertSession"
            long r3 = r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x0121 }
            int r0 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r0 >= 0) goto L_0x011d
            java.lang.StringBuilder r2 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = "MessageBCallSessionStore/insertSession/insert error, message_row_id="
            r2.append(r0)     // Catch:{ all -> 0x0121 }
            long r0 = r5.A1N     // Catch:{ all -> 0x0121 }
            r2.append(r0)     // Catch:{ all -> 0x0121 }
            java.lang.String r0 = ", return="
            X.C36341k9.A1M(r0, r2, r3)     // Catch:{ all -> 0x0121 }
        L_0x011d:
            r6.close()
            return
        L_0x0121:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0123 }
        L_0x0123:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        L_0x0128:
            java.lang.String r0 = "FMessageBCallDatabase/insert only FMessageBCall is supporetd"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A08(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C148676zF.BKi(X.3T1):void");
    }

    public C148676zF(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A01 = r1;
        this.A00 = r2;
    }
}
