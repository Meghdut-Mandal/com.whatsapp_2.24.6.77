package androidx.lifecycle;

import X.AnonymousClass001;
import X.AnonymousClass012;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.AnonymousClass3Dw;
import X.C007403e;
import X.C36321k7;
import X.C61893Dx;
import java.util.concurrent.CancellationException;

public final /* synthetic */ class LifecycleController$$ExternalSyntheticLambda0 implements AnonymousClass01Y {
    public final /* synthetic */ C61893Dx A00;
    public final /* synthetic */ C007403e A01;

    public /* synthetic */ LifecycleController$$ExternalSyntheticLambda0(C61893Dx r1, C007403e r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void BhM(AnonymousClass05R r5, AnonymousClass012 r6) {
        C61893Dx r3 = this.A00;
        C007403e r2 = this.A01;
        C36321k7.A0v(r3, 0, r6);
        if (((AnonymousClass01N) r6.getLifecycle()).A02 == AnonymousClass01P.DESTROYED) {
            r2.B2S((CancellationException) null);
            r3.A00();
            return;
        }
        int compareTo = ((AnonymousClass01N) r6.getLifecycle()).A02.compareTo(r3.A01);
        AnonymousClass3Dw r1 = r3.A00;
        if (compareTo < 0) {
            r1.A01 = true;
        } else if (!r1.A01) {
        } else {
            if (!r1.A00) {
                r1.A01 = false;
                r1.A00();
                return;
            }
            throw AnonymousClass001.A09("Cannot resume a finished dispatcher");
        }
    }
}
