package X;

import android.content.SharedPreferences;
import com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel;

public class B8B implements AnonymousClass4TS {
    public Object A00;
    public final int A01;

    public static boolean A00(C19970wo r5, C167677yY r6, Integer num, String str) {
        C203049nB.A03(C203049nB.A01(r5, (AnonymousClass16X) null, (AnonymousClass6O3) null, str, false), r6.A09, num, "payment_home", (String) null, 1);
        return true;
    }

    public B8B(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BTs() {
        C167677yY r3;
        boolean z;
        SharedPreferences.Editor editor;
        String str;
        IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel;
        switch (this.A01) {
            case 0:
                C167677yY r32 = (C167677yY) this.A00;
                z = true;
                editor = C90494aF.A0E(r32.A07);
                str = "payment_brazil_nux_dismissed";
                r3 = r32;
                break;
            case 1:
                C167677yY r33 = (C167677yY) this.A00;
                z = A00(r33.A05, r33, 128, "warm_welcome_banner");
                editor = C90494aF.A0E(r33.A07);
                str = "payment_upi_warm_welcme_banner_dismissed_state";
                r3 = r33;
                break;
            case 2:
                C167677yY r34 = (C167677yY) this.A00;
                z = true;
                r34.A0U(1, 3);
                editor = C90494aF.A0E(r34.A07);
                str = "payments_home_account_recovery_banner_dismissed";
                r3 = r34;
                break;
            case 5:
                C167677yY r35 = (C167677yY) this.A00;
                z = A00(r35.A05, r35, 128, "scan_qr_code_banner");
                editor = C90494aF.A0E(r35.A07);
                str = "payments_home_scan_to_pay_banner_dismissed";
                r3 = r35;
                break;
            case 6:
                C167677yY r36 = (C167677yY) this.A00;
                z = A00(r36.A05, r36, 128, "recent_businesses");
                editor = C90494aF.A0E(r36.A07);
                str = "payments_home_explore_merchsnts_banner_dismissed";
                r3 = r36;
                break;
            case 7:
                C167677yY r37 = (C167677yY) this.A00;
                z = A00(r37.A05, r37, 128, "add_upi_number_banner");
                editor = C90494aF.A0E(r37.A07);
                str = "payments_home_add_upi_number_banner_dismissed";
                r3 = r37;
                break;
            case 8:
                IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel2 = (IndiaPaymentSettingsViewModel) this.A00;
                C36331k8.A0w(C90494aF.A0E(indiaPaymentSettingsViewModel2.A07.A01), "settingsQuickTipDismissedState", A00(indiaPaymentSettingsViewModel2.A05, indiaPaymentSettingsViewModel2, 128, "send_first_payment_banner"));
                indiaPaymentSettingsViewModel = indiaPaymentSettingsViewModel2;
                break;
            case 9:
                C167677yY r38 = (C167677yY) this.A00;
                z = true;
                editor = C90494aF.A0E(r38.A07);
                str = "payments_home_upi_video_banner_dismissed";
                r3 = r38;
                break;
            case 10:
                C167677yY r39 = (C167677yY) this.A00;
                z = true;
                editor = C90494aF.A0E(r39.A07);
                str = "payments_home_onboarding_banner_dismissed";
                r3 = r39;
                break;
            default:
                C167677yY r310 = (C167677yY) this.A00;
                r310.A0U(1, 3);
                indiaPaymentSettingsViewModel = r310;
                break;
        }
        editor.putBoolean(str, z).apply();
        indiaPaymentSettingsViewModel = r3;
        indiaPaymentSettingsViewModel.A01.A0C(new C201479jg(0));
    }

    public void BUz() {
        if (8 - this.A01 == 0) {
            IndiaPaymentSettingsViewModel indiaPaymentSettingsViewModel = (IndiaPaymentSettingsViewModel) this.A00;
            indiaPaymentSettingsViewModel.A07.A00 = true;
            indiaPaymentSettingsViewModel.A01.A0C(new C201479jg(0));
        }
    }
}
