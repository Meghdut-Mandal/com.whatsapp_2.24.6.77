package X;

import android.animation.ValueAnimator;
import java.lang.ref.WeakReference;

/* renamed from: X.3NJ  reason: invalid class name */
public final class AnonymousClass3NJ {
    public static int A01;
    public static WeakReference A02;
    public ValueAnimator A00;

    public static final void A00(AnonymousClass3NJ r1) {
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = r1.A00;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = r1.A00;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }
}
