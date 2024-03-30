package X;

/* renamed from: X.3Fb  reason: invalid class name and case insensitive filesystem */
public final class C62173Fb {
    public final AnonymousClass12P A00;

    public C62173Fb(AnonymousClass12P r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006c, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0070, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0073, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C13540k2 A00(long r14, long r16) {
        /*
            r13 = this;
            X.12P r0 = r13.A00
            X.1M0 r2 = r0.get()
            X.14e r6 = r2.A02     // Catch:{ all -> 0x006d }
            java.lang.String r5 = "SELECT message_row_id, scheduled_reminder_timestamp_ms, chat_row_id FROM scheduled_reminder_message WHERE scheduled_reminder_timestamp_ms >= ? AND scheduled_reminder_timestamp_ms <= ?"
            java.lang.String[] r1 = X.C36441kJ.A1S()     // Catch:{ all -> 0x006d }
            r0 = 0
            X.C36351kA.A1V(r1, r0, r14)     // Catch:{ all -> 0x006d }
            r0 = 1
            r3 = r16
            X.C36351kA.A1V(r1, r0, r3)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "ScheduledReminderMessageStore/GET_ALL_ACTIVE_SCHEDULED_REMINDERS_BETWEEN_TIMESTAMPS"
            android.database.Cursor r4 = r6.A09(r5, r0, r1)     // Catch:{ all -> 0x006d }
            X.AnonymousClass00C.A08(r4)     // Catch:{ all -> 0x006d }
            java.lang.String r0 = "message_row_id"
            int r6 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "scheduled_reminder_timestamp_ms"
            int r5 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0066 }
            java.lang.String r0 = "chat_row_id"
            int r3 = r4.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0066 }
            X.0k2 r1 = new X.0k2     // Catch:{ all -> 0x0066 }
            r1.<init>()     // Catch:{ all -> 0x0066 }
        L_0x0038:
            boolean r0 = r4.moveToNext()     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x005b
            long r9 = r4.getLong(r6)     // Catch:{ all -> 0x0066 }
            long r11 = r4.getLong(r5)     // Catch:{ all -> 0x0066 }
            boolean r0 = r4.isNull(r3)     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x004e
            r8 = 0
            goto L_0x0052
        L_0x004e:
            java.lang.Long r8 = X.C36361kB.A0k(r4, r3)     // Catch:{ all -> 0x0066 }
        L_0x0052:
            X.3J5 r7 = new X.3J5     // Catch:{ all -> 0x0066 }
            r7.<init>(r8, r9, r11)     // Catch:{ all -> 0x0066 }
            r1.add(r7)     // Catch:{ all -> 0x0066 }
            goto L_0x0038
        L_0x005b:
            X.0k2 r0 = X.AnonymousClass03S.A00(r1)     // Catch:{ all -> 0x0066 }
            r4.close()     // Catch:{ all -> 0x006d }
            r2.close()
            return r0
        L_0x0066:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0068 }
        L_0x0068:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x006d }
            throw r0     // Catch:{ all -> 0x006d }
        L_0x006d:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x006f }
        L_0x006f:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62173Fb.A00(long, long):X.0k2");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(long r7) {
        /*
            r6 = this;
            X.12P r0 = r6.A00
            X.1M0 r5 = r0.A05()
            X.14e r4 = r5.A02     // Catch:{ all -> 0x0019 }
            java.lang.String r3 = "scheduled_reminder_message"
            java.lang.String r2 = "message_row_id = ?"
            java.lang.String[] r1 = X.C36341k9.A1b(r7)     // Catch:{ all -> 0x0019 }
            java.lang.String r0 = "ScheduledReminderMessageStore/DELETE_REMINDER_BY_ROW_ID"
            r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x0019 }
            r5.close()
            return
        L_0x0019:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x001b }
        L_0x001b:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62173Fb.A01(long):void");
    }
}
