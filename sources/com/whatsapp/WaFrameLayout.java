package com.whatsapp;

import X.AnonymousClass076;
import X.AnonymousClass08I;
import X.AnonymousClass2xF;
import X.C36381kD;
import X.C38311oD;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

public class WaFrameLayout extends C38311oD {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public boolean A04;

    private void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            this.A04 = isPressed();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0Q);
            this.A01 = obtainStyledAttributes.getResourceId(1, 0);
            this.A00 = obtainStyledAttributes.getResourceId(0, 0);
            if (!(getBackground() == null || this.A01 == 0)) {
                setBackgroundDrawable(getBackground());
            }
            this.A03 = obtainStyledAttributes.getResourceId(3, 0);
            this.A02 = obtainStyledAttributes.getResourceId(2, 0);
            if (!(getForeground() == null || this.A03 == 0)) {
                setForeground(getForeground());
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void setBackgroundDrawable(Drawable drawable) {
        int i;
        if (!(this.A01 == 0 || drawable == null)) {
            drawable = AnonymousClass08I.A01(drawable);
            if (!isPressed() || (i = this.A00) == 0) {
                i = this.A01;
            }
            AnonymousClass076.A06(drawable, C36381kD.A05(this, i));
        }
        super.setBackgroundDrawable(drawable);
    }

    public void setForeground(Drawable drawable) {
        int i;
        if (!(this.A03 == 0 || drawable == null)) {
            drawable = AnonymousClass08I.A01(drawable);
            if (!isPressed() || (i = this.A02) == 0) {
                i = this.A03;
            }
            AnonymousClass076.A06(drawable, C36381kD.A05(this, i));
        }
        super.setForeground(drawable);
    }

    public WaFrameLayout(Context context) {
        super(context);
        C38311oD.A00(this);
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
        if (isPressed() != this.A04) {
            this.A04 = isPressed();
            setBackgroundDrawable(getBackground());
            setForeground(getForeground());
        }
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C38311oD.A00(this);
        A01(context, attributeSet);
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        C38311oD.A00(this);
    }

    public WaFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C38311oD.A00(this);
        A01(context, attributeSet);
    }
}
