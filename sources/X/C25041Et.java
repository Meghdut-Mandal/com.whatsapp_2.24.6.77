package X;

/* renamed from: X.1Et  reason: invalid class name and case insensitive filesystem */
public final class C25041Et {
    public final AnonymousClass163 A00;
    public final C220412q A01;
    public final AnonymousClass12P A02;

    public C25041Et(AnonymousClass163 r2, C220412q r3, AnonymousClass12P r4) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        AnonymousClass00C.A0D(r4, 3);
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0077, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(X.AnonymousClass11F r7) {
        /*
            r6 = this;
            r3 = 0
            X.163 r0 = r6.A00
            long r1 = r0.A08(r7)
            r0 = 3
            java.lang.String[] r5 = new java.lang.String[r0]
            java.lang.String r0 = java.lang.String.valueOf(r1)
            r5[r3] = r0
            r1 = 1
            java.lang.String r0 = "147"
            r5[r1] = r0
            java.lang.String r0 = "155"
            r4 = 2
            r5[r4] = r0
            X.12P r0 = r6.A02
            X.1M0 r3 = r0.get()
            X.14e r2 = r3.A02     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = X.C56882x2.A05     // Catch:{ all -> 0x0075 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0075 }
            r1.<init>()     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "SELECT _id FROM message_system JOIN message_view ON message_view._id = message_system.message_row_id WHERE chat_row_id = ? AND message_type = 7 AND "
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "action_type IN "
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = X.AnonymousClass1M2.A00(r4)     // Catch:{ all -> 0x0075 }
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = " ORDER BY sort_id ASC"
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = " LIMIT 1"
            r1.append(r0)     // Catch:{ all -> 0x0075 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0075 }
            java.lang.String r0 = "GET_LAST_SYSTEM_MESSAGE_ID_FOR_WABAI_EDUCATION_MESSAGE"
            android.database.Cursor r2 = r2.A09(r1, r0, r5)     // Catch:{ all -> 0x0075 }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x006e }
            if (r0 == 0) goto L_0x0065
            java.lang.String r0 = "_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x006e }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x006e }
            r2.close()     // Catch:{ all -> 0x0075 }
            r3.close()
            return r0
        L_0x0065:
            r2.close()     // Catch:{ all -> 0x0075 }
            r3.close()
            r0 = -1
            return r0
        L_0x006e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x0075 }
            throw r0     // Catch:{ all -> 0x0075 }
        L_0x0075:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0077 }
        L_0x0077:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25041Et.A00(X.11F):long");
    }
}
