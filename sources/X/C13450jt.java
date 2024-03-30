package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.0jt  reason: invalid class name and case insensitive filesystem */
public abstract class C13450jt<E> extends C001000l<E> implements Set<E>, AnonymousClass00W {
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        AnonymousClass00C.A0D(set, 1);
        if (size() == set.size()) {
            return containsAll(set);
        }
        return false;
    }

    public int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += AnonymousClass000.A0J(it.next());
        }
        return i;
    }
}
