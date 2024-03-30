package com.whatsapp.payments.ui;

import X.AnonymousClass24H;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36371kC;
import X.C89344We;
import com.whatsapp.contact.picker.ContactPicker;
import com.whatsapp.contact.picker.ContactPickerFragment;

public final class IndiaUpiContactPicker extends ContactPicker {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            AnonymousClass24H.A01(A0B, r1, this);
        }
    }

    public IndiaUpiContactPicker(int i) {
        this.A00 = false;
        C89344We.A00(this, 47);
    }

    public ContactPickerFragment A3n() {
        if (C36371kC.A0H(this) == null || !C36371kC.A0H(this).getBoolean("for_payment_merchants", false)) {
            return new IndiaUpiContactPickerFragment();
        }
        return new IndiaPaymentMerchantContactPickerFragment();
    }

    public IndiaUpiContactPicker() {
        this(0);
    }
}
