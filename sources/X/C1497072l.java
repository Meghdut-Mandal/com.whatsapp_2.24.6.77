package X;

/* renamed from: X.72l  reason: invalid class name and case insensitive filesystem */
public class C1497072l implements Runnable {
    public Object A00;
    public final int A01;

    public C1497072l(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C19770wU r1, Object obj, int i) {
        r1.Boy(new C1497072l(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x03b5, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0401, code lost:
        r0 = r2.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0403, code lost:
        r0.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0406, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0487, code lost:
        r0 = java.lang.Long.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04a1, code lost:
        r0.A0T();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x054d, code lost:
        r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0550, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0590, code lost:
        r0.setVisibility(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0593, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b6, code lost:
        r2.BWb(X.C36441kJ.A0Q(r1, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x01e0;
                case 1: goto L_0x01fd;
                case 2: goto L_0x01fd;
                case 3: goto L_0x0205;
                case 4: goto L_0x000e;
                case 5: goto L_0x03b9;
                case 6: goto L_0x021e;
                case 7: goto L_0x029e;
                case 8: goto L_0x0252;
                case 9: goto L_0x026e;
                case 10: goto L_0x0283;
                case 11: goto L_0x029e;
                case 12: goto L_0x02ab;
                case 13: goto L_0x0333;
                case 14: goto L_0x0072;
                case 15: goto L_0x0087;
                case 16: goto L_0x03b9;
                case 17: goto L_0x00af;
                case 18: goto L_0x0348;
                case 19: goto L_0x0351;
                case 20: goto L_0x035c;
                case 21: goto L_0x039f;
                case 22: goto L_0x03a7;
                case 23: goto L_0x00d5;
                case 24: goto L_0x03b9;
                case 25: goto L_0x03c4;
                case 26: goto L_0x0407;
                case 27: goto L_0x03f6;
                case 28: goto L_0x040f;
                case 29: goto L_0x041b;
                case 30: goto L_0x0423;
                case 31: goto L_0x0443;
                case 32: goto L_0x0450;
                case 33: goto L_0x0472;
                case 34: goto L_0x048d;
                case 35: goto L_0x049d;
                case 36: goto L_0x04a5;
                case 37: goto L_0x058b;
                case 38: goto L_0x0102;
                case 39: goto L_0x04db;
                case 40: goto L_0x04db;
                case 41: goto L_0x0199;
                case 42: goto L_0x01a8;
                case 43: goto L_0x01be;
                case 44: goto L_0x04e7;
                case 45: goto L_0x04f6;
                case 46: goto L_0x0005;
                case 47: goto L_0x0005;
                case 48: goto L_0x0551;
                case 49: goto L_0x0595;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r11.A00
            X.6Uh r1 = (X.C132566Uh) r1
            r0 = 1
            X.C132566Uh.A01(r1, r0)
        L_0x000d:
            return
        L_0x000e:
            java.lang.Object r1 = r11.A00
            X.79A r1 = (X.AnonymousClass79A) r1
            java.lang.String r0 = "restore>AccountWithLatestGoogleDriveBackupFetcher/one-time-setup/taking-too-long"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5Mn r0 = r1.A00
            java.lang.ref.WeakReference r0 = r0.A08
            java.lang.Object r9 = r0.get()
            android.app.Activity r9 = (android.app.Activity) r9
            if (r9 == 0) goto L_0x000d
            r0 = 2131889897(0x7f120ee9, float:1.941447E38)
            java.lang.String r0 = r9.getString(r0)
            android.text.Spanned r0 = android.text.Html.fromHtml(r0)
            android.text.SpannableStringBuilder r8 = X.C36441kJ.A0P(r0)
            int r1 = r8.length()
            java.lang.Class<android.text.style.URLSpan> r0 = android.text.style.URLSpan.class
            r10 = 0
            java.lang.Object[] r7 = r8.getSpans(r10, r1, r0)
            android.text.style.URLSpan[] r7 = (android.text.style.URLSpan[]) r7
            if (r7 == 0) goto L_0x0577
            int r6 = r7.length
        L_0x0042:
            if (r10 >= r6) goto L_0x0577
            r5 = r7[r10]
            java.lang.String r1 = r5.getURL()
            java.lang.String r0 = "skip-looking-for-backups"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x006f
            java.lang.String r0 = "restore>RestoreFromBackupActivity/one-time-setup/taking-too-long/allow-user-to-skip-looking-for-backups"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            int r4 = r8.getSpanStart(r5)
            int r3 = r8.getSpanEnd(r5)
            int r2 = r8.getSpanFlags(r5)
            r8.removeSpan(r5)
            r1 = 0
            X.7oV r0 = new X.7oV
            r0.<init>(r9, r1)
            r8.setSpan(r0, r4, r3, r2)
        L_0x006f:
            int r10 = r10 + 1
            goto L_0x0042
        L_0x0072:
            java.lang.Object r1 = r11.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r1 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r1
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A0n(r1)
            if (r0 != 0) goto L_0x000d
            r0 = 2131430548(0x7f0b0c94, float:1.84828E38)
            android.view.View r0 = X.C03570Gk.A0B(r1, r0)
            r1 = 8
            goto L_0x0590
        L_0x0087:
            java.lang.Object r4 = r11.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r4 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r4
            X.0wG r0 = r4.A0K
            android.content.Context r0 = r0.A00
            int r3 = X.C34201gc.A00(r0)
            r2 = 0
            X.7q0 r1 = new X.7q0
            r1.<init>(r4, r2)
            r0 = 1
            android.app.Dialog r1 = X.AnonymousClass6Y6.A01(r4, r1, r3, r2, r0)
            if (r1 == 0) goto L_0x0585
            boolean r0 = com.whatsapp.backup.google.RestoreFromBackupActivity.A0n(r4)
            if (r0 != 0) goto L_0x000d
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-unavailable/prompting-user-to-fix"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.show()
            return
        L_0x00af:
            java.lang.Object r2 = r11.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            android.os.ConditionVariable r0 = r2.A0p
            r0.block()
            X.0v0 r0 = r2.A09
            boolean r0 = X.AnonymousClass6YN.A0F(r0)
            if (r0 != 0) goto L_0x00ca
            X.0v0 r0 = r2.A09
            int r1 = r0.A0E()
            r0 = 12
            if (r1 != r0) goto L_0x000d
        L_0x00ca:
            X.6FS r1 = r2.A0D
            r0 = 10
            r1.A06(r0)
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0K(r2)
            return
        L_0x00d5:
            java.lang.Object r3 = r11.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r3 = (com.whatsapp.backup.google.SettingsGoogleDrive) r3
            X.1Q9 r0 = r3.A0i
            boolean r1 = r0.A0Q()
            X.0v0 r0 = r3.A09
            boolean r0 = r0.A2I()
            if (r1 == 0) goto L_0x00fb
            if (r0 != 0) goto L_0x000d
            X.179 r0 = r3.A06
            X.AnonymousClass6YO.A0D(r0)
            X.17Y r2 = r3.A05
            r1 = 26
        L_0x00f2:
            X.72l r0 = new X.72l
            r0.<init>(r3, r1)
            r2.A0H(r0)
            return
        L_0x00fb:
            if (r0 == 0) goto L_0x000d
            X.17Y r2 = r3.A05
            r1 = 29
            goto L_0x00f2
        L_0x0102:
            java.lang.Object r4 = r11.A00
            X.57i r4 = (X.AnonymousClass57i) r4
            X.0yC r1 = r4.A05
            r0 = 1846(0x736, float:2.587E-42)
            java.lang.String r6 = r1.A09(r0)
            boolean r2 = r4.A01
            X.1KK r3 = r4.A03
            X.1KL r0 = r3.A03
            int r0 = r0.A00()
            r1 = r0 & 128(0x80, float:1.794E-43)
            r0 = 0
            if (r1 <= 0) goto L_0x011e
            r0 = 1
        L_0x011e:
            if (r2 != r0) goto L_0x0128
            java.lang.String r0 = r4.A00
            boolean r0 = r0.equals(r6)
            if (r0 != 0) goto L_0x000d
        L_0x0128:
            java.lang.String r0 = r4.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0136
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x000d
        L_0x0136:
            java.util.HashSet r5 = X.C36441kJ.A16()
            java.lang.String r0 = r4.A00
            java.lang.String r2 = ","
            java.lang.String[] r1 = r0.split(r2)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x014c
            java.util.List r0 = java.util.Arrays.asList(r1)
            r5.addAll(r0)
        L_0x014c:
            java.lang.String[] r1 = r6.split(r2)
            int r0 = r1.length
            if (r0 <= 0) goto L_0x015a
            java.util.List r0 = java.util.Arrays.asList(r1)
            r5.addAll(r0)
        L_0x015a:
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x000d
            java.util.Iterator r5 = r5.iterator()
        L_0x0164:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x000d
            java.lang.String r1 = X.AnonymousClass001.A0C(r5)
            X.13s r0 = com.whatsapp.jid.PhoneUserJid.Companion     // Catch:{ 0wR -> 0x0190 }
            com.whatsapp.jid.PhoneUserJid r2 = X.C222913s.A00(r1)     // Catch:{ 0wR -> 0x0190 }
            X.16D r0 = r4.A04
            boolean r0 = r0.A0q(r2)
            if (r0 != 0) goto L_0x0186
            X.5kp r0 = r4.A02
            X.1A6 r0 = r0.A00
            boolean r0 = r0.A0E(r2)
            if (r0 == 0) goto L_0x0164
        L_0x0186:
            r1 = 0
            X.6pi r0 = new X.6pi
            r0.<init>(r4)
            r3.A0E(r0, r2, r1)
            goto L_0x0164
        L_0x0190:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0164
        L_0x0199:
            java.lang.Object r0 = r11.A00
            X.8V9 r0 = (X.AnonymousClass8V9) r0
            X.B1n r2 = r0.A01
            if (r2 == 0) goto L_0x000d
            java.lang.Integer r1 = X.C36361kB.A0j()
            java.lang.String r0 = "delivery failed"
            goto L_0x01b6
        L_0x01a8:
            java.lang.Object r0 = r11.A00
            X.8V9 r0 = (X.AnonymousClass8V9) r0
            X.B1n r2 = r0.A01
            if (r2 == 0) goto L_0x000d
            java.lang.Integer r1 = X.C36361kB.A0i()
            java.lang.String r0 = "Direct connection error"
        L_0x01b6:
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            r2.BWb(r0)
            return
        L_0x01be:
            java.lang.Object r2 = r11.A00
            X.9dH r2 = (X.C198329dH) r2
            X.6VE r1 = r2.A0E
            com.whatsapp.jid.UserJid r0 = r2.A0K
            X.777 r0 = r1.A04(r0)
            java.lang.Object r1 = r0.get()     // Catch:{ Exception -> 0x01d9 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x01d9 }
            X.00s r0 = r2.A01     // Catch:{ Exception -> 0x01d9 }
            if (r0 == 0) goto L_0x000d
            r0.A0C(r1)     // Catch:{ Exception -> 0x01d9 }
            goto L_0x0594
        L_0x01d9:
            X.00s r2 = r2.A07
            if (r2 == 0) goto L_0x000d
            r0 = 1
            goto L_0x05a5
        L_0x01e0:
            java.lang.Object r2 = r11.A00
            com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment r2 = (com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment) r2
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r2.A03
            r0 = 5
            r1.A0X(r0)
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r2.A02
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x01f8
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r2.A02
            r0.A06()
            return
        L_0x01f8:
            r0 = -1
            com.whatsapp.backup.encryptedbackup.VerifyPasswordFragment.A00(r2, r0)
            return
        L_0x01fd:
            java.lang.Object r0 = r11.A00
            X.6yW r0 = (X.C148226yW) r0
            r0.A02()
            return
        L_0x0205:
            java.lang.Object r2 = r11.A00
            X.4xp r2 = (X.C101514xp) r2
            X.1Ck r1 = r2.A07
            java.lang.String r0 = r2.A0C
            r1.A03(r0)
            java.lang.String r0 = "encb/RegisterUserHandler/encrypted backup enabled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5kk r0 = r2.A08
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r0.A00
            r0 = 0
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel.A01(r1, r0)
            return
        L_0x021e:
            java.lang.Object r2 = r11.A00
            X.4y9 r2 = (X.C101704y9) r2
            android.os.ConditionVariable r0 = r2.A0O
            r0.block()
            X.0v0 r0 = r2.A09
            boolean r0 = X.AnonymousClass6YN.A0F(r0)
            if (r0 != 0) goto L_0x0239
            X.0v0 r0 = r2.A09
            int r1 = r0.A0E()
            r0 = 12
            if (r1 != r0) goto L_0x024e
        L_0x0239:
            X.6FS r1 = r2.A0E
            r0 = 10
            r1.A06(r0)
            X.0v0 r0 = r2.A09
            boolean r0 = X.AnonymousClass6Y6.A05(r0)
            if (r0 != 0) goto L_0x024e
            X.6FS r0 = r2.A0E
            X.C111795cr.A00(r2, r0)
            return
        L_0x024e:
            X.1ei r0 = r2.A0D
            goto L_0x0403
        L_0x0252:
            java.lang.Object r4 = r11.A00
            X.57h r4 = (X.C1038657h) r4
            X.1Cn r3 = r4.A02
            java.lang.String r2 = "send_gpb_signal"
            X.00T r0 = r3.A01
            android.content.SharedPreferences$Editor r1 = X.C36351kA.A0A(r0)
            r0 = 1
            X.C36331k8.A0w(r1, r2, r0)
            X.0yC r2 = r4.A04
            X.0zS r1 = r4.A06
            X.0v0 r0 = r4.A03
            X.C109835Zh.A00(r3, r0, r2, r1)
            return
        L_0x026e:
            java.lang.Object r1 = r11.A00
            X.6FS r1 = (X.AnonymousClass6FS) r1
            X.1ei r0 = r1.A04
            r0.A06()
            r0.A05()
            r0.A08()
            X.1ek r0 = r1.A05
            r0.A00()
            return
        L_0x0283:
            java.lang.Object r1 = r11.A00
            X.6FS r1 = (X.AnonymousClass6FS) r1
            X.1ei r0 = r1.A04
            r0.A06()
            r0.A05()
            r0.A08()
            X.1ek r0 = r1.A05
            r0.A01()
            X.0v0 r1 = r1.A09
            r0 = 0
            r1.A1A(r0)
            return
        L_0x029e:
            java.lang.Object r1 = r11.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0 = 10
            android.os.Process.setThreadPriority(r0)
            r1.run()
            return
        L_0x02ab:
            java.lang.Object r0 = r11.A00
            com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity r0 = (com.whatsapp.backup.google.GoogleDriveNewUserSetupActivity) r0
            com.whatsapp.backup.google.viewmodel.GoogleDriveNewUserSetupViewModel r2 = r0.A0G
            int r1 = r0.A00
            java.lang.String r0 = "gdrive-new-user-setup/next-setup-prompt-timestamp"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r7 = r2.A04
            if (r1 == 0) goto L_0x0312
            java.lang.String r0 = "wa-shared-prefs/reset-gdrive-prompt-shown-count"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences$Editor r0 = X.C19420v0.A00(r7)
            java.lang.String r3 = "gdrive_setup_user_prompted_count"
            X.C36341k9.A0u(r0, r3)
        L_0x02ca:
            long r4 = java.lang.System.currentTimeMillis()
            X.005 r8 = r7.A00
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r8)
            r6 = 0
            int r1 = r0.getInt(r3, r6)
            r0 = 4
            if (r1 >= r0) goto L_0x0304
            int r0 = r1 * 30
            long r2 = (long) r0
            r0 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r0
        L_0x02e3:
            long r4 = r4 + r2
        L_0x02e4:
            r7.A1G(r4)
            java.util.Locale r5 = java.util.Locale.ENGLISH
            java.lang.Object[] r4 = X.AnonymousClass001.A0L()
            java.lang.String r3 = "gdrive_next_prompt_for_setup_timestamp"
            r1 = -1
            android.content.SharedPreferences r0 = X.C36391kE.A0H(r8)
            long r0 = r0.getLong(r3, r1)
            X.AnonymousClass000.A1M(r4, r6, r0)
            java.lang.String r0 = "gdrive-new-user-setup/next-setup-prompt-timestamp/%d ms"
            java.lang.String r0 = java.lang.String.format(r5, r0, r4)
            goto L_0x03b5
        L_0x0304:
            if (r1 != r0) goto L_0x030c
            r2 = 15552000000(0x39ef8b000, double:7.683708924E-314)
            goto L_0x02e3
        L_0x030c:
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            goto L_0x02e4
        L_0x0312:
            java.lang.String r0 = "wa-shared-prefs/increment-gdrive-prompt-shown-count"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.SharedPreferences r0 = X.C36341k9.A0E(r7)
            java.lang.String r3 = "gdrive_setup_user_prompted_count"
            int r0 = X.C36371kC.A01(r0, r3)
            if (r0 >= 0) goto L_0x0324
            r0 = 0
        L_0x0324:
            int r2 = r0 + 1
            X.C36321k7.A0q(r7, r3, r2)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "wa-shared-prefs/increment-gdriveprompt-shown-count/new-count/"
            X.C36321k7.A1T(r0, r1, r2)
            goto L_0x02ca
        L_0x0333:
            java.lang.Object r2 = r11.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            X.0xM r1 = r2.A0N
            r0 = 0
            r1.A0b(r0, r0)
            X.0xM r0 = r2.A0N
            r0.A0W()
            X.0xM r0 = r2.A0N
            r0.A0X()
            return
        L_0x0348:
            java.lang.Object r1 = r11.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r1 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r1
            r0 = 1
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0h(r1, r0)
            return
        L_0x0351:
            java.lang.Object r0 = r11.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r0 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r0
            X.1ei r1 = r0.A0C
            r0 = 0
            r1.A0F(r0)
            return
        L_0x035c:
            java.lang.Object r2 = r11.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r2 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r2
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r2.A0F
            if (r0 != 0) goto L_0x036f
            r0 = 2131430561(0x7f0b0ca1, float:1.8482826E38)
            android.view.View r0 = r2.findViewById(r0)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = (com.whatsapp.backup.google.GoogleDriveRestoreAnimationView) r0
            r2.A0F = r0
        L_0x036f:
            r0 = 2131430548(0x7f0b0c94, float:1.84828E38)
            android.view.View r0 = X.C03570Gk.A0B(r2, r0)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131433400(0x7f0b17b8, float:1.8488585E38)
            X.C36391kE.A16(r2, r0, r1)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r2.A0F
            r1 = 0
            r0.setVisibility(r1)
            android.widget.ProgressBar r0 = r2.A02
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A04
            r0.setVisibility(r1)
            com.whatsapp.backup.google.GoogleDriveRestoreAnimationView r0 = r2.A0F
            r0.A01()
            android.widget.TextView r1 = r2.A04
            r0 = 2131894180(0x7f121fa4, float:1.9423157E38)
            r1.setText(r0)
            return
        L_0x039f:
            java.lang.Object r0 = r11.A00
            com.whatsapp.backup.google.RestoreFromBackupActivity r0 = (com.whatsapp.backup.google.RestoreFromBackupActivity) r0
            com.whatsapp.backup.google.RestoreFromBackupActivity.A0I(r0)
            return
        L_0x03a7:
            java.lang.Object r0 = r11.A00
            X.29P r0 = (X.AnonymousClass29P) r0
            com.whatsapp.backup.google.RestoreFromBackupActivity r0 = r0.A01
            android.widget.ProgressBar r1 = r0.A02
            r0 = 0
            r1.setIndeterminate(r0)
            java.lang.String r0 = "restore>RestoreFromBackupActivity/observer/msgstore download started"
        L_0x03b5:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x03b9:
            java.lang.Object r1 = r11.A00
            X.14u r1 = (X.C225314u) r1
            r0 = 2131894165(0x7f121f95, float:1.9423127E38)
            r1.BO5(r0)
            return
        L_0x03c4:
            java.lang.Object r2 = r11.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r2 = (com.whatsapp.backup.google.SettingsGoogleDrive) r2
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r2.A0b
            android.os.ConditionVariable r0 = r0.A01
            r0.block()
            X.0v0 r0 = r2.A09
            boolean r0 = X.AnonymousClass6YN.A0F(r0)
            if (r0 != 0) goto L_0x03e1
            X.0v0 r0 = r2.A09
            int r1 = r0.A0E()
            r0 = 12
            if (r1 != r0) goto L_0x0401
        L_0x03e1:
            X.6FS r1 = r2.A0Y
            r0 = 10
            r1.A06(r0)
            X.0v0 r0 = r2.A09
            boolean r0 = X.AnonymousClass6Y6.A05(r0)
            if (r0 != 0) goto L_0x0401
            X.6FS r0 = r2.A0Y
            X.C111795cr.A00(r2, r0)
            return
        L_0x03f6:
            java.lang.Object r2 = r11.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r2 = (com.whatsapp.backup.google.SettingsGoogleDrive) r2
            X.6FS r1 = r2.A0Y
            r0 = 10
            r1.A06(r0)
        L_0x0401:
            X.1ei r0 = r2.A0X
        L_0x0403:
            r0.A04()
            return
        L_0x0407:
            java.lang.Object r0 = r11.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = r0.A0b
            goto L_0x04a1
        L_0x040f:
            java.lang.Object r2 = r11.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r2 = (com.whatsapp.backup.google.SettingsGoogleDrive) r2
            X.1fs r1 = r2.A0d
            java.lang.String r0 = "chat-backup-help"
            r1.A01(r2, r0)
            return
        L_0x041b:
            java.lang.Object r0 = r11.A00
            com.whatsapp.backup.google.SettingsGoogleDrive r0 = (com.whatsapp.backup.google.SettingsGoogleDrive) r0
            com.whatsapp.backup.google.SettingsGoogleDrive.A0I(r0)
            return
        L_0x0423:
            java.lang.Object r5 = r11.A00
            com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r5 = (com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel) r5
            X.00s r4 = r5.A01
            X.0y0 r0 = r5.A03
            java.io.File r1 = r0.A0H()
            r0 = 0
            long r2 = X.AnonymousClass6YY.A00(r0, r1)
            X.1Q9 r0 = r5.A05
            long r0 = r0.A0F()
            long r2 = r2 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A0C(r0)
            return
        L_0x0443:
            java.lang.Object r0 = r11.A00
            com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel r0 = (com.whatsapp.backup.google.viewmodel.RestoreFromBackupViewModel) r0
            X.00s r2 = r0.A02
            X.1Q9 r0 = r0.A05
            long r0 = r0.A0E()
            goto L_0x0487
        L_0x0450:
            java.lang.Object r0 = r11.A00
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = (com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r0
            X.00s r3 = r0.A0O
            X.3S1 r2 = r0.A0R
            java.util.HashSet r1 = X.C36441kJ.A16()
            r0 = 3
            X.AnonymousClass000.A1F(r1, r0)
            r0 = 28
            X.AnonymousClass000.A1F(r1, r0)
            long r1 = r2.A02(r1)
            X.4yc r0 = new X.4yc
            r0.<init>(r1)
            r3.A0C(r0)
            return
        L_0x0472:
            java.lang.Object r3 = r11.A00
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r3 = (com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r3
            X.00s r2 = r3.A0G
            X.1Q9 r1 = r3.A0Z
            boolean r0 = r1.A0Q()
            X.C36341k9.A19(r2, r0)
            X.00s r2 = r3.A0H
            long r0 = r1.A0E()
        L_0x0487:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x05a9
        L_0x048d:
            java.lang.Object r0 = r11.A00
            X.5aG r0 = (X.C110185aG) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = (com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r0
            X.1eq r1 = r0.A0U
            X.1eo r0 = r0.A0W
            r1.A01(r0)
            return
        L_0x049d:
            java.lang.Object r0 = r11.A00
            com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel r0 = (com.whatsapp.backup.google.viewmodel.SettingsGoogleDriveViewModel) r0
        L_0x04a1:
            r0.A0T()
            return
        L_0x04a5:
            java.lang.Object r3 = r11.A00
            X.4bD r3 = (X.C90954bD) r3
            android.content.IntentFilter r2 = new android.content.IntentFilter
            r2.<init>()
            java.lang.String r0 = "android.intent.action.BATTERY_CHANGED"
            r2.addAction(r0)
            java.lang.String r0 = "android.os.action.POWER_SAVE_MODE_CHANGED"
            r2.addAction(r0)
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L_0x04d1
            X.0yC r1 = r3.A02
            r0 = 580(0x244, float:8.13E-43)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x04d1
            java.lang.String r0 = "com.samsung.android.action.WARNING_NOTIFICATION"
            r2.addAction(r0)
        L_0x04d1:
            android.content.Context r1 = r3.A00
            r0 = 1
            X.C26981Mg.A01(r3, r1, r2, r0)
            X.C90954bD.A02(r3)
            return
        L_0x04db:
            java.lang.Object r1 = r11.A00
            X.A8w r1 = (X.C21111A8w) r1
            X.9XI r0 = r1.A05
            X.2ZL r0 = r0.A05
            r0.unregisterObserver(r1)
            return
        L_0x04e7:
            java.lang.Object r2 = r11.A00
            X.6Uh r2 = (X.C132566Uh) r2
            X.6MH r1 = r2.A04
            com.whatsapp.jid.UserJid r0 = r2.A08
            r1.A01(r0)
            X.00s r1 = r2.A00
            r0 = 0
            goto L_0x054d
        L_0x04f6:
            java.lang.Object r3 = r11.A00
            X.6Uh r3 = (X.C132566Uh) r3
            r2 = 0
            X.1KP r6 = r3.A07
            X.1KK r0 = r3.A03
            com.whatsapp.jid.UserJid r4 = r3.A08
            X.9uZ r5 = r0.A07(r4)
            X.0yC r1 = r6.A01
            r0 = 5996(0x176c, float:8.402E-42)
            boolean r1 = r1.A0E(r0)
            java.lang.String r0 = "promotions"
            boolean r0 = X.AnonymousClass1KP.A00(r6, r5, r0, r1)
            if (r0 == 0) goto L_0x053c
            X.1Ws r0 = r3.A05
            java.util.Map r0 = r0.A01
            java.lang.Object r0 = r0.get(r4)
            X.9ct r0 = (X.C198089ct) r0
            if (r0 == 0) goto L_0x053a
            java.util.List r1 = r0.A02
        L_0x0523:
            X.00s r0 = r3.A02
            if (r1 != 0) goto L_0x0529
            X.09w r1 = X.C023409w.A00
        L_0x0529:
            r0.A0C(r1)
            X.C132566Uh.A01(r3, r2)
            X.9lS r1 = r3.A06
            X.7t8 r0 = new X.7t8
            r0.<init>(r3, r2)
            r1.A06(r0, r4)
            return
        L_0x053a:
            r1 = 0
            goto L_0x0523
        L_0x053c:
            X.00s r1 = r3.A02
            r0 = 0
            r1.A0C(r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.A0C
            r0.set(r2)
            X.00s r1 = r3.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
        L_0x054d:
            r1.A0C(r0)
            return
        L_0x0551:
            java.lang.Object r3 = r11.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r3 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r3
            int r1 = r3.A00
            r2 = 4
            r0 = 1
            if (r1 == 0) goto L_0x0574
            if (r1 == r0) goto L_0x0571
            r0 = 2
            if (r1 == r0) goto L_0x056e
            r0 = 3
            if (r1 == r0) goto L_0x056e
            if (r1 == r2) goto L_0x0566
            r2 = 1
        L_0x0566:
            X.1N6 r1 = r3.A0x
            com.whatsapp.jid.UserJid r0 = r3.A0o
            r1.A03(r0, r2)
            return
        L_0x056e:
            r2 = 60
            goto L_0x0566
        L_0x0571:
            r2 = 61
            goto L_0x0566
        L_0x0574:
            r2 = 59
            goto L_0x0566
        L_0x0577:
            r0 = 2131430482(0x7f0b0c52, float:1.8482666E38)
            android.widget.TextView r0 = X.C36401kF.A0H(r9, r0)
            r0.setText(r8)
            X.C36391kE.A1J(r0)
            return
        L_0x0585:
            java.lang.String r0 = "restore>RestoreFromBackupActivity/google-play-services-unavailable/ no way to install."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x058b:
            java.lang.Object r0 = r11.A00
            android.view.View r0 = (android.view.View) r0
            r1 = 0
        L_0x0590:
            r0.setVisibility(r1)
            return
        L_0x0594:
            return
        L_0x0595:
            java.lang.Object r1 = r11.A00
            com.whatsapp.biz.cart.view.fragment.CartFragment r1 = (com.whatsapp.biz.cart.view.fragment.CartFragment) r1
            X.7yb r0 = r1.A0P
            com.whatsapp.jid.UserJid r1 = r1.A0o
            X.00s r2 = r0.A0E
            X.9UA r0 = r0.A0H
            boolean r0 = r0.A01(r1)
        L_0x05a5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x05a9:
            r2.A0C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1497072l.run():void");
    }
}
