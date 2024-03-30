package X;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* renamed from: X.4cp  reason: invalid class name and case insensitive filesystem */
public final class C91914cp extends MetricAffectingSpan {
    public final String A00;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    public void updateMeasureState(TextPaint textPaint) {
        textPaint.setFontFeatureSettings(this.A00);
    }

    public C91914cp(String str) {
        this.A00 = str;
    }
}
