package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.5Cg  reason: invalid class name */
public final class AnonymousClass5Cg extends C129196Ft {
    public final Matrix A00 = C90524aI.A0B();
    public final Paint A01 = C36371kC.A0E();
    public final Path A02;
    public final Path A03 = C36441kJ.A0M();

    public void A0F(float f) {
        super.A0F((((float) 2) * f) / ((float) 3));
    }

    public void A0J(RectF rectF, float f, float f2, float f3, float f4) {
        AnonymousClass00C.A0D(rectF, 0);
        float f5 = (float) 2;
        float f6 = (f2 + f4) / f5;
        float f7 = (((f3 - f) * f5) / ((float) 3)) / f5;
        super.A0J(rectF, f, f6 - f7, f3, f6 + f7);
    }

    public AnonymousClass5Cg() {
        Path A0M = C36441kJ.A0M();
        this.A02 = A0M;
        double d = (double) 1000.0f;
        double radians = Math.toRadians((double) 35.0f);
        float cos = (float) (Math.cos(radians) * d);
        float sin = (float) (Math.sin(radians) * d);
        double radians2 = Math.toRadians((double) 55.0f);
        A0M.addArc(new RectF(-1000.0f, -1000.0f, 1000.0f, 1000.0f), 55.0f, ((float) 360) - 20.0f);
        A0M.moveTo(cos, sin);
        A0M.lineTo(1200.0f, 1200.0f);
        A0M.lineTo((float) (Math.cos(radians2) * d), (float) (d * Math.sin(radians2)));
    }
}
