package X;

import java.util.Iterator;

/* renamed from: X.5Fd  reason: invalid class name and case insensitive filesystem */
public final class C105555Fd extends C19590wC {
    public final void A00(AnonymousClass5VM r8, Integer num, Integer num2, boolean z) {
        String str;
        Class<?> cls;
        Iterator A0s = C36361kB.A0s(this);
        while (A0s.hasNext()) {
            C118125nN r0 = (C118125nN) A0s.next();
            if (r0 != null) {
                C124325xy r2 = r0.A00;
                if (z) {
                    AnonymousClass1UZ r1 = r2.A05;
                    r1.A02(C36371kC.A0m(), "is_account_linked");
                    r1.A04("SEE_LINKING_SUCCESS");
                    r1.A01();
                    C159817jy r02 = r2.A00;
                    if (r02 != null) {
                        r02.onSuccess();
                    }
                } else {
                    AnonymousClass1UZ r4 = r2.A05;
                    r4.A02(C36381kD.A0j(), "is_account_linked");
                    StringBuilder A0u = AnonymousClass000.A0u();
                    A0u.append("Error code: ");
                    A0u.append(num);
                    A0u.append(", error subcode: ");
                    A0u.append(num2);
                    A0u.append(", exception: ");
                    if (r8 == null || (cls = r8.getClass()) == null) {
                        str = null;
                    } else {
                        str = cls.getCanonicalName();
                    }
                    r4.A05("SEE_LINKING_ERROR", AnonymousClass000.A0q(str, A0u));
                    C159817jy r03 = r2.A00;
                    if (r03 != null) {
                        r03.BXT(r8, num, num2);
                    }
                }
                r2.A00 = null;
            }
        }
    }
}
