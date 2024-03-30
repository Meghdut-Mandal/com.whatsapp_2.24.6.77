package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;

/* renamed from: X.1lJ  reason: invalid class name and case insensitive filesystem */
public class C36791lJ extends Drawable {
    public final float A00;
    public final Paint A01 = C36441kJ.A0K();
    public final int[] A02;

    public int getOpacity() {
        return -1;
    }

    public void setAlpha(int i) {
        this.A01.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A01.setColorFilter(colorFilter);
    }

    public C36791lJ(int[] iArr, float f) {
        this.A02 = iArr;
        this.A00 = f;
    }

    public void draw(Canvas canvas) {
        int A03 = C36421kH.A03(this);
        int height = getBounds().height();
        Paint paint = this.A01;
        paint.setTextSize(((float) A03) * this.A00);
        C36431kI.A1L(paint);
        paint.setAlpha(255);
        paint.setTextAlign(Paint.Align.CENTER);
        int i = A03 / 2;
        int descent = (int) (((float) (height / 2)) - ((paint.descent() + paint.ascent()) / 2.0f));
        int[] iArr = this.A02;
        StringBuilder A0u = AnonymousClass000.A0u();
        for (int appendCodePoint : iArr) {
            A0u.appendCodePoint(appendCodePoint);
        }
        String obj = A0u.toString();
        if (!C06850Vi.A00(paint, obj)) {
            obj = AnonymousClass3PG.A00;
        }
        canvas.drawText(obj, (float) i, (float) descent, paint);
    }
}
