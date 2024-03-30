package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.BulletSpan;

/* renamed from: X.4cb  reason: invalid class name and case insensitive filesystem */
public class C91774cb extends BulletSpan {
    public static Path A01;
    public final int A00;

    public void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        if (((Spanned) charSequence).getSpanStart(this) == i6) {
            Paint.Style style = paint.getStyle();
            C36431kI.A1L(paint);
            if (canvas.isHardwareAccelerated()) {
                if (A01 == null) {
                    Path A0M = C36441kJ.A0M();
                    A01 = A0M;
                    A0M.addCircle(0.0f, 0.0f, 7.2000003f, Path.Direction.CW);
                }
                canvas.save();
                canvas.translate((float) (i + (i2 * 6) + 6), ((float) (i3 + i5)) / 2.0f);
                canvas.drawPath(A01, paint);
                canvas.restore();
            } else {
                canvas.drawCircle((float) (i + (i2 * 6) + 6), ((float) (i3 + i5)) / 2.0f, 6.0f, paint);
            }
            paint.setStyle(style);
        }
    }

    public int getLeadingMargin(boolean z) {
        return this.A00 + 12;
    }

    public C91774cb(int i) {
        super(i);
        this.A00 = i;
    }
}
