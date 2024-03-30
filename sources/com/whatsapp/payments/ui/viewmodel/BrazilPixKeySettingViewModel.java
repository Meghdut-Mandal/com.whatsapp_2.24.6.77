package com.whatsapp.payments.ui.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass1EU;
import X.AnonymousClass9KW;
import X.AnonymousClass9UE;
import X.AnonymousClass9YB;
import X.C001700s;
import X.C178518gf;
import X.C19770wU;
import X.C201649k3;
import X.C23210B9s;
import X.C36321k7;
import X.C36341k9;
import X.C36381kD;
import X.C36441kJ;
import X.C79593ty;
import X.C81193wc;

public final class BrazilPixKeySettingViewModel extends AnonymousClass04R {
    public final C001700s A00 = C36441kJ.A0Z((Object) null);
    public final C001700s A01 = C36441kJ.A0Z(C36381kD.A0m());
    public final AnonymousClass9UE A02;
    public final AnonymousClass1EU A03;
    public final C178518gf A04;
    public final AnonymousClass9KW A05;
    public final C201649k3 A06;
    public final C19770wU A07;

    public final void A0S(String str) {
        AnonymousClass00C.A0D(str, 0);
        C36341k9.A17(this.A01, 1);
        AnonymousClass9YB A012 = this.A03.A01();
        C79593ty r2 = new C79593ty();
        C81193wc.A01(A012.A03, A012, r2, 19);
        r2.A0A(new C23210B9s(2, str, this));
    }

    public BrazilPixKeySettingViewModel(AnonymousClass9UE r2, AnonymousClass1EU r3, C178518gf r4, AnonymousClass9KW r5, C201649k3 r6, C19770wU r7) {
        C36321k7.A0x(r7, r3);
        AnonymousClass00C.A0D(r6, 4);
        AnonymousClass00C.A0D(r2, 6);
        this.A07 = r7;
        this.A03 = r3;
        this.A04 = r4;
        this.A06 = r6;
        this.A05 = r5;
        this.A02 = r2;
    }
}
