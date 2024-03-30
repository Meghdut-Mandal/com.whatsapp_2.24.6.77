package X;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.camera.CameraBottomSheetBehavior;

/* renamed from: X.53h  reason: invalid class name and case insensitive filesystem */
public class C1030353h extends CameraBottomSheetBehavior {
    public boolean A00;
    public final /* synthetic */ AnonymousClass6F9 A01;

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A00 = true;
        return super.A0P(view, coordinatorLayout, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1030353h(View view, AnonymousClass6F9 r2) {
        super(view);
        this.A01 = r2;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00 || !super.A0L(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        if (motionEvent.getPointerCount() < 2 || motionEvent.getY() > ((float) this.A01.A08.getTop())) {
            return true;
        }
        return false;
    }

    public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00 || !super.A0M(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }
}
