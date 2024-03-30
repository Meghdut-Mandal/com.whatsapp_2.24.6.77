package com.whatsapp.expressionstray.gifs;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass05J;
import X.AnonymousClass3L7;
import X.AnonymousClass63V;
import X.AnonymousClass67Z;
import X.AnonymousClass6O1;
import X.C001700s;
import X.C007403e;
import X.C023509x;
import X.C109325Xd;
import X.C117175lp;
import X.C119585q6;
import X.C145786uW;
import X.C158277gf;
import X.C176238bn;
import X.C36321k7;
import X.C36391kE;
import X.C36431kI;
import X.C36441kJ;
import java.util.concurrent.CancellationException;

public final class GifExpressionsSearchViewModel extends AnonymousClass04R {
    public C007403e A00;
    public C007403e A01;
    public final C001700s A02;
    public final C001700s A03 = C36431kI.A0S();
    public final AnonymousClass6O1 A04;
    public final AnonymousClass63V A05;
    public final C119585q6 A06;
    public final AnonymousClass3L7 A07;
    public final C158277gf A08;
    public final AnonymousClass05J A09;

    public void A0R() {
        AnonymousClass67Z r2 = (AnonymousClass67Z) this.A03.A04();
        if (r2 != null) {
            C158277gf r1 = this.A08;
            AnonymousClass00C.A0D(r1, 0);
            r2.A03.remove(r1);
        }
    }

    public final void A0S(String str) {
        this.A02.A0D(C176238bn.A00);
        C007403e r0 = this.A01;
        if (r0 != null) {
            r0.B2S((CancellationException) null);
        }
        this.A01 = C36391kE.A12(new GifExpressionsSearchViewModel$runSearch$1(this, str, (C023509x) null), C109325Xd.A00(this));
    }

    public GifExpressionsSearchViewModel(AnonymousClass6O1 r2, C117175lp r3, AnonymousClass63V r4, C119585q6 r5, AnonymousClass3L7 r6) {
        C36321k7.A1B(r3, r6, r5, r4, r2);
        this.A07 = r6;
        this.A06 = r5;
        this.A05 = r4;
        this.A04 = r2;
        this.A09 = r3.A00;
        this.A02 = C36441kJ.A0Z(C176238bn.A00);
        this.A08 = new C145786uW(this);
    }
}
