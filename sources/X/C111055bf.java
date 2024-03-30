package X;

import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;

/* renamed from: X.5bf  reason: invalid class name and case insensitive filesystem */
public abstract class C111055bf {
    public static final void A00(AnonymousClass66R r3) {
        AnonymousClass00C.A0D(r3, 0);
        float[] A0v = C90524aI.A0v();
        // fill-array-data instruction
        A0v[0] = 0;
        A0v[1] = 1065353216;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
        ofFloat.setDuration(250);
        ofFloat.setInterpolator(new OvershootInterpolator(1.2f));
        C162337oQ.A00(ofFloat, r3, 23);
        C111565cU.A00(ofFloat, r3, 24);
        ofFloat.start();
    }
}
