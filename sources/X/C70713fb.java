package X;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3fb  reason: invalid class name and case insensitive filesystem */
public abstract class C70713fb implements C88784Ua {
    public final C20810yC A00;
    public final C25361Fz A01;

    public C70713fb(C20810yC r1, C25361Fz r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final boolean A00(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass3T1 A0l = C36391kE.A0l(it);
            C25361Fz r1 = this.A01;
            if (!r1.A04(A0l) || (!A0l.A15 && r1.A00(A0l))) {
                return true;
            }
        }
        return false;
    }

    public boolean BBr() {
        return true;
    }
}
