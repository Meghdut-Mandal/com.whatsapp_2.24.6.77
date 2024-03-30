package com.whatsapp.payments.ui;

import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36361kB;
import X.C36371kC;
import X.C46622Zo;
import X.C89344We;

public class BrazilPaymentSettingsActivity extends C46622Zo {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36371kC.A0h(A0B);
            this.A01 = C36361kB.A0e(A0B);
        }
    }

    public BrazilPaymentSettingsActivity(int i) {
        this.A00 = false;
        C89344We.A00(this, 45);
    }

    public BrazilPaymentSettingsActivity() {
        this(0);
    }
}
