package X;

import android.graphics.Paint;
import android.os.Build;

/* renamed from: X.3RV  reason: invalid class name */
public abstract class AnonymousClass3RV {
    public static final C002000v A00 = new C002000v(50);

    public static Paint.FontMetricsInt A00(Paint paint) {
        int i;
        if (Build.VERSION.SDK_INT > 23 || !Build.MANUFACTURER.equalsIgnoreCase("samsung")) {
            return paint.getFontMetricsInt();
        }
        int floatToIntBits = (((Float.floatToIntBits(paint.getTextSize()) + 31) * 31) + Float.floatToIntBits(paint.getTextSkewX())) * 31;
        float f = 0.0f;
        if (paint.isFakeBoldText()) {
            f = 1.0f;
        }
        int floatToIntBits2 = (floatToIntBits + Float.floatToIntBits(f)) * 31;
        if (paint.getTypeface() != null) {
            i = paint.getTypeface().hashCode();
        } else {
            i = 0;
        }
        C002000v r2 = A00;
        Integer valueOf = Integer.valueOf(floatToIntBits2 + i);
        Paint.FontMetricsInt fontMetricsInt = (Paint.FontMetricsInt) r2.A04(valueOf);
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
        r2.A08(valueOf, fontMetricsInt2);
        return fontMetricsInt2;
    }
}
