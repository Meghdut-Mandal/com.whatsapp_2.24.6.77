package X;

/* renamed from: X.1XZ  reason: invalid class name */
public final class AnonymousClass1XZ {
    public final AnonymousClass12P A00;
    public final C219712j A01;

    public AnonymousClass1XZ(C219712j r2, AnonymousClass12P r3) {
        AnonymousClass00C.A0D(r2, 1);
        AnonymousClass00C.A0D(r3, 2);
        this.A01 = r2;
        this.A00 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0066, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0069, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006a, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C63483Kf A00(long r8) {
        /*
            r7 = this;
            X.12P r0 = r7.A00
            X.1M0 r3 = r0.get()
            X.14e r5 = r3.A02     // Catch:{ all -> 0x0067 }
            java.lang.String r4 = "SELECT target_id, message_state, invoker_jid_row_id FROM bot_message_info WHERE message_row_id= ?"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x0067 }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x0067 }
            r2[r1] = r0     // Catch:{ all -> 0x0067 }
            java.lang.String r0 = "GET_BOT_MESSAGE_INFO_BY_ROW_ID"
            android.database.Cursor r5 = r5.A09(r4, r0, r2)     // Catch:{ all -> 0x0067 }
            boolean r0 = r5.moveToNext()     // Catch:{ all -> 0x0060 }
            r2 = 0
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = "target_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0060 }
            java.lang.String r6 = r5.getString(r0)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "message_state"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0060 }
            int r4 = r5.getInt(r0)     // Catch:{ all -> 0x0060 }
            java.lang.String r0 = "invoker_jid_row_id"
            int r0 = r5.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0060 }
            long r1 = r5.getLong(r0)     // Catch:{ all -> 0x0060 }
            X.12j r0 = r7.A01     // Catch:{ all -> 0x0060 }
            com.whatsapp.jid.Jid r2 = r0.A09(r1)     // Catch:{ all -> 0x0060 }
            X.AnonymousClass00C.A0B(r6)     // Catch:{ all -> 0x0060 }
            X.2of[] r0 = X.C51962of.values()     // Catch:{ all -> 0x0060 }
            r1 = r0[r4]     // Catch:{ all -> 0x0060 }
            X.13r r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ all -> 0x0060 }
            com.whatsapp.jid.UserJid r0 = X.C222813r.A00(r2)     // Catch:{ all -> 0x0060 }
            X.3Kf r2 = new X.3Kf     // Catch:{ all -> 0x0060 }
            r2.<init>(r0, r1, r6)     // Catch:{ all -> 0x0060 }
        L_0x0059:
            r5.close()     // Catch:{ all -> 0x0067 }
            r3.close()
            return r2
        L_0x0060:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0062 }
        L_0x0062:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0067 }
            throw r0     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0069 }
        L_0x0069:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XZ.A00(long):X.3Kf");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0022, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(long r8) {
        /*
            r7 = this;
            X.12P r0 = r7.A00
            X.1M0 r6 = r0.A05()
            java.lang.String r5 = "message_row_id = ?"
            X.14e r4 = r6.A02     // Catch:{ all -> 0x001f }
            java.lang.String r3 = "bot_message_info"
            r0 = 1
            java.lang.String[] r2 = new java.lang.String[r0]     // Catch:{ all -> 0x001f }
            r1 = 0
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ all -> 0x001f }
            r2[r1] = r0     // Catch:{ all -> 0x001f }
            java.lang.String r0 = "DELETE_BOT_MESSAGE_INFO"
            r4.A03(r3, r5, r0, r2)     // Catch:{ all -> 0x001f }
            r6.close()
            return
        L_0x001f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0021 }
        L_0x0021:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XZ.A01(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x004e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x004f, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0052, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.C63483Kf r7, long r8) {
        /*
            r6 = this;
            X.12P r0 = r6.A00
            X.1M0 r4 = r0.A05()
            r0 = 3
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x004c }
            r5.<init>(r0)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "message_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x004c }
            r5.put(r1, r0)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "target_id"
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x004c }
            r5.put(r1, r0)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "message_state"
            X.2of r0 = r7.A01     // Catch:{ all -> 0x004c }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x004c }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x004c }
            r5.put(r1, r0)     // Catch:{ all -> 0x004c }
            com.whatsapp.jid.UserJid r1 = r7.A00     // Catch:{ all -> 0x004c }
            if (r1 == 0) goto L_0x003e
            X.12j r0 = r6.A01     // Catch:{ all -> 0x004c }
            long r2 = r0.A07(r1)     // Catch:{ all -> 0x004c }
            java.lang.String r1 = "invoker_jid_row_id"
            java.lang.Long r0 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x004c }
            r5.put(r1, r0)     // Catch:{ all -> 0x004c }
        L_0x003e:
            X.14e r3 = r4.A02     // Catch:{ all -> 0x004c }
            java.lang.String r2 = "bot_message_info"
            r1 = 5
            java.lang.String r0 = "INSERT_OR_UPDATE_BOT_MESSAGE_INFO"
            r3.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x004c }
            r4.close()
            return
        L_0x004c:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004e }
        L_0x004e:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1XZ.A02(X.3Kf, long):void");
    }
}
