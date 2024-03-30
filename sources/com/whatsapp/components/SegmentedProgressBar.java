package com.whatsapp.components;

import X.AnonymousClass000;
import X.AnonymousClass1QZ;
import X.AnonymousClass2xF;
import X.C18700tb;
import X.C18820ts;
import X.C36331k8;
import X.C36351kA;
import X.C36371kC;
import X.C36401kF;
import X.C36441kJ;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;

public class SegmentedProgressBar extends View implements C18700tb {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public AnimatorSet A08;
    public Bitmap A09;
    public C18820ts A0A;
    public AnonymousClass1QZ A0B;
    public boolean A0C;
    public float[] A0D;
    public int[] A0E;
    public final Paint A0F;
    public final RectF A0G;

    public SegmentedProgressBar(Context context) {
        this(context, (AttributeSet) null);
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0B;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0B = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        int width = getWidth();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i = (width - paddingLeft) - paddingRight;
        int paddingTop = getPaddingTop() + (AnonymousClass000.A0D(this, getHeight()) / 2);
        Paint paint = this.A0F;
        C36401kF.A0z(this.A02, paint);
        RectF rectF = this.A0G;
        int i2 = this.A07;
        int i3 = i2 / 2;
        float f = (float) (paddingTop - i3);
        float f2 = (float) (i3 + paddingTop);
        rectF.set(0.0f, f, C36441kJ.A01(this), f2);
        Canvas canvas2 = canvas;
        canvas2.drawRect(rectF, paint);
        if (this.A0D != null && this.A0E != null) {
            int i4 = 0;
            float f3 = 0.0f;
            while (true) {
                float[] fArr = this.A0D;
                if (i4 >= fArr.length) {
                    break;
                }
                if (fArr[i4] != 0.0f) {
                    paint.setColor(this.A0E[i4]);
                    float f4 = (this.A0D[i4] / 100.0f) * ((float) i);
                    if (isInEditMode() || C36351kA.A1Y(this.A0A)) {
                        float f5 = (float) paddingLeft;
                        rectF.set(f5 + f3, f, f5 + f4 + f3, f2);
                        canvas2.drawRect(rectF, paint);
                        if (!(i4 == this.A0D.length - 1 && this.A06 == 100)) {
                            paint.setColor(this.A03);
                            float f6 = f4 + f3;
                            rectF.set(f6 - ((float) this.A04), f, f6, f2);
                        }
                        f3 += f4;
                    } else {
                        float f7 = ((float) (width - paddingRight)) - f3;
                        float f8 = f7 - f4;
                        rectF.set(f8, f, f7, f2);
                        canvas2.drawRect(rectF, paint);
                        if (!(i4 == this.A0D.length - 1 && this.A06 == 100)) {
                            paint.setColor(this.A03);
                            rectF.set(f8, f, ((float) this.A04) + f8, f2);
                        }
                        f3 += f4;
                    }
                    canvas2.drawRect(rectF, paint);
                    f3 += f4;
                }
                i4++;
            }
        }
        int i5 = this.A05;
        paint.setColor(i5);
        if (this.A09 == null) {
            int width2 = getWidth();
            float height = rectF.height() / 2.0f;
            Bitmap createBitmap = Bitmap.createBitmap(width2, i2, Bitmap.Config.ARGB_8888);
            this.A09 = createBitmap;
            Canvas canvas3 = new Canvas(createBitmap);
            Paint A0E2 = C36371kC.A0E();
            A0E2.setColor(i5);
            A0E2.setXfermode((Xfermode) null);
            float f9 = (float) width2;
            float f10 = (float) i2;
            canvas3.drawRect(0.0f, 0.0f, f9, f10, A0E2);
            A0E2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            canvas3.drawRoundRect(new RectF(0.0f, 0.0f, f9, f10), height, height, A0E2);
        }
        canvas2.drawBitmap(this.A09, 0.0f, 0.0f, paint);
    }

    public void onMeasure(int i, int i2) {
        int size;
        if (View.MeasureSpec.getMode(i2) == 0) {
            size = getPaddingTop() + this.A07 + getPaddingBottom();
        } else {
            size = View.MeasureSpec.getSize(i2);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.A09 = null;
    }

    public SegmentedProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0C) {
            this.A0C = true;
            this.A0A = C36331k8.A0C(generatedComponent());
        }
        this.A0F = C36441kJ.A0L(1);
        this.A0G = C36441kJ.A0N();
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A0I);
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
            this.A07 = dimensionPixelSize;
            if (dimensionPixelSize % 2 == 1) {
                this.A07 = dimensionPixelSize + 1;
            }
            this.A05 = obtainStyledAttributes.getInteger(2, 0);
            this.A04 = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.A03 = obtainStyledAttributes.getInteger(0, 0);
            this.A02 = obtainStyledAttributes.getInteger(3, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = 1000;
        this.A00 = 300;
    }

    public SegmentedProgressBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
