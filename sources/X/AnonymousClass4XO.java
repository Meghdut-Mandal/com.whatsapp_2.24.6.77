package X;

import android.content.DialogInterface;

/* renamed from: X.4XO  reason: invalid class name */
public class AnonymousClass4XO implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public AnonymousClass4XO(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r0 = 1;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x03d6, code lost:
        r2.A1f(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x03d9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000a, code lost:
        X.AnonymousClass3SJ.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0196, code lost:
        if (X.C18750th.A0B() == false) goto L_0x0198;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0198, code lost:
        r2.A01 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x019b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a1, code lost:
        X.AnonymousClass3SJ.A01(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01a4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r9, int r10) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 0: goto L_0x000e;
                case 1: goto L_0x00aa;
                case 2: goto L_0x0108;
                case 3: goto L_0x0110;
                case 4: goto L_0x0108;
                case 5: goto L_0x0110;
                case 6: goto L_0x012c;
                case 7: goto L_0x0148;
                case 8: goto L_0x0161;
                case 9: goto L_0x0167;
                case 10: goto L_0x0022;
                case 11: goto L_0x0029;
                case 12: goto L_0x0005;
                case 13: goto L_0x0178;
                case 14: goto L_0x0188;
                case 15: goto L_0x019c;
                case 16: goto L_0x017e;
                case 17: goto L_0x002e;
                case 18: goto L_0x0037;
                case 19: goto L_0x0044;
                case 20: goto L_0x0056;
                case 21: goto L_0x005d;
                case 22: goto L_0x0069;
                case 23: goto L_0x01a5;
                case 24: goto L_0x01c1;
                case 25: goto L_0x01ce;
                case 26: goto L_0x01e7;
                case 27: goto L_0x01ff;
                case 28: goto L_0x0246;
                case 29: goto L_0x0070;
                case 30: goto L_0x0252;
                case 31: goto L_0x0077;
                case 32: goto L_0x026a;
                case 33: goto L_0x007d;
                case 34: goto L_0x0281;
                case 35: goto L_0x028c;
                case 36: goto L_0x0084;
                case 37: goto L_0x02ab;
                case 38: goto L_0x02da;
                case 39: goto L_0x008b;
                case 40: goto L_0x0093;
                case 41: goto L_0x009b;
                case 42: goto L_0x02e7;
                case 43: goto L_0x0304;
                case 44: goto L_0x032a;
                case 45: goto L_0x035f;
                case 46: goto L_0x03a9;
                case 47: goto L_0x03ba;
                case 48: goto L_0x0005;
                case 49: goto L_0x00a3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2
        L_0x000a:
            X.AnonymousClass3SJ.A00(r1, r0)
        L_0x000d:
            return
        L_0x000e:
            java.lang.Object r3 = r8.A00
            com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment r3 = (com.whatsapp.product.newsletterenforcements.enforcedmessages.DeleteEnforcedMessageDialogFragment) r3
            X.3Qa r1 = X.AnonymousClass3UJ.A04(r3)
            X.1A1 r0 = r3.A02     // Catch:{ all -> 0x03f0 }
            if (r0 == 0) goto L_0x03e9
            X.3T1 r2 = r0.A03(r1)     // Catch:{ all -> 0x03f0 }
            if (r2 == 0) goto L_0x000d
            goto L_0x03da
        L_0x0022:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 9
            goto L_0x000a
        L_0x0029:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x0035
        L_0x002e:
            java.lang.Object r1 = r8.A00
            com.whatsapp.registration.RegisterName r1 = (com.whatsapp.registration.RegisterName) r1
            r1.A3n()
        L_0x0035:
            r0 = 1
            goto L_0x000a
        L_0x0037:
            java.lang.Object r0 = r8.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r9.dismiss()
            if (r0 == 0) goto L_0x000d
            r0.run()
            return
        L_0x0044:
            java.lang.Object r1 = r8.A00
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.String r0 = "RegistrationUtils/showLoginFailedDialog/continue login"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.dismiss()
            if (r1 == 0) goto L_0x000d
            r1.run()
            return
        L_0x0056:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 604(0x25c, float:8.46E-43)
            goto L_0x000a
        L_0x005d:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "RegistrationUtils/createCannotConnectDialog/dialog/cant-connect/button/cancel"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 109(0x6d, float:1.53E-43)
            goto L_0x000a
        L_0x0069:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 125(0x7d, float:1.75E-43)
            goto L_0x000a
        L_0x0070:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 8
            goto L_0x000a
        L_0x0077:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 5
            goto L_0x000a
        L_0x007d:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 32
            goto L_0x000a
        L_0x0084:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 17
            goto L_0x000a
        L_0x008b:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 13
            goto L_0x000a
        L_0x0093:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 14
            goto L_0x000a
        L_0x009b:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 15
            goto L_0x000a
        L_0x00a3:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 3
            goto L_0x000a
        L_0x00aa:
            java.lang.Object r5 = r8.A00
            com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment r5 = (com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment) r5
            r0 = 1
            r5.A06 = r0
            X.3T1 r0 = r5.A02
            java.lang.String r1 = "selectedMessage"
            r4 = 0
            if (r0 != 0) goto L_0x00bd
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00bd:
            X.37F r0 = r0.A0X()
            if (r0 == 0) goto L_0x00cb
            X.3Qa r0 = r0.A02
            if (r0 == 0) goto L_0x00cb
            java.lang.String r3 = r0.A01
            if (r3 != 0) goto L_0x00d8
        L_0x00cb:
            X.3T1 r0 = r5.A02
            if (r0 != 0) goto L_0x00d4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00d4:
            X.3Qa r0 = r0.A1J
            java.lang.String r3 = r0.A01
        L_0x00d8:
            X.AnonymousClass00C.A0B(r3)
            X.3T1 r0 = r5.A02
            if (r0 != 0) goto L_0x00e4
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r1)
            throw r0
        L_0x00e4:
            com.whatsapp.jid.UserJid r2 = r0.A0L()
            if (r2 != 0) goto L_0x00fb
            X.1Jb r1 = r5.A01
            if (r1 == 0) goto L_0x00f4
            X.8zz r0 = X.C188648zz.A0R
            r1.A00(r0, r4)
            return
        L_0x00f4:
            java.lang.String r0 = "crashLogsWrapper"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x00fb:
            X.041 r1 = X.C009403z.A01()
            com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment$setButtons$1$1 r0 = new com.whatsapp.product.reporttoadmin.ReportToAdminDialogFragment$setButtons$1$1
            r0.<init>(r2, r5, r3, r4)
            X.C36331k8.A1T(r0, r1)
            return
        L_0x0108:
            java.lang.Object r0 = r8.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1c()
            return
        L_0x0110:
            java.lang.Object r4 = r8.A00
            androidx.fragment.app.DialogFragment r4 = (androidx.fragment.app.DialogFragment) r4
            X.01I r3 = r4.A0h()
            if (r3 == 0) goto L_0x0128
            android.content.Intent r2 = X.C36431kI.A0D()
            r1 = 1
            java.lang.String r0 = "is_reset"
            r2.putExtra(r0, r1)
            r0 = -1
            r3.setResult(r0, r2)
        L_0x0128:
            r4.A1c()
            return
        L_0x012c:
            java.lang.Object r1 = r8.A00
            com.whatsapp.profile.SetAboutInfo r1 = (com.whatsapp.profile.SetAboutInfo) r1
            r0 = 3
            X.AnonymousClass3SJ.A00(r1, r0)
            java.util.ArrayList r0 = com.whatsapp.profile.SetAboutInfo.A0A
            r0.clear()
            com.whatsapp.profile.SetAboutInfo.A01(r1)
            X.1nD r0 = r1.A04
            r0.notifyDataSetChanged()
            X.3Pt r1 = r1.A05
            r0 = 5
            r1.A01(r0)
            return
        L_0x0148:
            java.lang.Object r2 = r8.A00
            com.whatsapp.qrcode.DevicePairQrScannerActivity r2 = (com.whatsapp.qrcode.DevicePairQrScannerActivity) r2
            android.content.Intent r1 = X.C36431kI.A0C()
            X.1fu r0 = r2.A03
            android.net.Uri r0 = r0.A00()
            android.content.Intent r0 = r1.setData(r0)
            r2.startActivity(r0)
            r2.finish()
            return
        L_0x0161:
            java.lang.Object r0 = r8.A00
            X.C36411kG.A1N(r0)
            return
        L_0x0167:
            java.lang.Object r2 = r8.A00
            X.02E r2 = (X.AnonymousClass02E) r2
            android.content.Context r1 = r2.A0a()
            r0 = 2
            android.content.Intent r0 = X.AnonymousClass3LZ.A01(r1, r0)
            r2.A1C(r0)
            return
        L_0x0178:
            java.lang.Object r2 = r8.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 5
            goto L_0x01a1
        L_0x017e:
            java.lang.Object r2 = r8.A00
            com.whatsapp.registration.EULA r2 = (com.whatsapp.registration.EULA) r2
            r0 = 8
            X.AnonymousClass3SJ.A00(r2, r0)
            goto L_0x0198
        L_0x0188:
            java.lang.Object r2 = r8.A00
            com.whatsapp.registration.EULA r2 = (com.whatsapp.registration.EULA) r2
            r0 = 6
            X.AnonymousClass3SJ.A00(r2, r0)
            boolean r0 = X.C18750th.A0B()
            r1 = 8
            if (r0 != 0) goto L_0x01a1
        L_0x0198:
            r0 = 0
            r2.A01 = r0
            return
        L_0x019c:
            java.lang.Object r2 = r8.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r1 = 7
        L_0x01a1:
            X.AnonymousClass3SJ.A01(r2, r1)
            return
        L_0x01a5:
            java.lang.Object r2 = r8.A00
            com.whatsapp.registration.SelectPhoneNumberDialog r2 = (com.whatsapp.registration.SelectPhoneNumberDialog) r2
            java.lang.String r0 = "SelectPhoneNumberDialog/no-phone-number-selected"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4OX r0 = r2.A01
            if (r0 == 0) goto L_0x01bd
            X.2d9 r0 = (X.AnonymousClass2d9) r0
            X.1N2 r1 = r0.A0C
            X.3AK r0 = r0.A0O
            android.widget.EditText r0 = r0.A03
            r1.A02(r0)
        L_0x01bd:
            r2.A1b()
            return
        L_0x01c1:
            java.lang.Object r1 = r8.A00
            com.whatsapp.registration.SendSmsToWa r1 = (com.whatsapp.registration.SendSmsToWa) r1
            java.lang.String r0 = "SendSmsToWa/wrong number tapped, reset state and direct to enter phone"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.registration.SendSmsToWa.A0G(r1)
            return
        L_0x01ce:
            java.lang.Object r2 = r8.A00
            com.whatsapp.registration.SendSmsToWa r2 = (com.whatsapp.registration.SendSmsToWa) r2
            android.content.SharedPreferences r1 = com.whatsapp.registration.SendSmsToWa.A01(r2)
            java.lang.String r0 = "send_sms_number"
            java.lang.String r0 = X.C36371kC.A0t(r1, r0)
            if (r0 == 0) goto L_0x01e2
            com.whatsapp.registration.SendSmsToWa.A0I(r2, r0)
            return
        L_0x01e2:
            java.lang.IllegalStateException r0 = X.C36381kD.A0l()
            throw r0
        L_0x01e7:
            java.lang.Object r3 = r8.A00
            com.whatsapp.registration.SendSmsToWa r3 = (com.whatsapp.registration.SendSmsToWa) r3
            r2 = 1
            android.content.SharedPreferences r0 = com.whatsapp.registration.SendSmsToWa.A01(r3)
            android.content.SharedPreferences$Editor r1 = r0.edit()
            java.lang.String r0 = "send_sms_intent_triggered"
            X.C36331k8.A0w(r1, r0, r2)
            r0 = 0
            com.whatsapp.registration.SendSmsToWa.A0H(r3, r0)
            return
        L_0x01ff:
            java.lang.Object r4 = r8.A00
            com.whatsapp.registration.VerifyCaptcha r4 = (com.whatsapp.registration.VerifyCaptcha) r4
            r0 = 7
            X.AnonymousClass3SJ.A00(r4, r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            r0 = 43
            r1.append(r0)
            java.lang.String r0 = r4.A0U
            if (r0 != 0) goto L_0x021b
            java.lang.String r0 = "countryCode"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x021b:
            r1.append(r0)
            java.lang.String r0 = r4.A0V
            if (r0 != 0) goto L_0x0229
            java.lang.String r0 = "phoneNumber"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0229:
            java.lang.String r3 = X.AnonymousClass000.A0q(r0, r1)
            X.3Gu r2 = r4.A0I
            if (r2 == 0) goto L_0x023f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "verify-captcha "
            java.lang.String r0 = X.AnonymousClass000.A0p(r0, r3, r1)
            X.C62603Gu.A00(r4, r2, r0)
            return
        L_0x023f:
            java.lang.String r0 = "feedbackSendMethods"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0246:
            java.lang.Object r1 = r8.A00
            com.whatsapp.registration.VerifyCaptcha r1 = (com.whatsapp.registration.VerifyCaptcha) r1
            r0 = 7
            X.AnonymousClass3SJ.A00(r1, r0)
            com.whatsapp.registration.VerifyCaptcha.A0G(r1)
            return
        L_0x0252:
            java.lang.Object r1 = r8.A00
            com.whatsapp.registration.VerifyCaptcha r1 = (com.whatsapp.registration.VerifyCaptcha) r1
            r0 = 3
            X.AnonymousClass3SJ.A00(r1, r0)
            com.whatsapp.CodeInputField r1 = r1.A0A
            if (r1 != 0) goto L_0x0265
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x0265:
            r0 = 1
            r1.setImportantForAccessibility(r0)
            return
        L_0x026a:
            java.lang.Object r0 = r8.A00
            com.whatsapp.registration.VerifyCaptcha r0 = (com.whatsapp.registration.VerifyCaptcha) r0
            r1 = 1
            X.AnonymousClass3SJ.A00(r0, r1)
            com.whatsapp.CodeInputField r0 = r0.A0A
            if (r0 != 0) goto L_0x027d
            java.lang.String r0 = "codeInputField"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)
            throw r0
        L_0x027d:
            r0.setImportantForAccessibility(r1)
            return
        L_0x0281:
            java.lang.Object r3 = r8.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r3 = (com.whatsapp.registration.VerifyTwoFactorAuth) r3
            r2 = 2
            r1 = 0
            r0 = 0
            com.whatsapp.registration.VerifyTwoFactorAuth.A0G(r3, r1, r2, r0)
            return
        L_0x028c:
            java.lang.Object r4 = r8.A00
            android.content.Context r4 = (android.content.Context) r4
            X.1qm r3 = X.AnonymousClass3LW.A00(r4)
            r0 = 2131895128(0x7f122358, float:1.942508E38)
            r3.A0c(r0)
            r2 = 2131895122(0x7f122352, float:1.9425068E38)
            r1 = 34
            X.4XO r0 = new X.4XO
            r0.<init>(r4, r1)
            X.C39001qm.A03(r0, r3, r2)
            r3.A0b()
            return
        L_0x02ab:
            java.lang.Object r1 = r8.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r1 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r1
            r0 = 11
            X.AnonymousClass3SJ.A00(r1, r0)
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r2 = r1.A07
            X.1Rs r1 = r2.A0G
            r0 = 2
            X.C36341k9.A17(r1, r0)
            X.3Gz r3 = r2.A0E
            java.lang.String r6 = r2.A00
            X.C18740tg.A06(r6)
            java.lang.String r5 = r2.A01
            X.C18740tg.A06(r5)
            r0 = 0
            X.4aA r4 = new X.4aA
            r4.<init>(r2, r0)
            X.0wU r0 = r3.A06
            r7 = 7
            X.3vV r2 = new X.3vV
            r2.<init>(r3, r4, r5, r6, r7)
            r0.Boy(r2)
            return
        L_0x02da:
            java.lang.Object r1 = r8.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 11
            X.AnonymousClass3SJ.A00(r1, r0)
            r9.dismiss()
            return
        L_0x02e7:
            java.lang.Object r5 = r8.A00
            com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity r5 = (com.whatsapp.registration.accountdefence.DeviceConfirmationRegistrationActivity) r5
            r4 = 16
            com.whatsapp.registration.accountdefence.NewDeviceConfirmationRegistrationViewModel r3 = r5.A07
            java.lang.String r0 = "NewDeviceConfirmationRegistrationViewModel/onRegistrationTimedOutDialogClick"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3TX r2 = r3.A0F
            java.lang.String r1 = "device_confirm"
            java.lang.String r0 = "ad_timeout"
            r2.A08(r1, r0)
            r3.A0T()
            X.AnonymousClass3SJ.A00(r5, r4)
            return
        L_0x0304:
            java.lang.Object r0 = r8.A00
            X.02E r0 = (X.AnonymousClass02E) r0
            android.content.Context r4 = r0.A0a()
            android.content.Context r1 = r0.A0a()
            X.3Ip r0 = com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06
            java.lang.String r3 = r0.A02
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "server_token"
            r2.putExtra(r0, r3)
            r4.startActivity(r2)
            return
        L_0x032a:
            r3 = 0
            X.3SZ r0 = new X.3SZ
            r0.<init>(r8, r3)
            java.lang.Object r4 = r8.A00
            com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment r4 = (com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment) r4
            X.19A r2 = r4.A05
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r0)
            X.3pY r1 = new X.3pY
            r1.<init>(r2, r0)
            X.3Ip r0 = com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06
            java.lang.String r0 = r0.A02
            r1.A00(r3, r0)
            android.content.Context r3 = r4.A0a()
            android.content.Context r0 = r4.A0a()
            android.content.Intent r2 = X.C36431kI.A0D()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.accountdefence.ui.OldDeviceSecureAccountActivity"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x035f:
            java.lang.Object r0 = r8.A00
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment r0 = (com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment) r0
            X.32k r0 = r0.A00
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity r5 = r0.A00
            boolean r0 = X.C36431kI.A1R(r5)
            r4 = 1
            if (r0 != 0) goto L_0x038d
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/checksystemstatus/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r3 = 2131893393(0x7f121c91, float:1.9421561E38)
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r1 = 0
            r0 = 2131888230(0x7f120866, float:1.941109E38)
            X.C36421kH.A0k(r5, r0, r1, r2)
            X.3P9 r0 = com.whatsapp.LegacyMessageDialogFragment.A03(r2, r3)
            com.whatsapp.LegacyMessageDialogFragment r2 = r0.A02()
            X.01z r1 = r5.getSupportFragmentManager()
            r0 = 0
            goto L_0x03d6
        L_0x038d:
            r0 = 2131890853(0x7f1212a5, float:1.941641E38)
            r5.Bu1(r0)
            X.3SZ r0 = new X.3SZ
            r0.<init>(r5, r4)
            X.19A r2 = r5.A04
            java.lang.ref.WeakReference r0 = X.AnonymousClass001.A0F(r0)
            X.3pY r1 = new X.3pY
            r1.<init>(r2, r0)
            java.lang.String r0 = r5.A07
            r1.A00(r4, r0)
            return
        L_0x03a9:
            java.lang.Object r2 = r8.A00
            android.content.Context r2 = (android.content.Context) r2
            r9.dismiss()
            r1 = 0
            r0 = 1
            android.content.Intent r0 = X.AnonymousClass190.A1E(r2, r1, r1, r0)
            r2.startActivity(r0)
            return
        L_0x03ba:
            java.lang.Object r1 = r8.A00
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity r1 = (com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountNoticeActivity) r1
            r9.dismiss()
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity/launchConfirmationDialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.32k r0 = new X.32k
            r0.<init>(r1)
            com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment r2 = new com.whatsapp.registration.accountdefence.ui.OldDeviceMoveAccountConfirmationDialogFragment
            r2.<init>(r0)
            X.01z r1 = r1.getSupportFragmentManager()
            java.lang.String r0 = "OldDeviceMoveAccountNoticeActivity"
        L_0x03d6:
            r2.A1f(r1, r0)
            return
        L_0x03da:
            X.0wU r1 = r3.A03
            if (r1 == 0) goto L_0x03e4
            r0 = 41
            X.C36391kE.A1S(r1, r3, r2, r0)
            return
        L_0x03e4:
            java.lang.RuntimeException r0 = X.C36321k7.A08()
            throw r0
        L_0x03e9:
            java.lang.String r0 = "fMessageDatabase"
            java.lang.RuntimeException r0 = X.C36331k8.A0d(r0)     // Catch:{ all -> 0x03f0 }
            throw r0     // Catch:{ all -> 0x03f0 }
        L_0x03f0:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x03f2 }
        L_0x03f2:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4XO.onClick(android.content.DialogInterface, int):void");
    }
}
