package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass1QZ;
import X.AnonymousClass2x6;
import X.AnonymousClass3T0;
import X.C18700tb;
import X.C36361kB;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public class WallpaperImagePreview extends AppCompatImageView implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public boolean A02;
    public final Path A03;
    public final RectF A04;
    public final float[] A05;

    public WallpaperImagePreview(Context context) {
        this(context, (AttributeSet) null);
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        if (this.A02) {
            canvas.clipPath(this.A03);
        }
        super.onDraw(canvas);
    }

    public void setRoundBottomCorners(boolean z) {
        this.A02 = z;
        invalidate();
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02) {
            Path path = this.A03;
            path.reset();
            RectF rectF = this.A04;
            rectF.right = (float) getMeasuredWidth();
            rectF.bottom = (float) getMeasuredHeight();
            path.addRoundRect(rectF, this.A05, Path.Direction.CW);
            path.close();
        }
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            float intrinsicWidth = (float) drawable.getIntrinsicWidth();
            float intrinsicHeight = (float) drawable.getIntrinsicHeight();
            Point A06 = AnonymousClass3T0.A06(getContext());
            float f = (float) A06.x;
            float f2 = (float) A06.y;
            float f3 = ((float) (i3 - i)) / f;
            float max = Math.max(f / intrinsicWidth, f2 / intrinsicHeight) * f3;
            Matrix imageMatrix = getImageMatrix();
            float f4 = 0.0f;
            imageMatrix.setScale(max, max, 0.0f, 0.0f);
            float f5 = ((f * f3) - (intrinsicWidth * max)) / 2.0f;
            float f6 = ((f2 * f3) - (intrinsicHeight * max)) / 2.0f;
            if (C36431kI.A0H(this).orientation != 2) {
                f4 = f6;
            }
            imageMatrix.postTranslate(f5, f4);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public WallpaperImagePreview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A01) {
            this.A01 = true;
            generatedComponent();
        }
        this.A03 = C36441kJ.A0M();
        this.A04 = C36441kJ.A0N();
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.A05 = fArr;
        this.A02 = false;
        super.setScaleType(ImageView.ScaleType.MATRIX);
        C36361kB.A1U(fArr, C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2x6.A0B);
        try {
            this.A02 = obtainStyledAttributes.getBoolean(0, false);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public WallpaperImagePreview(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
