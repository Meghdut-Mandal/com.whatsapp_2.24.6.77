package X;

/* renamed from: X.1EP  reason: invalid class name */
public final class AnonymousClass1EP {
    public final AnonymousClass12P A00;

    public AnonymousClass1EP(AnonymousClass12P r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0047, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass6A5 A00(long r7) {
        /*
            r6 = this;
            X.12P r0 = r6.A00
            X.1M0 r5 = r0.get()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x004b }
            java.lang.String r3 = "SELECT message_template_id, message_hsm_tag FROM template_messages_metadata WHERE message_row_id = ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x004b }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r7)     // Catch:{ all -> 0x004b }
            r2[r1] = r0     // Catch:{ all -> 0x004b }
            java.lang.String r0 = "GET_METADATA_BY_MESSAGE_ID"
            android.database.Cursor r4 = r4.A09(r3, r0, r2)     // Catch:{ all -> 0x004b }
            X.AnonymousClass00C.A08(r4)     // Catch:{ all -> 0x004b }
            r5.close()
            java.lang.String r0 = "message_template_id"
            int r1 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = "message_hsm_tag"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0044 }
            boolean r0 = r4.moveToLast()     // Catch:{ all -> 0x0044 }
            r2 = 0
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = r4.getString(r1)     // Catch:{ all -> 0x0044 }
            java.lang.String r0 = r4.getString(r3)     // Catch:{ all -> 0x0044 }
            X.6A5 r2 = new X.6A5     // Catch:{ all -> 0x0044 }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x0044 }
        L_0x0040:
            r4.close()
            return r2
        L_0x0044:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0046 }
        L_0x0046:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        L_0x004b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004d }
        L_0x004d:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1EP.A00(long):X.6A5");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0031, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(X.AnonymousClass3T1 r7, java.lang.String r8, java.lang.String r9) {
        /*
            r6 = this;
            X.12P r0 = r6.A00
            X.1M0 r4 = r0.A05()
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x002e }
            r5.<init>()     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "message_row_id"
            long r0 = r7.A1N     // Catch:{ all -> 0x002e }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x002e }
            r5.put(r2, r0)     // Catch:{ all -> 0x002e }
            java.lang.String r0 = "message_template_id"
            r5.put(r0, r8)     // Catch:{ all -> 0x002e }
            java.lang.String r0 = "message_hsm_tag"
            r5.put(r0, r9)     // Catch:{ all -> 0x002e }
            X.14e r3 = r4.A02     // Catch:{ all -> 0x002e }
            java.lang.String r2 = "template_messages_metadata"
            r1 = 5
            java.lang.String r0 = "storeMetadata/INSERT_TEMPLATE_MESSAGES_METADATA"
            r3.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x002e }
            r4.close()
            return
        L_0x002e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0030 }
        L_0x0030:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1EP.A01(X.3T1, java.lang.String, java.lang.String):void");
    }
}
