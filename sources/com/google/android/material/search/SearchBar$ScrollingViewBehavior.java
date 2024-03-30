package com.google.android.material.search;

import X.C06950Vt;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;

public class SearchBar$ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    public boolean A00 = false;

    public boolean A0T() {
        return true;
    }

    public SearchBar$ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean A0C(View view, View view2, CoordinatorLayout coordinatorLayout) {
        boolean A0C = super.A0C(view, view2, coordinatorLayout);
        if (!this.A00 && (view2 instanceof AppBarLayout)) {
            this.A00 = true;
            view2.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT == 21) {
                view2.setOutlineProvider((ViewOutlineProvider) null);
            } else {
                C06950Vt.A00(view2, 0.0f);
                return A0C;
            }
        }
        return A0C;
    }

    public SearchBar$ScrollingViewBehavior() {
    }
}
