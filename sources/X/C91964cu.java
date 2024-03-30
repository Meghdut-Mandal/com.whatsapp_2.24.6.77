package X;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4cu  reason: invalid class name and case insensitive filesystem */
public final class C91964cu extends MetricAffectingSpan {
    public final Typeface A00;

    public void updateDrawState(TextPaint textPaint) {
        AnonymousClass00C.A0D(textPaint, 0);
        textPaint.setTypeface(this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        AnonymousClass00C.A0D(textPaint, 0);
        textPaint.setTypeface(this.A00);
    }

    public C91964cu(Typeface typeface) {
        this.A00 = typeface;
    }
}
