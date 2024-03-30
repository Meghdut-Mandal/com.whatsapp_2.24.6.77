package X;

import java.util.regex.Pattern;

/* renamed from: X.3RW  reason: invalid class name */
public abstract class AnonymousClass3RW {
    public static final String A00;

    public static final boolean A00(String str) {
        Pattern pattern = AnonymousClass0S7.A04;
        AnonymousClass00C.A09(pattern);
        if (str == null || str.length() == 0 || !C36361kB.A1Z(str, pattern)) {
            return false;
        }
        return true;
    }

    public static final boolean A01(String str) {
        Pattern compile = Pattern.compile(A00);
        AnonymousClass00C.A08(compile);
        if (str == null || str.length() == 0 || !C36361kB.A1Z(str, compile)) {
            return false;
        }
        return true;
    }

    static {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("^(");
        A0u.append(AnonymousClass0S7.A02.pattern());
        A00 = AnonymousClass000.A0q(")(\\:\\d{1,5})?$", A0u);
    }
}
