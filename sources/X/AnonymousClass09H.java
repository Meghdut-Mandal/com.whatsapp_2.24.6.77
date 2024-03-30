package X;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: X.09H  reason: invalid class name */
public class AnonymousClass09H {
    public static final AnonymousClass09H A01;
    public final AnonymousClass09I A00;

    static {
        AnonymousClass09H r0;
        if (Build.VERSION.SDK_INT >= 30) {
            r0 = AnonymousClass09N.A00;
        } else {
            r0 = AnonymousClass09I.A01;
        }
        A01 = r0;
    }

    public static AnonymousClass09T A00(AnonymousClass09T r5, int i, int i2, int i3, int i4) {
        int max = Math.max(0, r5.A01 - i);
        int max2 = Math.max(0, r5.A03 - i2);
        int max3 = Math.max(0, r5.A02 - i3);
        int max4 = Math.max(0, r5.A00 - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return r5;
        }
        return AnonymousClass09T.A00(max, max2, max3, max4);
    }

    @Deprecated
    public int A02() {
        return this.A00.A0B().A00;
    }

    @Deprecated
    public int A03() {
        return this.A00.A0B().A01;
    }

    @Deprecated
    public int A04() {
        return this.A00.A0B().A02;
    }

    @Deprecated
    public int A05() {
        return this.A00.A0B().A03;
    }

    public WindowInsets A06() {
        AnonymousClass09I r1 = this.A00;
        if (r1 instanceof AnonymousClass09J) {
            return ((AnonymousClass09J) r1).A04;
        }
        return null;
    }

    @Deprecated
    public AnonymousClass09H A07(int i, int i2, int i3, int i4) {
        AnonymousClass09O r0 = new AnonymousClass09O(this);
        AnonymousClass09T A002 = AnonymousClass09T.A00(i, i2, i3, i4);
        AnonymousClass09P r02 = r0.A00;
        r02.A06(A002);
        return r02.A00();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass09H)) {
            return false;
        }
        return C014106d.A01(this.A00, ((AnonymousClass09H) obj).A00);
    }

    public int hashCode() {
        AnonymousClass09I r0 = this.A00;
        if (r0 == null) {
            return 0;
        }
        return r0.hashCode();
    }

    public AnonymousClass09H(WindowInsets windowInsets) {
        AnonymousClass09I r0;
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            r0 = new AnonymousClass09N(this, windowInsets);
        } else if (i >= 29) {
            r0 = new AnonymousClass09M(this, windowInsets);
        } else if (i >= 28) {
            r0 = new AnonymousClass09L(this, windowInsets);
        } else {
            r0 = new AnonymousClass09K(this, windowInsets);
        }
        this.A00 = r0;
    }

    public static AnonymousClass09H A01(View view, WindowInsets windowInsets) {
        Objects.requireNonNull(windowInsets);
        AnonymousClass09H r2 = new AnonymousClass09H(windowInsets);
        if (view != null && C011304x.A02(view)) {
            AnonymousClass09H A08 = C012005e.A08(view);
            AnonymousClass09I r1 = r2.A00;
            r1.A0G(A08);
            r1.A0F(view.getRootView());
        }
        return r2;
    }

    public AnonymousClass09H() {
        this.A00 = new AnonymousClass09I(this);
    }
}
