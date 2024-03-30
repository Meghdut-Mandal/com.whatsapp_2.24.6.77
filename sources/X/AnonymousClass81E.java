package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.81E  reason: invalid class name */
public class AnonymousClass81E extends C208409yC {
    public C196189Yb A00;
    public final Paint A01;
    public final Path A02;
    public final C195509Uo A03;
    public final float[] A04;
    public final RectF A05 = C36441kJ.A0N();

    public AnonymousClass81E(C165737u4 r3, C195509Uo r4) {
        super(r3, r4);
        C165717u2 r1 = new C165717u2();
        this.A01 = r1;
        this.A04 = new float[8];
        this.A02 = C36441kJ.A0M();
        this.A03 = r4;
        r1.setAlpha(0);
        r1.setStyle(Paint.Style.FILL);
        r1.setColor(r4.A04);
    }

    public void B0q(C199409fG r3, Object obj) {
        C1684980v r1;
        super.B0q(r3, obj);
        if (obj == B4R.A01) {
            if (r3 == null) {
                r1 = null;
            } else {
                r1 = new C1684980v(r3, (Object) null);
            }
            this.A00 = r1;
        }
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        super.B8v(matrix, rectF, z);
        RectF rectF2 = this.A05;
        C195509Uo r1 = this.A03;
        rectF2.set(0.0f, 0.0f, (float) r1.A06, (float) r1.A05);
        this.A0A.mapRect(rectF2);
        rectF.set(rectF2);
    }
}
