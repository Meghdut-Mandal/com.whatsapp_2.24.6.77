package X;

import android.view.View;
import android.view.WindowInsetsAnimation;
import android.view.animation.Interpolator;

/* renamed from: X.0Gy  reason: invalid class name */
public class AnonymousClass0Gy extends AnonymousClass0Up {
    public final WindowInsetsAnimation A00;

    public AnonymousClass0Gy(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, (Interpolator) null, 0);
        this.A00 = windowInsetsAnimation;
    }

    public static WindowInsetsAnimation.Bounds A00(AnonymousClass0Y8 r3) {
        return new WindowInsetsAnimation.Bounds(r3.A00.A03(), r3.A01.A03());
    }

    public static void A03(View view, C06650Um r2) {
        AnonymousClass0EW r0;
        if (r2 != null) {
            r0 = new AnonymousClass0EW(r2);
        } else {
            r0 = null;
        }
        view.setWindowInsetsAnimationCallback(r0);
    }

    public float A05() {
        return this.A00.getInterpolatedFraction();
    }

    public int A06() {
        return this.A00.getTypeMask();
    }

    public long A07() {
        return this.A00.getDurationMillis();
    }

    public void A08(float f) {
        this.A00.setFraction(f);
    }

    public static AnonymousClass09T A01(WindowInsetsAnimation.Bounds bounds) {
        return AnonymousClass09T.A01(bounds.getUpperBound());
    }

    public static AnonymousClass09T A02(WindowInsetsAnimation.Bounds bounds) {
        return AnonymousClass09T.A01(bounds.getLowerBound());
    }

    public AnonymousClass0Gy(int i, Interpolator interpolator, long j) {
        this(new WindowInsetsAnimation(i, interpolator, j));
    }
}
