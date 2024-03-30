package X;

import android.animation.LayoutTransition;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;

/* renamed from: X.1kS  reason: invalid class name and case insensitive filesystem */
public class C36531kS extends LayoutTransition {
    public static ObjectAnimator A00(boolean z) {
        float f = z ^ true ? 1.0f : 0.0f;
        float f2 = z ? 1.0f : 0.0f;
        return ObjectAnimator.ofPropertyValuesHolder((Object) null, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", new float[]{f, f2}), PropertyValuesHolder.ofFloat("scaleY", new float[]{f, f2})});
    }

    public C36531kS() {
        setAnimator(2, A00(true));
        setAnimator(3, A00(false));
        setDuration(100);
        setStartDelay(2, 0);
        setStartDelay(0, 0);
        setStartDelay(1, 0);
    }
}
