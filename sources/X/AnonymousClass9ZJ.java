package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9ZJ  reason: invalid class name */
public final class AnonymousClass9ZJ {
    public static final boolean A00(List list) {
        if (list != null && (!(list instanceof Collection) || !list.isEmpty())) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (C165617ti.A0M(it).A02.A0B != null) {
                    return true;
                }
            }
        }
        return false;
    }
}
