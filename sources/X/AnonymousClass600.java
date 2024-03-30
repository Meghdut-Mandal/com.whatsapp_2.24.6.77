package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.600  reason: invalid class name */
public final class AnonymousClass600 {
    public final ArrayList A00(C134876bk r5, AnonymousClass1UJ r6, List list) {
        C36321k7.A0x(r5, r6);
        ArrayList A0I = AnonymousClass001.A0I();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Object A00 = C131886Rd.A00(new C153387Od((C134876bk) it.next(), r5, r6), 2);
            if (A00 == null) {
                C18740tg.A0D(false, "XFamilyCrosspostRequestManager/Cannot find corresponding messageRowId for given uniqueId");
            } else {
                A0I.add(A00);
            }
        }
        return A0I;
    }
}
