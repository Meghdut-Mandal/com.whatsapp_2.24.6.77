package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.Window;

/* renamed from: X.6Yi  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6Yi implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ ObjectAnimator A01;
    public final /* synthetic */ Window A02;
    public final /* synthetic */ AnonymousClass6CU A03;

    public /* synthetic */ AnonymousClass6Yi(ObjectAnimator objectAnimator, Window window, AnonymousClass6CU r3, float f) {
        this.A01 = objectAnimator;
        this.A00 = f;
        this.A02 = window;
        this.A03 = r3;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        ObjectAnimator objectAnimator = this.A01;
        float f2 = this.A00;
        Window window = this.A02;
        AnonymousClass6CU r3 = this.A03;
        AnonymousClass00C.A0D(objectAnimator, 0);
        Number number = (Number) objectAnimator.getAnimatedValue();
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        float f3 = (f - f2) / (((float) 1) - f2);
        window.setStatusBarColor(C018107s.A03(f3, r3.A03, -16777216));
        window.setNavigationBarColor(C018107s.A03(f3, r3.A02, -16777216));
    }
}
