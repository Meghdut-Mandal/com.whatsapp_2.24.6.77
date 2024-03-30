package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.4pz  reason: invalid class name and case insensitive filesystem */
public class C97614pz extends C139206jP {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public float A06;
    public float A07;
    public Bitmap A08;
    public final float A09;

    public C97614pz(C139266jV r16) {
        super(r16);
        float f = this.A0B;
        float f2 = f * 12.0f;
        this.A03 = f2;
        this.A04 = 0.4f * f;
        float f3 = f * 16.0f;
        this.A02 = f3;
        this.A06 = f2;
        this.A07 = 4.8f * f;
        this.A05 = 1.6f * f;
        this.A09 = f * 44.0f;
        this.A03 = 5;
        this.A02 = 1.0f;
        int ceil = (int) Math.ceil((double) (f3 * 1.08f * 2.0f));
        Bitmap createBitmap = Bitmap.createBitmap(ceil, ceil, Bitmap.Config.ARGB_8888);
        this.A08 = createBitmap;
        Canvas A0A = C90524aI.A0A(createBitmap);
        float f4 = ((float) ceil) / 2.0f;
        float f5 = this.A05;
        float f6 = f4 - f5;
        float f7 = f5 + f4;
        RectF rectF = new RectF(f6, f6, f7, f7);
        float f8 = 1.08f * this.A02;
        RadialGradient radialGradient = new RadialGradient(f4, f4, f8, new int[]{570425344, 570425344, 0}, new float[]{0.9259259f, 0.9259259f, 1.0f}, Shader.TileMode.CLAMP);
        Path A0M = C36441kJ.A0M();
        Paint A0L = C36441kJ.A0L(1);
        Paint.Style style = Paint.Style.FILL;
        A0L.setStyle(style);
        A0L.setShader(radialGradient);
        A0A.drawCircle(f4, f4, f8, A0L);
        A0L.reset();
        A0L.setFlags(1);
        A0L.setStyle(style);
        A0L.setColor(-2046820353);
        A0A.drawCircle(f4, f4, this.A02, A0L);
        C36421kH.A0q(A0L);
        A0L.setColor(-6118750);
        A0L.setStrokeWidth(this.A04);
        A0A.drawCircle(f4, f4, this.A02, A0L);
        A0L.setFlags(1);
        A0L.setStyle(style);
        A0L.setColor(-1365724);
        A0M.reset();
        A0M.moveTo(f4 - this.A07, f4);
        A0M.lineTo(f4 - this.A05, f4);
        A0M.addArc(rectF, 180.0f, 90.0f);
        A0M.lineTo(f4, f4 - this.A06);
        C90514aH.A1G(A0A, A0L, A0M, f4 - this.A07, f4);
        A0L.setStyle(style);
        A0L.setColor(-2811114);
        A0M.reset();
        A0M.moveTo(this.A07 + f4, f4);
        A0M.lineTo(this.A05 + f4, f4);
        A0M.addArc(rectF, 0.0f, -90.0f);
        A0M.lineTo(f4, f4 - this.A06);
        C90514aH.A1G(A0A, A0L, A0M, this.A07 + f4, f4);
        C36431kI.A1L(A0L);
        A0L.setColor(-4013374);
        A0M.reset();
        A0M.moveTo(f4 - this.A07, f4);
        A0M.lineTo(f4 - this.A05, f4);
        A0M.addArc(rectF, 180.0f, -90.0f);
        A0M.lineTo(f4, this.A06 + f4);
        C90514aH.A1G(A0A, A0L, A0M, f4 - this.A07, f4);
        C36431kI.A1L(A0L);
        A0L.setColor(-2434342);
        A0M.reset();
        A0M.moveTo(this.A07 + f4, f4);
        A0M.lineTo(this.A05 + f4, f4);
        A0M.addArc(rectF, 0.0f, 90.0f);
        A0M.lineTo(f4, this.A06 + f4);
        C90514aH.A1G(A0A, A0L, A0M, this.A07 + f4, f4);
    }

    public void A06(Canvas canvas) {
        canvas.save();
        float f = this.A07.A0R.A00.A0Q.A0C;
        if (f < 0.0f) {
            f += 360.0f;
        }
        canvas.rotate(f, this.A00, this.A01);
        Bitmap bitmap = this.A08;
        float f2 = this.A00;
        float f3 = this.A02;
        canvas.drawBitmap(bitmap, f2 - f3, this.A01 - f3, (Paint) null);
        canvas.restore();
    }
}
