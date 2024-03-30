package X;

import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.Collections;

/* renamed from: X.81F  reason: invalid class name */
public class AnonymousClass81F extends C208409yC {
    public final C208359y6 A00;
    public final AnonymousClass81G A01;

    public AnonymousClass81F(AnonymousClass9Y2 r5, C165737u4 r6, AnonymousClass81G r7, C195509Uo r8) {
        super(r6, r8);
        this.A01 = r7;
        C208359y6 r2 = new C208359y6(r5, r6, new C208549yR("__container", r8.A0M, false), this);
        this.A00 = r2;
        r2.Bqe(Collections.emptyList(), Collections.emptyList());
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        super.B8v(matrix, rectF, z);
        this.A00.B8v(this.A0A, rectF, z);
    }
}
