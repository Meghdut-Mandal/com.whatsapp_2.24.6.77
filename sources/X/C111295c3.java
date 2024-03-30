package X;

import android.animation.ValueAnimator;
import android.view.View;

/* renamed from: X.5c3  reason: invalid class name and case insensitive filesystem */
public class C111295c3 implements ValueAnimator.AnimatorUpdateListener {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public C111295c3(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        if (this.A03 != 0) {
            C93004fN.A00((View) this.A01, (View) this.A02, (C93004fN) this.A00, valueAnimator.getAnimatedFraction());
            return;
        }
        AnonymousClass6MO r1 = (AnonymousClass6MO) this.A00;
        AnonymousClass6JI.A00((C100674vP) this.A01, r1, (C160377ku) this.A02);
    }
}
