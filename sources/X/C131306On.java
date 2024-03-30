package X;

import android.content.ContentValues;

/* renamed from: X.6On  reason: invalid class name and case insensitive filesystem */
public final class C131306On {
    public final AnonymousClass005 A00;

    public C131306On(AnonymousClass005 r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0045, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        X.C05600Qi.A00(r6, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0049, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004c, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.lang.String r9, long r10) {
        /*
            r8 = this;
            r7 = 0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "InactiveNotificationsStore/deleteNotificationsForLid/accountLid:"
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = ", lastActiveTsMs: "
            X.C36321k7.A1V(r0, r1, r10)
            X.005 r0 = r8.A00     // Catch:{ all -> 0x0051 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0051 }
            X.54Z r0 = (X.AnonymousClass54Z) r0     // Catch:{ all -> 0x0051 }
            X.1M0 r5 = r0.A04()     // Catch:{ all -> 0x0051 }
            X.71s r6 = r5.B1k()     // Catch:{ all -> 0x004a }
            X.14e r4 = r5.A02     // Catch:{ all -> 0x0043 }
            java.lang.String r3 = "notifications"
            java.lang.String r2 = "account_lid = ? AND timestamp < ?"
            java.lang.String[] r1 = X.C36441kJ.A1S()     // Catch:{ all -> 0x0043 }
            r1[r7] = r9     // Catch:{ all -> 0x0043 }
            r0 = 1
            X.C36351kA.A1V(r1, r0, r10)     // Catch:{ all -> 0x0043 }
            java.lang.String r0 = "DELETE_NOTIFICATIONS_BY_LID_AND_LAST_ACTIVE_TS"
            r4.A03(r3, r2, r0, r1)     // Catch:{ all -> 0x0043 }
            r6.A00()     // Catch:{ all -> 0x0043 }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x0043 }
            r6.close()     // Catch:{ all -> 0x004a }
            r5.close()     // Catch:{ all -> 0x0051 }
            goto L_0x0056
        L_0x0043:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0045 }
        L_0x0045:
            r0 = move-exception
            X.C05600Qi.A00(r6, r1)     // Catch:{ all -> 0x004a }
            throw r0     // Catch:{ all -> 0x004a }
        L_0x004a:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x004c }
        L_0x004c:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0051 }
            throw r0     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)
        L_0x0056:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r0)
            if (r1 == 0) goto L_0x0061
            java.lang.String r0 = "InactiveNotificationsStore/deleteNotificationsForLid/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131306On.A02(java.lang.String, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0050, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0054, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0057, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
        X.C05600Qi.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A03(java.lang.String r13, java.lang.String r14) {
        /*
            r12 = this;
            r2 = 0
            monitor-enter(r12)
            r4 = 0
            r1 = 1
            java.lang.String r0 = "InactiveNotificationsStore/updateCallNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0074 }
            int r0 = r13.length()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x006d
            int r0 = r14.length()     // Catch:{ all -> 0x0074 }
            if (r0 == 0) goto L_0x006d
            android.content.ContentValues r6 = X.C36441kJ.A0E()     // Catch:{ all -> 0x0074 }
            java.lang.String r0 = "call_status"
            X.C36341k9.A0o(r6, r0, r2)     // Catch:{ all -> 0x0074 }
            X.005 r0 = r12.A00     // Catch:{ all -> 0x005c }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x005c }
            X.54Z r0 = (X.AnonymousClass54Z) r0     // Catch:{ all -> 0x005c }
            X.1M0 r2 = r0.A04()     // Catch:{ all -> 0x005c }
            X.71s r3 = r2.B1k()     // Catch:{ all -> 0x0055 }
            X.14e r5 = r2.A02     // Catch:{ all -> 0x004e }
            java.lang.String r7 = "notifications"
            java.lang.String r8 = "account_lid = ? AND call_id = ?"
            java.lang.String[] r10 = X.C36441kJ.A1S()     // Catch:{ all -> 0x004e }
            r10[r4] = r13     // Catch:{ all -> 0x004e }
            r10[r1] = r14     // Catch:{ all -> 0x004e }
            r11 = 5
            java.lang.String r9 = "UPDATE_CALL_NOTIFICATION"
            r5.A02(r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x004e }
            r3.A00()     // Catch:{ all -> 0x004e }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x004e }
            r3.close()     // Catch:{ all -> 0x0055 }
            r2.close()     // Catch:{ all -> 0x005c }
            goto L_0x0061
        L_0x004e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0050 }
        L_0x0050:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x0055 }
            throw r0     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0057 }
        L_0x0057:
            r0 = move-exception
            X.C05600Qi.A00(r2, r1)     // Catch:{ all -> 0x005c }
            throw r0     // Catch:{ all -> 0x005c }
        L_0x005c:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x0074 }
        L_0x0061:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r0)     // Catch:{ all -> 0x0074 }
            if (r1 == 0) goto L_0x0072
            java.lang.String r0 = "InactiveNotificationsStore/updateCallNotification/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0074 }
            goto L_0x0072
        L_0x006d:
            java.lang.String r0 = "InactiveNotificationsStore/updateCallNotification/invalidNotificationData"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0074 }
        L_0x0072:
            monitor-exit(r12)
            return
        L_0x0074:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131306On.A03(java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00bc, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00c0, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00c3, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:?, code lost:
        X.C05600Qi.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00c7, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00ca, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00ce, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01(X.C128816Ds r22) {
        /*
            r21 = this;
            r6 = r21
            monitor-enter(r6)
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00e1 }
            r8 = r22
            java.lang.String r10 = r8.A07     // Catch:{ all -> 0x00e1 }
            java.lang.String r1 = "group_message"
            boolean r0 = X.AnonymousClass00C.A0J(r10, r1)     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "voip_call_offer_group"
            boolean r0 = X.AnonymousClass00C.A0J(r10, r0)     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x002d
        L_0x001c:
            java.lang.String r0 = r8.A06     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x0026
            int r0 = r0.length()     // Catch:{ all -> 0x00e1 }
            if (r0 != 0) goto L_0x002d
        L_0x0026:
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification/invalidNotificationData"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00e1 }
            goto L_0x00df
        L_0x002d:
            X.005 r0 = r6.A00     // Catch:{ all -> 0x00cf }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00cf }
            X.54Z r0 = (X.AnonymousClass54Z) r0     // Catch:{ all -> 0x00cf }
            X.1M0 r5 = r0.A04()     // Catch:{ all -> 0x00cf }
            X.71s r4 = r5.B1k()     // Catch:{ all -> 0x00c8 }
            X.14e r3 = r5.A02     // Catch:{ all -> 0x00c1 }
            java.lang.String r2 = "notifications"
            java.lang.String r0 = "message"
            boolean r0 = X.AnonymousClass00C.A0J(r10, r0)     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x005f
            boolean r0 = X.AnonymousClass00C.A0J(r10, r1)     // Catch:{ all -> 0x00c1 }
            if (r0 != 0) goto L_0x005f
            android.content.ContentValues r7 = A00(r8)     // Catch:{ all -> 0x00c1 }
        L_0x0053:
            r1 = 5
            java.lang.String r0 = "INSERT_INACTIVE_NOTIFICATION"
            r3.A08(r2, r0, r7, r1)     // Catch:{ all -> 0x00c1 }
            r4.A00()     // Catch:{ all -> 0x00c1 }
            X.0AJ r0 = X.AnonymousClass0AJ.A00     // Catch:{ all -> 0x00c1 }
            goto L_0x00b3
        L_0x005f:
            r0 = 4
            java.lang.String[] r7 = new java.lang.String[r0]     // Catch:{ all -> 0x00c1 }
            java.lang.String r9 = r8.A03     // Catch:{ all -> 0x00c1 }
            X.C36331k8.A1N(r9, r10, r7)     // Catch:{ all -> 0x00c1 }
            java.lang.String r11 = r8.A08     // Catch:{ all -> 0x00c1 }
            r0 = 2
            r7[r0] = r11     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = r8.A06     // Catch:{ all -> 0x00c1 }
            r13 = r1
            if (r1 != 0) goto L_0x0073
            java.lang.String r1 = ""
        L_0x0073:
            r0 = 3
            r7[r0] = r1     // Catch:{ all -> 0x00c1 }
            java.lang.String r1 = "SELECT count FROM notifications WHERE account_lid = ? AND notification_type = ? AND sender_jid = ? AND group_jid = ? "
            java.lang.String r0 = "GET_COUNT_FOR_SENDER_LID_AND_GROUP_JID"
            android.database.Cursor r7 = r3.A09(r1, r0, r7)     // Catch:{ all -> 0x00c1 }
            X.AnonymousClass00C.A08(r7)     // Catch:{ all -> 0x00c1 }
            boolean r0 = r7.moveToNext()     // Catch:{ all -> 0x00ba }
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "count"
            int r0 = r7.getColumnIndex(r0)     // Catch:{ all -> 0x00ba }
            long r0 = r7.getLong(r0)     // Catch:{ all -> 0x00ba }
            goto L_0x0094
        L_0x0092:
            r0 = 0
        L_0x0094:
            r7.close()     // Catch:{ all -> 0x00c1 }
            r19 = 1
            long r19 = r19 + r0
            long r0 = r8.A02     // Catch:{ all -> 0x00c1 }
            java.lang.String r12 = r8.A04     // Catch:{ all -> 0x00c1 }
            int r7 = r8.A00     // Catch:{ all -> 0x00c1 }
            java.lang.String r14 = r8.A05     // Catch:{ all -> 0x00c1 }
            java.lang.String r15 = r8.A09     // Catch:{ all -> 0x00c1 }
            X.6Ds r8 = new X.6Ds     // Catch:{ all -> 0x00c1 }
            r17 = r0
            r16 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r19)     // Catch:{ all -> 0x00c1 }
            android.content.ContentValues r7 = A00(r8)     // Catch:{ all -> 0x00c1 }
            goto L_0x0053
        L_0x00b3:
            r4.close()     // Catch:{ all -> 0x00c8 }
            r5.close()     // Catch:{ all -> 0x00cf }
            goto L_0x00d4
        L_0x00ba:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00bc }
        L_0x00bc:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x00c1 }
            throw r0     // Catch:{ all -> 0x00c1 }
        L_0x00c1:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r0 = move-exception
            X.C05600Qi.A00(r4, r1)     // Catch:{ all -> 0x00c8 }
            throw r0     // Catch:{ all -> 0x00c8 }
        L_0x00c8:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00ca }
        L_0x00ca:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x00cf }
            throw r0     // Catch:{ all -> 0x00cf }
        L_0x00cf:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)     // Catch:{ all -> 0x00e1 }
        L_0x00d4:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r0)     // Catch:{ all -> 0x00e1 }
            if (r1 == 0) goto L_0x00df
            java.lang.String r0 = "InactiveNotificationsStore/insertNotification/failed"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00e1 }
        L_0x00df:
            monitor-exit(r6)
            return
        L_0x00e1:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C131306On.A01(X.6Ds):void");
    }

    public static final ContentValues A00(C128816Ds r3) {
        ContentValues A0E = C36441kJ.A0E();
        A0E.put("account_lid", r3.A03);
        A0E.put("notification_type", r3.A07);
        A0E.put("sender_jid", r3.A08);
        A0E.put("timestamp", Long.valueOf(r3.A02));
        String str = r3.A04;
        if (str != null) {
            A0E.put("call_id", str);
        }
        A0E.put("call_status", Integer.valueOf(r3.A00));
        String str2 = r3.A06;
        if (str2 != null) {
            A0E.put("group_jid", str2);
        }
        String str3 = r3.A05;
        if (str3 != null) {
            A0E.put("display_name", str3);
        }
        A0E.put("count", Long.valueOf(r3.A01));
        String str4 = r3.A09;
        if (str4 != null) {
            A0E.put("sender_pn_jid", str4);
        }
        return A0E;
    }
}
