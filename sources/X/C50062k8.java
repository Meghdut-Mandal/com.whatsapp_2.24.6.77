package X;

import java.lang.ref.WeakReference;

/* renamed from: X.2k8  reason: invalid class name and case insensitive filesystem */
public class C50062k8 extends C132446Tt {
    public final int A00;
    public final C19420v0 A01;
    public final AnonymousClass3UV A02;
    public final C199929gH A03;
    public final AnonymousClass2d1 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public final boolean A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00da, code lost:
        if (r1.equals("silent_auth") != false) goto L_0x00dc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r25) {
        /*
            r24 = this;
            r1 = r25
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0 = 0
            r13 = r1[r0]
            java.lang.StringBuilder r2 = X.C36421kH.A0f(r13)
            java.lang.String r0 = "VerifyCodeTask/method="
            r2.append(r0)
            r9 = r24
            java.lang.String r1 = r9.A08
            r2.append(r1)
            java.lang.String r0 = "/useStandaloneVerification="
            r2.append(r0)
            boolean r7 = r9.A0B
            r2.append(r7)
            java.lang.String r0 = "/authCodeContext="
            r2.append(r0)
            java.lang.String r3 = r9.A06
            X.C36321k7.A1a(r2, r3)
            X.0v0 r2 = r9.A01
            X.005 r6 = r2.A00
            android.content.SharedPreferences r5 = X.C36391kE.A0H(r6)
            java.lang.String r4 = "com.whatsapp.registration.RegisterPhone.mistyped_state"
            r0 = 0
            java.lang.String r8 = r5.getString(r4, r0)
            if (r7 == 0) goto L_0x0092
            X.C18740tg.A06(r3)     // Catch:{ Exception -> 0x01a9 }
            X.3UV r7 = r9.A02     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r5 = r9.A07     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r4 = r9.A09     // Catch:{ Exception -> 0x01a9 }
            int r10 = r9.A00     // Catch:{ Exception -> 0x01a9 }
            X.2d1 r11 = r9.A04     // Catch:{ Exception -> 0x01a9 }
            r9 = 0
            X.AnonymousClass00C.A0D(r5, r9)     // Catch:{ Exception -> 0x01a9 }
            r12 = 1
            X.C36321k7.A0v(r4, r12, r13)     // Catch:{ Exception -> 0x01a9 }
            r9 = 4
            X.C36381kD.A1K(r3, r9, r11)     // Catch:{ Exception -> 0x01a9 }
            boolean r9 = r7.A0I()     // Catch:{ Exception -> 0x01a9 }
            if (r9 != 0) goto L_0x0064
            X.2oq r3 = X.C52072oq.ERROR_FAIL_TO_INITIALIZE_WAMSYS     // Catch:{ Exception -> 0x01a9 }
            X.3BM r5 = new X.3BM     // Catch:{ Exception -> 0x01a9 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x01a9 }
            goto L_0x013d
        L_0x0064:
            r7.A0H(r12)     // Catch:{ Exception -> 0x01a9 }
            byte[] r19 = r7.A0K(r5, r4)     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r9 = "verifyCodeForStandaloneVerification"
            byte[] r20 = r7.A0J(r9)     // Catch:{ Exception -> 0x01a9 }
            java.util.LinkedHashMap r18 = X.AnonymousClass3UV.A01(r7, r11, r8, r10)     // Catch:{ Exception -> 0x01a9 }
            X.3Sd r8 = r7.A09     // Catch:{ Exception -> 0x01a9 }
            java.util.List r17 = X.AnonymousClass3UV.A02(r7)     // Catch:{ Exception -> 0x01a9 }
            X.33T r7 = r7.A08     // Catch:{ Exception -> 0x01a9 }
            r21 = 3
            X.4WS r10 = new X.4WS     // Catch:{ Exception -> 0x01a9 }
            r11 = r7
            r12 = r8
            r14 = r5
            r15 = r4
            r16 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x01a9 }
            java.lang.Object r5 = X.AnonymousClass3PM.A00(r10)     // Catch:{ Exception -> 0x01a9 }
            X.3BM r5 = (X.AnonymousClass3BM) r5     // Catch:{ Exception -> 0x01a9 }
            goto L_0x013d
        L_0x0092:
            java.lang.String r4 = "autoconf"
            boolean r4 = r1.equals(r4)     // Catch:{ Exception -> 0x01a9 }
            if (r4 == 0) goto L_0x00c1
            X.9gH r5 = r9.A03     // Catch:{ Exception -> 0x01a9 }
            if (r5 != 0) goto L_0x00aa
            java.lang.String r2 = "VerifyCodeTask/doInBackground/autoconf manager not provided"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x01a9 }
            X.2oq r2 = X.C52072oq.ERROR_UNSPECIFIED     // Catch:{ Exception -> 0x01a9 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r2, r0)     // Catch:{ Exception -> 0x01a9 }
            return r0
        L_0x00aa:
            java.lang.String r4 = r9.A05     // Catch:{ Exception -> 0x01a9 }
            byte[] r5 = r5.A02(r4)     // Catch:{ Exception -> 0x01a9 }
            if (r5 == 0) goto L_0x00b5
            int r4 = r5.length     // Catch:{ Exception -> 0x01a9 }
            if (r4 != 0) goto L_0x00c2
        L_0x00b5:
            java.lang.String r2 = "VerifyCodeTask/doInBackground/no valid authResponse, skip sending autoconf verification request"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x01a9 }
            X.2oq r2 = X.C52072oq.ERROR_UNSPECIFIED     // Catch:{ Exception -> 0x01a9 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r2, r0)     // Catch:{ Exception -> 0x01a9 }
            return r0
        L_0x00c1:
            r5 = r0
        L_0x00c2:
            X.3UV r7 = r9.A02     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r14 = r9.A07     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r15 = r9.A09     // Catch:{ Exception -> 0x01a9 }
            int r10 = r9.A00     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r4 = "passkey"
            boolean r4 = r1.equals(r4)     // Catch:{ Exception -> 0x01a9 }
            if (r4 != 0) goto L_0x00dc
            java.lang.String r4 = "silent_auth"
            boolean r4 = r1.equals(r4)     // Catch:{ Exception -> 0x01a9 }
            r18 = r0
            if (r4 == 0) goto L_0x00de
        L_0x00dc:
            r18 = r1
        L_0x00de:
            X.2d1 r9 = r9.A04     // Catch:{ Exception -> 0x01a9 }
            r4 = 0
            X.AnonymousClass00C.A0D(r14, r4)     // Catch:{ Exception -> 0x01a9 }
            r11 = 1
            X.C36321k7.A0v(r15, r11, r13)     // Catch:{ Exception -> 0x01a9 }
            r4 = 9
            X.AnonymousClass00C.A0D(r9, r4)     // Catch:{ Exception -> 0x01a9 }
            boolean r4 = r7.A0I()     // Catch:{ Exception -> 0x01a9 }
            if (r4 != 0) goto L_0x00fb
            X.2oq r3 = X.C52072oq.ERROR_FAIL_TO_INITIALIZE_WAMSYS     // Catch:{ Exception -> 0x01a9 }
            X.3BM r5 = new X.3BM     // Catch:{ Exception -> 0x01a9 }
            r5.<init>(r3)     // Catch:{ Exception -> 0x01a9 }
            goto L_0x013d
        L_0x00fb:
            r7.A0H(r11)     // Catch:{ Exception -> 0x01a9 }
            byte[] r21 = r7.A0K(r14, r15)     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r4 = "verifyCode"
            byte[] r22 = r7.A0J(r4)     // Catch:{ Exception -> 0x01a9 }
            java.util.LinkedHashMap r4 = X.AnonymousClass3UV.A01(r7, r9, r8, r10)     // Catch:{ Exception -> 0x01a9 }
            X.AnonymousClass3UV.A08(r7, r4)     // Catch:{ Exception -> 0x01a9 }
            X.AnonymousClass3UV.A05(r7, r4)     // Catch:{ Exception -> 0x01a9 }
            X.AnonymousClass3UV.A07(r7, r4)     // Catch:{ Exception -> 0x01a9 }
            X.AnonymousClass3UV.A04(r7, r4)     // Catch:{ Exception -> 0x01a9 }
            X.AnonymousClass3UV.A06(r7, r4)     // Catch:{ Exception -> 0x01a9 }
            X.AnonymousClass3UV.A09(r7, r4)     // Catch:{ Exception -> 0x01a9 }
            X.3Sd r12 = r7.A09     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r8 = "register_entrypoint"
            java.lang.String r16 = r7.A0G(r14, r8)     // Catch:{ Exception -> 0x01a9 }
            java.util.List r19 = X.AnonymousClass3UV.A02(r7)     // Catch:{ Exception -> 0x01a9 }
            X.33T r11 = r7.A08     // Catch:{ Exception -> 0x01a9 }
            X.2ky r10 = new X.2ky     // Catch:{ Exception -> 0x01a9 }
            r20 = r4
            r23 = r5
            r17 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x01a9 }
            java.lang.Object r5 = X.AnonymousClass3PM.A00(r10)     // Catch:{ Exception -> 0x01a9 }
            X.3BM r5 = (X.AnonymousClass3BM) r5     // Catch:{ Exception -> 0x01a9 }
        L_0x013d:
            if (r5 != 0) goto L_0x014b
            java.lang.String r2 = "VerifyCodeTask/doInBackground/null verifyCodeResult"
            com.whatsapp.util.Log.e((java.lang.String) r2)     // Catch:{ Exception -> 0x01a9 }
            X.2oq r2 = X.C52072oq.ERROR_UNSPECIFIED     // Catch:{ Exception -> 0x01a9 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r2, r0)     // Catch:{ Exception -> 0x01a9 }
            return r0
        L_0x014b:
            java.lang.StringBuilder r7 = X.AnonymousClass000.A0u()     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r3 = "VerifyCodeTask/register entrypoint response/autoconfType="
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            int r3 = r5.A00     // Catch:{ Exception -> 0x01a9 }
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r3 = "/secureVerifier="
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            boolean r3 = r5.A0G     // Catch:{ Exception -> 0x01a9 }
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r3 = "/resetMethod="
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r3 = r5.A09     // Catch:{ Exception -> 0x01a9 }
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r3 = "/wipeWait="
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            long r3 = r5.A03     // Catch:{ Exception -> 0x01a9 }
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r3 = "/smsWait="
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            long r3 = r5.A01     // Catch:{ Exception -> 0x01a9 }
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r3 = ";voiceWait="
            r7.append(r3)     // Catch:{ Exception -> 0x01a9 }
            long r3 = r5.A02     // Catch:{ Exception -> 0x01a9 }
            X.C36351kA.A1S(r7, r3)     // Catch:{ Exception -> 0x01a9 }
            r2.A1U(r13)     // Catch:{ Exception -> 0x01a9 }
            int r3 = r5.A00     // Catch:{ Exception -> 0x01a9 }
            r2.A13(r3)     // Catch:{ Exception -> 0x01a9 }
            boolean r4 = r5.A0G     // Catch:{ Exception -> 0x01a9 }
            android.content.SharedPreferences r2 = X.C36391kE.A0H(r6)     // Catch:{ Exception -> 0x01a9 }
            android.content.SharedPreferences$Editor r3 = r2.edit()     // Catch:{ Exception -> 0x01a9 }
            java.lang.String r2 = "pref_autoconf_secure_verifier"
            X.C36331k8.A0w(r3, r2, r4)     // Catch:{ Exception -> 0x01a9 }
            X.2oq r2 = r5.A05     // Catch:{ Exception -> 0x01a9 }
            android.util.Pair r0 = X.C36441kJ.A0Q(r2, r5)     // Catch:{ Exception -> 0x01a9 }
            return r0
        L_0x01a9:
            r4 = move-exception
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0u()
            java.lang.String r2 = "verifycode/"
            r3.append(r2)
            r3.append(r1)
            java.lang.String r1 = "/error "
            X.C36351kA.A1Q(r1, r3, r4)
            X.2oq r1 = X.C52072oq.ERROR_UNSPECIFIED
            android.util.Pair r0 = X.C36441kJ.A0Q(r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50062k8.A08(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0255, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/verifyvoice/verifyvoice/too-many-guesses/unable-to-parse-retryAfter", r1);
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1H(r8, 28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0261, code lost:
        if (r6 != X.C52072oq.A0B) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0263, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1L(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0268, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0s(r2, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x026d, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0u(r2, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02c5, code lost:
        if (r7.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02c7, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("VerifyPhoneNumber/onVerifyGenericCodeResponse/method=");
        r1.append(r7);
        X.C36321k7.A1K(r6, "/status=", r1);
        r4 = X.C36441kJ.A1N(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02dc, code lost:
        if (r4 == false) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02e0, code lost:
        if (r6 == X.C52072oq.A0G) goto L_0x02e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x02e2, code lost:
        r8.A09.A1Q("email_otp_verification_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02e9, code lost:
        r9 = X.C52072oq.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02eb, code lost:
        if (r6 == r9) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ef, code lost:
        if (r6 == X.C52072oq.A0H) goto L_0x04b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f3, code lost:
        if (r6 != X.C52072oq.A04) goto L_0x031a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02f5, code lost:
        r8.BKE();
        X.C55232uI.A00(r8.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0301, code lost:
        if (X.C36441kJ.A1M(r7) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0303, code lost:
        if (r6 == r9) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0307, code lost:
        if (r6 == X.C52072oq.A0H) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x030b, code lost:
        if (r6 == X.C52072oq.A0G) goto L_0x0315;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x030d, code lost:
        r1 = r8.A09;
        r0 = "wa_old_failed";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0311, code lost:
        r1.A1a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0314, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0315, code lost:
        r1 = r8.A09;
        r0 = "wa_old_successful";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x031c, code lost:
        if (r6 != X.C52072oq.A09) goto L_0x0322;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x031e, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0v(r2, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0322, code lost:
        r10 = r8.A16.A03(r8.A1D, r8.A1F);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x032e, code lost:
        if (r6 != X.C52072oq.A03) goto L_0x0352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0330, code lost:
        X.C36321k7.A1Q("VerifyPhoneNumber/onVerifyGenericCodeErrorConnectivity/method=", r7, X.AnonymousClass000.A0u());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x033d, code lost:
        if (X.C36441kJ.A1M(r7) == false) goto L_0x0467;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x033f, code lost:
        r0 = X.C36341k9.A0e(r8, X.AnonymousClass001.A0L(), com.whatsapp.R.string.f12nameremoved, 0, com.whatsapp.R.string.f12nameremoved);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x034e, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1M(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0354, code lost:
        if (r6 != X.C52072oq.A08) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0356, code lost:
        X.C36321k7.A1Q("VerifyPhoneNumber/onVerifyGenericCodeErrorGuessedTooFast/method=", r7, X.AnonymousClass000.A0u());
        X.C65983Uf.A0Q(r8.A09, "server-send-guessed-too-fast");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x036a, code lost:
        if (X.C36441kJ.A1M(r7) != false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x036c, code lost:
        if (r4 != false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x036e, code lost:
        if (r10 != null) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0370, code lost:
        r0 = "VerifyPhoneNumber/verifysms/error/too-fast/saved-code-is-null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0372, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0379, code lost:
        if (r8.A0o.A00 != false) goto L_0x0381;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x037f, code lost:
        if (r8.BLh() == false) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0381, code lost:
        X.C65983Uf.A0J(r8, r8.A0b, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0389, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0392, code lost:
        if (r6 != X.C52072oq.A0D) goto L_0x03b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0394, code lost:
        X.C36321k7.A1Q("VerifyPhoneNumber/onVerifyGenericCodeErrorTemporarilyUnavailable/method=", r7, X.AnonymousClass000.A0u());
        X.C65983Uf.A0Q(r8.A09, "server-send-error-temporarily-unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x03a8, code lost:
        if (X.C36441kJ.A1M(r7) == false) goto L_0x03b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x03aa, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x03ad, code lost:
        r0 = r8.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03b2, code lost:
        if (r10 != null) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03b4, code lost:
        r0 = "VerifyPhoneNumber/verifysms/error/temp-unavail/saved-code-is-null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03b9, code lost:
        if (r6 != X.C52072oq.A0G) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03bb, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0t(r2, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c2, code lost:
        if (r6 == X.C52072oq.A02) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03c6, code lost:
        if (r6 == X.C52072oq.A0F) goto L_0x04af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03ca, code lost:
        if (r6 != X.C52072oq.A0B) goto L_0x03d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03cc, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1L(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d1, code lost:
        r8.A16.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03d8, code lost:
        if (r6 != X.C52072oq.A0A) goto L_0x040c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03da, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorMissing");
        X.C65983Uf.A0Q(r8.A09, "server-send-missing");
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03eb, code lost:
        if (r6 != X.C52072oq.A07) goto L_0x0375;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03ed, code lost:
        r3 = r2.A04;
        r2 = r2.A06;
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorBlocked");
        r8.A15.A02(12);
        X.C65983Uf.A0Q(r8.A09, "server-send-blocked");
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0q(r3, r2, r8);
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A18(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x040e, code lost:
        if (r6 != X.C52072oq.A0E) goto L_0x0420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0410, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorTooManyGuesses");
        X.C65983Uf.A0Q(r8.A09, "server-send-too-many-guesses");
        X.C36401kF.A1J(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0422, code lost:
        if (r6 != X.C52072oq.A06) goto L_0x043a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0424, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyGenericCodeErrorUnspecified");
        X.C65983Uf.A0Q(r8.A09, "server-send-error-unspecified");
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1P(r8, true);
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1H(r8, 109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x043c, code lost:
        if (r6 != X.C52072oq.A0C) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x043e, code lost:
        X.C36321k7.A1Q("VerifyPhoneNumber/onVerifyGenericCodeErrorStale/method=", r7, X.AnonymousClass000.A0u());
        X.C65983Uf.A0Q(r8.A09, "server-send-error-stale");
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0455, code lost:
        if (X.C36441kJ.A1M(r7) != false) goto L_0x045c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0457, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x045a, code lost:
        if (r4 == false) goto L_0x045f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x045c, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x045f, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1M(r8, r8.getString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0467, code lost:
        if (r10 != null) goto L_0x047b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0469, code lost:
        com.whatsapp.util.Log.e("VerifyPhoneNumber/verifysms/error/connectivity/saved-code-is-null");
        r8.A15.A02(4);
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1F(r8, 21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x047b, code lost:
        r4 = java.lang.Math.random();
        r1 = r8.A01;
        r8.A01 = r1 + 1;
        r11 = (int) (r4 * ((java.lang.Math.pow(2.0d, (double) r1) - 1.0d) * 4000.0d));
        X.C36321k7.A1T("VerifyPhoneNumber/verifysms/schedule-retry/", X.AnonymousClass000.A0u(), r11);
        r8.A13.sendMessageDelayed(r8.A13.obtainMessage(1, r10), (long) r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x04af, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0s(r2, r8, "sms");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x04b6, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0u(r2, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x04d9, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0t(r2, r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x04dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x04f0, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0u(r2, r8, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x04f3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0502, code lost:
        r8.BKE();
        X.C55232uI.A00(r8.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x050a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0089, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1E(r8, r8.A04);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0098, code lost:
        if (r7.equals(r0) == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009a, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashResponse/method=");
        r1.append(r7);
        X.C36321k7.A1K(r6, "/status=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ad, code lost:
        if (r6 == X.C52072oq.A0I) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b1, code lost:
        if (r6 == X.C52072oq.A0H) goto L_0x026d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b5, code lost:
        if (r6 != X.C52072oq.A0G) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00b7, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0t(r2, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ba, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1N(r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00bd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00c0, code lost:
        if (r6 == X.C52072oq.A02) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c4, code lost:
        if (r6 == X.C52072oq.A0F) goto L_0x0268;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00c6, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashError/method=");
        r1.append(r7);
        X.C36321k7.A1K(r6, "/status=", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00d7, code lost:
        if (r6 != X.C52072oq.A04) goto L_0x00fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00d9, code lost:
        r8.BKE();
        X.C55232uI.A00(r8.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ef, code lost:
        r8.A09.A1W("secondary_failed");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f6, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1E(r8, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00fd, code lost:
        if (r6 != X.C52072oq.A09) goto L_0x0103;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ff, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0v(r2, r8, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0105, code lost:
        if (r6 != X.C52072oq.A06) goto L_0x0116;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0107, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorUnspecified");
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1P(r8, true);
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1H(r8, 109);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0118, code lost:
        if (r6 != X.C52072oq.A0A) goto L_0x0140;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x011a, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorMissing");
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8);
        r3 = com.whatsapp.R.string.f12nameremoved;
        r2 = X.AnonymousClass001.A0M();
        r2[0] = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0K(r8);
        r1 = r8.getString(com.whatsapp.R.string.f12nameremoved);
        r0 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0138, code lost:
        r0 = X.C36391kE.A0v(r8, r1, r2, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013c, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1M(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0142, code lost:
        if (r6 != X.C52072oq.A0E) goto L_0x0164;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0144, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTooManyGuesses/retryAfter=");
        X.C36321k7.A1a(r1, r2.A0A);
        X.C36401kF.A1J(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x015d, code lost:
        if (X.AnonymousClass3MJ.A02(r2.A0A) != false) goto L_0x0239;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x015f, code lost:
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1H(r8, 28);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0166, code lost:
        if (r6 != X.C52072oq.A08) goto L_0x01ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0168, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorGuessedTooFast/retryAfter=");
        X.C36321k7.A1Z(r1, r2.A0A);
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017f, code lost:
        if (X.AnonymousClass3MJ.A02(r2.A0A) != false) goto L_0x0189;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0181, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0184, code lost:
        r0 = r8.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        r1 = X.C36411kG.A0B(r2.A0A);
        r8.A0r.A0C(r1);
        X.AnonymousClass3UY.A0I(r8, com.whatsapp.R.string.f12nameremoved, r1);
        r8.A0w.A0T(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01a1, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01a2, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/verifyvoice/verifyvoice/guessed-too-fast/unable-to-parse-retryAfter", r1);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ad, code lost:
        if (r6 != X.C52072oq.A03) goto L_0x01c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01af, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorConnectivity");
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1P(r8, true);
        r3 = com.whatsapp.R.string.f12nameremoved;
        r2 = new java.lang.Object[1];
        r1 = r8.getString(com.whatsapp.R.string.f12nameremoved);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01c9, code lost:
        if (r6 != X.C52072oq.A07) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01cb, code lost:
        r3 = r2.A04;
        r2 = r2.A06;
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorBlocked");
        r8.A15.A02(12);
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0q(r3, r2, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01e2, code lost:
        if (r6 != X.C52072oq.A0C) goto L_0x01f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01e4, code lost:
        com.whatsapp.util.Log.i("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorStale");
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01f2, code lost:
        if (r6 != X.C52072oq.A0D) goto L_0x025f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x01f4, code lost:
        r1 = X.AnonymousClass000.A0u();
        r1.append("VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTemporarilyUnavailable/retryAfter=");
        X.C36321k7.A1a(r1, r2.A0A);
        X.C65983Uf.A0Q(r8.A09, "voice-temporarily-unavailable");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x020f, code lost:
        if (X.AnonymousClass3MJ.A02(r2.A0A) != false) goto L_0x0216;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0211, code lost:
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:?, code lost:
        r1 = X.C36411kG.A0B(r2.A0A);
        r8.A0r.A0C(r1);
        X.AnonymousClass3UY.A0I(r8, com.whatsapp.R.string.f12nameremoved, r1);
        r8.A0w.A0T(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x022e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x022f, code lost:
        com.whatsapp.util.Log.w("VerifyPhoneNumber/verifyvoice/verifyvoice/unable-to-parse-retryAfter", r1);
        r0 = com.whatsapp.R.string.f12nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:?, code lost:
        r1 = X.C36411kG.A0B(r2.A0A);
        r8.A0C = r1;
        r8.A0r.A0C(r1);
        com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1H(r8, 32);
        r8.A0w.A0T(r8.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0254, code lost:
        r1 = move-exception;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r13) {
        /*
            r12 = this;
            android.util.Pair r13 = (android.util.Pair) r13
            java.lang.ref.WeakReference r0 = r12.A0A
            java.lang.Object r8 = r0.get()
            X.4UF r8 = (X.AnonymousClass4UF) r8
            if (r8 == 0) goto L_0x0022
            r8.BKE()
            java.lang.String r7 = r12.A08
            java.lang.Object r6 = r13.first
            X.2oq r6 = (X.C52072oq) r6
            java.lang.Object r2 = r13.second
            X.3BM r2 = (X.AnonymousClass3BM) r2
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber r8 = (com.whatsapp.registration.verifyphone.VerifyPhoneNumber) r8
            int r0 = r7.hashCode()
            switch(r0) {
                case -795576526: goto L_0x02bf;
                case -792038226: goto L_0x0275;
                case 114009: goto L_0x0272;
                case 97513456: goto L_0x0092;
                case 112386354: goto L_0x008f;
                case 601452370: goto L_0x005d;
                case 1439178067: goto L_0x0027;
                case 2120743944: goto L_0x0023;
                default: goto L_0x0022;
            }
        L_0x0022:
            return
        L_0x0023:
            java.lang.String r0 = "email_otp"
            goto L_0x02c1
        L_0x0027:
            java.lang.String r3 = "autoconf"
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyAutoconfResponse/status="
            X.C36321k7.A1K(r6, r0, r1)
            X.2oq r0 = X.C52072oq.YES
            r1 = 1
            if (r6 != r0) goto L_0x0042
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1G(r8, r1)
            goto L_0x04f0
        L_0x0042:
            X.2oq r0 = X.C52072oq.SECURITY_CODE
            if (r6 != r0) goto L_0x004b
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1G(r8, r1)
            goto L_0x04d9
        L_0x004b:
            X.2oq r1 = X.C52072oq.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            r0 = 0
            if (r6 == r1) goto L_0x0502
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1G(r8, r0)
            X.0v0 r1 = r8.A09
            java.lang.String r0 = r6.name()
            X.C65983Uf.A0Q(r1, r0)
            goto L_0x0089
        L_0x005d:
            java.lang.String r3 = "silent_auth"
            boolean r0 = r7.equals(r3)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthResponse/status="
            X.C36321k7.A1K(r6, r0, r1)
            int r7 = r6.ordinal()
            r5 = 0
            java.lang.String r4 = "ipification_auth_success"
            java.lang.String r6 = "silent_auth_successful"
            r1 = 1
            r0 = 0
            if (r7 == r0) goto L_0x04dd
            r0 = 12
            if (r7 == r0) goto L_0x04c6
            r0 = 2
            java.lang.String r1 = "silent_auth_verify_code_failed"
            if (r7 == r0) goto L_0x04bb
            X.0v0 r0 = r8.A09
            r0.A1Y(r1)
        L_0x0089:
            int r0 = r8.A04
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1E(r8, r0)
            return
        L_0x008f:
            java.lang.String r0 = "voice"
            goto L_0x0094
        L_0x0092:
            java.lang.String r0 = "flash"
        L_0x0094:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashResponse/method="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r3 = "/status="
            X.C36321k7.A1K(r6, r3, r1)
            X.2oq r0 = X.C52072oq.YES
            if (r6 == r0) goto L_0x026d
            X.2oq r0 = X.C52072oq.VERIFIED_STANDALONE
            if (r6 == r0) goto L_0x026d
            X.2oq r0 = X.C52072oq.SECURITY_CODE
            if (r6 != r0) goto L_0x00be
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0t(r2, r8, r7)
        L_0x00ba:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1N(r8, r7)
            return
        L_0x00be:
            X.2oq r0 = X.C52072oq.DEVICE_CONFIRM_OR_SECOND_OTP
            if (r6 == r0) goto L_0x0268
            X.2oq r0 = X.C52072oq.SECOND_OTP
            if (r6 == r0) goto L_0x0268
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashError/method="
            r1.append(r0)
            r1.append(r7)
            X.C36321k7.A1K(r6, r3, r1)
            X.2oq r0 = X.C52072oq.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            if (r6 != r0) goto L_0x00fb
            r8.BKE()
            X.17Y r0 = r8.A05
            X.C55232uI.A00(r0)
        L_0x00e1:
            java.lang.String r0 = "flash"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x00f6
            boolean r0 = X.C36431kI.A1S(r8)
            if (r0 != 0) goto L_0x00f6
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "secondary_failed"
            r1.A1W(r0)
        L_0x00f6:
            r0 = -1
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1E(r8, r0)
            goto L_0x00ba
        L_0x00fb:
            X.2oq r0 = X.C52072oq.FAIL_MISMATCH
            if (r6 != r0) goto L_0x0103
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0v(r2, r8, r7)
            goto L_0x00e1
        L_0x0103:
            X.2oq r0 = X.C52072oq.ERROR_UNSPECIFIED
            if (r6 != r0) goto L_0x0116
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorUnspecified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1P(r8, r0)
            r0 = 109(0x6d, float:1.53E-43)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1H(r8, r0)
            goto L_0x00e1
        L_0x0116:
            X.2oq r0 = X.C52072oq.FAIL_MISSING
            if (r6 != r0) goto L_0x0140
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorMissing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8)
            r3 = 2131895566(0x7f12250e, float:1.9425969E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0M()
            java.lang.String r1 = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0K(r8)
            r0 = 0
            r2[r0] = r1
            r0 = 2131895616(0x7f122540, float:1.942607E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 1
        L_0x0138:
            java.lang.String r0 = X.C36391kE.A0v(r8, r1, r2, r0, r3)
        L_0x013c:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1M(r8, r0)
            goto L_0x00e1
        L_0x0140:
            X.2oq r0 = X.C52072oq.FAIL_TOO_MANY_GUESSES
            if (r6 != r0) goto L_0x0164
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTooManyGuesses/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r2.A0A
            X.C36321k7.A1a(r1, r0)
            X.C36401kF.A1J(r8)
            java.lang.String r0 = r2.A0A
            boolean r0 = X.AnonymousClass3MJ.A02(r0)
            r3 = 28
            if (r0 != 0) goto L_0x0239
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1H(r8, r3)
            goto L_0x00e1
        L_0x0164:
            X.2oq r0 = X.C52072oq.FAIL_GUESSED_TOO_FAST
            if (r6 != r0) goto L_0x01ab
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorGuessedTooFast/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r2.A0A
            X.C36321k7.A1Z(r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8)
            java.lang.String r0 = r2.A0A
            boolean r0 = X.AnonymousClass3MJ.A02(r0)
            if (r0 != 0) goto L_0x0189
            r0 = 2131893404(0x7f121c9c, float:1.9421584E38)
        L_0x0184:
            java.lang.String r0 = r8.getString(r0)
            goto L_0x013c
        L_0x0189:
            java.lang.String r0 = r2.A0A     // Catch:{ NumberFormatException -> 0x01a1 }
            long r1 = X.C36411kG.A0B(r0)     // Catch:{ NumberFormatException -> 0x01a1 }
            X.1Ww r0 = r8.A0r     // Catch:{ NumberFormatException -> 0x01a1 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x01a1 }
            r0 = 2131893405(0x7f121c9d, float:1.9421586E38)
            X.AnonymousClass3UY.A0I(r8, r0, r1)     // Catch:{ NumberFormatException -> 0x01a1 }
            com.whatsapp.registration.entercode.EnterCodeViewModel r0 = r8.A0w     // Catch:{ NumberFormatException -> 0x01a1 }
            r0.A0T(r1)     // Catch:{ NumberFormatException -> 0x01a1 }
            goto L_0x00e1
        L_0x01a1:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/verifyvoice/guessed-too-fast/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 2131893404(0x7f121c9c, float:1.9421584E38)
            goto L_0x0184
        L_0x01ab:
            X.2oq r0 = X.C52072oq.ERROR_CONNECTIVITY
            if (r6 != r0) goto L_0x01c7
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorConnectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1P(r8, r0)
            r3 = 2131893393(0x7f121c91, float:1.9421561E38)
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r0 = 2131888230(0x7f120866, float:1.941109E38)
            java.lang.String r1 = r8.getString(r0)
            r0 = 0
            goto L_0x0138
        L_0x01c7:
            X.2oq r0 = X.C52072oq.FAIL_BLOCKED
            if (r6 != r0) goto L_0x01e0
            X.3XC r3 = r2.A04
            X.3KJ r2 = r2.A06
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorBlocked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Gd r1 = r8.A15
            r0 = 12
            r1.A02(r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0q(r3, r2, r8)
            goto L_0x00e1
        L_0x01e0:
            X.2oq r0 = X.C52072oq.FAIL_STALE
            if (r6 != r0) goto L_0x01f0
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorStale"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8)
            r0 = 2131893442(0x7f121cc2, float:1.942166E38)
            goto L_0x0184
        L_0x01f0:
            X.2oq r0 = X.C52072oq.FAIL_TEMPORARILY_UNAVAILABLE
            if (r6 != r0) goto L_0x025f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyVoiceOrFlashErrorTemporarilyUnavailable/retryAfter="
            r1.append(r0)
            java.lang.String r0 = r2.A0A
            X.C36321k7.A1a(r1, r0)
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "voice-temporarily-unavailable"
            X.C65983Uf.A0Q(r1, r0)
            java.lang.String r0 = r2.A0A
            boolean r0 = X.AnonymousClass3MJ.A02(r0)
            if (r0 != 0) goto L_0x0216
            r0 = 2131893444(0x7f121cc4, float:1.9421665E38)
            goto L_0x0184
        L_0x0216:
            java.lang.String r0 = r2.A0A     // Catch:{ NumberFormatException -> 0x022e }
            long r1 = X.C36411kG.A0B(r0)     // Catch:{ NumberFormatException -> 0x022e }
            X.1Ww r0 = r8.A0r     // Catch:{ NumberFormatException -> 0x022e }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x022e }
            r0 = 2131893445(0x7f121cc5, float:1.9421667E38)
            X.AnonymousClass3UY.A0I(r8, r0, r1)     // Catch:{ NumberFormatException -> 0x022e }
            com.whatsapp.registration.entercode.EnterCodeViewModel r0 = r8.A0w     // Catch:{ NumberFormatException -> 0x022e }
            r0.A0T(r1)     // Catch:{ NumberFormatException -> 0x022e }
            goto L_0x00e1
        L_0x022e:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/verifyvoice/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            r0 = 2131893444(0x7f121cc4, float:1.9421665E38)
            goto L_0x0184
        L_0x0239:
            java.lang.String r0 = r2.A0A     // Catch:{ NumberFormatException -> 0x0254 }
            long r1 = X.C36411kG.A0B(r0)     // Catch:{ NumberFormatException -> 0x0254 }
            r8.A0C = r1     // Catch:{ NumberFormatException -> 0x0254 }
            X.1Ww r0 = r8.A0r     // Catch:{ NumberFormatException -> 0x0254 }
            r0.A0C(r1)     // Catch:{ NumberFormatException -> 0x0254 }
            r0 = 32
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1H(r8, r0)     // Catch:{ NumberFormatException -> 0x0254 }
            com.whatsapp.registration.entercode.EnterCodeViewModel r2 = r8.A0w     // Catch:{ NumberFormatException -> 0x0254 }
            long r0 = r8.A0C     // Catch:{ NumberFormatException -> 0x0254 }
            r2.A0T(r0)     // Catch:{ NumberFormatException -> 0x0254 }
            goto L_0x00e1
        L_0x0254:
            r1 = move-exception
            java.lang.String r0 = "VerifyPhoneNumber/verifyvoice/verifyvoice/too-many-guesses/unable-to-parse-retryAfter"
            com.whatsapp.util.Log.w(r0, r1)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1H(r8, r3)
            goto L_0x00e1
        L_0x025f:
            X.2oq r0 = X.C52072oq.FAIL_NOT_ALLOWED
            if (r6 != r0) goto L_0x00e1
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1L(r8, r7)
            goto L_0x00e1
        L_0x0268:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0s(r2, r8, r7)
            goto L_0x00ba
        L_0x026d:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0u(r2, r8, r7)
            goto L_0x00ba
        L_0x0272:
            java.lang.String r0 = "sms"
            goto L_0x02c1
        L_0x0275:
            java.lang.String r9 = "passkey"
            boolean r0 = r7.equals(r9)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyPasskeyResponse/status="
            X.C36321k7.A1K(r6, r0, r1)
            int r5 = r6.ordinal()
            r0 = 0
            java.lang.String r3 = "passkey_finish_login_success"
            java.lang.String r1 = "VerifyPhoneNumber/passkeyEvent/passkey_finish_login_success"
            java.lang.String r4 = "verify_passkey"
            if (r5 == r0) goto L_0x0517
            r0 = 12
            if (r5 == r0) goto L_0x050b
            r0 = 2
            java.lang.String r3 = "passkey_finish_login_error"
            if (r5 == r0) goto L_0x04f4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/passkeyEvent/passkey_finish_login_error/error="
            X.C36321k7.A1J(r6, r0, r1)
            X.3TX r2 = r8.A0z
            java.lang.String r1 = r6.toString()
            java.lang.String r0 = "verify_passkey_error_dialog"
            r2.A09(r0, r3, r1)
            X.0v0 r1 = r8.A09
            java.lang.String r0 = r6.name()
            X.C65983Uf.A0Q(r1, r0)
            r0 = 54
            X.AnonymousClass3SJ.A01(r8, r0)
            return
        L_0x02bf:
            java.lang.String r0 = "wa_old"
        L_0x02c1:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeResponse/method="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = "/status="
            X.C36321k7.A1K(r6, r0, r1)
            boolean r4 = X.C36441kJ.A1N(r7)
            if (r4 == 0) goto L_0x02e9
            X.2oq r0 = X.C52072oq.SECURITY_CODE
            if (r6 == r0) goto L_0x02e9
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "email_otp_verification_failed"
            r1.A1Q(r0)
        L_0x02e9:
            X.2oq r9 = X.C52072oq.YES
            if (r6 == r9) goto L_0x04b6
            X.2oq r0 = X.C52072oq.VERIFIED_STANDALONE
            if (r6 == r0) goto L_0x04b6
            X.2oq r0 = X.C52072oq.ERROR_FAIL_TO_INITIALIZE_WAMSYS
            if (r6 != r0) goto L_0x031a
            r8.BKE()
            X.17Y r0 = r8.A05
            X.C55232uI.A00(r0)
        L_0x02fd:
            boolean r0 = X.C36441kJ.A1M(r7)
            if (r0 == 0) goto L_0x0022
            if (r6 == r9) goto L_0x0315
            X.2oq r0 = X.C52072oq.VERIFIED_STANDALONE
            if (r6 == r0) goto L_0x0315
            X.2oq r0 = X.C52072oq.SECURITY_CODE
            if (r6 == r0) goto L_0x0315
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "wa_old_failed"
        L_0x0311:
            r1.A1a(r0)
            return
        L_0x0315:
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "wa_old_successful"
            goto L_0x0311
        L_0x031a:
            X.2oq r0 = X.C52072oq.FAIL_MISMATCH
            if (r6 != r0) goto L_0x0322
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0v(r2, r8, r7)
            goto L_0x02fd
        L_0x0322:
            X.3LA r3 = r8.A16
            java.lang.String r1 = r8.A1D
            java.lang.String r0 = r8.A1F
            java.lang.String r10 = r3.A03(r1, r0)
            X.2oq r0 = X.C52072oq.ERROR_CONNECTIVITY
            if (r6 != r0) goto L_0x0352
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorConnectivity/method="
            X.C36321k7.A1Q(r0, r7, r1)
            boolean r0 = X.C36441kJ.A1M(r7)
            if (r0 == 0) goto L_0x0467
            r3 = 2131893393(0x7f121c91, float:1.9421561E38)
            java.lang.Object[] r2 = X.AnonymousClass001.A0L()
            r1 = 0
            r0 = 2131888230(0x7f120866, float:1.941109E38)
            java.lang.String r0 = X.C36341k9.A0e(r8, r2, r0, r1, r3)
        L_0x034e:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1M(r8, r0)
            goto L_0x02fd
        L_0x0352:
            X.2oq r0 = X.C52072oq.FAIL_GUESSED_TOO_FAST
            if (r6 != r0) goto L_0x0390
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorGuessedTooFast/method="
            X.C36321k7.A1Q(r0, r7, r1)
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "server-send-guessed-too-fast"
            X.C65983Uf.A0Q(r1, r0)
            boolean r0 = X.C36441kJ.A1M(r7)
            if (r0 != 0) goto L_0x0389
            if (r4 != 0) goto L_0x0389
            if (r10 != 0) goto L_0x047b
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/error/too-fast/saved-code-is-null"
        L_0x0372:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0375:
            X.3Kl r0 = r8.A0o
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0381
            boolean r0 = r8.BLh()
            if (r0 == 0) goto L_0x02fd
        L_0x0381:
            X.1Fq r1 = r8.A0b
            r0 = -1
            X.C65983Uf.A0J(r8, r1, r0)
            goto L_0x02fd
        L_0x0389:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8)
            r0 = 2131893404(0x7f121c9c, float:1.9421584E38)
            goto L_0x03ad
        L_0x0390:
            X.2oq r0 = X.C52072oq.FAIL_TEMPORARILY_UNAVAILABLE
            if (r6 != r0) goto L_0x03b7
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorTemporarilyUnavailable/method="
            X.C36321k7.A1Q(r0, r7, r1)
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "server-send-error-temporarily-unavailable"
            X.C65983Uf.A0Q(r1, r0)
            boolean r0 = X.C36441kJ.A1M(r7)
            if (r0 == 0) goto L_0x03b2
            r0 = 2131893444(0x7f121cc4, float:1.9421665E38)
        L_0x03ad:
            java.lang.String r0 = r8.getString(r0)
            goto L_0x034e
        L_0x03b2:
            if (r10 != 0) goto L_0x047b
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/error/temp-unavail/saved-code-is-null"
            goto L_0x0372
        L_0x03b7:
            X.2oq r0 = X.C52072oq.SECURITY_CODE
            if (r6 != r0) goto L_0x03c0
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0t(r2, r8, r7)
            goto L_0x02fd
        L_0x03c0:
            X.2oq r0 = X.C52072oq.DEVICE_CONFIRM_OR_SECOND_OTP
            if (r6 == r0) goto L_0x04af
            X.2oq r0 = X.C52072oq.SECOND_OTP
            if (r6 == r0) goto L_0x04af
            X.2oq r0 = X.C52072oq.FAIL_NOT_ALLOWED
            if (r6 != r0) goto L_0x03d1
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1L(r8, r7)
            goto L_0x02fd
        L_0x03d1:
            X.3LA r0 = r8.A16
            r0.A05()
            X.2oq r0 = X.C52072oq.FAIL_MISSING
            if (r6 != r0) goto L_0x040c
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorMissing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "server-send-missing"
            X.C65983Uf.A0Q(r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8)
        L_0x03e9:
            X.2oq r0 = X.C52072oq.FAIL_BLOCKED
            if (r6 != r0) goto L_0x0375
            X.3XC r3 = r2.A04
            X.3KJ r2 = r2.A06
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorBlocked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Gd r1 = r8.A15
            r0 = 12
            r1.A02(r0)
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "server-send-blocked"
            X.C65983Uf.A0Q(r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0q(r3, r2, r8)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A18(r8)
            goto L_0x02fd
        L_0x040c:
            X.2oq r0 = X.C52072oq.FAIL_TOO_MANY_GUESSES
            if (r6 != r0) goto L_0x0420
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorTooManyGuesses"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "server-send-too-many-guesses"
            X.C65983Uf.A0Q(r1, r0)
            X.C36401kF.A1J(r8)
            goto L_0x03e9
        L_0x0420:
            X.2oq r0 = X.C52072oq.ERROR_UNSPECIFIED
            if (r6 != r0) goto L_0x043a
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorUnspecified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "server-send-error-unspecified"
            X.C65983Uf.A0Q(r1, r0)
            r0 = 1
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1P(r8, r0)
            r0 = 109(0x6d, float:1.53E-43)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1H(r8, r0)
            goto L_0x03e9
        L_0x043a:
            X.2oq r0 = X.C52072oq.FAIL_STALE
            if (r6 != r0) goto L_0x03e9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/onVerifyGenericCodeErrorStale/method="
            X.C36321k7.A1Q(r0, r7, r1)
            X.0v0 r1 = r8.A09
            java.lang.String r0 = "server-send-error-stale"
            X.C65983Uf.A0Q(r1, r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A16(r8)
            boolean r0 = X.C36441kJ.A1M(r7)
            if (r0 != 0) goto L_0x045c
            r0 = 2131893442(0x7f121cc2, float:1.942166E38)
            if (r4 == 0) goto L_0x045f
        L_0x045c:
            r0 = 2131895565(0x7f12250d, float:1.9425967E38)
        L_0x045f:
            java.lang.String r0 = r8.getString(r0)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1M(r8, r0)
            goto L_0x03e9
        L_0x0467:
            if (r10 != 0) goto L_0x047b
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/error/connectivity/saved-code-is-null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.3Gd r1 = r8.A15
            r0 = 4
            r1.A02(r0)
            r0 = 21
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A1F(r8, r0)
            goto L_0x02fd
        L_0x047b:
            double r4 = java.lang.Math.random()
            int r1 = r8.A01
            int r0 = r1 + 1
            r8.A01 = r0
            double r2 = (double) r1
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r2 = java.lang.Math.pow(r0, r2)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r2 = r2 - r0
            r0 = 4661014508095930368(0x40af400000000000, double:4000.0)
            double r2 = r2 * r0
            double r4 = r4 * r2
            int r11 = (int) r4
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyPhoneNumber/verifysms/schedule-retry/"
            X.C36321k7.A1T(r0, r1, r11)
            X.1ls r1 = r8.A13
            r0 = 1
            android.os.Message r3 = r1.obtainMessage(r0, r10)
            X.1ls r2 = r8.A13
            long r0 = (long) r11
            r2.sendMessageDelayed(r3, r0)
            goto L_0x02fd
        L_0x04af:
            java.lang.String r0 = "sms"
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0s(r2, r8, r0)
            goto L_0x02fd
        L_0x04b6:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0u(r2, r8, r7)
            goto L_0x02fd
        L_0x04bb:
            java.lang.String r0 = "VerifyPhoneNumber/onVerifySilentAuthResponse/wamsysFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.0v0 r0 = r8.A09
            r0.A1Y(r1)
            goto L_0x0502
        L_0x04c6:
            X.0v0 r0 = r8.A09
            r0.A1Y(r6)
            X.0v0 r0 = r8.A09
            r0.A27(r1)
            X.3TX r1 = r8.A0z
            java.lang.String r0 = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0J(r8)
            r1.A0A(r0, r4, r5)
        L_0x04d9:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0t(r2, r8, r3)
            return
        L_0x04dd:
            X.0v0 r0 = r8.A09
            r0.A1Y(r6)
            X.0v0 r0 = r8.A09
            r0.A27(r1)
            X.3TX r1 = r8.A0z
            java.lang.String r0 = com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0J(r8)
            r1.A0A(r0, r4, r5)
        L_0x04f0:
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0u(r2, r8, r3)
            return
        L_0x04f4:
            java.lang.String r0 = "VerifyPhoneNumber/passkeyEvent/passkey_finish_login_error/wamsysFailure"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.3TX r1 = r8.A0z
            java.lang.String r0 = r6.toString()
            r1.A09(r4, r3, r0)
        L_0x0502:
            r8.BKE()
            X.17Y r0 = r8.A05
            X.C55232uI.A00(r0)
            return
        L_0x050b:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.3TX r0 = r8.A0z
            r0.A06(r4, r3)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0t(r2, r8, r9)
            return
        L_0x0517:
            com.whatsapp.util.Log.i((java.lang.String) r1)
            X.3TX r0 = r8.A0z
            r0.A06(r4, r3)
            com.whatsapp.registration.verifyphone.VerifyPhoneNumber.A0u(r2, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50062k8.A0C(java.lang.Object):void");
    }

    public C50062k8(C19420v0 r3, AnonymousClass3UV r4, C199929gH r5, AnonymousClass2d1 r6, AnonymousClass4UF r7, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        this.A07 = str;
        this.A09 = str2;
        this.A08 = str3;
        this.A00 = i;
        this.A04 = r6;
        this.A0A = AnonymousClass001.A0F(r7);
        this.A02 = r4;
        this.A03 = r5;
        this.A01 = r3;
        int A012 = C36371kC.A01(C36341k9.A0E(r3), "reg_attempts_verify_code") + 1;
        C36321k7.A0q(r3, "reg_attempts_verify_code", A012);
        r6.A00 = A012;
        this.A0B = z;
        this.A06 = str4;
        this.A05 = str5;
    }

    public void A0A() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("VerifyCodeTaskonPreExecute/method=");
        C36321k7.A1a(A0u, this.A08);
        AnonymousClass4UF r1 = (AnonymousClass4UF) this.A0A.get();
        if (r1 != null) {
            AnonymousClass155 r12 = (AnonymousClass155) r1;
            if (!C36431kI.A1S(r12)) {
                AnonymousClass3SJ.A01(r12, 23);
            }
        }
    }
}
