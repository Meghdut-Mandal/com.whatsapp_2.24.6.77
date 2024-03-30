package com.whatsapp.calling.controls.viewmodel;

import X.C001700s;
import X.C105545Fb;
import X.C36431kI;
import X.C95504lc;

public class CallControlButtonsViewModel extends C95504lc {
    public int A00 = 0;
    public final C001700s A01 = C36431kI.A0S();
    public final C105545Fb A02;

    public void A0R() {
        this.A02.unregisterObserver(this);
    }

    public CallControlButtonsViewModel(C105545Fb r2) {
        this.A02 = r2;
        r2.registerObserver(this);
        C95504lc.A02(r2, this);
    }
}
