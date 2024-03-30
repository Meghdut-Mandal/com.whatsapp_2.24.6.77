package com.whatsapp.camera;

import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

public class CameraBottomSheetBehavior extends BottomSheetBehavior {
    public boolean A00 = true;
    public final View A01;

    public void A0H(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        if (this.A0J != 4) {
            super.A0H(view, view2, coordinatorLayout, i);
        }
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!coordinatorLayout.A0H(this.A01, (int) motionEvent.getX(), (int) motionEvent.getY()) || !this.A00) {
            return false;
        }
        return super.A0L(motionEvent, view, coordinatorLayout);
    }

    public CameraBottomSheetBehavior(View view) {
        this.A01 = view;
    }

    public void A0b(boolean z) {
        this.A00 = z;
    }
}
