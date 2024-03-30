package com.whatsapp.companionmode.registration;

import X.AnonymousClass04R;
import X.AnonymousClass3LD;
import X.AnonymousClass4W1;
import X.C001600r;
import X.C001700s;
import X.C19770wU;
import X.C25951Ih;
import X.C28201Rs;
import X.C36321k7;
import X.C36431kI;
import X.C36441kJ;
import X.C80213v2;

public final class CompanionRegistrationViewModel extends AnonymousClass04R {
    public final C001600r A00;
    public final C001600r A01;
    public final C001600r A02;
    public final C001700s A03;
    public final C25951Ih A04;
    public final C28201Rs A05;
    public final C28201Rs A06;
    public final C19770wU A07;
    public final AnonymousClass3LD A08;

    public void A0R() {
        C25951Ih r2 = this.A04;
        C25951Ih.A00(r2).A07(this.A08);
        C25951Ih.A00(r2).A05();
    }

    public CompanionRegistrationViewModel(C25951Ih r3, C19770wU r4) {
        C36321k7.A0x(r4, r3);
        this.A07 = r4;
        this.A04 = r3;
        C001700s A0S = C36431kI.A0S();
        this.A03 = A0S;
        this.A00 = A0S;
        C28201Rs A0t = C36441kJ.A0t();
        this.A05 = A0t;
        this.A01 = A0t;
        C28201Rs A0t2 = C36441kJ.A0t();
        this.A06 = A0t2;
        this.A02 = A0t2;
        AnonymousClass4W1 r1 = new AnonymousClass4W1(this, 1);
        this.A08 = r1;
        C25951Ih.A00(r3).A06(r1);
        r4.Bp1(C80213v2.A00(this, 16));
    }
}
