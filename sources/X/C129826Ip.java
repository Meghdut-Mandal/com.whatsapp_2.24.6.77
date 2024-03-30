package X;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.View;

/* renamed from: X.6Ip  reason: invalid class name and case insensitive filesystem */
public abstract class C129826Ip {
    public static final Matrix A00 = C90524aI.A0B();
    public static final float[] A01 = C90524aI.A0v();

    public static PointF A00(PointF pointF, View view) {
        float[] fArr = A01;
        fArr[0] = pointF.x - ((float) view.getLeft());
        fArr[1] = pointF.y - ((float) view.getTop());
        Matrix matrix = view.getMatrix();
        Matrix matrix2 = A00;
        matrix.invert(matrix2);
        matrix2.mapPoints(fArr);
        matrix2.reset();
        return new PointF(fArr[0], fArr[1]);
    }
}
