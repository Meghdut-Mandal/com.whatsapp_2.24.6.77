package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.9lf  reason: invalid class name and case insensitive filesystem */
public class C202369lf implements ValueAnimator.AnimatorUpdateListener {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C202369lf(Object obj, int i, Object obj2, int i2, int i3) {
        this.A04 = i3;
        this.A02 = obj2;
        this.A03 = obj;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view = (View) this.A03;
        int i = this.A00;
        int i2 = this.A01;
        view.setBackgroundColor(AnonymousClass000.A0I(valueAnimator.getAnimatedValue()));
        if (i == C36411kG.A01(((C201679k6) this.A02).A01) && AnonymousClass000.A0I(valueAnimator.getAnimatedValue()) == i2) {
            view.setBackgroundResource(0);
        }
    }
}
