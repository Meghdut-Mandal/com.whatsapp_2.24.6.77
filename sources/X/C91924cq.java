package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4cq  reason: invalid class name and case insensitive filesystem */
public final class C91924cq extends MetricAffectingSpan {
    public final float A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A00);
    }

    public C91924cq(float f) {
        this.A00 = f;
    }
}
