package X;

import com.whatsapp.jid.Jid;
import java.util.Comparator;

/* renamed from: X.3xN  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C81663xN implements Comparator {
    public static final /* synthetic */ C81663xN A00 = new C81663xN();

    public final int compare(Object obj, Object obj2) {
        AnonymousClass3QK r3 = (AnonymousClass3QK) obj;
        AnonymousClass3QK r4 = (AnonymousClass3QK) obj2;
        if (r3 == null) {
            if (r4 == null) {
                return 0;
            }
            return -1;
        } else if (r4 == null) {
            return 1;
        } else {
            return r3.A02.compareTo((Jid) r4.A02);
        }
    }
}
