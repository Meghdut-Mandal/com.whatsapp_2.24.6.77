package X;

import android.graphics.Matrix;
import android.graphics.RectF;

/* renamed from: X.5be  reason: invalid class name and case insensitive filesystem */
public abstract class C111045be {
    public static final Matrix A00(Matrix matrix, RectF rectF, float f) {
        if (matrix == null) {
            matrix = C90524aI.A0B();
        } else {
            matrix.reset();
        }
        matrix.setRotate(f);
        float f2 = 0.0f;
        if (!AnonymousClass000.A1Q((f > 90.0f ? 1 : (f == 90.0f ? 0 : -1)))) {
            if (f == 180.0f) {
                f2 = -rectF.width();
            } else if (f == 270.0f) {
                matrix.preTranslate(-rectF.width(), 0.0f);
                return matrix;
            } else {
                if (f != 0.0f) {
                    throw AnonymousClass001.A08("Failed requirement.");
                }
                return matrix;
            }
        }
        matrix.preTranslate(f2, -rectF.height());
        return matrix;
    }
}
