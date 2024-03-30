package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.1lH  reason: invalid class name and case insensitive filesystem */
public final class C36771lH extends Drawable {
    public final Paint A00;

    public void draw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        canvas.drawRect(getBounds(), this.A00);
    }

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C36771lH(int i) {
        Paint A0E = C36371kC.A0E();
        this.A00 = A0E;
        if (A0E.getColor() != i) {
            A0E.setColor(i);
            invalidateSelf();
        }
    }
}
