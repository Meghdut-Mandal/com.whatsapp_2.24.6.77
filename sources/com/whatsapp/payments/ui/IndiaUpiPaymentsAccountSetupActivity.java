package com.whatsapp.payments.ui;

import X.AnonymousClass000;
import X.AnonymousClass1XC;
import X.AnonymousClass1XE;
import X.AnonymousClass1Z2;
import X.AnonymousClass7hE;
import X.B7Z;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C173858Tk;
import X.C179128jE;
import X.C18800tq;
import X.C18830tt;
import X.C23157B7r;
import X.C24611Dc;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import android.os.Bundle;
import com.whatsapp.R;

public class IndiaUpiPaymentsAccountSetupActivity extends C179128jE {
    public AnonymousClass1XE A00;
    public AnonymousClass1Z2 A01;
    public AnonymousClass1XC A02;
    public boolean A03;
    public final C24611Dc A04;
    public final AnonymousClass7hE A05;

    private boolean A11(int i) {
        if (i == 2 || i == 3 || i == 6 || i == 7 || i == 8 || i == 10 || i == 11) {
            return false;
        }
        if (i == 14) {
            return !getIntent().getBooleanExtra("extra_show_bottom_sheet_props", false);
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005d, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L_0x005f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0z(com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity r6) {
        /*
            X.0v0 r0 = r6.A09
            r3 = 1
            android.content.SharedPreferences$Editor r1 = X.C19420v0.A00(r0)
            java.lang.String r0 = "payments_onboarding_banner_registration_started"
            X.C36331k8.A0w(r1, r0, r3)
            X.1EZ r0 = r6.A0I
            X.1Ea r4 = r0.A03()
            boolean r0 = r6.A0l
            if (r0 == 0) goto L_0x00c7
            boolean r0 = r6.A0o
            if (r0 != 0) goto L_0x00c7
            X.1Db r0 = r6.A0P
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 != 0) goto L_0x00c7
            X.0yC r1 = r6.A0D
            r0 = 2974(0xb9e, float:4.167E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x003a
            int r0 = r6.A02
            boolean r0 = r6.A11(r0)
            if (r0 != 0) goto L_0x00c7
        L_0x003a:
            int r0 = r6.A02
            boolean r0 = r6.A11(r0)
            if (r0 == 0) goto L_0x00c3
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsActivity.class
        L_0x0044:
            android.content.Intent r5 = X.C36441kJ.A0H(r6, r0)
            int r1 = r6.A03
            java.lang.String r0 = "extra_setup_mode"
            r5.putExtra(r0, r1)
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r1 = X.C165597tg.A0j(r6)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x00a1
        L_0x005f:
            X.C165597tg.A0z(r5, r1)
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x0075
            android.content.Intent r0 = r6.getIntent()
            java.lang.String r1 = "extra_deep_link_url"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            r5.putExtra(r1, r0)
        L_0x0075:
            r6.A42(r5)
            java.lang.String r1 = r6.A0b
            java.lang.String r0 = "extra_previous_screen"
            r5.putExtra(r0, r1)
            android.content.Intent r0 = r6.getIntent()
            if (r0 == 0) goto L_0x009d
            android.content.Intent r4 = r6.getIntent()
            r0 = -1
            java.lang.String r2 = "perf_start_time_ns"
            long r0 = r4.getLongExtra(r2, r0)
            r5.putExtra(r2, r0)
            android.content.Intent r1 = r6.getIntent()
            java.lang.String r0 = "perf_origin"
            X.C165597tg.A0y(r1, r5, r0)
        L_0x009d:
            r6.A33(r5, r3)
        L_0x00a0:
            return
        L_0x00a1:
            int r0 = r6.A02
            switch(r0) {
                case 1: goto L_0x00a8;
                case 2: goto L_0x00ab;
                case 3: goto L_0x00ab;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00ae;
                case 6: goto L_0x00b1;
                case 7: goto L_0x00b4;
                case 8: goto L_0x00b7;
                case 9: goto L_0x00ba;
                case 10: goto L_0x00bd;
                case 11: goto L_0x00c0;
                case 12: goto L_0x00ae;
                case 13: goto L_0x00ae;
                default: goto L_0x00a6;
            }
        L_0x00a6:
            r1 = 0
            goto L_0x005f
        L_0x00a8:
            java.lang.String r1 = "in_app_banner"
            goto L_0x005f
        L_0x00ab:
            java.lang.String r1 = "chat"
            goto L_0x005f
        L_0x00ae:
            java.lang.String r1 = "payment_home"
            goto L_0x005f
        L_0x00b1:
            java.lang.String r1 = "new_payment"
            goto L_0x005f
        L_0x00b4:
            java.lang.String r1 = "payment_bank_account_details"
            goto L_0x005f
        L_0x00b7:
            java.lang.String r1 = "qr_code_scan_prompt"
            goto L_0x005f
        L_0x00ba:
            java.lang.String r1 = "deeplink"
            goto L_0x005f
        L_0x00bd:
            java.lang.String r1 = "payment_composer_icon"
            goto L_0x005f
        L_0x00c0:
            java.lang.String r1 = "order_details"
            goto L_0x005f
        L_0x00c3:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsValuePropsBottomSheetActivity.class
            goto L_0x0044
        L_0x00c7:
            if (r4 != 0) goto L_0x00e5
            X.1Dc r1 = r6.A04
            java.lang.String r0 = "showNextStep is already complete"
            r1.A06(r0)
            X.1Z2 r0 = r6.A01
            r0.A00()
            X.1Db r0 = r6.A0P
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r0)
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            X.C36331k8.A0w(r1, r0, r2)
            r6.A10(r3)
            return
        L_0x00e5:
            X.1Dc r2 = r6.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "showNextStep: "
            X.C165567td.A16(r2, r4, r0, r1)
            X.1Ea r0 = X.AnonymousClass1EY.A05
            if (r4 != r0) goto L_0x00fe
            r1 = 0
            java.lang.String r0 = "Unset step"
            r2.A0A(r0, r1)
            r6.finish()
            return
        L_0x00fe:
            java.lang.String r0 = "tos_with_wallet"
            java.lang.String r1 = r4.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = "tos_no_wallet"
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x011e
            java.lang.String r0 = "add_card"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0131
            java.lang.String r0 = "showAddCard not implemented"
            r2.A06(r0)
            return
        L_0x011e:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity.class
            android.content.Intent r2 = X.C36441kJ.A0H(r6, r0)
            java.lang.String r0 = "stepName"
            r2.putExtra(r0, r1)
            int r1 = r6.A03
            java.lang.String r0 = "extra_setup_mode"
            r2.putExtra(r0, r1)
            goto L_0x015f
        L_0x0131:
            java.lang.String r0 = "add_bank"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x018c
            X.1Db r0 = r6.A0P
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "payment_account_recovered"
            boolean r0 = X.C36371kC.A1U(r1, r0)
            if (r0 == 0) goto L_0x0159
            X.AE0 r2 = r6.A0M
            java.lang.String r1 = r2.A0B()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x016d
            boolean r0 = X.AE0.A05(r2, r1)
            if (r0 == 0) goto L_0x016d
        L_0x0159:
            r6.A0k = r3
            android.content.Intent r2 = X.AnonymousClass190.A08(r6)
        L_0x015f:
            r6.A42(r2)
            java.lang.String r1 = r6.A0b
            java.lang.String r0 = "extra_previous_screen"
            r2.putExtra(r0, r1)
            r6.A33(r2, r3)
            return
        L_0x016d:
            X.0yC r1 = r6.A0D
            r0 = 1644(0x66c, float:2.304E-42)
            boolean r0 = r1.A0E(r0)
            if (r0 == 0) goto L_0x0159
            int r1 = r6.A02
            r0 = 2
            if (r1 == r0) goto L_0x0189
            r0 = 3
            if (r1 == r0) goto L_0x0189
            r0 = 6
            if (r1 == r0) goto L_0x0189
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoActivity.class
        L_0x0184:
            android.content.Intent r2 = X.C36441kJ.A0H(r6, r0)
            goto L_0x015f
        L_0x0189:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity> r0 = com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity.class
            goto L_0x0184
        L_0x018c:
            java.lang.String r0 = "2fa"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00a0
            X.1Db r0 = r6.A0P
            r2 = 0
            android.content.SharedPreferences$Editor r1 = X.C90494aF.A0E(r0)
            java.lang.String r0 = "payments_home_onboarding_banner_dismissed"
            X.C36331k8.A0w(r1, r0, r2)
            X.1Z2 r0 = r6.A01
            r0.A00()
            int r0 = r6.A03
            if (r0 != r3) goto L_0x01bd
            X.9k4 r1 = r6.A0N
            X.8az r0 = r6.A0A
            boolean r0 = r1.A05(r0)
            if (r0 == 0) goto L_0x01c1
            java.lang.String r1 = r6.A0b
            java.lang.String r0 = "nav_select_account"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x01c1
        L_0x01bd:
            r6.A10(r2)
            return
        L_0x01c1:
            r6.A0k = r3
            X.8az r1 = r6.A0A
            java.lang.String r0 = r6.A0a
            android.content.Intent r2 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0z(r6, r1, r0, r2)
            goto L_0x015f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.A0z(com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0034, code lost:
        if (r0.equals(r1) != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A10(boolean r5) {
        /*
            r4 = this;
            X.1Dc r2 = r4.A04
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "showCompleteAndFinish "
            java.lang.String r0 = X.C36371kC.A0z(r0, r1, r5)
            r2.A06(r0)
            r4.Bnv()
            X.1XE r1 = r4.A00
            X.AEG r0 = new X.AEG
            r0.<init>(r4)
            r1.A00(r0)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity> r0 = com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity.class
            android.content.Intent r3 = X.C36441kJ.A0H(r4, r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r2 = "referral_screen"
            java.lang.String r0 = r0.getStringExtra(r2)
            if (r0 == 0) goto L_0x0044
            java.lang.String r1 = "setup_pin"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0044
        L_0x0036:
            r3.putExtra(r2, r1)
            r4.A42(r3)
            java.lang.String r1 = r4.A0b
            java.lang.String r0 = "extra_previous_screen"
            X.C165587tf.A0u(r3, r4, r0, r1)
            return
        L_0x0044:
            java.lang.String r1 = "nav_select_account"
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.A10(boolean):void");
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
            this.A02 = (AnonymousClass1XC) r2.A6F.get();
            this.A01 = (AnonymousClass1Z2) r2.AVu.get();
            this.A00 = (AnonymousClass1XE) r2.AVt.get();
        }
    }

    public IndiaUpiPaymentsAccountSetupActivity(int i) {
        this.A03 = false;
        B7Z.A00(this, 28);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setTitle(R.string.f12nameremoved);
    }

    public void onResume() {
        super.onResume();
        C24611Dc r2 = this.A04;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("onResume payment setup with mode: ");
        C165577te.A1D(r2, A0u, this.A03);
        if (!isFinishing() && !this.A01.A02(this.A05)) {
            A0z(this);
        }
    }

    public IndiaUpiPaymentsAccountSetupActivity() {
        this(0);
        this.A05 = new C23157B7r(this, 1);
        this.A04 = C165587tf.A0X("IndiaUpiPaymentsAccountSetupActivity");
    }
}
