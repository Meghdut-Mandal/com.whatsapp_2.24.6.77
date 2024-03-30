package com.whatsapp.biz.catalog.view;

import X.AnonymousClass2x6;
import X.C92874eu;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;

public class AspectRatioFrameLayout extends C92874eu {
    public float A00;

    public void A02(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, AnonymousClass2x6.A00, 0, 0);
            try {
                this.A00 = obtainStyledAttributes.getFloat(0, this.A00);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = 1.0f;
        A02(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i)) / this.A00), 1073741824);
        } else if (mode2 == 1073741824) {
            i = View.MeasureSpec.makeMeasureSpec((int) (((float) View.MeasureSpec.getSize(i2)) * this.A00), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public AspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }
}
