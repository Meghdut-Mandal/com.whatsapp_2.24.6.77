package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;

/* renamed from: X.06B  reason: invalid class name */
public abstract class AnonymousClass06B extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
    public float A00;
    public float A01;
    public boolean A02;
    public final /* synthetic */ AnonymousClass063 A03;

    public abstract float A00();

    public AnonymousClass06B(AnonymousClass063 r1) {
        this.A03 = r1;
    }

    public void onAnimationEnd(Animator animator) {
        AnonymousClass063 r2 = this.A03;
        float f = (float) ((int) this.A00);
        C012505l r0 = r2.A0D;
        if (r0 != null) {
            r0.A09(f);
        }
        this.A02 = false;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        if (!this.A02) {
            C012505l r0 = this.A03.A0D;
            if (r0 == null) {
                f = 0.0f;
            } else {
                f = r0.A01.A00;
            }
            this.A01 = f;
            this.A00 = A00();
            this.A02 = true;
        }
        AnonymousClass063 r3 = this.A03;
        float f2 = this.A01;
        float animatedFraction = (float) ((int) (f2 + ((this.A00 - f2) * valueAnimator.getAnimatedFraction())));
        C012505l r02 = r3.A0D;
        if (r02 != null) {
            r02.A09(animatedFraction);
        }
    }
}
