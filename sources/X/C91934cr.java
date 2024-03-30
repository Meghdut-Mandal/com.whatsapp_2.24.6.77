package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4cr  reason: invalid class name and case insensitive filesystem */
public final class C91934cr extends MetricAffectingSpan {
    public final float A00;

    public C91934cr(float f) {
        this.A00 = f;
    }

    public void updateDrawState(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.A00 / textSize);
        }
    }

    public void updateMeasureState(TextPaint textPaint) {
        float textSize = textPaint.getTextSize() * textPaint.getTextScaleX();
        if (textSize != 0.0f) {
            textPaint.setLetterSpacing(this.A00 / textSize);
        }
    }
}
