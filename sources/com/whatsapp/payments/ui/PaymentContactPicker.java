package com.whatsapp.payments.ui;

import X.AnonymousClass24H;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C89354Wf;
import com.whatsapp.contact.picker.ContactPicker;

public class PaymentContactPicker extends ContactPicker {
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

    public PaymentContactPicker(int i) {
        this.A00 = false;
        C89354Wf.A00(this, 1);
    }

    public PaymentContactPicker() {
        this(0);
    }
}
