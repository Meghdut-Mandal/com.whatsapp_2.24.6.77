package X;

import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.66M  reason: invalid class name */
public final class AnonymousClass66M {
    public final AnonymousClass6VF A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new AnonymousClass7LB(this));

    public AnonymousClass66M(AnonymousClass6VF r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(String str) {
        AnonymousClass00C.A0D(str, 0);
        ((AbstractMap) this.A01.getValue()).remove(str);
    }

    public final void A01(String str, List list, List list2) {
        AnonymousClass00C.A0D(list, 1);
        C90494aF.A1G(str, new AnonymousClass6A9(new LinkedHashSet(list), C90524aI.A0k(list2)), this.A01);
    }
}
