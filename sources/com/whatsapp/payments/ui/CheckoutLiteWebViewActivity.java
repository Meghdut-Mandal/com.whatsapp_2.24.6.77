package com.whatsapp.payments.ui;

import X.AnonymousClass24Z;
import X.AnonymousClass3PX;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36381kD;
import X.C89344We;

public final class CheckoutLiteWebViewActivity extends MessageWithLinkWebViewActivity {
    public boolean A00;

    public boolean A3r() {
        return false;
    }

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            AnonymousClass24Z.A01(A0B, r1, this);
            this.A01 = (AnonymousClass3PX) A0B.ATW.get();
            this.A00 = C36381kD.A0f(A0B);
        }
    }

    public CheckoutLiteWebViewActivity(int i) {
        this.A00 = false;
        C89344We.A00(this, 46);
    }

    public CheckoutLiteWebViewActivity() {
        this(0);
    }
}
