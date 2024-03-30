package X;

import androidx.lifecycle.LifecycleController$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;

/* renamed from: X.3Dx  reason: invalid class name and case insensitive filesystem */
public final class C61893Dx {
    public final AnonymousClass3Dw A00;
    public final AnonymousClass01P A01;
    public final AnonymousClass01M A02;
    public final AnonymousClass01Y A03;

    public final void A00() {
        this.A02.A05(this.A03);
        AnonymousClass3Dw r1 = this.A00;
        r1.A00 = true;
        r1.A00();
    }

    public C61893Dx(AnonymousClass3Dw r4, AnonymousClass01P r5, AnonymousClass01M r6, C007403e r7) {
        C36321k7.A11(r6, r5, r4);
        this.A02 = r6;
        this.A01 = r5;
        this.A00 = r4;
        LifecycleController$$ExternalSyntheticLambda0 lifecycleController$$ExternalSyntheticLambda0 = new LifecycleController$$ExternalSyntheticLambda0(this, r7);
        this.A03 = lifecycleController$$ExternalSyntheticLambda0;
        if (((AnonymousClass01N) r6).A02 == AnonymousClass01P.DESTROYED) {
            r7.B2S((CancellationException) null);
            A00();
            return;
        }
        r6.A04(lifecycleController$$ExternalSyntheticLambda0);
    }
}
