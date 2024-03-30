package X;

import android.app.Activity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;

/* renamed from: X.2js  reason: invalid class name and case insensitive filesystem */
public final class C49902js extends C132446Tt {
    public final AnonymousClass3UV A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        AnonymousClass3BD r2;
        try {
            AnonymousClass3UV r3 = this.A00;
            String str = this.A02;
            String str2 = this.A03;
            String str3 = this.A01;
            AnonymousClass00C.A0D(str, 0);
            C36321k7.A0v(str2, 1, str3);
            if (!r3.A0I()) {
                r2 = new AnonymousClass3BD(C52032om.ERROR_FAIL_TO_INITIALIZE_WAMSYS);
            } else {
                r3.A0H(true);
                byte[] A0K = r3.A0K(str, str2);
                byte[] A0J = r3.A0J("verifyCaptcha");
                LinkedHashMap A1G = C36431kI.A1G();
                AnonymousClass3UV.A03(r3, A1G);
                r2 = (AnonymousClass3BD) AnonymousClass3PM.A00(new AnonymousClass4WS(r3.A08, r3.A09, str, str2, str3, r3.A0G(str, "verify_captcha_entrypoint"), AnonymousClass3UV.A02(r3), A1G, A0K, A0J, 0));
            }
            if (r2 == null) {
                Log.e("VerifyCaptchaTask/doInBackground/null VerifyCaptchaResult");
                return C36441kJ.A0Q(C52032om.ERROR_UNSPECIFIED, (Object) null);
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("VerifyCaptchaTask/captcha_verify entrypoint response//waOldEligible=");
            A0u.append(r2.A04);
            A0u.append("/emailOtpEligible=");
            A0u.append(r2.A00);
            A0u.append("/flashType=");
            A0u.append(r2.A01);
            A0u.append("/smsWait=");
            A0u.append(r2.A0A);
            A0u.append(";voiceWait=");
            A0u.append(r2.A0B);
            A0u.append(";waOldWait=");
            A0u.append(r2.A0C);
            A0u.append(";emailOtpWait=");
            C36321k7.A1a(A0u, r2.A08);
            return C36441kJ.A0Q(r2.A0E, r2);
        } catch (Exception e) {
            Log.e("VerifyCaptchaTask/entrypoint call error: ", e);
            return C36441kJ.A0Q(C52032om.ERROR_UNSPECIFIED, (Object) null);
        }
    }

    public void A0A() {
        AnonymousClass4OZ r1 = (AnonymousClass4OZ) this.A04.get();
        if (r1 != null) {
            AnonymousClass3SJ.A01((Activity) r1, 2);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0095, code lost:
        com.whatsapp.registration.VerifyCaptcha.A0F(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0098, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x015a, code lost:
        com.whatsapp.util.Log.w("VerifyCaptcha/onVerifyCaptchaResponse/response is null");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0199, code lost:
        X.AnonymousClass3SJ.A01(r10, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a5, code lost:
        r10.A09.A1P("captcha_request_failed");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r18) {
        /*
            r17 = this;
            r1 = r18
            android.util.Pair r1 = (android.util.Pair) r1
            r0 = 0
            X.AnonymousClass00C.A0D(r1, r0)
            r0 = r17
            java.lang.ref.WeakReference r0 = r0.A04
            java.lang.Object r10 = r0.get()
            X.4OZ r10 = (X.AnonymousClass4OZ) r10
            if (r10 == 0) goto L_0x0219
            com.whatsapp.registration.VerifyCaptcha r10 = (com.whatsapp.registration.VerifyCaptcha) r10
            r0 = 2
            X.AnonymousClass3SJ.A00(r10, r0)
            java.lang.Object r3 = r1.first
            if (r3 == 0) goto L_0x0214
            X.2om r3 = (X.C52032om) r3
            java.lang.Object r6 = r1.second
            X.3BD r6 = (X.AnonymousClass3BD) r6
            r0 = 0
            X.AnonymousClass00C.A0D(r3, r0)
            r7 = 3
            r4 = 1
            r5 = 0
            if (r6 == 0) goto L_0x0089
            int r0 = r6.A04
            r10.A02 = r0
            int r0 = r6.A01
            r10.A01 = r0
            int r0 = r6.A00
            r10.A00 = r0
            X.0v0 r0 = r10.A09
            java.lang.String r2 = r6.A07
            android.content.SharedPreferences$Editor r1 = X.C36331k8.A05(r0)
            java.lang.String r0 = "email_address"
            X.C36341k9.A0x(r1, r0, r2)
            int r0 = r10.A02
            if (r0 == r4) goto L_0x01b7
            if (r0 == r7) goto L_0x01b7
            if (r0 != 0) goto L_0x0053
            X.0v0 r0 = r10.A09
            r0.A1a(r5)
        L_0x0053:
            X.0v0 r1 = r10.A09
            int r0 = r10.A02
            boolean r2 = X.AnonymousClass000.A1S(r0, r7)
            android.content.SharedPreferences$Editor r1 = X.C36331k8.A05(r1)
            java.lang.String r0 = "pref_wa_old_for_uc"
            X.C36331k8.A0w(r1, r0, r2)
            int r0 = r10.A00
            if (r0 != r4) goto L_0x01ac
            X.0v0 r1 = r10.A09
            java.lang.String r0 = "email_otp_eligible"
            r1.A1Q(r0)
        L_0x006f:
            int r2 = r6.A03
            if (r2 <= 0) goto L_0x007c
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r10)
            java.lang.String r0 = "registration_voice_code_length"
            X.C36341k9.A0v(r1, r0, r2)
        L_0x007c:
            int r2 = r6.A02
            if (r2 <= 0) goto L_0x0089
            android.content.SharedPreferences$Editor r1 = X.C36421kH.A0A(r10)
            java.lang.String r0 = "registration_sms_code_length"
            X.C36341k9.A0v(r1, r0, r2)
        L_0x0089:
            int r3 = r3.ordinal()
            java.lang.String r2 = "VerifyCaptcha/onVerifyCaptchaResponse/response is null"
            r0 = 7
            java.lang.String r1 = "captcha_request_failed"
            switch(r3) {
                case 0: goto L_0x0099;
                case 1: goto L_0x0199;
                case 2: goto L_0x0199;
                case 3: goto L_0x019d;
                case 4: goto L_0x0174;
                case 5: goto L_0x011a;
                case 6: goto L_0x0174;
                case 7: goto L_0x015e;
                case 8: goto L_0x0174;
                case 9: goto L_0x018a;
                case 10: goto L_0x0197;
                default: goto L_0x0095;
            }
        L_0x0095:
            com.whatsapp.registration.VerifyCaptcha.A0F(r10)
            return
        L_0x0099:
            if (r6 == 0) goto L_0x015a
            X.0v0 r1 = r10.A09
            java.lang.String r0 = "captcha_successful"
            r1.A1P(r0)
            java.lang.String r0 = r6.A0A
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            r2 = 0
            long r0 = X.C65983Uf.A01(r0, r2)
            long r0 = r5.toMillis(r0)
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r8
            r10.A04 = r0
            java.lang.String r0 = r6.A0B
            long r0 = X.C65983Uf.A01(r0, r2)
            long r0 = r5.toMillis(r0)
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r8
            r10.A05 = r0
            java.lang.String r0 = r6.A0C
            long r0 = X.C65983Uf.A01(r0, r2)
            long r0 = r5.toMillis(r0)
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r8
            r10.A06 = r0
            java.lang.String r0 = r6.A08
            long r0 = X.C65983Uf.A01(r0, r2)
            long r2 = r5.toMillis(r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r2 + r0
            r10.A03 = r2
            int r1 = r10.A02
            if (r1 == r4) goto L_0x01c7
            if (r1 == r7) goto L_0x01c7
            r0 = 4
            if (r1 == r0) goto L_0x01c7
            int r0 = r10.A00
            if (r0 == r4) goto L_0x01c7
            X.0yb r2 = r10.A08
            X.AnonymousClass00C.A07(r2)
            X.0zN r1 = r10.A0J
            if (r1 == 0) goto L_0x01c0
            int r0 = r10.A01
            boolean r0 = X.C55252uK.A00(r2, r1, r0)
            if (r0 == 0) goto L_0x01c7
            int r11 = r10.A01
            long r12 = r10.A04
            long r14 = r10.A05
            boolean r0 = r10.A0W
            r16 = r0
            android.content.Intent r0 = X.AnonymousClass190.A0K(r10, r11, r12, r14, r16)
            r10.A33(r0, r4)
            return
        L_0x011a:
            if (r6 == 0) goto L_0x015a
            X.0v0 r1 = r10.A09
            java.lang.String r0 = "captcha_blocked"
            r1.A1P(r0)
            java.lang.String r0 = "VerifyCaptcha/handleBlockedUser"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.3XC r2 = r6.A05
            r10.A0L = r2
            X.3KW r1 = r10.A0R
            if (r1 == 0) goto L_0x020d
            boolean r0 = r6.A0D
            boolean r0 = r1.A02(r2, r0)
            if (r0 == 0) goto L_0x01fa
            boolean r0 = r10.A0W
            if (r0 != 0) goto L_0x01fa
            X.1Ww r1 = r10.A0O
            if (r1 == 0) goto L_0x01f3
            r0 = 10
            X.C29501Ww.A02(r1, r0, r4)
            X.3KW r2 = r10.A0R
            if (r2 == 0) goto L_0x01ec
            X.3XC r1 = r6.A05
            X.C18740tg.A06(r1)
            r0 = 5
            android.content.Intent r0 = r2.A00(r10, r1, r0)
            r10.startActivity(r0)
            r10.finish()
            return
        L_0x015a:
            com.whatsapp.util.Log.w((java.lang.String) r2)
            goto L_0x0199
        L_0x015e:
            if (r6 == 0) goto L_0x0172
            java.lang.String r0 = r6.A09
            java.lang.String r5 = r6.A06
        L_0x0164:
            boolean r0 = com.whatsapp.registration.VerifyCaptcha.A0K(r10, r0, r5)
            if (r0 == 0) goto L_0x0095
            X.AnonymousClass3SJ.A01(r10, r4)
            X.0v0 r1 = r10.A09
            java.lang.String r0 = "captcha_mismatch_failed"
            goto L_0x0192
        L_0x0172:
            r0 = r5
            goto L_0x0164
        L_0x0174:
            if (r6 == 0) goto L_0x0188
            java.lang.String r0 = r6.A09
            java.lang.String r5 = r6.A06
        L_0x017a:
            boolean r0 = com.whatsapp.registration.VerifyCaptcha.A0K(r10, r0, r5)
            if (r0 == 0) goto L_0x0095
            X.AnonymousClass3SJ.A01(r10, r7)
            X.0v0 r1 = r10.A09
            java.lang.String r0 = "captcha_code_failed"
            goto L_0x0192
        L_0x0188:
            r0 = r5
            goto L_0x017a
        L_0x018a:
            r0 = 5
            X.AnonymousClass3SJ.A01(r10, r0)
            X.0v0 r1 = r10.A09
            java.lang.String r0 = "captcha_too_many_guesses_failed"
        L_0x0192:
            r1.A1P(r0)
            goto L_0x0095
        L_0x0197:
            r0 = 8
        L_0x0199:
            X.AnonymousClass3SJ.A01(r10, r0)
            goto L_0x01a5
        L_0x019d:
            X.17Y r0 = r10.A05
            X.AnonymousClass00C.A07(r0)
            X.C55232uI.A00(r0)
        L_0x01a5:
            X.0v0 r0 = r10.A09
            r0.A1P(r1)
            goto L_0x0095
        L_0x01ac:
            if (r0 != 0) goto L_0x006f
            X.0v0 r1 = r10.A09
            java.lang.String r0 = "email_otp_not_eligible"
            r1.A1Q(r0)
            goto L_0x006f
        L_0x01b7:
            X.0v0 r1 = r10.A09
            java.lang.String r0 = "wa_old_eligible"
            r1.A1a(r0)
            goto L_0x0053
        L_0x01c0:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01c7:
            X.0v0 r3 = r10.A09
            X.AnonymousClass00C.A07(r3)
            X.0wG r2 = r10.A0G
            if (r2 == 0) goto L_0x01e5
            X.0zN r1 = r10.A0J
            if (r1 == 0) goto L_0x01de
            r0 = 3902(0xf3e, float:5.468E-42)
            boolean r0 = r1.A0E(r0)
            X.AnonymousClass97V.A00(r2, r3, r10, r0)
            return
        L_0x01de:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01e5:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01ec:
            java.lang.String r0 = "banManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01f3:
            java.lang.String r0 = "registrationManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x01fa:
            android.content.SharedPreferences r1 = X.C36331k8.A06(r10)
            java.lang.String r0 = "underage_account_banned"
            boolean r1 = X.C36371kC.A1U(r1, r0)
            r0 = 4
            if (r1 == 0) goto L_0x0209
            r0 = 9
        L_0x0209:
            X.AnonymousClass3SJ.A01(r10, r0)
            return
        L_0x020d:
            java.lang.String r0 = "banManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0214:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x0219:
            java.lang.String r0 = "VerifyCaptchaTask/onPostExecute/null callback"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49902js.A0C(java.lang.Object):void");
    }

    public C49902js(AnonymousClass3UV r2, AnonymousClass4OZ r3, String str, String str2, String str3) {
        this.A02 = str;
        this.A03 = str2;
        this.A01 = str3;
        this.A00 = r2;
        this.A04 = AnonymousClass001.A0F(r3);
    }
}
