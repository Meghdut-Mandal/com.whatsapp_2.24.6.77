package com.whatsapp.payments.ui;

import X.AnonymousClass005;
import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass016;
import X.AnonymousClass01I;
import X.C012005e;
import X.C1271267b;
import X.C131606Ps;
import X.C165567td;
import X.C176658cT;
import X.C202159l8;
import X.C20800yB;
import X.C21010yW;
import X.C22190AiD;
import X.C22191AiE;
import X.C22192AiF;
import X.C22193AiG;
import X.C22194AiH;
import X.C22195AiI;
import X.C36331k8;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;
import com.whatsapp.util.Log;

public final class BrazilPixInfoAddedBottomSheet extends Hilt_BrazilPixInfoAddedBottomSheet {
    public int A00 = -1;
    public AnonymousClass005 A01;
    public AnonymousClass005 A02;
    public AnonymousClass005 A03;
    public AnonymousClass005 A04;
    public AnonymousClass005 A05;
    public AnonymousClass005 A06;
    public BrazilAddPixKeyViewModel A07;
    public String A08;
    public final AnonymousClass00T A09 = C36431kI.A1I(new C22190AiD(this));
    public final AnonymousClass00T A0A = C36431kI.A1I(new C22191AiE(this));
    public final AnonymousClass00T A0B = C36431kI.A1I(new C22192AiF(this));
    public final AnonymousClass00T A0C = C36431kI.A1I(new C22193AiG(this));
    public final AnonymousClass00T A0D = C36431kI.A1I(new C22194AiH(this));
    public final AnonymousClass00T A0E = C36431kI.A1I(new C22195AiI(this));

    public void A1S(Bundle bundle, View view) {
        AnonymousClass00C.A0D(view, 0);
        super.A1S(bundle, view);
        Bundle bundle2 = this.A0A;
        if (bundle2 != null) {
            this.A00 = bundle2.getInt("payment_account_type", -1);
            this.A08 = bundle2.getString("referral_screen");
        }
        C36391kE.A1I(C012005e.A02(view, R.id.not_now_button), this, 21);
        C36391kE.A1I(C012005e.A02(view, R.id.send_charge_request_button), this, 22);
        A03(this, (Integer) null, 0, this.A00);
    }

    public static final void A03(BrazilPixInfoAddedBottomSheet brazilPixInfoAddedBottomSheet, Integer num, int i, int i2) {
        if (((C20800yB) brazilPixInfoAddedBottomSheet.A09.getValue()).A0E(7544)) {
            C131606Ps A0F = C165567td.A0F();
            if (i2 == 6) {
                A0F.A03("payment_method", "pix");
            } else {
                Log.e("Unsupported action");
            }
            C176658cT r1 = new C176658cT();
            r1.A0V = ((C1271267b) brazilPixInfoAddedBottomSheet.A0C.getValue()).A00();
            C202159l8 r0 = C202159l8.A0E;
            r1.A0R = "BR";
            r1.A0Z = A0F.toString();
            C176658cT.A04(r1, num, "payment_method_added_prompt", i);
            String str = brazilPixInfoAddedBottomSheet.A08;
            if (str != null) {
                r1.A0a = str;
            }
            r1.A0Y = "add_non_native_p2m_payment_method";
            ((C21010yW) brazilPixInfoAddedBottomSheet.A0E.getValue()).Bly(r1);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = this.A07;
        if (brazilAddPixKeyViewModel == null) {
            throw C36331k8.A0d("brazilAddPixKeyViewModel");
        }
        brazilAddPixKeyViewModel.A04.A0C("dismissed");
    }

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        AnonymousClass01I A0h = A0h();
        AnonymousClass016 r0 = this;
        if (A0h instanceof BrazilPaymentPixOnboardingActivity) {
            AnonymousClass00C.A0E(A0h, "null cannot be cast to non-null type com.whatsapp.payments.ui.BrazilPaymentPixOnboardingActivity");
            r0 = (BrazilPaymentPixOnboardingActivity) A0h;
        }
        this.A07 = (BrazilAddPixKeyViewModel) C36441kJ.A0b(r0).A00(BrazilAddPixKeyViewModel.class);
    }

    public int A1i() {
        return R.layout.f9nameremoved;
    }
}
