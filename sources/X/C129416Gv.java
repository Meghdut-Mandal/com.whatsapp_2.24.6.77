package X;

import java.util.Collection;
import java.util.List;

/* renamed from: X.6Gv  reason: invalid class name and case insensitive filesystem */
public abstract class C129416Gv {
    public static final boolean A00(C1277269k r5, C134986bw r6) {
        if (r5 != null) {
            List<AnonymousClass7g1> list = r5.A01;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (AnonymousClass7g1 r2 : list) {
                    if ((r2 instanceof C135136cC) && AnonymousClass00C.A0J(((C135136cC) r2).A02, r6.A01)) {
                        return true;
                    }
                    if ((r2 instanceof C135116cA) && AnonymousClass00C.A0J(((C135116cA) r2).A01, r6.A01)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static final boolean A01(C1277269k r4, C144416s9 r5) {
        if (r4 != null) {
            List<C135126cB> list = r4.A00;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C135126cB r0 : list) {
                    if (AnonymousClass00C.A0J(r0.A03, r5.A0F)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
