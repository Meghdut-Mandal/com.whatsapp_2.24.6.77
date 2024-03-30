package X;

import android.text.Spannable;
import android.text.style.URLSpan;
import android.util.Pair;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.97c  reason: invalid class name and case insensitive filesystem */
public abstract class C1901597c {
    public static void A00(Spannable spannable, AnonymousClass1EV r6, AnonymousClass1EU r7) {
        Pattern BFb;
        if (r6.A03() && (BFb = r7.A05().BFb()) != null) {
            Matcher matcher = BFb.matcher(spannable);
            while (matcher.find()) {
                Pair A00 = C200739i8.A00(C36341k9.A0I(Integer.valueOf(matcher.start()), matcher.end()), C200739i8.A01, spannable);
                int A04 = C36381kD.A04(A00);
                int A03 = C36381kD.A03(A00);
                spannable.setSpan(new URLSpan(C165607th.A0t(spannable, A04, A03)), A04, A03, 0);
            }
        }
    }
}
