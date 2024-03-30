package X;

/* renamed from: X.1Ft  reason: invalid class name and case insensitive filesystem */
public final class C25301Ft implements AnonymousClass162 {
    public final AnonymousClass163 A00;
    public final AnonymousClass12P A01;
    public final C20810yC A02;
    public final C20520xh A03;
    public final C219712j A04;

    public C25301Ft(AnonymousClass163 r2, C219712j r3, AnonymousClass12P r4, C20810yC r5, C20520xh r6) {
        AnonymousClass00C.A0D(r5, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r2, 3);
        AnonymousClass00C.A0D(r4, 4);
        AnonymousClass00C.A0D(r6, 5);
        this.A02 = r5;
        this.A04 = r3;
        this.A00 = r2;
        this.A01 = r4;
        this.A03 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00da, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00db, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00de, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A01(X.AnonymousClass9XS r8) {
        /*
            r7 = this;
            r0 = 0
            X.AnonymousClass00C.A0D(r8, r0)
            X.12P r0 = r7.A01
            X.1M0 r6 = r0.A05()
            r0 = 12
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ all -> 0x00d8 }
            r4.<init>(r0)     // Catch:{ all -> 0x00d8 }
            X.3Qa r5 = r8.A05     // Catch:{ all -> 0x00d8 }
            X.11F r1 = r5.A00     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x0026
            X.163 r0 = r7.A00     // Catch:{ all -> 0x00d8 }
            long r2 = r0.A08(r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "chat_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00d8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d8 }
        L_0x0026:
            java.lang.String r1 = "from_me"
            boolean r0 = r5.A02     // Catch:{ all -> 0x00d8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r5.A01     // Catch:{ all -> 0x00d8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d8 }
            com.whatsapp.jid.Jid r1 = r8.A04     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x004b
            X.12j r0 = r7.A04     // Catch:{ all -> 0x00d8 }
            long r2 = r0.A07(r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "sender_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00d8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d8 }
        L_0x004b:
            X.3Qa r2 = r8.A06     // Catch:{ all -> 0x00d8 }
            if (r2 == 0) goto L_0x0074
            java.lang.String r1 = "parent_key_id"
            java.lang.String r0 = r2.A01     // Catch:{ all -> 0x00d8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "parent_from_me"
            boolean r0 = r2.A02     // Catch:{ all -> 0x00d8 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d8 }
            X.11F r1 = r2.A00     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x0074
            X.163 r0 = r7.A00     // Catch:{ all -> 0x00d8 }
            long r2 = r0.A08(r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "parent_chat_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00d8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d8 }
        L_0x0074:
            com.whatsapp.jid.Jid r1 = r8.A03     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x0087
            X.12j r0 = r7.A04     // Catch:{ all -> 0x00d8 }
            long r2 = r0.A07(r1)     // Catch:{ all -> 0x00d8 }
            java.lang.String r1 = "parent_sender_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x00d8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d8 }
        L_0x0087:
            java.lang.String r2 = "timestamp"
            long r0 = r8.A02     // Catch:{ all -> 0x00d8 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            r4.put(r2, r0)     // Catch:{ all -> 0x00d8 }
            byte[] r1 = r8.A08     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x00cd
            java.lang.String r0 = "orphan_message_data"
            r4.put(r0, r1)     // Catch:{ all -> 0x00d8 }
        L_0x009b:
            java.lang.String r1 = "orphan_message_type"
            int r0 = r8.A01     // Catch:{ all -> 0x00d8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d8 }
            byte[] r1 = r8.A09     // Catch:{ all -> 0x00d8 }
            if (r1 == 0) goto L_0x00af
            java.lang.String r0 = "orphan_message_stanza_data"
            r4.put(r0, r1)     // Catch:{ all -> 0x00d8 }
        L_0x00af:
            java.lang.String r1 = "orphan_message_reason"
            int r0 = r8.A00     // Catch:{ all -> 0x00d8 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x00d8 }
            r4.put(r1, r0)     // Catch:{ all -> 0x00d8 }
            X.14e r3 = r6.A02     // Catch:{ all -> 0x00d8 }
            java.lang.String r2 = "message_orphan"
            r1 = 5
            java.lang.String r0 = "MessageOrphanStore/insertMessageOrphan"
            long r4 = r3.A08(r2, r0, r4, r1)     // Catch:{ all -> 0x00d8 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 6
            if (r1 <= 0) goto L_0x00d4
            goto L_0x00d3
        L_0x00cd:
            java.lang.String r0 = "MessageOrphanStore/insertMessageOrphan/orphanMessageData is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x00d8 }
            goto L_0x009b
        L_0x00d3:
            r0 = 4
        L_0x00d4:
            r6.close()
            return r0
        L_0x00d8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00da }
        L_0x00da:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25301Ft.A01(X.9XS):int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00fc, code lost:
        if (r5.getInt(r11.intValue()) != 1) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x00bc, code lost:
        if (r5.getInt(r15.intValue()) != 1) goto L_0x00be;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.ArrayList A00(android.database.Cursor r38, int r39) {
        /*
            r37 = this;
            java.util.ArrayList r24 = new java.util.ArrayList
            r24.<init>()
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String[] r0 = X.C73903kk.A00
            r5 = r38
            X.C224014d.A02(r5, r1, r0)
            java.lang.String r0 = "_id"
            java.lang.Object r23 = r1.get(r0)
            X.C18740tg.A06(r23)
            r0 = r23
            java.lang.Number r0 = (java.lang.Number) r0
            r23 = r0
            java.lang.String r0 = "chat_row_id"
            java.lang.Object r22 = r1.get(r0)
            r0 = r22
            java.lang.Number r0 = (java.lang.Number) r0
            r22 = r0
            java.lang.String r0 = "from_me"
            java.lang.Object r15 = r1.get(r0)
            java.lang.Number r15 = (java.lang.Number) r15
            java.lang.String r0 = "key_id"
            java.lang.Object r21 = r1.get(r0)
            X.C18740tg.A06(r21)
            r0 = r21
            java.lang.Number r0 = (java.lang.Number) r0
            r21 = r0
            java.lang.String r0 = "sender_jid_row_id"
            java.lang.Object r13 = r1.get(r0)
            java.lang.Number r13 = (java.lang.Number) r13
            java.lang.String r0 = "parent_chat_row_id"
            java.lang.Object r12 = r1.get(r0)
            java.lang.Number r12 = (java.lang.Number) r12
            java.lang.String r0 = "parent_from_me"
            java.lang.Object r11 = r1.get(r0)
            java.lang.Number r11 = (java.lang.Number) r11
            java.lang.String r0 = "parent_key_id"
            java.lang.Object r9 = r1.get(r0)
            java.lang.Number r9 = (java.lang.Number) r9
            java.lang.String r0 = "parent_sender_jid_row_id"
            java.lang.Object r8 = r1.get(r0)
            java.lang.Number r8 = (java.lang.Number) r8
            java.lang.String r0 = "timestamp"
            java.lang.Object r6 = r1.get(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            java.lang.String r0 = "orphan_message_data"
            java.lang.Object r4 = r1.get(r0)
            java.lang.Number r4 = (java.lang.Number) r4
            java.lang.String r0 = "orphan_message_stanza_data"
            java.lang.Object r3 = r1.get(r0)
            java.lang.Number r3 = (java.lang.Number) r3
            java.lang.String r0 = "orphan_message_reason"
            java.lang.Object r2 = r1.get(r0)
            java.lang.Number r2 = (java.lang.Number) r2
        L_0x008b:
            boolean r0 = r5.moveToNext()
            if (r0 == 0) goto L_0x0182
            X.AnonymousClass00C.A0B(r23)
            int r0 = r23.intValue()
            long r19 = r5.getLong(r0)
            if (r22 == 0) goto L_0x017f
            int r0 = r22.intValue()
            int r0 = r5.getInt(r0)
        L_0x00a6:
            r7 = r37
            X.163 r10 = r7.A00
            long r0 = (long) r0
            X.11F r18 = r10.A0A(r0)
            r1 = 1
            if (r15 == 0) goto L_0x00be
            int r0 = r15.intValue()
            int r0 = r5.getInt(r0)
            r17 = 1
            if (r0 == r1) goto L_0x00c0
        L_0x00be:
            r17 = 0
        L_0x00c0:
            X.AnonymousClass00C.A0B(r21)
            int r0 = r21.intValue()
            java.lang.String r16 = r5.getString(r0)
            X.AnonymousClass00C.A08(r16)
            if (r13 == 0) goto L_0x017c
            int r0 = r13.intValue()
            int r0 = r5.getInt(r0)
        L_0x00d8:
            X.12j r7 = r7.A04
            long r0 = (long) r0
            com.whatsapp.jid.Jid r26 = r7.A09(r0)
            if (r9 == 0) goto L_0x017a
            if (r12 == 0) goto L_0x0177
            int r0 = r12.intValue()
            int r0 = r5.getInt(r0)
        L_0x00eb:
            long r0 = (long) r0
            X.11F r14 = r10.A0A(r0)
            if (r11 == 0) goto L_0x00fe
            int r0 = r11.intValue()
            int r10 = r5.getInt(r0)
            r1 = 1
            r0 = 1
            if (r10 == r1) goto L_0x00ff
        L_0x00fe:
            r0 = 0
        L_0x00ff:
            int r1 = r9.intValue()
            java.lang.String r1 = r5.getString(r1)
            X.AnonymousClass00C.A08(r1)
            X.3Qa r10 = new X.3Qa
            r10.<init>(r14, r1, r0)
        L_0x010f:
            if (r8 == 0) goto L_0x0175
            int r0 = r8.intValue()
            int r0 = r5.getInt(r0)
        L_0x0119:
            long r0 = (long) r0
            com.whatsapp.jid.Jid r27 = r7.A09(r0)
            if (r6 == 0) goto L_0x0172
            int r0 = r6.intValue()
            long r35 = r5.getLong(r0)
        L_0x0128:
            if (r4 == 0) goto L_0x016f
            int r0 = r4.intValue()
            byte[] r31 = r5.getBlob(r0)
        L_0x0132:
            if (r3 == 0) goto L_0x016c
            int r0 = r3.intValue()
            byte[] r32 = r5.getBlob(r0)
        L_0x013c:
            if (r2 == 0) goto L_0x0169
            int r0 = r2.intValue()
            int r34 = r5.getInt(r0)
        L_0x0146:
            java.lang.Long r30 = java.lang.Long.valueOf(r19)
            X.3Qa r14 = new X.3Qa
            r7 = r18
            r1 = r16
            r0 = r17
            r14.<init>(r7, r1, r0)
            X.9XS r0 = new X.9XS
            r33 = r39
            r25 = r0
            r28 = r14
            r29 = r10
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            r1 = r24
            r1.add(r0)
            goto L_0x008b
        L_0x0169:
            r34 = 0
            goto L_0x0146
        L_0x016c:
            r32 = 0
            goto L_0x013c
        L_0x016f:
            r31 = 0
            goto L_0x0132
        L_0x0172:
            r35 = 0
            goto L_0x0128
        L_0x0175:
            r0 = -1
            goto L_0x0119
        L_0x0177:
            r0 = -1
            goto L_0x00eb
        L_0x017a:
            r10 = 0
            goto L_0x010f
        L_0x017c:
            r0 = -1
            goto L_0x00d8
        L_0x017f:
            r0 = -1
            goto L_0x00a6
        L_0x0182:
            return r24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25301Ft.A00(android.database.Cursor, int):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0042, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0046, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0049, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A02(int r7, int r8, long r9) {
        /*
            r6 = this;
            X.12P r0 = r6.A01
            X.1M0 r3 = r0.get()
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x0043 }
            r1 = 0
            X.AnonymousClass00C.A0D(r3, r1)     // Catch:{ all -> 0x0043 }
            X.14e r5 = r3.A02     // Catch:{ all -> 0x0043 }
            java.lang.String r4 = X.C56632wd.A00     // Catch:{ all -> 0x0043 }
            r0 = 3
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x0043 }
            r2[r1] = r0     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0043 }
            r0 = 1
            r2[r0] = r1     // Catch:{ all -> 0x0043 }
            java.lang.String r1 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0043 }
            r0 = 2
            r2[r0] = r1     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "MessageOrphanStore/getMessageOrphansByMessageType"
            android.database.Cursor r2 = r5.A09(r4, r0, r2)     // Catch:{ all -> 0x0043 }
            X.AnonymousClass00C.A08(r2)     // Catch:{ all -> 0x0043 }
            java.util.ArrayList r0 = r6.A00(r2, r7)     // Catch:{ all -> 0x003c }
            r2.close()     // Catch:{ all -> 0x0043 }
            r3.close()
            return r0
        L_0x003c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003e }
        L_0x003e:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0043 }
            throw r0     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25301Ft.A02(int, int, long):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0073, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0077, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007b, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.ArrayList A03(X.C64933Qa r11, int r12, int r13, long r14) {
        /*
            r10 = this;
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.12P r0 = r10.A01
            X.1M0 r3 = r0.get()
            X.AnonymousClass00C.A0B(r3)     // Catch:{ all -> 0x0078 }
            r8 = 0
            X.AnonymousClass00C.A0D(r3, r8)     // Catch:{ all -> 0x0078 }
            r7 = 4
            X.11F r1 = r11.A00     // Catch:{ all -> 0x0078 }
            if (r1 != 0) goto L_0x001d
            java.lang.String r0 = "MessageOrphanStore/getMessageOrphansByMessageTypeForParentKey/chatJid is null; invalid parent key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0078 }
            goto L_0x005f
        L_0x001d:
            X.163 r0 = r10.A00     // Catch:{ all -> 0x0078 }
            long r0 = r0.A08(r1)     // Catch:{ all -> 0x0078 }
            java.lang.String r6 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0078 }
            X.14e r5 = r3.A02     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = X.C56632wd.A01     // Catch:{ all -> 0x0078 }
            r0 = 6
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0078 }
            r2[r8] = r0     // Catch:{ all -> 0x0078 }
            r1 = 1
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ all -> 0x0078 }
            r2[r1] = r0     // Catch:{ all -> 0x0078 }
            r0 = 2
            r2[r0] = r6     // Catch:{ all -> 0x0078 }
            r1 = 3
            boolean r0 = r11.A02     // Catch:{ all -> 0x0078 }
            if (r0 == 0) goto L_0x005c
            java.lang.String r0 = "1"
        L_0x0045:
            r2[r1] = r0     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = r11.A01     // Catch:{ all -> 0x0078 }
            X.AnonymousClass00C.A07(r0)     // Catch:{ all -> 0x0078 }
            r2[r7] = r0     // Catch:{ all -> 0x0078 }
            r1 = 5
            java.lang.String r0 = java.lang.String.valueOf(r13)     // Catch:{ all -> 0x0078 }
            r2[r1] = r0     // Catch:{ all -> 0x0078 }
            java.lang.String r0 = "MessageOrphanStore/getMessageOrphansByMessageTypeForParentKey"
            android.database.Cursor r2 = r5.A09(r4, r0, r2)     // Catch:{ all -> 0x0078 }
            goto L_0x0060
        L_0x005c:
            java.lang.String r0 = "0"
            goto L_0x0045
        L_0x005f:
            r2 = 0
        L_0x0060:
            if (r2 != 0) goto L_0x0066
            r3.close()
            return r9
        L_0x0066:
            java.util.ArrayList r0 = r10.A00(r2, r12)     // Catch:{ all -> 0x0071 }
            r2.close()     // Catch:{ all -> 0x0078 }
            r3.close()
            return r0
        L_0x0071:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0073 }
        L_0x0073:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0078 }
            throw r0     // Catch:{ all -> 0x0078 }
        L_0x0078:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x007a }
        L_0x007a:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25301Ft.A03(X.3Qa, int, int, long):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0043, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0044, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0047, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Blj(X.C176568cK r6) {
        /*
            r5 = this;
            X.12P r0 = r5.A01
            X.1M0 r3 = r0.get()
            X.14e r4 = r3.A02     // Catch:{ all -> 0x0041 }
            java.lang.String r0 = X.C56632wd.A00     // Catch:{ all -> 0x0041 }
            java.lang.String r2 = "SELECT COUNT(1) as orphan_count FROM message_orphan"
            java.lang.String r1 = "MessageOrphanStore/getMessageOrphanCount"
            r0 = 0
            android.database.Cursor r2 = r4.A09(r2, r1, r0)     // Catch:{ all -> 0x0041 }
            boolean r0 = r2.moveToLast()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0033
            java.lang.String r0 = "orphan_count"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x003a }
            int r0 = r2.getInt(r0)     // Catch:{ all -> 0x003a }
            r2.close()     // Catch:{ all -> 0x0041 }
            r3.close()
            if (r0 <= 0) goto L_0x0039
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A08 = r0
            return
        L_0x0033:
            r2.close()     // Catch:{ all -> 0x0041 }
            r3.close()
        L_0x0039:
            return
        L_0x003a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x003c }
        L_0x003c:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0041 }
            throw r0     // Catch:{ all -> 0x0041 }
        L_0x0041:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0043 }
        L_0x0043:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25301Ft.Blj(X.8cK):void");
    }
}
