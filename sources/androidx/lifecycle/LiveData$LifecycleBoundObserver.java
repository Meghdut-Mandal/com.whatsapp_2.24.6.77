package androidx.lifecycle;

import X.AnonymousClass012;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass01Y;
import X.AnonymousClass04S;
import X.AnonymousClass04T;
import X.AnonymousClass05R;
import X.C001600r;

public class LiveData$LifecycleBoundObserver extends AnonymousClass04T implements AnonymousClass01Y {
    public final AnonymousClass012 A00;
    public final /* synthetic */ C001600r A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LiveData$LifecycleBoundObserver(AnonymousClass012 r1, C001600r r2, AnonymousClass04S r3) {
        super(r2, r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00() {
        this.A00.getLifecycle().A05(this);
    }

    public boolean A02() {
        if (((AnonymousClass01N) this.A00.getLifecycle()).A02.compareTo(AnonymousClass01P.STARTED) >= 0) {
            return true;
        }
        return false;
    }

    public boolean A03(AnonymousClass012 r3) {
        if (this.A00 == r3) {
            return true;
        }
        return false;
    }

    public void BhM(AnonymousClass05R r5, AnonymousClass012 r6) {
        AnonymousClass012 r2 = this.A00;
        AnonymousClass01P r1 = ((AnonymousClass01N) r2.getLifecycle()).A02;
        AnonymousClass01P r3 = r1;
        if (r1 == AnonymousClass01P.DESTROYED) {
            this.A01.A0B(this.A02);
            return;
        }
        AnonymousClass01P r0 = null;
        while (r0 != r1) {
            A01(A02());
            r1 = ((AnonymousClass01N) r2.getLifecycle()).A02;
            r0 = r3;
            r3 = r1;
        }
    }
}
