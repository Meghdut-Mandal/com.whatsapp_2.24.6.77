package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.21L  reason: invalid class name */
public class AnonymousClass21L extends BottomSheetBehavior {
    public final /* synthetic */ C47592fB A00;

    public AnonymousClass21L(C47592fB r1) {
        this.A00 = r1;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A00.A01.A0J == 3 || motionEvent.getPointerCount() >= 2 || !super.A0L(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }

    public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A00.A01.A0J == 3) {
            return false;
        }
        try {
            return super.A0M(motionEvent, view, coordinatorLayout);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i) {
        super.A0P(view, coordinatorLayout, i);
        C012005e.A0Q(view, -view.getTop());
        return true;
    }
}
