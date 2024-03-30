package X;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* renamed from: X.6cO  reason: invalid class name and case insensitive filesystem */
public final class C135246cO implements LineHeightSpan {
    public final float A00;

    public void chooseHeight(CharSequence charSequence, int i, int i2, int i3, int i4, Paint.FontMetricsInt fontMetricsInt) {
        int i5 = fontMetricsInt.descent;
        int i6 = i5 - fontMetricsInt.ascent;
        if (i6 > 0) {
            int A04 = C90514aH.A04(this.A00);
            int ceil = (int) Math.ceil(((double) i5) * ((double) ((((float) A04) * 1.0f) / ((float) i6))));
            fontMetricsInt.descent = ceil;
            fontMetricsInt.ascent = ceil - A04;
        }
    }

    public C135246cO(float f) {
        this.A00 = f;
    }
}
