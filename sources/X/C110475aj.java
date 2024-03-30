package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.5aj  reason: invalid class name and case insensitive filesystem */
public abstract class C110475aj {
    public static final String A00(C131576Pp r7, AnonymousClass1L4 r8) {
        String str;
        Long l = r7.A02;
        if (l == null || l.longValue() == 0) {
            StringBuilder A0u = AnonymousClass000.A0u();
            String str2 = r7.A03;
            Map A16 = C90514aH.A16(r8.A01);
            LinkedHashMap A1G = C36431kI.A1G();
            Iterator A0y = AnonymousClass000.A0y(A16);
            while (A0y.hasNext()) {
                Map.Entry A11 = AnonymousClass000.A11(A0y);
                if (AnonymousClass00C.A0J(((C122455us) A11.getValue()).A01, str2)) {
                    C36411kG.A1T(A1G, A11);
                }
            }
            A0u.append((String) C007103b.A0H(A1G.keySet()));
            A0u.append(':');
            return AnonymousClass000.A0q(r7.A06, A0u);
        }
        StringBuilder A112 = C36381kD.A11(l);
        A112.append(':');
        A112.append(r7.A06);
        String str3 = r7.A07;
        if (str3 == null || (str = C90464aC.A0f(str3, AnonymousClass000.A0u(), ':')) == null) {
            str = "";
        }
        return AnonymousClass000.A0q(str, A112);
    }
}
