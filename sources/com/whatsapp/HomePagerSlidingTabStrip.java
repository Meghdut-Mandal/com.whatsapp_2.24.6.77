package com.whatsapp;

import X.C36411kG;
import X.C66063Un;
import android.animation.LayoutTransition;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

public class HomePagerSlidingTabStrip extends PagerSlidingTabStrip {
    public boolean A00;

    public HomePagerSlidingTabStrip(Context context) {
        super(context, (AttributeSet) null);
        A02();
    }

    public void A04(View view, int i) {
        LayoutTransition layoutTransition;
        super.A04(view, i);
        if (view instanceof ViewGroup) {
            View A0L = C36411kG.A0L((ViewGroup) view);
            if ((A0L instanceof ViewGroup) && (layoutTransition = ((ViewGroup) A0L).getLayoutTransition()) != null) {
                layoutTransition.addTransitionListener(new C66063Un(this));
            }
        }
    }

    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
    }

    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A02();
    }

    public HomePagerSlidingTabStrip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
    }
}
