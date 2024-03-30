package X;

import android.animation.ValueAnimator;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

/* renamed from: X.0ZL  reason: invalid class name */
public class AnonymousClass0ZL implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ CoordinatorLayout A00;
    public final /* synthetic */ AppBarLayout.BaseBehavior A01;
    public final /* synthetic */ AppBarLayout A02;

    public AnonymousClass0ZL(CoordinatorLayout coordinatorLayout, AppBarLayout.BaseBehavior baseBehavior, AppBarLayout appBarLayout) {
        this.A01 = baseBehavior;
        this.A00 = coordinatorLayout;
        this.A02 = appBarLayout;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.A01.A0U(this.A02, this.A00, AnonymousClass000.A0I(valueAnimator.getAnimatedValue()));
    }
}
