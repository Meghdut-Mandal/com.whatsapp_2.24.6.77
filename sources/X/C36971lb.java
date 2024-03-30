package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.InsetDrawable;
import android.text.TextPaint;
import android.text.TextUtils;

/* renamed from: X.1lb  reason: invalid class name and case insensitive filesystem */
public class C36971lb extends InsetDrawable {
    public int A00;
    public int A01;
    public final Rect A02 = AnonymousClass001.A06();
    public final TextPaint A03;
    public final String A04;

    public C36971lb(Context context, String str, int i, int i2) {
        super(AnonymousClass00E.A00(context, i), 0);
        TextPaint textPaint = new TextPaint();
        this.A03 = textPaint;
        this.A04 = str;
        textPaint.setAntiAlias(true);
        C36381kD.A16(context, textPaint, 17170443);
        textPaint.setTextSize((float) i2);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        String str = this.A04;
        if (!TextUtils.isEmpty(str)) {
            if (!(this.A01 == C36421kH.A03(this) && this.A00 == getBounds().height())) {
                this.A01 = C36421kH.A03(this);
                int height = getBounds().height();
                this.A00 = height;
                float f = (float) (height / 2);
                TextPaint textPaint = this.A03;
                textPaint.setTextSize(f);
                int length = str.length();
                Rect rect = this.A02;
                textPaint.getTextBounds(str, 0, length, rect);
                float f2 = f;
                float f3 = f;
                float f4 = 2.0f;
                while (f2 - f4 > 2.0f) {
                    textPaint.setTextSize(f3);
                    textPaint.getTextBounds(str, 0, length, rect);
                    if (rect.width() >= (this.A01 * 8) / 10 || rect.height() >= this.A00 / 2) {
                        f2 = f3;
                    } else {
                        f4 = f3;
                        if (f == f3) {
                            break;
                        }
                    }
                    f3 = (f4 + f2) / 2.0f;
                }
                textPaint.setTextSize(f4);
            }
            canvas.drawText(str, (float) getBounds().centerX(), (float) (getBounds().centerY() + (this.A02.height() / 2) + (this.A00 / 10)), this.A03);
        }
    }
}
