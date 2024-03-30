package X;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: X.81D  reason: invalid class name */
public class AnonymousClass81D extends C208409yC {
    public C196189Yb A00;
    public C196189Yb A01;
    public final Paint A02 = new C165717u2(3);
    public final Rect A03 = new Rect();
    public final Rect A04 = new Rect();
    public final AnonymousClass9M8 A05;

    public AnonymousClass81D(C165737u4 r3, C195509Uo r4) {
        super(r3, r4);
        AnonymousClass9M8 r0;
        String str = r4.A0J;
        AnonymousClass9Y2 r02 = r3.A0F;
        if (r02 == null) {
            r0 = null;
        } else {
            r0 = (AnonymousClass9M8) r02.A0A.get(str);
        }
        this.A05 = r0;
    }

    public void B0q(C199409fG r3, Object obj) {
        super.B0q(r3, obj);
        if (obj == B4R.A01) {
            if (r3 == null) {
                this.A00 = null;
            } else {
                this.A00 = new C1684980v(r3, (Object) null);
            }
        } else if (obj != B4R.A00) {
        } else {
            if (r3 == null) {
                this.A01 = null;
            } else {
                this.A01 = new C1684980v(r3, (Object) null);
            }
        }
    }

    public void B8v(Matrix matrix, RectF rectF, boolean z) {
        super.B8v(matrix, rectF, z);
        AnonymousClass9M8 r1 = this.A05;
        if (r1 != null) {
            float A002 = C203079nF.A00();
            rectF.set(0.0f, 0.0f, ((float) r1.A02) * A002, ((float) r1.A01) * A002);
            this.A0A.mapRect(rectF);
        }
    }
}
