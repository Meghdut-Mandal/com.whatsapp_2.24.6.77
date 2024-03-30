package X;

import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.09K  reason: invalid class name */
public class AnonymousClass09K extends AnonymousClass09J {
    public AnonymousClass09T A00 = null;

    public final AnonymousClass09T A02() {
        AnonymousClass09T r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        WindowInsets windowInsets = this.A04;
        AnonymousClass09T A002 = AnonymousClass09T.A00(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        this.A00 = A002;
        return A002;
    }

    public AnonymousClass09H A07() {
        WindowInsets consumeStableInsets = this.A04.consumeStableInsets();
        AnonymousClass09H r0 = AnonymousClass09H.A01;
        Objects.requireNonNull(consumeStableInsets);
        return new AnonymousClass09H(consumeStableInsets);
    }

    public AnonymousClass09H A08() {
        WindowInsets consumeSystemWindowInsets = this.A04.consumeSystemWindowInsets();
        AnonymousClass09H r0 = AnonymousClass09H.A01;
        Objects.requireNonNull(consumeSystemWindowInsets);
        return new AnonymousClass09H(consumeSystemWindowInsets);
    }

    public boolean A0A() {
        return this.A04.isConsumed();
    }

    public AnonymousClass09K(AnonymousClass09H r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
    }

    public void A09(AnonymousClass09T r1) {
        this.A00 = r1;
    }
}
