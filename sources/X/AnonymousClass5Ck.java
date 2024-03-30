package X;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: X.5Ck  reason: invalid class name */
public final class AnonymousClass5Ck extends C129196Ft {
    public static final C123885xF[] A07 = {new C123885xF(68.0f, 47.0f, 309.0f, 266.0f, 164.0f, 156.0f), new C123885xF(246.0f, 17.0f, 419.0f, 142.0f, 196.0f, 124.0f), new C123885xF(390.0f, 0.0f, 546.0f, 155.0f, 195.0f, 128.0f), new C123885xF(507.0f, 1.0f, 686.0f, 179.0f, 208.0f, 146.0f), new C123885xF(575.0f, 64.0f, 750.0f, 235.0f, 284.0f, 122.0f), new C123885xF(530.0f, 141.0f, 769.0f, 357.0f, 324.0f, 118.0f), new C123885xF(459.0f, 261.0f, 664.0f, 449.0f, 300.0f, 180.0f), new C123885xF(275.0f, 316.0f, 510.0f, 512.0f, 0.0f, 164.0f), new C123885xF(97.0f, 286.0f, 346.0f, 482.0f, 56.0f, 100.0f), new C123885xF(17.0f, 279.0f, 174.0f, 419.0f, 67.0f, 152.0f), new C123885xF(0.0f, 171.0f, 157.0f, 311.0f, 91.0f, 170.0f)};
    public final Matrix A00;
    public final Paint A01;
    public final Path A02;
    public final Path A03;
    public final Path A04;
    public final RectF A05;
    public final RectF A06;

    public void A0F(float f) {
        super.A0F((((float) 3) * f) / ((float) 5));
    }

    public void A0J(RectF rectF, float f, float f2, float f3, float f4) {
        RectF rectF2 = rectF;
        AnonymousClass00C.A0D(rectF, 0);
        float f5 = f3 - f;
        float f6 = f4 - f2;
        RectF rectF3 = this.A05;
        if (f5 / f6 < rectF3.width() / rectF3.height()) {
            f6 = (rectF3.height() * f5) / rectF3.width();
        } else {
            f5 = (rectF3.width() * f6) / rectF3.height();
        }
        float f7 = (float) 2;
        float f8 = (f + f3) / f7;
        float f9 = (f2 + f4) / f7;
        float f10 = f5 / f7;
        float f11 = f6 / f7;
        super.A0J(rectF2, f8 - f10, f9 - f11, f8 + f10, f9 + f11);
    }

    public static final void A00(Canvas canvas, AnonymousClass5Ck r12, float f, float f2) {
        RectF rectF = r12.A02;
        float width = rectF.width() / r12.A05.width();
        float f3 = ((float) 60) * width * f2;
        float f4 = ((float) 30) * width * f2;
        double d = (double) 2;
        float centerX = rectF.centerX() + (((float) ((Math.cos(Math.toRadians((double) r12.A00)) * ((double) rectF.width())) / d)) * f);
        float centerY = rectF.centerY() + (f * ((float) ((Math.sin(Math.toRadians((double) r12.A00)) * ((double) rectF.height())) / d)));
        RectF rectF2 = r12.A06;
        rectF2.set(centerX - f3, centerY - f4, centerX + f3, centerY + f4);
        canvas.drawOval(rectF2, r12.A01);
        canvas.drawOval(rectF2, r12.A01);
    }

    public AnonymousClass5Ck() {
        Path.Direction direction;
        Path A0M = C36441kJ.A0M();
        C123885xF[] r9 = A07;
        int i = 0;
        do {
            C123885xF r6 = r9[i];
            A0M.addArc(new RectF(r6.A01, r6.A05, r6.A02, r6.A00), r6.A03, r6.A04);
            i++;
        } while (i < 11);
        this.A03 = A0M;
        Path A0M2 = C36441kJ.A0M();
        int i2 = 0;
        do {
            C123885xF r0 = r9[i2];
            RectF rectF = new RectF(r0.A01, r0.A05, r0.A02, r0.A00);
            direction = Path.Direction.CW;
            A0M2.addOval(rectF, direction);
            i2++;
        } while (i2 < 11);
        A0M2.addRect(120.0f, 80.0f, 580.0f, 430.0f, direction);
        this.A02 = A0M2;
        this.A01 = C36441kJ.A0L(1);
        this.A00 = C90524aI.A0B();
        RectF A0N = C36441kJ.A0N();
        this.A05 = A0N;
        this.A04 = C36441kJ.A0M();
        this.A06 = C36441kJ.A0N();
        A0M.setFillType(Path.FillType.WINDING);
        A0M.computeBounds(A0N, true);
        this.A00 = 120.0f;
    }
}
