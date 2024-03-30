package com.google.android.material.floatingactionbutton;

import X.AnonymousClass001;
import X.AnonymousClass0XL;
import X.C02460Ak;
import X.C27931Qk;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.List;

public class ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior extends AnonymousClass0XL {
    public /* bridge */ /* synthetic */ boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i) {
        List A0C = coordinatorLayout.A0C((View) null);
        int size = A0C.size();
        int i2 = 0;
        while (i2 < size) {
            View view2 = (View) A0C.get(i2);
            if (view2 instanceof AppBarLayout) {
                throw AnonymousClass001.A0A("getLayoutParams");
            }
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (!(layoutParams instanceof C02460Ak) || !(((C02460Ak) layoutParams).A0B instanceof BottomSheetBehavior)) {
                i2++;
            } else {
                throw AnonymousClass001.A0A("getLayoutParams");
            }
        }
        coordinatorLayout.A0F((View) null, i);
        return true;
    }

    public /* bridge */ /* synthetic */ boolean A0C(View view, View view2, CoordinatorLayout coordinatorLayout) {
        if (view2 instanceof AppBarLayout) {
            throw AnonymousClass001.A0A("getLayoutParams");
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        if (!(layoutParams instanceof C02460Ak) || !(((C02460Ak) layoutParams).A0B instanceof BottomSheetBehavior)) {
            return false;
        }
        throw AnonymousClass001.A0A("getLayoutParams");
    }

    public void A0K(C02460Ak r2) {
        if (r2.A02 == 0) {
            r2.A02 = 80;
        }
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C27931Qk.A0B);
        obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
    }

    public /* bridge */ /* synthetic */ boolean A0B(Rect rect, View view, CoordinatorLayout coordinatorLayout) {
        return false;
    }

    public ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior() {
    }
}
