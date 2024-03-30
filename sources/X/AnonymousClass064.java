package X;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;

/* renamed from: X.064  reason: invalid class name */
public abstract class AnonymousClass064 {
    public static final TimeInterpolator A00 = new DecelerateInterpolator();
    public static final TimeInterpolator A01 = new AnonymousClass066();
    public static final TimeInterpolator A02 = new AnonymousClass065();
    public static final TimeInterpolator A03 = new LinearInterpolator();
    public static final TimeInterpolator A04 = new AnonymousClass02K();

    public static float A00(float f, float f2, float f3, float f4, float f5) {
        if (f5 <= f3) {
            return f;
        }
        if (f5 >= f4) {
            return f2;
        }
        return f + (((f5 - f3) / (f4 - f3)) * (f2 - f));
    }
}
