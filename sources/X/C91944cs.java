package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4cs  reason: invalid class name and case insensitive filesystem */
public class C91944cs extends MetricAffectingSpan {
    public final float A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTextSkewX(this.A00 + textPaint.getTextSkewX());
    }

    public C91944cs(float f) {
        this.A00 = f;
    }
}
