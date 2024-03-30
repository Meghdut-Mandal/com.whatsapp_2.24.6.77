package com.whatsapp;

import X.AnonymousClass2xF;
import X.C101044wn;
import X.C34081gQ;
import X.C36361kB;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ViewOutlineProvider;

public class WaDynamicRoundCornerImageView extends C101044wn {
    public float A00;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0P);
            try {
                setRadius(obtainStyledAttributes.getDimension(0, TypedValue.applyDimension(1, 4.0f, C36361kB.A0B(this))));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }

    public void setRadius(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            if (f == 0.0f) {
                if (getClipToOutline()) {
                    setClipToOutline(false);
                }
                setOutlineProvider((ViewOutlineProvider) null);
            } else {
                C34081gQ.A04(this, f);
            }
            invalidateOutline();
        }
    }

    public WaDynamicRoundCornerImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public WaDynamicRoundCornerImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }

    public WaDynamicRoundCornerImageView(Context context) {
        super(context);
    }
}
