package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.ComposeShader;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* renamed from: X.4bg  reason: invalid class name and case insensitive filesystem */
public class C91234bg extends Drawable {
    public static final float[] A07 = {0.0f, 0.15428571f, 0.46666667f, 0.6027778f, 0.69166666f, 1.0f};
    public static final int[] A08;
    public static final int[] A09;
    public static final int[] A0A;
    public float A00;
    public float A01;
    public float A02;
    public final float A03;
    public final Paint A04;
    public final boolean A05;
    public final RectF A06 = C36441kJ.A0N();

    static {
        int A002 = C109515Xw.A00(-6278145, 0.1f);
        A09 = new int[]{A002, C109515Xw.A00(-15173646, 0.1f), C109515Xw.A00(-14298266, 0.1f), C109515Xw.A00(-668109, 0.1f), C109515Xw.A00(-37796, 0.1f), A002};
        int[] iArr = new int[6];
        int A003 = C109515Xw.A00(-7982634, 0.2f);
        iArr[0] = A003;
        C109515Xw.A01(iArr, 0.2f, -15111988, 1);
        C109515Xw.A01(iArr, 0.2f, -14438052, 2);
        C109515Xw.A01(iArr, 0.2f, -3494861, 3);
        C109515Xw.A01(iArr, 0.2f, -2990252, 4);
        iArr[5] = A003;
        A08 = iArr;
        int[] iArr2 = new int[5];
        iArr2[0] = 16777215;
        iArr2[1] = 16777215;
        C109515Xw.A01(iArr2, 0.3f, -16777216, 2);
        C109515Xw.A01(iArr2, 0.2f, -16777216, 3);
        iArr2[4] = 16777215;
        A0A = iArr2;
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public C91234bg(Context context, C1271967i r4) {
        Paint A0K = C36441kJ.A0K();
        this.A04 = A0K;
        A0K.setAntiAlias(false);
        A0K.setDither(true);
        C36431kI.A1L(A0K);
        this.A03 = C109525Xx.A00(context, 12.0f);
        this.A05 = r4.A03;
    }

    public void draw(Canvas canvas) {
        int save = canvas.save();
        canvas.rotate(94.0f, this.A00, this.A01);
        canvas.drawCircle(this.A00, this.A01, this.A02, this.A04);
        canvas.restoreToCount(save);
    }

    public void onBoundsChange(Rect rect) {
        int[] iArr;
        ComposeShader composeShader;
        super.onBoundsChange(rect);
        RectF rectF = this.A06;
        float f = this.A03;
        C90494aF.A0t(rect, rectF, (float) rect.left, f);
        this.A00 = rectF.centerX();
        this.A01 = rectF.centerY();
        this.A02 = ((float) rect.width()) / 2.0f;
        if (this.A05) {
            iArr = A08;
        } else {
            iArr = A09;
        }
        SweepGradient sweepGradient = new SweepGradient(this.A00, this.A01, iArr, A07);
        float f2 = this.A02;
        if (f2 > 0.0f) {
            float f3 = f / f2;
            float f4 = 1.0f - f3;
            float f5 = (f3 * 0.25f) + f4;
            if (f5 > 1.0f) {
                AnonymousClass6RS.A01("CDSCircularShadowDrawable", C90484aE.A0o("Gradient quarter fraction cannot be greater than 1, value is: ", AnonymousClass000.A0u(), f5));
                return;
            }
            float[] fArr = new float[5];
            C90484aE.A1O(fArr, 0.0f, f4);
            fArr[2] = f4;
            fArr[3] = f5;
            fArr[4] = 1.0f;
            float f6 = this.A00;
            float f7 = this.A01;
            int[] iArr2 = A0A;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            RadialGradient radialGradient = new RadialGradient(f6, f7, f2, iArr2, fArr, tileMode);
            if (Build.VERSION.SDK_INT < 28) {
                Bitmap A092 = C90524aI.A09(rect.width(), rect.height());
                float f8 = this.A00;
                float f9 = this.A01;
                float f10 = this.A02;
                Paint A0K = C36441kJ.A0K();
                C36431kI.A1L(A0K);
                A0K.setDither(true);
                A0K.setShader(radialGradient);
                C90524aI.A0A(A092).drawCircle(f8, f9, f10, A0K);
                composeShader = new ComposeShader(new BitmapShader(A092, tileMode, tileMode), sweepGradient, PorterDuff.Mode.SRC_IN);
            } else {
                composeShader = new ComposeShader(radialGradient, sweepGradient, PorterDuff.Mode.SRC_IN);
            }
            this.A04.setShader(composeShader);
        }
    }
}
