package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bR  reason: invalid class name and case insensitive filesystem */
public class C91084bR extends Drawable {
    public final C129196Ft A00;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
    }

    public void setColorFilter(ColorFilter colorFilter) {
    }

    public C91084bR(C129196Ft r1) {
        this.A00 = r1;
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        C129196Ft r3 = this.A00;
        float A08 = r3.A08() / 2.0f;
        r3.A0J(C36441kJ.A0N(), ((float) bounds.left) + A08, ((float) bounds.top) + A08, ((float) bounds.right) - A08, ((float) bounds.bottom) - A08);
        r3.A0I(canvas);
    }
}
