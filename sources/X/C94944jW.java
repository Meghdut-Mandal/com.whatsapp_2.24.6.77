package X;

import android.graphics.Paint;

/* renamed from: X.4jW  reason: invalid class name and case insensitive filesystem */
public final class C94944jW extends C94894iy {
    public static final C158827iI A02;
    public C94924j1 A00;
    public final C94104he A01;

    static {
        C137416g6 r2 = new C137416g6();
        r2.BqV(C133336Xx.A03);
        Paint paint = r2.A01;
        paint.setStrokeWidth(1.0f);
        C36421kH.A0q(paint);
        A02 = r2;
    }

    public C94944jW(C137846gp r2) {
        super(r2);
        C94914j0 r0;
        C94104he r02 = new C94104he();
        this.A01 = r02;
        r02.A0E(this);
        if (r2.A07 != null) {
            r0 = new C94914j0(this);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public void A0E(C006302t r2, float f, long j) {
        super.A0E(r2, f, j);
        if (!this.A01) {
            A0S();
            this.A0G.A0P.A0G.A0H();
        }
    }

    public AnonymousClass6Q4 BPj(long j) {
        A0D(j);
        C137846gp r5 = this.A0G;
        C1506776e A09 = r5.A09();
        int i = A09.A00;
        if (i > 0) {
            int i2 = 0;
            Object[] objArr = A09.A01;
            do {
                ((C137846gp) objArr[i2]).A0P.A0G.A07 = C023109s.A0C;
                i2++;
            } while (i2 < i);
        }
        A0X(r5.A06.BPh(this, r5.A0P.A0G.A0F(), j));
        A0R();
        return this;
    }
}
