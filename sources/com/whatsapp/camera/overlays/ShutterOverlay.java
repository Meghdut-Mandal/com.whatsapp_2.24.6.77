package com.whatsapp.camera.overlays;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36371kC;
import X.C36421kH;
import X.C36441kJ;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class ShutterOverlay extends View implements C18700tb {
    public AnonymousClass1QZ A00;
    public boolean A01;
    public boolean A02;
    public final Paint A03;

    private void A00(Context context) {
        Paint paint = this.A03;
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.f7nameremoved));
        C36421kH.A0q(paint);
        paint.setColor(-1);
    }

    public void A01() {
        if (!this.A02) {
            this.A02 = true;
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

    public void onDraw(Canvas canvas) {
        if (this.A01) {
            canvas.drawRect(0.0f, 0.0f, C36441kJ.A01(this), C36441kJ.A02(this), this.A03);
        }
    }

    public ShutterOverlay(Context context) {
        super(context);
        A01();
        this.A03 = C36371kC.A0E();
        A00(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A03 = C36371kC.A0E();
        A00(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A03 = C36371kC.A0E();
        A00(context);
    }

    public ShutterOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A03 = C36371kC.A0E();
        A00(context);
    }
}
