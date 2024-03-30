package com.google.android.material.behavior;

import X.AnonymousClass0HV;
import X.AnonymousClass0R4;
import X.AnonymousClass0V6;
import X.AnonymousClass0XL;
import X.AnonymousClass0Yd;
import X.AnonymousClass0Z5;
import X.C011504z;
import X.C012005e;
import X.C17120ql;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

public class SwipeDismissBehavior extends AnonymousClass0XL {
    public float A00 = 0.5f;
    public float A01 = 0.0f;
    public int A02 = 2;
    public AnonymousClass0Z5 A03;
    public C17120ql A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass0V6 A07 = new AnonymousClass0HV(this);

    public boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i) {
        if (C011504z.A00(view) == 0) {
            C011504z.A06(view, 1);
            C012005e.A0R(view, 1048576);
            C012005e.A0O(view, 0);
            if (A0R(view)) {
                C012005e.A0Y(view, AnonymousClass0Yd.A0D, new AnonymousClass0R4(this, 2), (CharSequence) null);
            }
        }
        return false;
    }

    public boolean A0R(View view) {
        return true;
    }

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        boolean z = this.A06;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.A0H(view, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.A06 = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.A06 = false;
        }
        if (!z) {
            return false;
        }
        AnonymousClass0Z5 r1 = this.A03;
        if (r1 == null) {
            r1 = AnonymousClass0Z5.A01(coordinatorLayout, this.A07);
            this.A03 = r1;
        }
        if (this.A05 || !r1.A0F(motionEvent)) {
            return false;
        }
        return true;
    }

    public boolean A0M(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        if (this.A03 == null) {
            return false;
        }
        if (this.A05 && motionEvent.getActionMasked() == 3) {
            return true;
        }
        this.A03.A0C(motionEvent);
        return true;
    }
}
