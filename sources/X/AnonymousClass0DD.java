package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.List;

/* renamed from: X.0DD  reason: invalid class name */
public class AnonymousClass0DD extends AnonymousClass06Y {
    public final /* synthetic */ Matrix A00;
    public final /* synthetic */ C014006c A01;
    public final /* synthetic */ List A02;

    public AnonymousClass0DD(Matrix matrix, C014006c r2, List list) {
        this.A01 = r2;
        this.A02 = list;
        this.A00 = matrix;
    }

    public void A00(Canvas canvas, Matrix matrix, AnonymousClass06Z r6, int i) {
        for (AnonymousClass06Y A002 : this.A02) {
            A002.A00(canvas, this.A00, r6, i);
        }
    }
}
