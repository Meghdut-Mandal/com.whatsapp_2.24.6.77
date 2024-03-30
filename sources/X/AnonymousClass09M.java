package X;

import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.09M  reason: invalid class name */
public class AnonymousClass09M extends AnonymousClass09L {
    public AnonymousClass09T A00 = null;
    public AnonymousClass09T A01 = null;
    public AnonymousClass09T A02 = null;

    public void A09(AnonymousClass09T r1) {
    }

    public AnonymousClass09T A01() {
        AnonymousClass09T r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass09T A012 = AnonymousClass09T.A01(this.A04.getMandatorySystemGestureInsets());
        this.A00 = A012;
        return A012;
    }

    public AnonymousClass09T A03() {
        AnonymousClass09T r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass09T A012 = AnonymousClass09T.A01(this.A04.getSystemGestureInsets());
        this.A01 = A012;
        return A012;
    }

    public AnonymousClass09T A04() {
        AnonymousClass09T r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass09T A012 = AnonymousClass09T.A01(this.A04.getTappableElementInsets());
        this.A02 = A012;
        return A012;
    }

    public AnonymousClass09H A0E(int i, int i2, int i3, int i4) {
        WindowInsets inset = this.A04.inset(i, i2, i3, i4);
        AnonymousClass09H r0 = AnonymousClass09H.A01;
        Objects.requireNonNull(inset);
        return new AnonymousClass09H(inset);
    }

    public AnonymousClass09M(AnonymousClass09H r2, WindowInsets windowInsets) {
        super(r2, windowInsets);
    }
}
