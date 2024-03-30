package com.whatsapp.payments.ui;

import X.AnonymousClass001;
import X.AnonymousClass07B;
import X.AnonymousClass24V;
import X.BA9;
import X.C22430AmV;
import X.C22431AmW;
import X.C36331k8;
import X.C36431kI;
import X.C36441kJ;
import X.C65443Sb;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import com.whatsapp.R;
import com.whatsapp.payments.ui.viewmodel.BrazilAddPixKeyViewModel;

public final class BrazilPaymentPixOnboardingActivity extends AnonymousClass24V {
    public String A00;
    public BrazilAddPixKeyViewModel A01;

    public static final void A01(BrazilPaymentPixOnboardingActivity brazilPaymentPixOnboardingActivity) {
        brazilPaymentPixOnboardingActivity.finish();
        if (Build.VERSION.SDK_INT >= 34) {
            brazilPaymentPixOnboardingActivity.overrideActivityTransition(1, 0, 0);
        } else {
            brazilPaymentPixOnboardingActivity.overridePendingTransition(0, 0);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass07B supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0D();
        }
        this.A00 = C36431kI.A0F(this, R.layout.f9nameremoved).getStringExtra("referral_screen");
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel = (BrazilAddPixKeyViewModel) C36441kJ.A0b(this).A00(BrazilAddPixKeyViewModel.class);
        this.A01 = brazilAddPixKeyViewModel;
        if (brazilAddPixKeyViewModel == null) {
            throw C36331k8.A0d("brazilAddPixKeyViewModel");
        }
        BA9.A01(this, brazilAddPixKeyViewModel.A00, new C22430AmV(this), 8);
        BrazilAddPixKeyViewModel brazilAddPixKeyViewModel2 = this.A01;
        if (brazilAddPixKeyViewModel2 == null) {
            throw C36331k8.A0d("brazilAddPixKeyViewModel");
        }
        BA9.A01(this, brazilAddPixKeyViewModel2.A04, new C22431AmW(this), 9);
        String str = this.A00;
        BrazilPaymentMethodAddPixBottomSheet brazilPaymentMethodAddPixBottomSheet = new BrazilPaymentMethodAddPixBottomSheet();
        if (str != null) {
            Bundle A07 = AnonymousClass001.A07();
            A07.putString("referral_screen", str);
            brazilPaymentMethodAddPixBottomSheet.A17(A07);
        }
        brazilPaymentMethodAddPixBottomSheet.A1g(false);
        C65443Sb.A03(brazilPaymentMethodAddPixBottomSheet, getSupportFragmentManager(), "PaymentMethodAddPixBottomSheet");
    }

    public void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT >= 34) {
            overrideActivityTransition(0, 0, 0);
        } else {
            overridePendingTransition(0, 0);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        A01(this);
        return true;
    }
}
