package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.21K  reason: invalid class name */
public class AnonymousClass21K extends BottomSheetBehavior {
    public float A00;
    public boolean A01;
    public final /* synthetic */ C47592fB A02;

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A01 = true;
        return super.A0P(view, coordinatorLayout, i);
    }

    public AnonymousClass21K(C47592fB r1) {
        this.A02 = r1;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if ((!this.A01 && view.isShown()) || motionEvent.getPointerCount() >= 2) {
            return false;
        }
        boolean A0L = super.A0L(motionEvent, view, coordinatorLayout);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A00 = motionEvent.getY();
        } else if (actionMasked == 2 && this.A00 < motionEvent.getY() && this.A0J == 4) {
            return false;
        } else {
            return A0L;
        }
        return A0L;
    }
}
