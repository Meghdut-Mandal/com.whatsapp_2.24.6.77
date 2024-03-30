package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* renamed from: X.4ss  reason: invalid class name and case insensitive filesystem */
public class C99234ss extends BottomSheetBehavior {
    public final /* synthetic */ C142466ov A00;

    public C99234ss(C142466ov r1) {
        this.A00 = r1;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A00.A0G.A0J != 5 || !super.A0L(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }
}
