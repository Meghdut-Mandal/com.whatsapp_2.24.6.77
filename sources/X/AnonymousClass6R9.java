package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6R9  reason: invalid class name */
public abstract class AnonymousClass6R9 {
    public static final boolean A02(Collection collection) {
        AnonymousClass00C.A0D(collection, 0);
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3XT r1 = C36391kE.A0l(it).A0c.A01;
            if (r1 != null && (r1.A04 || r1.A03)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A01(AnonymousClass3T1 r2) {
        C64933Qa r1 = r2.A1J;
        if (!(r1.A00 instanceof C177528dw) || !r1.A02) {
            return false;
        }
        if ((r2 instanceof AnonymousClass2bV) || (r2 instanceof C181798o3) || (r2 instanceof C46882bp) || (r2 instanceof C181788o2) || (r2 instanceof C46812bi)) {
            return true;
        }
        return false;
    }

    public static final void A00(AnonymousClass17Y r1, C34931hs r2, AnonymousClass005 r3, List list, List list2, int i) {
        C36321k7.A0w(list, list2);
        ((AnonymousClass6VF) r3.get()).A07(list, list2, i);
        C1498172w.A01(r1, r2, list, 46);
    }
}
