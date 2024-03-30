package X;

import java.text.Collator;

/* renamed from: X.2rE  reason: invalid class name and case insensitive filesystem */
public abstract class C53382rE {
    public static final boolean A00(C18820ts r5, String str, String str2) {
        Collator A0p = C36361kB.A0p(r5);
        AnonymousClass00C.A08(A0p);
        A0p.setStrength(0);
        int length = str2.length();
        if (length > str.length() || A0p.compare(str2, C36431kI.A16(0, length, str)) != 0) {
            return false;
        }
        return true;
    }
}
