package X;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* renamed from: X.0tP  reason: invalid class name and case insensitive filesystem */
public class C18590tP implements TimeInterpolator, Interpolator {
    public final int A00;

    public C18590tP(int i) {
        this.A00 = i;
    }

    public float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
