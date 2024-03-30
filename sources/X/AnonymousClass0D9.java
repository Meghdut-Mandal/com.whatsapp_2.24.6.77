package X;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.0D9  reason: invalid class name */
public class AnonymousClass0D9 extends AnonymousClass0D8 {
    public static final RectF A06 = new RectF();
    @Deprecated
    public float A00;
    @Deprecated
    public float A01;
    @Deprecated
    public float A02;
    @Deprecated
    public float A03;
    @Deprecated
    public float A04;
    @Deprecated
    public float A05;

    public void A00(Matrix matrix, Path path) {
        Matrix matrix2 = this.A00;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = A06;
        rectF.set(this.A01, this.A05, this.A02, this.A00);
        path.arcTo(rectF, this.A03, this.A04, false);
        path.transform(matrix);
    }

    public AnonymousClass0D9(float f, float f2, float f3, float f4) {
        this.A01 = f;
        this.A05 = f2;
        this.A02 = f3;
        this.A00 = f4;
    }
}
