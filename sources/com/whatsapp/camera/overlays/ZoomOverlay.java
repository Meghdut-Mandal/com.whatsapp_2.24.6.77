package com.whatsapp.camera.overlays;

import X.AnonymousClass1QZ;
import X.C18700tb;
import X.C36421kH;
import X.C36441kJ;
import X.C81323wp;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class ZoomOverlay extends View implements C18700tb {
    public float A00;
    public AnonymousClass1QZ A01;
    public String A02;
    public boolean A03;
    public final Runnable A04;
    public final Paint A05;
    public final RectF A06;
    public final TextPaint A07;

    private void A00(Context context) {
        Paint paint = this.A05;
        paint.setStrokeWidth(context.getResources().getDimension(R.dimen.f7nameremoved));
        C36421kH.A0q(paint);
        TextPaint textPaint = this.A07;
        textPaint.setTextSize(context.getResources().getDimension(R.dimen.f7nameremoved));
        textPaint.setColor(-1711276033);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setFakeBoldText(true);
    }

    public void A01() {
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass1QZ r0 = this.A01;
        if (r0 == null) {
            r0 = C36441kJ.A0v(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
        this.A06 = C36441kJ.A0N();
        this.A05 = C36441kJ.A0L(1);
        this.A07 = new TextPaint(1);
        this.A04 = new C81323wp((Object) this, 10);
        A00(context);
    }

    public float getMaxScale() {
        return (((float) Math.min(getWidth() / 2, C36441kJ.A07(this))) * 0.9f) / this.A07.measureText("x00.0");
    }

    public void onDraw(Canvas canvas) {
        int width = getWidth() / 2;
        int A072 = C36441kJ.A07(this);
        float min = ((float) Math.min(width, A072)) * 0.9f;
        Paint paint = this.A05;
        paint.setColor(-1711276033);
        RectF rectF = this.A06;
        float f = (float) width;
        float f2 = (float) A072;
        rectF.set(f - min, f2 - min, f + min, f2 + min);
        canvas.drawOval(rectF, paint);
        String str = this.A02;
        if (str != null) {
            TextPaint textPaint = this.A07;
            canvas.drawText(str, f, f2 - ((textPaint.descent() + textPaint.ascent()) / 2.0f), textPaint);
        }
        float measureText = this.A07.measureText("x00.0");
        rectF.set(f - measureText, f2 - measureText, f + measureText, f2 + measureText);
        canvas.drawOval(rectF, paint);
        float min2 = Math.min(min, measureText * this.A00);
        paint.setColor(-13388315);
        rectF.set(f - min2, f2 - min2, f + min2, f2 + min2);
        canvas.drawOval(rectF, paint);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A01();
        this.A06 = C36441kJ.A0N();
        this.A05 = C36441kJ.A0L(1);
        this.A07 = new TextPaint(1);
        this.A04 = new C81323wp((Object) this, 10);
        A00(context);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
        this.A06 = C36441kJ.A0N();
        this.A05 = C36441kJ.A0L(1);
        this.A07 = new TextPaint(1);
        this.A04 = new C81323wp((Object) this, 10);
        A00(context);
    }

    public ZoomOverlay(Context context) {
        super(context);
        A01();
        this.A06 = C36441kJ.A0N();
        this.A05 = C36441kJ.A0L(1);
        this.A07 = new TextPaint(1);
        this.A04 = new C81323wp((Object) this, 10);
        A00(context);
    }

    public ZoomOverlay(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A01();
    }
}
