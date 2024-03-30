package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.URLSpan;

/* renamed from: X.3Dq  reason: invalid class name and case insensitive filesystem */
public final class C61843Dq {
    public final AnonymousClass17Y A00;
    public final C32691e2 A01;
    public final C21060yb A02;

    public final SpannableStringBuilder A00(Context context, String str, int i) {
        AnonymousClass00C.A0D(str, 1);
        SpannableStringBuilder A0P = C36441kJ.A0P(AnonymousClass14B.A01(context, new Object[]{str}, i));
        URLSpan[] A1a = C36381kD.A1a(A0P, 0);
        if (A1a != null) {
            for (URLSpan uRLSpan : A1a) {
                A0P.setSpan(C429721s.A00(context, uRLSpan, this.A01, this.A00, this.A02), A0P.getSpanStart(uRLSpan), A0P.getSpanEnd(uRLSpan), A0P.getSpanFlags(uRLSpan));
            }
            for (URLSpan removeSpan : A1a) {
                A0P.removeSpan(removeSpan);
            }
        }
        return A0P;
    }

    public C61843Dq(AnonymousClass17Y r1, C32691e2 r2, C21060yb r3) {
        C36321k7.A11(r1, r3, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
