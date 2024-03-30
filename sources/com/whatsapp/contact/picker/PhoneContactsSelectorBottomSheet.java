package com.whatsapp.contact.picker;

import X.AnonymousClass22g;
import X.C18800tq;
import X.C18830tt;
import X.C19470v6;
import X.C27111My;
import X.C32601dt;
import X.C36321k7;
import X.C36341k9;
import X.C36351kA;
import X.C36361kB;
import X.C36381kD;
import X.C89324Wc;

public class PhoneContactsSelectorBottomSheet extends PhoneContactsSelector {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C36321k7.A0c(r2, this);
            C18830tt r1 = r2.A00;
            C36321k7.A0X(r2, r1, this, C36321k7.A05(r2, r1, this));
            AnonymousClass22g.A0l(this);
            this.A0O = C36351kA.A0W(r2);
            this.A04 = C19470v6.A00;
            this.A07 = (C32601dt) r1.A46.get();
            this.A0F = C36351kA.A0T(r2);
            this.A0A = C36361kB.A0V(r2);
            this.A0B = C36341k9.A0R(r2);
            this.A0C = C36341k9.A0S(r2);
            this.A0Q = C36341k9.A0T(r2);
            this.A05 = C36351kA.A0K(r2);
            this.A09 = C36381kD.A0X(r2);
            AnonymousClass22g.A0J(A0L, r2, r1, this, C36351kA.A0X(r2));
        }
    }

    public PhoneContactsSelectorBottomSheet(int i) {
        this.A00 = false;
        C89324Wc.A00(this, 36);
    }

    public PhoneContactsSelectorBottomSheet() {
        this(0);
    }
}
