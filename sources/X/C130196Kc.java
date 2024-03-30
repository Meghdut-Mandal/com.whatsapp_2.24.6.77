package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6Kc  reason: invalid class name and case insensitive filesystem */
public final class C130196Kc {
    public final AnonymousClass17Y A00;
    public final C1272167k A01;
    public final C18820ts A02;
    public final C19770wU A03;

    public static final boolean A00(AnonymousClass7g1 r5, List list) {
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass7g1 r2 = (AnonymousClass7g1) it.next();
                if ((r2 instanceof C135136cC) && (r5 instanceof C135136cC) && AnonymousClass00C.A0J(((C135136cC) r2).A02, ((C135136cC) r5).A02)) {
                    return true;
                }
                if ((r2 instanceof C135116cA) && (r5 instanceof C135116cA) && AnonymousClass00C.A0J(((C135116cA) r2).A01, ((C135116cA) r5).A01)) {
                    return true;
                }
            }
        }
        return false;
    }

    public C130196Kc(AnonymousClass17Y r1, C1272167k r2, C18820ts r3, C19770wU r4) {
        C36321k7.A18(r1, r4, r3, r2);
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = r2;
    }
}
