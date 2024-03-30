package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.transition.Fade;
import android.transition.TransitionValues;
import android.view.ViewGroup;
import android.view.Window;

/* renamed from: X.4cy  reason: invalid class name and case insensitive filesystem */
public final class C92004cy extends Fade {
    public final /* synthetic */ Window A00;
    public final /* synthetic */ AnonymousClass6CU A01;

    public Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        float f;
        AnonymousClass00C.A0D(viewGroup, 0);
        C36321k7.A0x(transitionValues, transitionValues2);
        Animator createAnimator = super.createAnimator(viewGroup, transitionValues, transitionValues2);
        AnonymousClass00C.A0E(createAnimator, "null cannot be cast to non-null type android.animation.ObjectAnimator");
        ObjectAnimator objectAnimator = (ObjectAnimator) createAnimator;
        AnonymousClass6CU r4 = this.A01;
        if (r4.A01 != 0) {
            Window window = this.A00;
            objectAnimator.addUpdateListener(new C133406Yj(objectAnimator, window, r4, window.getStatusBarColor()));
            int navigationBarColor = window.getNavigationBarColor();
            int i = r4.A00;
            Number number = (Number) objectAnimator.getAnimatedValue();
            if (number != null) {
                f = number.floatValue();
            } else {
                f = 0.0f;
            }
            window.setNavigationBarColor(C018107s.A03(f, i, navigationBarColor));
        }
        return objectAnimator;
    }

    public C92004cy(Window window, AnonymousClass6CU r2) {
        this.A01 = r2;
        this.A00 = window;
    }
}
