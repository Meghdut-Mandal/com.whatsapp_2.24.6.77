package X;

import java.util.Locale;

/* renamed from: X.6Mb  reason: invalid class name and case insensitive filesystem */
public class C130696Mb {
    public final C202059ky A00;
    public final Integer A01;

    public String toString() {
        String str;
        int intValue;
        C202059ky r0 = this.A00;
        if (r0 != null) {
            str = "NETWORK";
            intValue = r0.A00;
        } else {
            str = "CLIENT";
            Integer num = this.A01;
            C18740tg.A06(num);
            intValue = num.intValue();
        }
        Locale locale = Locale.US;
        Object[] A1a = C90474aD.A1a(str);
        AnonymousClass000.A1L(A1a, intValue, 1);
        return String.format(locale, "[type=%s, code=%d]", A1a);
    }

    public C130696Mb(int i) {
        this.A00 = null;
        this.A01 = Integer.valueOf(i);
    }

    public C130696Mb(C202059ky r2) {
        this.A00 = r2;
        this.A01 = null;
    }
}
