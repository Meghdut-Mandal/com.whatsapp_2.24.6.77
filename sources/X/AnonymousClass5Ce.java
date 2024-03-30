package X;

import android.graphics.RectF;

/* renamed from: X.5Ce  reason: invalid class name */
public final class AnonymousClass5Ce extends C129196Ft {
    public void A0J(RectF rectF, float f, float f2, float f3, float f4) {
        float f5 = f3 - f;
        float f6 = f4 - f2;
        float f7 = f5;
        if (f5 > f6) {
            f7 = f6;
        }
        RectF rectF2 = this.A02;
        float f8 = (float) 2;
        float f9 = (f5 - f7) / f8;
        float f10 = (f6 - f7) / f8;
        rectF2.set(f + f9, f2 + f10, f3 - f9, f4 - f10);
        rectF2.sort();
    }

    public AnonymousClass5Ce() {
        C36421kH.A0q(this.A01);
    }
}
