package com.whatsapp.conversation.conversationrow;

import X.AnonymousClass012;
import X.AnonymousClass04S;
import X.C34831hi;
import X.C36421kH;
import X.C36441kJ;
import X.C56832wx;
import X.C80283v9;
import X.C88554Td;
import X.C88734Tv;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.whatsapp.R;

public class MediaProgressRing extends View {
    public Paint A00;
    public RectF A01;
    public AnonymousClass04S A02;
    public C88734Tv A03;
    public Runnable A04;
    public boolean A05;
    public float A06;

    public void A01(AnonymousClass012 r4, C88734Tv r5) {
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
        this.A03 = r5;
        C34831hi BHT = r5.BHT();
        BHT.A08(r4, this.A02);
        this.A04 = new C80283v9(this, BHT, 14);
    }

    public int getColor() {
        return this.A00.getColor();
    }

    public void onDraw(Canvas canvas) {
        float value;
        C88734Tv r0 = this.A03;
        if (r0 != null) {
            int BDr = r0.BDr();
            if (BDr == 0) {
                value = 0.0f;
            } else {
                value = ((float) this.A03.getValue()) / ((float) BDr);
            }
            canvas.drawArc(this.A01, -90.0f, value * 360.0f, false, this.A00);
            if (this.A05) {
                postInvalidateOnAnimation();
            }
        }
    }

    public void setColor(int i) {
        this.A00.setColor(i);
    }

    public MediaProgressRing(Context context) {
        super(context);
        C88554Td.A01(this);
        A00((AttributeSet) null);
    }

    private void A00(AttributeSet attributeSet) {
        Context context = getContext();
        this.A06 = C36441kJ.A00(context.getResources(), R.dimen.f7nameremoved);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C56832wx.A02);
            setColor(obtainStyledAttributes.getColor(0, -16777216));
            obtainStyledAttributes.recycle();
        }
        Paint paint = this.A00;
        paint.setAntiAlias(true);
        paint.setStrokeCap(Paint.Cap.BUTT);
        C36421kH.A0q(paint);
        paint.setStrokeWidth(this.A06);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.A01;
        rectF.set(0.0f, 0.0f, (float) i, (float) i2);
        float f = this.A06 / 2.0f;
        rectF.inset(f, f);
    }

    public MediaProgressRing(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C88554Td.A01(this);
        A00(attributeSet);
    }

    public MediaProgressRing(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C88554Td.A01(this);
        A00(attributeSet);
    }
}
