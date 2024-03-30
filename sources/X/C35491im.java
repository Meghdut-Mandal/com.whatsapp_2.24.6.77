package X;

/* renamed from: X.1im  reason: invalid class name and case insensitive filesystem */
public class C35491im implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public C35491im(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x022a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x022f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:?, code lost:
        r1.addSuppressed(r0);
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:34:0x011a, B:51:0x01bf, B:74:0x022b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.A03
            switch(r0) {
                case 0: goto L_0x0050;
                case 1: goto L_0x0066;
                case 2: goto L_0x00ce;
                case 3: goto L_0x00e6;
                case 4: goto L_0x010a;
                case 5: goto L_0x013d;
                case 6: goto L_0x014f;
                case 7: goto L_0x0159;
                case 8: goto L_0x0169;
                case 9: goto L_0x0179;
                case 10: goto L_0x023e;
                case 11: goto L_0x0288;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r11.A00
            X.1b9 r3 = (X.C31021b9) r3
            java.lang.String r2 = r11.A02
            java.lang.Object r1 = r11.A01
            X.11F r1 = (X.AnonymousClass11F) r1
            X.1Jh r0 = r3.A06
            X.3KV r8 = r0.A02(r1, r2)
            if (r8 == 0) goto L_0x0065
            long r5 = r8.A03
            X.0wG r0 = r3.A04
            android.content.Context r7 = r0.A00
            java.lang.Class<com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver> r0 = com.whatsapp.schedulecall.ScheduleCallBroadcastReceiver.class
            android.content.Intent r4 = new android.content.Intent
            r4.<init>(r7, r0)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            long r5 = r5 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0041
            java.lang.String r0 = "action_schedule_call_advance_alert"
        L_0x0032:
            r4.setAction(r0)
            long r2 = r8.A02
            int r1 = (int) r2
            r0 = 1610612736(0x60000000, float:3.6893488E19)
            android.app.PendingIntent r0 = X.C65743Th.A01(r7, r1, r4, r0)
            if (r0 == 0) goto L_0x0065
            goto L_0x0044
        L_0x0041:
            java.lang.String r0 = "action_schedule_call"
            goto L_0x0032
        L_0x0044:
            r0.send()     // Catch:{ CanceledException -> 0x0048 }
            goto L_0x004f
        L_0x0048:
            r1 = move-exception
            java.lang.String r0 = "ScheduleCallManager/triggerScheduledCallReminderIfExists "
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x004f:
            return
        L_0x0050:
            java.lang.Object r3 = r11.A00
            X.1NG r3 = (X.AnonymousClass1NG) r3
            java.lang.Object r2 = r11.A01
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r1 = r11.A02
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            X.00f r0 = X.C000400e.A0D()
            r3.A0L(r1, r0, r2)
        L_0x0065:
            return
        L_0x0066:
            java.lang.Object r0 = r11.A00
            X.1NM r0 = (X.AnonymousClass1NM) r0
            java.lang.Object r2 = r11.A01
            android.content.SharedPreferences r2 = (android.content.SharedPreferences) r2
            java.lang.String r7 = r11.A02
            r0.A07()
            java.lang.String r8 = ""
            java.lang.String r1 = r2.getString(r7, r8)
            r9 = 1
            X.AnonymousClass00C.A0D(r1, r9)
            r0 = 44
            r3 = 0
            r10 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.List r1 = X.AnonymousClass099.A0K(r1, r0, r3)
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.Long r0 = X.C202339lc.A04(r1, r3)
            r5 = 0
            if (r0 != 0) goto L_0x00c9
            r3 = 0
        L_0x009b:
            java.lang.Long r0 = X.C202339lc.A04(r1, r9)
            if (r0 == 0) goto L_0x00a5
            long r5 = r0.longValue()
        L_0x00a5:
            r0 = 1
            long r3 = r3 + r0
            android.content.SharedPreferences$Editor r2 = r2.edit()
            r0 = 2
            java.lang.Long[] r1 = new java.lang.Long[r0]
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r1[r10] = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r5)
            r1[r9] = r0
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass02R.A09(r0, r8, r8, r1)
            android.content.SharedPreferences$Editor r0 = r2.putString(r7, r0)
            r0.apply()
            return
        L_0x00c9:
            long r3 = r0.longValue()
            goto L_0x009b
        L_0x00ce:
            java.lang.Object r0 = r11.A00
            X.17S r0 = (X.AnonymousClass17S) r0
            java.lang.String r3 = r11.A02
            java.lang.Object r2 = r11.A01
            X.183 r1 = r0.A09
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            java.util.concurrent.ConcurrentHashMap r0 = r1.A00
            r0.put(r3, r2)
            return
        L_0x00e6:
            java.lang.Object r5 = r11.A00
            X.1LW r5 = (X.AnonymousClass1LW) r5
            java.lang.Object r4 = r11.A01
            X.11F r4 = (X.AnonymousClass11F) r4
            java.lang.String r3 = r11.A02
            r2 = 0
            X.12q r1 = r5.A02
            r0 = 0
            X.3Qp r0 = r1.A09(r4, r0)
            if (r0 != 0) goto L_0x0104
            X.3Qp r0 = new X.3Qp
            r0.<init>((X.AnonymousClass11F) r4)
            r0.A0h = r3
            r1.A0I(r0, r4)
        L_0x0104:
            r0.A0h = r3
            X.AnonymousClass1LW.A00(r0, r5, r4, r2)
            return
        L_0x010a:
            java.lang.Object r0 = r11.A00
            X.1Hu r0 = (X.C25821Hu) r0
            java.lang.Object r1 = r11.A01
            X.3T1 r1 = (X.AnonymousClass3T1) r1
            java.lang.String r4 = r11.A02
            X.12P r0 = r0.A01
            X.1M0 r3 = r0.A05()
            android.content.ContentValues r5 = new android.content.ContentValues     // Catch:{ all -> 0x0234 }
            r5.<init>()     // Catch:{ all -> 0x0234 }
            java.lang.String r2 = "message_row_id"
            long r0 = r1.A1N     // Catch:{ all -> 0x0234 }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0234 }
            r5.put(r2, r0)     // Catch:{ all -> 0x0234 }
            java.lang.String r0 = "message_template_id"
            r5.put(r0, r4)     // Catch:{ all -> 0x0234 }
            X.14e r4 = r3.A02     // Catch:{ all -> 0x0234 }
            java.lang.String r2 = "messages_hydrated_four_row_template"
            r1 = 5
            java.lang.String r0 = "addTemplateId/INSERT_MESSAGES_HYDRATED_FOUR_ROW_TEMPLATE"
            r4.A08(r2, r0, r5, r1)     // Catch:{ all -> 0x0234 }
            r3.close()
            return
        L_0x013d:
            java.lang.Object r2 = r11.A00
            X.12i r2 = (X.C219612i) r2
            java.lang.String r0 = "status_distribution"
            java.lang.Object r1 = r11.A01
            X.00r r1 = (X.C001600r) r1
            java.lang.String r0 = r2.A01(r0)
            r1.A0C(r0)
            return
        L_0x014f:
            java.lang.Object r1 = r11.A00
            X.02t r1 = (X.C006302t) r1
            java.lang.Object r0 = r11.A01
            r1.invoke(r0)
            return
        L_0x0159:
            java.lang.Object r0 = r11.A00
            X.1Kl r0 = (X.C26511Kl) r0
            java.lang.String r2 = r11.A02
            java.lang.Object r1 = r11.A01
            byte[] r1 = (byte[]) r1
            X.1Km r0 = r0.A01
            r0.A01(r2, r1)
            return
        L_0x0169:
            java.lang.Object r0 = r11.A00
            X.15B r0 = (X.AnonymousClass15B) r0
            java.lang.Object r2 = r11.A01
            android.content.SharedPreferences$OnSharedPreferenceChangeListener r2 = (android.content.SharedPreferences.OnSharedPreferenceChangeListener) r2
            java.lang.String r1 = r11.A02
            X.0wj r0 = r0.A03
            r2.onSharedPreferenceChanged(r0, r1)
            return
        L_0x0179:
            java.lang.Object r5 = r11.A00
            X.1bW r5 = (X.C31251bW) r5
            java.lang.Object r4 = r11.A01
            X.9uj r4 = (X.C207209uj) r4
            java.lang.String r8 = r11.A02
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "recvmessagelistener/on-revoke-psa stanzaKey="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "; campaignId="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.16F r0 = r5.A06
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            X.12P r0 = r0.A00
            X.1M0 r3 = r0.get()
            X.14e r7 = r3.A02     // Catch:{ all -> 0x0234 }
            java.lang.String r2 = "SELECT message_row_id FROM message_status_psa_campaign WHERE campaign_id = ?"
            r0 = 1
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch:{ all -> 0x0234 }
            r0 = 0
            r1[r0] = r8     // Catch:{ all -> 0x0234 }
            java.lang.String r0 = "GET_STATUS_PSA_CAMPAIGN_FROM_CAMPAIGN_ID"
            android.database.Cursor r2 = r7.A09(r2, r0, r1)     // Catch:{ all -> 0x0234 }
            if (r2 != 0) goto L_0x01bf
            goto L_0x01db
        L_0x01bf:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x022a }
            if (r0 == 0) goto L_0x01d7
            java.lang.String r0 = "message_row_id"
            int r0 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x022a }
            long r0 = r2.getLong(r0)     // Catch:{ all -> 0x022a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x022a }
            r6.add(r0)     // Catch:{ all -> 0x022a }
            goto L_0x01bf
        L_0x01d7:
            r2.close()     // Catch:{ all -> 0x0234 }
            goto L_0x01dc
        L_0x01db:
            r6 = 0
        L_0x01dc:
            r3.close()
            if (r6 != 0) goto L_0x01e5
            r5.A06(r4)
            return
        L_0x01e5:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x01ee:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0212
            java.lang.Object r1 = r6.next()
            java.lang.Number r1 = (java.lang.Number) r1
            X.1A1 r0 = r5.A0B
            long r1 = r1.longValue()
            X.175 r0 = r0.A01
            X.3T1 r2 = r0.A01(r1)
            if (r2 == 0) goto L_0x01ee
            r3.add(r2)
            X.0xM r1 = r5.A03
            r0 = 1
            r1.A0o(r2, r0, r0)
            goto L_0x01ee
        L_0x0212:
            int r0 = r3.size()
            if (r0 <= 0) goto L_0x0226
            X.1DQ r0 = r5.A04
            android.os.Handler r2 = r0.A01
            r1 = 34
            X.1jD r0 = new X.1jD
            r0.<init>(r5, r3, r1)
            r2.post(r0)
        L_0x0226:
            r5.A05(r4)
            return
        L_0x022a:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x022f }
            goto L_0x0233
        L_0x022f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0234 }
        L_0x0233:
            throw r1     // Catch:{ all -> 0x0234 }
        L_0x0234:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0239 }
            throw r1
        L_0x0239:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x023e:
            java.lang.Object r5 = r11.A00
            X.1Ww r5 = (X.C29501Ww) r5
            java.lang.String r6 = r11.A02
            java.lang.Object r3 = r11.A01
            X.17Y r0 = r5.A04
            X.14r r4 = r0.A00
            if (r4 == 0) goto L_0x0276
            boolean r0 = r4.BLh()
            if (r0 != 0) goto L_0x0276
            boolean r0 = r4 instanceof X.C225314u
            if (r0 == 0) goto L_0x0276
            java.lang.String r0 = "RegistrationManager/showVerificationCodeBottomSheetOrNotify/showing sheet for WAOldRegistrationNotification"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.VerificationCodeBottomSheet r3 = com.whatsapp.registration.VerificationCodeBottomSheet.A03(r6)
            X.0yC r2 = r5.A0J
            r1 = 3159(0xc57, float:4.427E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x0272
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r5.A00 = r0
        L_0x0272:
            r4.Btm(r3)
            return
        L_0x0276:
            java.lang.String r0 = "RegistrationManager/showVerificationCodeBottomSheetOrNotify/Couldn't show UI for WAOldRegistrationNotification - showing system notification instead"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wU r2 = r5.A0N
            r1 = 11
            X.1im r0 = new X.1im
            r0.<init>(r5, r3, r6, r1)
            r2.Boy(r0)
            return
        L_0x0288:
            java.lang.Object r4 = r11.A00
            X.1Ww r4 = (X.C29501Ww) r4
            java.lang.String r0 = r11.A02
            java.lang.Object r5 = r11.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            int r9 = r0.length()
            r8 = 2
            int r1 = r9 / r8
            r0 = 45
            r2.insert(r1, r0)
            r7 = 0
            java.lang.String r0 = "‪"
            r2.insert(r7, r0)
            java.lang.String r0 = "‬"
            r2.append(r0)
            java.lang.String r6 = r2.toString()
            X.0yC r2 = r4.A0J
            r1 = 3159(0xc57, float:4.427E-42)
            X.0yV r0 = X.C21000yV.A02
            boolean r0 = X.C20800yB.A01(r0, r2, r1)
            r3 = 1
            if (r0 == 0) goto L_0x02e4
            r1 = 2131895555(0x7f122503, float:1.9425946E38)
            java.lang.Object[] r0 = new java.lang.Object[r3]
            r0[r7] = r6
            java.lang.String r3 = r5.getString(r1, r0)
        L_0x02cd:
            X.1Fq r2 = r4.A0E
            r1 = 53
            r0 = 2131895552(0x7f122500, float:1.942594E38)
            java.lang.String r0 = r5.getString(r0)
            X.0Yy r0 = X.C29501Ww.A00(r4, r0, r3, r3)
            android.app.Notification r0 = r0.A05()
            r2.A02(r1, r0)
            return
        L_0x02e4:
            r2 = 2131895554(0x7f122502, float:1.9425944E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            r1[r7] = r0
            r1[r3] = r6
            java.lang.String r3 = r5.getString(r2, r1)
            goto L_0x02cd
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35491im.run():void");
    }

    public C35491im(C001700s r2, C219612i r3) {
        this.A03 = 5;
        this.A00 = r3;
        this.A02 = "status_distribution";
        this.A01 = r2;
    }
}
