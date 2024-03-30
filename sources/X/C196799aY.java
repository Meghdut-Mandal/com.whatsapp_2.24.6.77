package X;

import java.util.Set;

/* renamed from: X.9aY  reason: invalid class name and case insensitive filesystem */
public abstract class C196799aY {
    public static final Set A00;

    static {
        Integer[] numArr = new Integer[5];
        AnonymousClass000.A1J(numArr, 401);
        AnonymousClass000.A1K(numArr, 406);
        C36331k8.A1V(numArr, 407);
        C36341k9.A1T(numArr, 403);
        C36341k9.A1U(numArr, 412);
        A00 = AnonymousClass02N.A03(numArr);
    }

    public static final boolean A00(AnonymousClass3T1 r5) {
        C202319lY r0;
        C175708av r02;
        C202319lY r1 = r5.A0M;
        if (r1 != null && r5.A1J.A02) {
            Integer valueOf = Integer.valueOf(r1.A02);
            if (C007103b.A0j(A00, valueOf) || !(valueOf == null || valueOf.intValue() != 408 || (r0 = r5.A0M) == null || (r02 = r0.A0A) == null || r02.A08() != 403)) {
                return true;
            }
        }
        return false;
    }
}
