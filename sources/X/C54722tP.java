package X;

import android.text.SpannableString;
import android.text.style.URLSpan;
import android.widget.TextView;

/* renamed from: X.2tP  reason: invalid class name and case insensitive filesystem */
public abstract class C54722tP {
    public static final void A00(TextView textView) {
        AnonymousClass00C.A0D(textView, 0);
        SpannableString A0O = C36441kJ.A0O(textView.getText());
        Object[] spans = A0O.getSpans(0, A0O.length(), URLSpan.class);
        AnonymousClass00C.A08(spans);
        for (URLSpan uRLSpan : (URLSpan[]) spans) {
            A0O.setSpan(new C37411mK(uRLSpan.getURL()), A0O.getSpanStart(uRLSpan), A0O.getSpanEnd(uRLSpan), 0);
        }
        textView.setText(A0O);
    }
}
