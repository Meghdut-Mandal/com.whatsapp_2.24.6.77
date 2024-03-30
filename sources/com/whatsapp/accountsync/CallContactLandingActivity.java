package com.whatsapp.accountsync;

import X.AnonymousClass12P;
import X.AnonymousClass1ND;
import X.C163027pX;
import X.C18800tq;
import X.C18830tt;
import X.C19470v6;
import X.C20350xQ;
import X.C29301Wc;
import X.C29501Ww;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36381kD;
import X.C36391kE;
import X.C90464aC;
import X.C90494aF;

public class CallContactLandingActivity extends ProfileActivity {
    public AnonymousClass1ND A00;
    public boolean A01;

    public void A2F() {
        if (!this.A01) {
            this.A01 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C90464aC.A11(A0B, this);
            C18830tt r2 = A0B.A00;
            C90464aC.A0y(A0B, r2, this, C36321k7.A05(A0B, r2, this));
            this.A00 = r2.A56();
            this.A00 = C19470v6.A00;
            this.A02 = (C29301Wc) A0B.A0b.get();
            this.A04 = C36341k9.A0R(A0B);
            this.A06 = (C20350xQ) A0B.A3k.get();
            this.A07 = C90494aF.A0P(A0B);
            this.A03 = C36381kD.A0X(A0B);
            this.A05 = (AnonymousClass12P) A0B.A5G.get();
            this.A08 = (C29501Ww) A0B.A7K.get();
            this.A00 = C36391kE.A0Y(A0B);
        }
    }

    public CallContactLandingActivity(int i) {
        this.A01 = false;
        C163027pX.A00(this, 7);
    }

    public CallContactLandingActivity() {
        this(0);
    }
}
