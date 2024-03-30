package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.graphics.Shader;
import android.text.TextPaint;

/* renamed from: X.4ca  reason: invalid class name and case insensitive filesystem */
public final class C91764ca extends TextPaint {
    public AnonymousClass6PD A00 = AnonymousClass6PD.A03;
    public C109085Wf A01;
    public C131366Ot A02 = C131366Ot.A01;
    public final C158827iI A03 = new C137416g6(this);

    public C91764ca(float f) {
        super(1);
        this.density = f;
    }

    public final void A00(int i) {
        C137416g6 r1 = (C137416g6) this.A03;
        if (r1.A00 != i) {
            r1.A00 = i;
            AnonymousClass5WY.A00(i, r1.A01);
        }
    }

    public final void A01(C125185zS r6, float f, long j) {
        float A012;
        if (((r6 instanceof C94484iI) && ((C94484iI) r6).A00 != C133336Xx.A05) || ((r6 instanceof C94474iH) && j != AnonymousClass6X0.A01)) {
            C158827iI r2 = this.A03;
            if (Float.isNaN(f)) {
                A012 = ((float) ((C137416g6) r2).A01.getAlpha()) / 255.0f;
            } else {
                A012 = C15040mb.A01(f, 0.0f, 1.0f);
            }
            r6.A00(r2, A012, j);
        } else if (r6 == null) {
            C137416g6 r0 = (C137416g6) this.A03;
            r0.A02 = null;
            r0.A01.setShader((Shader) null);
        }
    }

    public final void A02(AnonymousClass6PD r7) {
        if (r7 != null && !AnonymousClass00C.A0J(this.A00, r7)) {
            this.A00 = r7;
            if (r7.equals(AnonymousClass6PD.A03)) {
                clearShadowLayer();
                return;
            }
            AnonymousClass6PD r2 = this.A00;
            float f = r2.A00;
            if (f == 0.0f) {
                f = Float.MIN_VALUE;
            }
            long j = r2.A02;
            setShadowLayer(f, C133206Xf.A00(j), C133206Xf.A01(j), C90514aH.A0D(C133336Xx.A06(C114185go.A0G, r2.A01)));
        }
    }

    public final void A03(C109085Wf r4) {
        Paint.Join join;
        Paint.Cap cap;
        if (r4 != null && !AnonymousClass00C.A0J(this.A01, r4)) {
            this.A01 = r4;
            if (r4.equals(C94604iU.A00)) {
                C36431kI.A1L(((C137416g6) this.A03).A01);
            } else if (r4 instanceof C94594iT) {
                Paint paint = ((C137416g6) this.A03).A01;
                C36421kH.A0q(paint);
                C94594iT r42 = (C94594iT) r4;
                paint.setStrokeWidth(r42.A01);
                paint.setStrokeMiter(r42.A00);
                int i = r42.A03;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 2) {
                    join = Paint.Join.BEVEL;
                } else {
                    join = Paint.Join.ROUND;
                }
                paint.setStrokeJoin(join);
                int i2 = r42.A02;
                if (i2 == 2) {
                    cap = Paint.Cap.SQUARE;
                } else if (i2 == 1) {
                    cap = Paint.Cap.ROUND;
                } else {
                    cap = Paint.Cap.BUTT;
                }
                paint.setStrokeCap(cap);
                paint.setPathEffect((PathEffect) null);
            }
        }
    }

    public final void A04(C131366Ot r3) {
        if (r3 != null && !AnonymousClass00C.A0J(this.A02, r3)) {
            this.A02 = r3;
            int i = r3.A00;
            setUnderlineText(AnonymousClass000.A1S(1 | i, i));
            int i2 = this.A02.A00;
            setStrikeThruText(AnonymousClass000.A1S(2 | i2, i2));
        }
    }
}
