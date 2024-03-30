package com.whatsapp.contact.picker;

import X.AnonymousClass0V9;
import X.AnonymousClass24H;
import X.C021809f;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C89324Wc;

public final class AudienceSelectionContactPicker extends ContactPicker {
    public boolean A00;

    public AnonymousClass0V9 But(C021809f r2) {
        return null;
    }

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

    public AudienceSelectionContactPicker(int i) {
        this.A00 = false;
        C89324Wc.A00(this, 29);
    }

    public AudienceSelectionContactPicker() {
        this(0);
    }
}
