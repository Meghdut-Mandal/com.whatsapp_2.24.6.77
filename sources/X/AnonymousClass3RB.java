package X;

import com.whatsapp.jid.Jid;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.3RB  reason: invalid class name */
public abstract class AnonymousClass3RB {
    public static final boolean A00(C20500xf r3, Jid jid) {
        AnonymousClass00C.A0D(r3, 0);
        if (jid == null) {
            return false;
        }
        C20810yC r1 = r3.A00;
        if (A02(jid, r1.A09(1035)) || A02(jid, r1.A09(1036))) {
            return true;
        }
        return false;
    }

    public static final boolean A01(C20500xf r1, Jid jid) {
        AnonymousClass00C.A0D(r1, 0);
        if (jid != null) {
            return A02(jid, r1.A00.A09(1035));
        }
        return false;
    }

    public static final boolean A02(Jid jid, String str) {
        Iterable iterable;
        if (str == null || AnonymousClass098.A06(str)) {
            return false;
        }
        List A01 = new C10880fN(",").A01(str, 0);
        if (!A01.isEmpty()) {
            ListIterator listIterator = A01.listIterator(A01.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    if (C36411kG.A0A(listIterator) != 0) {
                        iterable = C36411kG.A14(A01, listIterator);
                        break;
                    }
                } else {
                    break;
                }
            }
            return C007103b.A0f(iterable).contains(jid.user);
        }
        iterable = C023409w.A00;
        return C007103b.A0f(iterable).contains(jid.user);
    }
}
