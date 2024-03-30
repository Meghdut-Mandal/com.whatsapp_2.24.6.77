package com.whatsapp.checkbox;

import X.C18820ts;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36921lW;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;

public class RtlCheckBox extends AppCompatCheckBox {
    public C18820ts A00;
    public int A01;
    public Drawable A02;

    public RtlCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    private void A00() {
        if (this.A00 == null) {
            this.A00 = C36371kC.A0P(getContext()).BxU();
        }
        if (!isInEditMode() && C36401kF.A1X(this.A00)) {
            setBackgroundDrawable((Drawable) null);
            this.A01 = getPaddingLeft();
            int min = Math.min(this.A01, getPaddingRight());
            setPadding(min, getPaddingTop(), min, getPaddingBottom());
        }
    }

    public void setButtonDrawable(Drawable drawable) {
        if (this.A00 == null) {
            this.A00 = C36371kC.A0P(getContext()).BxU();
        }
        if (!isInEditMode() && !C36351kA.A1Y(this.A00)) {
            this.A02 = drawable;
            drawable = new C36921lW(drawable, this);
        }
        super.setButtonDrawable(drawable);
    }

    public int getCompoundPaddingLeft() {
        if (isInEditMode() || C36351kA.A1Y(this.A00)) {
            return super.getCompoundPaddingLeft();
        }
        return super.getPaddingLeft();
    }

    public int getCompoundPaddingRight() {
        if (isInEditMode() || C36351kA.A1Y(this.A00)) {
            return super.getCompoundPaddingRight();
        }
        int paddingRight = super.getPaddingRight();
        Drawable drawable = this.A02;
        if (drawable != null) {
            return paddingRight + Math.max(this.A01, drawable.getIntrinsicWidth());
        }
        return paddingRight;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!isInEditMode() && C36401kF.A1X(this.A00) && this.A02 != null) {
            int gravity = getGravity() & 112;
            int intrinsicHeight = this.A02.getIntrinsicHeight();
            int intrinsicWidth = this.A02.getIntrinsicWidth();
            int i = 0;
            if (gravity == 16) {
                i = (getHeight() - intrinsicHeight) / 2;
            } else if (gravity == 80) {
                i = getHeight() - intrinsicHeight;
            }
            int width = getWidth() - intrinsicWidth;
            int width2 = getWidth();
            this.A02.setBounds(width, i, width2, intrinsicHeight + i);
            this.A02.draw(canvas);
        }
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    public RtlCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }
}
