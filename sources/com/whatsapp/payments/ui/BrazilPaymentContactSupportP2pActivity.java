package com.whatsapp.payments.ui;

import X.AnonymousClass24a;
import X.AnonymousClass2a3;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C65993Ug;
import X.C89344We;

public class BrazilPaymentContactSupportP2pActivity extends AnonymousClass24a {
    public AnonymousClass2a3 A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            this.A00 = (AnonymousClass2a3) A0L.A0A.get();
        }
    }

    public BrazilPaymentContactSupportP2pActivity(int i) {
        this.A01 = false;
        C89344We.A00(this, 40);
    }

    public void A3j() {
        super.A3j();
        this.A00.A00.A08(this, new C65993Ug(this, 24));
    }

    public BrazilPaymentContactSupportP2pActivity() {
        this(0);
    }
}
