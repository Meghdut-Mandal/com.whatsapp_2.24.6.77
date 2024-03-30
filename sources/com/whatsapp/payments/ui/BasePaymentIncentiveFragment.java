package com.whatsapp.payments.ui;

import X.AnonymousClass16X;
import X.C012005e;
import X.C117675me;
import X.C203049nB;
import X.C36361kB;
import X.C36371kC;
import X.C36391kE;
import X.C36401kF;
import X.C36431kI;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.RoundedBottomSheetDialogFragment;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public abstract class BasePaymentIncentiveFragment extends RoundedBottomSheetDialogFragment {
    public TextEmojiLabel A00;
    public WaImageButton A01;
    public WaTextView A02;
    public WDSButton A03;

    public void A1p() {
        PaymentIncentiveViewFragment paymentIncentiveViewFragment = (PaymentIncentiveViewFragment) this;
        C203049nB.A03(C203049nB.A01(paymentIncentiveViewFragment.A02, (AnonymousClass16X) null, paymentIncentiveViewFragment.A07, (String) null, true), paymentIncentiveViewFragment.A06, 1, "incentive_details", (String) null, 1);
    }

    public void A1q() {
        PaymentIncentiveViewFragment paymentIncentiveViewFragment = (PaymentIncentiveViewFragment) this;
        C117675me r0 = paymentIncentiveViewFragment.A04;
        if (r0 != null) {
            r0.A00.A1b();
        }
        C203049nB.A03(C203049nB.A01(paymentIncentiveViewFragment.A02, (AnonymousClass16X) null, paymentIncentiveViewFragment.A07, (String) null, true), paymentIncentiveViewFragment.A06, C36371kC.A0p(), "incentive_details", (String) null, 1);
    }

    public View A1G(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C36361kB.A0E(layoutInflater, viewGroup, R.layout.f9nameremoved);
    }

    public void A1S(Bundle bundle, View view) {
        super.A1S(bundle, view);
        this.A02 = C36401kF.A0Q(view, R.id.payment_incentive_bottom_sheet_title);
        this.A00 = C36401kF.A0O(view, R.id.payment_incentive_bottom_sheet_body);
        WDSButton A0y = C36431kI.A0y(view, R.id.ok_button);
        this.A03 = A0y;
        C36391kE.A1I(A0y, this, 6);
        WaImageButton waImageButton = (WaImageButton) C012005e.A02(view, R.id.back);
        this.A01 = waImageButton;
        C36391kE.A1I(waImageButton, this, 7);
    }
}
