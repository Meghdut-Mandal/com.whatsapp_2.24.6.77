package X;

import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.09N  reason: invalid class name */
public class AnonymousClass09N extends AnonymousClass09M {
    public static final AnonymousClass09H A00;

    public final void A0F(View view) {
    }

    static {
        WindowInsets windowInsets = WindowInsets.CONSUMED;
        AnonymousClass09H r0 = AnonymousClass09H.A01;
        Objects.requireNonNull(windowInsets);
        A00 = new AnonymousClass09H(windowInsets);
    }

    public AnonymousClass09T A0C(int i) {
        return AnonymousClass09T.A01(this.A04.getInsets(AnonymousClass09U.A00(i)));
    }

    public AnonymousClass09T A0D(int i) {
        return AnonymousClass09T.A01(this.A04.getInsetsIgnoringVisibility(AnonymousClass09U.A00(i)));
    }

    public AnonymousClass09N(AnonymousClass09H r1, WindowInsets windowInsets) {
        super(r1, windowInsets);
    }
}
