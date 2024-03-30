package com.whatsapp.calling.views;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36371kC;
import X.C36381kD;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class VoipCallControlRingingDotsIndicator extends View implements C18700tb {
    public int A00;
    public int A01;
    public AnonymousClass1QZ A02;
    public boolean A03;
    public final float[] A04;
    public final Paint A05;

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
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

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A04 = new float[3];
        this.A05 = C36371kC.A0E();
        A00(context);
    }

    private void A00(Context context) {
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f7nameremoved);
        this.A01 = dimensionPixelSize;
        this.A00 = dimensionPixelSize * 2;
        C36381kD.A16(getContext(), this.A05, 17170443);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = 0;
        do {
            Paint paint = this.A05;
            paint.setAlpha((int) (this.A04[i] * 255.0f));
            int i2 = this.A01;
            float f = (float) i2;
            canvas.drawCircle((float) ((this.A00 * 2 * i) + i2), f, f, paint);
            i++;
        } while (i < 3);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.A00;
        setMeasuredDimension(i3 * 5, i3);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A04 = new float[3];
        this.A05 = C36371kC.A0E();
        A00(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A04 = new float[3];
        this.A05 = C36371kC.A0E();
        A00(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context) {
        super(context);
        A01();
        this.A04 = new float[3];
        this.A05 = C36371kC.A0E();
        A00(context);
    }

    public VoipCallControlRingingDotsIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
