package com.whatsapp.components;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass2xF;
import X.C111565cU;
import X.C162337oQ;
import X.C18820ts;
import X.C36351kA;
import X.C36391kE;
import X.C36401kF;
import X.C36441kJ;
import X.C90524aI;
import X.C92344dd;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class RoundCornerProgressBar extends C92344dd {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public C18820ts A05;
    public boolean A06;
    public final Paint A07;
    public final RectF A08;

    public void setProgress(int i) {
        if (i < 0 || i > 100) {
            throw AnonymousClass001.A08("Progress must be between 0 and 100 inclusive");
        } else if (i != this.A02) {
            this.A02 = i;
            if (!this.A06) {
                this.A00 = (float) i;
            } else if (i > 0) {
                float[] A0v = C90524aI.A0v();
                A0v[0] = 0.0f;
                A0v[1] = (float) i;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(A0v);
                ofFloat.setDuration((long) ((int) Math.max(200.0f, (((float) this.A02) / 100.0f) * 650.0f)));
                C36391kE.A13(ofFloat);
                C111565cU.A00(ofFloat, this, 20);
                C162337oQ.A00(ofFloat, this, 20);
                ofFloat.setStartDelay(300);
                ofFloat.start();
                return;
            } else {
                this.A00 = (float) i;
                this.A06 = false;
            }
            invalidate();
        }
    }

    public RoundCornerProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A06 = true;
        this.A00 = 0.0f;
        this.A02 = 0;
        this.A04 = 10;
        this.A03 = getResources().getColor(R.color.f6nameremoved);
        this.A01 = getResources().getColor(R.color.f6nameremoved);
        this.A07 = C36441kJ.A0L(1);
        this.A08 = C36441kJ.A0N();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0H);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(2, this.A04);
            this.A03 = obtainStyledAttributes.getInteger(1, this.A03);
            this.A01 = obtainStyledAttributes.getInteger(0, this.A01);
            obtainStyledAttributes.recycle();
        }
    }

    public int getProgress() {
        return this.A02;
    }

    public void onDraw(Canvas canvas) {
        float f;
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        float f2 = (this.A00 / 100.0f) * ((float) ((width - paddingLeft) - paddingRight));
        if (isInEditMode() || C36351kA.A1Y(this.A05)) {
            f = ((float) paddingLeft) + f2;
        } else {
            f = (((float) width) - f2) - ((float) paddingRight);
        }
        int paddingTop = getPaddingTop() + (AnonymousClass000.A0D(this, getHeight()) / 2);
        Paint paint = this.A07;
        C36401kF.A0z(this.A01, paint);
        RectF rectF = this.A08;
        int i = this.A04 / 2;
        float f3 = (float) (paddingTop - i);
        float f4 = (float) (i + paddingTop);
        rectF.set(0.0f, f3, C36441kJ.A01(this), f4);
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
        paint.setColor(this.A03);
        if (isInEditMode() || C36351kA.A1Y(this.A05)) {
            rectF.set((float) paddingLeft, f3, f, f4);
        } else {
            rectF.set(f, f3, (float) (width - paddingRight), f4);
        }
        canvas.drawRoundRect(rectF, rectF.height() / 2.0f, rectF.height() / 2.0f, paint);
    }

    public void onMeasure(int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = getPaddingTop() + this.A04 + getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    public void setBackgroundColor(int i) {
        this.A01 = i;
    }

    public RoundCornerProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundCornerProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }
}
