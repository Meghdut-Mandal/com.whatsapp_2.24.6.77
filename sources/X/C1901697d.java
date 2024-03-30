package X;

import android.text.Spannable;
import android.text.style.URLSpan;
import android.util.Pair;

/* renamed from: X.97d  reason: invalid class name and case insensitive filesystem */
public abstract class C1901697d {
    public static void A00(Spannable spannable, String str) {
        C203559oI A00 = C203559oI.A00();
        AYC ayc = new AYC(C187568y7.A01, A00, spannable, A00.A0I(Integer.parseInt(str)));
        while (ayc.hasNext()) {
            AnonymousClass9W4 r0 = (AnonymousClass9W4) ayc.next();
            int i = r0.A00;
            Pair A0I = C36341k9.A0I(Integer.valueOf(i), i + r0.A01.length());
            if (!C200739i8.A01(A0I, spannable)) {
                A0I = C200739i8.A00(A0I, C200739i8.A02, spannable);
                if (!C200739i8.A01(A0I, spannable)) {
                }
            }
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("tel:");
            spannable.setSpan(new URLSpan(AnonymousClass000.A0o(spannable.subSequence(C36381kD.A04(A0I), C36381kD.A03(A0I)), A0u)), C36381kD.A04(A0I), C36381kD.A03(A0I), 33);
        }
    }
}
