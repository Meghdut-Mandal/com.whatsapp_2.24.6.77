package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import java.util.Arrays;

/* renamed from: X.4bZ  reason: invalid class name and case insensitive filesystem */
public class C91164bZ extends Drawable {
    public Path A00 = null;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final int A06;
    public final Paint A07;
    public final Paint A08;
    public final RectF A09;
    public final RectF A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final Paint[] A0D;
    public final Paint[] A0E;
    public final Path[] A0F;

    public C91164bZ(float f, float f2, int i, float f3, int i2, float f4) {
        this.A01 = f;
        this.A04 = f2;
        this.A02 = f3;
        this.A05 = f4;
        this.A06 = i;
        float alpha = (float) Color.alpha(i);
        this.A03 = alpha;
        this.A0C = true;
        this.A0B = true;
        Paint A0K = C36441kJ.A0K();
        this.A08 = A0K;
        Paint.Style style = Paint.Style.FILL;
        A0K.setStyle(style);
        A0K.setColor(i2);
        A0K.setAntiAlias(true);
        Paint A0K2 = C36441kJ.A0K();
        this.A07 = A0K2;
        A0K2.setStyle(style);
        A0K2.setColor(i);
        A0K2.setAntiAlias(true);
        A0K2.setAlpha(Math.round(alpha));
        this.A0F = new Path[4];
        this.A09 = C36441kJ.A0N();
        this.A0A = C36441kJ.A0N();
        this.A0D = new Paint[4];
        this.A0E = new Paint[4];
        int i3 = 0;
        do {
            this.A0F[i3] = C36441kJ.A0M();
            Paint[] paintArr = this.A0D;
            Paint A0L = C36441kJ.A0L(4);
            C36431kI.A1L(A0L);
            paintArr[i3] = A0L;
            this.A0D[i3].setAntiAlias(true);
            Paint[] paintArr2 = this.A0E;
            Paint A0L2 = C36441kJ.A0L(4);
            C36431kI.A1L(A0L2);
            paintArr2[i3] = A0L2;
            i3++;
        } while (i3 < 4);
    }

    public int getOpacity() {
        return -3;
    }

    public void draw(Canvas canvas) {
        float f;
        float f2;
        Path path = this.A0F[0];
        Paint paint = this.A0D[0];
        Paint paint2 = this.A0E[0];
        boolean z = this.A0C;
        float f3 = 2.0f;
        Canvas canvas2 = canvas;
        if (z) {
            int save = canvas2.save();
            RectF rectF = this.A09;
            float f4 = rectF.left;
            float f5 = this.A01;
            canvas2.translate(f4 + f5, rectF.top + f5);
            canvas2.drawPath(path, paint);
            float f6 = -f5;
            canvas2.drawRect(0.0f, f6 - this.A04, rectF.width() - (f5 * 2.0f), f6, paint2);
            canvas2.restoreToCount(save);
        }
        int save2 = canvas2.save();
        RectF rectF2 = this.A09;
        float f7 = rectF2.right;
        float f8 = this.A01;
        canvas2.translate(f7 - f8, rectF2.top + f8);
        canvas2.rotate(90.0f);
        if (z) {
            canvas2.drawPath(path, paint);
            f = 0.0f;
        } else {
            f = -f8;
        }
        float f9 = -f8;
        float f10 = f9 - this.A04;
        float height = rectF2.height();
        boolean z2 = this.A0B;
        float f11 = 1.0f;
        if (z2) {
            f11 = 2.0f;
        }
        canvas2.drawRect(f, f10, height - (f11 * f8), f9, paint2);
        canvas2.restoreToCount(save2);
        if (z2) {
            int save3 = canvas2.save();
            canvas2.translate(rectF2.right - f8, rectF2.bottom - f8);
            canvas2.rotate(180.0f);
            canvas2.drawPath(path, paint);
            canvas2.drawRect(0.0f, f10, rectF2.width() - (f8 * 2.0f), f9, paint2);
            canvas2.restoreToCount(save3);
        }
        int save4 = canvas2.save();
        canvas2.translate(rectF2.left + f8, rectF2.bottom - f8);
        canvas2.rotate(270.0f);
        if (z2) {
            canvas2.drawPath(path, paint);
            f2 = 0.0f;
        } else {
            f2 = f9;
        }
        float height2 = rectF2.height();
        if (!z) {
            f3 = 1.0f;
        }
        canvas2.drawRect(f2, f10, height2 - (f3 * f8), f9, paint2);
        canvas2.restoreToCount(save4);
        if (f8 <= 0.0f || (!z && !z2)) {
            canvas2.drawRect(rectF2, this.A08);
            return;
        }
        if (this.A05 > 0.0f || this.A02 > 0.0f) {
            canvas2.drawRoundRect(rectF2, f8, f8, this.A07);
            rectF2 = this.A0A;
        } else {
            Path path2 = this.A00;
            if (path2 != null) {
                canvas2.drawPath(path2, this.A08);
                return;
            }
        }
        canvas2.drawRoundRect(rectF2, f8, f8, this.A08);
    }

    public boolean getPadding(Rect rect) {
        float f = this.A04;
        float f2 = this.A02;
        int i = (int) (f - f2);
        float f3 = 0.0f;
        if (this.A0C) {
            f3 = f;
        }
        float f4 = this.A05;
        int i2 = (int) (f3 - f4);
        int i3 = (int) (f2 + f);
        if (!this.A0B) {
            f = 0.0f;
        }
        rect.set(i, i2, i3, (int) (f + f4));
        return true;
    }

    public void onBoundsChange(Rect rect) {
        LinearGradient linearGradient;
        float f;
        Rect rect2 = rect;
        super.onBoundsChange(rect2);
        RectF rectF = this.A09;
        float f2 = this.A04;
        float f3 = ((float) rect2.left) + f2;
        float f4 = (float) rect2.top;
        boolean z = this.A0C;
        float f5 = 0.0f;
        float f6 = 0.0f;
        if (z) {
            f6 = f2;
        }
        float f7 = f4 + f6;
        float f8 = ((float) rect2.right) - f2;
        float f9 = (float) rect2.bottom;
        boolean z2 = this.A0B;
        float f10 = 0.0f;
        if (z2) {
            f10 = f2;
        }
        rectF.set(f3, f7, f8, f9 - f10);
        RectF rectF2 = this.A0A;
        float f11 = this.A02;
        float f12 = (((float) rect2.left) + f2) - f11;
        float f13 = (float) rect2.top;
        float f14 = 0.0f;
        if (z) {
            f14 = f2;
        }
        float f15 = this.A05;
        float f16 = (f13 + f14) - f15;
        float f17 = (((float) rect2.right) - f2) - f11;
        float f18 = (float) rect2.bottom;
        if (z2) {
            f5 = f2;
        }
        rectF2.set(f12, f16, f17, (f18 - f5) - f15);
        if (z != z2) {
            Path path = this.A00;
            if (path == null) {
                this.A00 = C36441kJ.A0M();
            } else {
                path.reset();
            }
            float[] fArr = new float[8];
            float f19 = 0.0f;
            if (z) {
                f = this.A01;
            } else {
                f = 0.0f;
            }
            Arrays.fill(fArr, 0, 4, f);
            if (z2) {
                f19 = this.A01;
            }
            Arrays.fill(fArr, 4, 8, f19);
            this.A00.addRoundRect(rectF, fArr, Path.Direction.CW);
        } else {
            this.A00 = null;
        }
        float f20 = this.A01;
        float f21 = -f20;
        RectF rectF3 = new RectF(f21, f21, f20, f20);
        RectF rectF4 = new RectF(rectF3);
        float f22 = -f2;
        rectF4.inset(f22, f22);
        int[] iArr = new int[3];
        int i = this.A06;
        float f23 = this.A03;
        C109515Xw.A01(iArr, f23 / 255.0f, i, 0);
        iArr[1] = C109515Xw.A00(i, (f23 * 0.5f) / 255.0f);
        iArr[2] = C109515Xw.A00(i, 0.0f);
        float[] fArr2 = new float[3];
        float[] fArr3 = fArr2;
        // fill-array-data instruction
        fArr2[0] = 0;
        fArr2[1] = 1056964608;
        fArr2[2] = 1065353216;
        float f24 = f20 + f2;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        RadialGradient radialGradient = new RadialGradient(0.0f, 0.0f, f24, iArr, fArr2, tileMode);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            Path[] pathArr = this.A0F;
            if (i3 < pathArr.length) {
                Path path2 = pathArr[i3];
                path2.reset();
                path2.setFillType(Path.FillType.EVEN_ODD);
                this.A0D[i3].setShader(radialGradient);
                if (i2 == 90) {
                    i2 = 90;
                    path2.moveTo(0.0f, f21);
                    path2.rLineTo(0.0f, f22);
                    linearGradient = new LinearGradient(0.0f, 0.0f, f24, 0.0f, iArr, fArr3, tileMode);
                } else if (i2 == 180) {
                    i2 = 180;
                    path2.moveTo(f20, 0.0f);
                    path2.rLineTo(f2, 0.0f);
                    linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f24, iArr, fArr3, tileMode);
                } else if (i2 != 270) {
                    path2.moveTo(f21, 0.0f);
                    path2.rLineTo(f22, 0.0f);
                    linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, f22 - f20, iArr, fArr3, tileMode);
                } else {
                    i2 = 270;
                    path2.moveTo(0.0f, f20);
                    path2.rLineTo(0.0f, f2);
                    linearGradient = new LinearGradient(0.0f, 0.0f, f22 - f20, 0.0f, iArr, fArr3, tileMode);
                }
                float f25 = (float) i2;
                path2.arcTo(rectF4, 180.0f + f25, 90.0f, false);
                path2.arcTo(rectF3, f25 + 270.0f, -90.0f, false);
                path2.close();
                this.A0E[i3].setShader(linearGradient);
                i2 += 90;
                i3++;
            } else {
                return;
            }
        }
    }

    public void setAlpha(int i) {
        for (Paint alpha : this.A0D) {
            alpha.setAlpha(i);
        }
        for (Paint alpha2 : this.A0E) {
            alpha2.setAlpha(i);
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        for (Paint colorFilter2 : this.A0D) {
            colorFilter2.setColorFilter(colorFilter);
        }
        for (Paint colorFilter3 : this.A0E) {
            colorFilter3.setColorFilter(colorFilter);
        }
    }
}
