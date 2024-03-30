package X;

import com.whatsapp.jid.PhoneUserJid;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* renamed from: X.9b1  reason: invalid class name and case insensitive filesystem */
public abstract class C197029b1 {
    public static final List A00;
    public static final C15050mc A01;
    public static final C15050mc A02;

    public static final boolean A00(AnonymousClass11F r8) {
        C10910fQ A002;
        if ((r8 instanceof PhoneUserJid) && (A002 = C05690Qr.A00(r8.user)) != null) {
            List<C11010fa> list = A00;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (C11010fa r4 : list) {
                    long j = A002.A00;
                    if (Long.compare(r4.A00 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) <= 0 && Long.compare(j ^ Long.MIN_VALUE, r4.A01 ^ Long.MIN_VALUE) <= 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    static {
        C15050mc r6 = new C15050mc(13135550000L, 13135559999L);
        A01 = r6;
        C15050mc r1 = new C15050mc(13165550000L, 13165550099L);
        A02 = r1;
        C15050mc[] r0 = new C15050mc[2];
        C36331k8.A1N(r6, r1, r0);
        List asList = Arrays.asList(r0);
        AnonymousClass00C.A08(asList);
        A00 = asList;
    }
}
