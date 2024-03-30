package com.whatsapp;

import X.AnonymousClass00C;
import X.AnonymousClass00F;
import X.AnonymousClass1QZ;
import X.AnonymousClass2xF;
import X.C18700tb;
import X.C33511fU;
import X.C36401kF;
import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import java.util.Map;

public class CircularProgressBar extends ProgressBar implements C18700tb {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public long A0B;
    public AnonymousClass1QZ A0C;
    public boolean A0D;
    public boolean A0E;
    public float A0F;
    public int A0G;
    public Rect A0H;
    public String A0I;
    public final Paint A0J;
    public final RectF A0K;

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A0C;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A0C = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        float f;
        Paint paint = this.A0J;
        paint.setAntiAlias(true);
        Canvas canvas2 = canvas;
        if (this.A07 != 0) {
            C36431kI.A1L(paint);
            paint.setColor(this.A07);
            canvas2.drawArc(this.A0K, 0.0f, 360.0f, true, paint);
        }
        paint.setStrokeCap(Paint.Cap.ROUND);
        if (isIndeterminate()) {
            long uptimeMillis = SystemClock.uptimeMillis();
            long j = this.A0B;
            if (j == 0) {
                this.A0B = uptimeMillis;
                j = uptimeMillis;
            }
            long j2 = uptimeMillis - j;
            float f2 = (((float) (j2 % 1333)) * 1.0f) / 1333.0f;
            if (f2 < 0.5f) {
                float sin = (float) Math.sin(((double) f2) * 3.141592653589793d);
                f = (((sin * sin) * sin) * sin) / 2.0f;
            } else {
                float sin2 = (float) Math.sin(((double) (f2 - 0.5f)) * 3.141592653589793d);
                f = ((((sin2 * sin2) * sin2) * sin2) / 2.0f) + 0.5f;
            }
            if (f < 0.5f) {
                this.A00 = f * 2.0f * 280.0f;
                this.A02 = -1.0f;
            } else {
                float f3 = this.A02;
                if (f3 < 0.0f) {
                    f3 = this.A01;
                    this.A02 = f3;
                }
                this.A00 = (1.0f - f) * 2.0f * 280.0f;
                this.A01 = f3 + ((f - 0.5f) * 2.0f * 280.0f);
            }
            canvas2.rotate(((((float) (j2 % 2200)) * 1.0f) / 2200.0f) * 360.0f, (float) (getWidth() / 2), (float) C36441kJ.A07(this));
            paint.setAntiAlias(true);
            int i = this.A09;
            if (i != 0) {
                paint.setColor(i);
                C36421kH.A0q(paint);
                canvas2.drawArc(this.A0K, 0.0f, 360.0f, false, paint);
            }
            int i2 = this.A08;
            if (i2 != 0) {
                paint.setColor(i2);
                C36421kH.A0q(paint);
                paint.setStrokeWidth((this.A04 / this.A06) + (this.A03 * 2.0f));
                canvas2.drawArc(this.A0K, this.A01, this.A00, false, paint);
            }
            paint.setColor(this.A0A);
            C36421kH.A0q(paint);
            paint.setStrokeWidth(this.A04 / this.A06);
            canvas2.drawArc(this.A0K, this.A01, this.A00, false, paint);
            invalidate();
            return;
        }
        C36421kH.A0q(paint);
        if (this.A09 != 0) {
            paint.setStrokeWidth(this.A04 / this.A06);
            paint.setColor(this.A09);
            canvas2.drawArc(this.A0K, ((((float) getProgress()) * 360.0f) / ((float) getMax())) + 270.0f, 360.0f - ((((float) getProgress()) * 360.0f) / ((float) getMax())), false, paint);
        }
        int i3 = this.A08;
        if (i3 != 0) {
            paint.setColor(i3);
            paint.setStrokeWidth((this.A04 / this.A06) + (this.A03 * 2.0f));
            canvas2.drawArc(this.A0K, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, paint);
        }
        paint.setStrokeWidth(this.A04 / this.A06);
        paint.setColor(this.A0A);
        RectF rectF = this.A0K;
        canvas2.drawArc(rectF, -90.0f, (((float) getProgress()) * 360.0f) / ((float) getMax()), false, paint);
        if (this.A0E) {
            C36401kF.A0z(this.A09, paint);
            double progress = (double) (((float) getProgress()) * ((float) (6.283185307179586d / ((double) getMax()))));
            canvas2.drawCircle((float) (((double) rectF.centerX()) + (((double) this.A04) * Math.sin(progress))), (float) (((double) rectF.centerY()) - (((double) this.A04) * Math.cos(progress))), 10.0f, paint);
        }
        if (this.A0I != null) {
            paint.setColor(this.A0G);
            paint.setTextSize(this.A0F);
            paint.setTextAlign(Paint.Align.CENTER);
            getContext();
            Map map = C33511fU.A00;
            Object obj = map.get("sans_serif_light");
            if (obj == null) {
                obj = Typeface.create("sans-serif-light", 0);
                AnonymousClass00C.A0B(obj);
                map.put("sans_serif_light", obj);
            }
            paint.setTypeface((Typeface) obj);
            String str = this.A0I;
            int length = str.length();
            Rect rect = this.A0H;
            paint.getTextBounds(str, 0, length, rect);
            C36431kI.A1L(paint);
            String str2 = this.A0I;
            canvas2.drawText(str2, 0, str2.length(), rectF.centerX(), rectF.centerY() + (((float) rect.height()) * 0.5f), paint);
        }
    }

    public void setCenterText(String str) {
        this.A0I = str;
        this.A0F = C36441kJ.A00(getResources(), R.dimen.f7nameremoved);
    }

    public CircularProgressBar(Context context) {
        super(context);
        if (!this.A0D) {
            this.A0D = true;
            generatedComponent();
        }
        this.A0K = C36441kJ.A0N();
        this.A0J = C36441kJ.A0K();
        this.A0I = null;
        this.A06 = 5.0f;
        this.A0E = false;
        this.A05 = 0.3f;
        this.A0H = new Rect();
        A00(context, (AttributeSet) null);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        this.A0G = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A0A = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        this.A09 = AnonymousClass00F.A00(context, R.color.f6nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2xF.A04);
            this.A0A = obtainStyledAttributes.getInteger(1, this.A0A);
            this.A09 = obtainStyledAttributes.getInteger(0, this.A09);
            this.A07 = obtainStyledAttributes.getInteger(2, this.A07);
            this.A06 = obtainStyledAttributes.getFloat(5, this.A06);
            this.A08 = obtainStyledAttributes.getInteger(3, this.A08);
            this.A03 = obtainStyledAttributes.getDimension(4, this.A03);
            this.A0G = obtainStyledAttributes.getInteger(6, this.A0G);
            obtainStyledAttributes.recycle();
        }
    }

    public String getCenterText() {
        return this.A0I;
    }

    public int getFillColor() {
        return this.A07;
    }

    public boolean getKnobEnabled() {
        return this.A0E;
    }

    public float getPaintStrokeFactor() {
        return this.A06;
    }

    public int getProgressBarBackgroundColor() {
        return this.A09;
    }

    public int getProgressBarColor() {
        return this.A0A;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int paddingLeft = getPaddingLeft();
        float min = ((float) Math.min((i - paddingLeft) - getPaddingRight(), (i2 - getPaddingTop()) - getPaddingBottom())) / 2.0f;
        float f = min - (this.A05 * min);
        this.A04 = f;
        float f2 = (float) (i / 2);
        float f3 = (float) (i2 / 2);
        this.A0K.set(f2 - f, f3 - f, f2 + f, f3 + f);
    }

    public void setFillColor(int i) {
        this.A07 = i;
    }

    public void setKnobEnabled(boolean z) {
        this.A0E = z;
    }

    public void setPaintStrokeFactor(float f) {
        this.A06 = f;
    }

    public void setProgressBarBackgroundColor(int i) {
        this.A09 = i;
    }

    public void setProgressBarColor(int i) {
        this.A0A = i;
    }

    public void setRadiusFactor(float f) {
        this.A05 = f;
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0D) {
            this.A0D = true;
            generatedComponent();
        }
        this.A0K = C36441kJ.A0N();
        this.A0J = C36441kJ.A0K();
        this.A0I = null;
        this.A06 = 5.0f;
        this.A0E = false;
        this.A05 = 0.3f;
        this.A0H = new Rect();
        A00(context, attributeSet);
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        if (!this.A0D) {
            this.A0D = true;
            generatedComponent();
        }
    }

    public CircularProgressBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!this.A0D) {
            this.A0D = true;
            generatedComponent();
        }
        this.A0K = C36441kJ.A0N();
        this.A0J = C36441kJ.A0K();
        this.A0I = null;
        this.A06 = 5.0f;
        this.A0E = false;
        this.A05 = 0.3f;
        this.A0H = new Rect();
        A00(context, attributeSet);
    }
}
