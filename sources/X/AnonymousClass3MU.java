package X;

import android.view.View;
import android.view.animation.ScaleAnimation;

/* renamed from: X.3MU  reason: invalid class name */
public abstract class AnonymousClass3MU {
    public static void A01(View view, boolean z, boolean z2) {
        A00(view, 125, z, z2);
    }

    public static void A00(View view, int i, boolean z, boolean z2) {
        int visibility = view.getVisibility();
        if (z) {
            if (visibility != 0) {
                view.setVisibility(0);
                if (z2) {
                    ScaleAnimation A0M = C36391kE.A0M(0.0f, 1.0f);
                    A0M.setDuration((long) i);
                    C36381kD.A1C(A0M);
                    A0M.setFillBefore(true);
                    view.startAnimation(A0M);
                }
            }
        } else if (visibility == 0) {
            if (z2) {
                ScaleAnimation A0M2 = C36391kE.A0M(1.0f, 0.0f);
                A0M2.setDuration((long) i);
                C36381kD.A1C(A0M2);
                A0M2.setFillBefore(true);
                view.startAnimation(A0M2);
            }
            view.setVisibility(4);
        }
    }
}
