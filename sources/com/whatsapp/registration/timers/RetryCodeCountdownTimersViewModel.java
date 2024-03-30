package com.whatsapp.registration.timers;

import X.AnonymousClass00C;
import X.AnonymousClass04R;
import X.AnonymousClass12U;
import X.C001600r;
import X.C001700s;
import X.C36371kC;
import X.C36411kG;
import X.C36431kI;
import X.C36441kJ;
import java.util.Map;

public final class RetryCodeCountdownTimersViewModel extends AnonymousClass04R {
    public final C001600r A00;
    public final C001700s A01;
    public final AnonymousClass12U A02;
    public final Map A03 = C36431kI.A1G();
    public final Map A04 = C36431kI.A1G();
    public final Map A05 = C36431kI.A1G();

    public RetryCodeCountdownTimersViewModel(AnonymousClass12U r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A02 = r2;
        C001700s A0Z = C36441kJ.A0Z(C36411kG.A0t());
        this.A01 = A0Z;
        this.A00 = A0Z;
    }

    public final long A0S(String str) {
        return C36371kC.A0A((Number) this.A03.get(str));
    }
}
