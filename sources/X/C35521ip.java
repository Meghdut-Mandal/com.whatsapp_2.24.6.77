package X;

/* renamed from: X.1ip  reason: invalid class name and case insensitive filesystem */
public class C35521ip implements Runnable {
    public Object A00;
    public Object A01;
    public Object A02;
    public String A03;
    public final int A04;

    public C35521ip(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A02 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:282:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x02da, code lost:
        r4 = r3.getObservers().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x02e6, code lost:
        if (r4.hasNext() == false) goto L_0x064a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x02e8, code lost:
        r3 = (X.AnonymousClass3N1) r4.next();
        r3.A00.runOnUiThread(new X.C80263v7(r3, r7, 38));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r42 = this;
            r1 = r42
            int r0 = r1.A04
            switch(r0) {
                case 0: goto L_0x05fc;
                case 1: goto L_0x0161;
                case 2: goto L_0x01b4;
                case 3: goto L_0x0340;
                case 4: goto L_0x046e;
                case 5: goto L_0x0655;
                case 6: goto L_0x0668;
                case 7: goto L_0x0772;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r1.A00
            X.1b9 r5 = (X.C31021b9) r5
            java.lang.String r3 = r1.A03
            java.lang.Object r2 = r1.A01
            X.11F r2 = (X.AnonymousClass11F) r2
            java.lang.Object r12 = r1.A02
            X.11F r12 = (X.AnonymousClass11F) r12
            java.lang.String r0 = "scheduled-call/onScheduledCallCancelMessageAdded execute on worker thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1Jh r0 = r5.A06
            X.3KV r11 = r0.A02(r2, r3)
            if (r11 == 0) goto L_0x064a
            long r1 = r11.A02
            X.12P r0 = r0.A04
            X.1M0 r8 = r0.A05()
            X.14e r9 = r8.A02     // Catch:{ all -> 0x015c }
            java.lang.String r7 = "scheduled_calls"
            java.lang.String r6 = "creation_message_row_id = ?"
            r0 = 1
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch:{ all -> 0x015c }
            r3 = 0
            java.lang.String r0 = java.lang.String.valueOf(r1)     // Catch:{ all -> 0x015c }
            r4[r3] = r0     // Catch:{ all -> 0x015c }
            java.lang.String r0 = "ScheduledCallsStore/DELETE_SCHEDULED_CALL_BY_ROW_ID"
            int r0 = r9.A03(r7, r6, r0, r4)     // Catch:{ all -> 0x015c }
            if (r0 != 0) goto L_0x0047
            java.lang.String r0 = "ScheduledCallsStore/deleteScheduledCallByRowID delete failed"
            com.whatsapp.util.Log.w((java.lang.String) r0)     // Catch:{ all -> 0x015c }
        L_0x0047:
            r8.close()
            r5.A00(r1)
            X.17Y r4 = r5.A00
            r3 = 3
            X.1iI r0 = new X.1iI
            r0.<init>(r5, r1, r3)
            r4.A0H(r0)
            X.005 r0 = r5.A0A
            java.lang.Object r2 = r0.get()
            X.1HR r2 = (X.AnonymousClass1HR) r2
            X.19w r1 = r2.A03
            X.11F r13 = r11.A04
            r0 = 1
            X.3Qa r4 = r1.A02(r13, r0)
            X.0wo r0 = r2.A01
            long r2 = X.C19970wo.A00(r0)
            X.8n2 r1 = new X.8n2
            r1.<init>(r4, r2)
            r1.A0q(r12)
            java.lang.String r0 = r11.A06
            r1.A17(r0)
            X.0xM r0 = r5.A05
            r0.A0h(r1)
            X.005 r0 = r5.A0B
            java.lang.Object r6 = r0.get()
            X.3AQ r6 = (X.AnonymousClass3AQ) r6
            X.0wQ r8 = r6.A01
            boolean r0 = r8.A0M(r12)
            if (r0 != 0) goto L_0x064a
            X.16D r2 = r6.A03
            X.141 r3 = r2.A0D(r13)
            android.content.Context r9 = r6.A00
            r4 = 2
            X.190 r0 = new X.190
            r0.<init>()
            android.content.Intent r1 = r0.A1W(r9, r3)
            java.lang.String r0 = "fromNotification"
            r7 = 1
            android.content.Intent r1 = r1.putExtra(r0, r7)
            r0 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r5 = X.C65743Th.A00(r9, r4, r1, r0)
            java.lang.String r0 = "critical_app_alerts@1"
            X.0Yy r4 = new X.0Yy
            r4.<init>(r9, r0)
            r1 = 2131231578(0x7f08035a, float:1.807924E38)
            android.app.Notification r0 = r4.A0B
            r0.icon = r1
            r0 = 2131102006(0x7f060936, float:1.7816438E38)
            int r0 = X.AnonymousClass00F.A00(r9, r0)
            r4.A06 = r0
            r4.A0D = r5
            r4.A0I(r7)
            X.1Pn r1 = r6.A05
            X.1Pp r0 = r6.A02
            android.graphics.Bitmap r10 = X.AnonymousClass3UD.A01(r9, r0, r1, r3)
            X.0TO r5 = new X.0TO
            r5.<init>()
            r7 = 2131893798(0x7f121e26, float:1.9422383E38)
            r0 = 1
            java.lang.Object[] r3 = new java.lang.Object[r0]
            java.lang.String r1 = r11.A00()
            r0 = 0
            r3[r0] = r1
            java.lang.String r0 = r9.getString(r7, r3)
            r5.A01 = r0
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.A03(r10)
            r5.A00 = r0
            X.0UW r7 = new X.0UW
            r7.<init>(r5)
            androidx.core.app.NotificationCompat$MessagingStyle r5 = new androidx.core.app.NotificationCompat$MessagingStyle
            r5.<init>(r7)
            X.171 r3 = r6.A04
            r10 = 1
            if (r12 != 0) goto L_0x014e
            r0 = 2131888236(0x7f12086c, float:1.9411102E38)
            java.lang.String r3 = r9.getString(r0)
        L_0x0108:
            boolean r0 = r8.A0M(r12)
            r8 = 0
            if (r0 == 0) goto L_0x013f
            r2 = 2131893797(0x7f121e25, float:1.942238E38)
            java.lang.Object[] r1 = new java.lang.Object[r10]
            java.lang.String r0 = r11.A00()
            r1[r8] = r0
        L_0x011a:
            java.lang.String r3 = r9.getString(r2, r1)
            long r1 = java.lang.System.currentTimeMillis()
            X.0Wt r0 = new X.0Wt
            r0.<init>(r7, r3, r1)
            r5.A0C(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            r5.A00 = r0
            r4.A0C(r5)
            X.1Fq r2 = r6.A06
            r1 = 58
            android.app.Notification r0 = r4.A05()
            r2.A02(r1, r0)
            return
        L_0x013f:
            r2 = 2131893796(0x7f121e24, float:1.9422379E38)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r1[r8] = r3
            java.lang.String r0 = r11.A00()
            r1[r10] = r0
            goto L_0x011a
        L_0x014e:
            X.141 r2 = r2.A0D(r12)
            int r1 = r3.A0A(r13)
            r0 = 0
            java.lang.String r3 = r3.A0R(r2, r1, r0)
            goto L_0x0108
        L_0x015c:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x0454 }
            throw r1
        L_0x0161:
            java.lang.Object r5 = r1.A00
            X.1NG r5 = (X.AnonymousClass1NG) r5
            java.lang.Object r2 = r1.A01
            java.util.Set r2 = (java.util.Set) r2
            java.lang.String r8 = r1.A03
            java.lang.Object r7 = r1.A02
            r0 = 1
            X.AnonymousClass00C.A0D(r2, r0)
            r6 = 3
            X.AnonymousClass00C.A0D(r7, r6)
            monitor-enter(r5)
            java.util.Set r0 = r5.A0K     // Catch:{ all -> 0x01b1 }
            r0.clear()     // Catch:{ all -> 0x01b1 }
            r0.addAll(r2)     // Catch:{ all -> 0x01b1 }
            X.1NI r0 = r5.A05     // Catch:{ all -> 0x01b1 }
            r0.A01(r2)     // Catch:{ all -> 0x01b1 }
            X.0v0 r4 = r5.A0A     // Catch:{ all -> 0x01b1 }
            X.0wo r0 = r5.A09     // Catch:{ all -> 0x01b1 }
            long r2 = X.C19970wo.A00(r0)     // Catch:{ all -> 0x01b1 }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r4)     // Catch:{ all -> 0x01b1 }
            java.lang.String r0 = "block_list_receive_time"
            android.content.SharedPreferences$Editor r0 = r1.putLong(r0, r2)     // Catch:{ all -> 0x01b1 }
            r0.apply()     // Catch:{ all -> 0x01b1 }
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r4)     // Catch:{ all -> 0x01b1 }
            java.lang.String r0 = "block_list_v2_dhash"
            android.content.SharedPreferences$Editor r0 = r1.putString(r0, r8)     // Catch:{ all -> 0x01b1 }
            r0.apply()     // Catch:{ all -> 0x01b1 }
            X.17Y r1 = r5.A02     // Catch:{ all -> 0x01b1 }
            X.1j2 r0 = new X.1j2     // Catch:{ all -> 0x01b1 }
            r0.<init>(r5, r7, r6)     // Catch:{ all -> 0x01b1 }
            r1.A0H(r0)     // Catch:{ all -> 0x01b1 }
            monitor-exit(r5)
            return
        L_0x01b1:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x01b4:
            java.lang.Object r0 = r1.A00
            X.1c4 r0 = (X.C31591c4) r0
            java.lang.Object r10 = r1.A01
            byte[] r10 = (byte[]) r10
            java.lang.Object r6 = r1.A02
            byte[] r6 = (byte[]) r6
            java.lang.String r11 = r1.A03
            X.1c6 r3 = r0.A01
            monitor-enter(r3)
            java.util.Map r0 = r3.A00     // Catch:{ all -> 0x033d }
            java.lang.Object r4 = r0.remove(r11)     // Catch:{ all -> 0x033d }
            X.5tG r4 = (X.C121515tG) r4     // Catch:{ all -> 0x033d }
            X.1c9 r1 = r3.A02     // Catch:{ all -> 0x033d }
            r2 = 0
            if (r4 == 0) goto L_0x01d9
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x033d }
        L_0x01d4:
            r7 = 5
            r1.A01(r7, r11, r0)     // Catch:{ all -> 0x033d }
            goto L_0x01db
        L_0x01d9:
            r0 = r2
            goto L_0x01d4
        L_0x01db:
            if (r4 != 0) goto L_0x01fc
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x033d }
            r1.<init>()     // Catch:{ all -> 0x033d }
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish ref not exists, ref="
            r1.append(r0)     // Catch:{ all -> 0x033d }
            r1.append(r11)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x033d }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x033d }
            X.1c8 r1 = r3.A01     // Catch:{ all -> 0x033d }
            r0 = 4
            r1.A00(r0, r11, r2)     // Catch:{ all -> 0x033d }
            X.C31611c6.A01(r3, r11, r2)     // Catch:{ all -> 0x033d }
            goto L_0x0336
        L_0x01fc:
            int r8 = r10.length     // Catch:{ IllegalArgumentException -> 0x0330 }
            r5 = 44
            if (r8 < r5) goto L_0x0328
            r1 = 0
            r0 = 32
            byte[] r2 = java.util.Arrays.copyOfRange(r10, r1, r0)     // Catch:{ IllegalArgumentException -> 0x0330 }
            byte[] r9 = java.util.Arrays.copyOfRange(r10, r0, r5)     // Catch:{ IllegalArgumentException -> 0x0330 }
            byte[] r8 = java.util.Arrays.copyOfRange(r10, r5, r8)     // Catch:{ IllegalArgumentException -> 0x0330 }
            byte[] r5 = r4.A02     // Catch:{ all -> 0x033d }
            java.lang.String r0 = "link_code_pairing_key_bundle_encryption_key"
            byte[] r1 = r0.getBytes()     // Catch:{ all -> 0x033d }
            java.util.List r0 = X.C56182vs.A00     // Catch:{ all -> 0x033d }
            r0 = 32
            byte[] r1 = X.AnonymousClass6R0.A02(r5, r2, r1, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = "AES-GCM"
            javax.crypto.spec.SecretKeySpec r2 = new javax.crypto.spec.SecretKeySpec     // Catch:{ all -> 0x033d }
            r2.<init>(r1, r0)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = "AES/GCM/NoPadding"
            javax.crypto.Cipher r1 = javax.crypto.Cipher.getInstance(r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0316 }
            javax.crypto.spec.IvParameterSpec r0 = new javax.crypto.spec.IvParameterSpec     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0316 }
            r0.<init>(r9)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0316 }
            r9 = 2
            r1.init(r9, r2, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0316 }
            byte[] r2 = r1.doFinal(r8)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException -> 0x0316 }
            int r0 = r2.length     // Catch:{ ParseException -> 0x0305 }
            int r1 = r0 + -64
            r0 = 32
            byte[][] r2 = X.C203239na.A07(r2, r0, r0, r1)     // Catch:{ ParseException -> 0x0305 }
            r0 = 0
            r8 = r2[r0]     // Catch:{ all -> 0x033d }
            r0 = 1
            r1 = r2[r0]     // Catch:{ all -> 0x033d }
            r9 = r2[r9]     // Catch:{ all -> 0x033d }
            java.lang.Boolean r0 = X.C18750th.A03     // Catch:{ all -> 0x033d }
            X.189 r0 = r3.A06     // Catch:{ all -> 0x033d }
            X.18u r0 = r0.A00     // Catch:{ all -> 0x033d }
            X.34P r2 = r0.A04()     // Catch:{ all -> 0x033d }
            X.3FZ r0 = r2.A01     // Catch:{ all -> 0x033d }
            X.3IG r0 = r0.A00     // Catch:{ all -> 0x033d }
            byte[] r0 = r0.A01     // Catch:{ all -> 0x033d }
            boolean r0 = java.util.Arrays.equals(r0, r1)     // Catch:{ all -> 0x033d }
            if (r0 != 0) goto L_0x0272
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/primary identity doesn't match"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x033d }
            X.1c7 r0 = r3.A03     // Catch:{ all -> 0x033d }
            r0.A02(r11)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x033d }
            X.C31611c6.A02(r3, r11, r0)     // Catch:{ all -> 0x033d }
            goto L_0x0336
        L_0x0272:
            boolean r0 = java.util.Arrays.equals(r6, r8)     // Catch:{ all -> 0x033d }
            if (r0 != 0) goto L_0x0289
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/companion identity doesn't match"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x033d }
            X.1c7 r0 = r3.A03     // Catch:{ all -> 0x033d }
            r0.A02(r11)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x033d }
            X.C31611c6.A02(r3, r11, r0)     // Catch:{ all -> 0x033d }
            goto L_0x0336
        L_0x0289:
            X.3IG r1 = new X.3IG     // Catch:{ all -> 0x033d }
            r1.<init>(r8, r7)     // Catch:{ all -> 0x033d }
            X.66J r0 = r2.A00     // Catch:{ all -> 0x033d }
            byte[] r2 = X.C133256Xm.A07(r0, r1)     // Catch:{ all -> 0x033d }
            r0 = 3
            byte[][] r1 = new byte[r0][]     // Catch:{ all -> 0x033d }
            r0 = 0
            r1[r0] = r5     // Catch:{ all -> 0x033d }
            r0 = 1
            r1[r0] = r2     // Catch:{ all -> 0x033d }
            r0 = 2
            r1[r0] = r9     // Catch:{ all -> 0x033d }
            byte[] r2 = X.C203239na.A05(r1)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = "adv_secret"
            byte[] r1 = r0.getBytes()     // Catch:{ all -> 0x033d }
            r0 = 32
            byte[] r13 = X.AnonymousClass6R0.A00(r2, r1, r0)     // Catch:{ all -> 0x033d }
            byte[] r12 = r4.A01     // Catch:{ all -> 0x033d }
            java.lang.String r4 = r4.A00     // Catch:{ all -> 0x033d }
            r0 = 2
            byte[][] r5 = new byte[r0][]     // Catch:{ 110 -> 0x02fb }
            r2 = 1
            byte[] r1 = new byte[r2]     // Catch:{ 110 -> 0x02fb }
            r0 = 0
            r1[r0] = r7     // Catch:{ 110 -> 0x02fb }
            r5[r0] = r1     // Catch:{ 110 -> 0x02fb }
            r5[r2] = r6     // Catch:{ 110 -> 0x02fb }
            byte[] r0 = X.C203239na.A05(r5)     // Catch:{ 110 -> 0x02fb }
            X.3IG r0 = X.C133256Xm.A01(r0)     // Catch:{ 110 -> 0x02fb }
            X.3FZ r8 = new X.3FZ     // Catch:{ 110 -> 0x02fb }
            r8.<init>(r0)     // Catch:{ 110 -> 0x02fb }
            java.lang.Integer r10 = X.AnonymousClass3OO.A00(r4)     // Catch:{ 110 -> 0x02fb }
            X.2q9 r9 = X.C52772q9.E2EE     // Catch:{ 110 -> 0x02fb }
            X.39o r7 = new X.39o     // Catch:{ 110 -> 0x02fb }
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ 110 -> 0x02fb }
            monitor-exit(r3)
            java.lang.Iterable r0 = r3.getObservers()
            java.util.Iterator r4 = r0.iterator()
        L_0x02e2:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x064a
            java.lang.Object r3 = r4.next()
            X.3N1 r3 = (X.AnonymousClass3N1) r3
            com.whatsapp.companiondevice.LinkedDevicesEnterCodeActivity r2 = r3.A00
            r1 = 38
            X.3v7 r0 = new X.3v7
            r0.<init>(r3, r7, r1)
            r2.runOnUiThread(r0)
            goto L_0x02e2
        L_0x02fb:
            r1 = move-exception
            java.lang.String r0 = "CompanionPairingData/createFromCodePairing invalidCompanionIdentity "
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x033d }
            X.C31611c6.A01(r3, r11, r4)     // Catch:{ all -> 0x033d }
            goto L_0x0336
        L_0x0305:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeUtil/decodeLinkCodePairingWrappedKeyBundle split fail"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/invalid linkCodePairingWrappedKeyBundleDecrypted"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x033d }
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x033d }
            X.C31611c6.A02(r3, r11, r0)     // Catch:{ all -> 0x033d }
            goto L_0x0336
        L_0x0316:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish/decryption fail"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x033d }
            X.1c8 r2 = r3.A01     // Catch:{ all -> 0x033d }
            r1 = 3
            java.lang.String r0 = r4.A00     // Catch:{ all -> 0x033d }
            r2.A00(r1, r11, r0)     // Catch:{ all -> 0x033d }
            X.C31611c6.A02(r3, r11, r0)     // Catch:{ all -> 0x033d }
            goto L_0x0336
        L_0x0328:
            java.lang.String r1 = "LinkCodePairingWrappedKeyBundleData input byte array length too small"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0330 }
            r0.<init>(r1)     // Catch:{ IllegalArgumentException -> 0x0330 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0330 }
        L_0x0330:
            r1 = move-exception
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/getCompanionPairingDataOnCompanionFinish exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x033d }
        L_0x0336:
            monitor-exit(r3)
            java.lang.String r0 = "CompanionRegWithLinkCodeManager/onCompanionFinish companionPairingData is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x033d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0340:
            java.lang.Object r0 = r1.A00
            X.1C3 r0 = (X.AnonymousClass1C3) r0
            java.lang.Object r2 = r1.A01
            com.whatsapp.jid.DeviceJid r2 = (com.whatsapp.jid.DeviceJid) r2
            java.lang.String r3 = r1.A03
            java.lang.Object r5 = r1.A02
            X.9uj r5 = (X.C207209uj) r5
            X.1AI r7 = r0.A0D
            X.C18740tg.A06(r3)
            X.8mn r1 = r7.A03(r2, r3)
            X.5J9 r1 = (X.AnonymousClass5J9) r1
            if (r1 == 0) goto L_0x0468
            int r3 = r1.A03
            r4 = 2
            if (r3 == 0) goto L_0x036f
            if (r3 != r4) goto L_0x0463
            int r6 = r1.A01
            X.0yf r4 = r0.A00
            X.0yh r3 = X.C21100yf.A1Q
            int r3 = r4.A04(r3)
            if (r6 <= r3) goto L_0x0463
            r4 = 3
        L_0x036f:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r3 = "history-sync-manager/activate sync phase "
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = " for "
            r6.append(r3)
            r6.append(r2)
            java.lang.String r3 = r6.toString()
            com.whatsapp.util.Log.i((java.lang.String) r3)
            X.1Hi r3 = r0.A0C
            X.C18740tg.A00()
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>()
            r18 = 1
            java.lang.String r8 = java.lang.String.valueOf(r18)
            java.lang.String r6 = "status"
            r12.put(r6, r8)
            X.18P r11 = r3.A02
            X.1M0 r6 = r11.A04()
            X.71s r17 = r6.B1k()     // Catch:{ all -> 0x044f }
            X.14e r10 = r6.A02     // Catch:{ all -> 0x0445 }
            java.lang.String r21 = "msg_history_sync"
            java.lang.String r22 = "device_id=?  AND sync_type=?  AND status=?"
            r8 = 3
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x0445 }
            java.lang.String r8 = r2.getRawString()     // Catch:{ all -> 0x0445 }
            r16 = 0
            r9[r16] = r8     // Catch:{ all -> 0x0445 }
            java.lang.String r15 = java.lang.String.valueOf(r4)     // Catch:{ all -> 0x0445 }
            r9[r18] = r15     // Catch:{ all -> 0x0445 }
            r8 = 2
            java.lang.String r13 = java.lang.String.valueOf(r16)     // Catch:{ all -> 0x0445 }
            r9[r8] = r13     // Catch:{ all -> 0x0445 }
            java.lang.String r23 = "MessageHistorySyncStore.activateSync"
            r19 = r10
            r20 = r12
            r24 = r9
            int r14 = r19.A01(r20, r21, r22, r23, r24)     // Catch:{ all -> 0x0445 }
            if (r14 != 0) goto L_0x043b
            X.1M0 r11 = r11.get()     // Catch:{ all -> 0x0445 }
            X.14e r13 = r11.A02     // Catch:{ all -> 0x040b }
            java.lang.String r12 = "SELECT status FROM msg_history_sync WHERE device_id=? AND sync_type=? LIMIT 1"
            java.lang.String[] r9 = new java.lang.String[r8]     // Catch:{ all -> 0x040b }
            java.lang.String r8 = r2.getRawString()     // Catch:{ all -> 0x040b }
            r10 = 0
            r9[r16] = r8     // Catch:{ all -> 0x040b }
            r9[r18] = r15     // Catch:{ all -> 0x040b }
            java.lang.String r8 = "MessageHistorySyncTable.SELECT_SYNC_STATUS_FOR_DEVICE_ID_AND_SYNC_TYPE"
            android.database.Cursor r9 = r13.A09(r12, r8, r9)     // Catch:{ all -> 0x040b }
            int r8 = r9.getCount()     // Catch:{ all -> 0x03ff }
            if (r8 <= 0) goto L_0x03f6
            r10 = 1
        L_0x03f6:
            r9.close()     // Catch:{ all -> 0x040b }
            r11.close()     // Catch:{ all -> 0x0445 }
            if (r10 != 0) goto L_0x043b
            goto L_0x0415
        L_0x03ff:
            r1 = move-exception
            if (r9 == 0) goto L_0x040a
            r9.close()     // Catch:{ all -> 0x0406 }
            goto L_0x040a
        L_0x0406:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x040b }
        L_0x040a:
            throw r1     // Catch:{ all -> 0x040b }
        L_0x040b:
            r1 = move-exception
            r11.close()     // Catch:{ all -> 0x0410 }
            goto L_0x0414
        L_0x0410:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0445 }
        L_0x0414:
            throw r1     // Catch:{ all -> 0x0445 }
        L_0x0415:
            r24 = -1
            r22 = -1
            r23 = 2
            r19 = 0
            X.6E9 r8 = new X.6E9     // Catch:{ all -> 0x0445 }
            r26 = -1
            r28 = -1
            r30 = -1
            r32 = -1
            r34 = -1
            r36 = -1
            r38 = -1
            r40 = -1
            r18 = r8
            r20 = r2
            r21 = r4
            r18.<init>(r19, r20, r21, r22, r23, r24, r26, r28, r30, r32, r34, r36, r38, r40)     // Catch:{ all -> 0x0445 }
            r3.A03(r8)     // Catch:{ all -> 0x0445 }
        L_0x043b:
            r17.A00()     // Catch:{ all -> 0x0445 }
            X.C25701Hi.A00(r6, r3, r2)     // Catch:{ all -> 0x0445 }
            r17.close()     // Catch:{ all -> 0x044f }
            goto L_0x0459
        L_0x0445:
            r1 = move-exception
            r17.close()     // Catch:{ all -> 0x044a }
            goto L_0x044e
        L_0x044a:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x044f }
        L_0x044e:
            throw r1     // Catch:{ all -> 0x044f }
        L_0x044f:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0454 }
            throw r1
        L_0x0454:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0459:
            r6.close()
            if (r14 <= 0) goto L_0x0463
            X.1Hp r2 = r0.A02
            r2.A00()
        L_0x0463:
            long r1 = r1.A1N
            r7.A05(r1)
        L_0x0468:
            X.1C4 r0 = r0.A0F
            r0.A01(r5)
            return
        L_0x046e:
            java.lang.Object r11 = r1.A00
            X.1aX r11 = (X.C30641aX) r11
            java.lang.Object r13 = r1.A01
            java.util.Set r13 = (java.util.Set) r13
            java.lang.String r14 = r1.A03
            java.lang.Object r10 = r1.A02
            com.whatsapp.jid.DeviceJid r10 = (com.whatsapp.jid.DeviceJid) r10
            int r0 = r13.size()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r9.<init>(r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.util.HashMap r18 = new java.util.HashMap     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r18.<init>()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.util.Iterator r17 = r13.iterator()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r8 = 0
            r20 = 0
            r21 = 0
            r22 = 0
        L_0x0495:
            boolean r0 = r17.hasNext()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            if (r0 == 0) goto L_0x05e0
            java.lang.Object r1 = r17.next()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.8PB r0 = X.AnonymousClass8PB.DEFAULT_INSTANCE     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.8Hz r0 = X.C170918Hz.A08(r0, r1)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.8PB r0 = (X.AnonymousClass8PB) r0     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.lang.String r7 = r0.url_     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            if (r7 != 0) goto L_0x04b8
            java.lang.String r0 = "NonMessageDataRequestManager/handleLinkPreviewRequest no url in request"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            goto L_0x0495
        L_0x04b8:
            boolean r2 = r0.includeHqThumbnail_     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.1DU r3 = r11.A0F     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r0 = 1
            java.util.ArrayList r0 = r3.A05(r7, r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            if (r0 == 0) goto L_0x0547
            java.lang.Object r6 = r0.get(r8)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
        L_0x04c9:
            X.0ww r0 = r11.A02     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.0ts r12 = r11.A08     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r1 = 0
            if (r6 == 0) goto L_0x04eb
            java.lang.String r4 = X.AnonymousClass1DU.A01(r6)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            if (r5 != 0) goto L_0x04eb
            X.6tS r5 = X.C64033Mj.A00(r4)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r16 = 0
            if (r5 == 0) goto L_0x04f6
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r1.<init>(r5, r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
        L_0x04eb:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r3.<init>()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.lang.String r0 = "NonMessageDataRequestManager/handleLinkPreviewRequest load result="
            r3.append(r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            goto L_0x0549
        L_0x04f6:
            X.6tS r5 = new X.6tS     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r5.<init>(r0, r3, r4)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r0 = 5
            android.net.TrafficStats.setThreadStatsTag(r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r15 = 1
            java.lang.String r0 = r12.A06()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0523 }
            X.0yC r3 = r11.A0D     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0523 }
            r5.A0H(r3, r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0523 }
            boolean r0 = r5.A0I()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0523 }
            if (r0 == 0) goto L_0x051f
            X.166 r0 = X.C64033Mj.A00     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0523 }
            monitor-enter(r0)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0523 }
            r0.put(r4, r5)     // Catch:{ all -> 0x051c }
            monitor-exit(r0)     // Catch:{ all -> 0x051c }
            r5.A0G(r3)     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0523 }
            r16 = 1
            goto L_0x051f
        L_0x051c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x051c }
            throw r3     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0523 }
        L_0x051f:
            r5.A0D()     // Catch:{ IOException | RuntimeException | URISyntaxException -> 0x0523 }
            goto L_0x0538
        L_0x0523:
            r4 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x05db }
            r3.<init>()     // Catch:{ all -> 0x05db }
            java.lang.String r0 = "WebPageLoader/loadPage/ex="
            r3.append(r0)     // Catch:{ all -> 0x05db }
            r3.append(r4)     // Catch:{ all -> 0x05db }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x05db }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x05db }
        L_0x0538:
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            if (r16 == 0) goto L_0x04eb
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r15)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            android.util.Pair r1 = new android.util.Pair     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r1.<init>(r5, r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            goto L_0x04eb
        L_0x0547:
            r6 = 0
            goto L_0x04c9
        L_0x0549:
            r0 = 0
            if (r1 == 0) goto L_0x054d
            r0 = 1
        L_0x054d:
            r3.append(r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.lang.String r0 = r3.toString()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.3ty r5 = new X.3ty     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r5.<init>()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r9.add(r5)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r3 = 0
            if (r1 != 0) goto L_0x056c
            int r22 = r22 + 1
            X.918 r0 = X.AnonymousClass918.NOT_FOUND     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.9Jx r2 = new X.9Jx     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r2.<init>(r3, r0, r7)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            goto L_0x05d6
        L_0x056c:
            java.lang.Object r4 = r1.first     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.6tS r4 = (X.C145166tS) r4     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.lang.Object r0 = r1.second     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            boolean r0 = r0.booleanValue()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            if (r0 == 0) goto L_0x057d
            int r20 = r20 + 1
            goto L_0x057f
        L_0x057d:
            int r21 = r21 + 1
        L_0x057f:
            byte[] r0 = r4.A0R     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            if (r0 == 0) goto L_0x05cb
            if (r2 == 0) goto L_0x05cb
            X.0yC r2 = r11.A0D     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r0 = 3665(0xe51, float:5.136E-42)
            X.0yV r1 = X.C21000yV.A02     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            boolean r0 = X.C20800yB.A01(r1, r2, r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            if (r0 == 0) goto L_0x05cb
            X.1D0 r3 = r11.A0G     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.ADZ r0 = new X.ADZ     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r23 = r0
            r24 = r4
            r25 = r5
            r26 = r11
            r27 = r7
            r28 = r6
            r23.<init>(r24, r25, r26, r27, r28)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r3.A0B(r4, r0, r8)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.0wU r12 = r11.A0M     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r0 = 3668(0xe54, float:5.14E-42)
            int r0 = X.C20800yB.A00(r1, r2, r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            long r0 = (long) r0     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r3.<init>()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.lang.String r2 = "NonMessageDataRequestManager/handleLinkPreviewRequest/"
            r3.append(r2)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r3.append(r14)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            java.lang.String r3 = r3.toString()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.AVh r2 = new X.AVh     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r2.<init>(r4, r5, r7, r6)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r12.BpM(r2, r3, r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            goto L_0x0495
        L_0x05cb:
            X.918 r0 = X.AnonymousClass918.SUCCESS     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.9d0 r1 = X.C198159d0.A00(r4, r3, r7, r6)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.9Jx r2 = new X.9Jx     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r2.<init>(r1, r0, r7)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
        L_0x05d6:
            r5.A0C(r2)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            goto L_0x0495
        L_0x05db:
            r0 = move-exception
            android.net.TrafficStats.clearThreadStatsTag()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            throw r0     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
        L_0x05e0:
            boolean r0 = r9.isEmpty()     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            if (r0 != 0) goto L_0x064a
            X.8UW r1 = new X.8UW     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r1.<init>(r9)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            X.ATK r0 = new X.ATK     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r19 = r13
            r16 = r10
            r17 = r14
            r14 = r0
            r15 = r11
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            r1.A0A(r0)     // Catch:{ 186 | IllegalArgumentException -> 0x064e }
            return
        L_0x05fc:
            java.lang.Object r5 = r1.A00
            X.0xD r5 = (X.C20220xD) r5
            java.lang.Object r2 = r1.A01
            android.os.ConditionVariable r2 = (android.os.ConditionVariable) r2
            java.lang.String r6 = r1.A03
            java.lang.Object r4 = r1.A02
            android.content.ServiceConnection r4 = (android.content.ServiceConnection) r4
            java.lang.String r0 = "registrationmanager/success/waiting-for-gdrive-service-object"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.block()
            java.lang.String r0 = "registrationmanager/success/cancel-pending-gdrive-backup-and-restore-if-any"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.6FS r0 = r5.A02
            r0.A04()
            java.lang.String r0 = "registrationmanager/success/gdrive-start-change-number"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wG r0 = r5.A06
            android.content.Context r3 = r0.A00
            java.lang.String r0 = "action_change_number"
            android.content.Intent r2 = X.AnonymousClass190.A14(r3, r0)
            java.lang.String r0 = "old_phone_number"
            r2.putExtra(r0, r6)
            X.0wQ r0 = r5.A00
            r0.A0G()
            com.whatsapp.jid.PhoneUserJid r0 = r0.A03
            if (r0 != 0) goto L_0x064b
            r1 = 0
        L_0x063a:
            java.lang.String r0 = "new_phone_number"
            r2.putExtra(r0, r1)
            X.C111795cr.A01(r3, r2)
            r3.unbindService(r4)
            X.6sV r1 = r5.A08
            r0 = 1
            r1.A01 = r0
        L_0x064a:
            return
        L_0x064b:
            java.lang.String r1 = r0.user
            goto L_0x063a
        L_0x064e:
            r1 = move-exception
            java.lang.String r0 = "NonMessageDataRequestManager/handleLinkPreviewRequest error in parsing request"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0655:
            java.lang.Object r4 = r1.A00
            X.1Ps r4 = (X.C27761Ps) r4
            java.lang.Object r3 = r1.A01
            X.141 r3 = (X.AnonymousClass141) r3
            java.lang.String r2 = r1.A03
            java.lang.Object r1 = r1.A02
            X.026 r1 = (X.AnonymousClass026) r1
            r0 = 0
            X.C27761Ps.A04(r1, r4, r3, r0, r2)
            return
        L_0x0668:
            java.lang.Object r0 = r1.A00
            X.1NM r0 = (X.AnonymousClass1NM) r0
            java.lang.Object r6 = r1.A01
            android.content.SharedPreferences r6 = (android.content.SharedPreferences) r6
            java.lang.String r5 = r1.A03
            java.lang.Object r4 = r1.A02
            X.2oa r4 = (X.C51912oa) r4
            r0.A07()
            java.lang.String r3 = ""
            java.lang.String r1 = r6.getString(r5, r3)
            r0 = 1
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = 44
            r2 = 0
            r13 = 0
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.util.List r1 = X.AnonymousClass099.A0K(r1, r0, r2)
            java.lang.String[] r0 = new java.lang.String[r2]
            java.lang.Object[] r7 = r1.toArray(r0)
            java.lang.String[] r7 = (java.lang.String[]) r7
            java.lang.Long r2 = X.C202339lc.A04(r7, r2)
            r0 = 0
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            if (r2 != 0) goto L_0x06a4
            r2 = r12
        L_0x06a4:
            long r0 = r2.longValue()
            java.util.concurrent.atomic.AtomicLong r8 = new java.util.concurrent.atomic.AtomicLong
            r8.<init>(r0)
            r0 = 1
            java.lang.Long r0 = X.C202339lc.A04(r7, r0)
            if (r0 != 0) goto L_0x06b5
            r0 = r12
        L_0x06b5:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r2 = new java.util.concurrent.atomic.AtomicLong
            r2.<init>(r0)
            r0 = 2
            java.lang.Long r0 = X.C202339lc.A04(r7, r0)
            if (r0 != 0) goto L_0x06c6
            r0 = r12
        L_0x06c6:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r9 = new java.util.concurrent.atomic.AtomicLong
            r9.<init>(r0)
            r0 = 3
            java.lang.Long r0 = X.C202339lc.A04(r7, r0)
            if (r0 != 0) goto L_0x06d7
            r0 = r12
        L_0x06d7:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r10 = new java.util.concurrent.atomic.AtomicLong
            r10.<init>(r0)
            r0 = 4
            java.lang.Long r0 = X.C202339lc.A04(r7, r0)
            if (r0 != 0) goto L_0x06e8
            r0 = r12
        L_0x06e8:
            long r0 = r0.longValue()
            java.util.concurrent.atomic.AtomicLong r11 = new java.util.concurrent.atomic.AtomicLong
            r11.<init>(r0)
            r0 = 5
            java.lang.Long r0 = X.C202339lc.A04(r7, r0)
            if (r0 == 0) goto L_0x06f9
            r12 = r0
        L_0x06f9:
            long r0 = r12.longValue()
            java.util.concurrent.atomic.AtomicLong r7 = new java.util.concurrent.atomic.AtomicLong
            r7.<init>(r0)
            r1 = r7
            int r0 = r4.ordinal()
            switch(r0) {
                case 0: goto L_0x0710;
                case 1: goto L_0x0712;
                case 2: goto L_0x0714;
                case 3: goto L_0x0716;
                case 4: goto L_0x0718;
                case 5: goto L_0x0719;
                default: goto L_0x070a;
            }
        L_0x070a:
            X.0jS r0 = new X.0jS
            r0.<init>()
            throw r0
        L_0x0710:
            r1 = r8
            goto L_0x0719
        L_0x0712:
            r1 = r2
            goto L_0x0719
        L_0x0714:
            r1 = r9
            goto L_0x0719
        L_0x0716:
            r1 = r10
            goto L_0x0719
        L_0x0718:
            r1 = r11
        L_0x0719:
            r1.incrementAndGet()
            android.content.SharedPreferences$Editor r6 = r6.edit()
            r0 = 6
            java.lang.Long[] r4 = new java.lang.Long[r0]
            long r0 = r8.get()
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r4[r13] = r0
            long r0 = r2.get()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 1
            r4[r0] = r1
            long r0 = r9.get()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 2
            r4[r0] = r1
            long r0 = r10.get()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 3
            r4[r0] = r1
            long r0 = r11.get()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 4
            r4[r0] = r1
            long r0 = r7.get()
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 5
            r4[r0] = r1
            java.lang.String r0 = ","
            java.lang.String r0 = X.AnonymousClass02R.A09(r0, r3, r3, r4)
            android.content.SharedPreferences$Editor r0 = r6.putString(r5, r0)
            r0.apply()
            return
        L_0x0772:
            java.lang.Object r0 = r1.A00
            X.1LR r0 = (X.AnonymousClass1LR) r0
            java.lang.String r5 = r1.A03
            java.lang.Object r3 = r1.A01
            java.lang.Object r4 = r1.A02
            X.005 r0 = r0.A03
            java.lang.Object r2 = r0.get()
            X.1b9 r2 = (X.C31021b9) r2
            X.0wk r0 = r2.A09
            r6 = 8
            X.1ip r1 = new X.1ip
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35521ip.run():void");
    }
}
