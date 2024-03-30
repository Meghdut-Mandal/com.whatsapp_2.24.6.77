package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3fa  reason: invalid class name and case insensitive filesystem */
public abstract class C70703fa implements C88784Ua {
    public boolean BtJ(Collection collection) {
        C65013Qj r1;
        AnonymousClass00C.A0D(collection, 0);
        if (collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return true;
        }
        AnonymousClass3T1 A0l = C36391kE.A0l(it);
        if (!(A0l instanceof AnonymousClass2bU) || ((r1 = ((AnonymousClass2bU) A0l).A01) != null && r1.A0U && !r1.A0f && r1.A0V)) {
            return !C66013Ui.A0n(A0l);
        }
        return false;
    }

    public boolean BBr() {
        return true;
    }
}
