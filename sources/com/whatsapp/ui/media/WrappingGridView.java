package com.whatsapp.ui.media;

import X.C05250Oz;
import X.C36381kD;
import X.C36391kE;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;

public final class WrappingGridView extends GridView {
    public WrappingGridView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    public void onMeasure(int i, int i2) {
        if (getLayoutParams().height == -2) {
            i2 = View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }

    public /* synthetic */ WrappingGridView(Context context, AttributeSet attributeSet, int i, int i2, C05250Oz r7) {
        this(context, C36381kD.A0I(attributeSet, i2), C36391kE.A01(i2, i));
    }

    public WrappingGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public WrappingGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
