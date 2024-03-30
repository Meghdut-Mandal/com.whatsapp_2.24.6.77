package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bh  reason: invalid class name and case insensitive filesystem */
public class C91244bh extends Drawable {
    public Paint A00;
    public final Paint A01;
    public final Paint A02;
    public final AnonymousClass64T A03;
    public final AnonymousClass64T A04;
    public final AnonymousClass64T A05;
    public final C122985vk A06;
    public final int A07;
    public final Path A08;

    public void draw(Canvas canvas) {
        Canvas canvas2 = canvas;
        int save = canvas.save();
        try {
            canvas.drawColor(this.A07);
            int height = getBounds().height();
            int A032 = C36421kH.A03(this);
            Paint paint = this.A00;
            if (paint != null) {
                canvas2.drawRect(0.0f, 0.0f, (float) A032, (float) height, paint);
            }
            float f = (float) A032;
            canvas2.drawRect(0.0f, 0.0f, f, (float) height, this.A01);
            canvas.drawCircle(f, 0.0f, (float) ((int) C90484aE.A01(A032, height)), this.A02);
            C122985vk r0 = this.A06;
            canvas.drawPath(r0.A01, r0.A00);
            AnonymousClass64T r02 = this.A04;
            canvas.drawPath(r02.A01, r02.A00);
            AnonymousClass64T r03 = this.A03;
            canvas.drawPath(r03.A01, r03.A00);
            AnonymousClass64T r04 = this.A05;
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
        int height = rect2.height();
        int width = rect2.width();
        float f = (float) height;
        float f2 = (float) width;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.A01.setShader(new LinearGradient(0.0f, f, f2, 0.0f, -16751392, -16743685, tileMode));
        float f3 = f2 * -0.333f;
        float f4 = -0.333f * f;
        float f5 = f2 * 1.333f;
        float f6 = 1.333f * f;
        C122985vk r10 = this.A06;
        C118475nx r9 = r10.A03;
        r9.A00 = f5;
        r9.A01 = f6;
        C118475nx r8 = r10.A04;
        r8.A00 = f5;
        r8.A01 = 0.55f * f;
        C118475nx r5 = r10.A02;
        r5.A00 = -0.37f * f2;
        r5.A01 = f6;
        AnonymousClass64T r4 = this.A05;
        C118475nx r2 = r4.A05;
        r2.A00 = f3;
        r2.A01 = f4;
        C118475nx r3 = r4.A06;
        r3.A00 = 0.032f * f2;
        r3.A01 = f4;
        C118475nx r32 = r4.A04;
        r32.A00 = f3;
        r32.A01 = 1.078f * f;
        C118475nx r33 = r4.A02;
        r33.A00 = 0.122f * f2;
        r33.A01 = 0.415f * f;
        C118475nx r34 = r4.A03;
        r34.A00 = -0.01f * f2;
        r34.A01 = 0.753f * f;
        AnonymousClass64T r35 = this.A03;
        C118475nx r22 = r35.A05;
        r22.A00 = f3;
        r22.A01 = f4;
        C118475nx r11 = r35.A06;
        r11.A00 = 0.19f * f2;
        r11.A01 = f4;
        C118475nx r112 = r35.A04;
        r112.A00 = f3;
        r112.A01 = 1.087f * f;
        C118475nx r113 = r35.A02;
        r113.A00 = 0.197f * f2;
        r113.A01 = 0.473f * f;
        C118475nx r114 = r35.A03;
        r114.A00 = 0.025f * f2;
        r114.A01 = 0.803f * f;
        AnonymousClass64T r23 = this.A04;
        C118475nx r115 = r23.A05;
        r115.A00 = f3;
        r115.A01 = f4;
        C118475nx r12 = r23.A06;
        r12.A00 = 0.355f * f2;
        r12.A01 = f4;
        C118475nx r122 = r23.A04;
        r122.A00 = f3;
        r122.A01 = 1.043f * f;
        C118475nx r123 = r23.A02;
        r123.A00 = 0.27f * f2;
        r123.A01 = 0.49f * f;
        C118475nx r124 = r23.A03;
        r124.A00 = 0.057f * f2;
        r124.A01 = f * 0.807f;
        float max = Math.max((float) C90484aE.A01(width, height), Float.MIN_VALUE);
        int[] A1O = C36441kJ.A1O();
        C109515Xw.A01(A1O, 0.25f, -1, 0);
        C109515Xw.A01(A1O, 0.0f, -1, 1);
        this.A02.setShader(new RadialGradient(f2, 0.0f, max, A1O, (float[]) null, tileMode));
        Path path = r10.A01;
        path.reset();
        path.moveTo(r8.A00, r8.A01);
        path.lineTo(r5.A00, r5.A01);
        path.lineTo(r9.A00, r9.A01);
        path.close();
        r23.A00();
        r35.A00();
        r4.A00();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
        this.A06.A00.setColorFilter(colorFilter);
        this.A05.A00.setColorFilter(colorFilter);
        this.A03.A00.setColorFilter(colorFilter);
        this.A04.A00.setColorFilter(colorFilter);
        this.A02.setColorFilter(colorFilter);
    }

    public C91244bh(int i, float f) {
        this.A08 = C36441kJ.A0M();
        this.A00 = null;
        this.A07 = 268435455;
        this.A01 = C36441kJ.A0K();
        this.A06 = new C122985vk();
        this.A05 = new AnonymousClass64T(-11695, 100);
        this.A03 = new AnonymousClass64T(-44416, 190);
        this.A04 = new AnonymousClass64T(-6278145, 175);
        Paint A0K = C36441kJ.A0K();
        this.A02 = A0K;
        C90474aD.A0w(A0K);
    }

    public C91244bh() {
    }
}
