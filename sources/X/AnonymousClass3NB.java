package X;

import android.text.Spannable;

/* renamed from: X.3NB  reason: invalid class name */
public class AnonymousClass3NB {
    public final CharSequence A00;

    public AnonymousClass3NB(CharSequence charSequence) {
        this.A00 = charSequence;
    }

    public static void A00(Spannable spannable, Spannable spannable2) {
        AnonymousClass3NB[] r3 = (AnonymousClass3NB[]) spannable.getSpans(0, spannable.length(), AnonymousClass3NB.class);
        if (r3 != null) {
            for (AnonymousClass3NB removeSpan : r3) {
                spannable.removeSpan(removeSpan);
            }
        }
        spannable.setSpan(new AnonymousClass3NB(spannable2), 0, spannable.length(), -16777216);
    }
}
