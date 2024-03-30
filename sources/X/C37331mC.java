package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.style.ImageSpan;

/* renamed from: X.1mC  reason: invalid class name and case insensitive filesystem */
public final class C37331mC extends ImageSpan {
    public C37331mC(Drawable drawable) {
        super(drawable, 0);
    }

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        C36361kB.A1J(canvas, 0, paint);
        Drawable drawable = getDrawable();
        canvas.save();
        canvas.translate(f, (float) (((i5 - drawable.getBounds().bottom) + ((drawable.getBounds().bottom + paint.getFontMetricsInt().ascent) / 2)) - paint.getFontMetricsInt().descent));
        drawable.draw(canvas);
        canvas.restore();
    }
}
