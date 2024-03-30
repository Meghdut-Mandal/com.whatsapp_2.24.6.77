package X;

import com.whatsapp.registration.VerifyTwoFactorAuth;

/* renamed from: X.3wX  reason: invalid class name and case insensitive filesystem */
public class C81143wX implements Runnable {
    public Object A00;
    public final int A01;

    public C81143wX(VerifyTwoFactorAuth verifyTwoFactorAuth, int i) {
        this.A01 = i;
        switch (i) {
            case 27:
            case 28:
                this.A00 = verifyTwoFactorAuth;
                return;
            default:
                this.A00 = verifyTwoFactorAuth;
                return;
        }
    }

    public static C81143wX A00(Object obj, int i) {
        return new C81143wX(obj, i);
    }

    public static void A01(C19770wU r1, Object obj, int i) {
        r1.Boy(new C81143wX(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v58, resolved type: com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v108, resolved type: com.whatsapp.registration.VerifyTwoFactorAuth} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v111, resolved type: com.whatsapp.registration.email.VerifyEmail} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v61, resolved type: com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v62, resolved type: com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02ef, code lost:
        X.C36341k9.A16(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0326, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0329, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x033a, code lost:
        r0.A06(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x033d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x04a1, code lost:
        if (r8 != null) goto L_0x04a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x053c, code lost:
        if (r8 != null) goto L_0x053e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x056b, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x056e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        r1.A01(r2, r0);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x051a  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x054a  */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x055b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r20 = this;
            r1 = r20
            int r0 = r1.A01
            switch(r0) {
                case 0: goto L_0x0162;
                case 1: goto L_0x0664;
                case 2: goto L_0x062f;
                case 3: goto L_0x061c;
                case 4: goto L_0x0610;
                case 5: goto L_0x0601;
                case 6: goto L_0x05f7;
                case 7: goto L_0x05ab;
                case 8: goto L_0x0596;
                case 9: goto L_0x00ec;
                case 10: goto L_0x00c5;
                case 11: goto L_0x056f;
                case 12: goto L_0x00b2;
                case 13: goto L_0x0561;
                case 14: goto L_0x0468;
                case 15: goto L_0x0448;
                case 16: goto L_0x0072;
                case 17: goto L_0x0416;
                case 18: goto L_0x0405;
                case 19: goto L_0x03e2;
                case 20: goto L_0x03d7;
                case 21: goto L_0x03cf;
                case 22: goto L_0x034b;
                case 23: goto L_0x033e;
                case 24: goto L_0x0332;
                case 25: goto L_0x004b;
                case 26: goto L_0x032a;
                case 27: goto L_0x0316;
                case 28: goto L_0x030e;
                case 29: goto L_0x02f3;
                case 30: goto L_0x0007;
                case 31: goto L_0x02e5;
                case 32: goto L_0x02aa;
                case 33: goto L_0x0297;
                case 34: goto L_0x028f;
                case 35: goto L_0x0289;
                case 36: goto L_0x0007;
                case 37: goto L_0x027e;
                case 38: goto L_0x0270;
                case 39: goto L_0x0042;
                case 40: goto L_0x0254;
                case 41: goto L_0x0249;
                case 42: goto L_0x0225;
                case 43: goto L_0x01fe;
                case 44: goto L_0x0013;
                case 45: goto L_0x01e7;
                case 46: goto L_0x01d5;
                case 47: goto L_0x01c1;
                case 48: goto L_0x01a8;
                case 49: goto L_0x019c;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r1.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r2 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r2
            X.1fs r1 = r2.A04
            java.lang.String r0 = "notification-problems-troubleshooting"
        L_0x000f:
            r1.A01(r2, r0)
        L_0x0012:
            return
        L_0x0013:
            java.lang.Object r5 = r1.A00
            com.whatsapp.registration.email.VerifyEmail r5 = (com.whatsapp.registration.email.VerifyEmail) r5
            com.whatsapp.CodeInputField r0 = r5.A02
            if (r0 != 0) goto L_0x0022
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0022:
            java.lang.String r0 = r0.getCode()
            int r1 = r0.length()
            r0 = 6
            if (r1 != r0) goto L_0x0012
            long r3 = X.C36431kI.A08(r5)
            long r1 = r5.A01
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0012
            com.whatsapp.wds.components.button.WDSButton r1 = r5.A0D
            if (r1 != 0) goto L_0x066d
            java.lang.String r0 = "nextButton"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0042:
            java.lang.Object r2 = r1.A00
            com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity r2 = (com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity) r2
            X.1fs r1 = r2.A00
            java.lang.String r0 = "received-verification-code"
            goto L_0x000f
        L_0x004b:
            java.lang.Object r2 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r2 = (com.whatsapp.registration.VerifyCaptcha) r2
            X.0wG r0 = r2.A0G
            if (r0 == 0) goto L_0x0681
            android.content.Context r0 = r0.A00
            java.io.File r1 = r0.getFilesDir()
            java.lang.String r0 = "captcha_audio.mp3"
            java.io.File r0 = X.C36441kJ.A0w(r1, r0)
            r2.A0T = r0
            boolean r0 = r0.exists()     // Catch:{ IOException -> 0x0676 }
            if (r0 != 0) goto L_0x0012
            java.io.File r0 = r2.A0T     // Catch:{ IOException -> 0x0676 }
            if (r0 != 0) goto L_0x0672
            java.lang.String r0 = "captchaAudioFile"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ IOException -> 0x0676 }
            throw r0     // Catch:{ IOException -> 0x0676 }
        L_0x0072:
            java.lang.Object r4 = r1.A00
            X.14u r4 = (X.C225314u) r4
            android.content.SharedPreferences r1 = X.C36331k8.A06(r4)     // Catch:{ IOException -> 0x0012 }
            java.lang.String r0 = "pref_nta_profile_pic"
            java.lang.String r1 = X.C36371kC.A0t(r1, r0)     // Catch:{ IOException -> 0x0012 }
            java.net.URL r0 = new java.net.URL     // Catch:{ IOException -> 0x0012 }
            r0.<init>(r1)     // Catch:{ IOException -> 0x0012 }
            java.io.InputStream r3 = r0.openStream()     // Catch:{ IOException -> 0x0012 }
            if (r3 != 0) goto L_0x0092
            java.lang.String r0 = "Failed to fetch profile picture for nta"
            X.AnonymousClass3TI.A00(r0)     // Catch:{ all -> 0x00a6 }
            goto L_0x0688
        L_0x0092:
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3)     // Catch:{ all -> 0x00a6 }
            X.17Y r1 = r4.A05     // Catch:{ all -> 0x00a6 }
            r0 = 23
            X.3vC r0 = X.C80313vC.A00(r4, r2, r0)     // Catch:{ all -> 0x00a6 }
            r1.A0H(r0)     // Catch:{ all -> 0x00a6 }
            r3.close()     // Catch:{ IOException -> 0x0012 }
            goto L_0x0689
        L_0x00a6:
            r1 = move-exception
            if (r3 == 0) goto L_0x00b1
            r3.close()     // Catch:{ all -> 0x00ad }
            goto L_0x00b1
        L_0x00ad:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ IOException -> 0x0012 }
        L_0x00b1:
            throw r1     // Catch:{ IOException -> 0x0012 }
        L_0x00b2:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            X.3J6 r0 = r1.A0o
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x0012
            X.3J6 r1 = r1.A0o
            r0 = 1
            r1.A01(r0)
            return
        L_0x00c5:
            java.lang.Object r2 = r1.A00
            X.3HJ r2 = (X.AnonymousClass3HJ) r2
            X.15x r0 = r2.A02
            X.12P r0 = r0.A00
            r0.A06()
            java.io.File r0 = r0.A03
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x0012
            X.16E r0 = r2.A03
            boolean r0 = r0.A0H()
            if (r0 != 0) goto L_0x0012
            X.164 r1 = r2.A01
            X.0v5 r0 = r2.A00
            com.whatsapp.jobqueue.job.GetStatusPrivacyJob r0 = X.C110985bY.A00(r0)
            r1.A01(r0)
            return
        L_0x00ec:
            java.lang.Object r3 = r1.A00
            X.3HJ r3 = (X.AnonymousClass3HJ) r3
            X.1GQ r0 = r3.A06
            boolean r0 = X.C36391kE.A1Z(r0)
            if (r0 == 0) goto L_0x010a
            X.1Dq r1 = r3.A07
            X.0yC r0 = r3.A04
            X.3oV r2 = new X.3oV
            r2.<init>(r0)
            java.util.concurrent.ConcurrentHashMap r1 = r1.A00
            java.lang.Boolean r0 = X.C36371kC.A0m()
            r1.put(r2, r0)
        L_0x010a:
            X.1Dj r8 = r3.A08
            X.1Dn r7 = r8.A08
            r2 = 0
            r7.A01(r2, r2)
            X.0yC r1 = r8.A03
            X.AnonymousClass00C.A0D(r1, r2)
            r0 = 4679(0x1247, float:6.557E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0012
            X.1Dq r0 = r8.A04
            java.util.concurrent.ConcurrentHashMap r0 = r0.A00
            java.util.Set r1 = r0.keySet()
            X.AnonymousClass00C.A08(r1)
            X.4RQ[] r0 = new X.AnonymousClass4RQ[r2]
            java.lang.Object[] r6 = r1.toArray(r0)
            X.4RQ[] r6 = (X.AnonymousClass4RQ[]) r6
            java.util.ArrayList r5 = X.AnonymousClass001.A0I()
            r4 = 0
        L_0x0137:
            int r0 = r6.length
            if (r4 >= r0) goto L_0x0154
            r0 = r6[r4]
            X.3Su[] r3 = r0.BnK()
            r8.A04(r3)
            r2 = 4
            r1 = 0
        L_0x0145:
            if (r1 >= r2) goto L_0x0151
            r0 = r3[r1]
            int r0 = r0.A01
            X.AnonymousClass000.A1F(r5, r0)
            int r1 = r1 + 1
            goto L_0x0145
        L_0x0151:
            int r4 = r4 + 1
            goto L_0x0137
        L_0x0154:
            int r0 = r5.size()
            if (r0 <= 0) goto L_0x0012
            int[] r0 = X.C34881hn.A00(r5)
            r7.A02(r0)
            return
        L_0x0162:
            java.lang.Object r4 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r4 = (com.whatsapp.quickcontact.QuickContactActivity) r4
            com.whatsapp.util.FloatingChildLayout r3 = r4.A0p
            int r0 = r3.A02
            if (r0 != 0) goto L_0x0187
            r0 = 1
            r3.A02 = r0
            android.view.View r0 = r3.A08
            r0.invalidate()
            r0 = 48
            X.3wb r2 = X.C81183wb.A00(r3, r0)
            r0 = 5
            X.4Ys r1 = new X.4Ys
            r1.<init>(r3, r2, r0)
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
        L_0x0187:
            com.whatsapp.util.FloatingChildLayout r2 = r4.A0p
            r0 = 49
            X.3wW r1 = new X.3wW
            r1.<init>((java.lang.Object) r4, (int) r0)
            int r0 = r2.A03
            if (r0 != 0) goto L_0x0012
            r0 = 1
            r2.A03 = r0
            r0 = 0
            com.whatsapp.util.FloatingChildLayout.A00(r2, r1, r0)
            return
        L_0x019c:
            java.lang.Object r0 = r1.A00
            X.14u r0 = (X.C225314u) r0
            X.17Y r0 = r0.A05
            r2 = 2131894592(0x7f122140, float:1.9423993E38)
            r1 = 0
            goto L_0x033a
        L_0x01a8:
            java.lang.Object r0 = r1.A00
            X.4VT r0 = (X.AnonymousClass4VT) r0
            java.lang.Object r2 = r0.A00
            com.whatsapp.registration.phonenumberentry.ChangeNumber r2 = (com.whatsapp.registration.phonenumberentry.ChangeNumber) r2
            X.0xM r1 = r2.A0A
            r0 = 0
            r1.A0b(r0, r0)
            X.0xM r0 = r2.A0A
            r0.A0W()
            X.0xM r0 = r2.A0A
            r0.A0X()
            return
        L_0x01c1:
            java.lang.Object r0 = r1.A00
            X.155 r0 = (X.AnonymousClass155) r0
            X.0wQ r2 = r0.A02
            r2.A0G()
            com.whatsapp.Me r1 = r2.A00
            r2.A0G()
            java.lang.String r0 = "me_old"
            X.C19730wQ.A03(r1, r2, r0)
            return
        L_0x01d5:
            java.lang.Object r0 = r1.A00
            X.224 r0 = (X.AnonymousClass224) r0
            X.1Dv r2 = r0.A00
            android.app.Activity r1 = r0.A00
            java.lang.String r0 = "android.settings.DATE_SETTINGS"
            android.content.Intent r0 = X.C36441kJ.A0I(r0)
            r2.A06(r1, r0)
            return
        L_0x01e7:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.email.VerifyEmail r1 = (com.whatsapp.registration.email.VerifyEmail) r1
            X.9Pi r2 = r1.A3i()
            java.lang.String r3 = r1.A0F
            int r5 = r1.A00
            r6 = 8
            r7 = 5
            r8 = 1
            r4 = 0
            r2.A00(r3, r4, r5, r6, r7, r8)
            r0 = 3
            goto L_0x056b
        L_0x01fe:
            java.lang.Object r3 = r1.A00
            com.whatsapp.registration.email.VerifyEmail r3 = (com.whatsapp.registration.email.VerifyEmail) r3
            com.whatsapp.WaTextView r2 = r3.A04
            java.lang.String r1 = "resendCodeText"
            if (r2 != 0) goto L_0x020d
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x020d:
            r0 = 1
            r2.setClickable(r0)
            com.whatsapp.WaTextView r2 = r3.A04
            if (r2 != 0) goto L_0x021a
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x021a:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131102869(0x7f060c95, float:1.7818188E38)
            X.C36351kA.A15(r1, r2, r0)
            return
        L_0x0225:
            java.lang.Object r6 = r1.A00
            com.whatsapp.registration.email.VerifyEmail r6 = (com.whatsapp.registration.email.VerifyEmail) r6
            X.1Dv r5 = r6.A01
            X.190 r0 = r6.A09
            if (r0 == 0) goto L_0x0244
            int r4 = r6.A00
            java.lang.String r3 = r6.A0F
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.email.RegisterEmail"
            r2.setClassName(r1, r0)
            X.C36361kB.A0w(r6, r2, r5, r3, r4)
            return
        L_0x0244:
            java.lang.RuntimeException r0 = X.C36331k8.A0X()
            throw r0
        L_0x0249:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "VerifyEmail/handleSuccessVerification/start main"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0326
        L_0x0254:
            java.lang.Object r2 = r1.A00
            X.1ud r2 = (X.C40031ud) r2
            X.0v0 r0 = r2.A03
            int r1 = r0.A0K()
            r0 = 4
            X.C40031ud.A05(r2, r1, r0)
            X.C40031ud.A04(r2, r0)
            X.C40031ud.A02(r2)
            X.2dN r0 = r2.A04
            X.2dM r0 = r0.A00
            X.C36331k8.A1E(r0)
            return
        L_0x0270:
            java.lang.Object r2 = r1.A00
            android.content.Context r2 = (android.content.Context) r2
            r1 = 0
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass190.A1E(r2, r1, r1, r0)
            r2.startActivity(r0)
            return
        L_0x027e:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = (com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel) r0
            X.1Rs r1 = r0.A0H
            r0 = 4
            X.C36341k9.A17(r1, r0)
            return
        L_0x0289:
            java.lang.Object r0 = r1.A00
            X.C36411kG.A1O(r0)
            return
        L_0x028f:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 12
            goto L_0x056b
        L_0x0297:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r3 = r0.A07
            X.3TX r2 = r3.A0F
            java.lang.String r1 = "device_confirm"
            java.lang.String r0 = "confirm_with_second_sms"
            r2.A08(r1, r0)
            X.1Rs r2 = r3.A0H
            r1 = 2
            goto L_0x02ef
        L_0x02aa:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r5 = r0.A07
            X.3Gz r0 = r5.A0E
            X.3G5 r1 = r0.A05
            java.lang.String r0 = "AccountDefenceLocalDataRepository/isRetryLimitReachedForResendingNotice"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0wg r1 = r1.A00
            java.lang.String r0 = "AccountDefenceLocalDataRepository_prefs"
            android.content.SharedPreferences r1 = r1.A00(r0)
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.AccountDefenceLocalDataRepository.is_retry_limit_reached_resending_notice"
            boolean r2 = X.C36371kC.A1U(r1, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "AccountDefenceLocalDataRepository/isRetryLimitReachedForResendingNotice/result "
            X.C36321k7.A1X(r0, r1, r2)
            if (r2 == 0) goto L_0x02d6
            X.1Rs r2 = r5.A0G
            r1 = 5
            goto L_0x02ef
        L_0x02d6:
            long r3 = r5.A0S()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            X.1Rs r2 = r5.A0G
            r1 = 1
            if (r0 <= 0) goto L_0x02ef
            r1 = 6
            goto L_0x02ef
        L_0x02e5:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r0 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r0
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r0 = r0.A07
            X.1Rs r2 = r0.A0G
            r1 = 9
        L_0x02ef:
            X.C36341k9.A16(r2, r1)
            return
        L_0x02f3:
            java.lang.Object r5 = r1.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r5 = (com.whatsapp.registration.VerifyTwoFactorAuth) r5
            X.0wU r0 = r5.A04
            X.0v0 r3 = r5.A09
            X.3UV r4 = r5.A0N
            java.lang.String r6 = r5.A0V
            java.lang.String r7 = r5.A0W
            X.0wG r2 = r5.A0F
            X.2jQ r1 = new X.2jQ
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r5.A0Q = r1
            X.C36331k8.A1F(r1, r0)
            return
        L_0x030e:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r0 = (com.whatsapp.registration.VerifyTwoFactorAuth) r0
            com.whatsapp.registration.VerifyTwoFactorAuth.A07(r0)
            return
        L_0x0316:
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r1 = (com.whatsapp.registration.VerifyTwoFactorAuth) r1
            X.1Ww r0 = r1.A0O
            r0.A09()
            android.content.Intent r0 = X.AnonymousClass190.A0B(r1)
            r1.startActivity(r0)
        L_0x0326:
            r1.finish()
            return
        L_0x032a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.VerifyCaptcha r0 = (com.whatsapp.registration.VerifyCaptcha) r0
            com.whatsapp.registration.VerifyCaptcha.A0G(r0)
            return
        L_0x0332:
            java.lang.Object r0 = r1.A00
            X.17Y r0 = (X.AnonymousClass17Y) r0
            r2 = 2131895204(0x7f1223a4, float:1.9425234E38)
            r1 = 1
        L_0x033a:
            r0.A06(r2, r1)
            return
        L_0x033e:
            java.lang.Object r1 = r1.A00
            X.14r r1 = (X.C225014r) r1
            com.whatsapp.dialogs.UnrecoverableErrorDialogFragment r0 = new com.whatsapp.dialogs.UnrecoverableErrorDialogFragment
            r0.<init>()
            r1.Btm(r0)
            return
        L_0x034b:
            java.lang.Object r8 = r1.A00
            com.whatsapp.registration.SendSmsToWa r8 = (com.whatsapp.registration.SendSmsToWa) r8
            X.0wU r0 = r8.A04
            X.0v0 r1 = r8.A09
            java.lang.String r9 = r1.A0f()
            X.AnonymousClass00C.A08(r9)
            X.0v0 r1 = r8.A09
            java.lang.String r10 = r1.A0h()
            X.AnonymousClass00C.A08(r10)
            X.0v0 r1 = r8.A09
            int r15 = r1.A0B()
            android.content.SharedPreferences r2 = X.C36331k8.A06(r8)
            java.lang.String r1 = "pref_flash_call_manage_call_permission_granted"
            r3 = -1
            int r16 = r2.getInt(r1, r3)
            android.content.SharedPreferences r2 = X.C36331k8.A06(r8)
            java.lang.String r1 = "pref_flash_call_call_log_permission_granted"
            int r17 = r2.getInt(r1, r3)
            X.0wG r3 = r8.A01
            if (r3 == 0) goto L_0x03c8
            X.0zN r2 = r8.A02
            if (r2 == 0) goto L_0x03c1
            X.0v0 r1 = r8.A09
            X.2d2 r7 = X.C65983Uf.A08(r1, r2)
            X.0yb r2 = r8.A08
            X.AnonymousClass00C.A07(r2)
            X.0v0 r4 = r8.A09
            X.AnonymousClass00C.A07(r4)
            X.3UV r5 = r8.A04
            if (r5 == 0) goto L_0x03ba
            X.9gH r6 = r8.A06
            if (r6 == 0) goto L_0x03b3
            java.lang.String r11 = "sms"
            r12 = 0
            java.lang.String r13 = "0"
            r18 = 0
            r19 = 0
            X.2kE r1 = new X.2kE
            r14 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r8.A07 = r1
            X.C36441kJ.A1E(r1, r0)
            return
        L_0x03b3:
            java.lang.String r0 = "autoconfManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03ba:
            java.lang.String r0 = "registrationHttpManager"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03c1:
            java.lang.String r0 = "abPreChatdProps"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03c8:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x03cf:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            com.whatsapp.registration.RegisterName.A0G(r0)
            return
        L_0x03d7:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            X.1XF r1 = r0.A1F
            r0 = 1
            r1.A01(r0)
            return
        L_0x03e2:
            java.lang.Object r0 = r1.A00
            X.14u r0 = (X.C225314u) r0
            X.3NA r1 = new X.3NA
            r1.<init>(r0)
            r6 = 2131892114(0x7f121792, float:1.9418967E38)
            X.14u r2 = r1.A00
            r5 = 2131892116(0x7f121794, float:1.9418971E38)
            r7 = 2131891806(0x7f12165e, float:1.9418342E38)
            r8 = 2131896681(0x7f122969, float:1.942823E38)
            X.3cL r3 = X.C68713cL.A00
            r0 = 7
            X.4Xi r4 = new X.4Xi
            r4.<init>(r1, r0)
            r2.A39(r3, r4, r5, r6, r7, r8)
            return
        L_0x0405:
            java.lang.Object r0 = r1.A00
            X.14u r0 = (X.C225314u) r0
            X.3NA r2 = new X.3NA
            r2.<init>(r0)
            r1 = 0
            r0 = 2131892115(0x7f121793, float:1.941897E38)
            X.AnonymousClass3NA.A00(r2, r1, r0)
            return
        L_0x0416:
            java.lang.Object r6 = r1.A00
            com.whatsapp.registration.RegisterName r6 = (com.whatsapp.registration.RegisterName) r6
            X.0ts r2 = r6.A00
            X.1Q9 r0 = r6.A0c
            long r0 = r0.A0E()
            java.lang.String r5 = X.AnonymousClass3UY.A0B(r2, r0)
            X.0ts r4 = r6.A00
            X.0y0 r0 = r6.A04
            java.io.File r1 = r0.A0H()
            r0 = 0
            long r2 = X.AnonymousClass6YY.A00(r0, r1)
            X.1Q9 r0 = r6.A0c
            long r0 = r0.A0F()
            long r2 = r2 + r0
            java.lang.String r3 = X.AnonymousClass3TF.A03(r4, r2)
            X.17Y r2 = r6.A05
            r0 = 14
            X.3vK r1 = new X.3vK
            r1.<init>(r6, r5, r3, r0)
            goto L_0x04ac
        L_0x0448:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            X.3ED r1 = r0.A16
            com.whatsapp.WaEditText r0 = r0.A0I
            android.text.Editable r0 = r0.getText()
            X.C18740tg.A06(r0)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.trim()
            r1.A00(r0)
            X.3wC r0 = com.whatsapp.registration.RegisterName.A1r
            r0.run()
            return
        L_0x0468:
            java.lang.Object r4 = r1.A00
            com.whatsapp.registration.RegisterName r4 = (com.whatsapp.registration.RegisterName) r4
            X.0v5 r1 = r4.A0B
            boolean r0 = r1.A05()
            if (r0 == 0) goto L_0x047e
            r1.A02()
            java.lang.String r0 = "getUnsignedBizVNameCertVerifiedName"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0A(r0)
            throw r0
        L_0x047e:
            android.content.SharedPreferences r0 = X.C36331k8.A06(r4)
            java.lang.String r1 = "pref_wfs_name"
            r3 = 0
            java.lang.String r0 = r0.getString(r1, r3)
            if (r0 == 0) goto L_0x04b0
            android.content.SharedPreferences r0 = X.C36331k8.A06(r4)
            java.lang.String r0 = r0.getString(r1, r3)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x04b0
            android.content.SharedPreferences r0 = X.C36331k8.A06(r4)
            java.lang.String r8 = r0.getString(r1, r3)
        L_0x04a1:
            if (r8 == 0) goto L_0x04d4
        L_0x04a3:
            X.17Y r2 = r4.A05
            r0 = 19
            X.74v r1 = new X.74v
            r1.<init>(r0, r8, r4)
        L_0x04ac:
            r2.A0H(r1)
            return
        L_0x04b0:
            X.31h r0 = r4.A0h
            java.lang.String r1 = "user_push_name"
            X.12P r0 = r0.A00     // Catch:{ SQLException -> 0x04ce }
            X.1M0 r2 = r0.get()     // Catch:{ SQLException -> 0x04ce }
            X.14e r0 = r2.A02     // Catch:{ all -> 0x04c4 }
            java.lang.String r8 = X.AnonymousClass14m.A00(r0, r1, r3)     // Catch:{ all -> 0x04c4 }
            r2.close()     // Catch:{ SQLException -> 0x04ce }
            goto L_0x04a1
        L_0x04c4:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x04c9 }
            goto L_0x04cd
        L_0x04c9:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ SQLException -> 0x04ce }
        L_0x04cd:
            throw r1     // Catch:{ SQLException -> 0x04ce }
        L_0x04ce:
            r1 = move-exception
            java.lang.String r0 = "UserSettingsStore/getPushName/Error reading push name"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x04d4:
            java.lang.String r3 = "display_name"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            java.lang.String r0 = "samsung"
            boolean r0 = r0.equalsIgnoreCase(r1)
            r8 = 0
            if (r0 != 0) goto L_0x04a3
            X.0yb r0 = r4.A08     // Catch:{ Exception -> 0x0511 }
            X.0ya r5 = r0.A0O()     // Catch:{ Exception -> 0x0511 }
            android.net.Uri r6 = android.provider.ContactsContract.Profile.CONTENT_URI     // Catch:{ Exception -> 0x0511 }
            java.lang.String[] r7 = new java.lang.String[]{r3}     // Catch:{ Exception -> 0x0511 }
            r10 = r8
            r9 = r8
            android.database.Cursor r2 = r5.A03(r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x0511 }
            if (r2 == 0) goto L_0x0517
            boolean r0 = r2.moveToFirst()     // Catch:{ all -> 0x0507 }
            if (r0 == 0) goto L_0x0503
            int r0 = r2.getColumnIndexOrThrow(r3)     // Catch:{ all -> 0x0507 }
            java.lang.String r8 = r2.getString(r0)     // Catch:{ all -> 0x0507 }
        L_0x0503:
            r2.close()     // Catch:{ Exception -> 0x0511 }
            goto L_0x0517
        L_0x0507:
            r1 = move-exception
            r2.close()     // Catch:{ all -> 0x050c }
            goto L_0x0510
        L_0x050c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ Exception -> 0x0511 }
        L_0x0510:
            throw r1     // Catch:{ Exception -> 0x0511 }
        L_0x0511:
            r1 = move-exception
            java.lang.String r0 = "RegisterName/getmename "
            com.whatsapp.util.Log.w(r0, r1)
        L_0x0517:
            r7 = 0
            if (r8 != 0) goto L_0x053e
            android.content.Context r0 = r4.getApplicationContext()
            android.accounts.AccountManager r0 = android.accounts.AccountManager.get(r0)
            if (r0 == 0) goto L_0x04a3
            android.accounts.Account[] r6 = r0.getAccounts()
            if (r6 == 0) goto L_0x04a3
            int r5 = r6.length
            r3 = 0
        L_0x052c:
            if (r3 >= r5) goto L_0x04a3
            r2 = r6[r3]
            java.lang.String r1 = r2.type
            java.lang.String r0 = "com.google"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0558
            java.lang.String r8 = r2.name
            if (r8 == 0) goto L_0x04a3
        L_0x053e:
            java.lang.String r3 = "@"
            boolean r0 = r8.contains(r3)
            r2 = 32
            r1 = 46
            if (r0 == 0) goto L_0x055b
            int r0 = r8.indexOf(r3)
            java.lang.String r0 = r8.substring(r7, r0)
            java.lang.String r8 = r0.replace(r1, r2)
            goto L_0x04a3
        L_0x0558:
            int r3 = r3 + 1
            goto L_0x052c
        L_0x055b:
            java.lang.String r8 = r8.replace(r1, r2)
            goto L_0x04a3
        L_0x0561:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "RegisterName/dialog/initprogress/removedialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
        L_0x056b:
            X.AnonymousClass3SJ.A00(r1, r0)
            return
        L_0x056f:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.RegisterName r0 = (com.whatsapp.registration.RegisterName) r0
            X.005 r0 = r0.A1T
            java.lang.Object r0 = r0.get()
            X.32o r0 = (X.C590832o) r0
            X.0y9 r1 = r0.A00
            java.lang.Class<X.0xq> r0 = X.C20610xq.class
            X.00M r1 = r1.A01(r0)
            X.0xq r1 = (X.C20610xq) r1
            java.lang.String r0 = "ConsumerBridge/onSyncExportMigrationFeatureState"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.005 r0 = r1.A01
            java.lang.Object r0 = r0.get()
            X.6WX r0 = (X.AnonymousClass6WX) r0
            r0.A06()
            return
        L_0x0596:
            java.lang.Object r0 = r1.A00
            X.14u r0 = (X.C225314u) r0
            X.0v0 r0 = r0.A09
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "is_latam_tos_shown_during_reg"
            android.content.SharedPreferences$Editor r0 = r1.putBoolean(r0, r2)
            r0.commit()
            return
        L_0x05ab:
            java.lang.Object r5 = r1.A00
            com.whatsapp.registration.EULA r5 = (com.whatsapp.registration.EULA) r5
            X.3KB r1 = r5.A0O
            X.0wo r0 = r1.A00
            long r3 = X.C19970wo.A00(r0)
            X.0zN r0 = r1.A01
            android.content.SharedPreferences r1 = r0.A0F()
            java.lang.String r0 = "pref_pre_chatd_ab_next_fetch_time"
            long r1 = X.C36341k9.A0B(r1, r0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x05cd
            java.lang.String r0 = "EULA/should not fetch ABProps so returning early"
        L_0x05c9:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x05cd:
            android.app.Application r3 = r5.getApplication()
            java.lang.String r0 = "EULA/fetching prechatd ABProps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3KB r1 = r5.A0O
            r0 = 0
            java.lang.String r2 = r1.A00(r0, r0)
            X.3KB r0 = r5.A0O
            boolean r0 = r0.A01(r2)
            if (r0 == 0) goto L_0x05ed
            X.9XW r0 = r5.A0I
            r0.A01(r3)
            java.lang.String r0 = "EULA/success fetching prechatd ABProps"
            goto L_0x05c9
        L_0x05ed:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "EULA/error fetching prechatd ABProps: "
            X.C36321k7.A1P(r0, r2, r1)
            return
        L_0x05f7:
            java.lang.Object r0 = r1.A00
            com.whatsapp.registration.EULA r0 = (com.whatsapp.registration.EULA) r0
            X.1Wg r0 = r0.A0M
            r0.A09()
            return
        L_0x0601:
            java.lang.Object r1 = r1.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "AccountDefenceSecondCodeViewPresenter/learn-more tapped"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 604(0x25c, float:8.46E-43)
            X.AnonymousClass3SJ.A01(r1, r0)
            return
        L_0x0610:
            java.lang.Object r0 = r1.A00
            com.whatsapp.reactions.ReactionsBottomSheetDialogFragment r0 = (com.whatsapp.reactions.ReactionsBottomSheetDialogFragment) r0
            com.whatsapp.WaTabLayout r1 = r0.A05
            X.0rq r0 = r0.A00
            r1.A0G(r0)
            return
        L_0x061c:
            java.lang.Object r2 = r1.A00
            android.app.Activity r2 = (android.app.Activity) r2
            android.view.Window r1 = r2.getWindow()
            r0 = 0
            r1.setStatusBarColor(r0)
            r2.finish()
            r2.overridePendingTransition(r0, r0)
            return
        L_0x062f:
            java.lang.Object r4 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r4 = (com.whatsapp.quickcontact.QuickContactActivity) r4
            com.whatsapp.util.FloatingChildLayout r0 = r4.A0p
            r0.invalidate()
            android.view.Window r3 = r4.getWindow()
            android.content.Intent r2 = r4.getIntent()
            int r1 = X.C36391kE.A05(r4)
            java.lang.String r0 = "status_bar_color"
            int r0 = r2.getIntExtra(r0, r1)
            r3.setStatusBarColor(r0)
            com.whatsapp.util.FloatingChildLayout r3 = r4.A0p
            r0 = 48
            X.3wW r2 = new X.3wW
            r2.<init>((java.lang.Object) r4, (int) r0)
            r0 = 5
            X.4Ys r1 = new X.4Ys
            r1.<init>(r3, r2, r0)
            android.view.ViewTreeObserver r0 = r3.getViewTreeObserver()
            r0.addOnPreDrawListener(r1)
            return
        L_0x0664:
            java.lang.Object r1 = r1.A00
            com.whatsapp.quickcontact.QuickContactActivity r1 = (com.whatsapp.quickcontact.QuickContactActivity) r1
            r0 = 0
            com.whatsapp.quickcontact.QuickContactActivity.A0F(r1, r0)
            return
        L_0x066d:
            r0 = 1
            r1.setEnabled(r0)
            return
        L_0x0672:
            r0.createNewFile()     // Catch:{ IOException -> 0x0676 }
            return
        L_0x0676:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "VerifyCaptcha/setupAudio/createNewFile/IOException : "
            X.C36321k7.A1W(r0, r1, r2)
            return
        L_0x0681:
            java.lang.String r0 = "waContext"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0688:
            return
        L_0x0689:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C81143wX.run():void");
    }

    public C81143wX(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
