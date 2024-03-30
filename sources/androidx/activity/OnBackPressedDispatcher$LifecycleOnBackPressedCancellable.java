package androidx.activity;

import X.AnonymousClass012;
import X.AnonymousClass01M;
import X.AnonymousClass01W;
import X.AnonymousClass01Y;
import X.AnonymousClass023;
import X.AnonymousClass04V;
import X.AnonymousClass05R;
import X.AnonymousClass09E;

public class OnBackPressedDispatcher$LifecycleOnBackPressedCancellable implements AnonymousClass04V, AnonymousClass01Y {
    public AnonymousClass04V A00;
    public final AnonymousClass023 A01;
    public final AnonymousClass01M A02;
    public final /* synthetic */ AnonymousClass01W A03;

    public OnBackPressedDispatcher$LifecycleOnBackPressedCancellable(AnonymousClass023 r1, AnonymousClass01W r2, AnonymousClass01M r3) {
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r1;
        r3.A04(this);
    }

    public void BhM(AnonymousClass05R r5, AnonymousClass012 r6) {
        if (r5 == AnonymousClass05R.ON_START) {
            AnonymousClass01W r3 = this.A03;
            AnonymousClass023 r2 = this.A01;
            r3.A00.add(r2);
            AnonymousClass09E r1 = new AnonymousClass09E(r2, r3);
            r2.A00.add(r1);
            this.A00 = r1;
        } else if (r5 == AnonymousClass05R.ON_STOP) {
            AnonymousClass04V r0 = this.A00;
            if (r0 != null) {
                r0.cancel();
            }
        } else if (r5 == AnonymousClass05R.ON_DESTROY) {
            cancel();
        }
    }

    public void cancel() {
        this.A02.A05(this);
        this.A01.A00.remove(this);
        AnonymousClass04V r0 = this.A00;
        if (r0 != null) {
            r0.cancel();
            this.A00 = null;
        }
    }
}
