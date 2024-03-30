package com.whatsapp.newsletter.ui.delete;

import X.AnonymousClass171;
import X.AnonymousClass190;
import X.AnonymousClass1N6;
import X.C18800tq;
import X.C18830tt;
import X.C30131Zi;
import X.C30231Zs;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36421kH;
import X.C36431kI;
import X.C46502Ya;
import X.C89344We;

public final class DeleteNewsletterActivity extends C46502Ya {
    public AnonymousClass171 A00;
    public AnonymousClass190 A01;
    public C30131Zi A02;
    public AnonymousClass1N6 A03;
    public boolean A04;

    public void A2F() {
        if (!this.A04) {
            this.A04 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            this.A00 = C36351kA.A0T(A0B);
            this.A01 = C36421kH.A0Q(A0B);
            this.A02 = (C30231Zs) A0B.AUm.get();
            this.A01 = C36351kA.A0h(A0B);
            this.A00 = C36341k9.A0S(A0B);
            this.A02 = C36431kI.A0m(A0B);
            this.A03 = C36361kB.A0e(A0B);
        }
    }

    public void A2X() {
        AnonymousClass1N6 r2 = this.A03;
        if (r2 != null) {
            r2.A03(C36421kH.A0O(this.A04), 33);
            super.A2X();
            return;
        }
        throw C36331k8.A0d("navigationTimeSpentManager");
    }

    public DeleteNewsletterActivity(int i) {
        this.A04 = false;
        C89344We.A00(this, 21);
    }

    public DeleteNewsletterActivity() {
        this(0);
    }
}
