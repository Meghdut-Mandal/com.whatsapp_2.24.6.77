package com.whatsapp.status;

import X.AnonymousClass00N;
import X.AnonymousClass012;
import X.AnonymousClass05R;
import X.AnonymousClass16E;
import X.AnonymousClass17Y;
import X.AnonymousClass1HT;
import X.C19770wU;
import X.C36321k7;
import X.C81173wa;
import androidx.lifecycle.OnLifecycleEvent;

public final class StatusExpirationLifecycleOwner implements AnonymousClass00N {
    public final AnonymousClass17Y A00;
    public final AnonymousClass1HT A01;
    public final AnonymousClass16E A02;
    public final Runnable A03 = new C81173wa((Object) this, 11);
    public final C19770wU A04;

    public final void A00() {
        this.A00.A0G(this.A03);
        C81173wa.A01(this.A04, this, 12);
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_DESTROY)
    public final void onDestroy() {
        this.A00.A0G(this.A03);
    }

    public StatusExpirationLifecycleOwner(AnonymousClass012 r3, AnonymousClass17Y r4, AnonymousClass1HT r5, AnonymousClass16E r6, C19770wU r7) {
        C36321k7.A19(r4, r7, r6, r5);
        this.A00 = r4;
        this.A04 = r7;
        this.A02 = r6;
        this.A01 = r5;
        r3.getLifecycle().A04(this);
    }

    @OnLifecycleEvent(AnonymousClass05R.ON_START)
    public final void onStart() {
        A00();
    }
}
