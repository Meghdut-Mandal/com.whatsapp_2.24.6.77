package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4cv  reason: invalid class name and case insensitive filesystem */
public class C91974cv extends MetricAffectingSpan {
    public final float A00;
    public final float A01;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A01 / (textPaint.getTextSize() / this.A00));
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.A01 / (textPaint.getTextSize() / this.A00));
    }

    public C91974cv(float f, float f2) {
        this.A01 = f;
        this.A00 = f2;
    }
}
