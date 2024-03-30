package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;

/* renamed from: X.0DA  reason: invalid class name */
public class AnonymousClass0DA extends AnonymousClass06Y {
    public final AnonymousClass0D9 A00;

    public void A00(Canvas canvas, Matrix matrix, AnonymousClass06Z r21, int i) {
        int[] iArr;
        int i2;
        AnonymousClass0D9 r2 = this.A00;
        RectF rectF = AnonymousClass0D9.A06;
        float f = r2.A03;
        float f2 = r2.A04;
        RectF rectF2 = new RectF(r2.A01, r2.A05, r2.A02, r2.A00);
        boolean z = false;
        if (f2 < 0.0f) {
            z = true;
        }
        AnonymousClass06Z r5 = r21;
        Path path = r5.A07;
        int i3 = i;
        if (z) {
            iArr = AnonymousClass06Z.A0A;
            iArr[0] = 0;
            iArr[1] = r5.A00;
            iArr[2] = r5.A01;
            i2 = r5.A02;
        } else {
            path.rewind();
            path.moveTo(rectF2.centerX(), rectF2.centerY());
            path.arcTo(rectF2, f, f2);
            path.close();
            float f3 = (float) (-i3);
            rectF2.inset(f3, f3);
            iArr = AnonymousClass06Z.A0A;
            iArr[0] = 0;
            iArr[1] = r5.A02;
            iArr[2] = r5.A01;
            i2 = r5.A00;
        }
        iArr[3] = i2;
        float width = rectF2.width() / 2.0f;
        if (width > 0.0f) {
            float f4 = 1.0f - (((float) i3) / width);
            float[] fArr = AnonymousClass06Z.A08;
            fArr[1] = f4;
            fArr[2] = ((1.0f - f4) / 2.0f) + f4;
            RadialGradient radialGradient = new RadialGradient(rectF2.centerX(), rectF2.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
            Paint paint = r5.A03;
            paint.setShader(radialGradient);
            Canvas canvas2 = canvas;
            canvas2.save();
            canvas2.concat(matrix);
            canvas2.scale(1.0f, rectF2.height() / rectF2.width());
            if (!z) {
                canvas2.clipPath(path, Region.Op.DIFFERENCE);
                canvas2.drawPath(path, r5.A06);
            }
            canvas2.drawArc(rectF2, f, f2, true, paint);
            canvas2.restore();
        }
    }

    public AnonymousClass0DA(AnonymousClass0D9 r1) {
        this.A00 = r1;
    }
}
