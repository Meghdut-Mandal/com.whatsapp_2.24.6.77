package com.whatsapp.components.button;

import X.C36421kH;
import X.C36431kI;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.whatsapp.R;

public class ThumbnailPickerButton extends ThumbnailButton {
    public boolean A00;
    public Path A01;

    public ThumbnailPickerButton(Context context) {
        super(context);
        A03();
        this.A01 = C36441kJ.A0M();
    }

    public void A04(Canvas canvas) {
        super.A04(canvas);
        if (isEnabled()) {
            float f = this.A01;
            if (f > 0.0f) {
                float f2 = f * 7.0f;
                Path path = this.A01;
                path.reset();
                C36431kI.A1L(this.A04);
                RectF rectF = this.A09;
                path.moveTo(rectF.right, rectF.bottom - f2);
                path.lineTo(rectF.right, rectF.bottom - this.A01);
                float f3 = rectF.right;
                float f4 = this.A01 * 2.0f;
                float f5 = rectF.bottom;
                path.arcTo(new RectF(f3 - f4, f5 - f4, f3, f5), 0.0f, 90.0f);
                path.lineTo(rectF.right - f2, rectF.bottom);
                path.lineTo(rectF.right, rectF.bottom - f2);
                this.A04.setColor(1409286144);
                canvas.drawPath(path, this.A04);
                path.reset();
                path.moveTo(rectF.right, rectF.bottom - f2);
                path.lineTo(rectF.right - f2, rectF.bottom);
                C36421kH.A0q(this.A04);
                this.A04.setStrokeJoin(Paint.Join.ROUND);
                this.A04.setStrokeCap(Paint.Cap.ROUND);
                this.A04.setStrokeWidth(getResources().getDimension(R.dimen.f7nameremoved));
                this.A04.setColor(-570425345);
                canvas.drawPath(path, this.A04);
            }
        }
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A03();
        this.A01 = C36441kJ.A0M();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        A03();
    }

    public ThumbnailPickerButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A03();
        this.A01 = C36441kJ.A0M();
    }
}
