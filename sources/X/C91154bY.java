package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bY  reason: invalid class name and case insensitive filesystem */
public class C91154bY extends Drawable {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public final Paint A04;
    public final Paint A05 = C36441kJ.A0L(5);
    public final float[] A06;
    public final Path A07;
    public final Path A08;
    public final Rect A09;
    public final RectF A0A;
    public final RectF A0B;

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void draw(Canvas canvas) {
        if (C131796Qq.A02(this.A03)) {
            RectF rectF = this.A0B;
            float f = this.A02;
            canvas.drawRoundRect(rectF, f, f, this.A05);
            Paint paint = this.A04;
            if (paint.getStrokeWidth() != 0.0f) {
                RectF rectF2 = this.A0A;
                float f2 = this.A01;
                canvas.drawRoundRect(rectF2, f2, f2, paint);
                return;
            }
            return;
        }
        canvas.drawPath(this.A08, this.A05);
        Paint paint2 = this.A04;
        if (paint2.getStrokeWidth() != 0.0f) {
            canvas.drawPath(this.A07, paint2);
        }
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.A09, this.A02);
    }

    public C91154bY() {
        Paint A0E = C36371kC.A0E();
        this.A04 = A0E;
        this.A0B = C36441kJ.A0N();
        this.A09 = AnonymousClass001.A06();
        this.A0A = C36441kJ.A0N();
        this.A08 = C36441kJ.A0M();
        this.A07 = C36441kJ.A0M();
        this.A06 = new float[8];
        C36421kH.A0q(A0E);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A0B;
        rectF.set(rect);
        this.A09.set(rect);
        RectF rectF2 = this.A0A;
        C90494aF.A0t(rect, rectF2, (float) rect.left, this.A00);
        int i = this.A03;
        if (!C131796Qq.A02(i)) {
            Path path = this.A08;
            float f = this.A02;
            float[] fArr = this.A06;
            C131796Qq.A01(fArr, f, i);
            path.reset();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            if (this.A04.getStrokeWidth() != 0.0f) {
                Path path2 = this.A07;
                C131796Qq.A01(fArr, this.A01, this.A03);
                path2.reset();
                path2.addRoundRect(rectF2, fArr, Path.Direction.CW);
            }
        }
    }
}
