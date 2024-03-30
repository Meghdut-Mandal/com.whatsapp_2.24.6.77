package com.google.android.material.snackbar;

import X.AnonymousClass0Eq;
import X.C06400Tl;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.SwipeDismissBehavior;

public class BaseTransientBottomBar$Behavior extends SwipeDismissBehavior {
    public final C06400Tl A00 = new C06400Tl(this);

    public boolean A0L(MotionEvent motionEvent, View view, CoordinatorLayout coordinatorLayout) {
        this.A00.A00(motionEvent, view, coordinatorLayout);
        return super.A0L(motionEvent, view, coordinatorLayout);
    }

    public boolean A0R(View view) {
        return view instanceof AnonymousClass0Eq;
    }
}
