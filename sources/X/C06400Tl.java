package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

/* renamed from: X.0Tl  reason: invalid class name and case insensitive filesystem */
public class C06400Tl {
    public C16120ob A00;

    public C06400Tl(SwipeDismissBehavior swipeDismissBehavior) {
        swipeDismissBehavior.A01 = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.A00 = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.A02 = 0;
    }

    public void A00(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                C133126Ww.A00().A06(this.A00);
            }
        } else if (coordinatorLayout.A0H(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
            C133126Ww.A00().A05(this.A00);
        }
    }
}
