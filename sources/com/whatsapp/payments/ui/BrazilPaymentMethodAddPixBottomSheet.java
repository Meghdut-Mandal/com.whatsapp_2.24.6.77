package com.whatsapp.payments.ui;

import X.AVX;
import X.AWL;
import X.AnonymousClass00C;
import X.AnonymousClass016;
import X.AnonymousClass01I;
import X.AnonymousClass0BN;
import X.AnonymousClass17Y;
import X.B7U;
import X.BA9;
import X.C012005e;
import X.C102374zt;
import X.C10810fG;
import X.C131606Ps;
import X.C165567td;
import X.C176658cT;
import X.C195959Wy;
import X.C20380xT;
import X.C207489vI;
import X.C20810yC;
import X.C21060yb;
import X.C22478AnH;
import X.C22479AnI;
import X.C22480AnJ;
import X.C22481AnK;
import X.C23075B3f;
import X.C24801Dv;
import X.C32681e1;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C36391kE;
import X.C36421kH;
import X.C36441kJ;
import X.C48752hz;
import X.C89574Xb;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableString;
import android.view.View;
import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.WaEditText;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import java.util.List;

public final class BrazilPaymentMethodAddPixBottomSheet extends Hilt_BrazilPaymentMethodAddPixBottomSheet {
    public C24801Dv A00;
    public AnonymousClass17Y A01;
    public C21060yb A02;
    public C20810yC A03;
    public C23075B3f A04;
    public BrazilAddPixKeyViewModel A05;
    public C20380xT A06;
    public C32681e1 A07;
    public String A08;

    public void A1S(Bundle bundle, View view) {
        String str;
        View view2 = view;
        AnonymousClass00C.A0D(view2, 0);
        super.A1S(bundle, view2);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            str = bundle2.getString("referral_screen");
        } else {
            str = null;
        }
        this.A08 = str;
        C36391kE.A1I(C012005e.A02(view2, R.id.close_button), this, 18);
        C36391kE.A1I(C012005e.A02(view2, R.id.learn_more_text), this, 19);
        TextEmojiLabel A0O = C36351kA.A0O(view2, R.id.br_bottom_sheet_add_pix_disclaimer_text_view);
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = this.A05;
        if (brazilAddPixKeyViewModel == null) {
            throw C36331k8.A0d("brazilAddPixKeyViewModel");
        }
        if (brazilAddPixKeyViewModel.A07.A02("custom_payment_method_linking").A0G("custom_payment_method_tos")) {
            A0O.setText(R.string.f12nameremoved);
        } else {
            C32681e1 r10 = this.A07;
            if (r10 != null) {
                SpannableString A012 = r10.A01(A0O.getContext(), A0n(R.string.f12nameremoved), new Runnable[]{new AVX(this, 20), new AVX(this, 19), new AVX(this, 18), AWL.A00, new AVX(this, 17)}, new String[]{"fb-tos", "wa-tos", "fb-privacy-policy", "wa-privacy-policy"}, new String[]{"https://transparency.fb.com/es-la/policies/other-policies/terms-of-service", "https://www.whatsapp.com/legal/merchant-terms/", "https://www.facebook.com/privacy/policy/", "https://www.whatsapp.com/legal/payments/privacy-policy"});
                Rect rect = AnonymousClass0BN.A0A;
                C21060yb r2 = this.A02;
                if (r2 != null) {
                    C36331k8.A16(A0O, r2);
                    C20810yC r22 = this.A03;
                    if (r22 != null) {
                        C36331k8.A1A(r22, A0O);
                        A0O.setText(A012);
                    } else {
                        throw C36321k7.A07();
                    }
                } else {
                    throw C36331k8.A0d("systemServices");
                }
            } else {
                throw C36331k8.A0b();
            }
        }
        WaEditText waEditText = (WaEditText) C36361kB.A0G(view2, R.id.br_bottom_sheet_pix_key_value_edit_text);
        AbsSpinner absSpinner = (AbsSpinner) C36361kB.A0G(view2, R.id.br_bottom_sheet_pix_key_type_spinner);
        TextInputLayout textInputLayout = (TextInputLayout) C36361kB.A0G(view2, R.id.br_bottom_sheet_pix_key_value_input_layout);
        WaEditText waEditText2 = (WaEditText) C36361kB.A0G(view2, R.id.br_bottom_sheet_pix_key_phone_prefix);
        waEditText2.setText("+55");
        C10810fG r8 = new C10810fG();
        C195959Wy[] r4 = new C195959Wy[5];
        r4[0] = new C195959Wy("CPF", C36421kH.A0a(this, R.string.f12nameremoved), "###.###.###-##", 2, 14);
        r4[1] = new C195959Wy("CNPJ", C36421kH.A0a(this, R.string.f12nameremoved), "##.###.###/####-##", 2, 18);
        r4[2] = new C195959Wy("PHONE", C36421kH.A0a(this, R.string.f12nameremoved), "## ####-######", 2, 14);
        C102374zt r13 = null;
        r4[3] = new C195959Wy("EMAIL", C36421kH.A0a(this, R.string.f12nameremoved), (String) null, 32, 77);
        List A0m = C36341k9.A0m(new C195959Wy("EVP", C36421kH.A0a(this, R.string.f12nameremoved), (String) null, 1, 36), r4, 4);
        absSpinner.setAdapter(new ArrayAdapter(A0a(), 17367049, A0m));
        absSpinner.setOnItemSelectedListener(new C207489vI(waEditText, waEditText2, this, r8));
        waEditText.setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(((C195959Wy) A0m.get(0)).A01)});
        waEditText.addTextChangedListener(new B7U(this, 0));
        String str2 = ((C195959Wy) A0m.get(0)).A02;
        if (str2 != null) {
            r13 = new C102374zt(waEditText, str2);
        }
        r8.element = r13;
        if (r13 != null) {
            waEditText.addTextChangedListener(r13);
        }
        waEditText.setOnFocusChangeListener(new C89574Xb(this, 7));
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel2 = this.A05;
        if (brazilAddPixKeyViewModel2 == null) {
            throw C36331k8.A0d("brazilAddPixKeyViewModel");
        }
        BA9.A01(A0m(), brazilAddPixKeyViewModel2.A03, new C22480AnJ(textInputLayout, this), 4);
        TextInputLayout textInputLayout2 = (TextInputLayout) C36361kB.A0G(view2, R.id.br_bottom_sheet_pix_name_input_layout);
        TextView A0M = C36341k9.A0M(view2, R.id.br_bottom_sheet_pix_name_edit_text);
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel3 = this.A05;
        if (brazilAddPixKeyViewModel3 == null) {
            throw C36331k8.A0d("brazilAddPixKeyViewModel");
        }
        BA9.A01(A0m(), brazilAddPixKeyViewModel3.A02, new C22481AnK(textInputLayout2, this), 6);
        A0M.addTextChangedListener(new B7U(this, 1));
        A0M.setOnFocusChangeListener(new C89574Xb(this, 6));
        WaButtonWithLoader waButtonWithLoader = (WaButtonWithLoader) C36361kB.A0G(view2, R.id.br_bottom_sheet_add_pix_button);
        waButtonWithLoader.setButtonText((int) R.string.f12nameremoved);
        waButtonWithLoader.setEnabled(false);
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel4 = this.A05;
        if (brazilAddPixKeyViewModel4 == null) {
            throw C36331k8.A0d("brazilAddPixKeyViewModel");
        }
        BA9.A01(A0m(), brazilAddPixKeyViewModel4.A01, new C22478AnH(waButtonWithLoader, this), 7);
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel5 = this.A05;
        if (brazilAddPixKeyViewModel5 == null) {
            throw C36331k8.A0d("brazilAddPixKeyViewModel");
        }
        BA9.A01(A0m(), brazilAddPixKeyViewModel5.A00, new C22479AnI(waButtonWithLoader, this), 5);
        waButtonWithLoader.A00 = new C48752hz(this, 44);
        A03(this, (Integer) null, (String) null, 0);
    }

    public static final void A03(BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet, Integer num, String str, int i) {
        C131606Ps A0F = C165567td.A0F();
        A0F.A03("payment_method", "pix");
        if (str != null) {
            A0F.A03("key_type", str);
        }
        String A0y = C36381kD.A0y(A0F);
        C23075B3f b3f = brazilPaymentMethodAddPixBottomSheet.A04;
        if (b3f != null) {
            C176658cT B4W = b3f.B4W();
            C176658cT.A02(B4W, i);
            B4W.A07 = num;
            B4W.A0b = "add_non_native_p2m_payment_method";
            String str2 = brazilPaymentMethodAddPixBottomSheet.A08;
            String str3 = str2;
            if (str2 == null) {
                str2 = "orders_home";
            }
            B4W.A0Y = str2;
            B4W.A0a = str3;
            B4W.A0Z = A0y;
            C23075B3f b3f2 = brazilPaymentMethodAddPixBottomSheet.A04;
            if (b3f2 != null) {
                b3f2.BOl(B4W);
                return;
            }
            throw C36331k8.A0d("paymentFieldStatsLogger");
        }
        throw C36331k8.A0d("paymentFieldStatsLogger");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        AnonymousClass01I A0h = A0h();
        AnonymousClass016 r0 = this;
        if (A0h instanceof BrazilPaymentPixOnboardingActivity) {
            AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivity");
            r0 = (BrazilPaymentPixOnboardingActivity) A0h;
        }
        this.A05 = (BrazilAddPixKeyViewModel) C36441kJ.A0b(r0).A00(BrazilAddPixKeyViewModel.class);
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
