package X;

import com.whatsapp.R;

/* renamed from: X.6V1  reason: invalid class name */
public final class AnonymousClass6V1 {
    public final AnonymousClass1RU A00;
    public final AnonymousClass1Z0 A01;
    public final C131306On A02;
    public final AnonymousClass3S9 A03;
    public final AnonymousClass6N4 A04;
    public final C21060yb A05;
    public final C19970wo A06;
    public final C19630wG A07;
    public final C21570zS A08;
    public final AnonymousClass1Q6 A09;

    public final String A03(AnonymousClass3KU r7) {
        C19630wG r4 = this.A07;
        Object[] A0L = AnonymousClass001.A0L();
        A0L[0] = this.A00.A04(r7.A07);
        String A022 = r4.A02(R.string.f12nameremoved, A0L);
        AnonymousClass00C.A08(A022);
        return A022;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v41, resolved type: X.09w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: X.03N} */
    /* JADX WARNING: type inference failed for: r0v50, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        X.C05600Qi.A00(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c4, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c7, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cb, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass3KU r28, X.AnonymousClass6V1 r29) {
        /*
            java.lang.String r0 = "InactiveAccountNotificationManager/showMissedCallNotifications"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r5 = r29
            X.6N4 r3 = r5.A04
            r2 = 0
            X.6On r10 = r3.A02
            java.lang.String r0 = "InactiveNotificationsStore/readAllMissedCallNotifications"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "voip_call_offer_1on1"
            java.lang.String r0 = "voip_call_offer_group"
            java.lang.String[] r7 = new java.lang.String[]{r1, r0}
            r1 = 1
            java.lang.String[] r0 = new java.lang.String[r1]
            r6 = r28
            java.lang.String r4 = r6.A08
            r0[r2] = r4
            java.lang.Object[] r8 = X.AnonymousClass02Q.A06(r0, r7)
            java.lang.String[] r7 = new java.lang.String[r1]
            long r0 = r6.A05
            X.C36351kA.A1V(r7, r2, r0)
            java.lang.Object[] r9 = X.AnonymousClass02Q.A06(r8, r7)
            java.lang.String[] r9 = (java.lang.String[]) r9
            X.005 r0 = r10.A00     // Catch:{ all -> 0x00cc }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x00cc }
            X.54Z r0 = (X.AnonymousClass54Z) r0     // Catch:{ all -> 0x00cc }
            X.1M0 r7 = r0.get()     // Catch:{ all -> 0x00cc }
            X.14e r8 = r7.A02     // Catch:{ all -> 0x00c5 }
            java.lang.String r1 = "SELECT account_lid, notification_type, sender_jid, timestamp, group_jid, display_name, sender_pn_jid, COUNT(*) as missed_call_count FROM notifications WHERE account_lid = ? AND notification_type IN (?,?) AND timestamp >= ? AND call_status = 0 GROUP BY notification_type, sender_jid, group_jid ORDER BY MAX(timestamp) DESC"
            java.lang.String r0 = "GET_ALL_CALL_AND_GROUP_CALL_NOTIFICATIONS_SQL"
            android.database.Cursor r1 = r8.A09(r1, r0, r9)     // Catch:{ all -> 0x00c5 }
            X.AnonymousClass00C.A08(r1)     // Catch:{ all -> 0x00c5 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "account_lid"
            int r16 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "notification_type"
            int r15 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "sender_jid"
            int r14 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "timestamp"
            int r13 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "group_jid"
            int r12 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "display_name"
            int r11 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "missed_call_count"
            int r10 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x00be }
            java.lang.String r8 = "sender_pn_jid"
            int r9 = r1.getColumnIndex(r8)     // Catch:{ all -> 0x00be }
        L_0x0080:
            boolean r8 = r1.moveToNext()     // Catch:{ all -> 0x00be }
            if (r8 == 0) goto L_0x00b7
            r8 = r16
            java.lang.String r18 = X.C90494aF.A0Z(r1, r8)     // Catch:{ all -> 0x00be }
            java.lang.String r19 = X.C90494aF.A0Z(r1, r15)     // Catch:{ all -> 0x00be }
            java.lang.String r20 = X.C90494aF.A0Z(r1, r14)     // Catch:{ all -> 0x00be }
            long r26 = r1.getLong(r13)     // Catch:{ all -> 0x00be }
            java.lang.String r22 = r1.getString(r12)     // Catch:{ all -> 0x00be }
            java.lang.String r23 = r1.getString(r11)     // Catch:{ all -> 0x00be }
            long r28 = r1.getLong(r10)     // Catch:{ all -> 0x00be }
            java.lang.String r24 = r1.getString(r9)     // Catch:{ all -> 0x00be }
            r21 = 0
            X.6Ds r8 = new X.6Ds     // Catch:{ all -> 0x00be }
            r25 = 0
            r17 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r28)     // Catch:{ all -> 0x00be }
            r0.add(r8)     // Catch:{ all -> 0x00be }
            goto L_0x0080
        L_0x00b7:
            r1.close()     // Catch:{ all -> 0x00c5 }
            r7.close()     // Catch:{ all -> 0x00cc }
            goto L_0x00d1
        L_0x00be:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = move-exception
            X.C05600Qi.A00(r1, r8)     // Catch:{ all -> 0x00c5 }
            throw r0     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c7 }
        L_0x00c7:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)     // Catch:{ all -> 0x00cc }
            throw r0     // Catch:{ all -> 0x00cc }
        L_0x00cc:
            r0 = move-exception
            X.03N r0 = X.C90524aI.A0t(r0)
        L_0x00d1:
            java.lang.Throwable r7 = X.AnonymousClass0AK.A00(r0)
            if (r7 == 0) goto L_0x00dc
            java.lang.String r1 = "InactiveNotificationsStore/readAllMissedCallNotifications/failed"
            com.whatsapp.util.Log.e(r1, r7)
        L_0x00dc:
            X.09w r7 = X.C023409w.A00
            boolean r1 = r0 instanceof X.AnonymousClass03N
            if (r1 == 0) goto L_0x00e3
            r0 = r7
        L_0x00e3:
            java.util.List r0 = (java.util.List) r0
            java.util.ArrayList r8 = X.AnonymousClass6N4.A00(r6, r3, r0)
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x01e3
            int r0 = r8.size()
            r7 = 1
            if (r0 != r7) goto L_0x01d9
            java.lang.Object r0 = X.C007103b.A0L(r8)
            X.6DT r0 = (X.AnonymousClass6DT) r0
            long r0 = r0.A00
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        L_0x0102:
            X.0wG r11 = r3.A04
            android.content.res.Resources r3 = X.C36421kH.A0B(r11)
            r1 = 2131755238(0x7f1000e6, float:1.914135E38)
            int r0 = X.AnonymousClass000.A0I(r0)
            java.lang.String r13 = r3.getQuantityString(r1, r0)
            X.AnonymousClass00C.A08(r13)
            int r0 = r8.size()
            r10 = 2
            if (r0 != r10) goto L_0x019e
            r3 = 2131891694(0x7f1215ee, float:1.9418115E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.Object r0 = r8.get(r2)
            X.6DT r0 = (X.AnonymousClass6DT) r0
            java.lang.String r0 = r0.A04
            r1[r2] = r0
            java.lang.Object r0 = r8.get(r7)
            X.6DT r0 = (X.AnonymousClass6DT) r0
            java.lang.String r0 = r0.A04
            r1[r7] = r0
            java.lang.String r11 = r11.A02(r3, r1)
        L_0x013a:
            X.AnonymousClass00C.A0B(r11)
            java.lang.CharSequence[] r9 = new java.lang.CharSequence[r10]
            int r8 = r13.length()
            android.text.SpannableString r3 = X.C36441kJ.A0O(r13)
            android.text.style.StyleSpan r1 = new android.text.style.StyleSpan
            r1.<init>(r7)
            r0 = 33
            r3.setSpan(r1, r2, r8, r0)
            r9[r2] = r3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 10
            java.lang.String r0 = X.C90464aC.A0f(r11, r1, r0)
            r9[r7] = r0
            java.lang.CharSequence r10 = android.text.TextUtils.concat(r9)
            r3 = 0
            if (r10 == 0) goto L_0x01e3
            int r0 = r10.length()
            if (r0 == 0) goto L_0x01e3
            r14 = 4
            X.0wG r1 = r5.A07
            android.content.Context r2 = r1.A00
            android.content.Intent r8 = X.AnonymousClass190.A1B(r2, r4, r14, r7)
            X.3S9 r7 = r5.A03
            X.5Tb r0 = X.C108325Tb.MISSED_CALLS
            java.lang.String r11 = A00(r0, r4)
            java.lang.String r12 = r5.A03(r6)
            r0 = 2131886327(0x7f1200f7, float:1.940723E38)
            java.lang.String r1 = r1.A01(r0)
            android.app.PendingIntent r0 = X.C65743Th.A03(r2, r8, r3)
            X.0Wx r9 = new X.0Wx
            r9.<init>(r3, r1, r0)
            r13 = 2131231572(0x7f080354, float:1.8079229E38)
            r16 = 0
            r15 = 0
            r7.A03(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            A02(r6, r5)
            return
        L_0x019e:
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0u()
            java.util.Iterator r12 = r8.iterator()
            r1 = 0
        L_0x01a7:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r12.next()
            int r8 = r1 + 1
            if (r1 >= 0) goto L_0x01ba
            java.lang.RuntimeException r0 = X.C36351kA.A0v()
            throw r0
        L_0x01ba:
            X.6DT r0 = (X.AnonymousClass6DT) r0
            if (r1 != 0) goto L_0x01c5
            java.lang.String r0 = r0.A04
        L_0x01c0:
            r9.append(r0)
            r1 = r8
            goto L_0x01a7
        L_0x01c5:
            r3 = 2131891693(0x7f1215ed, float:1.9418113E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.String r0 = r0.A04
            r1[r2] = r0
            java.lang.String r0 = r11.A02(r3, r1)
            goto L_0x01c0
        L_0x01d3:
            java.lang.String r11 = X.C36381kD.A0y(r9)
            goto L_0x013a
        L_0x01d9:
            int r0 = r8.size()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0102
        L_0x01e3:
            java.lang.String r0 = "InactiveAccountNotificationManager/showMissedCallNotifications/no missed call notifications to show"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V1.A01(X.3KU, X.6V1):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.3KU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.3KU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.3KU} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: X.3KU} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.AnonymousClass3KU r8, X.AnonymousClass6V1 r9) {
        /*
            java.lang.String r0 = "InactiveAccountNotificationManager/updateShouldBadge"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Z0 r4 = r9.A01
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactiveBadgeCount/"
            r1.append(r0)
            java.lang.String r8 = r8.A08
            java.lang.String r0 = X.AnonymousClass3LV.A01(r8)
            X.C36321k7.A1a(r1, r0)
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            X.6C2 r6 = X.AnonymousClass1Z0.A00(r4)
            java.util.List r0 = r6.A01
            r5.addAll(r0)
            boolean r0 = X.AnonymousClass1Z0.A02(r8, r5)
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactiveBadgeCount/Account doesn't exists"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0031:
            X.1Q6 r0 = r9.A09
            java.util.Iterator r1 = X.C36361kB.A0s(r0)
        L_0x0037:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00ac
            java.lang.Object r0 = r1.next()
            X.1RW r0 = (X.AnonymousClass1RW) r0
            r0.A00()
            goto L_0x0037
        L_0x0047:
            java.util.Iterator r2 = r5.iterator()
        L_0x004b:
            boolean r0 = r2.hasNext()
            r7 = 0
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3KU r0 = (X.AnonymousClass3KU) r0
            java.lang.String r0 = r0.A08
            boolean r0 = X.AnonymousClass00C.A0J(r0, r8)
            if (r0 == 0) goto L_0x004b
        L_0x0061:
            X.3KU r1 = (X.AnonymousClass3KU) r1
            if (r1 == 0) goto L_0x00a8
            int r0 = r1.A00
            int r0 = r0 + 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
        L_0x006d:
            java.util.Iterator r2 = r5.iterator()
        L_0x0071:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3KU r0 = (X.AnonymousClass3KU) r0
            java.lang.String r0 = r0.A08
            boolean r0 = X.AnonymousClass00C.A0J(r0, r8)
            if (r0 == 0) goto L_0x0071
            r7 = r1
        L_0x0087:
            X.3KU r7 = (X.AnonymousClass3KU) r7
            if (r7 == 0) goto L_0x0091
            int r0 = X.C90484aE.A0B(r3)
            r7.A00 = r0
        L_0x0091:
            java.lang.String r3 = r6.A00
            boolean r2 = r6.A03
            boolean r1 = r6.A02
            X.6C2 r0 = new X.6C2
            r0.<init>(r3, r5, r2, r1)
            boolean r0 = X.AnonymousClass1Z0.A01(r0, r4)
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = "AccountSwitchingDataRepo/incrementInactiveBadgeCount/Failed to update inactiveAccounts"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0031
        L_0x00a8:
            r3 = r7
            goto L_0x006d
        L_0x00aa:
            r1 = r7
            goto L_0x0061
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V1.A02(X.3KU, X.6V1):void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.09w} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v12, resolved type: X.03N} */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008a, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.C05600Qi.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008e, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0091, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        X.C05600Qi.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0095, code lost:
        throw r0;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "InactiveAccountNotificationManager/clearRenderedNotificationsForAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Tb r4 = X.C108325Tb.RINGING_CALL
            java.util.List r7 = X.C36371kC.A11(r4)
            X.5Tb[] r6 = X.C108325Tb.values()
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            int r3 = r6.length
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x0023
            r1 = r6[r2]
            boolean r0 = r7.contains(r1)
            X.C36391kE.A1V(r1, r5, r0)
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0023:
            java.util.Iterator r2 = r5.iterator()
        L_0x0027:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r2.next()
            X.5Tb r0 = (X.C108325Tb) r0
            X.3S9 r1 = r8.A03
            java.lang.String r0 = A00(r0, r9)
            r1.A05(r0)
            goto L_0x0027
        L_0x003d:
            X.6On r2 = r8.A02
            r1 = 0
            java.lang.String r0 = "InactiveNotificationsStore/readRingingCallIds"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String[] r3 = X.C36441kJ.A1S()
            r3[r1] = r9
            r1 = 1
            java.lang.String r0 = "1"
            r3[r1] = r0
            X.005 r0 = r2.A00     // Catch:{ all -> 0x0096 }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x0096 }
            X.54Z r0 = (X.AnonymousClass54Z) r0     // Catch:{ all -> 0x0096 }
            X.1M0 r5 = r0.get()     // Catch:{ all -> 0x0096 }
            X.14e r2 = r5.A02     // Catch:{ all -> 0x008f }
            java.lang.String r1 = "SELECT call_id FROM notifications WHERE account_lid = ? AND call_status = ? "
            java.lang.String r0 = "GET_CALL_IDS_FOR_LID"
            android.database.Cursor r3 = r2.A09(r1, r0, r3)     // Catch:{ all -> 0x008f }
            X.AnonymousClass00C.A08(r3)     // Catch:{ all -> 0x008f }
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()     // Catch:{ all -> 0x0088 }
            java.lang.String r0 = "call_id"
            int r1 = r3.getColumnIndex(r0)     // Catch:{ all -> 0x0088 }
        L_0x0073:
            boolean r0 = r3.moveToNext()     // Catch:{ all -> 0x0088 }
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = X.C90494aF.A0Z(r3, r1)     // Catch:{ all -> 0x0088 }
            r2.add(r0)     // Catch:{ all -> 0x0088 }
            goto L_0x0073
        L_0x0081:
            r3.close()     // Catch:{ all -> 0x008f }
            r5.close()     // Catch:{ all -> 0x0096 }
            goto L_0x009b
        L_0x0088:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x008a }
        L_0x008a:
            r0 = move-exception
            X.C05600Qi.A00(r3, r1)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0091 }
        L_0x0091:
            r0 = move-exception
            X.C05600Qi.A00(r5, r1)     // Catch:{ all -> 0x0096 }
            throw r0     // Catch:{ all -> 0x0096 }
        L_0x0096:
            r0 = move-exception
            X.03N r2 = X.C90524aI.A0t(r0)
        L_0x009b:
            java.lang.Throwable r1 = X.AnonymousClass0AK.A00(r2)
            if (r1 == 0) goto L_0x00a6
            java.lang.String r0 = "InactiveNotificationsStore/readRingingCallIds/failed"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00a6:
            X.09w r1 = X.C023409w.A00
            boolean r0 = r2 instanceof X.AnonymousClass03N
            if (r0 == 0) goto L_0x00ad
            r2 = r1
        L_0x00ad:
            java.util.Iterator r3 = X.C90514aH.A13(r2)
        L_0x00b1:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00d2
            java.lang.String r1 = X.AnonymousClass001.A0C(r3)
            java.lang.String r0 = "InactiveAccountNotificationManager/clearRenderedNotificationsForAccount/cleared ringing call notification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3S9 r2 = r8.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r1)
            java.lang.String r0 = A00(r4, r9)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            r2.A05(r0)
            goto L_0x00b1
        L_0x00d2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6V1.A04(java.lang.String):void");
    }

    public AnonymousClass6V1(AnonymousClass1RU r2, AnonymousClass1Z0 r3, C131306On r4, AnonymousClass1Q6 r5, AnonymousClass3S9 r6, AnonymousClass6N4 r7, C21060yb r8, C19970wo r9, C19630wG r10, C21570zS r11) {
        C36321k7.A1B(r9, r10, r8, r2, r11);
        AnonymousClass00C.A0D(r3, 7);
        C36321k7.A14(r4, r6, r5);
        this.A06 = r9;
        this.A07 = r10;
        this.A05 = r8;
        this.A00 = r2;
        this.A08 = r11;
        this.A04 = r7;
        this.A01 = r3;
        this.A02 = r4;
        this.A03 = r6;
        this.A09 = r5;
    }

    public static final String A00(C108325Tb r2, String str) {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(r2.tag);
        return AnonymousClass000.A0q(C18750th.A04(str), A0u);
    }
}
