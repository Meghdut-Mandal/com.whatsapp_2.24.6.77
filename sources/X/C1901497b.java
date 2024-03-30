package X;

import android.text.Spannable;
import android.text.style.URLSpan;
import android.util.Pair;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.97b  reason: invalid class name and case insensitive filesystem */
public abstract class C1901497b {
    public static void A00(Spannable spannable, AnonymousClass1EV r6, AnonymousClass1EU r7) {
        Pattern BFY;
        if (r6.A03() && (BFY = r7.A05().BFY()) != null) {
            Matcher matcher = BFY.matcher(spannable);
            while (matcher.find()) {
                Pair A00 = C200739i8.A00(C36341k9.A0I(Integer.valueOf(matcher.start()), matcher.end()), C200739i8.A01, spannable);
                int A04 = C36381kD.A04(A00);
                int A03 = C36381kD.A03(A00);
                StringBuilder A0u = AnonymousClass000.A0u();
                A0u.append("wapay://pay/");
                spannable.setSpan(new URLSpan(AnonymousClass000.A0o(spannable.subSequence(A04, A03), A0u)), A04, A03, 0);
            }
        }
    }
}
