package X;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bU  reason: invalid class name and case insensitive filesystem */
public class C91114bU extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final Paint A07;
    public final RectF A08 = C36441kJ.A0N();

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A07.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A07.setColorFilter(colorFilter);
    }

    public C91114bU(int i, int i2, float f) {
        Paint A0K = C36441kJ.A0K();
        this.A07 = A0K;
        A0K.setAntiAlias(false);
        A0K.setDither(true);
        C36431kI.A1L(A0K);
        this.A03 = f;
        this.A06 = i;
        this.A05 = i2;
        this.A04 = ((float) Color.alpha(i)) / 255.0f;
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A07);
        canvas.restoreToCount(save);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A08;
        float f = this.A03;
        C90494aF.A0t(rect, rectF, (float) rect.left, f);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        float width = ((float) rect.width()) / 2.0f;
        this.A02 = width;
        if (width > 0.0f) {
            float f2 = f / width;
            float f3 = 1.0f - f2;
            float f4 = (f2 * 0.25f) + f3;
            if (f4 > 1.0f) {
                AnonymousClass6RS.A01("CDSCircularShadowDrawable", C90484aE.A0o("Gradient quarter fraction cannot be greater than 1, value is: ", AnonymousClass000.A0u(), f4));
                return;
            }
            int[] iArr = new int[5];
            int i = this.A05;
            iArr[0] = i;
            iArr[1] = i;
            int i2 = this.A06;
            float f5 = this.A04;
            C109515Xw.A01(iArr, f5, i2, 2);
            C109515Xw.A01(iArr, f5 * 0.66f, i2, 3);
            iArr[4] = 16777215;
            this.A07.setShader(new RadialGradient(this.A00, this.A01, width, iArr, new float[]{0.0f, f3, f3, f4, 1.0f}, Shader.TileMode.CLAMP));
        }
    }
}
