package com.whatsapp.status;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00C;
import X.C36351kA;
import X.C36371kC;
import X.C36381kD;
import X.C36421kH;
import X.C36441kJ;
import X.C43142Fa;
import X.C56462wK;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.whatsapp.R;
import java.util.Map;

public class ContactStatusThumbnail extends C43142Fa {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public final Map A05 = AnonymousClass001.A0J();
    public final RectF A06 = C36441kJ.A0N();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactStatusThumbnail(Context context) {
        super(context);
        AnonymousClass00C.A0D(context, 1);
        A01(context, (AttributeSet) null);
    }

    public void A04(Canvas canvas) {
        int i;
        Canvas canvas2 = canvas;
        AnonymousClass00C.A0D(canvas2, 0);
        if (this.A00 > 0) {
            this.A04.setStrokeWidth(this.A00);
            C36421kH.A0q(this.A04);
            this.A04.setStrokeCap(Paint.Cap.ROUND);
            RectF rectF = this.A06;
            float f = 0.0f;
            rectF.set(0.0f, 0.0f, C36441kJ.A01(this), C36441kJ.A02(this));
            float f2 = (float) 2;
            float f3 = this.A00 / f2;
            rectF.inset(f3, f3);
            this.A04.setColor(this.A01);
            canvas2.drawOval(rectF, this.A04);
            int i2 = this.A00;
            float f4 = 360.0f / ((float) i2);
            float f5 = -90.0f;
            if (i2 != 1) {
                if (f4 <= 24.0f) {
                    f = f4 / 2.0f;
                } else {
                    f = 12.0f;
                }
            }
            this.A04.setStrokeWidth(this.A00 - ((float) 1));
            int i3 = this.A00;
            for (int i4 = 0; i4 < i3; i4++) {
                Paint paint = this.A04;
                Map map = this.A05;
                if (map.containsKey(Integer.valueOf(i4))) {
                    Object A0r = C36371kC.A0r(map, i4);
                    if (A0r != null) {
                        i = AnonymousClass000.A0I(A0r);
                    } else {
                        throw C36381kD.A0k();
                    }
                } else if (i4 < this.A04) {
                    i = this.A03;
                } else {
                    i = this.A02;
                }
                paint.setColor(i);
                canvas2.drawArc(rectF, f5 + (f / f2), f4 - f, false, this.A04);
                f5 += f4;
            }
        }
    }

    private final void A01(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56462wK.A00);
            AnonymousClass00C.A08(obtainStyledAttributes);
            this.A02 = obtainStyledAttributes.getInteger(1, 0);
            this.A03 = obtainStyledAttributes.getInteger(2, 0);
            obtainStyledAttributes.recycle();
        }
        this.A01 = C36351kA.A01(context, R.attr.f4nameremoved, R.color.f6nameremoved);
    }

    public void A05(int i, int i2) {
        this.A04 = i;
        this.A00 = i2;
        invalidate();
    }

    public final int getTotalCount() {
        return this.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactStatusThumbnail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AnonymousClass00C.A0D(context, 1);
        A01(context, attributeSet);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ContactStatusThumbnail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AnonymousClass00C.A0D(context, 1);
        A01(context, attributeSet);
    }
}
