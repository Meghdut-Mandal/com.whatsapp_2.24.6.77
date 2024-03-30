package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;

/* renamed from: X.1lN  reason: invalid class name and case insensitive filesystem */
public class C36831lN extends Drawable {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Paint A03;
    public final Paint A04;
    public final Rect A05;
    public final String A06;

    public int getOpacity() {
        return -3;
    }

    public void setAlpha(int i) {
        this.A04.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.A04.setColorFilter(colorFilter);
    }

    public C36831lN(Typeface typeface, String str, int i, int i2, int i3, int i4, int i5) {
        this.A06 = str;
        this.A01 = i4;
        TextPaint textPaint = new TextPaint();
        this.A04 = textPaint;
        textPaint.setColor(i2);
        Paint A0K = C36441kJ.A0K();
        this.A03 = A0K;
        Paint.Style style = Paint.Style.FILL;
        A0K.setStyle(style);
        A0K.setColor(i);
        A0K.setAntiAlias(true);
        textPaint.setTextSize((float) i3);
        textPaint.setStyle(style);
        textPaint.setColor(i2);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setAntiAlias(true);
        if (typeface != null) {
            textPaint.setTypeface(typeface);
        }
        Rect A062 = AnonymousClass001.A06();
        this.A05 = A062;
        textPaint.getTextBounds(str, 0, str.length(), A062);
        int i6 = i4 * 2;
        this.A00 = A062.width() + i6 + (i5 * 2);
        this.A02 = A062.height() + i6;
    }

    public void draw(Canvas canvas) {
        int A032 = C36421kH.A03(this);
        Rect rect = this.A05;
        int height = (getBounds().height() / 2) + (rect.height() / 2);
        float f = (float) (A032 / 2);
        float width = f - (((float) rect.width()) / 2.0f);
        int i = this.A01;
        float f2 = (float) i;
        RectF rectF = new RectF(width - f2, (float) ((height - rect.height()) - i), width + ((float) rect.width()) + f2, (float) (i + height));
        float height2 = ((float) (rect.height() + (i * 2))) / 2.0f;
        canvas.drawRoundRect(rectF, height2, height2, this.A03);
        String str = this.A06;
        canvas.drawText(str, 0, str.length(), f, (float) height, this.A04);
    }

    public int getIntrinsicHeight() {
        return this.A02;
    }

    public int getIntrinsicWidth() {
        return this.A00;
    }
}
