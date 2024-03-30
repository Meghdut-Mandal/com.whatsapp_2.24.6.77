package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2tR  reason: invalid class name and case insensitive filesystem */
public abstract class C54742tR {
    public static final double A00(List list) {
        AnonymousClass00C.A0D(list, 0);
        Iterator it = list.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += (long) C36341k9.A0A(it);
        }
        return ((double) j) / ((double) list.size());
    }
}
