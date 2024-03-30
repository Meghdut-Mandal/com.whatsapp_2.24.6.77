package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.Paint;
import android.view.View;

/* renamed from: X.0DP  reason: invalid class name */
public class AnonymousClass0DP extends AnimatorListenerAdapter {
    public boolean A00 = false;
    public final View A01;

    public void onAnimationEnd(Animator animator) {
        View view = this.A01;
        AnonymousClass0W5.A02.A04(view, 1.0f);
        if (this.A00) {
            view.setLayerType(0, (Paint) null);
        }
    }

    public void onAnimationStart(Animator animator) {
        View view = this.A01;
        if (A00(view) && view.getLayerType() == 0) {
            this.A00 = true;
            view.setLayerType(2, (Paint) null);
        }
    }

    public AnonymousClass0DP(View view) {
        this.A01 = view;
    }

    public static boolean A00(View view) {
        return view.hasOverlappingRendering();
    }
}
