package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.3Uu  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C66133Uu implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ C66133Uu(View view, boolean z) {
        this.A00 = view;
        this.A01 = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float animatedFraction;
        View view = this.A00;
        boolean z = this.A01;
        int A012 = C36361kB.A01(valueAnimator);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = A012;
            view.setLayoutParams(layoutParams);
        }
        if (z) {
            animatedFraction = valueAnimator.getAnimatedFraction();
        } else {
            animatedFraction = 1.0f - valueAnimator.getAnimatedFraction();
        }
        view.setAlpha(animatedFraction);
    }
}
