package X;

import android.animation.ValueAnimator;
import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: X.3Rq  reason: invalid class name and case insensitive filesystem */
public final class C65333Rq {
    public static int A01;
    public static WeakReference A02;
    public ValueAnimator A00;

    public final void A01(View view, boolean z) {
        AnonymousClass00C.A0D(view, 0);
        if (!z) {
            A00(this);
            view.setVisibility(8);
        } else if (view.getVisibility() == 8) {
            A00(this);
        } else {
            int height = view.getHeight();
            AnonymousClass4VL r3 = new AnonymousClass4VL(view, 24);
            A00(this);
            int[] A1O = C36441kJ.A1O();
            A1O[0] = height;
            ValueAnimator A0C = C36411kG.A0C(A1O, 0);
            this.A00 = A0C;
            if (A0C != null) {
                C36381kD.A14(A0C, 400);
                A0C.addListener(r3);
                C53562rW.A00(A0C, view, 9);
                A0C.setStartDelay(0);
                A0C.start();
            }
        }
    }

    public static final void A00(C65333Rq r1) {
        ValueAnimator valueAnimator = r1.A00;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
        }
        ValueAnimator valueAnimator2 = r1.A00;
        if (valueAnimator2 != null) {
            valueAnimator2.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator3 = r1.A00;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
    }
}
