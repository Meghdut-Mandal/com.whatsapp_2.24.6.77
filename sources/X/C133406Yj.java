package X;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.Window;

/* renamed from: X.6Yj  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C133406Yj implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ObjectAnimator A01;
    public final /* synthetic */ Window A02;
    public final /* synthetic */ AnonymousClass6CU A03;

    public /* synthetic */ C133406Yj(ObjectAnimator objectAnimator, Window window, AnonymousClass6CU r3, int i) {
        this.A02 = window;
        this.A03 = r3;
        this.A00 = i;
        this.A01 = objectAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        Window window = this.A02;
        AnonymousClass6CU r1 = this.A03;
        int i = this.A00;
        ObjectAnimator objectAnimator = this.A01;
        AnonymousClass00C.A0D(objectAnimator, 3);
        int i2 = r1.A01;
        Number number = (Number) objectAnimator.getAnimatedValue();
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        window.setStatusBarColor(C018107s.A03(f, i2, i));
    }
}
