package X;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;

/* renamed from: X.0DC  reason: invalid class name */
public class AnonymousClass0DC extends AnonymousClass06Y {
    public final float A00;
    public final float A01;
    public final AnonymousClass0DB A02;

    public void A00(Canvas canvas, Matrix matrix, AnonymousClass06Z r15, int i) {
        AnonymousClass0DB r6 = this.A02;
        float f = r6.A01;
        float f2 = this.A01;
        float f3 = r6.A00;
        float f4 = this.A00;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot((double) (f - f2), (double) (f3 - f4)), 0.0f);
        Matrix matrix2 = this.A00;
        matrix2.set(matrix);
        matrix2.preTranslate(f4, f2);
        matrix2.preRotate((float) Math.toDegrees(Math.atan((double) ((r6.A01 - f2) / (r6.A00 - f4)))));
        int i2 = i;
        rectF.bottom += (float) i2;
        rectF.offset(0.0f, (float) (-i2));
        int[] iArr = AnonymousClass06Z.A0B;
        iArr[0] = r15.A00;
        iArr[1] = r15.A01;
        iArr[2] = r15.A02;
        Paint paint = r15.A04;
        float f5 = rectF.left;
        paint.setShader(new LinearGradient(f5, rectF.top, f5, rectF.bottom, iArr, AnonymousClass06Z.A09, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    public AnonymousClass0DC(AnonymousClass0DB r1, float f, float f2) {
        this.A02 = r1;
        this.A00 = f;
        this.A01 = f2;
    }
}
