package com.whatsapp.documentpicker;

import X.AnonymousClass22g;
import X.C18800tq;
import X.C18830tt;
import X.C36321k7;
import X.C36331k8;
import X.C36341k9;
import X.C36351kA;
import X.C36371kC;
import X.C36431kI;
import X.C64813Pn;
import X.C74143l8;
import X.C89334Wd;

public final class DocumentPickerBottomSheetActivity extends DocumentPickerActivity {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C18800tq A0B = C36331k8.A0B(this);
            C36321k7.A0c(A0B, this);
            C18830tt r1 = A0B.A00;
            C36321k7.A0X(A0B, r1, this, C36321k7.A05(A0B, r1, this));
            AnonymousClass22g.A0l(this);
            this.A08 = C36351kA.A0T(A0B);
            this.A04 = C36341k9.A0R(A0B);
            this.A06 = C36341k9.A0S(A0B);
            this.A0E = C36341k9.A0T(A0B);
            this.A0G = (C74143l8) r1.A6w.get();
            this.A0C = C36431kI.A0a(A0B);
            this.A05 = C36371kC.A0U(A0B);
            this.A0J = (C64813Pn) r1.A9Z.get();
            AnonymousClass22g.A0i(A0B, r1, C36351kA.A0X(A0B), this);
        }
    }

    public DocumentPickerBottomSheetActivity(int i) {
        this.A00 = false;
        C89334Wd.A00(this, 18);
    }

    public DocumentPickerBottomSheetActivity() {
        this(0);
    }
}
