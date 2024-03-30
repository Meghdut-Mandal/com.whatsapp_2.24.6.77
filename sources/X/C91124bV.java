package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bV  reason: invalid class name and case insensitive filesystem */
public class C91124bV extends Drawable {
    public final float A00;
    public final int A01;
    public final Paint A02;
    public final Paint A03;
    public final Path A04 = C36441kJ.A0M();
    public final AnonymousClass64U A05;
    public final AnonymousClass64U A06;
    public final AnonymousClass64U A07;
    public final C122995vl A08;

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas.save();
        try {
            if (this.A00 != 0.0f) {
                canvas.clipPath(this.A04);
            }
            canvas.drawColor(this.A01);
            int height = getBounds().height();
            int A032 = C36421kH.A03(this);
            float f = (float) A032;
            canvas2.drawRect(0.0f, 0.0f, f, (float) height, this.A02);
            canvas.drawCircle(f, 0.0f, (float) ((int) C90484aE.A01(A032, height)), this.A03);
            C122995vl r0 = this.A08;
            canvas.drawPath(r0.A01, r0.A00);
            AnonymousClass64U r02 = this.A06;
            canvas.drawPath(r02.A01, r02.A00);
            AnonymousClass64U r03 = this.A05;
            canvas.drawPath(r03.A01, r03.A00);
            AnonymousClass64U r04 = this.A07;
            canvas.drawPath(r04.A01, r04.A00);
        } catch (Exception unused) {
            AnonymousClass6RS.A01("CDSHarmonizationCompanyGradientDrawable", "Exception when drawing CDSHarmonizationCompanyGradientDrawable");
        } catch (Throwable th) {
            canvas.restoreToCount(save);
            throw th;
        }
        canvas.restoreToCount(save);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void onBoundsChange(Rect rect) {
        Rect rect2 = rect;
        super.onBoundsChange(rect2);
        float f = this.A00;
        if (f > 0.0f) {
            Path path = this.A04;
            path.reset();
            path.addRoundRect(new RectF(rect2), f, f, Path.Direction.CW);
            path.close();
        }
        int height = rect2.height();
        int width = rect2.width();
        float f2 = (float) height;
        float f3 = (float) width;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A02.setShader(new LinearGradient(0.0f, f2, f3, 0.0f, -16751392, -16743685, tileMode));
        float f4 = f3 * -0.333f;
        float f5 = -0.333f * f2;
        float f6 = f3 * 1.333f;
        float f7 = 1.333f * f2;
        C122995vl r10 = this.A08;
        C118495nz r9 = r10.A03;
        r9.A00 = f6;
        r9.A01 = f7;
        C118495nz r8 = r10.A04;
        r8.A00 = f6;
        r8.A01 = 0.55f * f2;
        C118495nz r5 = r10.A02;
        r5.A00 = -0.37f * f3;
        r5.A01 = f7;
        AnonymousClass64U r4 = this.A07;
        C118495nz r2 = r4.A05;
        r2.A00 = f4;
        r2.A01 = f5;
        C118495nz r3 = r4.A06;
        r3.A00 = 0.032f * f3;
        r3.A01 = f5;
        C118495nz r32 = r4.A04;
        r32.A00 = f4;
        r32.A01 = 1.078f * f2;
        C118495nz r33 = r4.A02;
        r33.A00 = 0.122f * f3;
        r33.A01 = 0.415f * f2;
        C118495nz r34 = r4.A03;
        r34.A00 = -0.01f * f3;
        r34.A01 = 0.753f * f2;
        AnonymousClass64U r35 = this.A05;
        C118495nz r22 = r35.A05;
        r22.A00 = f4;
        r22.A01 = f5;
        C118495nz r11 = r35.A06;
        r11.A00 = 0.19f * f3;
        r11.A01 = f5;
        C118495nz r112 = r35.A04;
        r112.A00 = f4;
        r112.A01 = 1.087f * f2;
        C118495nz r113 = r35.A02;
        r113.A00 = 0.197f * f3;
        r113.A01 = 0.473f * f2;
        C118495nz r114 = r35.A03;
        r114.A00 = 0.025f * f3;
        r114.A01 = 0.803f * f2;
        AnonymousClass64U r23 = this.A06;
        C118495nz r115 = r23.A05;
        r115.A00 = f4;
        r115.A01 = f5;
        C118495nz r12 = r23.A06;
        r12.A00 = 0.355f * f3;
        r12.A01 = f5;
        C118495nz r122 = r23.A04;
        r122.A00 = f4;
        r122.A01 = 1.043f * f2;
        C118495nz r123 = r23.A02;
        r123.A00 = 0.27f * f3;
        r123.A01 = 0.49f * f2;
        C118495nz r124 = r23.A03;
        r124.A00 = 0.057f * f3;
        r124.A01 = f2 * 0.807f;
        float max = Math.max((float) C90484aE.A01(width, height), Float.MIN_VALUE);
        int[] A1O = C36441kJ.A1O();
        C109515Xw.A01(A1O, 0.25f, -1, 0);
        C109515Xw.A01(A1O, 0.0f, -1, 1);
        this.A03.setShader(new RadialGradient(f3, 0.0f, max, A1O, (float[]) null, tileMode));
        Path path2 = r10.A01;
        path2.reset();
        path2.moveTo(r8.A00, r8.A01);
        path2.lineTo(r5.A00, r5.A01);
        path2.lineTo(r9.A00, r9.A01);
        path2.close();
        r23.A00();
        r35.A00();
        r4.A00();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A02.setColorFilter(colorFilter);
        this.A08.A00.setColorFilter(colorFilter);
        this.A07.A00.setColorFilter(colorFilter);
        this.A05.A00.setColorFilter(colorFilter);
        this.A06.A00.setColorFilter(colorFilter);
        this.A03.setColorFilter(colorFilter);
    }

    public C91124bV(int i, float f) {
        this.A01 = i;
        this.A00 = f;
        this.A02 = C36441kJ.A0K();
        this.A08 = new C122995vl();
        this.A07 = new AnonymousClass64U(-11695, 100);
        this.A05 = new AnonymousClass64U(-44416, 190);
        this.A06 = new AnonymousClass64U(-6278145, 175);
        Paint A0K = C36441kJ.A0K();
        this.A03 = A0K;
        C90474aD.A0w(A0K);
    }
}
