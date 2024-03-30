package X;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog$Builder;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.9lE  reason: invalid class name and case insensitive filesystem */
public class C202199lE {
    public AnonymousClass17Y A00;
    public C19730wQ A01;
    public C19970wo A02;
    public C19420v0 A03;
    public C20310xM A04;
    public AnonymousClass16T A05;
    public C201269jE A06;
    public AnonymousClass1EZ A07;
    public C29221Vu A08;
    public C24601Db A09;
    public C29121Vk A0A;
    public C202939my A0B;
    public AnonymousClass1EV A0C;
    public AnonymousClass1XA A0D;
    public AnonymousClass1EU A0E;
    public AnonymousClass9SJ A0F;
    public AnonymousClass645 A0G;
    public C200049gU A0H;
    public C23075B3f A0I;
    public AnonymousClass6VG A0J;
    public C196039Xk A0K;
    public C29131Vl A0L;
    public AnonymousClass1VY A0M;
    public C19770wU A0N;

    public void A03(AnonymousClass155 r11, String str, String str2, boolean z) {
        C23075B3f b3f = this.A0I;
        C18740tg.A06(b3f);
        String str3 = str;
        b3f.BOm(0, (Integer) null, "prompt_warn_setup_without_recover", str);
        AnonymousClass155 r5 = r11;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(r11);
        alertDialog$Builder.setTitle(r11.getString(R.string.f12nameremoved));
        boolean equals = "receive_flow".equals(str);
        int i = R.string.f12nameremoved;
        if (equals) {
            i = R.string.f12nameremoved;
        }
        alertDialog$Builder.A0Z(r11.getString(i));
        alertDialog$Builder.A0S(new C204019pK(r5, this, str3, str2, z), r11.getString(R.string.f12nameremoved));
        alertDialog$Builder.A0Q(new B8E(1, str, this), r11.getString(R.string.f12nameremoved));
        alertDialog$Builder.A0b();
    }

    public static void A00(AnonymousClass155 r12, C202199lE r13) {
        C36341k9.A0u(C90494aF.A0E(r13.A09).remove("payment_account_recovered").remove("payment_account_recoverable"), "payment_account_recoverable_time_ms");
        AnonymousClass17Y r3 = r13.A00;
        C19770wU r11 = r13.A0N;
        C29131Vl r10 = r13.A0L;
        AnonymousClass1EU r9 = r13.A0E;
        AnonymousClass155 r2 = r12;
        new AnonymousClass9XR(r2, r3, r13.A04, r13.A08, r13.A09, r13.A0A, r13.A0D, r9, r10, r11).A00((AnonymousClass1XD) null);
    }

    public static void A01(AnonymousClass155 r14, C202199lE r15, String str, List list, int i, boolean z, boolean z2) {
        String str2;
        if (!z2) {
            r14.finish();
            return;
        }
        Intent A0F2 = C165597tg.A0F(r14);
        HashMap A0J2 = AnonymousClass001.A0J();
        int i2 = i;
        List list2 = list;
        if (!r15.A0J.A05() || r15.A0J.A02() == 1) {
            if (!r15.A0C.A02.A0E(2984) || i <= 0) {
                str2 = "brpay_p_add_card";
            } else if (i2 > 1) {
                JSONObject A032 = r15.A06.A03(list2);
                if (A032 != null) {
                    A0J2.put("cards", A032.toString());
                }
                A0J2.put("single_card", "false");
                str2 = "brpay_p_card_select_options";
            } else {
                C175858bB r1 = (C175858bB) C36391kE.A0t(list2);
                A0J2.put("credential_id", r1.A0H);
                A0J2.put("last4", r1.A0J);
                A0J2.put("single_card", "true");
                str2 = "brpay_p_add_cvv_card";
            }
            A0F2.putExtra("screen_name", str2);
        } else {
            A0F2.putExtra("screen_name", "brpay_p_add_biometric");
            A0J2.put("pin", str);
            if (i == 0) {
                A0J2.put("screen_open_after_bio", "show_add_card");
            } else if (i2 == 1) {
                C175858bB r12 = (C175858bB) C36391kE.A0t(list2);
                A0J2.put("credential_id", r12.A0H);
                A0J2.put("last4", r12.A0J);
                A0J2.put("screen_open_after_bio", "show_add_cvv_card");
                A0J2.put("single_card", "true");
            } else {
                A0J2.put("screen_open_after_bio", "show_select_card");
                JSONObject A033 = r15.A06.A03(list2);
                if (A033 != null) {
                    A0J2.put("cards", A033.toString());
                }
                A0J2.put("single_card", "false");
            }
        }
        A0J2.put("verification_needed", "1");
        A0F2.putExtra("screen_params", A0J2);
        r14.A33(A0F2, z);
    }

    public void A02(AnonymousClass155 r4, String str, String str2) {
        BrazilAccountRecoveryEligibilityBottomSheet brazilAccountRecoveryEligibilityBottomSheet = new BrazilAccountRecoveryEligibilityBottomSheet();
        Bundle A072 = AnonymousClass001.A07();
        A072.putString("referral_screen", str2);
        brazilAccountRecoveryEligibilityBottomSheet.A17(A072);
        brazilAccountRecoveryEligibilityBottomSheet.A06 = new C193559Ly(r4, this, str2, str);
        r4.Btm(brazilAccountRecoveryEligibilityBottomSheet);
    }

    public void A04(AnonymousClass155 r7, boolean z) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = new PinBottomSheetDialogFragment();
        pinBottomSheetDialogFragment.A08 = new C178728hA();
        pinBottomSheetDialogFragment.A0B = true;
        WDSButton wDSButton = pinBottomSheetDialogFragment.A0A;
        if (wDSButton != null) {
            wDSButton.setVisibility(8);
        }
        pinBottomSheetDialogFragment.A09 = new AGJ(r7, pinBottomSheetDialogFragment, this, z, true);
        r7.Btm(pinBottomSheetDialogFragment);
    }
}
