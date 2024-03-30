package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.6Yh  reason: invalid class name */
public final /* synthetic */ class AnonymousClass6Yh implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ View A01;

    public /* synthetic */ AnonymousClass6Yh(View view, float f) {
        this.A01 = view;
        this.A00 = f;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.setTranslationX(valueAnimator.getAnimatedFraction() * this.A00);
    }
}
