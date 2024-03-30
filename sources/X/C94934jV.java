package X;

import android.graphics.Paint;

/* renamed from: X.4jV  reason: invalid class name and case insensitive filesystem */
public final class C94934jV extends C94894iy {
    public static final C158827iI A02;
    public C161777nS A00;
    public C94924j1 A01;

    static {
        C137416g6 r2 = new C137416g6();
        r2.BqV(C133336Xx.A02);
        Paint paint = r2.A01;
        paint.setStrokeWidth(1.0f);
        C36421kH.A0q(paint);
        A02 = r2;
    }

    public C94934jV(C161777nS r2, C137846gp r3) {
        super(r3);
        C94904iz r0;
        this.A00 = r2;
        if (r3.A07 != null) {
            r0 = new C94904iz(this);
        } else {
            r0 = null;
        }
        this.A01 = r0;
    }

    public void A0E(C006302t r2, float f, long j) {
        super.A0E(r2, f, j);
        if (!this.A01) {
            A0S();
            A0H().Bld();
        }
    }

    public AnonymousClass6Q4 BPj(long j) {
        A0D(j);
        C161777nS r1 = this.A00;
        C94894iy r0 = this.A05;
        AnonymousClass00C.A0B(r0);
        A0X(r1.BPi(r0, this, j));
        A0R();
        return this;
    }
}
