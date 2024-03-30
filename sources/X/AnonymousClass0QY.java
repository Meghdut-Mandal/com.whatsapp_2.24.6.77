package X;

import android.animation.ValueAnimator;
import android.os.Handler;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.0QY  reason: invalid class name */
public class AnonymousClass0QY implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public AnonymousClass0QY(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.A01) {
            case 0:
                ((AnonymousClass0ZB) this.A00).A00 = valueAnimator.getAnimatedFraction();
                return;
            case 1:
                ((CollapsingToolbarLayout) this.A00).setScrimAlpha(AnonymousClass000.A0I(valueAnimator.getAnimatedValue()));
                return;
            case 2:
                float A002 = AnonymousClass000.A00(valueAnimator);
                C012505l r2 = ((BottomSheetBehavior) this.A00).A0O;
                if (r2 != null) {
                    AnonymousClass06X r1 = r2.A01;
                    if (r1.A01 != A002) {
                        r1.A01 = A002;
                        r2.A03 = true;
                        r2.invalidateSelf();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                ((AnonymousClass6YL) this.A00).A0J.setAlpha(AnonymousClass000.A00(valueAnimator));
                return;
            case 4:
                float A003 = AnonymousClass000.A00(valueAnimator);
                AnonymousClass0Eq r0 = ((AnonymousClass6YL) this.A00).A0J;
                r0.setScaleX(A003);
                r0.setScaleY(A003);
                return;
            default:
                int A0I = AnonymousClass000.A0I(valueAnimator.getAnimatedValue());
                Handler handler = AnonymousClass6YL.A0M;
                ((AnonymousClass6YL) this.A00).A0J.setTranslationY((float) A0I);
                return;
        }
    }
}
