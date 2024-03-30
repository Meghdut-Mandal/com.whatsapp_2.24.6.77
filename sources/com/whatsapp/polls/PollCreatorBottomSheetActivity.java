package com.whatsapp.polls;

import X.C100964wK;
import X.C163027pX;
import X.C18800tq;
import X.C18830tt;
import X.C27111My;
import X.C36321k7;
import X.C36351kA;
import X.C90464aC;
import X.C90474aD;

public class PollCreatorBottomSheetActivity extends PollCreatorActivity {
    public boolean A00;

    public void A2F() {
        if (!this.A00) {
            this.A00 = true;
            C27111My A0L = C36351kA.A0L(this);
            C18800tq r2 = A0L.A5g;
            C90464aC.A11(r2, this);
            C18830tt r1 = r2.A00;
            C90464aC.A0y(r2, r1, this, C36321k7.A05(r2, r1, this));
            C100964wK.A01(A0L, r1, this);
            this.A09 = C90474aD.A0R(r1);
        }
    }

    public PollCreatorBottomSheetActivity(int i) {
        this.A00 = false;
        C163027pX.A00(this, 49);
    }

    public PollCreatorBottomSheetActivity() {
        this(0);
    }
}
