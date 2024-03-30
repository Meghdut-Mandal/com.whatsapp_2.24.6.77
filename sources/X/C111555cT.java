package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.5cT  reason: invalid class name and case insensitive filesystem */
public abstract class C111555cT {
    public static final ValueAnimator A00(View view, Runnable runnable, int i) {
        int height = view.getHeight();
        int[] A1O = C36441kJ.A1O();
        A1O[0] = height;
        A1O[1] = i;
        ValueAnimator ofInt = ValueAnimator.ofInt(A1O);
        C111565cU.A00(ofInt, view, 35);
        ofInt.setInterpolator(new AnonymousClass065());
        ofInt.setDuration(((long) AnonymousClass000.A05(height, i)) / 8);
        C162337oQ.A00(ofInt, runnable, 28);
        return ofInt;
    }
}
