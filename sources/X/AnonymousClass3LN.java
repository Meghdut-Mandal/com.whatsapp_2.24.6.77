package X;

import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.TextAppearanceSpan;
import android.text.style.URLSpan;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3LN  reason: invalid class name */
public abstract class AnonymousClass3LN {
    public static SpannableStringBuilder A00(TextAppearanceSpan textAppearanceSpan, String str, Map map, int i, boolean z) {
        Object r0;
        Spanned fromHtml = Html.fromHtml(str);
        SpannableStringBuilder A0P = C36441kJ.A0P(fromHtml);
        URLSpan[] A1b = C36381kD.A1b(fromHtml);
        if (A1b != null) {
            for (URLSpan uRLSpan : A1b) {
                if (map.containsKey(uRLSpan.getURL())) {
                    int spanStart = A0P.getSpanStart(uRLSpan);
                    int spanEnd = A0P.getSpanEnd(uRLSpan);
                    int spanFlags = A0P.getSpanFlags(uRLSpan);
                    A0P.removeSpan(uRLSpan);
                    if (z) {
                        r0 = new C37241m3(uRLSpan, map, i);
                    } else {
                        r0 = new AnonymousClass21r(uRLSpan, map, i);
                    }
                    A0P.setSpan(r0, spanStart, spanEnd, spanFlags);
                    if (textAppearanceSpan != null) {
                        A0P.setSpan(textAppearanceSpan, spanStart, spanEnd, spanFlags);
                    }
                }
            }
        }
        return A0P;
    }

    public static SpannableStringBuilder A01(Runnable runnable, String str, String str2) {
        HashMap A0J = AnonymousClass001.A0J();
        A0J.put(str2, runnable);
        return A00((TextAppearanceSpan) null, str, A0J, 0, false);
    }
}
