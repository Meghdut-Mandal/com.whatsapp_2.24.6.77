package X;

/* renamed from: X.3gj  reason: invalid class name and case insensitive filesystem */
public final class C71413gj implements C159417jK {
    public final C602937g A00;
    public final C20810yC A01;
    public final C21010yW A02;

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0158, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        X.C05600Qi.A00(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x015c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0160, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0163, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0166, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x016a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x016d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x016e, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0171, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BV1() {
        /*
            r30 = this;
            r6 = r30
            X.0yC r1 = r6.A01
            r0 = 7143(0x1be7, float:1.001E-41)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x004f
            X.37g r5 = r6.A00
            X.17T r4 = r5.A02
            X.0wo r0 = r5.A00
            long r2 = X.C19970wo.A00(r0)
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 - r0
            long r2 = r4.A02(r2)
            r11 = 0
            java.lang.Long r4 = java.lang.Long.valueOf(r11)
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x0050
            X.011 r1 = new X.011
            r1.<init>(r4, r4)
        L_0x002d:
            java.lang.Object r0 = r1.first
            long r4 = X.C36431kI.A09(r0)
            java.lang.Object r0 = r1.second
            long r2 = X.C36431kI.A09(r0)
            X.2Og r1 = new X.2Og
            r1.<init>()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.A00 = r0
            X.0yW r0 = r6.A02
            r0.Bly(r1)
        L_0x004f:
            return
        L_0x0050:
            r10 = 90
            java.util.ArrayList r9 = X.AnonymousClass001.A0I()
            X.12P r8 = r5.A01
            X.1M0 r5 = r8.get()
            X.14e r7 = r5.A02     // Catch:{ all -> 0x016b }
            java.lang.String r4 = "SELECT DISTINCT(chat_row_id) AS chat_row_id FROM message_view WHERE _id > ? AND message_type = ? LIMIT 100"
            java.lang.String[] r1 = X.C36441kJ.A1S()     // Catch:{ all -> 0x016b }
            r0 = 0
            X.C36351kA.A1V(r1, r0, r2)     // Catch:{ all -> 0x016b }
            r0 = 1
            X.C36431kI.A1O(r1, r10, r0)     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "GET_CHAT_ROW_IDS_HAVING_CALL_LOG_MESSAGE_AFTER_ROW_ID_SQL"
            android.database.Cursor r4 = r7.A09(r4, r0, r1)     // Catch:{ all -> 0x016b }
            java.lang.String r0 = "chat_row_id"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0164 }
        L_0x0078:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0164 }
            if (r0 == 0) goto L_0x0082
            X.C36351kA.A17(r4, r9, r1)     // Catch:{ all -> 0x0164 }
            goto L_0x0078
        L_0x0082:
            r4.close()     // Catch:{ all -> 0x016b }
            r5.close()
            java.util.Iterator r29 = r9.iterator()
            r27 = 0
            r25 = 0
        L_0x0090:
            boolean r0 = r29.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r7 = r29.next()
            java.lang.Number r7 = (java.lang.Number) r7
            X.C602937g.A04 = r2
            X.C602937g.A05 = r11
            r0 = 99
            X.C602937g.A03 = r0
            r5 = 1
            r24 = 1
        L_0x00a7:
            X.1M0 r4 = r8.get()
            X.14e r11 = r4.A02     // Catch:{ all -> 0x015d }
            java.lang.String r10 = "SELECT _id, message_type ,timestamp FROM message_view WHERE _id > ? AND chat_row_id = ? AND message_type NOT IN (7) ORDER BY sort_id ASC LIMIT ?"
            r0 = 3
            java.lang.String[] r9 = new java.lang.String[r0]     // Catch:{ all -> 0x015d }
            long r0 = X.C602937g.A04     // Catch:{ all -> 0x015d }
            X.C36341k9.A1W(r9, r0)     // Catch:{ all -> 0x015d }
            long r0 = r7.longValue()     // Catch:{ all -> 0x015d }
            X.C36351kA.A1V(r9, r5, r0)     // Catch:{ all -> 0x015d }
            r1 = 2
            java.lang.String r0 = "1000"
            r9[r1] = r0     // Catch:{ all -> 0x015d }
            java.lang.String r0 = "GET_MESSAGES_AFTER_ROW_ID_FOR_CHATS_HAVING_CALL_LOG_MESSAGES"
            android.database.Cursor r9 = r11.A09(r10, r0, r9)     // Catch:{ all -> 0x015d }
            int r1 = r9.getCount()     // Catch:{ all -> 0x0156 }
            r0 = 1000(0x3e8, float:1.401E-42)
            if (r1 >= r0) goto L_0x00d3
            r24 = 0
        L_0x00d3:
            r13 = 90
            java.lang.String r0 = "_id"
            int r12 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "timestamp"
            int r11 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "message_type"
            int r10 = r9.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0156 }
            r22 = 0
            r20 = 0
        L_0x00eb:
            boolean r0 = r9.moveToNext()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x0120
            int r1 = r9.getInt(r10)     // Catch:{ all -> 0x0156 }
            long r16 = r9.getLong(r12)     // Catch:{ all -> 0x0156 }
            long r18 = r9.getLong(r11)     // Catch:{ all -> 0x0156 }
            long r14 = X.C602937g.A04     // Catch:{ all -> 0x0156 }
            int r0 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r0 >= 0) goto L_0x0105
            r14 = r16
        L_0x0105:
            X.C602937g.A04 = r14     // Catch:{ all -> 0x0156 }
            r16 = 1
            if (r1 != r13) goto L_0x010d
            long r22 = r22 + r16
        L_0x010d:
            long r14 = X.C602937g.A05     // Catch:{ all -> 0x0156 }
            int r0 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x011b
            if (r1 == r13) goto L_0x0119
            int r0 = X.C602937g.A03     // Catch:{ all -> 0x0156 }
            if (r0 != r13) goto L_0x011b
        L_0x0119:
            long r20 = r20 + r16
        L_0x011b:
            X.C602937g.A05 = r18     // Catch:{ all -> 0x0156 }
            X.C602937g.A03 = r1     // Catch:{ all -> 0x0156 }
            goto L_0x00eb
        L_0x0120:
            java.lang.Long r1 = java.lang.Long.valueOf(r22)     // Catch:{ all -> 0x0156 }
            java.lang.Long r0 = java.lang.Long.valueOf(r20)     // Catch:{ all -> 0x0156 }
            X.011 r10 = X.C36441kJ.A19(r1, r0)     // Catch:{ all -> 0x0156 }
            java.lang.Object r0 = r10.first     // Catch:{ all -> 0x0156 }
            long r0 = X.C36431kI.A09(r0)     // Catch:{ all -> 0x0156 }
            long r27 = r27 + r0
            java.lang.Object r0 = r10.second     // Catch:{ all -> 0x0156 }
            long r0 = X.C36431kI.A09(r0)     // Catch:{ all -> 0x0156 }
            long r25 = r25 + r0
            r9.close()     // Catch:{ all -> 0x015d }
            r4.close()
            r11 = 0
            if (r24 == 0) goto L_0x0090
            goto L_0x00a7
        L_0x0148:
            java.lang.Long r1 = java.lang.Long.valueOf(r27)
            java.lang.Long r0 = java.lang.Long.valueOf(r25)
            X.011 r1 = X.C36441kJ.A19(r1, r0)
            goto L_0x002d
        L_0x0156:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0158 }
        L_0x0158:
            r0 = move-exception
            X.C05600Qi.A00(r9, r1)     // Catch:{ all -> 0x015d }
            throw r0     // Catch:{ all -> 0x015d }
        L_0x015d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x015f }
        L_0x015f:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x0164:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0166 }
        L_0x0166:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x016b }
            throw r0     // Catch:{ all -> 0x016b }
        L_0x016b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x016d }
        L_0x016d:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71413gj.BV1():void");
    }

    public C71413gj(C602937g r1, C20810yC r2, C21010yW r3) {
        C36321k7.A0x(r2, r3);
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }
}
