package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import com.whatsapp.R;

/* renamed from: X.1mI  reason: invalid class name and case insensitive filesystem */
public class C37391mI extends ReplacementSpan {
    public final int A00;
    public final Context A01;

    public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Paint paint2 = paint;
        paint2.setColor(this.A00);
        int i6 = i;
        int i7 = i2;
        canvas.drawText(charSequence, i6, i7, (float) ((int) ((f + ((float) (getSize(paint2, charSequence, i6, i7, (Paint.FontMetricsInt) null) / 2))) - (paint2.measureText(charSequence, i6, i7) / 2.0f))), (float) i4, paint2);
    }

    public C37391mI(Context context, int i) {
        this.A01 = context;
        this.A00 = i;
    }

    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        return Math.round(paint.measureText(charSequence, charSequence.length(), charSequence.length()) + this.A01.getResources().getDimension(R.dimen.f7nameremoved));
    }
}
