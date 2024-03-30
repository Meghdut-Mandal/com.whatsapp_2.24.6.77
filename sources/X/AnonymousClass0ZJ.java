package X;

import android.animation.ValueAnimator;

/* renamed from: X.0ZJ  reason: invalid class name */
public class AnonymousClass0ZJ implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass0I5 A00;

    public AnonymousClass0ZJ(AnonymousClass0I5 r1) {
        this.A00 = r1;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        int A002 = (int) (AnonymousClass000.A00(valueAnimator) * 255.0f);
        AnonymousClass0I5 r1 = this.A00;
        r1.A0O.setAlpha(A002);
        r1.A0M.setAlpha(A002);
        r1.A0A.invalidate();
    }
}
