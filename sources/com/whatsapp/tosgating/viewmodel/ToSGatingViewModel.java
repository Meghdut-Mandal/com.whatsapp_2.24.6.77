package com.whatsapp.tosgating.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass1E9;
import X.AnonymousClass1EA;
import X.AnonymousClass3NC;
import X.C001700s;
import X.C19730wQ;
import X.C20810yC;
import X.C24541Cv;
import X.C36321k7;
import X.C36431kI;
import X.C62443Ge;

public final class ToSGatingViewModel extends AnonymousClass04R {
    public boolean A00;
    public final C001700s A01 = C36431kI.A0S();
    public final C62443Ge A02;
    public final C19730wQ A03;
    public final C24541Cv A04;
    public final C20810yC A05;
    public final AnonymousClass1E9 A06;
    public final AnonymousClass1EA A07;
    public final AnonymousClass3NC A08;

    public ToSGatingViewModel(C62443Ge r2, C19730wQ r3, C24541Cv r4, C20810yC r5, AnonymousClass1EA r6, AnonymousClass1E9 r7) {
        AnonymousClass00C.A0D(r5, 1);
        C36321k7.A1A(r3, r4, r6, r7, 2);
        this.A05 = r5;
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
        this.A07 = r6;
        this.A06 = r7;
        AnonymousClass3NC r0 = new AnonymousClass3NC(this);
        this.A08 = r0;
        r6.registerObserver(r0);
    }

    public void A0R() {
        this.A07.unregisterObserver(this.A08);
    }
}
