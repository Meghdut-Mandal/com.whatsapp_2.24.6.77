package X;

import com.whatsapp.registration.VerifyTwoFactorAuth;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.2kN  reason: invalid class name and case insensitive filesystem */
public final class C50202kN extends C132446Tt {
    public AnonymousClass3BH A00;
    public final int A01;
    public final C19420v0 A02;
    public final AnonymousClass3UV A03;
    public final AnonymousClass005 A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final WeakReference A09;

    public C50202kN(C19420v0 r2, AnonymousClass3UV r3, C88034Rd r4, AnonymousClass005 r5, String str, String str2, String str3, String str4, int i) {
        C36331k8.A1G(str2, 3, str3);
        C36321k7.A13(r5, r2, r3);
        this.A01 = i;
        this.A08 = str;
        this.A05 = str2;
        this.A06 = str3;
        this.A07 = str4;
        this.A04 = r5;
        this.A02 = r2;
        this.A03 = r3;
        this.A09 = AnonymousClass001.A0F(r4);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        IllegalStateException illegalStateException;
        AnonymousClass00C.A0D(objArr, 0);
        String str = this.A07;
        int i = this.A01;
        try {
            C19420v0 r7 = this.A02;
            AnonymousClass005 r6 = r7.A00;
            int A012 = C36371kC.A01(C36391kE.A0H(r6), "reg_attempts_verify_2fa") + 1;
            C36321k7.A0q(r7, "reg_attempts_verify_2fa", A012);
            AnonymousClass3DL r11 = new AnonymousClass3DL(A012, (String) null);
            if (str != null) {
                AnonymousClass005 r2 = this.A04;
                if (r2.get() == null || C36391kE.A0H(r6).getString("pref_wfs_blob", (String) null) == null || r7.A0k() == null || r7.A0j() == null || C36391kE.A0H(r6).getString("pref_wfs_id_sign", (String) null) == null) {
                    this.A00 = this.A03.A0F(r11, this.A05, this.A06, str, (AnonymousClass011) null, (AnonymousClass011) null, (AnonymousClass011) null, (AnonymousClass011) null);
                } else {
                    AnonymousClass3D0 r1 = (AnonymousClass3D0) r2.get();
                    if (r1 == null || r1.A01() == null) {
                        illegalStateException = AnonymousClass001.A09("Required value was null.");
                        throw illegalStateException;
                    }
                    String string = C36391kE.A0H(r6).getString("pref_wfs_blob", (String) null);
                    AnonymousClass00C.A0E(string, "null cannot be cast to non-null type kotlin.String");
                    AnonymousClass011 A19 = C36441kJ.A19("foa_authproof", string);
                    String A0k = r7.A0k();
                    AnonymousClass00C.A0E(A0k, "null cannot be cast to non-null type kotlin.String");
                    AnonymousClass011 A192 = C36441kJ.A19("wa_ac_ent_id", A0k);
                    String A0j = r7.A0j();
                    AnonymousClass00C.A0E(A0j, "null cannot be cast to non-null type kotlin.String");
                    AnonymousClass011 A193 = C36441kJ.A19("wa_ac_ent_enc_pw", A0j);
                    String string2 = C36391kE.A0H(r6).getString("pref_wfs_id_sign", (String) null);
                    AnonymousClass00C.A0E(string2, "null cannot be cast to non-null type kotlin.String");
                    this.A00 = this.A03.A0F(r11, this.A05, this.A06, str, A19, A192, A193, C36441kJ.A19("id_ac_sign", string2));
                }
            } else if (i == 1) {
                this.A00 = this.A03.A0E(r11, this.A05, this.A06, "email", (String) null);
            } else if (i == 2) {
                this.A00 = this.A03.A0E(r11, this.A05, this.A06, "wipe", this.A08);
            }
            AnonymousClass3BH r22 = this.A00;
            if (r22 == null) {
                Log.i("SecurityCodeTask/doInBackground/null SecurityResult");
                return C52052oo.ERROR_UNSPECIFIED;
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("SecurityCodeTask/security entrypoint response//resetMethod=");
            A0u.append(r22.A08);
            A0u.append("/wipeWait=");
            C36321k7.A1N(Long.valueOf(r22.A02), A0u);
            AnonymousClass3BH r0 = this.A00;
            if (r0 != null) {
                return r0.A03;
            }
            illegalStateException = AnonymousClass001.A09("Required value was null.");
            throw illegalStateException;
        } catch (Exception e) {
            Log.e("SecurityCodeTask/doInBackground/error ", e);
            return C52052oo.ERROR_UNSPECIFIED;
        }
    }

    public void A09() {
        C88034Rd r1 = (C88034Rd) this.A09.get();
        if (r1 != null) {
            r1.BqU(true);
        } else {
            Log.i("SecurityCodeTask/onPostExecute/null callback");
        }
    }

    public void A0A() {
        C88034Rd r1 = (C88034Rd) this.A09.get();
        if (r1 != null) {
            r1.BqU(false);
            VerifyTwoFactorAuth verifyTwoFactorAuth = (VerifyTwoFactorAuth) r1;
            AnonymousClass3SJ.A01(verifyTwoFactorAuth, verifyTwoFactorAuth.A00);
            return;
        }
        Log.i("SecurityCodeTask/onPreExecute/null callback");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00db, code lost:
        X.AnonymousClass3SJ.A01(r4, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x012f, code lost:
        r1.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0132, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r11) {
        /*
            r10 = this;
            X.2oo r11 = (X.C52052oo) r11
            r6 = 0
            X.AnonymousClass00C.A0D(r11, r6)
            java.lang.ref.WeakReference r0 = r10.A09
            java.lang.Object r4 = r0.get()
            X.4Rd r4 = (X.C88034Rd) r4
            if (r4 == 0) goto L_0x01ec
            r0 = 1
            r4.BqU(r0)
            X.3BH r5 = r10.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r4 = (com.whatsapp.registration.VerifyTwoFactorAuth) r4
            r0 = 0
            r4.A0S = r0
            int r0 = r4.A00
            X.AnonymousClass3SJ.A00(r4, r0)
            r9 = 1
            r4.BqU(r9)
            r4.A0b = r6
            X.0wD r0 = r4.A07
            X.0wL r1 = r4.A0g
            r0.unregisterObserver(r1)
            int r0 = r11.ordinal()
            r2 = 1000(0x3e8, double:4.94E-321)
            switch(r0) {
                case 0: goto L_0x0037;
                case 1: goto L_0x01d8;
                case 2: goto L_0x00a0;
                case 3: goto L_0x01bb;
                case 4: goto L_0x00ed;
                case 5: goto L_0x0172;
                case 6: goto L_0x00df;
                case 7: goto L_0x0133;
                case 8: goto L_0x0125;
                case 9: goto L_0x00fb;
                case 10: goto L_0x01bb;
                case 11: goto L_0x00b9;
                default: goto L_0x0036;
            }
        L_0x0036:
            return
        L_0x0037:
            X.C18740tg.A06(r5)
            int r0 = r4.A01
            if (r0 != r9) goto L_0x005e
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/reset-email-sent"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131895124(0x7f122354, float:1.9425072E38)
            r4.BO5(r0)
            java.lang.String r0 = "forgotPinDialogTag"
            r4.A3D(r0)
            r4.A3i(r5)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0H(r4, r6)
            r2 = 0
            android.os.Handler r1 = r4.A0f
            java.lang.Runnable r0 = r4.A0h
            r1.postDelayed(r0, r2)
            return
        L_0x005e:
            java.lang.String r0 = r5.A07
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/verified"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0H(r4, r9)
            X.0v0 r1 = r4.A09
            boolean r0 = r5.A0D
            r1.A1w(r0)
            X.0v0 r1 = r4.A09
            boolean r0 = r5.A0C
            r1.A1v(r0)
            X.0v0 r1 = r4.A09
            boolean r0 = r5.A0B
            r1.A1r(r0)
            int r0 = r4.A01
            if (r0 != 0) goto L_0x008d
            X.0FM r0 = X.C65983Uf.A02(r4)
            r4.A09 = r0
        L_0x008d:
            r0 = 27
            X.3vC r1 = X.C80313vC.A00(r4, r5, r0)
            X.0FM r0 = r4.A09
            if (r0 == 0) goto L_0x01e8
            r0.show()
            X.17Y r0 = r4.A05
            r0.A0I(r1, r2)
            return
        L_0x00a0:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/unspecified"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.2kN r0 = r4.A0S
            if (r0 == 0) goto L_0x00b6
            boolean r0 = X.C36431kI.A1Y(r0)
            if (r0 != 0) goto L_0x00b6
            r4.A0b = r9
            X.0wD r0 = r4.A07     // Catch:{ IllegalStateException -> 0x00b6 }
            r0.registerObserver(r1)     // Catch:{ IllegalStateException -> 0x00b6 }
        L_0x00b6:
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x00db
        L_0x00b9:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/blocked"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0H(r4, r9)
            if (r5 == 0) goto L_0x00d9
            X.3KJ r0 = r5.A04
            if (r0 == 0) goto L_0x00d9
            X.1Ww r0 = r4.A0O
            r0.A09()
            X.3KJ r0 = r5.A04
            android.content.Intent r0 = X.AnonymousClass190.A0y(r4, r0)
            r4.startActivity(r0)
            r4.finish()
            return
        L_0x00d9:
            r0 = 124(0x7c, float:1.74E-43)
        L_0x00db:
            X.AnonymousClass3SJ.A01(r4, r0)
            return
        L_0x00df:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/too-many-guesses"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0H(r4, r9)
            X.3Kl r1 = r4.A0L
            r0 = 2131895136(0x7f122360, float:1.9425096E38)
            goto L_0x012f
        L_0x00ed:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/incorrect"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            com.whatsapp.registration.VerifyTwoFactorAuth.A0H(r4, r9)
            X.3Kl r1 = r4.A0L
            r0 = 2131893478(0x7f121ce6, float:1.9421734E38)
            goto L_0x012f
        L_0x00fb:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/stale"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            int r2 = com.whatsapp.registration.VerifyTwoFactorAuth.A01(r4)
            X.C18740tg.A06(r5)
            r4.A3i(r5)
            int r1 = com.whatsapp.registration.VerifyTwoFactorAuth.A01(r4)
            boolean r0 = r4.A0a
            if (r0 != 0) goto L_0x011c
            if (r2 != r1) goto L_0x011c
            java.lang.String r1 = r4.A0X
            int r0 = r4.A01
            com.whatsapp.registration.VerifyTwoFactorAuth.A0G(r4, r1, r0, r9)
            return
        L_0x011c:
            com.whatsapp.registration.VerifyTwoFactorAuth.A0H(r4, r9)
            X.3Kl r1 = r4.A0L
            r0 = 2131893442(0x7f121cc2, float:1.942166E38)
            goto L_0x012f
        L_0x0125:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/reset-too-soon"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.3Kl r1 = r4.A0L
            r0 = 2131895125(0x7f122355, float:1.9425074E38)
        L_0x012f:
            r1.A02(r0)
            return
        L_0x0133:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/guessed-too-fast"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            X.C18740tg.A06(r5)
            java.lang.String r0 = r5.A06     // Catch:{ NumberFormatException -> 0x015a }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x015a }
            long r0 = r0 * r2
            X.3Kl r8 = r4.A0L     // Catch:{ NumberFormatException -> 0x015a }
            r7 = 2131893405(0x7f121c9d, float:1.9421586E38)
            java.lang.Object[] r3 = new java.lang.Object[r9]     // Catch:{ NumberFormatException -> 0x015a }
            X.0ts r2 = r4.A00     // Catch:{ NumberFormatException -> 0x015a }
            java.lang.String r2 = X.AnonymousClass3UY.A0D(r2, r0)     // Catch:{ NumberFormatException -> 0x015a }
            java.lang.String r2 = X.C36391kE.A0v(r4, r2, r3, r6, r7)     // Catch:{ NumberFormatException -> 0x015a }
            r8.A03(r2)     // Catch:{ NumberFormatException -> 0x015a }
            com.whatsapp.registration.VerifyTwoFactorAuth.A0F(r4, r0)     // Catch:{ NumberFormatException -> 0x015a }
            return
        L_0x015a:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/too_fast failed to parse: "
            r1.append(r0)
            java.lang.String r0 = r5.A06
            X.C36351kA.A1P(r0, r1, r2)
            X.3Kl r1 = r4.A0L
            r0 = 2131895136(0x7f122360, float:1.9425096E38)
            r1.A02(r0)
            return
        L_0x0172:
            X.C18740tg.A06(r5)
            android.content.SharedPreferences r1 = X.C36331k8.A06(r4)
            java.lang.String r0 = "registration_code"
            java.lang.String r1 = X.C36371kC.A0t(r1, r0)
            java.lang.String r0 = r4.A0X
            boolean r6 = X.C1901797e.A00(r0, r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/mismatch "
            X.C36321k7.A1X(r0, r1, r6)
            com.whatsapp.CodeInputField r0 = r4.A0C
            X.C36391kE.A1K(r0)
            X.3Kl r1 = r4.A0L
            r0 = 2131895143(0x7f122367, float:1.942511E38)
            if (r6 == 0) goto L_0x019d
            r0 = 2131895100(0x7f12233c, float:1.9425023E38)
        L_0x019d:
            r1.A02(r0)
            java.lang.String r0 = r5.A06     // Catch:{ NumberFormatException -> 0x01ab }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x01ab }
            long r0 = r0 * r2
            com.whatsapp.registration.VerifyTwoFactorAuth.A0F(r4, r0)     // Catch:{ NumberFormatException -> 0x01ab }
            return
        L_0x01ab:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/mismatch failed to parse: "
            r1.append(r0)
            java.lang.String r0 = r5.A06
            X.C36351kA.A1P(r0, r1, r2)
            return
        L_0x01bb:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/connectivity"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r1 = 32
            X.3Kl r0 = r4.A0L
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x01d2
            boolean r0 = r4.BLh()
            if (r0 != 0) goto L_0x01d2
            X.AnonymousClass3SJ.A01(r4, r1)
            return
        L_0x01d2:
            X.1Fq r0 = r4.A0G
            X.C65983Uf.A0J(r4, r0, r1)
            return
        L_0x01d8:
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/wamsys initialization fails"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = "VerifyTwoFactorAuth/removeProgressDialog/"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.17Y r0 = r4.A05
            X.C55232uI.A00(r0)
            return
        L_0x01e8:
            r1.run()
            return
        L_0x01ec:
            java.lang.String r0 = "SecurityCodeTask/onPostExecute/null callback"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C50202kN.A0C(java.lang.Object):void");
    }
}
