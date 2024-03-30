package com.whatsapp.payments.ui;

import X.B7Y;
import X.C165567td;
import X.C173918Tq;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;

public class IndiaPaymentTransactionHistoryActivity extends PaymentTransactionHistoryActivity {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C165567td.A11(A0B, this);
            C18830tt r1 = A0B.A00;
            C165567td.A0v(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A04 = C36341k9.A0T(A0B);
            C173918Tq.A01(A0B, r1, this);
        }
    }

    public IndiaPaymentTransactionHistoryActivity(int i) {
        this.A00 = false;
        B7Y.A00(this, 48);
    }

    public IndiaPaymentTransactionHistoryActivity() {
        this(0);
    }
}
