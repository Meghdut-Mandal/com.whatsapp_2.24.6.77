package X;

import android.animation.ValueAnimator;

/* renamed from: X.0ZK  reason: invalid class name */
public class AnonymousClass0ZK implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ AnonymousClass081 A01;

    public AnonymousClass0ZK(AnonymousClass081 r1, float f) {
        this.A01 = r1;
        this.A00 = f;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass081.A04(this.A01, AnonymousClass000.A00(valueAnimator), this.A00);
    }
}
