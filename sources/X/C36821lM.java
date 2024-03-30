package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.1lM  reason: invalid class name and case insensitive filesystem */
public class C36821lM extends Drawable {
    public int A00;
    public final Rect A01 = AnonymousClass001.A06();
    public final Paint A02 = C36371kC.A0E();
    public final Path A03 = C36441kJ.A0M();
    public final RectF A04 = C36441kJ.A0N();

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C36821lM(int i) {
        this.A00 = i;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        int width = bounds.width();
        Rect rect = this.A01;
        int max = Math.max(0, (width - rect.left) - rect.right);
        int A022 = AnonymousClass001.A02(bounds.height() - rect.top, rect.bottom, 0);
        Path path = this.A03;
        path.rewind();
        if (max > A022) {
            int i = A022 / 2;
            float f = (float) i;
            path.moveTo(f, 0.0f);
            path.lineTo((float) (max - i), 0.0f);
            RectF rectF = this.A04;
            float f2 = (float) A022;
            rectF.set((float) (max - A022), 0.0f, (float) max, f2);
            path.arcTo(rectF, -90.0f, 180.0f);
            path.lineTo(f, f2);
            rectF.set(0.0f, 0.0f, f2, f2);
            path.arcTo(rectF, 90.0f, 180.0f);
        } else if (max < A022) {
            int i2 = max / 2;
            float f3 = (float) i2;
            path.moveTo(0.0f, f3);
            path.lineTo(0.0f, (float) (A022 - i2));
            RectF rectF2 = this.A04;
            float f4 = (float) max;
            rectF2.set(0.0f, (float) (A022 - max), f4, (float) A022);
            path.arcTo(rectF2, -180.0f, -180.0f);
            path.lineTo(f4, f3);
            rectF2.set(0.0f, 0.0f, f4, f4);
            path.arcTo(rectF2, 0.0f, -180.0f);
        } else {
            RectF rectF3 = this.A04;
            rectF3.set(0.0f, 0.0f, (float) max, (float) A022);
            path.addOval(rectF3, Path.Direction.CW);
        }
        path.close();
        path.setFillType(Path.FillType.WINDING);
        Paint paint = this.A02;
        C36401kF.A0z(this.A00, paint);
        canvas.translate((float) (bounds.left + rect.left), (float) (bounds.top + rect.top));
        canvas.drawPath(path, paint);
        canvas.translate((float) (-(bounds.left + rect.left)), (float) (-(bounds.top + rect.top)));
    }

    public boolean isStateful() {
        return AnonymousClass000.A1P(super.isStateful() ? 1 : 0);
    }

    public boolean onStateChange(int[] iArr) {
        return false;
    }
}
