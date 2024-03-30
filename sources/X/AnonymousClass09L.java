package X;

import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.09L  reason: invalid class name */
public class AnonymousClass09L extends AnonymousClass09K {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass09L)) {
            return false;
        }
        AnonymousClass09J r4 = (AnonymousClass09J) obj;
        return Objects.equals(this.A04, r4.A04) && Objects.equals(this.A00, r4.A00);
    }

    public AnonymousClass0XH A05() {
        return AnonymousClass0XH.A00(this.A04.getDisplayCutout());
    }

    public AnonymousClass09H A06() {
        WindowInsets consumeDisplayCutout = this.A04.consumeDisplayCutout();
        AnonymousClass09H r0 = AnonymousClass09H.A01;
        Objects.requireNonNull(consumeDisplayCutout);
        return new AnonymousClass09H(consumeDisplayCutout);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public AnonymousClass09L(AnonymousClass09H r1, WindowInsets windowInsets) {
        super(r1, windowInsets);
    }
}
