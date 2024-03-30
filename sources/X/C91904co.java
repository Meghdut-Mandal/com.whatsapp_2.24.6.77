package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4co  reason: invalid class name and case insensitive filesystem */
public class C91904co extends MetricAffectingSpan {
    public final float A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.baselineShift += C90514aH.A04(textPaint.ascent() * this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.baselineShift += C90514aH.A04(textPaint.ascent() * this.A00);
    }

    public C91904co(float f) {
        this.A00 = f;
    }
}
