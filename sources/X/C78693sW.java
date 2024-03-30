package X;

/* renamed from: X.3sW  reason: invalid class name and case insensitive filesystem */
public final class C78693sW implements C17820s5 {
    public final AnonymousClass005 A00;

    public C78693sW(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0095, code lost:
        if (java.lang.Long.valueOf(r17) != null) goto L_0x0097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d2, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d6, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00d9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00da, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00dd, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmI(X.AnonymousClass3T1 r22, X.C52942qQ r23) {
        /*
            r21 = this;
            r1 = r22
            X.11F r0 = X.C64933Qa.A00(r1)
            boolean r0 = r0 instanceof X.C28981Uw
            if (r0 == 0) goto L_0x00de
            r0 = r21
            X.005 r0 = r0.A00
            java.lang.Object r0 = r0.get()
            X.1SN r0 = (X.AnonymousClass1SN) r0
            r5 = 0
            X.12P r2 = r0.A02
            X.1M0 r2 = r2.get()
            java.lang.String[] r6 = X.C36441kJ.A1R()     // Catch:{ all -> 0x00d7 }
            long r3 = r1.A1N     // Catch:{ all -> 0x00d7 }
            X.C36351kA.A1V(r6, r5, r3)     // Catch:{ all -> 0x00d7 }
            X.14e r5 = r2.A02     // Catch:{ all -> 0x00d7 }
            java.lang.String r4 = "SELECT comments_count, reaction_from_me, reactions_from_me_ts, extra_newsletter_tables, extra_table_last_update_ts, view_count  FROM newsletter_message WHERE message_row_id = ?"
            java.lang.String r3 = "GET_NEWSLETTER_MESSAGE_INFO"
            android.database.Cursor r3 = r5.A09(r4, r3, r6)     // Catch:{ all -> 0x00d7 }
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x00d0 }
            boolean r4 = r3.moveToFirst()     // Catch:{ all -> 0x00d0 }
            if (r4 == 0) goto L_0x00c1
            java.lang.String r4 = "comments_count"
            int r10 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = "reaction_from_me"
            int r9 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = "reactions_from_me_ts"
            int r8 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = "extra_newsletter_tables"
            int r7 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = "extra_table_last_update_ts"
            int r6 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x00d0 }
            java.lang.String r4 = "view_count"
            int r4 = r3.getColumnIndex(r4)     // Catch:{ all -> 0x00d0 }
            boolean r5 = r3.isNull(r10)     // Catch:{ all -> 0x00d0 }
            r11 = 0
            if (r5 == 0) goto L_0x0063
            goto L_0x0068
        L_0x0063:
            java.lang.Long r5 = X.C36361kB.A0k(r3, r10)     // Catch:{ all -> 0x00d0 }
            goto L_0x0069
        L_0x0068:
            r5 = r11
        L_0x0069:
            r19 = 0
            if (r5 == 0) goto L_0x006e
            goto L_0x0071
        L_0x006e:
            r13 = 0
            goto L_0x0075
        L_0x0071:
            long r13 = r5.longValue()     // Catch:{ all -> 0x00d0 }
        L_0x0075:
            java.lang.String r12 = r3.getString(r9)     // Catch:{ all -> 0x00d0 }
            boolean r5 = r3.isNull(r8)     // Catch:{ all -> 0x00d0 }
            if (r5 != 0) goto L_0x0083
            java.lang.Long r11 = X.C36361kB.A0k(r3, r8)     // Catch:{ all -> 0x00d0 }
        L_0x0083:
            long r15 = r3.getLong(r7)     // Catch:{ all -> 0x00d0 }
            boolean r5 = r3.isNull(r6)     // Catch:{ all -> 0x00d0 }
            if (r5 != 0) goto L_0x00a8
            long r17 = r3.getLong(r6)     // Catch:{ all -> 0x00d0 }
            java.lang.Long r5 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x00d0 }
            if (r5 == 0) goto L_0x00a8
        L_0x0097:
            boolean r5 = r3.isNull(r4)     // Catch:{ all -> 0x00d0 }
            if (r5 != 0) goto L_0x00ad
            long r5 = r3.getLong(r4)     // Catch:{ all -> 0x00d0 }
            java.lang.Long r4 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x00d0 }
            if (r4 == 0) goto L_0x00ad
            goto L_0x00ab
        L_0x00a8:
            r17 = 0
            goto L_0x0097
        L_0x00ab:
            r19 = r5
        L_0x00ad:
            X.3A4 r10 = new X.3A4     // Catch:{ all -> 0x00d0 }
            r10.<init>(r11, r12, r13, r15, r17, r19)     // Catch:{ all -> 0x00d0 }
            r1.A13(r10)     // Catch:{ all -> 0x00d0 }
            X.0wk r6 = r0.A04     // Catch:{ all -> 0x00d0 }
            r5 = 21
            X.1jB r4 = new X.1jB     // Catch:{ all -> 0x00d0 }
            r4.<init>(r0, r1, r5)     // Catch:{ all -> 0x00d0 }
            r6.execute(r4)     // Catch:{ all -> 0x00d0 }
        L_0x00c1:
            r3.close()     // Catch:{ all -> 0x00d7 }
            r2.close()
            if (r23 == 0) goto L_0x00de
            java.lang.Class<X.3sW> r0 = X.C78693sW.class
            java.lang.NullPointerException r0 = X.C36321k7.A04(r0)
            throw r0
        L_0x00d0:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d2 }
        L_0x00d2:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x00d7 }
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78693sW.BmI(X.3T1, X.2qQ):void");
    }
}
