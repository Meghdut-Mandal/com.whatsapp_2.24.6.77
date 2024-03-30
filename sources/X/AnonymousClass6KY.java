package X;

import android.view.View;

/* renamed from: X.6KY  reason: invalid class name */
public class AnonymousClass6KY {
    public final C123035vp A00;
    public final C157827ek A01;
    public final boolean A02;
    public final C133296Xs A03;

    public static int A00(float f, float f2) {
        int round;
        int i;
        if (f == f2) {
            round = Math.round(f);
            i = 1073741824;
        } else if (Float.isNaN(f2)) {
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        } else {
            round = Math.round(f2);
            i = Integer.MIN_VALUE;
        }
        return View.MeasureSpec.makeMeasureSpec(round, i);
    }

    public AnonymousClass6KY(C123035vp r1, C157827ek r2, C133296Xs r3, boolean z) {
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r3;
        this.A02 = z;
    }
}
