package X;

/* renamed from: X.73L  reason: invalid class name */
public class AnonymousClass73L implements Runnable {
    public long A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass73L(Object obj, Object obj2, Object obj3, int i, long j) {
        this.A04 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A00 = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b0, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b1, code lost:
        X.C05600Qi.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b4, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r1 = r21
            int r0 = r1.A04
            switch(r0) {
                case 0: goto L_0x00ed;
                case 1: goto L_0x002b;
                case 2: goto L_0x0040;
                case 3: goto L_0x00b5;
                case 4: goto L_0x0310;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r5 = r1.A01
            com.whatsapp.inappsupportbloks.components.BloksSupportVideoView r5 = (com.whatsapp.inappsupportbloks.components.BloksSupportVideoView) r5
            java.lang.Object r4 = r1.A02
            java.lang.StringBuilder r4 = (java.lang.StringBuilder) r4
            java.lang.Object r0 = r1.A03
            java.util.Formatter r0 = (java.util.Formatter) r0
            long r2 = r1.A00
            X.C36321k7.A0x(r4, r0)
            com.whatsapp.WaTextView r1 = r5.A04
            if (r1 != 0) goto L_0x0023
            java.lang.String r0 = "durationText"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0023:
            java.lang.String r0 = X.C111825cu.A00(r4, r0, r2)
            r1.setText(r0)
            return
        L_0x002b:
            java.lang.Object r0 = r1.A01
            X.3CL r0 = (X.AnonymousClass3CL) r0
            java.lang.Object r3 = r1.A02
            X.2q9 r3 = (X.C52772q9) r3
            java.lang.Object r2 = r1.A03
            X.39o r2 = (X.C608439o) r2
            long r4 = r1.A00
            X.3Sv r1 = r0.A00
            r6 = 1
            X.C65623Sv.A01(r1, r2, r3, r4, r6)
            return
        L_0x0040:
            java.lang.Object r7 = r1.A01
            X.11F r7 = (X.AnonymousClass11F) r7
            java.lang.Object r9 = r1.A02
            X.2KO r9 = (X.AnonymousClass2KO) r9
            long r3 = r1.A00
            java.lang.Object r8 = r1.A03
            X.3T1 r8 = (X.AnonymousClass3T1) r8
            if (r7 == 0) goto L_0x0072
            X.19x r1 = r9.A0E
            X.0wo r0 = r9.A08
            long r5 = X.C19970wo.A00(r0)
            long r10 = r8.A1N
            java.lang.String r2 = "reminder content"
            X.19w r0 = r1.A01
            X.3Qa r0 = X.C36411kG.A0o(r7, r0)
            X.5JE r1 = new X.5JE
            r1.<init>(r0, r5)
            r1.A00 = r10
            r1.A02 = r2
            r1.A01 = r3
            X.0xM r0 = r9.A0C
            r0.A0P(r1)
        L_0x0072:
            X.163 r0 = r9.A0B
            long r1 = r0.A09(r8)
            X.3Fb r0 = r9.A0D
            java.lang.Long r5 = java.lang.Long.valueOf(r1)
            X.12P r0 = r0.A00
            X.1M0 r7 = r0.A05()
            r0 = 3
            android.content.ContentValues r6 = new android.content.ContentValues     // Catch:{ all -> 0x00ae }
            r6.<init>(r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = "message_row_id"
            long r0 = r8.A1N     // Catch:{ all -> 0x00ae }
            X.C36341k9.A0p(r6, r2, r0)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "scheduled_reminder_timestamp_ms"
            X.C36341k9.A0p(r6, r0, r3)     // Catch:{ all -> 0x00ae }
            java.lang.String r0 = "chat_row_id"
            r6.put(r0, r5)     // Catch:{ all -> 0x00ae }
            X.14e r5 = r7.A02     // Catch:{ all -> 0x00ae }
            java.lang.String r2 = "scheduled_reminder_message"
            r1 = 5
            java.lang.String r0 = "ScheduledReminderMessageStore/INSERT"
            r5.A08(r2, r0, r6, r1)     // Catch:{ all -> 0x00ae }
            r7.close()
            X.3Qi r0 = r9.A06
            r0.A03(r8, r3)
            return
        L_0x00ae:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00b0 }
        L_0x00b0:
            r0 = move-exception
            X.C05600Qi.A00(r7, r1)
            throw r0
        L_0x00b5:
            java.lang.Object r2 = r1.A01
            X.3fk r2 = (X.C70803fk) r2
            java.lang.Object r4 = r1.A02
            X.11F r4 = (X.AnonymousClass11F) r4
            long r9 = r1.A00
            java.lang.Object r3 = r1.A03
            X.2Sh r3 = (X.C45682Sh) r3
            X.4V6 r0 = r2.A2l
            X.17X r0 = r0.getGroupParticipantsManager()
            java.util.HashSet r1 = r0.A05(r4)
            X.4V6 r0 = r2.A2l
            X.0wN r0 = r0.getCrashLogs()
            java.util.Set r0 = X.AnonymousClass143.A09(r0, r1)
            int r7 = r0.size()
            X.1Rg r5 = r2.A59
            int r8 = r1.size()
            r6 = 3
            X.0wU r0 = r5.A0J
            X.3vv r2 = new X.3vv
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            r0.Boy(r2)
            return
        L_0x00ed:
            java.lang.Object r10 = r1.A01
            X.6Ui r10 = (X.C132576Ui) r10
            java.lang.Object r9 = r1.A02
            byte[] r9 = (byte[]) r9
            java.lang.Object r11 = r1.A03
            byte[] r11 = (byte[]) r11
            X.6W6 r8 = r10.A04
            android.content.SharedPreferences r0 = X.AnonymousClass6W6.A00(r8)
            java.lang.String r13 = "blinding_factor_string"
            r6 = 0
            java.lang.String r0 = r0.getString(r13, r6)
            r5 = 8
            r12 = 0
            if (r0 == 0) goto L_0x0195
            byte[] r4 = android.util.Base64.decode(r0, r5)
        L_0x010f:
            r1 = 4
            r7 = 0
            if (r4 != 0) goto L_0x011f
            java.lang.String r0 = "ACSToken/processSignedBlindedToken blinding factor is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A04(r1)
        L_0x011b:
            X.C132576Ui.A02(r10, r7)
            return
        L_0x011f:
            monitor-enter(r10)
            org.whispersystems.curve25519.NativeVOPRFExtension r3 = r10.A00     // Catch:{ all -> 0x030d }
            if (r3 != 0) goto L_0x012b
            org.whispersystems.curve25519.NativeVOPRFExtension r3 = new org.whispersystems.curve25519.NativeVOPRFExtension     // Catch:{ all -> 0x030d }
            r3.<init>()     // Catch:{ all -> 0x030d }
            r10.A00 = r3     // Catch:{ all -> 0x030d }
        L_0x012b:
            monitor-exit(r10)     // Catch:{ all -> 0x030d }
            int r2 = r9.length
            int r1 = r4.length
            int r0 = r11.length
            r14 = r3
            r15 = r9
            r16 = r2
            r17 = r4
            r18 = r1
            r19 = r11
            r20 = r0
            byte[] r3 = r14.A01(r15, r16, r17, r18, r19, r20)
            if (r3 == 0) goto L_0x018c
            int r2 = r3.length
            r4 = 1
            if (r2 == r4) goto L_0x018c
            boolean r0 = r10.A0F
            android.content.SharedPreferences r1 = X.AnonymousClass6W6.A00(r8)
            if (r0 == 0) goto L_0x015c
            java.lang.String r0 = "next_original_token_string"
            java.lang.String r6 = r1.getString(r0, r6)
        L_0x0153:
            if (r6 == 0) goto L_0x0183
            byte[] r5 = android.util.Base64.decode(r6, r5)
            if (r5 == 0) goto L_0x0183
            goto L_0x0163
        L_0x015c:
            java.lang.String r0 = "original_token_string"
            java.lang.String r6 = r1.getString(r0, r6)
            goto L_0x0153
        L_0x0163:
            java.lang.String r0 = "SHA-512"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0177 }
            int r0 = r5.length     // Catch:{ NoSuchAlgorithmException -> 0x0177 }
            r1.update(r5, r7, r0)     // Catch:{ NoSuchAlgorithmException -> 0x0177 }
            r1.update(r3, r7, r2)     // Catch:{ NoSuchAlgorithmException -> 0x0177 }
            byte[] r4 = r1.digest()     // Catch:{ NoSuchAlgorithmException -> 0x0177 }
            if (r4 == 0) goto L_0x017d
            goto L_0x0198
        L_0x0177:
            r1 = move-exception
            java.lang.String r0 = "ACSToken/computeSharedSecret got exception = "
            com.whatsapp.util.Log.e(r0, r1)
        L_0x017d:
            r0 = 14
            r8.A04(r0)
            goto L_0x011b
        L_0x0183:
            java.lang.String r0 = "ACSToken/processSignedBlindedToken originalToken is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A04(r4)
            goto L_0x011b
        L_0x018c:
            java.lang.String r0 = "ACSToken/processSignedBlindedToken failed to unblind the token"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r8.A04(r5)
            goto L_0x011b
        L_0x0195:
            r4 = r6
            goto L_0x010f
        L_0x0198:
            monitor-enter(r10)
            java.lang.String r3 = "redeem_count"
            X.AnonymousClass6W6.A01(r8, r3, r7)     // Catch:{ all -> 0x030a }
            r2 = 10
            java.lang.String r1 = android.util.Base64.encodeToString(r4, r2)     // Catch:{ all -> 0x030a }
            java.lang.String r0 = "shared_secret_string"
            X.AnonymousClass6W6.A03(r8, r0, r1)     // Catch:{ all -> 0x030a }
            X.0wo r0 = r10.A06     // Catch:{ all -> 0x030a }
            long r0 = X.C36371kC.A09(r0)     // Catch:{ all -> 0x030a }
            java.lang.String r11 = "base_timestamp"
            X.AnonymousClass6W6.A02(r8, r11, r0)     // Catch:{ all -> 0x030a }
            X.AnonymousClass6W6.A03(r8, r13, r12)     // Catch:{ all -> 0x030a }
            boolean r0 = r10.A0F     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x01c7
            java.lang.String r0 = "original_token_string"
            X.AnonymousClass6W6.A03(r8, r0, r6)     // Catch:{ all -> 0x030a }
            java.lang.String r0 = "next_original_token_string"
            X.AnonymousClass6W6.A03(r8, r0, r12)     // Catch:{ all -> 0x030a }
            r10.A0F = r7     // Catch:{ all -> 0x030a }
        L_0x01c7:
            long r17 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x030a }
            X.5sk r12 = r10.A03     // Catch:{ all -> 0x030a }
            r0 = 0
            long r15 = r17 - r0
            long r0 = r10.A0C     // Catch:{ all -> 0x030a }
            long r17 = r17 - r0
            int r0 = r10.A0B     // Catch:{ all -> 0x030a }
            long r0 = (long) r0     // Catch:{ all -> 0x030a }
            int r13 = r10.A01     // Catch:{ all -> 0x030a }
            r11 = 1
            X.58N r14 = new X.58N     // Catch:{ all -> 0x030a }
            r14.<init>()     // Catch:{ all -> 0x030a }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x030a }
            r14.A04 = r11     // Catch:{ all -> 0x030a }
            java.lang.Long r11 = java.lang.Long.valueOf(r15)     // Catch:{ all -> 0x030a }
            r14.A05 = r11     // Catch:{ all -> 0x030a }
            java.lang.Long r11 = java.lang.Long.valueOf(r17)     // Catch:{ all -> 0x030a }
            r14.A07 = r11     // Catch:{ all -> 0x030a }
            java.lang.Long r0 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x030a }
            r14.A06 = r0     // Catch:{ all -> 0x030a }
            X.0zA r0 = r12.A00     // Catch:{ all -> 0x030a }
            boolean r0 = r0.A00     // Catch:{ all -> 0x030a }
            int r0 = X.C36391kE.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x030a }
            r14.A02 = r0     // Catch:{ all -> 0x030a }
            X.19J r0 = r12.A01     // Catch:{ all -> 0x030a }
            int r1 = r0.A04     // Catch:{ all -> 0x030a }
            r11 = 2
            r0 = 0
            if (r1 != r11) goto L_0x020f
            r0 = 1
        L_0x020f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ all -> 0x030a }
            r14.A01 = r0     // Catch:{ all -> 0x030a }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x030a }
            r14.A03 = r0     // Catch:{ all -> 0x030a }
            X.0yW r13 = r12.A02     // Catch:{ all -> 0x030a }
            r13.Bly(r14)     // Catch:{ all -> 0x030a }
            r0 = 0
            r10.A0D = r0     // Catch:{ all -> 0x030a }
            r10.A0G = r0     // Catch:{ all -> 0x030a }
            r10.A0B = r7     // Catch:{ all -> 0x030a }
            r10.A0E = r7     // Catch:{ all -> 0x030a }
            r0 = 0
            r10.A0C = r0     // Catch:{ all -> 0x030a }
            r8.A04(r7)     // Catch:{ all -> 0x030a }
            X.5sl r12 = new X.5sl     // Catch:{ all -> 0x030a }
            r12.<init>(r5, r4, r7)     // Catch:{ all -> 0x030a }
            android.content.SharedPreferences r1 = X.AnonymousClass6W6.A00(r8)     // Catch:{ all -> 0x030a }
            r0 = -1
            int r7 = r1.getInt(r3, r0)     // Catch:{ all -> 0x030a }
            X.0yC r1 = r10.A07     // Catch:{ all -> 0x030a }
            r0 = 1143(0x477, float:1.602E-42)
            boolean r0 = r1.A0E(r0)     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x026c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ all -> 0x030a }
            java.lang.String r0 = android.util.Base64.encodeToString(r9, r2)     // Catch:{ all -> 0x030a }
            r1.append(r0)     // Catch:{ all -> 0x030a }
            java.lang.String r0 = "+"
            r1.append(r0)     // Catch:{ all -> 0x030a }
            java.lang.String r0 = android.util.Base64.encodeToString(r4, r2)     // Catch:{ all -> 0x030a }
            java.lang.String r1 = X.AnonymousClass000.A0q(r0, r1)     // Catch:{ all -> 0x030a }
            X.2O4 r0 = new X.2O4     // Catch:{ all -> 0x030a }
            r0.<init>()     // Catch:{ all -> 0x030a }
            r0.A01 = r1     // Catch:{ all -> 0x030a }
            r0.A00 = r6     // Catch:{ all -> 0x030a }
            r13.Bly(r0)     // Catch:{ all -> 0x030a }
        L_0x026c:
            java.util.concurrent.CopyOnWriteArrayList r0 = r10.A0A     // Catch:{ all -> 0x030a }
            java.util.Iterator r14 = r0.iterator()     // Catch:{ all -> 0x030a }
        L_0x0272:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x030a }
            if (r0 == 0) goto L_0x0305
            java.lang.Object r9 = r14.next()     // Catch:{ all -> 0x030a }
            X.6KZ r9 = (X.AnonymousClass6KZ) r9     // Catch:{ all -> 0x030a }
            java.lang.String r6 = r10.A09     // Catch:{ all -> 0x030a }
            java.lang.ref.WeakReference r0 = r9.A00     // Catch:{ all -> 0x030a }
            java.lang.Object r13 = r0.get()     // Catch:{ all -> 0x030a }
            X.6VU r13 = (X.AnonymousClass6VU) r13     // Catch:{ all -> 0x030a }
            if (r13 == 0) goto L_0x02f9
            byte[] r5 = r12.A01     // Catch:{ Exception -> 0x02e4 }
            if (r5 == 0) goto L_0x02c1
            byte[] r0 = r12.A02     // Catch:{ Exception -> 0x02e4 }
            if (r0 == 0) goto L_0x02c1
            X.6p5 r0 = r9.A03     // Catch:{ Exception -> 0x02e4 }
            java.lang.String r4 = r0.A00(r12)     // Catch:{ Exception -> 0x02e4 }
            boolean r0 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x02e4 }
            if (r0 == 0) goto L_0x02a2
            r13.A0C(r11)     // Catch:{ Exception -> 0x02e4 }
            goto L_0x02f9
        L_0x02a2:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x02e4 }
            java.lang.String r0 = android.util.Base64.encodeToString(r5, r2)     // Catch:{ Exception -> 0x02e4 }
            r1.append(r0)     // Catch:{ Exception -> 0x02e4 }
            java.lang.String r0 = "+"
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r4, r1)     // Catch:{ Exception -> 0x02e4 }
            X.6Tt r0 = r13.A06     // Catch:{ Exception -> 0x02e4 }
            boolean r0 = X.C36431kI.A1Y(r0)     // Catch:{ Exception -> 0x02e4 }
            if (r0 != 0) goto L_0x02f9
            r13.A01 = r1     // Catch:{ Exception -> 0x02e4 }
            X.AnonymousClass6VU.A03(r13)     // Catch:{ Exception -> 0x02e4 }
            goto L_0x02f9
        L_0x02c1:
            int r1 = r12.A00     // Catch:{ Exception -> 0x02e4 }
            X.6Tt r0 = r13.A06     // Catch:{ Exception -> 0x02e4 }
            boolean r0 = X.C36431kI.A1Y(r0)     // Catch:{ Exception -> 0x02e4 }
            if (r0 != 0) goto L_0x02f9
            X.7jR r0 = r13.A03     // Catch:{ Exception -> 0x02e4 }
            if (r0 == 0) goto L_0x02d2
            X.AnonymousClass6VU.A03(r13)     // Catch:{ Exception -> 0x02e4 }
        L_0x02d2:
            r4 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ Exception -> 0x02e4 }
            boolean r0 = r13 instanceof X.C1043959n     // Catch:{ Exception -> 0x02e4 }
            if (r0 != 0) goto L_0x02f9
            r0 = r13
            X.59o r0 = (X.C1044059o) r0     // Catch:{ Exception -> 0x02e4 }
            X.7iw r0 = r0.A02     // Catch:{ Exception -> 0x02e4 }
            r0.BOY(r4, r1)     // Catch:{ Exception -> 0x02e4 }
            goto L_0x02f9
        L_0x02e4:
            java.lang.String r0 = "ACSTokenProviderImpl/ACSTokenListener/onNewTokenIssued Error while fetching ACS token"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0300 }
            X.6p5 r0 = r9.A03     // Catch:{ all -> 0x0300 }
            X.0wN r5 = r0.A00     // Catch:{ all -> 0x0300 }
            java.lang.String r4 = "ACSTokenProviderImpl/ACSTokenListener/onNewTokenIssued"
            java.lang.String r1 = "Error while fetching ACS token"
            r0 = 1
            r5.A0E(r4, r1, r0)     // Catch:{ all -> 0x0300 }
            r0 = 5
            r13.A0C(r0)     // Catch:{ all -> 0x0300 }
        L_0x02f9:
            X.AnonymousClass6KZ.A00(r9, r6)     // Catch:{ all -> 0x030a }
            int r7 = r7 + 1
            goto L_0x0272
        L_0x0300:
            r0 = move-exception
            X.AnonymousClass6KZ.A00(r9, r6)     // Catch:{ all -> 0x030a }
            throw r0     // Catch:{ all -> 0x030a }
        L_0x0305:
            X.AnonymousClass6W6.A01(r8, r3, r7)     // Catch:{ all -> 0x030a }
            monitor-exit(r10)     // Catch:{ all -> 0x030a }
            return
        L_0x030a:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x030a }
            throw r0
        L_0x030d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x030d }
            throw r0
        L_0x0310:
            java.lang.Object r2 = r1.A01
            X.6X1 r2 = (X.AnonymousClass6X1) r2
            java.lang.Object r9 = r1.A02
            byte[] r9 = (byte[]) r9
            java.lang.Object r13 = r1.A03
            byte[] r13 = (byte[]) r13
            X.6V6 r1 = r2.A05
            android.content.SharedPreferences r0 = X.AnonymousClass6V6.A01(r1)
            java.lang.String r6 = "blinding_factor"
            r11 = 0
            java.lang.String r0 = r0.getString(r6, r11)
            r4 = 8
            r5 = 0
            if (r0 == 0) goto L_0x0332
            byte[] r11 = android.util.Base64.decode(r0, r4)
        L_0x0332:
            r3 = 4
            r0 = 0
            if (r11 != 0) goto L_0x0342
            java.lang.String r4 = "PrivateStatsToken/processSignedBlindedToken blindingFactor is null"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            r1.A04(r3)
        L_0x033e:
            X.AnonymousClass6X1.A03(r2, r3, r0)
            return
        L_0x0342:
            X.0wo r7 = r2.A03
            android.os.SystemClock.elapsedRealtime()
            org.whispersystems.curve25519.NativeVOPRFExtension r8 = r2.A00
            if (r8 != 0) goto L_0x0352
            org.whispersystems.curve25519.NativeVOPRFExtension r8 = new org.whispersystems.curve25519.NativeVOPRFExtension
            r8.<init>()
            r2.A00 = r8
        L_0x0352:
            int r10 = r9.length
            int r12 = r11.length
            int r14 = r13.length
            byte[] r12 = r8.A01(r9, r10, r11, r12, r13, r14)
            android.os.SystemClock.elapsedRealtime()
            if (r12 == 0) goto L_0x0399
            int r11 = r12.length
            r13 = 1
            if (r11 == r13) goto L_0x0399
            boolean r8 = r2.A0F
            android.content.SharedPreferences r9 = X.AnonymousClass6V6.A01(r1)
            if (r8 == 0) goto L_0x0379
            java.lang.String r8 = "next_original_token"
        L_0x036c:
            java.lang.String r8 = r9.getString(r8, r5)
            if (r8 == 0) goto L_0x0390
            byte[] r10 = android.util.Base64.decode(r8, r4)
            if (r10 == 0) goto L_0x0390
            goto L_0x037c
        L_0x0379:
            java.lang.String r8 = "original_token"
            goto L_0x036c
        L_0x037c:
            java.lang.String r4 = "SHA-512"
            java.security.MessageDigest r9 = java.security.MessageDigest.getInstance(r4)     // Catch:{ NoSuchAlgorithmException -> 0x039f }
            int r4 = r10.length     // Catch:{ NoSuchAlgorithmException -> 0x039f }
            r9.update(r10, r0, r4)     // Catch:{ NoSuchAlgorithmException -> 0x039f }
            r9.update(r12, r0, r11)     // Catch:{ NoSuchAlgorithmException -> 0x039f }
            byte[] r9 = r9.digest()     // Catch:{ NoSuchAlgorithmException -> 0x039f }
            if (r9 == 0) goto L_0x03a5
            goto L_0x03ab
        L_0x0390:
            java.lang.String r4 = "PrivateStatsToken/processSignedBlindedToken originalToken is null"
            com.whatsapp.util.Log.e((java.lang.String) r4)
            r1.A04(r13)
            goto L_0x033e
        L_0x0399:
            java.lang.String r5 = "PrivateStatsToken/processSignedBlindedToken failed to unblind the token"
            com.whatsapp.util.Log.e((java.lang.String) r5)
            goto L_0x03a7
        L_0x039f:
            r5 = move-exception
            java.lang.String r4 = "PrivateStatsToken/computeSharedSecret got exception = "
            com.whatsapp.util.Log.e(r4, r5)
        L_0x03a5:
            r4 = 14
        L_0x03a7:
            r1.A04(r4)
            goto L_0x033e
        L_0x03ab:
            monitor-enter(r2)
            java.lang.String r4 = "redeem_count"
            android.content.SharedPreferences$Editor r3 = X.AnonymousClass6V6.A00(r1)     // Catch:{ all -> 0x0441 }
            android.content.SharedPreferences$Editor r3 = r3.putInt(r4, r0)     // Catch:{ all -> 0x0441 }
            r3.apply()     // Catch:{ all -> 0x0441 }
            r3 = 10
            java.lang.String r4 = android.util.Base64.encodeToString(r9, r3)     // Catch:{ all -> 0x0441 }
            java.lang.String r3 = "shared_secret"
            X.AnonymousClass6V6.A03(r1, r3, r4)     // Catch:{ all -> 0x0441 }
            X.0yf r4 = r2.A01     // Catch:{ all -> 0x0441 }
            X.0yh r3 = X.C21100yf.A07     // Catch:{ all -> 0x0441 }
            int r9 = r4.A04(r3)     // Catch:{ all -> 0x0441 }
            r4 = 10800(0x2a30, float:1.5134E-41)
            java.util.Random r3 = new java.util.Random     // Catch:{ all -> 0x0441 }
            r3.<init>()     // Catch:{ all -> 0x0441 }
            int r3 = r3.nextInt(r4)     // Catch:{ all -> 0x0441 }
            int r9 = r9 - r3
            long r3 = (long) r9     // Catch:{ all -> 0x0441 }
            java.lang.String r9 = "time_to_live"
            X.AnonymousClass6V6.A02(r1, r9, r3)     // Catch:{ all -> 0x0441 }
            long r3 = X.C36371kC.A09(r7)     // Catch:{ all -> 0x0441 }
            java.lang.String r7 = "base_timestamp"
            X.AnonymousClass6V6.A02(r1, r7, r3)     // Catch:{ all -> 0x0441 }
            X.AnonymousClass6V6.A03(r1, r6, r5)     // Catch:{ all -> 0x0441 }
            boolean r3 = r2.A0F     // Catch:{ all -> 0x0441 }
            if (r3 == 0) goto L_0x03fa
            java.lang.String r3 = "original_token"
            X.AnonymousClass6V6.A03(r1, r3, r8)     // Catch:{ all -> 0x0441 }
            java.lang.String r3 = "next_original_token"
            X.AnonymousClass6V6.A03(r1, r3, r5)     // Catch:{ all -> 0x0441 }
            r2.A0F = r0     // Catch:{ all -> 0x0441 }
        L_0x03fa:
            long r16 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0441 }
            X.1J6 r12 = r2.A04     // Catch:{ all -> 0x0441 }
            long r3 = r2.A0B     // Catch:{ all -> 0x0441 }
            long r14 = r16 - r3
            long r3 = r2.A0C     // Catch:{ all -> 0x0441 }
            long r16 = r16 - r3
            int r3 = r2.A0A     // Catch:{ all -> 0x0441 }
            long r3 = (long) r3     // Catch:{ all -> 0x0441 }
            r18 = r3
            r12.A01(r13, r14, r16, r18)     // Catch:{ all -> 0x0441 }
            r2.A0D = r5     // Catch:{ all -> 0x0441 }
            r2.A0G = r5     // Catch:{ all -> 0x0441 }
            r2.A0A = r0     // Catch:{ all -> 0x0441 }
            r2.A0E = r0     // Catch:{ all -> 0x0441 }
            r3 = 0
            r2.A0B = r3     // Catch:{ all -> 0x0441 }
            r2.A0C = r3     // Catch:{ all -> 0x0441 }
            android.content.SharedPreferences r5 = X.AnonymousClass6V6.A01(r1)     // Catch:{ all -> 0x0441 }
            java.lang.String r7 = "first_token_stage"
            int r5 = r5.getInt(r7, r0)     // Catch:{ all -> 0x0441 }
            if (r5 != r13) goto L_0x043c
            r6 = 2
            android.content.SharedPreferences$Editor r5 = X.AnonymousClass6V6.A00(r1)     // Catch:{ all -> 0x0441 }
            X.C36341k9.A0v(r5, r7, r6)     // Catch:{ all -> 0x0441 }
            java.lang.String r5 = "first_token_request_timestamp"
            X.AnonymousClass6V6.A02(r1, r5, r3)     // Catch:{ all -> 0x0441 }
            java.lang.String r5 = "first_token_delay_time"
            X.AnonymousClass6V6.A02(r1, r5, r3)     // Catch:{ all -> 0x0441 }
        L_0x043c:
            r1.A04(r0)     // Catch:{ all -> 0x0441 }
            monitor-exit(r2)     // Catch:{ all -> 0x0441 }
            return
        L_0x0441:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0441 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass73L.run():void");
    }
}
