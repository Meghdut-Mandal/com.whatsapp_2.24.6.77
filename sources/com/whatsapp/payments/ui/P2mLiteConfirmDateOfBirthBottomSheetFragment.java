package com.whatsapp.payments.ui;

import X.AF6;
import android.os.Bundle;

public final class P2mLiteConfirmDateOfBirthBottomSheetFragment extends Hilt_P2mLiteConfirmDateOfBirthBottomSheetFragment {
    public AF6 A00;
    public String A01;
    public String A02;

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        Bundle A0b = A0b();
        this.A01 = A0b.getString("extra_payment_config_id");
        this.A02 = A0b.getString("extra_order_type");
    }
}
