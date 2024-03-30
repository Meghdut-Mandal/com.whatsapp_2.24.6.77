package androidx.lifecycle;

import X.AnonymousClass00C;
import X.AnonymousClass012;
import X.AnonymousClass01M;
import X.AnonymousClass01N;
import X.AnonymousClass01P;
import X.AnonymousClass01Y;
import X.AnonymousClass05R;
import X.C005102h;
import X.C07570Yj;
import X.C33331f7;
import java.util.concurrent.CancellationException;

public final class LifecycleCoroutineScopeImpl extends C33331f7 implements AnonymousClass01Y {
    public final AnonymousClass01M A00;
    public final C005102h A01;

    public LifecycleCoroutineScopeImpl(AnonymousClass01M r3, C005102h r4) {
        AnonymousClass00C.A0D(r4, 2);
        this.A00 = r3;
        this.A01 = r4;
        if (((AnonymousClass01N) r3).A02 == AnonymousClass01P.DESTROYED) {
            C07570Yj.A02((CancellationException) null, r4);
        }
    }

    public void BhM(AnonymousClass05R r4, AnonymousClass012 r5) {
        AnonymousClass01M r2 = this.A00;
        if (((AnonymousClass01N) r2).A02.compareTo(AnonymousClass01P.DESTROYED) <= 0) {
            r2.A05(this);
            C07570Yj.A02((CancellationException) null, this.A01);
        }
    }

    public C005102h BAE() {
        return this.A01;
    }
}
