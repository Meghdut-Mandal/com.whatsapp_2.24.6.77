package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.9p9  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C203909p9 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ValueAnimator A00;
    public final /* synthetic */ AnonymousClass8ZY A01;

    public /* synthetic */ C203909p9(ValueAnimator valueAnimator, AnonymousClass8ZY r2) {
        this.A01 = r2;
        this.A00 = valueAnimator;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass8ZY r1 = this.A01;
        int A0I = AnonymousClass000.A0I(this.A00.getAnimatedValue());
        ViewGroup viewGroup = r1.A0K;
        ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
        layoutParams.width = A0I;
        layoutParams.height = A0I;
        viewGroup.setLayoutParams(layoutParams);
    }
}
