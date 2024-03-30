package X;

import android.animation.TimeInterpolator;
import android.view.animation.Interpolator;

/* renamed from: X.6Ye  reason: invalid class name and case insensitive filesystem */
public class C133376Ye implements TimeInterpolator {
    public final Interpolator A00 = C017907q.A00(0.5f, 0.0f, 0.5f, 1.0f);

    public float getInterpolation(float f) {
        if (f < 0.5f) {
            return this.A00.getInterpolation(f * 2.0f);
        }
        return 1.0f - this.A00.getInterpolation((f - 0.5f) * 2.0f);
    }
}
