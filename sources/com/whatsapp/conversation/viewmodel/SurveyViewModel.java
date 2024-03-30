package com.whatsapp.conversation.viewmodel;

import X.AnonymousClass00C;
import X.AnonymousClass00T;
import X.AnonymousClass04R;
import X.AnonymousClass2ZC;
import X.AnonymousClass31T;
import X.AnonymousClass4I5;
import X.C36431kI;

public final class SurveyViewModel extends AnonymousClass04R {
    public final AnonymousClass00T A00 = C36431kI.A1I(AnonymousClass4I5.A00);
    public final AnonymousClass31T A01;
    public final AnonymousClass2ZC A02;

    public SurveyViewModel(AnonymousClass2ZC r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
        AnonymousClass31T r0 = new AnonymousClass31T(this);
        this.A01 = r0;
        r2.registerObserver(r0);
    }

    public void A0R() {
        this.A02.unregisterObserver(this.A01);
    }
}
