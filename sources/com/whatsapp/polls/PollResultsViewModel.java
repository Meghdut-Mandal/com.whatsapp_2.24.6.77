package com.whatsapp.polls;

import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01Y;
import X.AnonymousClass04R;
import X.AnonymousClass05R;
import X.AnonymousClass16J;
import X.AnonymousClass191;
import X.AnonymousClass1A1;
import X.AnonymousClass2bS;
import X.C131546Pm;
import X.C1498072v;
import X.C164897sY;
import X.C28201Rs;
import X.C29591Xf;
import X.C29601Xg;
import X.C36321k7;
import X.C36441kJ;

public final class PollResultsViewModel extends AnonymousClass04R implements AnonymousClass01Y {
    public AnonymousClass2bS A00;
    public final AnonymousClass191 A01 = new C164897sY(this, 2);
    public final AnonymousClass16J A02;
    public final C131546Pm A03;
    public final AnonymousClass1A1 A04;
    public final C28201Rs A05 = C36441kJ.A0t();
    public final C29601Xg A06;
    public final C29591Xf A07;

    public void BhM(AnonymousClass05R r3, AnonymousClass012 r4) {
        AnonymousClass00C.A0D(r3, 1);
        if (r3.ordinal() == 5) {
            this.A02.unregisterObserver(this.A01);
        }
    }

    public final void A0S(AnonymousClass2bS r4) {
        C1498072v r2 = new C1498072v(r4, this, 34);
        if (!C29591Xf.A00(r4, 67)) {
            r2.run();
        } else {
            this.A06.A01(r4, r2, 67);
        }
    }

    public PollResultsViewModel(C29601Xg r3, C29591Xf r4, AnonymousClass16J r5, C131546Pm r6, AnonymousClass1A1 r7) {
        C36321k7.A11(r7, r5, r4);
        this.A04 = r7;
        this.A02 = r5;
        this.A07 = r4;
        this.A06 = r3;
        this.A03 = r6;
    }
}
