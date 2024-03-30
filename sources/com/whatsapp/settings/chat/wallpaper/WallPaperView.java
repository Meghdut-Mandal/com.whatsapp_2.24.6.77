package com.whatsapp.settings.chat.wallpaper;

import X.AnonymousClass000;
import X.AnonymousClass00C;
import X.AnonymousClass1QZ;
import X.AnonymousClass6YP;
import X.C18700tb;
import X.C36321k7;
import X.C36361kB;
import X.C36441kJ;
import X.C77613qm;
import X.C87274Od;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.whatsapp.R;

public final class WallPaperView extends AppCompatImageView implements C18700tb {
    public C87274Od A00;
    public AnonymousClass1QZ A01;
    public boolean A02;
    public boolean A03;
    public RectF A04;
    public float[] A05;
    public final Path A06;

    public void onDraw(Canvas canvas) {
        boolean z;
        C87274Od r0;
        AnonymousClass6YP r02;
        AnonymousClass00C.A0D(canvas, 0);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        RectF rectF = this.A04;
        boolean z2 = false;
        if (rectF == null) {
            if (!isInEditMode()) {
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("redraw:");
                A0u.append(measuredWidth);
                C36321k7.A1T(" | ", A0u, measuredHeight);
            }
            rectF = new RectF(0.0f, 0.0f, (float) measuredWidth, (float) measuredHeight);
            this.A04 = rectF;
        } else {
            float f = (float) measuredWidth;
            if (rectF.width() == f && rectF.height() == ((float) measuredHeight)) {
                z = false;
                Path path = this.A06;
                path.rewind();
                path.addRoundRect(rectF, this.A05, Path.Direction.CW);
                canvas.clipPath(path);
                super.onDraw(canvas);
                if (measuredHeight > 0 && measuredWidth > 0) {
                    z2 = true;
                }
                if ((z || this.A03) && z2 && (r0 = this.A00) != null && (r02 = ((C77613qm) r0).A00.A5Z) != null) {
                    r02.A0n.A0S();
                }
                return;
            }
            rectF.set(0.0f, 0.0f, f, (float) measuredHeight);
            if (!isInEditMode()) {
                StringBuilder A0u2 = AnonymousClass000.A0u();
                A0u2.append("redraw changed:");
                A0u2.append(measuredWidth);
                C36321k7.A1T(" | ", A0u2, measuredHeight);
            }
        }
        z = true;
        Path path2 = this.A06;
        path2.rewind();
        path2.addRoundRect(rectF, this.A05, Path.Direction.CW);
        canvas.clipPath(path2);
        super.onDraw(canvas);
        z2 = true;
        if (z || this.A03) {
            r02.A0n.A0S();
        }
    }

    public final void setDrawable(Drawable drawable) {
        this.A03 = true;
        setImageDrawable(drawable);
        invalidate();
    }

    public final void setRadii(float[] fArr) {
        AnonymousClass00C.A0D(fArr, 0);
        this.A05 = fArr;
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public WallPaperView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
    }

    public boolean setFrame(int i, int i2, int i3, int i4) {
        Drawable drawable = getDrawable();
        if (drawable != null) {
            Matrix imageMatrix = getImageMatrix();
            float intrinsicWidth = ((float) (i3 - i)) / ((float) drawable.getIntrinsicWidth());
            float intrinsicHeight = ((float) (i4 - i2)) / ((float) drawable.getIntrinsicHeight());
            if (intrinsicWidth < intrinsicHeight) {
                intrinsicWidth = intrinsicHeight;
            }
            imageMatrix.setScale(intrinsicWidth, intrinsicWidth, 0.0f, 0.0f);
            setImageMatrix(imageMatrix);
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public final void setOnSizeChangedListener(C87274Od r1) {
        this.A00 = r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WallPaperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        if (!this.A02) {
            this.A02 = true;
            generatedComponent();
        }
        setScaleType(ImageView.ScaleType.MATRIX);
        this.A06 = C36441kJ.A0M();
        float A002 = C36441kJ.A00(getResources(), R.dimen.f7nameremoved);
        float[] fArr = new float[8];
        fArr[0] = A002;
        fArr[1] = A002;
        fArr[2] = A002;
        fArr[3] = A002;
        C36361kB.A1U(fArr, A002);
        this.A05 = fArr;
    }
}
