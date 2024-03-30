package X;

import com.whatsapp.jid.Jid;
import java.util.Comparator;

/* renamed from: X.1A8  reason: invalid class name */
public final /* synthetic */ class AnonymousClass1A8 implements Comparator {
    public static final /* synthetic */ AnonymousClass1A8 A00 = new AnonymousClass1A8();

    public final int compare(Object obj, Object obj2) {
        AnonymousClass3I6 r7 = (AnonymousClass3I6) obj;
        AnonymousClass3I6 r8 = (AnonymousClass3I6) obj2;
        int i = (r7.A00 > r8.A00 ? 1 : (r7.A00 == r8.A00 ? 0 : -1));
        if (i == 0) {
            return r7.A01.compareTo((Jid) r8.A01);
        }
        if (i < 0) {
            return 1;
        }
        return -1;
    }
}
