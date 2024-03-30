package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* renamed from: X.4cf  reason: invalid class name and case insensitive filesystem */
public final class C91814cf extends CharacterStyle {
    public final boolean A00;
    public final boolean A01;

    public void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.A01);
        textPaint.setStrikeThruText(this.A00);
    }

    public C91814cf(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
