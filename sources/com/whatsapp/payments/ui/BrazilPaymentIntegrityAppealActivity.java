package com.whatsapp.payments.ui;

import X.AnonymousClass2Zz;
import X.AnonymousClass2a1;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C89344We;

public class BrazilPaymentIntegrityAppealActivity extends BrazilPaymentContactSupportActivity {
    public AnonymousClass2a1 A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A00 = (AnonymousClass2Zz) A0L.A0B.get();
            this.A00 = (AnonymousClass2a1) A0L.A0D.get();
        }
    }

    public BrazilPaymentIntegrityAppealActivity(int i) {
        this.A01 = false;
        C89344We.A00(this, 42);
    }

    public BrazilPaymentIntegrityAppealActivity() {
        this(0);
    }
}
