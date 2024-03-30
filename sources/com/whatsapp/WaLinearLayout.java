package com.whatsapp;

import X.AnonymousClass00F;
import X.AnonymousClass04F;
import X.AnonymousClass076;
import X.AnonymousClass08I;
import X.AnonymousClass1JZ;
import X.AnonymousClass2xF;
import X.C38741pg;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class WaLinearLayout extends C38741pg {
    public int A00 = 0;

    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0R);
            this.A00 = obtainStyledAttributes.getResourceId(1, 0);
            boolean z = obtainStyledAttributes.getBoolean(0, false);
            Drawable background = getBackground();
            if (!(background == null || this.A00 == 0)) {
                setBackground(background);
            }
            obtainStyledAttributes.recycle();
            if (z) {
                AnonymousClass04F.A05(this, 0);
                setTag(R.id.bidilayout_ignore, AnonymousClass1JZ.A00);
            }
        }
    }

    public void setBackground(Drawable drawable) {
        if (!(this.A00 == 0 || drawable == null)) {
            drawable = AnonymousClass08I.A01(drawable);
            AnonymousClass076.A06(drawable, AnonymousClass00F.A00(getContext(), this.A00));
        }
        super.setBackground(drawable);
    }

    public WaLinearLayout(Context context) {
        super(context);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context, attributeSet);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A00(context, attributeSet);
    }

    public WaLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context, attributeSet);
    }
}
