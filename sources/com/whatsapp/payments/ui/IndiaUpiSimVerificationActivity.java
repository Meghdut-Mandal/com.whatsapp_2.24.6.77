package com.whatsapp.payments.ui;

import X.AnonymousClass190;
import X.AnonymousClass3LW;
import X.AnonymousClass3M9;
import X.AnonymousClass4RO;
import X.B7Z;
import X.C131606Ps;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C173858Tk;
import X.C179128jE;
import X.C179648kT;
import X.C18800tq;
import X.C18830tt;
import X.C201529jn;
import X.C20830yE;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C36371kC;
import X.C36441kJ;
import X.C39001qm;
import android.content.Intent;
import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;

public class IndiaUpiSimVerificationActivity extends C179128jE implements AnonymousClass4RO {
    public C20830yE A00;
    public C179648kT A01;
    public C201529jn A02;
    public boolean A03;

    private void A11(String str) {
        C131606Ps r3 = new C131606Ps((String) null, new C131606Ps[0]);
        r3.A03("device_binding_failure_reason", str);
        this.A0S.BOp(r3, 0, (Integer) null, "payments_device_binding_precheck", "verify_number");
    }

    private void A0z() {
        this.A01.A00.A08("verifyNumberClicked");
        Intent A0H = C36441kJ.A0H(this, IndiaUpiDeviceBindStepActivity.class);
        A0H.putExtras(C36371kC.A0H(this));
        AnonymousClass3M9.A01(A0H, "verifyNumber");
        A42(A0H);
        C165587tf.A0u(A0H, this, "extra_previous_screen", "verify_number");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r1.A0F() == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A10(com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity r15) {
        /*
            X.0yE r1 = r15.A00
            java.lang.String r3 = "android.permission.SEND_SMS"
            int r0 = r1.A02(r3)
            if (r0 != 0) goto L_0x0011
            boolean r1 = r1.A0F()
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            r12 = 0
            r2 = 0
            java.lang.Integer r11 = java.lang.Integer.valueOf(r2)
            if (r0 == 0) goto L_0x0201
            X.0yE r0 = r15.A00
            java.lang.String r1 = "android.permission.RECEIVE_SMS"
            int r0 = r0.A02(r1)
            if (r0 == 0) goto L_0x0035
            X.0yE r0 = r15.A00
            int r0 = r0.A02(r3)
            if (r0 != 0) goto L_0x0035
            java.lang.String[] r1 = new java.lang.String[]{r1}
            r0 = 100
            X.C03570Gk.A0C(r15, r1, r0)
        L_0x0035:
            boolean r0 = X.C19600wD.A02(r15)
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = "airplane_mode_on"
            r15.A11(r0)
            r0 = 2131892398(0x7f1218ae, float:1.9419543E38)
        L_0x0043:
            r15.BO5(r0)
            return
        L_0x0047:
            X.0yb r0 = r15.A08
            android.telephony.TelephonyManager r0 = r0.A0K()
            if (r0 == 0) goto L_0x0071
            int r1 = r0.getSimState()
            r0 = 5
            if (r1 != r0) goto L_0x0071
            int r4 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r4 < r0) goto L_0x011b
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = X.AnonymousClass00F.A01(r15, r0)
            if (r0 == 0) goto L_0x007a
            X.1Dc r1 = r15.A0p
            java.lang.String r0 = "WaPermissionsHelper#hasSendSMSAndTelephonePermissions() is missing android.permission.READ_PHONE_STATE permission"
            r1.A05(r0)
            java.lang.String r0 = "read_phone_permission_issues"
            r15.A11(r0)
            return
        L_0x0071:
            java.lang.String r0 = "sim_state_issues"
            r15.A11(r0)
            r0 = 2131892400(0x7f1218b0, float:1.9419547E38)
            goto L_0x0043
        L_0x007a:
            android.telephony.SubscriptionManager r0 = android.telephony.SubscriptionManager.from(r15)
            java.util.List r4 = r0.getActiveSubscriptionInfoList()
            X.6Ps[] r0 = new X.C131606Ps[r2]
            X.6Ps r10 = new X.6Ps
            r10.<init>(r12, r0)
            int r0 = r4.size()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "number_of_sims"
            r10.A03(r0, r1)
            X.AF7 r9 = r15.A0S
            java.lang.String r13 = "payments_device_binding_precheck"
            java.lang.String r14 = "verify_number"
            r9.BOp(r10, r11, r12, r13, r14)
            int r1 = r4.size()
            if (r1 == 0) goto L_0x00bf
            r8 = 1774(0x6ee, float:2.486E-42)
            java.lang.String r7 = "allow_undetermined_number_device_binding"
            r6 = 1
            if (r1 == r6) goto L_0x00c4
            r0 = 2
            if (r1 == r0) goto L_0x0133
            X.1Dc r1 = r15.A0p
            java.lang.String r0 = "Phone has more than 2 sims, which we do not support"
            r1.A05(r0)
            java.lang.String r0 = "more_than_two_sims"
            r15.A11(r0)
            r15.finish()
            return
        L_0x00bf:
            X.1Dc r1 = r15.A0p
            java.lang.String r0 = "found no sim information, proceeding"
            goto L_0x00e6
        L_0x00c4:
            java.lang.Object r0 = r4.get(r2)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r4 = r0.getNumber()
            com.whatsapp.jid.PhoneUserJid r1 = X.C36411kG.A0j(r15)
            if (r1 == 0) goto L_0x00eb
            java.lang.String r0 = r1.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00eb
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L_0x00f0
            X.1Dc r1 = r15.A0p
            java.lang.String r0 = "found one sim, but not able to read phone number, proceeding"
        L_0x00e6:
            r1.A05(r0)
            goto L_0x0179
        L_0x00eb:
            X.1Dc r1 = r15.A0p
            java.lang.String r0 = "Jid Info null, proceeding"
            goto L_0x00e6
        L_0x00f0:
            X.9jn r0 = r15.A02
            java.lang.String r3 = r1.user
            X.1N4 r1 = r0.A01
            X.AF7 r0 = r0.A02
            boolean r0 = X.C201529jn.A01(r1, r0, r4, r3)
            X.1Dc r3 = r15.A0p
            if (r0 == 0) goto L_0x0103
            java.lang.String r0 = "wa number matches with sim number, proceeding"
            goto L_0x012f
        L_0x0103:
            java.lang.String r0 = "wa number didn't match with sim number, showing error"
            r3.A05(r0)
            X.0yC r0 = r15.A0D
            boolean r0 = r0.A0E(r8)
            if (r0 == 0) goto L_0x01bf
            java.lang.String r0 = "Cannot read sim number, allow device binding"
            r3.A06(r0)
            X.AF7 r0 = r15.A0S
            r0.BOm(r11, r12, r7, r12)
            goto L_0x0179
        L_0x011b:
            X.1Dc r3 = r15.A0p
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "Trying payments on android sdk level"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", we do not have sim apis"
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
        L_0x012f:
            r3.A06(r0)
            goto L_0x0179
        L_0x0133:
            com.whatsapp.jid.PhoneUserJid r5 = X.C36411kG.A0j(r15)
            java.lang.Object r0 = r4.get(r2)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r3 = r0.getNumber()
            java.lang.Object r0 = r4.get(r6)
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            java.lang.String r1 = r0.getNumber()
            if (r5 == 0) goto L_0x01e1
            java.lang.String r0 = r5.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01e1
            X.9jn r0 = r15.A02
            java.lang.String r10 = r5.user
            X.1N4 r9 = r0.A01
            X.AF7 r0 = r0.A02
            boolean r0 = X.C201529jn.A01(r9, r0, r3, r10)
            if (r0 == 0) goto L_0x017d
            X.1Dc r1 = r15.A0p
            java.lang.String r0 = "sim 1 is not empty, matches with wa number, proceed"
            r1.A06(r0)
            X.AE0 r1 = r15.A0M
            java.lang.Object r0 = r4.get(r2)
        L_0x0170:
            android.telephony.SubscriptionInfo r0 = (android.telephony.SubscriptionInfo) r0
            int r0 = r0.getSubscriptionId()
            r1.A0H(r0)
        L_0x0179:
            r15.A0z()
            return
        L_0x017d:
            X.9jn r0 = r15.A02
            java.lang.String r9 = r5.user
            X.1N4 r5 = r0.A01
            X.AF7 r0 = r0.A02
            boolean r0 = X.C201529jn.A01(r5, r0, r1, r9)
            if (r0 == 0) goto L_0x0199
            X.1Dc r1 = r15.A0p
            java.lang.String r0 = "sim 2 is not empty, matches with wa number, proceed"
            r1.A06(r0)
            X.AE0 r1 = r15.A0M
            java.lang.Object r0 = r4.get(r6)
            goto L_0x0170
        L_0x0199:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L_0x01d7
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x01d7
            X.0yC r0 = r15.A0D
            boolean r0 = r0.A0E(r8)
            X.1Dc r1 = r15.A0p
            if (r0 == 0) goto L_0x01ba
            java.lang.String r0 = "Cannot read sim number(s) to compare with WA, show sim picker"
            r1.A06(r0)
            X.AF7 r0 = r15.A0S
            r0.BOm(r11, r12, r7, r12)
            goto L_0x01e8
        L_0x01ba:
            java.lang.String r0 = "Found sims numbers and they do not match, show error"
            r1.A06(r0)
        L_0x01bf:
            r4 = 2131892605(0x7f12197d, float:1.9419963E38)
            r3 = 2131892604(0x7f12197c, float:1.941996E38)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            X.0wQ r0 = r15.A02
            X.142 r0 = X.C36381kD.A0T(r0)
            java.lang.String r0 = X.AnonymousClass3U8.A03(r0)
            r1[r2] = r0
            r15.BO9(r1, r4, r3)
            return
        L_0x01d7:
            X.AF7 r0 = r15.A0S
            r0.BOm(r11, r12, r7, r12)
            X.1Dc r1 = r15.A0p
            java.lang.String r0 = "Did not find WA number, show sim picker"
            goto L_0x01e5
        L_0x01e1:
            X.1Dc r1 = r15.A0p
            java.lang.String r0 = "Jid Info null, show sim picker"
        L_0x01e5:
            r1.A06(r0)
        L_0x01e8:
            android.os.Bundle r2 = X.AnonymousClass001.A07()
            java.util.ArrayList r1 = X.C36441kJ.A15(r4)
            java.lang.String r0 = "extra_subscriptions"
            r2.putParcelableArrayList(r0, r1)
            com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment r0 = new com.whatsapp.payments.ui.IndiaUpiSimPickerDialogFragment
            r0.<init>()
            r0.A17(r2)
            r15.Btm(r0)
            return
        L_0x0201:
            X.0yE r1 = r15.A00
            X.3US r0 = com.whatsapp.RequestPermissionActivity.A0B
            r0.A0E(r15, r1)
            X.AF7 r2 = r15.A0S
            java.lang.String r1 = "allow_sms_dialog"
            java.lang.String r0 = "verify_number"
            r2.BOm(r11, r12, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.A10(com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity):void");
    }

    public void A2F() {
        if (!this.A03) {
            this.A03 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C165567td.A11(r2, this);
            C18830tt r1 = r2.A00;
            C165567td.A0v(r2, r1, this, C36321k7.A05(r2, r1, this));
            C173858Tk.A0h(A0L, r2, r1, this);
            C173858Tk.A0i(A0L, r2, r1, this, C165577te.A0f(r2));
            C173858Tk.A0q(r2, r1, this);
            C173858Tk.A0p(r2, r1, this);
            this.A00 = C165587tf.A0N(r2);
            this.A02 = r2.AHh();
            this.A01 = C173858Tk.A0G(r1);
        }
    }

    public void Bgk(SubscriptionInfo subscriptionInfo) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.A0M.A0H(subscriptionInfo.getSubscriptionId());
            A0z();
            return;
        }
        this.A0p.A05("Why sim picker is showing for < 22 api level?");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 153) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1) {
            this.A0S.BOm(1, 66, "allow_sms_dialog", (String) null);
            A10(this);
        } else {
            BO5(R.string.f12nameremoved);
            this.A0S.BOm(1, 67, "allow_sms_dialog", (String) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0132, code lost:
        if (android.text.TextUtils.isEmpty(r7) == false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r19) {
        /*
            r18 = this;
            r9 = r18
            r0 = r19
            super.onCreate(r0)
            r0 = 2131625260(0x7f0e052c, float:1.8877723E38)
            r9.setContentView((int) r0)
            r1 = 2131233405(0x7f080a7d, float:1.8082947E38)
            r0 = 2131433566(0x7f0b185e, float:1.8488921E38)
            r9.A3y(r1, r0)
            X.07B r1 = r9.getSupportActionBar()
            r4 = 1
            if (r1 == 0) goto L_0x002a
            r0 = 2131896908(0x7f122a4c, float:1.942869E38)
            java.lang.String r0 = r9.getString(r0)
            r1.A0Q(r0)
            r1.A0U(r4)
        L_0x002a:
            r0 = 2131429494(0x7f0b0876, float:1.8480662E38)
            android.widget.TextView r6 = X.C36391kE.A0Q(r9, r0)
            r5 = 2131892597(0x7f121975, float:1.9419947E38)
            java.lang.Object[] r3 = new java.lang.Object[r4]
            X.0wQ r0 = r9.A02
            X.142 r0 = X.C36381kD.A0T(r0)
            java.lang.String r2 = X.AnonymousClass3U8.A03(r0)
            r0 = 0
            if (r2 == 0) goto L_0x004b
            r1 = 32
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.String r0 = r2.replace(r1, r0)
        L_0x004b:
            r2 = 0
            r3[r2] = r0
            X.C36341k9.A0s(r9, r6, r3, r5)
            X.0yb r0 = r9.A08
            android.telephony.TelephonyManager r3 = r0.A0K()
            X.0yE r1 = r9.A00
            java.lang.String r0 = "android.permission.SEND_SMS"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x00e2
            boolean r0 = r1.A0F()
            if (r0 == 0) goto L_0x00e2
            boolean r0 = X.C19600wD.A02(r9)
            if (r0 != 0) goto L_0x00e2
            if (r3 == 0) goto L_0x00e2
            int r1 = r3.getSimState()
            r0 = 5
            if (r1 != r0) goto L_0x00e2
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            if (r1 < r0) goto L_0x00e2
            java.lang.String r0 = "android.permission.READ_PHONE_STATE"
            int r0 = X.AnonymousClass00F.A01(r9, r0)
            if (r0 != 0) goto L_0x00e2
            X.9jn r0 = r9.A02
            java.util.List r3 = r0.A05(r9)
            int r1 = r3.size()
            r0 = 2
            if (r1 != r0) goto L_0x00e2
            r0 = 2131432784(0x7f0b1550, float:1.8487335E38)
            android.widget.TextView r5 = X.C36391kE.A0Q(r9, r0)
            com.whatsapp.jid.PhoneUserJid r1 = X.C36411kG.A0j(r9)
            java.lang.String r8 = X.C36401kF.A0s(r3, r2)
            java.lang.String r7 = X.C36401kF.A0s(r3, r4)
            if (r1 == 0) goto L_0x00dc
            java.lang.String r0 = r1.user
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00dc
            java.lang.String r3 = r1.user
            X.9jn r0 = r9.A02
            X.1N4 r1 = r0.A01
            X.AF7 r0 = r0.A02
            boolean r0 = X.C201529jn.A01(r1, r0, r8, r3)
            if (r0 != 0) goto L_0x00dc
            X.9jn r0 = r9.A02
            X.1N4 r1 = r0.A01
            X.AF7 r0 = r0.A02
            boolean r0 = X.C201529jn.A01(r1, r0, r7, r3)
            if (r0 == 0) goto L_0x0128
            r3 = 2131892598(0x7f121976, float:1.9419949E38)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            X.0wQ r0 = r9.A02
            X.142 r0 = X.C36381kD.A0T(r0)
            java.lang.String r0 = X.AnonymousClass3U8.A03(r0)
            r1[r2] = r0
            X.C36341k9.A0s(r9, r6, r1, r3)
        L_0x00dc:
            r0 = 2131892600(0x7f121978, float:1.9419953E38)
            r5.setText(r0)
        L_0x00e2:
            r0 = 2131432146(0x7f0b12d2, float:1.8486041E38)
            com.whatsapp.TextEmojiLabel r13 = X.C36421kH.A0I(r9, r0)
            X.0yC r15 = r9.A0D
            X.17Y r12 = r9.A05
            X.1Dv r11 = r9.A01
            X.0yb r14 = r9.A08
            r3 = 2131892463(0x7f1218ef, float:1.9419675E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            java.lang.String r1 = "learn-more"
            java.lang.String r16 = X.C36391kE.A0v(r9, r1, r0, r2, r3)
            java.lang.String r0 = "https://faq.whatsapp.com/general/payments/learn-more-about-sharing-the-legal-name-on-your-bank-account"
            android.net.Uri r10 = android.net.Uri.parse(r0)
            r17 = r1
            X.AnonymousClass6YV.A0E(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r13.setVisibility(r2)
            r0 = 2131435086(0x7f0b1e4e, float:1.8492004E38)
            android.view.View r1 = r9.findViewById(r0)
            r0 = 20
            X.C36421kH.A13(r1, r9, r0)
            X.AF7 r0 = r9.A0S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r1 = 0
            java.lang.String r4 = r9.A0b
            java.lang.String r6 = r9.A0e
            java.lang.String r5 = "verify_number"
            r3 = r1
            r0.A08(r1, r2, r3, r4, r5, r6)
            return
        L_0x0128:
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 != 0) goto L_0x00dc
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x00e2
            goto L_0x00dc
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.onCreate(android.os.Bundle):void");
    }

    public IndiaUpiSimVerificationActivity(int i) {
        this.A03 = false;
        B7Z.A00(this, 40);
    }

    public void A2x(int i) {
        if (!(i == R.string.f12nameremoved || i == R.string.f12nameremoved || i == R.string.f12nameremoved || i == R.string.f12nameremoved || i == R.string.f12nameremoved)) {
            A3v();
        }
        finish();
    }

    public void onBackPressed() {
        super.onBackPressed();
        this.A0S.A08((C131606Ps) null, 1, 1, this.A0b, "verify_number", this.A0e);
        if (!this.A0M.A0N()) {
            Intent A08 = AnonymousClass190.A08(this);
            A42(A08);
            A33(A08, true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        A43(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.menuitem_help) {
            C39001qm A002 = AnonymousClass3LW.A00(this);
            A002.A00.A0M(R.layout.f9nameremoved);
            C179128jE.A1M(A002, this, "verify_number", "payments:verify-number");
            return true;
        }
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onResume() {
        super.onResume();
        this.A01.A00.A08("verifyNumberShown");
    }

    public IndiaUpiSimVerificationActivity() {
        this(0);
    }
}
