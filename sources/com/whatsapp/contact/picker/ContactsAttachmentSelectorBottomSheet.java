package com.whatsapp.contact.picker;

import X.AnonymousClass22g;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C28271Rz;
import X.C36321k7;
import X.C36351kA;
import X.C64813Pn;
import X.C89324Wc;

public class ContactsAttachmentSelectorBottomSheet extends ContactsAttachmentSelector {
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
            AnonymousClass22g.A0h(r2, r1, this);
            AnonymousClass22g.A0L(A0L, r2, this);
            this.A02 = C36351kA.A0W(r2);
            this.A03 = (C28271Rz) r1.A2a.get();
            this.A00 = C36351kA.A0K(r2);
            this.A04 = (C64813Pn) r1.A9Z.get();
        }
    }

    public ContactsAttachmentSelectorBottomSheet(int i) {
        this.A00 = false;
        C89324Wc.A00(this, 33);
    }

    public ContactsAttachmentSelectorBottomSheet() {
        this(0);
    }
}
