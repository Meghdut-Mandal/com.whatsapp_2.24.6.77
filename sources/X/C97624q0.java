package X;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: X.4q0  reason: invalid class name and case insensitive filesystem */
public class C97624q0 extends C139206jP {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public boolean A04;
    public float A05;
    public float A06;
    public float A07;
    public float A08;
    public float A09;
    public float A0A;
    public float A0B;
    public float A0C;
    public float A0D;
    public final Paint A0E = C36371kC.A0E();

    public void A06(Canvas canvas) {
        C139266jV r1 = this.A07;
        float A012 = C36441kJ.A01(r1.A0Q);
        float f = this.A09;
        float f2 = (A012 - f) - ((float) r1.A06);
        this.A01 = f2;
        float f3 = f + ((float) r1.A07);
        this.A03 = f3;
        float f4 = this.A02;
        float f5 = f4 / 2.0f;
        this.A06 = f2 - f5;
        this.A07 = f3 + f5;
        float f6 = this.A0A;
        this.A0D = this.A0B + f6;
        Paint paint = this.A0E;
        C36431kI.A1L(paint);
        int i = -1;
        if (this.A04) {
            i = -2236963;
        }
        paint.setColor(i);
        paint.setAlpha(230);
        float f7 = this.A01;
        float f8 = this.A03;
        Canvas canvas2 = canvas;
        canvas2.drawRect(f7 - f4, f8, f7, f8 + f4, paint);
        paint.setColor(-7829368);
        canvas.drawCircle(this.A06, this.A07, this.A08, paint);
        C36421kH.A0q(paint);
        paint.setStrokeWidth(this.A0C);
        canvas.drawCircle(this.A06, this.A07, f6, paint);
        float f9 = this.A06;
        float f10 = this.A07;
        canvas2.drawLine(f9, f10 - f6, f9, f10 - this.A0D, paint);
        float f11 = this.A06;
        float f12 = this.A07;
        canvas2.drawLine(f11, f12 + f6, f11, f12 + this.A0D, paint);
        float f13 = this.A06;
        float f14 = this.A07;
        canvas2.drawLine(f13 - f6, f14, f13 - this.A0D, f14, paint);
        float f15 = this.A06;
        float f16 = this.A07;
        canvas2.drawLine(f15 + f6, f16, f15 + this.A0D, f16, paint);
        paint.setStrokeWidth(this.A05);
        paint.setColor(-3355444);
        float f17 = this.A01;
        float f18 = this.A03;
        canvas2.drawRect(f17 - f4, f18, f17, f18 + f4, paint);
    }

    public C97624q0(C139266jV r6) {
        super(r6);
        float f = this.A0B;
        this.A09 = 12.0f * f;
        float f2 = f * 37.0f;
        this.A02 = f2;
        this.A05 = 0.5f * f;
        this.A0C = f * 2.0f;
        this.A08 = 5.0f * f;
        this.A0A = 8.0f * f;
        this.A0B = f * 3.0f;
        this.A03 = 5;
        this.A02 = 3.0f;
        this.A00 = ((f * 48.0f) - f2) / 2.0f;
    }
}
