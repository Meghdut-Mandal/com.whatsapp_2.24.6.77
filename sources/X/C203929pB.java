package X;

import android.animation.ValueAnimator;

/* renamed from: X.9pB  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C203929pB implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ float A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass9NE A03;

    public /* synthetic */ C203929pB(AnonymousClass9NE r1, float f, float f2, int i) {
        this.A03 = r1;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        AnonymousClass9NE r5 = this.A03;
        float f = this.A00;
        float f2 = this.A01;
        int i = this.A02;
        float A032 = C36441kJ.A03(valueAnimator.getAnimatedValue());
        r5.A00 = Math.max(f, ((f2 - f) * A032) + f);
        float f3 = (float) i;
        r5.A01 = (int) Math.min(f3, Math.min(1.2f * A032, A032) * f3);
    }
}
