package com.whatsapp.camera;

import X.AnonymousClass000;
import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36341k9;
import X.C36361kB;
import X.C36421kH;
import X.C36441kJ;
import X.C65103Qt;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import com.whatsapp.R;

public class DragGalleryStripIndicator extends View implements C18700tb {
    public AnonymousClass1QZ A00;
    public float A01;
    public float A02;
    public boolean A03;
    public boolean A04;
    public final Paint A05;
    public final Paint A06;
    public final Path A07;

    private void A00(Context context) {
        Paint paint = this.A05;
        C36421kH.A0q(paint);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth((float) C65103Qt.A01(context, 2.0f));
        paint.setColor(getResources().getColor(R.color.f6nameremoved));
        Paint paint2 = this.A06;
        C36421kH.A0q(paint2);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeWidth(C36341k9.A00(context) * 4.0f);
        paint2.setColor(getResources().getColor(R.color.f6nameremoved));
        this.A01 = TypedValue.applyDimension(1, 1.0f, C36361kB.A0B(this));
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A00;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A00 = r0;
        }
        return r0.generatedComponent();
    }

    public void setOffset(float f) {
        this.A02 = f - 1.0f;
        invalidate();
    }

    public void setUpdating(boolean z) {
        this.A04 = z;
        if (z) {
            invalidate();
        }
    }

    public DragGalleryStripIndicator(Context context) {
        super(context);
        A01();
        this.A05 = C36441kJ.A0L(1);
        this.A06 = C36441kJ.A0L(1);
        this.A07 = C36441kJ.A0M();
        this.A02 = 0.0f;
        A00(context);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = (float) getPaddingLeft();
        float paddingTop = (float) getPaddingTop();
        float A0B = (float) AnonymousClass000.A0B(this);
        float A0A = (float) AnonymousClass000.A0A(this);
        float f = (A0A + paddingTop) / 2.0f;
        float f2 = this.A02;
        float f3 = (((A0A - paddingTop) / 4.0f) * f2) + f;
        float f4 = f + (this.A01 * (-f2));
        Path path = this.A07;
        path.reset();
        path.moveTo(paddingLeft, f4);
        path.lineTo((paddingLeft + A0B) / 2.0f, f3);
        path.lineTo(A0B, f4);
        canvas.drawPath(path, this.A06);
        canvas.drawPath(path, this.A05);
        if (this.A04) {
            invalidate();
        }
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A05 = C36441kJ.A0L(1);
        this.A06 = C36441kJ.A0L(1);
        this.A07 = C36441kJ.A0M();
        this.A02 = 0.0f;
        A00(context);
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A05 = C36441kJ.A0L(1);
        this.A06 = C36441kJ.A0L(1);
        this.A07 = C36441kJ.A0M();
        this.A02 = 0.0f;
        A00(context);
    }

    public DragGalleryStripIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A05 = C36441kJ.A0L(1);
        this.A06 = C36441kJ.A0L(1);
        this.A07 = C36441kJ.A0M();
        this.A02 = 0.0f;
        A00(context);
    }
}
