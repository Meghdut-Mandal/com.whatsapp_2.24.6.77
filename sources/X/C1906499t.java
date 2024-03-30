package X;

import java.util.Set;

/* renamed from: X.99t  reason: invalid class name and case insensitive filesystem */
public abstract class C1906499t {
    public static Set A00;

    public static boolean A00(String str) {
        Set set = A00;
        if (set == null) {
            set = C36421kH.A0g(new String[]{"payments:settings", "payments:transaction", "payments:account-details", "payments:request", "payments:verify-number", "payments:account-select", "payments:bank-select", "payments:enter-card", "payments:setup-pin"});
            A00 = set;
        }
        return set.contains(str);
    }
}
