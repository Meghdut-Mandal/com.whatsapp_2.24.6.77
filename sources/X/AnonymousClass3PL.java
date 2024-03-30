package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;

/* renamed from: X.3PL  reason: invalid class name */
public final class AnonymousClass3PL {
    public Bitmap A00;
    public Matrix A01;

    public static final boolean A00(AnonymousClass3PL r2) {
        Matrix matrix = r2.A01;
        boolean z = false;
        if (matrix == null) {
            return false;
        }
        float[] fArr = {0.0f, 1.0f};
        matrix.mapVectors(fArr);
        if (fArr[0] == 0.0f) {
            z = true;
        }
        return !z;
    }

    public AnonymousClass3PL(Bitmap bitmap) {
        this.A00 = bitmap;
    }
}
