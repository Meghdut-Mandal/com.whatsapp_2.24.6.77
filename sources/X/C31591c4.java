package X;

/* renamed from: X.1c4  reason: invalid class name and case insensitive filesystem */
public class C31591c4 extends C29421Wo {
    public final C31651cA A00;
    public final C31611c6 A01;
    public final C31661cB A02;
    public final C25951Ih A03;
    public final C19770wU A04;
    public final C27651Pc A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C31591c4(X.C19700wN r8, X.C27651Pc r9, X.C31651cA r10, X.C31611c6 r11, X.C31661cB r12, X.C25951Ih r13, X.AnonymousClass19A r14, X.AnonymousClass19L r15, X.C19770wU r16) {
        /*
            r7 = this;
            r0 = 1
            int[] r5 = new int[r0]
            r1 = 0
            r0 = 252(0xfc, float:3.53E-43)
            r5[r1] = r0
            r6 = 1
            r0 = r7
            r1 = r8
            r2 = r14
            r3 = r15
            r4 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.A04 = r4
            r7.A05 = r9
            r7.A03 = r13
            r7.A01 = r11
            r7.A00 = r10
            r7.A02 = r12
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31591c4.<init>(X.0wN, X.1Pc, X.1cA, X.1c6, X.1cB, X.1Ih, X.19A, X.19L, X.0wU):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0356, code lost:
        if (r0 != 12) goto L_0x0358;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A07(X.C203399nx r29, int r30) {
        /*
            r28 = this;
            r7 = r28
            X.1cA r0 = r7.A00
            r27 = r0
            boolean r0 = r27.A00()
            if (r0 != 0) goto L_0x0014
            X.1Pc r0 = r7.A05
            X.1Pe r0 = r0.A01
            r0.A00()
        L_0x0013:
            return
        L_0x0014:
            r0 = 252(0xfc, float:3.53E-43)
            r1 = r30
            if (r1 != r0) goto L_0x0013
            X.9nx r1 = r29.A0a()
            java.lang.String r18 = "stage"
            r0 = r18
            java.lang.String r2 = r1.A0h(r0)
            java.lang.String r0 = "companion_hello"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x01cd
            boolean r0 = r27.A00()
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "link_code_pairing_wrapped_companion_ephemeral_pub"
            X.9nx r0 = r1.A0d(r0)
            byte[] r12 = r0.A01
            java.lang.String r0 = "companion_server_auth_key_pub"
            X.9nx r0 = r1.A0d(r0)
            byte[] r10 = r0.A01
            java.lang.String r0 = "link_code_pairing_ref"
            X.9nx r0 = r1.A0d(r0)
            java.lang.String r8 = r0.A0e()
            java.lang.String r15 = "companion_platform_id"
            X.9nx r0 = r1.A0c(r15)
            r14 = 0
            if (r0 == 0) goto L_0x00de
            X.9nx r0 = r1.A0c(r15)
            java.lang.String r6 = r0.A0e()
        L_0x005f:
            java.lang.String r13 = "companion_platform_display"
            X.9nx r0 = r1.A0c(r13)
            if (r0 == 0) goto L_0x006f
            X.9nx r0 = r1.A0c(r13)
            java.lang.String r14 = r0.A0e()
        L_0x006f:
            java.lang.String r2 = "should_show_push_notification"
            r0 = 0
            java.lang.String r1 = r1.A0i(r2, r0)
            java.lang.String r19 = "true"
            r0 = r19
            boolean r18 = r0.equals(r1)
            if (r12 == 0) goto L_0x01ae
            if (r10 == 0) goto L_0x01ae
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x01ae
            X.1c6 r5 = r7.A01
            X.1c9 r4 = r5.A02
            long r2 = r4.A00
            r0 = 0
            int r9 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r9 == 0) goto L_0x00aa
            r16 = 60000(0xea60, double:2.9644E-319)
            long r2 = r2 + r16
            X.0wo r9 = r4.A03
            long r16 = X.C19970wo.A00(r9)
            int r9 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r9 <= 0) goto L_0x00aa
            r2 = 17
            r4.A00(r2)
            r4.A00 = r0
        L_0x00aa:
            X.1c7 r9 = r5.A03
            X.3PV r11 = r9.A00()
            X.0yC r2 = r9.A04
            r1 = 3816(0xee8, float:5.347E-42)
            X.0yV r0 = X.C21000yV.A02
            int r0 = X.C20800yB.A00(r0, r2, r1)
            long r0 = (long) r0
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            r2 = 360000(0x57e40, double:1.778636E-318)
            long r1 = java.lang.Math.min(r2, r0)
            X.0wo r0 = r9.A02
            long r25 = X.C19970wo.A00(r0)
            long r25 = r25 + r1
            X.3PV r0 = new X.3PV
            r20 = r0
            r21 = r8
            r22 = r6
            r23 = r12
            r24 = r10
            r20.<init>(r21, r22, r23, r24, r25)
            monitor-enter(r9)
            goto L_0x00e0
        L_0x00de:
            r6 = r14
            goto L_0x005f
        L_0x00e0:
            X.0v0 r3 = r9.A03     // Catch:{ all -> 0x0332 }
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ all -> 0x0332 }
            r10.<init>()     // Catch:{ all -> 0x0332 }
            java.lang.String r2 = "wrappedCompanionEphemeralPubBase64"
            byte[] r1 = r0.A04     // Catch:{ JSONException -> 0x0114 }
            r12 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r12)     // Catch:{ JSONException -> 0x0114 }
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r2 = "companionServerAuthKeyPubBase64"
            byte[] r1 = r0.A03     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r12)     // Catch:{ JSONException -> 0x0114 }
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r2 = "linkCodePairingRef"
            java.lang.String r1 = r0.A02     // Catch:{ JSONException -> 0x0114 }
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r2 = "companionPlatformId"
            java.lang.String r1 = r0.A01     // Catch:{ JSONException -> 0x0114 }
            r10.put(r2, r1)     // Catch:{ JSONException -> 0x0114 }
            java.lang.String r2 = "expirationTsMs"
            long r0 = r0.A00     // Catch:{ JSONException -> 0x0114 }
            r10.put(r2, r0)     // Catch:{ JSONException -> 0x0114 }
            goto L_0x011c
        L_0x0114:
            r1 = move-exception
            java.lang.String r0 = "CompanionHelloInfoManager/toJsonString error: "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0332 }
            r2 = 0
            goto L_0x0120
        L_0x011c:
            java.lang.String r2 = r10.toString()     // Catch:{ all -> 0x0332 }
        L_0x0120:
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r3)     // Catch:{ all -> 0x0332 }
            java.lang.String r0 = "companion_reg_with_link_code_companion_hello_info_json"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r2)     // Catch:{ all -> 0x0332 }
            r0.apply()     // Catch:{ all -> 0x0332 }
            monitor-exit(r9)     // Catch:{ all -> 0x0332 }
            X.0v0 r0 = r5.A05
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "companion_reg_with_link_code_retry_count"
            android.content.SharedPreferences$Editor r0 = r1.remove(r0)
            r0.apply()
            if (r11 == 0) goto L_0x0174
            java.lang.String r2 = r11.A02
            boolean r0 = r2.equals(r8)
            if (r0 != 0) goto L_0x0174
            X.19A r0 = r5.A07
            X.3pX r1 = new X.3pX
            r1.<init>(r0)
            r0 = r19
            r1.A00(r2, r0)
            if (r18 != 0) goto L_0x015f
            if (r6 == 0) goto L_0x016d
            java.lang.String r0 = r11.A01
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x016d
        L_0x015f:
            X.0wo r0 = r5.A04
            long r0 = X.C19970wo.A00(r0)
            monitor-enter(r9)
            r9.A01 = r0     // Catch:{ all -> 0x05da }
            r0 = 0
            r9.A00 = r0     // Catch:{ all -> 0x05da }
            goto L_0x0173
        L_0x016d:
            long r0 = r11.A00
            r9.A01(r0)
            goto L_0x0174
        L_0x0173:
            monitor-exit(r9)
        L_0x0174:
            r0 = 1
            r4.A01(r0, r8, r6)
            r0 = r27
            X.0v0 r0 = r0.A00
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "did_receive_companion_hello"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.apply()
            if (r18 == 0) goto L_0x0013
            X.1cB r3 = r7.A02
            r10 = 0
            X.AnonymousClass00C.A0D(r8, r10)
            java.lang.String r0 = "CompanionRegWithLinkCodeNotificationManager/onReceiveCompanionHelloNotificationFromServer"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Fq r2 = r3.A03
            X.03c r0 = r2.A00
            boolean r0 = r0.A01()
            if (r0 != 0) goto L_0x01a7
            java.lang.String r0 = "CompanionRegWithLinkCodeNotificationManager/onReceiveCompanionHelloNotificationFromServer notification disabled"
        L_0x01a3:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x01a7:
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x02ba
            java.lang.String r0 = "CompanionRegWithLinkCodeNotificationManager/onReceiveCompanionHelloNotificationFromServer user is already on enter code screen"
            goto L_0x01a3
        L_0x01ae:
            X.0wN r3 = r7.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "companion_hello:"
            r1.append(r0)
            r1.append(r12)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r10)
            r1.append(r0)
            r1.append(r8)
            goto L_0x02af
        L_0x01cd:
            java.lang.String r15 = "companion_finish"
            boolean r0 = r2.equals(r15)
            if (r0 == 0) goto L_0x022b
            java.lang.String r0 = "link_code_pairing_wrapped_key_bundle"
            X.9nx r0 = r1.A0d(r0)
            byte[] r3 = r0.A01
            java.lang.String r0 = "companion_identity_public"
            X.9nx r0 = r1.A0d(r0)
            byte[] r4 = r0.A01
            java.lang.String r0 = "link_code_pairing_ref"
            X.9nx r0 = r1.A0d(r0)
            java.lang.String r5 = r0.A0e()
            if (r3 == 0) goto L_0x0219
            if (r4 == 0) goto L_0x0219
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0219
            X.0wU r2 = r7.A04
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LinkCodeCompanionRegNotificationHandler/handleCompanionFinishNotification/"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            r11 = 2
            X.1ip r6 = new X.1ip
            r8 = r3
            r9 = r4
            r10 = r5
            r6.<init>(r7, r8, r9, r10, r11)
            r2.Bp2(r6, r0)
            return
        L_0x0219:
            X.0wN r3 = r7.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "companion_finish:"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ","
            goto L_0x02a9
        L_0x022b:
            java.lang.String r0 = "primary_hello"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x027a
            java.lang.String r0 = "link_code_pairing_wrapped_primary_ephemeral_pub"
            X.9nx r0 = r1.A0d(r0)
            byte[] r11 = r0.A01
            java.lang.String r0 = "primary_identity_pub"
            X.9nx r0 = r1.A0d(r0)
            byte[] r12 = r0.A01
            java.lang.String r17 = "link_code_pairing_ref"
            r0 = r17
            X.9nx r0 = r1.A0d(r0)
            java.lang.String r5 = r0.A0e()
            if (r11 == 0) goto L_0x0262
            if (r12 == 0) goto L_0x0262
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0262
            X.1Ih r0 = r7.A03
            X.0xH r9 = X.C25951Ih.A00(r0)
            monitor-enter(r9)
            goto L_0x0335
        L_0x0262:
            X.0wN r3 = r7.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "primary_hello:"
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r12)
            goto L_0x02a9
        L_0x027a:
            java.lang.String r0 = "refresh_code"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0013
            java.lang.String r0 = "link_code_pairing_ref"
            X.9nx r0 = r1.A0d(r0)
            java.lang.String r5 = r0.A0e()
            java.lang.String r2 = "force_manual_refresh"
            java.lang.String r0 = "false"
            java.lang.String r1 = r1.A0i(r2, r0)
            java.lang.String r0 = "true"
            boolean r2 = r0.equals(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x057c
            X.0wN r3 = r7.A00
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "refresh_code:"
        L_0x02a9:
            r1.append(r0)
            r1.append(r5)
        L_0x02af:
            java.lang.String r2 = r1.toString()
            r1 = 0
            java.lang.String r0 = "invalid_link_code_reg_notification"
            r3.A0E(r0, r2, r1)
            return
        L_0x02ba:
            X.0wG r7 = r3.A02
            r0 = 2131888144(0x7f120810, float:1.9410915E38)
            java.lang.String r5 = r7.A01(r0)
            X.AnonymousClass00C.A08(r5)
            android.content.Context r9 = r7.A00
            X.0Yy r4 = X.C20600xp.A02(r9)
            java.lang.String r0 = "critical_app_alerts@1"
            r4.A0M = r0
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r11 = r9.getPackageName()
            java.lang.String r0 = "com.whatsapp.companiondevice.CompanionHelloConfirmationActivity"
            r1.setClassName(r11, r0)
            java.lang.String r0 = "pairing_ref"
            r1.putExtra(r0, r8)
            if (r6 == 0) goto L_0x02e8
            r1.putExtra(r15, r6)
        L_0x02e8:
            if (r14 == 0) goto L_0x02ed
            r1.putExtra(r13, r14)
        L_0x02ed:
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r0 = X.C65743Th.A00(r9, r10, r1, r0)
            r4.A0D = r0
            r1 = 1
            r4.A09 = r1
            r0 = 2131896687(0x7f12296f, float:1.9428242E38)
            java.lang.String r0 = r7.A01(r0)
            r4.A0F(r0)
            r4.A0G(r5)
            r4.A0E(r5)
            r0 = 3
            r4.A06(r0)
            r4.A0I(r1)
            androidx.core.app.NotificationCompat$BigTextStyle r0 = new androidx.core.app.NotificationCompat$BigTextStyle
            r0.<init>()
            r0.A0C(r5)
            r4.A0C(r0)
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r4.A0B
            r0.icon = r1
            r1 = 54
            android.app.Notification r0 = r4.A05()
            r2.A02(r1, r0)
            X.1c9 r1 = r3.A01
            r0 = 10
            r1.A01(r0, r8, r6)
            return
        L_0x0332:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0332 }
            throw r0
        L_0x0335:
            java.lang.String r0 = "companion/registration/primary-hello/received"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05da }
            X.13g r4 = r9.A0P     // Catch:{ all -> 0x05da }
            int r0 = r4.A00()     // Catch:{ all -> 0x05da }
            r2 = 0
            r3 = 12
            r1 = 13
            if (r0 != r1) goto L_0x0356
            java.util.concurrent.atomic.AtomicReference r0 = r9.A0p     // Catch:{ all -> 0x05da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05da }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x0358
            r9.A0G = r2     // Catch:{ all -> 0x05da }
            goto L_0x035f
        L_0x0356:
            if (r0 == r3) goto L_0x035f
        L_0x0358:
            java.lang.String r0 = "companion/registration/primary-hello/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05da }
            goto L_0x05d8
        L_0x035f:
            int r7 = r11.length     // Catch:{ IllegalArgumentException -> 0x056c }
            r6 = 48
            if (r7 < r6) goto L_0x0564
            r0 = 0
            r2 = 32
            byte[] r10 = java.util.Arrays.copyOfRange(r11, r0, r2)     // Catch:{ IllegalArgumentException -> 0x056c }
            byte[] r8 = java.util.Arrays.copyOfRange(r11, r2, r6)     // Catch:{ IllegalArgumentException -> 0x056c }
            byte[] r7 = java.util.Arrays.copyOfRange(r11, r6, r7)     // Catch:{ IllegalArgumentException -> 0x056c }
            com.whatsapp.jid.UserJid r0 = r9.A07     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x055e
            X.5pz r0 = r9.A04     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x055e
            X.34P r0 = r9.A05     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x055e
            java.util.concurrent.atomic.AtomicReference r0 = r9.A0p     // Catch:{ all -> 0x05da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05da }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x05da }
            if (r0 != 0) goto L_0x0392
            java.lang.String r0 = "companion/registration/primary-hello/ignoring as pairing ref does not match"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05da }
            goto L_0x05d8
        L_0x0392:
            r4.A01(r1)     // Catch:{ all -> 0x05da }
            java.lang.Runnable r1 = r9.A09     // Catch:{ all -> 0x05da }
            if (r1 == 0) goto L_0x039e
            X.0wU r0 = r9.A0k     // Catch:{ all -> 0x05da }
            r0.Bnx(r1)     // Catch:{ all -> 0x05da }
        L_0x039e:
            X.0wU r11 = r9.A0k     // Catch:{ all -> 0x05da }
            r0 = 60000(0xea60, double:2.9644E-319)
            r4 = 37
            X.1j4 r6 = new X.1j4     // Catch:{ all -> 0x05da }
            r6.<init>(r9, r4)     // Catch:{ all -> 0x05da }
            java.lang.String r4 = "CompanionRegistrationManager/linkCodePairSuccessRunnable"
            X.1jE r0 = r11.BpM(r6, r4, r0)     // Catch:{ all -> 0x05da }
            r9.A09 = r0     // Catch:{ all -> 0x05da }
            java.lang.String r0 = r9.A0E     // Catch:{ all -> 0x05da }
            X.C18740tg.A06(r0)     // Catch:{ all -> 0x05da }
            char[] r6 = r0.toCharArray()     // Catch:{ all -> 0x05da }
            java.util.List r0 = X.C56182vs.A00     // Catch:{ all -> 0x05da }
            r4 = 131072(0x20000, float:1.83671E-40)
            r1 = 256(0x100, float:3.59E-43)
            java.lang.String r0 = "PBKDF2WithHmacSHA256"
            javax.crypto.SecretKey r6 = X.C18750th.A08(r0, r10, r6, r4, r1)     // Catch:{ all -> 0x05da }
            java.lang.String r0 = "AES/CTR/NoPadding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0558 }
            javax.crypto.spec.IvParameterSpec r1 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0558 }
            r1.<init>(r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0558 }
            r0 = 2
            r4.init(r0, r6, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0558 }
            byte[] r6 = r4.doFinal(r7)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0558 }
            if (r6 == 0) goto L_0x0552
            int r4 = r6.length     // Catch:{ all -> 0x05da }
            r1 = 0
        L_0x03de:
            if (r1 >= r4) goto L_0x0552
            byte r0 = r6[r1]     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x043b
            r13 = 5
            X.3IG r1 = new X.3IG     // Catch:{ all -> 0x05da }
            r1.<init>(r6, r13)     // Catch:{ all -> 0x05da }
            X.5pz r0 = r9.A04     // Catch:{ all -> 0x05da }
            X.66J r0 = r0.A00     // Catch:{ all -> 0x05da }
            byte[] r11 = X.C133256Xm.A07(r0, r1)     // Catch:{ all -> 0x05da }
            java.security.SecureRandom r0 = X.AnonymousClass136.A00()     // Catch:{ all -> 0x05da }
            byte[] r10 = new byte[r2]     // Catch:{ all -> 0x05da }
            r0.nextBytes(r10)     // Catch:{ all -> 0x05da }
            java.security.SecureRandom r0 = X.AnonymousClass136.A00()     // Catch:{ all -> 0x05da }
            byte[] r14 = new byte[r2]     // Catch:{ all -> 0x05da }
            r0.nextBytes(r14)     // Catch:{ all -> 0x05da }
            java.security.SecureRandom r0 = X.AnonymousClass136.A00()     // Catch:{ all -> 0x05da }
            byte[] r7 = new byte[r3]     // Catch:{ all -> 0x05da }
            r0.nextBytes(r7)     // Catch:{ all -> 0x05da }
            java.lang.String r1 = "link_code_pairing_key_bundle_encryption_key"
            java.nio.charset.Charset r0 = X.AnonymousClass0S4.A05     // Catch:{ all -> 0x05da }
            byte[] r0 = r1.getBytes(r0)     // Catch:{ all -> 0x05da }
            byte[] r1 = X.AnonymousClass6R0.A02(r11, r14, r0, r2)     // Catch:{ all -> 0x05da }
            java.lang.String r0 = "AES-GCM"
            javax.crypto.spec.SecretKeySpec r6 = new javax.crypto.spec.SecretKeySpec     // Catch:{ all -> 0x05da }
            r6.<init>(r1, r0)     // Catch:{ all -> 0x05da }
            X.34P r0 = r9.A05     // Catch:{ all -> 0x05da }
            X.3FZ r0 = r0.A01     // Catch:{ all -> 0x05da }
            X.3IG r0 = r0.A00     // Catch:{ all -> 0x05da }
            byte[] r8 = r0.A01     // Catch:{ all -> 0x05da }
            r4 = 3
            byte[][] r0 = new byte[r4][]     // Catch:{ all -> 0x05da }
            r24 = 0
            r0[r24] = r8     // Catch:{ all -> 0x05da }
            r3 = 1
            r0[r3] = r12     // Catch:{ all -> 0x05da }
            r16 = 2
            r0[r16] = r10     // Catch:{ all -> 0x05da }
            byte[] r2 = X.C203239na.A05(r0)     // Catch:{ all -> 0x05da }
            goto L_0x043e
        L_0x043b:
            int r1 = r1 + 1
            goto L_0x03de
        L_0x043e:
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0573 }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0573 }
            r0.<init>(r7)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0573 }
            r1.init(r3, r6, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0573 }
            byte[] r1 = r1.doFinal(r2)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0573 }
            byte[][] r0 = new byte[r4][]     // Catch:{ all -> 0x05da }
            r0[r24] = r14     // Catch:{ all -> 0x05da }
            r0[r3] = r7     // Catch:{ all -> 0x05da }
            r0[r16] = r1     // Catch:{ all -> 0x05da }
            byte[] r7 = X.C203239na.A05(r0)     // Catch:{ all -> 0x05da }
            X.3IG r1 = new X.3IG     // Catch:{ all -> 0x05da }
            r1.<init>(r12, r13)     // Catch:{ all -> 0x05da }
            X.34P r0 = r9.A05     // Catch:{ all -> 0x05da }
            X.66J r0 = r0.A00     // Catch:{ all -> 0x05da }
            byte[] r1 = X.C133256Xm.A07(r0, r1)     // Catch:{ all -> 0x05da }
            byte[][] r0 = new byte[r4][]     // Catch:{ all -> 0x05da }
            r0[r24] = r11     // Catch:{ all -> 0x05da }
            r0[r3] = r1     // Catch:{ all -> 0x05da }
            r0[r16] = r10     // Catch:{ all -> 0x05da }
            byte[] r2 = X.C203239na.A05(r0)     // Catch:{ all -> 0x05da }
            java.lang.String r0 = "adv_secret"
            byte[] r1 = r0.getBytes()     // Catch:{ all -> 0x05da }
            r0 = 32
            byte[] r0 = X.AnonymousClass6R0.A00(r2, r1, r0)     // Catch:{ all -> 0x05da }
            r9.A0G = r0     // Catch:{ all -> 0x05da }
            X.60q r2 = r9.A0R     // Catch:{ all -> 0x05da }
            com.whatsapp.jid.UserJid r1 = r9.A07     // Catch:{ all -> 0x05da }
            java.lang.String r0 = "companion/registration/send-link-code-companion-reg-companion-finish"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05da }
            X.19A r6 = r2.A00     // Catch:{ all -> 0x05da }
            java.lang.String r0 = r6.A09()     // Catch:{ all -> 0x05da }
            X.8e2 r10 = X.C177588e2.A00     // Catch:{ all -> 0x05da }
            byte[] r5 = r5.getBytes()     // Catch:{ all -> 0x05da }
            java.lang.String r2 = "iq"
            X.6QB r4 = new X.6QB     // Catch:{ all -> 0x05da }
            r4.<init>(r2)     // Catch:{ all -> 0x05da }
            java.lang.String r11 = "xmlns"
            java.lang.String r3 = "md"
            X.1AL r2 = new X.1AL     // Catch:{ all -> 0x05da }
            r2.<init>((java.lang.String) r11, (java.lang.String) r3)     // Catch:{ all -> 0x05da }
            r4.A04(r2)     // Catch:{ all -> 0x05da }
            java.lang.String r11 = "type"
            java.lang.String r3 = "set"
            X.1AL r2 = new X.1AL     // Catch:{ all -> 0x05da }
            r2.<init>((java.lang.String) r11, (java.lang.String) r3)     // Catch:{ all -> 0x05da }
            r4.A04(r2)     // Catch:{ all -> 0x05da }
            java.lang.String r3 = "to"
            X.1AL r2 = new X.1AL     // Catch:{ all -> 0x05da }
            r2.<init>((com.whatsapp.jid.Jid) r10, (java.lang.String) r3)     // Catch:{ all -> 0x05da }
            r4.A04(r2)     // Catch:{ all -> 0x05da }
            r20 = 0
            r2 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r22 = 9007199254740991(0x1fffffffffffff, double:4.4501477170144023E-308)
            r19 = r0
            boolean r10 = X.C203539oF.A0P(r19, r20, r22, r24)     // Catch:{ all -> 0x05da }
            if (r10 == 0) goto L_0x04df
            java.lang.String r11 = "id"
            X.1AL r10 = new X.1AL     // Catch:{ all -> 0x05da }
            r10.<init>((java.lang.String) r11, (java.lang.String) r0)     // Catch:{ all -> 0x05da }
            r4.A04(r10)     // Catch:{ all -> 0x05da }
        L_0x04df:
            java.lang.String r0 = "link_code_companion_reg"
            X.6QB r10 = new X.6QB     // Catch:{ all -> 0x05da }
            r10.<init>(r0)     // Catch:{ all -> 0x05da }
            X.1AL r11 = new X.1AL     // Catch:{ all -> 0x05da }
            r0 = r18
            r11.<init>((java.lang.String) r0, (java.lang.String) r15)     // Catch:{ all -> 0x05da }
            r10.A04(r11)     // Catch:{ all -> 0x05da }
            java.lang.String r0 = "link_code_companion_reg->jid"
            boolean r0 = X.C203539oF.A0N(r1, r0)     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x0502
            java.lang.String r11 = "jid"
            X.1AL r0 = new X.1AL     // Catch:{ all -> 0x05da }
            r0.<init>((com.whatsapp.jid.Jid) r1, (java.lang.String) r11)     // Catch:{ all -> 0x05da }
            r10.A04(r0)     // Catch:{ all -> 0x05da }
        L_0x0502:
            java.lang.String r0 = "link_code_pairing_wrapped_key_bundle"
            X.6QB r11 = new X.6QB     // Catch:{ all -> 0x05da }
            r11.<init>(r0)     // Catch:{ all -> 0x05da }
            r0 = -9007199254740991(0xffe0000000000001, double:-8.988465674311582E307)
            X.C203539oF.A0I(r7, r0, r2)     // Catch:{ all -> 0x05da }
            r11.A01 = r7     // Catch:{ all -> 0x05da }
            X.9nx r7 = r11.A03()     // Catch:{ all -> 0x05da }
            r10.A05(r7)     // Catch:{ all -> 0x05da }
            java.lang.String r11 = "companion_identity_public"
            X.6QB r7 = new X.6QB     // Catch:{ all -> 0x05da }
            r7.<init>(r11)     // Catch:{ all -> 0x05da }
            X.C203539oF.A0I(r8, r0, r2)     // Catch:{ all -> 0x05da }
            r7.A01 = r8     // Catch:{ all -> 0x05da }
            X.9nx r7 = r7.A03()     // Catch:{ all -> 0x05da }
            r10.A05(r7)     // Catch:{ all -> 0x05da }
            X.6QB r8 = new X.6QB     // Catch:{ all -> 0x05da }
            r7 = r17
            r8.<init>(r7)     // Catch:{ all -> 0x05da }
            X.C203539oF.A0I(r5, r0, r2)     // Catch:{ all -> 0x05da }
            r8.A01 = r5     // Catch:{ all -> 0x05da }
            X.9nx r0 = r8.A03()     // Catch:{ all -> 0x05da }
            r10.A05(r0)     // Catch:{ all -> 0x05da }
            X.9nx r0 = r10.A03()     // Catch:{ all -> 0x05da }
            r4.A05(r0)     // Catch:{ all -> 0x05da }
            X.9nx r1 = r4.A03()     // Catch:{ all -> 0x05da }
            r0 = 365(0x16d, float:5.11E-43)
            r6.A0G(r1, r0)     // Catch:{ all -> 0x05da }
            goto L_0x05d8
        L_0x0552:
            java.lang.String r0 = "companion/registration/companion-finish/aborting as primary ADV public key is 0"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05da }
            goto L_0x0578
        L_0x0558:
            java.lang.String r0 = "companion/registration/companion-finish/failed to decrypt primary ADV public key"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05da }
            goto L_0x0578
        L_0x055e:
            java.lang.String r0 = "companion/registration/companion-finish/some required registration data is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05da }
            goto L_0x0578
        L_0x0564:
            java.lang.String r1 = "WrappedPrimaryEphemeralPubData/input byte array length too small"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x056c }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x056c }
            throw r0     // Catch:{ IllegalArgumentException -> 0x056c }
        L_0x056c:
            r1 = move-exception
            java.lang.String r0 = "companion/registration/primary-hello/received invalid primary hello data"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x05da }
            goto L_0x0578
        L_0x0573:
            java.lang.String r0 = "companion/registration/companion-finish/failed to encrypt key bundle"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05da }
        L_0x0578:
            r9.A05()     // Catch:{ all -> 0x05da }
            goto L_0x05d8
        L_0x057c:
            X.9uj r0 = r7.A03()
            r7.A05(r0)
            X.1Ih r0 = r7.A03
            X.0xH r9 = X.C25951Ih.A00(r0)
            monitor-enter(r9)
            java.lang.String r0 = "companion/registration/refresh-code/received"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x05da }
            X.13g r0 = r9.A0P     // Catch:{ all -> 0x05da }
            int r1 = r0.A00()     // Catch:{ all -> 0x05da }
            r0 = 10
            if (r1 < r0) goto L_0x05d3
            r0 = 14
            if (r1 > r0) goto L_0x05d3
            java.util.concurrent.atomic.AtomicReference r0 = r9.A0p     // Catch:{ all -> 0x05da }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x05da }
            boolean r0 = r5.equals(r0)     // Catch:{ all -> 0x05da }
            if (r0 != 0) goto L_0x05af
            java.lang.String r0 = "companion/registration/refresh-code/different session"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05da }
            goto L_0x05d8
        L_0x05af:
            r9.A04()     // Catch:{ all -> 0x05da }
            if (r2 == 0) goto L_0x05cc
            java.lang.Iterable r0 = r9.getObservers()     // Catch:{ all -> 0x05da }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x05da }
        L_0x05bc:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x05da }
            if (r0 == 0) goto L_0x05d8
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x05da }
            X.3LD r0 = (X.AnonymousClass3LD) r0     // Catch:{ all -> 0x05da }
            r0.A00()     // Catch:{ all -> 0x05da }
            goto L_0x05bc
        L_0x05cc:
            com.whatsapp.jid.UserJid r1 = r9.A07     // Catch:{ all -> 0x05da }
            r0 = 1
            r9.A08(r1, r0)     // Catch:{ all -> 0x05da }
            goto L_0x05d8
        L_0x05d3:
            java.lang.String r0 = "companion/registration/refresh-code/invalid state"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05da }
        L_0x05d8:
            monitor-exit(r9)
            return
        L_0x05da:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31591c4.A07(X.9nx, int):void");
    }
}
