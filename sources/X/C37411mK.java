package X;

import android.text.TextPaint;
import android.text.style.URLSpan;

/* renamed from: X.1mK  reason: invalid class name and case insensitive filesystem */
public final class C37411mK extends URLSpan {
    public void updateDrawState(TextPaint textPaint) {
        AnonymousClass00C.A0D(textPaint, 0);
        super.updateDrawState(textPaint);
        textPaint.setUnderlineText(false);
    }

    public C37411mK(String str) {
        super(str);
    }
}
