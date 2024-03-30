package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.5hq  reason: invalid class name and case insensitive filesystem */
public class C114795hq {
    public final Matrix A00;

    public C114795hq(Matrix matrix, int i, int i2, int i3, int i4) {
        RectF A0L = C90514aH.A0L((float) i3, i4);
        matrix.mapRect(A0L);
        Matrix A0B = C90524aI.A0B();
        A0B.setScale(i == 1 ? -1.0f : 1.0f, 1.0f);
        A0B.postRotate((float) i2);
        Matrix A0B2 = C90524aI.A0B();
        A0B2.setRectToRect(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), A0L, Matrix.ScaleToFit.FILL);
        A0B.setConcat(A0B2, A0B);
        Matrix A0B3 = C90524aI.A0B();
        this.A00 = A0B3;
        A0B.invert(A0B3);
    }
}
