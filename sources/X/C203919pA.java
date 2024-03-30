package X;

import android.animation.ValueAnimator;

/* renamed from: X.9pA  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C203919pA implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ AnonymousClass9NE A02;

    public /* synthetic */ C203919pA(AnonymousClass9NE r1, float f, float f2) {
        this.A02 = r1;
        this.A00 = f;
        this.A01 = f2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass9NE r6 = this.A02;
        float f = this.A00;
        float f2 = this.A01;
        float A03 = C36441kJ.A03(valueAnimator.getAnimatedValue());
        r6.A00 = Math.min(r6.A00, Math.max(f, f2 - ((f2 - f) * (0.5f * A03))));
        float f3 = (float) r6.A01;
        r6.A01 = (int) Math.max(f3 - (A03 * f3), 0.0f);
    }
}
