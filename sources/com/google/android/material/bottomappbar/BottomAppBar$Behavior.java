package com.google.android.material.bottomappbar;

import X.AnonymousClass001;
import X.C18310sx;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import java.lang.ref.WeakReference;

public class BottomAppBar$Behavior extends HideBottomViewOnScrollBehavior {
    public WeakReference A00;
    public final Rect A01 = AnonymousClass001.A06();
    public final View.OnLayoutChangeListener A02 = new C18310sx(this, 1);

    public /* bridge */ /* synthetic */ boolean A0P(View view, CoordinatorLayout coordinatorLayout, int i) {
        this.A00 = AnonymousClass001.A0F((Object) null);
        throw AnonymousClass001.A0A("findDependentView");
    }

    public /* bridge */ /* synthetic */ boolean A0N(View view, View view2, View view3, CoordinatorLayout coordinatorLayout, int i, int i2) {
        throw AnonymousClass001.A0A("getHideOnScroll");
    }

    public BottomAppBar$Behavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public BottomAppBar$Behavior() {
    }
}
