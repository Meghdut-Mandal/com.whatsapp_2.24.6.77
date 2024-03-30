package X;

import android.graphics.Paint;
import android.graphics.PathEffect;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;

/* renamed from: X.4ci  reason: invalid class name and case insensitive filesystem */
public final class C91844ci extends CharacterStyle implements UpdateAppearance {
    public final C109085Wf A00;

    public void updateDrawState(TextPaint textPaint) {
        Paint.Join join;
        Paint.Cap cap;
        if (textPaint != null) {
            C109085Wf r2 = this.A00;
            if (AnonymousClass00C.A0J(r2, C94604iU.A00)) {
                C36431kI.A1L(textPaint);
            } else if (r2 instanceof C94594iT) {
                C36421kH.A0q(textPaint);
                C94594iT r22 = (C94594iT) r2;
                textPaint.setStrokeWidth(r22.A01);
                textPaint.setStrokeMiter(r22.A00);
                int i = r22.A03;
                if (i == 0) {
                    join = Paint.Join.MITER;
                } else if (i == 1) {
                    join = Paint.Join.ROUND;
                } else {
                    join = Paint.Join.BEVEL;
                }
                textPaint.setStrokeJoin(join);
                int i2 = r22.A02;
                if (i2 != 0) {
                    if (i2 == 1) {
                        cap = Paint.Cap.ROUND;
                    } else if (i2 == 2) {
                        cap = Paint.Cap.SQUARE;
                    }
                    textPaint.setStrokeCap(cap);
                    textPaint.setPathEffect((PathEffect) null);
                }
                cap = Paint.Cap.BUTT;
                textPaint.setStrokeCap(cap);
                textPaint.setPathEffect((PathEffect) null);
            }
        }
    }

    public C91844ci(C109085Wf r1) {
        this.A00 = r1;
    }
}
