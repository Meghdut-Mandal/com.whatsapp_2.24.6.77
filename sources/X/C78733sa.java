package X;

/* renamed from: X.3sa  reason: invalid class name and case insensitive filesystem */
public final class C78733sa implements C17820s5 {
    public final AnonymousClass005 A00;
    public final AnonymousClass005 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x013e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0141, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0142, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0145, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BmI(X.AnonymousClass3T1 r18, X.C52942qQ r19) {
        /*
            r17 = this;
            r6 = r18
            X.3Qa r0 = X.AnonymousClass3T1.A06(r6)
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x0146
            com.whatsapp.jid.UserJid r0 = r6.A0L()
            boolean r0 = X.C197029b1.A00(r0)
            if (r0 == 0) goto L_0x0146
            r3 = r17
            X.005 r0 = r3.A00
            java.lang.Object r2 = r0.get()
            X.1XZ r2 = (X.AnonymousClass1XZ) r2
            com.whatsapp.jid.UserJid r0 = r6.A0L()
            boolean r0 = X.C197029b1.A00(r0)
            if (r0 == 0) goto L_0x0031
            long r0 = r6.A1N
            X.3Kf r0 = r2.A00(r0)
            r6.A0r(r0)
        L_0x0031:
            X.005 r0 = r3.A01
            java.lang.Object r2 = r0.get()
            X.1Xp r2 = (X.C29691Xp) r2
            long r0 = r6.A1N
            X.12P r2 = r2.A00
            X.1M0 r5 = r2.get()
            X.14e r3 = r5.A02     // Catch:{ all -> 0x013f }
            java.lang.String r2 = "SELECT search_provider, plugin_type, thumbnail_cdn_url, profile_photo_cdn_url, search_provider_url, search_query, reference_index FROM bot_plugin_metadata WHERE message_row_id = ?"
            java.lang.String[] r1 = X.C36341k9.A1b(r0)     // Catch:{ all -> 0x013f }
            java.lang.String r0 = "GET_BOT_PLUGIN_METADATA_FOR_MSG_ROW_ID_SQL"
            android.database.Cursor r4 = r3.A09(r2, r0, r1)     // Catch:{ all -> 0x013f }
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0138 }
            r16 = 0
            if (r0 == 0) goto L_0x0120
            java.lang.String r0 = "search_provider"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0066
            r8 = r16
            goto L_0x006e
        L_0x0066:
            int r0 = r4.getInt(r1)     // Catch:{ all -> 0x0138 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0138 }
        L_0x006e:
            java.lang.String r0 = "plugin_type"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x007d
            r9 = r16
            goto L_0x0085
        L_0x007d:
            int r0 = r4.getInt(r1)     // Catch:{ all -> 0x0138 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0138 }
        L_0x0085:
            java.lang.String r0 = "thumbnail_cdn_url"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x0094
            r13 = r16
            goto L_0x0098
        L_0x0094:
            java.lang.String r13 = r4.getString(r1)     // Catch:{ all -> 0x0138 }
        L_0x0098:
            java.lang.String r0 = "profile_photo_cdn_url"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x00a7
            r14 = r16
            goto L_0x00ab
        L_0x00a7:
            java.lang.String r14 = r4.getString(r1)     // Catch:{ all -> 0x0138 }
        L_0x00ab:
            java.lang.String r0 = "search_provider_url"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x00ba
            r15 = r16
            goto L_0x00be
        L_0x00ba:
            java.lang.String r15 = r4.getString(r1)     // Catch:{ all -> 0x0138 }
        L_0x00be:
            java.lang.String r0 = "reference_index"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x0138 }
            if (r0 == 0) goto L_0x00cd
            r12 = r16
            goto L_0x00d5
        L_0x00cd:
            int r0 = r4.getInt(r1)     // Catch:{ all -> 0x0138 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0138 }
        L_0x00d5:
            java.lang.String r0 = "search_query"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0138 }
            boolean r0 = r4.isNull(r1)     // Catch:{ all -> 0x0138 }
            if (r0 != 0) goto L_0x00e5
            java.lang.String r16 = r4.getString(r1)     // Catch:{ all -> 0x0138 }
        L_0x00e5:
            r10 = 0
            if (r8 == 0) goto L_0x00fd
            X.2p5[] r7 = X.C52222p5.values()     // Catch:{ all -> 0x0138 }
            r3 = 0
            int r2 = r7.length     // Catch:{ all -> 0x0138 }
        L_0x00ee:
            if (r3 >= r2) goto L_0x00fd
            r11 = r7[r3]     // Catch:{ all -> 0x0138 }
            int r1 = r11.value     // Catch:{ all -> 0x0138 }
            int r0 = r8.intValue()     // Catch:{ all -> 0x0138 }
            if (r1 == r0) goto L_0x00fe
            int r3 = r3 + 1
            goto L_0x00ee
        L_0x00fd:
            r11 = r10
        L_0x00fe:
            if (r9 == 0) goto L_0x0117
            X.2p4[] r7 = X.C52212p4.values()     // Catch:{ all -> 0x0138 }
            r3 = 0
            int r8 = r7.length     // Catch:{ all -> 0x0138 }
        L_0x0106:
            if (r3 >= r8) goto L_0x0117
            r2 = r7[r3]     // Catch:{ all -> 0x0138 }
            int r1 = r2.value     // Catch:{ all -> 0x0138 }
            int r0 = r9.intValue()     // Catch:{ all -> 0x0138 }
            if (r1 != r0) goto L_0x0113
            goto L_0x0116
        L_0x0113:
            int r3 = r3 + 1
            goto L_0x0106
        L_0x0116:
            r10 = r2
        L_0x0117:
            X.3KQ r9 = new X.3KQ     // Catch:{ all -> 0x0138 }
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0138 }
            r4.close()     // Catch:{ all -> 0x013f }
            goto L_0x0129
        L_0x0120:
            r4.close()     // Catch:{ all -> 0x013f }
            r5.close()
            r9 = r16
            goto L_0x012c
        L_0x0129:
            r5.close()
        L_0x012c:
            r6.A0s(r9)
            if (r19 == 0) goto L_0x0146
            java.lang.Class<X.3sa> r0 = X.C78733sa.class
            java.lang.NullPointerException r0 = X.C36321k7.A04(r0)
            throw r0
        L_0x0138:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x013a }
        L_0x013a:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x013f }
            throw r0     // Catch:{ all -> 0x013f }
        L_0x013f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78733sa.BmI(X.3T1, X.2qQ):void");
    }

    public C78733sa(AnonymousClass005 r1, AnonymousClass005 r2) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
