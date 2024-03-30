package com.whatsapp.settings;

import X.AnonymousClass04R;
import X.AnonymousClass2ZA;
import X.C001600r;
import X.C19770wU;
import X.C237819v;
import X.C28201Rs;
import X.C36321k7;
import X.C36441kJ;

public final class SettingsAccountViewModel extends AnonymousClass04R {
    public final C001600r A00;
    public final AnonymousClass2ZA A01;
    public final C237819v A02;
    public final C28201Rs A03;
    public final C19770wU A04;

    public void A0R() {
        this.A01.unregisterObserver(this);
    }

    public SettingsAccountViewModel(AnonymousClass2ZA r2, C237819v r3, C19770wU r4) {
        C36321k7.A11(r4, r2, r3);
        this.A04 = r4;
        this.A01 = r2;
        this.A02 = r3;
        C28201Rs A0t = C36441kJ.A0t();
        this.A03 = A0t;
        this.A00 = A0t;
        r2.registerObserver(this);
    }
}
