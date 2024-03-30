package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import com.whatsapp.R;
import java.util.Locale;

/* renamed from: X.67Q  reason: invalid class name */
public final class AnonymousClass67Q {
    public boolean A00 = true;
    public final TextPaint A01;
    public final TextPaint A02;
    public final String A03;

    public AnonymousClass67Q(Context context, C18820ts r9) {
        TextPaint textPaint = new TextPaint(1);
        this.A02 = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.A01 = textPaint2;
        textPaint.setColor(-1);
        textPaint.setTextSize(40.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTypeface(C33511fU.A02());
        textPaint.setShadowLayer(0.5f, 0.0f, 1.0f, Color.parseColor("#73000000"));
        textPaint2.setColor(0);
        textPaint2.setTextSize(40.0f);
        textPaint2.setTextAlign(Paint.Align.CENTER);
        textPaint2.setTypeface(C33511fU.A02());
        textPaint2.setShadowLayer(7.0f, 0.0f, 0.0f, Color.parseColor("#4D000000"));
        String A0m = C36361kB.A0m(context, R.string.f12nameremoved);
        Locale A0x = C36401kF.A0x(r9);
        AnonymousClass00C.A08(A0x);
        String upperCase = A0m.toUpperCase(A0x);
        AnonymousClass00C.A08(upperCase);
        this.A03 = upperCase;
    }

    public final void A01(Canvas canvas, RectF rectF, float f) {
        if (this.A00) {
            Rect A06 = AnonymousClass001.A06();
            TextPaint textPaint = this.A02;
            String str = this.A03;
            textPaint.getTextBounds(str, 0, str.length(), A06);
            canvas.save();
            float width = rectF.left + (rectF.width() / ((float) 2));
            float height = rectF.top + rectF.height() + ((float) (A06.height() * 2));
            C90474aD.A0v(canvas, rectF, f);
            canvas.drawText(str, width, height, this.A01);
            canvas.drawText(str, width, height, textPaint);
            canvas.restore();
        }
    }

    public final void A00(float f) {
        if (this.A00) {
            TextPaint textPaint = this.A02;
            textPaint.setTextSize(textPaint.getTextSize() * f);
            TextPaint textPaint2 = this.A01;
            textPaint2.setTextSize(textPaint2.getTextSize() * f);
        }
    }
}
