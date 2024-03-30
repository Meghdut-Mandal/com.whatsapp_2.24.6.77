package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bX  reason: invalid class name and case insensitive filesystem */
public class C91144bX extends Drawable {
    public boolean A00;
    public final Path A01 = C36441kJ.A0M();
    public final RectF A02;
    public final float[] A03;
    public final Paint A04;

    public void A00(int i) {
        Paint paint = this.A04;
        if (i != paint.getColor()) {
            paint.setColor(i);
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.A00) {
            RectF rectF = this.A02;
            float f = this.A03[0];
            canvas.drawRoundRect(rectF, f, f, this.A04);
            return;
        }
        canvas.drawPath(this.A01, this.A04);
    }

    public int getOpacity() {
        float[] fArr = this.A03;
        int length = fArr.length;
        int i = 0;
        while (true) {
            if (i < length) {
                if (Float.compare(fArr[i], 0.0f) == 0) {
                    break;
                }
                i++;
            } else if (this.A04.getAlpha() != 255) {
                return -3;
            } else {
                return -1;
            }
        }
        return -3;
    }

    public void setAlpha(int i) {
        Paint paint = this.A04;
        if (i != paint.getAlpha()) {
            paint.setAlpha(i);
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C91144bX() {
        Paint A0K = C36441kJ.A0K();
        this.A04 = A0K;
        this.A02 = C36441kJ.A0N();
        this.A03 = new float[8];
        this.A00 = true;
        A0K.setAntiAlias(true);
        C36431kI.A1L(A0K);
    }

    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        RectF rectF = this.A02;
        rectF.set(rect);
        if (!this.A00) {
            Path path = this.A01;
            path.reset();
            path.addRoundRect(rectF, this.A03, Path.Direction.CW);
        }
    }
}
