package com.whatsapp.payments.ui.compliance;

import X.AF7;
import android.os.Bundle;

public final class IndiaConfirmLegalNameBottomSheetFragment extends Hilt_IndiaConfirmLegalNameBottomSheetFragment {
    public AF7 A00;
    public String A01;
    public String A02;
    public String A03;

    public void A1Q(Bundle bundle) {
        super.A1Q(bundle);
        Bundle A0b = A0b();
        this.A01 = A0b.getString("extra_payment_config_id");
        this.A02 = A0b.getString("extra_order_type");
        this.A03 = A0b.getString("extra_referral_screen");
    }
}
