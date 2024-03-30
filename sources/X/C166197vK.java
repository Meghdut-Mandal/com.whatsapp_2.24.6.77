package X;

import android.text.TextPaint;
import android.text.style.CharacterStyle;
import java.util.Set;

/* renamed from: X.7vK  reason: invalid class name and case insensitive filesystem */
public final class C166197vK extends CharacterStyle {
    public final String A00;
    public final Set A01;

    public void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            textPaint.setColor(textPaint.linkColor);
            textPaint.setUnderlineText(true);
        }
    }

    public C166197vK(String str, Set set) {
        C36321k7.A0x(str, set);
        this.A00 = str;
        this.A01 = set;
    }
}
