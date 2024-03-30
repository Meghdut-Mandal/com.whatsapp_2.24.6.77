package com.whatsapp.payments.ui;

import X.A8P;
import X.AE0;
import X.AF7;
import X.AGZ;
import X.AVY;
import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00F;
import X.AnonymousClass01I;
import X.AnonymousClass142;
import X.AnonymousClass17Y;
import X.AnonymousClass190;
import X.AnonymousClass19A;
import X.AnonymousClass1MI;
import X.AnonymousClass1RY;
import X.AnonymousClass1XA;
import X.AnonymousClass1XD;
import X.AnonymousClass1YM;
import X.AnonymousClass2XG;
import X.AnonymousClass2lR;
import X.AnonymousClass3EU;
import X.AnonymousClass3IV;
import X.AnonymousClass3J9;
import X.AnonymousClass3M9;
import X.AnonymousClass3SJ;
import X.AnonymousClass3SY;
import X.AnonymousClass3UF;
import X.AnonymousClass6VG;
import X.AnonymousClass6YV;
import X.AnonymousClass736;
import X.AnonymousClass97K;
import X.AnonymousClass9FP;
import X.AnonymousClass9Q4;
import X.AnonymousClass9SJ;
import X.AnonymousClass9ZR;
import X.AnonymousClass9v1;
import X.BA9;
import X.C007103b;
import X.C012005e;
import X.C131606Ps;
import X.C135686d6;
import X.C1497372o;
import X.C165567td;
import X.C165577te;
import X.C165587tf;
import X.C165597tg;
import X.C165607th;
import X.C166437vo;
import X.C166467vu;
import X.C167527yC;
import X.C167677yY;
import X.C168057zd;
import X.C175818b6;
import X.C18740tg;
import X.C18820ts;
import X.C195029Se;
import X.C195479Ul;
import X.C19600wD;
import X.C196039Xk;
import X.C19730wQ;
import X.C197789cN;
import X.C19900wh;
import X.C19970wo;
import X.C200049gU;
import X.C201659k4;
import X.C202179lC;
import X.C202239lN;
import X.C202939my;
import X.C20310xM;
import X.C203449o2;
import X.C207249un;
import X.C207359uy;
import X.C20810yC;
import X.C21060yb;
import X.C21100yf;
import X.C21159AAt;
import X.C21667AUj;
import X.C225014r;
import X.C22972AzO;
import X.C23038B1j;
import X.C23215B9x;
import X.C24801Dv;
import X.C29131Vl;
import X.C36321k7;
import X.C36341k9;
import X.C36361kB;
import X.C36371kC;
import X.C36381kD;
import X.C36391kE;
import X.C36401kF;
import X.C36411kG;
import X.C36441kJ;
import X.C37851nJ;
import X.C50162kJ;
import X.C50762lX;
import X.C62053Eo;
import X.C63953Mb;
import X.C64073Mn;
import X.C64313Nm;
import X.C65443Sb;
import X.C74803mC;
import X.C87964Qw;
import X.C90464aC;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;
import com.whatsapp.payments.ui.widget.TransactionsExpandableView;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.banners.WDSBanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public class IndiaUpiPaymentSettingsFragment extends Hilt_IndiaUpiPaymentSettingsFragment implements C23038B1j, C22972AzO, C87964Qw {
    public View A00 = null;
    public View A01 = null;
    public View A02 = null;
    public View A03 = null;
    public C24801Dv A04;
    public C19600wD A05;
    public C50162kJ A06;
    public C21159AAt A07;
    public C21060yb A08;
    public C19900wh A09;
    public C20310xM A0A;
    public AnonymousClass19A A0B;
    public AE0 A0C;
    public C201659k4 A0D;
    public AnonymousClass1YM A0E;
    public A8P A0F;
    public AnonymousClass3EU A0G;
    public C202939my A0H;
    public AnonymousClass1XA A0I;
    public AnonymousClass9SJ A0J;
    public C195479Ul A0K;
    public C200049gU A0L;
    public AF7 A0M;
    public C202179lC A0N;
    public AnonymousClass6VG A0O;
    public C196039Xk A0P;
    public C167527yC A0Q;
    public C64313Nm A0R;
    public C168057zd A0S;
    public IndiaPaymentSettingsViewModel A0T;
    public C197789cN A0U;
    public C29131Vl A0V;
    public List A0W;
    public AnonymousClass1RY A0X;

    public void A1n(int i) {
        if (i == 3) {
            Intent A0G2 = C165597tg.A0G(A0i());
            A0G2.putExtra("extra_skip_value_props_display", false);
            A0G2.putExtra("extra_payments_entry_type", 9);
            Bundle bundle = this.A0A;
            if (bundle != null) {
                A0G2.putExtra("extra_deep_link_url", bundle.getParcelable("extra_deep_link_url"));
            }
            A1C(A0G2);
            return;
        }
        super.A1n(i);
    }

    public void BQr(boolean z) {
        boolean z2 = z;
        if (this.A0D.A09(this.A0C.A0B()) && this.A0U.A0D()) {
            PaymentBottomSheet paymentBottomSheet = new PaymentBottomSheet();
            paymentBottomSheet.A02 = new IndiaUpiAccountTypeSelectionFragment(new AGZ(this, paymentBottomSheet, z));
            C65443Sb.A03(paymentBottomSheet, A0h().getSupportFragmentManager(), "IndiaUpiAccountTypeSelectionFragment");
        } else if (z || this.A0C.A0O()) {
            A08(this, "settingsAddPayment", (String) null, 2, 5, z2, false);
        } else {
            A07(this, (String) null);
        }
    }

    public void Bl3() {
    }

    public boolean BtK() {
        return true;
    }

    public static String A03(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, String str) {
        JSONObject jSONObject;
        String A092 = indiaUpiPaymentSettingsFragment.A02.A09(3480);
        try {
            C18740tg.A06(A092);
            jSONObject = C36441kJ.A1C(A092);
        } catch (JSONException e) {
            Log.e("Error converting abProps to Json", e);
            jSONObject = C36441kJ.A1B();
        }
        try {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return jSONObject.getString("en");
        } catch (JSONException e2) {
            C90464aC.A1L("Error reading video suffix for language tag ", str, AnonymousClass000.A0u(), e2);
            return "X0-QiPD4kqs";
        }
    }

    public static void A06(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        boolean z;
        if (!indiaUpiPaymentSettingsFragment.A02.A0E(3740) || (!C36371kC.A1U(indiaUpiPaymentSettingsFragment.A0Z.A03(), "pref_p2m_hybrid_v2_tos_accepted") && indiaUpiPaymentSettingsFragment.A0v.size() <= 0)) {
            z = false;
        } else {
            z = true;
        }
        View view = indiaUpiPaymentSettingsFragment.A02;
        int i = 8;
        if (z) {
            i = 0;
        }
        view.setVisibility(i);
        indiaUpiPaymentSettingsFragment.A01.setVisibility(i);
        indiaUpiPaymentSettingsFragment.A03.setVisibility(i);
    }

    public void A1S(Bundle bundle, View view) {
        String str;
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel;
        View view2 = view;
        super.A1S(bundle, view2);
        new AnonymousClass9Q4(this.A0U).A00(A0i());
        this.A0X = this.A0M.A05(A1D(), "payment-settings");
        C168057zd r3 = new C168057zd(A1D(), (GridLayoutManager) this.A15.getLayoutManager(), this.A0X, this.A02, new AnonymousClass9FP(this), this.A0R.A02);
        this.A0S = r3;
        this.A15.setAdapter(r3);
        Bundle bundle2 = this.A0A;
        String str2 = null;
        if (bundle2 != null && bundle2.getBoolean("extra_send_to_upi_id", false)) {
            new C195029Se(A0i(), (C225014r) A0i(), this.A0F, this.A0G, "payment_home", false).A00((PaymentBottomSheet) null);
        }
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel2 = this.A0T;
        if (!(indiaPaymentSettingsViewModel2 == null || this.A06 == null)) {
            BA9.A00(this, indiaPaymentSettingsViewModel2.A01, 31);
            BA9.A00(this, this.A0T.A00, 32);
        }
        if (this.A0G.A09(C21100yf.A0i)) {
            ViewStub viewStub = (ViewStub) view2.findViewById(R.id.banner_viewstub);
            if (AnonymousClass1MI.A00(this.A02)) {
                viewStub.setLayoutResource(R.layout.f9nameremoved);
                viewStub.inflate();
                WDSBanner wDSBanner = (WDSBanner) view2.findViewById(R.id.banner);
                C62053Eo r8 = new C62053Eo();
                r8.A02 = new AnonymousClass2lR(new C50762lX(R.drawable.av_privacy));
                r8.A03 = C63953Mb.A00(view2.getContext(), R.string.f12nameremoved);
                r8.A05 = true;
                wDSBanner.setState(r8.A01());
                C36371kC.A1F(wDSBanner, this, view2, 32);
                wDSBanner.A06();
            } else {
                viewStub.setLayoutResource(R.layout.f9nameremoved);
                viewStub.inflate();
                C165567td.A0n(view2, R.id.privacy_banner_avatar, AnonymousClass00F.A00(A0a(), R.color.f6nameremoved));
                Context A0a = A0a();
                C20810yC r14 = this.A02;
                AnonymousClass17Y r11 = this.A0D;
                AnonymousClass6YV.A0E(A0a, Uri.parse("https://faq.whatsapp.com/general/payments/about-payments-data"), this.A04, r11, C36401kF.A0O(view2, R.id.payment_privacy_banner_text), this.A08, r14, A0o(R.string.f12nameremoved, "learn-more"), "learn-more");
                C36341k9.A10(view2, R.id.payment_privacy_banner, 0);
            }
        }
        this.A03 = C012005e.A02(view2, R.id.remove_account_container_separator);
        this.A02 = C012005e.A02(view2, R.id.remove_account_container);
        View A022 = C012005e.A02(view2, R.id.payment_row_remove_method);
        this.A01 = A022;
        C207359uy.A00(A022, this, 35);
        AnonymousClass3UF.A0E(C36401kF.A0G(view2, R.id.delete_payments_account_image), AnonymousClass00F.A00(A0a(), R.color.f6nameremoved));
        C36391kE.A0O(view2, R.id.delete_payments_account_text).setText(R.string.f12nameremoved);
        C202239lN r6 = this.A0l;
        if (bundle2 != null) {
            str = bundle2.getString("notification-type");
            str2 = bundle2.getString("step-up-id");
        } else {
            str = null;
        }
        r6.A07(str, str2);
        this.A16 = new C23215B9x(this, 1);
        View inflate = A0c().inflate(R.layout.f9nameremoved, this.A07, false);
        if (this.A07.getChildCount() > 0) {
            this.A07.removeAllViews();
        }
        this.A07.addView(inflate);
        this.A07.setVisibility(0);
        if (bundle2 != null && bundle2.getBoolean("extra_is_invalid_deep_link_url", false)) {
            AnonymousClass3SJ.A01(A0i(), 101);
        }
        if (this.A0C.A0N() && this.A0Z.A03().getInt("payments_upi_transactions_sync_status", 0) == 0 && (indiaPaymentSettingsViewModel = this.A0T) != null) {
            long j = indiaPaymentSettingsViewModel.A07.A03().getLong("payments_upi_last_transactions_sync_time", 0);
            if (j == 0 || C19970wo.A00(indiaPaymentSettingsViewModel.A05) - j > IndiaPaymentSettingsViewModel.A0D) {
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel3 = this.A0T;
                AnonymousClass736.A00(indiaPaymentSettingsViewModel3.A0A, indiaPaymentSettingsViewModel3, 1, Integer.valueOf(indiaPaymentSettingsViewModel3.A03.A07(1782)), 34);
            }
        }
        this.A0Q = (C167527yC) C36381kD.A0P(this).A00(C167527yC.class);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007a, code lost:
        r1 = r6.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x007c, code lost:
        if (r1 == null) goto L_0x0087;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x007e, code lost:
        r1.A0Z((X.AnonymousClass6O3) null, 36, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0087, code lost:
        r4 = X.C165597tg.A0G(A0i());
        r4.putExtra("extra_setup_mode", 2);
        r4.putExtra("extra_payments_entry_type", 5);
        r4.putExtra("extra_is_first_payment_method", true);
        r4.putExtra("extra_skip_value_props_display", true);
        r4.putExtra("extra_referral_screen", X.AnonymousClass000.A0p(".", "warm_welcome_banner", X.AnonymousClass000.A0v("payment_home")));
        r0 = "warmWelcomeBanner";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x015f, code lost:
        X.AnonymousClass3M9.A01(r4, r0);
        A1C(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0165, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01b0, code lost:
        A1C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x01b3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1q(java.lang.String r7) {
        /*
            r6 = this;
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r0 = r6.A0T
            X.C18740tg.A06(r0)
            int r0 = r0.A0c()
            r2 = 0
            switch(r0) {
                case 1: goto L_0x00dc;
                case 2: goto L_0x000e;
                case 3: goto L_0x000e;
                case 4: goto L_0x0012;
                case 5: goto L_0x011e;
                case 6: goto L_0x0061;
                case 7: goto L_0x0166;
                case 8: goto L_0x0195;
                case 9: goto L_0x00bd;
                case 10: goto L_0x007a;
                case 11: goto L_0x01b4;
                default: goto L_0x000d;
            }
        L_0x000d:
            return
        L_0x000e:
            r6.A1r(r7)
            return
        L_0x0012:
            X.7yY r1 = r6.A0m
            if (r1 == 0) goto L_0x001f
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0Y(r2, r0, r7)
        L_0x001f:
            X.01I r1 = r6.A0i()
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.class
            android.content.Intent r5 = X.C36441kJ.A0H(r1, r0)
            java.lang.String r3 = "add_upi_number_banner"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            java.lang.String r0 = "."
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r3, r1)
            java.lang.String r0 = "extra_referral_screen"
            r5.putExtra(r0, r1)
            X.6vT r4 = X.C146356vT.A00()
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            X.7vZ r0 = r6.A0j
            java.util.List r1 = r0.A00
            if (r1 == 0) goto L_0x0052
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0052
            java.lang.String r2 = X.C203449o2.A05(r1)
        L_0x0052:
            java.lang.String r0 = "accountHolderName"
            X.6c7 r1 = X.C165617ti.A0P(r4, r3, r2, r0)
            java.lang.String r0 = "extra_payment_name"
            r5.putExtra(r0, r1)
            r6.A1C(r5)
            return
        L_0x0061:
            X.7yY r1 = r6.A0m
            if (r1 == 0) goto L_0x006e
            r0 = 97
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0Y(r2, r0, r7)
        L_0x006e:
            X.1EZ r0 = r6.A0U
            boolean r0 = r0.A0D()
            if (r0 == 0) goto L_0x007a
            A05(r6)
            return
        L_0x007a:
            X.7yY r1 = r6.A0m
            if (r1 == 0) goto L_0x0087
            r0 = 36
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0Z(r2, r0, r7)
        L_0x0087:
            X.01I r0 = r6.A0i()
            android.content.Intent r4 = X.C165597tg.A0G(r0)
            r1 = 2
            java.lang.String r0 = "extra_setup_mode"
            r4.putExtra(r0, r1)
            r1 = 5
            java.lang.String r0 = "extra_payments_entry_type"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "extra_is_first_payment_method"
            r1 = 1
            r4.putExtra(r0, r1)
            java.lang.String r0 = "extra_skip_value_props_display"
            r4.putExtra(r0, r1)
            java.lang.String r2 = "warm_welcome_banner"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            java.lang.String r0 = "."
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r0 = "extra_referral_screen"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "warmWelcomeBanner"
            goto L_0x015f
        L_0x00bd:
            java.util.Locale r0 = X.AnonymousClass3SY.A02()
            java.lang.String r2 = r0.getLanguage()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0u()
            java.lang.String r0 = "https://youtu.be/"
            r1.append(r0)
            java.lang.String r0 = A03(r6, r2)
            java.lang.String r0 = X.AnonymousClass000.A0q(r0, r1)
            android.content.Intent r0 = X.C36331k8.A04(r0)
            goto L_0x01b0
        L_0x00dc:
            X.7yY r1 = r6.A0m
            if (r1 == 0) goto L_0x00e9
            r0 = 85
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.A0Z(r2, r0, r7)
        L_0x00e9:
            X.01I r0 = r6.A0i()
            android.content.Intent r4 = X.C165597tg.A0G(r0)
            r1 = 2
            java.lang.String r0 = "extra_setup_mode"
            r4.putExtra(r0, r1)
            r1 = 5
            java.lang.String r0 = "extra_payments_entry_type"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "extra_is_first_payment_method"
            r1 = 1
            r4.putExtra(r0, r1)
            java.lang.String r0 = "extra_skip_value_props_display"
            r4.putExtra(r0, r1)
            java.lang.String r2 = "finish_setup"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            java.lang.String r0 = "."
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r0 = "extra_referral_screen"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "resumeOnboardingBanner"
            goto L_0x015f
        L_0x011e:
            X.7yY r1 = r6.A0m
            r3 = 1
            if (r1 == 0) goto L_0x0128
            r0 = 139(0x8b, float:1.95E-43)
            r1.A0U(r3, r0)
        L_0x0128:
            X.01I r0 = r6.A0i()
            android.content.Intent r4 = X.C165597tg.A0G(r0)
            java.lang.String r0 = "extra_payments_entry_type"
            r4.putExtra(r0, r3)
            java.lang.String r2 = "notify_verification_banner"
            java.lang.String r0 = "payment_home"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0v(r0)
            java.lang.String r0 = "."
            java.lang.String r1 = X.AnonymousClass000.A0p(r0, r2, r1)
            java.lang.String r0 = "extra_referral_screen"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "extra_payment_flow_entry_point"
            r1 = 2
            r4.putExtra(r0, r1)
            java.lang.String r0 = "extra_setup_mode"
            r4.putExtra(r0, r1)
            java.lang.String r0 = "extra_is_first_payment_method"
            r4.putExtra(r0, r3)
            java.lang.String r0 = "extra_skip_value_props_display"
            r4.putExtra(r0, r3)
            java.lang.String r0 = "accountRecoveryBanner"
        L_0x015f:
            X.AnonymousClass3M9.A01(r4, r0)
            r6.A1C(r4)
            return
        L_0x0166:
            X.7yY r2 = r6.A0m
            if (r2 == 0) goto L_0x0170
            r1 = 1
            java.lang.String r0 = "recovery_upin_upsell_banner"
            r2.A0V(r1, r0)
        L_0x0170:
            X.1EU r0 = r6.A0e
            X.16S r0 = X.C165617ti.A0O(r0)
            X.9un r3 = r0.A06()
            X.8az r3 = (X.C175748az) r3
            X.C18740tg.A06(r3)
            X.01I r2 = r6.A0i()
            r1 = 0
            if (r3 == 0) goto L_0x0193
            X.8bF r0 = r3.A08
            if (r0 == 0) goto L_0x0193
            X.8b6 r0 = (X.C175818b6) r0
            java.lang.String r0 = r0.A0A
        L_0x018e:
            android.content.Intent r0 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0z(r2, r3, r0, r1)
            goto L_0x01b0
        L_0x0193:
            r0 = 0
            goto L_0x018e
        L_0x0195:
            X.7yY r2 = r6.A0m
            if (r2 == 0) goto L_0x019f
            r1 = 1
            java.lang.String r0 = "recovery_2fa_upsell_banner"
            r2.A0V(r1, r0)
        L_0x019f:
            X.01I r2 = r6.A0i()
            int[] r1 = X.C36441kJ.A1O()
            r1 = {1, 2} // fill-array
            java.lang.String r0 = "CONTINUE"
            android.content.Intent r0 = X.AnonymousClass190.A1N(r2, r0, r1)
        L_0x01b0:
            r6.A1C(r0)
            return
        L_0x01b4:
            X.7yY r1 = r6.A0m
            if (r1 == 0) goto L_0x01dc
            java.lang.String r4 = "recent_businesses"
            r0 = 1
            X.B3f r3 = r1.A09
            X.8cT r2 = r3.B4W()
            X.C176658cT.A02(r2, r0)
            java.lang.String r1 = "payment_home"
            r2.A0b = r1
            java.lang.Object[] r0 = X.AnonymousClass001.A0M()
            X.C90494aF.A1H(r1, r4, r0)
            X.6Ps r0 = X.C176658cT.A01(r2, r4, r0)
            java.lang.String r0 = r0.toString()
            r2.A0Z = r0
            r3.BOl(r2)
        L_0x01dc:
            r6.A1u()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment.A1q(java.lang.String):void");
    }

    public void A1u() {
        if (this.A02.A0E(7019)) {
            AVY.A00(this.A0t, this, 33);
        }
        Intent A0H2 = C36441kJ.A0H(A1D(), IndiaUpiContactPicker.class);
        A0H2.putExtra("for_payment_merchants", true);
        A1C(A0H2);
    }

    public String BEC(C207249un r2) {
        C175818b6 r0 = (C175818b6) r2.A08;
        if (r0 != null && !C175818b6.A00(r0)) {
            return A0n(R.string.f12nameremoved);
        }
        if (C201659k4.A01(this.A0v)) {
            return "";
        }
        return super.BEC(r2);
    }

    public void BV6(String str) {
        TransactionsExpandableView transactionsExpandableView = this.A19;
        transactionsExpandableView.post(new C1497372o(transactionsExpandableView, 15));
        TransactionsExpandableView transactionsExpandableView2 = this.A18;
        transactionsExpandableView2.post(new C1497372o(transactionsExpandableView2, 15));
    }

    public void Bq3(boolean z) {
        C202239lN r0;
        View view = this.A0F;
        if (view != null) {
            ViewGroup A0O2 = C36411kG.A0O(view, R.id.action_required_container);
            int i = 0;
            if (this.A00 == null && (r0 = this.A0l) != null) {
                if (r0.A08.A04() != null) {
                    this.A0R.A05(AnonymousClass97K.A00(this.A0O, this.A0l.A08.A04()));
                }
                if (!this.A0R.A04().isEmpty()) {
                    A0O2.removeAllViews();
                    C166467vu r4 = new C166467vu(A0a());
                    ArrayList A042 = this.A0R.A04();
                    r4.A00(new AnonymousClass3J9(new C74803mC(this), (C21667AUj) C007103b.A0X(A042).get(0), A042.size()));
                    A0O2.addView(r4);
                    this.A00 = A0O2;
                }
            }
            if (!z) {
                i = 8;
            }
            A0O2.setVisibility(i);
        }
    }

    public void Bww(List list) {
        this.A0N.A05(list);
        super.Bww(list);
        C167677yY r2 = this.A0m;
        if (r2 != null) {
            r2.A03 = list;
            r2.A0X(this.A0h, this.A0n);
        }
    }

    public void Bx7(List list) {
        this.A0l.A04();
        this.A0N.A05(list);
        super.Bx7(list);
        C167677yY r2 = this.A0m;
        if (r2 != null) {
            r2.A04 = list;
            r2.A0X(this.A0h, this.A0n);
        }
    }

    public static void A05(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment) {
        Intent A0H2 = C36441kJ.A0H(indiaUpiPaymentSettingsFragment.A0i(), IndiaUpiQrTabActivity.class);
        if (indiaUpiPaymentSettingsFragment.A0U.A0D()) {
            A0H2.putExtra("extra_account_holder_name", C203449o2.A05(indiaUpiPaymentSettingsFragment.A0v));
        }
        indiaUpiPaymentSettingsFragment.A1C(A0H2);
    }

    public static void A07(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, String str) {
        Intent A082 = AnonymousClass190.A08(indiaUpiPaymentSettingsFragment.A1D());
        A082.putExtra("extra_payments_entry_type", 5);
        A082.putExtra("extra_skip_value_props_display", true);
        A082.putExtra("extra_is_first_payment_method", false);
        if (str != null) {
            A082.putExtra("extra_payment_method_type", str);
            A082.putExtra("extra_referral_screen", "add_credit_card");
        }
        indiaUpiPaymentSettingsFragment.startActivityForResult(A082, 1008);
    }

    public static void A08(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, String str, String str2, int i, int i2, boolean z, boolean z2) {
        Intent A0G2 = C165597tg.A0G(indiaUpiPaymentSettingsFragment.A1D());
        A0G2.putExtra("extra_setup_mode", i);
        C165607th.A18(A0G2, "extra_payments_entry_type", i2, z, z2);
        if (indiaUpiPaymentSettingsFragment.A0D.A08(str2)) {
            A0G2.putExtra("extra_payment_method_type", "CREDIT");
            A0G2.putExtra("extra_referral_screen", "add_credit_card");
        }
        AnonymousClass3M9.A01(A0G2, str);
        indiaUpiPaymentSettingsFragment.A1C(A0G2);
    }

    public static void A09(IndiaUpiPaymentSettingsFragment indiaUpiPaymentSettingsFragment, List list) {
        AnonymousClass01I A0h = indiaUpiPaymentSettingsFragment.A0h();
        if (A0h != null && !A0h.isFinishing()) {
            list.size();
            boolean isEmpty = list.isEmpty();
            View view = indiaUpiPaymentSettingsFragment.A04;
            if (isEmpty) {
                view.setVisibility(8);
                indiaUpiPaymentSettingsFragment.A0A.setVisibility(8);
                return;
            }
            view.setVisibility(0);
            indiaUpiPaymentSettingsFragment.A0A.setVisibility(0);
            int size = list.size();
            C131606Ps r4 = new C131606Ps((String) null, new C131606Ps[0]);
            r4.A04("recent_merchant_displayed", true);
            r4.A02("number_merchant_displayed", size);
            indiaUpiPaymentSettingsFragment.A0M.BOp(r4, 0, (Integer) null, "payment_home", (String) null);
            C168057zd r1 = indiaUpiPaymentSettingsFragment.A0S;
            List list2 = r1.A00;
            list2.clear();
            list2.addAll(list);
            r1.A06();
        }
    }

    public void A1B() {
        super.A1B();
        this.A0N.A03(this);
    }

    public void A1K() {
        super.A1K();
        this.A0Z.A0O(false);
        AVY.A00(this.A0t, this, 9);
    }

    public void A1L() {
        super.A1L();
        this.A0Z.A0O(false);
        AVY.A00(this.A0t, this, 10);
        this.A0l.A04();
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = this.A0T;
        if (indiaPaymentSettingsViewModel != null) {
            boolean A0d = indiaPaymentSettingsViewModel.A0d();
            C36341k9.A19(indiaPaymentSettingsViewModel.A01, A0d);
            if (A0d) {
                AVY.A00(indiaPaymentSettingsViewModel.A0A, indiaPaymentSettingsViewModel, 47);
            }
        }
        A06(this);
    }

    public void A1M() {
        super.A1M();
        C202179lC r1 = this.A0N;
        r1.A00.clear();
        r1.A02.add(AnonymousClass001.A0F(this));
    }

    public void A1N(int i, int i2, Intent intent) {
        super.A1N(i, i2, intent);
        if (i != 1008) {
            if (i != 1009) {
                return;
            }
            if (i2 == -1 && intent != null && intent.getIntExtra("extra_remove_payment_account", 0) >= 1) {
                if (intent.getIntExtra("extra_remove_payment_account", 0) == 2) {
                    Intent A0G2 = C165597tg.A0G(A1D());
                    A0G2.putExtra("extra_setup_mode", 2);
                    A1C(A0G2);
                    return;
                }
                C36341k9.A15(this);
                return;
            }
        }
        this.A0k.A00(false);
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        this.A0R = new C64313Nm(this.A02);
    }

    public boolean A1X(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menuitem_scan_qr) {
            return super.A1X(menuItem);
        }
        A1C(C36441kJ.A0H(A1D(), IndiaUpiQrCodeScanActivity.class));
        return true;
    }

    public C37851nJ B8G() {
        JSONObject jSONObject;
        Context A1D = A1D();
        C18820ts r6 = this.A01;
        String language = AnonymousClass3SY.A02().getLanguage();
        ArrayList A0I2 = AnonymousClass001.A0I();
        String A092 = this.A02.A09(3480);
        try {
            C18740tg.A06(A092);
            jSONObject = C36441kJ.A1C(A092);
        } catch (JSONException e) {
            Log.e("Error converting abProps to Json", e);
            jSONObject = C36441kJ.A1B();
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String A0C2 = AnonymousClass001.A0C(keys);
            if (language.equals(A0C2)) {
                A0I2.add(0, new AnonymousClass3IV(AnonymousClass9ZR.A01(Locale.forLanguageTag(A0C2)), A0C2));
            } else {
                A0I2.add(new AnonymousClass3IV(AnonymousClass9ZR.A01(Locale.forLanguageTag(A0C2)), A0C2));
            }
        }
        return new AnonymousClass2XG(A1D, r6, A0I2);
    }

    public void BcR(C207249un r3) {
        startActivityForResult(C165577te.A0I(A1D(), r3, IndiaUpiBankAccountDetailsActivity.class), 1009);
    }

    public void Bwm(List list) {
        String str;
        super.Bwm(list);
        if (A12() && A0h() != null) {
            C166437vo r4 = new C166437vo(A0a());
            r4.setBackgroundColor(C36341k9.A0G(this).getColor(C36411kG.A01(A1D())));
            C36321k7.A0N(r4);
            C207359uy.A00(r4.A05, this, 36);
            C207359uy.A00(r4.A04, this, 37);
            this.A08.removeAllViews();
            if (this.A0U.A0D() || this.A0C.A0N()) {
                List list2 = this.A0j.A00;
                if (list2 == null || list2.isEmpty()) {
                    str = null;
                } else {
                    str = C203449o2.A05(list2);
                }
                String A002 = AE0.A00(this.A0C);
                if (TextUtils.isEmpty(str)) {
                    str = this.A09.A02();
                    this.A0b.A0A((AnonymousClass1XD) null, C165587tf.A0W(this.A0e));
                }
                boolean A003 = C64073Mn.A00(this.A02, this.A0C.A0B());
                C19730wQ r0 = this.A0E;
                r0.A0G();
                AnonymousClass142 r02 = r0.A0E;
                if (A003) {
                    r4.A00(r02, str, A002);
                    ImageView imageView = r4.A01;
                    imageView.setVisibility(0);
                    imageView.setColorFilter(r4.getResources().getColor(R.color.f6nameremoved));
                    TypedValue typedValue = new TypedValue();
                    C36361kB.A09(r4).resolveAttribute(16843534, typedValue, true);
                    LinearLayout linearLayout = r4.A03;
                    linearLayout.setBackgroundResource(typedValue.resourceId);
                    linearLayout.setOnClickListener(new AnonymousClass9v1(18, str, this));
                } else {
                    r4.A00(r02, str, A002);
                    r4.A03.setOnLongClickListener(new C135686d6(this, A002));
                }
            }
            this.A08.addView(r4);
            this.A08.setVisibility(0);
            this.A03.setVisibility(0);
            A06(this);
        }
    }
}
