package com.whatsapp.bottomsheet;

import X.AnonymousClass00C;
import X.C36321k7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.calling.callrating.util.NonDraggableBottomSheetBehaviour;

public class LockableBottomSheetBehavior extends BottomSheetBehavior {
    public boolean A00 = true;

    public void A0H(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        if (this.A00) {
            super.A0H(view, view2, coordinatorLayout, i);
        }
    }

    public void A0I(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        if (this.A00) {
            super.A0I(view, view2, coordinatorLayout, iArr, i, i2, i3);
        }
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00) {
            return false;
        }
        return super.A0L(motionEvent, view, coordinatorLayout);
    }

    public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (!this.A00) {
            return false;
        }
        return super.A0M(motionEvent, view, coordinatorLayout);
    }

    public boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        if (this instanceof NonDraggableBottomSheetBehaviour) {
            AnonymousClass00C.A0D(coordinatorLayout, 0);
            C36321k7.A11(view, view2, view3);
            if (this.A00) {
                this.A0C = 0;
                this.A0b = false;
                if ((i & 2) == 0) {
                    return false;
                }
                return true;
            }
            return false;
        } else if (!this.A00) {
            return false;
        } else {
            this.A0C = 0;
            this.A0b = false;
            if ((i & 2) != 0) {
                return true;
            }
            return false;
        }
    }

    public boolean A0O(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        if (!this.A00) {
            return false;
        }
        return super.A0O(view, view2, coordinatorLayout, f, f2);
    }

    public LockableBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void A0b(boolean z) {
        this.A00 = z;
    }

    public LockableBottomSheetBehavior() {
    }
}
