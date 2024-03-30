package com.whatsapp.camera.overlays;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36371kC;
import X.C36421kH;
import X.C36441kJ;
import X.C81323wp;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class AutofocusOverlay extends View implements C18700tb {
    public float A00;
    public RectF A01;
    public AnonymousClass1QZ A02;
    public Boolean A03;
    public boolean A04;
    public boolean A05;
    public final Paint A06;
    public final Runnable A07;

    public void A01() {
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A02;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        Paint paint;
        int i;
        if (!this.A04) {
            Boolean bool = this.A03;
            if (bool == null) {
                paint = this.A06;
                i = -1;
            } else {
                Boolean bool2 = Boolean.TRUE;
                paint = this.A06;
                i = -65536;
                if (bool == bool2) {
                    i = -16711936;
                }
            }
            paint.setColor(i);
        }
        boolean z = this.A04;
        RectF rectF = this.A01;
        if (z) {
            float f = this.A00 / 2.0f;
            canvas.drawRoundRect(rectF, f, f, this.A06);
            return;
        }
        canvas.drawRect(rectF, this.A06);
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A06 = C36371kC.A0E();
        this.A07 = new C81323wp((Object) this, 8);
        A00();
    }

    private void A00() {
        this.A00 = getResources().getDimension(R.dimen.f7nameremoved);
        Paint paint = this.A06;
        paint.setStrokeWidth(getResources().getDimension(R.dimen.f7nameremoved));
        C36421kH.A0q(paint);
        paint.setColor(-1);
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A06 = C36371kC.A0E();
        this.A07 = new C81323wp((Object) this, 8);
        A00();
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A06 = C36371kC.A0E();
        this.A07 = new C81323wp((Object) this, 8);
        A00();
    }

    public AutofocusOverlay(Context context) {
        super(context);
        A01();
        this.A06 = C36371kC.A0E();
        this.A07 = new C81323wp((Object) this, 8);
        A00();
    }

    public AutofocusOverlay(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
