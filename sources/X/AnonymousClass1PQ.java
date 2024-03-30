package X;

import com.whatsapp.jid.Jid;
import java.util.Comparator;

/* renamed from: X.1PQ  reason: invalid class name */
public final class AnonymousClass1PQ implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        AnonymousClass3KN r6 = (AnonymousClass3KN) obj;
        AnonymousClass3KN r7 = (AnonymousClass3KN) obj2;
        AnonymousClass00C.A0D(r6, 0);
        AnonymousClass00C.A0D(r7, 1);
        int i = (r6.A00 > r7.A00 ? 1 : (r6.A00 == r7.A00 ? 0 : -1));
        if (i < 0) {
            return -1;
        }
        if (i != 0) {
            return 1;
        }
        int compareTo = r6.A02.compareTo((Jid) r7.A02);
        if (compareTo == 0) {
            return r6.A04.compareTo((Jid) r7.A04);
        }
        return compareTo;
    }
}
