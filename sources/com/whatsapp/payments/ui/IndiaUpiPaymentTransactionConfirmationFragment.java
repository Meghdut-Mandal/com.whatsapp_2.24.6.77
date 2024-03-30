package com.whatsapp.payments.ui;

import X.AF7;
import X.AnonymousClass14B;
import X.AnonymousClass16U;
import X.AnonymousClass16V;
import X.AnonymousClass16W;
import X.AnonymousClass16X;
import X.AnonymousClass1Q0;
import X.BA9;
import X.C012005e;
import X.C131606Ps;
import X.C135086c7;
import X.C165567td;
import X.C175818b6;
import X.C175898bF;
import X.C175928bI;
import X.C176658cT;
import X.C18740tg;
import X.C18820ts;
import X.C19630wG;
import X.C19970wo;
import X.C200399hL;
import X.C207249un;
import X.C207359uy;
import X.C20810yC;
import X.C23029B1a;
import X.C36361kB;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.HashMap;

public class IndiaUpiPaymentTransactionConfirmationFragment extends Hilt_IndiaUpiPaymentTransactionConfirmationFragment {
    public TextView A00;
    public TextView A01;
    public TextView A02;
    public LottieAnimationView A03;
    public C19970wo A04;
    public C19630wG A05;
    public C18820ts A06;
    public C20810yC A07;
    public C135086c7 A08;
    public AF7 A09;
    public C23029B1a A0A;
    public AnonymousClass1Q0 A0B;
    public WDSButton A0C;
    public WDSButton A0D;
    public String A0E;
    public IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel A0F;
    public String A0G;

    public static void A00(IndiaUpiPaymentTransactionConfirmationFragment indiaUpiPaymentTransactionConfirmationFragment, String str, int i, int i2) {
        C176658cT B4W = indiaUpiPaymentTransactionConfirmationFragment.A09.B4W();
        C176658cT.A02(B4W, i);
        B4W.A0Y = "payment_confirm_prompt";
        B4W.A0b = "payments_transaction_confirmation";
        B4W.A0a = indiaUpiPaymentTransactionConfirmationFragment.A0G;
        if (!AnonymousClass14B.A0F(str)) {
            C131606Ps A0F2 = C165567td.A0F();
            A0F2.A03("transaction_status", str);
            B4W.A0Z = A0F2.toString();
        }
        if (i == 1) {
            B4W.A07 = Integer.valueOf(i2);
        }
        indiaUpiPaymentTransactionConfirmationFragment.A09.BOl(B4W);
    }

    public void A1S(Bundle bundle, View view) {
        C175818b6 r9;
        Bundle bundle2 = this.A0A;
        View view2 = view;
        this.A03 = (LottieAnimationView) C012005e.A02(view2, R.id.lottie_animation);
        TextView A0O = C36391kE.A0O(view2, R.id.amount);
        this.A02 = C36391kE.A0O(view2, R.id.status);
        this.A01 = C36391kE.A0O(view2, R.id.name);
        this.A0D = C36431kI.A0y(view2, R.id.view_details_button);
        this.A0C = C36431kI.A0y(view2, R.id.done_button);
        this.A00 = C36391kE.A0O(view2, R.id.date);
        if (bundle2 != null) {
            AnonymousClass16U r8 = AnonymousClass16W.A05;
            C175928bI r5 = (C175928bI) bundle2.getParcelable("extra_country_transaction_data");
            AnonymousClass16X r14 = (AnonymousClass16X) bundle2.getParcelable("extra_transaction_send_amount");
            C207249un r6 = (C207249un) bundle2.getParcelable("extra_payment_method");
            String string = bundle2.getString("extra_encrypted_interop_description");
            this.A08 = (C135086c7) bundle2.getParcelable("extra_payee_name");
            C135086c7 r2 = (C135086c7) bundle2.getParcelable("extra_receiver_vpa");
            C135086c7 r4 = (C135086c7) bundle2.getParcelable("extra_payment_upi_number");
            String string2 = bundle2.getString("extra_merchant_code");
            String string3 = bundle2.getString("extra_transaction_ref");
            String string4 = bundle2.getString("extra_transaction_ref_url");
            String string5 = bundle2.getString("extra_purpose_code");
            String string6 = bundle2.getString("extra_initiation_mode");
            this.A0E = bundle2.getString("extra_transaction_id");
            String string7 = bundle2.getString("extra_transaction_type");
            this.A0G = bundle2.getString("referral_screen");
            if (r6 != null) {
                C175898bF r92 = r6.A08;
                C18740tg.A06(r92);
                r9 = (C175818b6) r92;
            } else {
                r9 = null;
            }
            C207359uy.A00(this.A0D, this, 40);
            C207359uy.A00(this.A0C, this, 41);
            C207359uy.A00(C012005e.A02(view2, R.id.close), this, 42);
            if (r14 != null && r9 != null && r6 != null) {
                this.A03.setAnimation("transaction_confirmation_lottie_animation.json");
                A0O.setText(r8.B7d(this.A06, r14));
                IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel = this.A0F;
                C135086c7 r15 = r9.A05;
                String str = r6.A0A;
                String str2 = ((AnonymousClass16V) r8).A02;
                C135086c7 r62 = this.A08;
                boolean equals = "p2m".equals(string7);
                String str3 = this.A0E;
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A06 = r5;
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A03 = r14;
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A09 = string;
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A04 = r62;
                indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A05 = r2;
                HashMap hashMap = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0C.A08;
                if (hashMap != null) {
                    C135086c7 r17 = r4;
                    C135086c7 r16 = r62;
                    indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0E.A00(r14, r15, r16, r17, r5, indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0D, new C200399hL(indiaUpiPaymentTransactionConfirmationBottomSheetViewModel, 1), str, str2, string3, string2, string4, string5, string6, str3, string, (String) null, hashMap, equals);
                }
            }
        }
    }

    public void A19() {
        super.A19();
        this.A0A = null;
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel indiaUpiPaymentTransactionConfirmationBottomSheetViewModel = (IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel) C36441kJ.A0b(this).A00(IndiaUpiPaymentTransactionConfirmationBottomSheetViewModel.class);
        this.A0F = indiaUpiPaymentTransactionConfirmationBottomSheetViewModel;
        BA9.A01(A0m(), indiaUpiPaymentTransactionConfirmationBottomSheetViewModel.A0F.A00, this, 33);
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }
}
