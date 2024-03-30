package com.google.android.material.transformation;

import X.AnonymousClass060;
import X.AnonymousClass06I;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {
    public final AnonymousClass06I A00 = new AnonymousClass06I(0);
    public final AnonymousClass06I A01 = new AnonymousClass06I(75);

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A0D(View view, View view2, CoordinatorLayout coordinatorLayout) {
        return view2 instanceof AnonymousClass060;
    }

    public FabTransformationScrimBehavior() {
    }
}
