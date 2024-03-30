package X;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.HashSet;

/* renamed from: X.6US  reason: invalid class name */
public abstract class AnonymousClass6US {
    public static final HashSet A00 = C90524aI.A0k(Collections.singletonList("GTQ"));

    public static String A00(C18820ts r3, String str, String str2, BigDecimal bigDecimal, int i, boolean z) {
        C132386Tk A0U = C90484aE.A0U(C132386Tk.A02, str);
        StringBuilder A0u = AnonymousClass000.A0u();
        if (!z) {
            str2 = "";
        }
        A0u.append(str2);
        A0u.append(A0U.A02(r3, bigDecimal, i, false));
        return AnonymousClass000.A0p(" ", str, A0u);
    }

    public static String A01(C18820ts r5, String str, String str2, BigDecimal bigDecimal, int i, boolean z) {
        C132386Tk r4 = C132386Tk.A02;
        String A02 = C90484aE.A0U(r4, str).A02(r5, bigDecimal, i, z);
        HashSet hashSet = A00;
        if (!hashSet.contains(str)) {
            return A02;
        }
        String replace = A02.replace(" ", "");
        if (!hashSet.contains(str)) {
            str2 = C90484aE.A0U(r4, str).A01(r5);
        }
        return replace.replace(str, str2);
    }

    public static String A02(C18820ts r5, String str, String str2, BigDecimal bigDecimal, boolean z) {
        C132386Tk r4 = C132386Tk.A02;
        String A03 = C90484aE.A0U(r4, str).A03(r5, bigDecimal, z);
        HashSet hashSet = A00;
        if (!hashSet.contains(str)) {
            return A03;
        }
        String replace = A03.replace(" ", "");
        if (!hashSet.contains(str)) {
            str2 = C90484aE.A0U(r4, str).A01(r5);
        }
        return replace.replace(str, str2);
    }
}
