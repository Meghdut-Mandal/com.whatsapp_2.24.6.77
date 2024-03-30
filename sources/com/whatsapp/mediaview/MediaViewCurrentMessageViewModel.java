package com.whatsapp.mediaview;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass00U;
import X.AnonymousClass04R;
import X.AnonymousClass16J;
import X.AnonymousClass3IY;
import X.AnonymousClass4CL;
import X.C001700s;
import X.C1502074j;
import X.C29601Xg;
import X.C36411kG;
import X.C36431kI;

public final class MediaViewCurrentMessageViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36431kI.A0S();
    public final AnonymousClass00T A01;
    public final C29601Xg A02;
    public final AnonymousClass16J A03;

    public MediaViewCurrentMessageViewModel(C29601Xg r2, AnonymousClass16J r3) {
        AnonymousClass00C.A0D(r3, 2);
        this.A02 = r2;
        this.A03 = r3;
        AnonymousClass00U A1I = C36431kI.A1I(new AnonymousClass4CL(this));
        this.A01 = A1I;
        r3.registerObserver(A1I.getValue());
    }

    public void A0R() {
        C36411kG.A1I(this.A03, this.A01);
    }

    public final void A0S() {
        AnonymousClass3IY r4 = (AnonymousClass3IY) this.A00.A04();
        if (r4 != null) {
            this.A02.A01(r4.A01, new C1502074j(r4, this, 2), 56);
        }
    }
}
