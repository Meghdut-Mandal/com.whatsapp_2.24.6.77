package X;

import com.whatsapp.jid.Jid;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.2rC  reason: invalid class name and case insensitive filesystem */
public abstract class C53362rC {
    public static final boolean A00(C24681Dj r2, Set set) {
        AnonymousClass00C.A0D(set, 1);
        if (r2.A05()) {
            return true;
        }
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (AnonymousClass143.A0H((Jid) it.next())) {
                    return true;
                }
            }
        }
        return false;
    }
}
