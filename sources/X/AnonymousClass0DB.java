package X;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: X.0DB  reason: invalid class name */
public class AnonymousClass0DB extends AnonymousClass0D8 {
    public float A00;
    public float A01;

    public void A00(Matrix matrix, Path path) {
        Matrix matrix2 = this.A00;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.A00, this.A01);
        path.transform(matrix);
    }
}
