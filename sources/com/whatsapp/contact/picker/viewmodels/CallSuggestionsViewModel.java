package com.whatsapp.contact.picker.viewmodels;

import X.AnonymousClass00T;
import X.AnonymousClass4AA;
import X.AnonymousClass4PS;
import X.C001700s;
import X.C004702c;
import X.C005502l;
import X.C105545Fb;
import X.C17990sP;
import X.C19970wo;
import X.C20810yC;
import X.C36321k7;
import X.C36431kI;
import X.C95504lc;
import java.util.Set;

public final class CallSuggestionsViewModel extends C95504lc {
    public long A00;
    public Set A01 = C004702c.A00;
    public C17990sP A02;
    public final C001700s A03 = C36431kI.A0S();
    public final AnonymousClass4PS A04;
    public final C19970wo A05;
    public final C20810yC A06;
    public final AnonymousClass00T A07 = C36431kI.A1I(new AnonymousClass4AA(this));
    public final C005502l A08;
    public final C105545Fb A09;

    public void A0R() {
        this.A09.unregisterObserver(this);
    }

    public CallSuggestionsViewModel(C105545Fb r2, AnonymousClass4PS r3, C19970wo r4, C20810yC r5, C005502l r6) {
        C36321k7.A1B(r4, r5, r2, r3, r6);
        this.A05 = r4;
        this.A06 = r5;
        this.A09 = r2;
        this.A04 = r3;
        this.A08 = r6;
        r2.registerObserver(this);
        C95504lc.A02(r2, this);
    }
}
