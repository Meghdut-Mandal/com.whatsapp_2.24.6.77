package X;

import android.animation.ValueAnimator;
import android.view.ViewGroup;

/* renamed from: X.9hP  reason: invalid class name and case insensitive filesystem */
public class C200439hP implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public final int A01;

    public C200439hP(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.A01;
        Object obj = this.A00;
        if (i != 0) {
            float A03 = C36441kJ.A03(valueAnimator.getAnimatedValue());
            ViewGroup viewGroup = ((AnonymousClass8ZY) obj).A0K;
            viewGroup.setScaleX(A03);
            viewGroup.setScaleY(A03);
            return;
        }
        C165737u4 r2 = (C165737u4) obj;
        if (r2.A0C == C187718yQ.ENABLED) {
            r2.invalidateSelf();
            return;
        }
        AnonymousClass81G r1 = r2.A0K;
        if (r1 != null) {
            r1.A0A(r2.A0b.A00());
        }
    }
}
