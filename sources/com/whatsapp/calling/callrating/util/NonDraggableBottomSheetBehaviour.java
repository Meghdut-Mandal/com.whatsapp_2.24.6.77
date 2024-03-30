package com.whatsapp.calling.callrating.util;

import X.AnonymousClass00C;
import X.C36321k7;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.whatsapp.bottomsheet.LockableBottomSheetBehavior;

public final class NonDraggableBottomSheetBehaviour extends LockableBottomSheetBehavior {
    public void A0H(View view, View view2, CoordinatorLayout coordinatorLayout, int i) {
        AnonymousClass00C.A0D(coordinatorLayout, 0);
        C36321k7.A0x(view, view2);
        if (this.A00) {
            super.A0H(view, view2, coordinatorLayout, i);
        }
    }

    public void A0I(View view, View view2, CoordinatorLayout coordinatorLayout, int[] iArr, int i, int i2, int i3) {
        AnonymousClass00C.A0D(coordinatorLayout, 0);
        C36321k7.A0x(view, view2);
        AnonymousClass00C.A0D(iArr, 5);
        if (this.A00) {
            super.A0I(view, view2, coordinatorLayout, iArr, i, i2, i3);
        }
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        AnonymousClass00C.A0D(coordinatorLayout, 0);
        C36321k7.A0x(view, motionEvent);
        if (!this.A00 || !super.A0L(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }

    public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        AnonymousClass00C.A0D(coordinatorLayout, 0);
        C36321k7.A0x(view, motionEvent);
        if (!this.A00 || !super.A0M(motionEvent, view, coordinatorLayout)) {
            return false;
        }
        return true;
    }

    public boolean A0O(View view, View view2, CoordinatorLayout coordinatorLayout, float f, float f2) {
        AnonymousClass00C.A0D(view2, 2);
        if (!this.A00 || !super.A0O(view, view2, coordinatorLayout, f, f2)) {
            return false;
        }
        return true;
    }

    public NonDraggableBottomSheetBehaviour(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NonDraggableBottomSheetBehaviour() {
        super((Context) null, (AttributeSet) null);
    }
}
