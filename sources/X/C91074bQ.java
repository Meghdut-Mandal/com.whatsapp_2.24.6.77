package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bQ  reason: invalid class name and case insensitive filesystem */
public class C91074bQ extends Drawable {
    public final Paint A00;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C91074bQ() {
        Paint A0E = C36371kC.A0E();
        this.A00 = A0E;
        C36401kF.A0z(285212672, A0E);
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.drawCircle((float) bounds.centerX(), (float) bounds.centerY(), (float) (bounds.width() / 2), this.A00);
    }
}
