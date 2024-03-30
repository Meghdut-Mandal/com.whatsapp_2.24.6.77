package X;

import java.util.HashSet;

/* renamed from: X.6TR  reason: invalid class name */
public final class AnonymousClass6TR {
    public static final boolean A01(C20810yC r1) {
        AnonymousClass00C.A0D(r1, 0);
        return r1.A0E(5957);
    }

    public final boolean A02(C20810yC r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (r3.A0E(5256) || r3.A0E(6743)) {
            return true;
        }
        return false;
    }

    public final boolean A03(C20810yC r3) {
        AnonymousClass00C.A0D(r3, 0);
        if (r3.A0E(5257) || r3.A0E(6743)) {
            return true;
        }
        return false;
    }

    public static final HashSet A00(C20810yC r3) {
        String A19 = C36431kI.A19(r3, 6777);
        int length = A19.length();
        HashSet A16 = C36441kJ.A16();
        if (length != 0) {
            for (Object add : AnonymousClass099.A0L(A19, new String[]{":"}, 0)) {
                A16.add(add);
            }
        }
        return A16;
    }
}
