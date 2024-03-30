package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: X.4bi  reason: invalid class name and case insensitive filesystem */
public final class C91254bi extends Drawable {
    public final Paint A00;
    public final Drawable A01;

    public void draw(Canvas canvas) {
        AnonymousClass00C.A0D(canvas, 0);
        Rect bounds = getBounds();
        AnonymousClass00C.A08(bounds);
        RectF rectF = new RectF(bounds);
        canvas.drawCircle(rectF.centerX(), rectF.centerX(), Math.min(rectF.width(), rectF.height()) / 2.0f, this.A00);
        this.A01.draw(canvas);
    }

    public int getOpacity() {
        return -3;
    }

    public void setBounds(Rect rect) {
        AnonymousClass00C.A0D(rect, 0);
        super.setBounds(rect);
        A00();
        invalidateSelf();
    }

    public void setAlpha(int i) {
        this.A00.setAlpha(i);
        this.A01.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A00.setColorFilter(colorFilter);
        this.A01.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public C91254bi(Drawable drawable, int i) {
        this.A01 = drawable;
        Paint A0K = C36441kJ.A0K();
        A0K.setColor(i);
        this.A00 = A0K;
    }

    private final void A00() {
        Rect bounds = getBounds();
        AnonymousClass00C.A08(bounds);
        RectF rectF = new RectF(bounds);
        Drawable drawable = this.A01;
        RectF rectF2 = new RectF(rectF.width() * 0.2f, rectF.height() * 0.2f, rectF.width() * 0.8f, rectF.height() * 0.8f);
        Rect A06 = AnonymousClass001.A06();
        rectF2.roundOut(A06);
        drawable.setBounds(A06);
    }

    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        A00();
        invalidateSelf();
    }
}
