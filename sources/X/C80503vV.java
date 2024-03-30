package X;

/* renamed from: X.3vV  reason: invalid class name and case insensitive filesystem */
public class C80503vV implements Runnable {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public final int A04;

    public C80503vV(Object obj, Object obj2, String str, String str2, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03b0, code lost:
        if (r2 == null) goto L_0x03b2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x02d8 A[Catch:{ Exception -> 0x0331 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x02fe A[Catch:{ Exception -> 0x0331 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r3 = r20
            int r0 = r3.A04
            switch(r0) {
                case 0: goto L_0x04d0;
                case 1: goto L_0x048e;
                case 2: goto L_0x0456;
                case 3: goto L_0x0113;
                case 4: goto L_0x0358;
                case 5: goto L_0x00c5;
                case 6: goto L_0x033f;
                case 7: goto L_0x019c;
                case 8: goto L_0x018a;
                case 9: goto L_0x0058;
                case 10: goto L_0x016c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r4 = r3.A00
            X.3So r4 = (X.C65563So) r4
            java.lang.String r11 = r3.A02
            java.lang.String r12 = r3.A03
            java.lang.Object r2 = r3.A01
            X.4Tk r2 = (X.C88624Tk) r2
            X.3PY r1 = r4.A09
            X.0wG r0 = r4.A05
            android.content.Context r0 = r0.A00
            java.lang.String r13 = r1.A01(r0)
            X.2zj r0 = r4.A00
            X.0w4 r0 = r0.A00
            X.0tq r1 = r0.A00
            X.0yC r8 = X.C36341k9.A0V(r1)
            X.0ww r6 = X.C36381kD.A0U(r1)
            X.0v0 r7 = X.C36351kA.A0Y(r1)
            X.004 r0 = r1.A96
            X.005 r10 = X.C18840tu.A00(r0)
            X.004 r14 = r1.A8I
            X.004 r15 = r1.A0d
            X.004 r0 = r1.A3W
            java.lang.Object r9 = r0.get()
            X.1WF r9 = (X.AnonymousClass1WF) r9
            X.2V6 r5 = new X.2V6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.0wD r0 = r4.A04
            boolean r0 = r0.A09()
            if (r0 == 0) goto L_0x0164
            r1 = 1
            X.3SO r0 = new X.3SO
            r0.<init>(r2, r4, r1)
            r5.Blp(r0)
        L_0x0057:
            return
        L_0x0058:
            java.lang.String r2 = r3.A02
            java.lang.Object r1 = r3.A00
            com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel r1 = (com.whatsapp.settings.notificationsandsounds.NotificationsAndSoundsViewModel) r1
            java.lang.Object r4 = r3.A01
            com.whatsapp.jid.Jid r4 = (com.whatsapp.jid.Jid) r4
            java.lang.String r3 = r3.A03
            int r0 = r2.hashCode()
            switch(r0) {
                case -2060223072: goto L_0x006c;
                case -1739588439: goto L_0x007e;
                case -1308709468: goto L_0x0097;
                case 1504858731: goto L_0x00a9;
                default: goto L_0x006b;
            }
        L_0x006b:
            return
        L_0x006c:
            java.lang.String r0 = "jid_message_vibration"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0057
            X.1CR r1 = r1.A04
            java.lang.String r0 = r4.getRawString()
            X.AnonymousClass1CR.A0A(r1, r0, r3)
            return
        L_0x007e:
            java.lang.String r0 = "jid_call_ringtone"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0057
            X.1CR r2 = r1.A04
            X.3LI r1 = X.C36361kB.A0d(r4, r2)
            java.lang.String r0 = r1.A09
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L_0x0057
            r1.A09 = r3
            goto L_0x00c1
        L_0x0097:
            java.lang.String r0 = "jid_message_tone"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0057
            X.1CR r1 = r1.A04
            java.lang.String r0 = r4.getRawString()
            X.AnonymousClass1CR.A09(r1, r0, r3)
            return
        L_0x00a9:
            java.lang.String r0 = "jid_call_vibration"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0057
            X.1CR r2 = r1.A04
            X.3LI r1 = X.C36361kB.A0d(r4, r2)
            java.lang.String r0 = r1.A0A
            boolean r0 = android.text.TextUtils.equals(r3, r0)
            if (r0 != 0) goto L_0x0057
            r1.A0A = r3
        L_0x00c1:
            X.AnonymousClass1CR.A06(r1, r2)
            return
        L_0x00c5:
            java.lang.Object r5 = r3.A00
            X.2bZ r5 = (X.AnonymousClass2bZ) r5
            java.lang.String r2 = r3.A02
            java.lang.Object r4 = r3.A01
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity r4 = (com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity) r4
            java.lang.String r1 = r3.A03
            if (r5 == 0) goto L_0x00e4
            X.9uk r0 = r5.A00
            if (r0 == 0) goto L_0x00dd
            X.9ui r0 = r0.A01
            if (r0 == 0) goto L_0x00dd
            r0.A06 = r2
        L_0x00dd:
            X.0xM r0 = r4.A05
            if (r0 == 0) goto L_0x04f1
            r0.A0k(r5)
        L_0x00e4:
            java.lang.String r0 = "COMPLETED"
            boolean r0 = r0.equals(r1)
            java.lang.String r2 = "SUCCESS"
            if (r0 != 0) goto L_0x00f4
            boolean r0 = r2.equals(r1)
            if (r0 == 0) goto L_0x0057
        L_0x00f4:
            X.6Ps r3 = X.AnonymousClass9ZG.A00()
            r1 = 1
            java.lang.String r0 = "success_redirect"
            r3.A04(r0, r1)
            r1 = 0
            java.lang.String r0 = "unsuccessful_redirect"
            r3.A04(r0, r1)
            java.lang.String r0 = "transaction_status"
            r3.A03(r0, r2)
            r6 = 0
            java.lang.String r7 = "api_event"
            java.lang.String r8 = "in_app_browser_checkout"
            r9 = 3
            com.whatsapp.payments.ui.P2mLiteOrderDetailsActivity.A07(r3, r4, r5, r6, r7, r8, r9)
            return
        L_0x0113:
            java.lang.Object r5 = r3.A00
            com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver r5 = (com.whatsapp.notification.MessageOtpNotificationBroadcastReceiver) r5
            java.lang.Object r6 = r3.A01
            java.lang.String r0 = r3.A02
            java.lang.String r4 = r3.A03
            X.11F r3 = X.C36421kH.A0N(r0)
            X.1A1 r2 = r5.A03
            r1 = 0
            X.3Qa r0 = new X.3Qa
            r0.<init>(r3, r4, r1)
            X.3T1 r4 = r2.A03(r0)
            X.3P8 r1 = X.AnonymousClass1TF.A00(r4)
            if (r1 == 0) goto L_0x0057
            X.1TF r0 = r5.A02
            boolean r0 = r0.A08(r1)
            if (r0 == 0) goto L_0x0152
            X.17Y r2 = r5.A00
            r0 = 2
            X.AVb r1 = new X.AVb
            r1.<init>(r5, r4, r0)
        L_0x0143:
            r2.A0H(r1)
        L_0x0146:
            X.1Y3 r3 = r5.A01
            com.whatsapp.jid.UserJid r2 = r4.A0L()
            r1 = 2
            r0 = 1
            r3.A01(r2, r1, r0, r0)
            return
        L_0x0152:
            X.1TF r0 = r5.A02
            boolean r0 = r0.A07(r1)
            if (r0 == 0) goto L_0x0146
            X.17Y r2 = r5.A00
            r0 = 22
            X.736 r1 = new X.736
            r1.<init>(r5, r4, r6, r0)
            goto L_0x0143
        L_0x0164:
            java.lang.Integer r0 = X.C36361kB.A0i()
            r2.BXN(r0)
            return
        L_0x016c:
            java.lang.Object r0 = r3.A00
            X.3pE r0 = (X.C76653pE) r0
            java.lang.Object r3 = r3.A01
            android.util.Pair r3 = (android.util.Pair) r3
            X.1V0 r0 = r0.A02
            X.005 r0 = r0.A02
            java.lang.Object r2 = r0.get()
            X.1Uz r2 = (X.C29011Uz) r2
            int r1 = X.C36381kD.A04(r3)
            java.lang.Object r0 = r3.second
            java.lang.String r0 = (java.lang.String) r0
            r2.A03(r0, r1)
            return
        L_0x018a:
            java.lang.Object r4 = r3.A00
            X.2d9 r4 = (X.AnonymousClass2d9) r4
            java.lang.String r2 = r3.A02
            java.lang.String r1 = r3.A03
            java.lang.Object r0 = r3.A01
            X.3OL r0 = (X.AnonymousClass3OL) r0
            java.lang.String r0 = r0.A0U
            r4.A3l(r2, r1, r0)
            return
        L_0x019c:
            java.lang.Object r0 = r3.A00
            X.3Gz r0 = (X.C62653Gz) r0
            java.lang.String r12 = r3.A02
            java.lang.String r11 = r3.A03
            java.lang.Object r1 = r3.A01
            X.4Ta r1 = (X.C88524Ta) r1
            X.0wG r2 = r0.A01
            android.content.Context r3 = r2.A00
            X.6M2 r2 = X.C56442wI.A00
            java.lang.String r13 = r2.A01(r3, r12)
            java.lang.String r2 = "AccountDefenceDataManager/resendDeviceConfirmationNotice"
            com.whatsapp.util.Log.i((java.lang.String) r2)
            X.0v0 r5 = r0.A02
            X.005 r4 = r5.A00
            android.content.SharedPreferences r3 = X.C36391kE.A0H(r4)
            java.lang.String r2 = "com.whatsapp.registration.RegisterPhone.mistyped_state"
            r14 = 0
            java.lang.String r10 = r3.getString(r2, r14)
            X.0yb r2 = r0.A00
            android.telephony.TelephonyManager r3 = r2.A0K()
            if (r3 == 0) goto L_0x01f8
            java.lang.String r2 = r3.getNetworkOperator()
        L_0x01d2:
            X.3St r8 = X.C65603St.A00(r2)
            if (r3 == 0) goto L_0x01f6
            java.lang.String r2 = r3.getSimOperator()
        L_0x01dc:
            X.3St r7 = X.C65603St.A00(r2)
            android.content.SharedPreferences r2 = X.C36391kE.A0H(r4)
            java.lang.String r3 = "reg_attempts_device_confirmation"
            int r2 = X.C36371kC.A01(r2, r3)
            int r2 = r2 + 1
            X.C36321k7.A0q(r5, r3, r2)
            X.3DL r6 = new X.3DL
            r6.<init>(r2, r14)
            r2 = -1
            goto L_0x01fa
        L_0x01f6:
            r2 = r14
            goto L_0x01dc
        L_0x01f8:
            r2 = r14
            goto L_0x01d2
        L_0x01fa:
            X.3UV r5 = r0.A03     // Catch:{ Exception -> 0x0331 }
            android.content.SharedPreferences r9 = X.C36391kE.A0H(r4)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r4 = "registration_failure_reason"
            java.lang.String r3 = ""
            java.lang.String r3 = r9.getString(r4, r3)     // Catch:{ Exception -> 0x0331 }
            r4 = 0
            X.AnonymousClass00C.A0D(r11, r4)     // Catch:{ Exception -> 0x0331 }
            r9 = 1
            X.C36331k8.A1G(r12, r9, r3)     // Catch:{ Exception -> 0x0331 }
            boolean r4 = r5.A0I()     // Catch:{ Exception -> 0x0331 }
            if (r4 != 0) goto L_0x0219
            r16 = 15
            goto L_0x027f
        L_0x0219:
            r5.A0H(r9)     // Catch:{ Exception -> 0x0331 }
            byte[] r17 = r5.A0K(r11, r12)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r4 = "sendAccountDefenceDeviceConfirmation"
            byte[] r18 = r5.A0J(r4)     // Catch:{ Exception -> 0x0331 }
            java.util.LinkedHashMap r4 = X.C36431kI.A1G()     // Catch:{ Exception -> 0x0331 }
            if (r10 == 0) goto L_0x0235
            byte[] r10 = X.C36351kA.A1b(r10)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r9 = "mistyped"
            r4.put(r9, r10)     // Catch:{ Exception -> 0x0331 }
        L_0x0235:
            java.nio.charset.Charset r9 = X.AnonymousClass0S4.A05     // Catch:{ Exception -> 0x0331 }
            byte[] r10 = X.C36371kC.A1Z(r3, r9)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "reason"
            r4.put(r3, r10)     // Catch:{ Exception -> 0x0331 }
            org.json.JSONObject r3 = r6.A00()     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = X.C36381kD.A0y(r3)     // Catch:{ Exception -> 0x0331 }
            byte[] r6 = X.C36371kC.A1Z(r3, r9)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "client_metrics"
            r4.put(r3, r6)     // Catch:{ Exception -> 0x0331 }
            X.AnonymousClass3UV.A0A(r8, r7, r9, r4)     // Catch:{ Exception -> 0x0331 }
            X.AnonymousClass3UV.A03(r5, r4)     // Catch:{ Exception -> 0x0331 }
            X.3Sd r10 = r5.A09     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "send_device_confirm_entrypoint"
            java.lang.String r14 = r5.A0G(r11, r3)     // Catch:{ Exception -> 0x0331 }
            java.util.List r15 = X.AnonymousClass3UV.A02(r5)     // Catch:{ Exception -> 0x0331 }
            X.33T r9 = r5.A08     // Catch:{ Exception -> 0x0331 }
            r19 = 1
            X.4WS r8 = new X.4WS     // Catch:{ Exception -> 0x0331 }
            r16 = r4
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0331 }
            java.lang.Object r13 = X.AnonymousClass3PM.A00(r8)     // Catch:{ Exception -> 0x0331 }
            X.3KC r13 = (X.AnonymousClass3KC) r13     // Catch:{ Exception -> 0x0331 }
            if (r13 != 0) goto L_0x028b
            java.lang.String r0 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/result is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0331 }
            r1.onError(r2)     // Catch:{ Exception -> 0x0331 }
            return
        L_0x027f:
            X.3KC r13 = new X.3KC     // Catch:{ Exception -> 0x0331 }
            r15 = r14
            r17 = -1
            r18 = 0
            r19 = 0
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch:{ Exception -> 0x0331 }
        L_0x028b:
            int r5 = r13.A00     // Catch:{ Exception -> 0x0331 }
            r3 = 15
            if (r5 != r3) goto L_0x029a
            java.lang.String r0 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/wamsys initialization fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0331 }
            r1.onError(r3)     // Catch:{ Exception -> 0x0331 }
            return
        L_0x029a:
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/success status: "
            X.C36321k7.A1T(r3, r4, r5)     // Catch:{ Exception -> 0x0331 }
            r4 = 11
            X.3G5 r3 = r0.A05     // Catch:{ Exception -> 0x0331 }
            if (r5 != r4) goto L_0x0315
            java.lang.String r0 = "AccountDefenceLocalDataRepository/saveRetryLimitReachedForResendingNotice/"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0331 }
            X.0wg r7 = r3.A00     // Catch:{ Exception -> 0x0331 }
            java.lang.String r6 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences$Editor r4 = X.C36381kD.A0G(r7, r6)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r3 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            r0 = 1
            r4.putBoolean(r3, r0)     // Catch:{ Exception -> 0x0331 }
            boolean r0 = r4.commit()     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x02c7
            java.lang.String r0 = "AccountDefenceLocalDataRepository/saveRetryLimitReachedForResendingNotice/error"
        L_0x02c4:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0331 }
        L_0x02c7:
            java.lang.String r0 = r13.A03     // Catch:{ Exception -> 0x0331 }
            r3 = -1
            long r8 = X.C65983Uf.A01(r0, r3)     // Catch:{ Exception -> 0x0331 }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r8 = r8 * r3
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x02fe
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0331 }
            long r3 = r3 + r8
            java.lang.StringBuilder r5 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = "AccountDefenceLocalDataRepository/saveRetryTimeForResendingNotice/"
            X.C36321k7.A1V(r0, r5, r3)     // Catch:{ Exception -> 0x0331 }
            android.content.SharedPreferences$Editor r5 = X.C36381kD.A0G(r7, r6)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice"
            r5.putLong(r0, r3)     // Catch:{ Exception -> 0x0331 }
            boolean r0 = r5.commit()     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x02fa
            java.lang.String r0 = "AccountDefenceLocalDataRepositoryAccountDefenceLocalDataRepository/saveRetryTimeForResendingNotice/error"
        L_0x02f7:
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0331 }
        L_0x02fa:
            r1.BU2(r13)     // Catch:{ Exception -> 0x0331 }
            goto L_0x0330
        L_0x02fe:
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clearRetryTimeForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0331 }
            android.content.SharedPreferences$Editor r3 = X.C36381kD.A0G(r7, r6)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.retry_time_reached_resending_notice"
            r3.remove(r0)     // Catch:{ Exception -> 0x0331 }
            boolean r0 = r3.commit()     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x02fa
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clearRetryTimeForResendingNotice/error"
            goto L_0x02f7
        L_0x0315:
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clearRetryLimitReachedForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ Exception -> 0x0331 }
            X.0wg r7 = r3.A00     // Catch:{ Exception -> 0x0331 }
            java.lang.String r6 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences$Editor r3 = X.C36381kD.A0G(r7, r6)     // Catch:{ Exception -> 0x0331 }
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            r3.remove(r0)     // Catch:{ Exception -> 0x0331 }
            boolean r0 = r3.commit()     // Catch:{ Exception -> 0x0331 }
            if (r0 != 0) goto L_0x02c7
            java.lang.String r0 = "AccountDefenceLocalDataRepository/clearRetryLimitReachedForResendingNotice/error"
            goto L_0x02c4
        L_0x0330:
            return
        L_0x0331:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AccountDefenceDataManager/resendDeviceConfirmationNotice/error "
            X.C36321k7.A1J(r4, r0, r3)
            r1.onError(r2)
            return
        L_0x033f:
            java.lang.Object r1 = r3.A00
            X.3Pk r1 = (X.C64783Pk) r1
            java.lang.Object r0 = r3.A01
            X.39R r0 = (X.AnonymousClass39R) r0
            java.lang.String r4 = r3.A02
            java.lang.String r3 = r3.A03
            X.1Nn r2 = r1.A0C
            com.whatsapp.jid.UserJid r1 = r0.A02
            X.3Nj r0 = new X.3Nj
            r0.<init>(r1, r4, r3)
            r2.A01(r0)
            return
        L_0x0358:
            java.lang.Object r7 = r3.A00
            com.whatsapp.otp.OtpIdentityHashRequestedReceiver r7 = (com.whatsapp.otp.OtpIdentityHashRequestedReceiver) r7
            java.lang.Object r6 = r3.A01
            android.content.Context r6 = (android.content.Context) r6
            java.lang.String r4 = r3.A02
            java.lang.String r3 = r3.A03
            X.1OD r8 = r7.A00
            if (r8 == 0) goto L_0x044f
            X.189 r0 = r8.A07
            X.18u r0 = r0.A00
            X.34P r2 = r0.A04()
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x038f }
            X.3FZ r0 = r2.A01     // Catch:{ NoSuchAlgorithmException -> 0x038f }
            X.3IG r0 = r0.A00     // Catch:{ NoSuchAlgorithmException -> 0x038f }
            byte[] r0 = r0.A00()     // Catch:{ NoSuchAlgorithmException -> 0x038f }
            byte[] r5 = r1.digest(r0)     // Catch:{ NoSuchAlgorithmException -> 0x038f }
            r2 = 8
            byte[] r1 = new byte[r2]     // Catch:{ NoSuchAlgorithmException -> 0x038f }
            r0 = 0
            java.lang.System.arraycopy(r5, r0, r1, r0, r2)     // Catch:{ NoSuchAlgorithmException -> 0x038f }
            java.lang.String r2 = X.C36441kJ.A13(r1)     // Catch:{ NoSuchAlgorithmException -> 0x038f }
            goto L_0x039c
        L_0x038f:
            r1 = move-exception
            java.lang.String r0 = "DeviceADVInfoManager/getMyIdentityHash no such algorithm exception"
            com.whatsapp.util.Log.e(r0, r1)
            X.1OE r1 = r8.A09
            r0 = 1
            r1.A04(r0)
            r2 = 0
        L_0x039c:
            X.39L r5 = r7.A02
            if (r5 == 0) goto L_0x0448
            X.0wQ r1 = r5.A00
            r1.A0G()
            X.13x r0 = r1.A02
            boolean r0 = r1.A0N(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x03b2
            r9 = 0
            if (r2 != 0) goto L_0x03fb
        L_0x03b2:
            r9 = 1
            X.0v0 r8 = r5.A01
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r8)
            java.lang.String r7 = "d_identity_key"
            java.lang.String r2 = X.C36371kC.A0t(r0, r7)
            if (r2 != 0) goto L_0x03db
            r0 = 10
            byte[] r1 = new byte[r0]
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r0.nextBytes(r1)
            java.lang.String r2 = X.C36441kJ.A13(r1)
            X.AnonymousClass00C.A08(r2)
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r8)
            X.C36341k9.A0x(r0, r7, r2)
        L_0x03db:
            java.lang.String r0 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)
            byte[] r0 = X.C36351kA.A1b(r2)
            r1.update(r0)
            byte[] r7 = r1.digest()
            r2 = 8
            byte[] r1 = new byte[r2]
            r0 = 0
            java.lang.System.arraycopy(r7, r0, r1, r0, r2)
            java.lang.String r2 = X.C36441kJ.A13(r1)
            X.AnonymousClass00C.A08(r2)
        L_0x03fb:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "client_"
            java.lang.String r2 = X.AnonymousClass000.A0p(r0, r2, r1)
            r0 = 2
            X.AnonymousClass00C.A0D(r2, r0)
            android.content.Intent r1 = X.C36431kI.A0D()
            r1.setPackage(r4)
            java.lang.String r0 = "com.whatsapp.otp.ID_HASH_REQUESTED"
            r1.setAction(r0)
            java.lang.String r0 = "id_hash"
            r1.putExtra(r0, r2)
            java.lang.String r0 = "request_id"
            r1.putExtra(r0, r3)
            X.C54922tm.A00(r6, r1)
            r6.sendBroadcast(r1)
            X.619 r0 = r5.A03
            java.util.ArrayList r1 = r0.A00(r4)
            java.lang.String r0 = ","
            java.lang.String r3 = X.C36381kD.A0x(r0, r1)
            X.1J1 r2 = r5.A02
            X.2Pk r1 = new X.2Pk
            r1.<init>()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)
            r1.A00 = r0
            r1.A01 = r4
            r1.A02 = r3
            X.0yW r0 = r2.A03
            r0.Bly(r1)
            return
        L_0x0448:
            java.lang.String r0 = "otpIdentityHashService"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x044f:
            java.lang.String r0 = "deviceADVInfoHandler"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0456:
            java.lang.Object r2 = r3.A00
            X.01I r2 = (X.AnonymousClass01I) r2
            java.lang.String r5 = r3.A02
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.String r4 = r3.A03
            r0 = 3
            X.AnonymousClass00C.A0D(r4, r0)
            X.01z r6 = r2.getSupportFragmentManager()
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r1.iterator()
        L_0x0472:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x047c
            X.C36381kD.A1Q(r2, r1)
            goto L_0x0472
        L_0x047c:
            java.util.ArrayList r3 = X.C36321k7.A0J(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x0484:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04c6
            X.AnonymousClass2YQ.A00(r3, r1)
            goto L_0x0484
        L_0x048e:
            java.lang.Object r2 = r3.A00
            X.01I r2 = (X.AnonymousClass01I) r2
            java.lang.String r5 = r3.A02
            java.lang.Object r1 = r3.A01
            java.util.List r1 = (java.util.List) r1
            java.lang.String r4 = r3.A03
            r0 = 3
            X.AnonymousClass00C.A0D(r4, r0)
            X.01z r6 = r2.getSupportFragmentManager()
            java.util.ArrayList r2 = X.AnonymousClass001.A0I()
            java.util.Iterator r1 = r1.iterator()
        L_0x04aa:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04b4
            X.C36381kD.A1Q(r2, r1)
            goto L_0x04aa
        L_0x04b4:
            java.util.ArrayList r3 = X.C36321k7.A0J(r2)
            java.util.Iterator r1 = r2.iterator()
        L_0x04bc:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04c6
            X.AnonymousClass2YQ.A00(r3, r1)
            goto L_0x04bc
        L_0x04c6:
            X.2oW r0 = X.C51872oW.INVITE
            com.whatsapp.newsletter.multiadmin.AdminInviteErrorDialog r0 = X.C54812tb.A00(r0, r5, r4, r3)
            X.C65443Sb.A02(r0, r6)
            return
        L_0x04d0:
            java.lang.Object r6 = r3.A00
            X.2IR r6 = (X.AnonymousClass2IR) r6
            java.lang.Object r5 = r3.A01
            android.content.Context r5 = (android.content.Context) r5
            java.lang.String r0 = r3.A02
            java.lang.String r4 = r3.A03
            r3 = 2131886523(0x7f1201bb, float:1.9407627E38)
            java.lang.Object[] r1 = X.AnonymousClass001.A0M()
            r2 = 0
            r1[r2] = r0
            r0 = 1
            java.lang.String r1 = X.C36391kE.A0v(r5, r4, r1, r0, r3)
            X.17Y r0 = r6.A0R
            r0.A0K(r1, r2)
            return
        L_0x04f1:
            java.lang.String r0 = "coreMessageStore"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C80503vV.run():void");
    }
}
