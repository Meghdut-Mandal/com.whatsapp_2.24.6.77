package com.whatsapp.bonsai.prompts;

import X.AnonymousClass005;
import X.AnonymousClass04R;
import X.AnonymousClass11F;
import X.AnonymousClass16J;
import X.AnonymousClass17T;
import X.AnonymousClass1X4;
import X.AnonymousClass6E1;
import X.C007103b;
import X.C023409w;
import X.C19770wU;
import X.C34831hi;
import X.C36321k7;
import X.C36421kH;
import X.C36441kJ;
import X.C90394a5;

public final class BonsaiPromptsViewModel extends AnonymousClass04R {
    public AnonymousClass11F A00;
    public final C90394a5 A01 = C90394a5.A00(this, 3);
    public final AnonymousClass1X4 A02;
    public final AnonymousClass16J A03;
    public final AnonymousClass17T A04;
    public final C34831hi A05 = C36441kJ.A0s(C023409w.A00);
    public final C19770wU A06;
    public final AnonymousClass005 A07;
    public volatile AnonymousClass6E1 A08;

    public void A0R() {
        AnonymousClass16J r2 = this.A03;
        Iterable A0X = C36421kH.A0X(r2);
        C90394a5 r1 = this.A01;
        if (C007103b.A0j(A0X, r1)) {
            r2.unregisterObserver(r1);
        }
    }

    public BonsaiPromptsViewModel(AnonymousClass1X4 r2, AnonymousClass16J r3, AnonymousClass17T r4, C19770wU r5, AnonymousClass005 r6) {
        C36321k7.A1B(r5, r4, r2, r3, r6);
        this.A06 = r5;
        this.A04 = r4;
        this.A02 = r2;
        this.A03 = r3;
        this.A07 = r6;
    }
}
