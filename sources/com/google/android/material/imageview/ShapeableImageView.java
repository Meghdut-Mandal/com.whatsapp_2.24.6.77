package com.google.android.material.imageview;

import X.AnonymousClass061;
import X.AnonymousClass06J;
import X.AnonymousClass0EV;
import X.C012405k;
import X.C012505l;
import X.C013105r;
import X.C013806a;
import X.C013906b;
import X.C014206e;
import X.C27891Qg;
import X.C27931Qk;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class ShapeableImageView extends AppCompatImageView implements C012405k {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public ColorStateList A05;
    public C012505l A06;
    public AnonymousClass06J A07;
    public int A08;
    public int A09;
    public Path A0A;
    public boolean A0B;
    public final Paint A0C;
    public final Path A0D;
    public final RectF A0E;
    public final Paint A0F;
    public final RectF A0G;
    public final C013906b A0H;

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void A00(int i, int i2) {
        RectF rectF = this.A0E;
        rectF.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        C013906b r2 = this.A0H;
        AnonymousClass06J r5 = this.A07;
        Path path = this.A0D;
        r2.A01(path, rectF, r5, (C014206e) null, 1.0f);
        Path path2 = this.A0A;
        path2.rewind();
        path2.addPath(path);
        RectF rectF2 = this.A0G;
        rectF2.set(0.0f, 0.0f, (float) i, (float) i2);
        path2.addRect(rectF2, Path.Direction.CCW);
    }

    public final int getContentPaddingEnd() {
        int i = this.A02;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (getLayoutDirection() == 1) {
            return this.A08;
        }
        return this.A09;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2 = this.A03;
        if (!(i2 == Integer.MIN_VALUE && this.A02 == Integer.MIN_VALUE)) {
            boolean z = true;
            if (getLayoutDirection() != 1) {
                z = false;
            }
            if (z && (i = this.A02) != Integer.MIN_VALUE) {
                return i;
            }
            if (getLayoutDirection() != 1) {
                int i3 = i2;
                if (i2 != Integer.MIN_VALUE) {
                    return i3;
                }
            }
        }
        return this.A08;
    }

    public int getContentPaddingRight() {
        int i;
        int i2 = this.A03;
        if (!(i2 == Integer.MIN_VALUE && this.A02 == Integer.MIN_VALUE)) {
            boolean z = true;
            if (getLayoutDirection() != 1) {
                z = false;
            }
            if (z && i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (!(getLayoutDirection() == 1 || (i = this.A02) == Integer.MIN_VALUE)) {
                return i;
            }
        }
        return this.A09;
    }

    public final int getContentPaddingStart() {
        int i = this.A03;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (getLayoutDirection() == 1) {
            return this.A09;
        }
        return this.A08;
    }

    public void setShapeAppearanceModel(AnonymousClass06J r3) {
        this.A07 = r3;
        C012505l r0 = this.A06;
        if (r0 != null) {
            r0.setShapeAppearanceModel(r3);
        }
        A00(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.A05 = colorStateList;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        if (this.A00 != f) {
            this.A00 = f;
            invalidate();
        }
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - this.A01;
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - this.A04;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.A0A, this.A0F);
        if (this.A05 != null) {
            Paint paint = this.A0C;
            paint.setStrokeWidth(this.A00);
            int colorForState = this.A05.getColorForState(getDrawableState(), this.A05.getDefaultColor());
            if (this.A00 > 0.0f && colorForState != 0) {
                paint.setColor(colorForState);
                canvas.drawPath(this.A0D, paint);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.A0B && isLayoutDirectionResolved()) {
            this.A0B = true;
            if (!isPaddingRelative() && this.A03 == Integer.MIN_VALUE && this.A02 == Integer.MIN_VALUE) {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            } else {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            }
        }
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        A00(i, i2);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + this.A04, i3 + getContentPaddingRight(), i4 + this.A01);
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + this.A04, i3 + getContentPaddingEnd(), i4 + this.A01);
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C013105r.A00(getContext(), i));
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    public int getContentPaddingBottom() {
        return this.A01;
    }

    public int getContentPaddingTop() {
        return this.A04;
    }

    public AnonymousClass06J getShapeAppearanceModel() {
        return this.A07;
    }

    public ColorStateList getStrokeColor() {
        return this.A05;
    }

    public float getStrokeWidth() {
        return this.A00;
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet, int i) {
        super(C27891Qg.A00(context, attributeSet, i, R.style.f13nameremoved), attributeSet, i);
        this.A0H = C013806a.A00;
        this.A0D = new Path();
        this.A0B = false;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.A0F = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        this.A0E = new RectF();
        this.A0G = new RectF();
        this.A0A = new Path();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, C27931Qk.A0Z, i, R.style.f13nameremoved);
        setLayerType(2, (Paint) null);
        this.A05 = AnonymousClass061.A00(context2, obtainStyledAttributes, 9);
        this.A00 = (float) obtainStyledAttributes.getDimensionPixelSize(10, 0);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.A08 = dimensionPixelSize;
        this.A04 = dimensionPixelSize;
        this.A09 = dimensionPixelSize;
        this.A01 = dimensionPixelSize;
        this.A08 = obtainStyledAttributes.getDimensionPixelSize(3, dimensionPixelSize);
        this.A04 = obtainStyledAttributes.getDimensionPixelSize(6, dimensionPixelSize);
        this.A09 = obtainStyledAttributes.getDimensionPixelSize(4, dimensionPixelSize);
        this.A01 = obtainStyledAttributes.getDimensionPixelSize(1, dimensionPixelSize);
        this.A03 = obtainStyledAttributes.getDimensionPixelSize(5, Integer.MIN_VALUE);
        this.A02 = obtainStyledAttributes.getDimensionPixelSize(2, Integer.MIN_VALUE);
        obtainStyledAttributes.recycle();
        Paint paint2 = new Paint();
        this.A0C = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        this.A07 = new AnonymousClass06J(AnonymousClass06J.A01(context2, attributeSet, i, R.style.f13nameremoved));
        setOutlineProvider(new AnonymousClass0EV(this));
    }

    public ShapeableImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }
}
