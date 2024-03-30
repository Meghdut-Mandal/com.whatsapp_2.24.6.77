package X;

import android.graphics.RectF;

/* renamed from: X.4t2  reason: invalid class name and case insensitive filesystem */
public abstract class C99294t2 extends C012505l {
    public final RectF A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C99294t2(AnonymousClass06J r2) {
        super(r2 == null ? new AnonymousClass06J() : r2);
        this.A00 = C36441kJ.A0N();
    }

    public void A0F(float f, float f2, float f3, float f4) {
        RectF rectF = this.A00;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }
}
