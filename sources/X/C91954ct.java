package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4ct  reason: invalid class name and case insensitive filesystem */
public final class C91954ct extends MetricAffectingSpan {
    public final Typeface A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setTypeface(this.A00);
    }

    public C91954ct(Typeface typeface) {
        this.A00 = typeface;
    }
}
