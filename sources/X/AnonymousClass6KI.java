package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.6KI  reason: invalid class name */
public final class AnonymousClass6KI {
    public final C220712t A00;
    public final C220412q A01;
    public final C1261862w A02;

    public static final LinkedHashMap A00(AnonymousClass6KI r7, List list) {
        long A002 = r7.A02.A00();
        ArrayList A0I = AnonymousClass001.A0I();
        for (Object next : list) {
            if (((C65073Qp) next).A03() >= A002) {
                A0I.add(next);
            }
        }
        C10980fX r1 = new C10980fX(new C14520ll(C007103b.A0a(C163907qx.A00(A0I, 15), 50)));
        LinkedHashMap linkedHashMap = new LinkedHashMap(C90484aE.A05(10));
        Iterator it = r1.iterator();
        while (it.hasNext()) {
            C06600Ug r2 = (C06600Ug) it.next();
            C36341k9.A1K(((C65073Qp) r2.A01).A06(), linkedHashMap, r2.A00);
        }
        return linkedHashMap;
    }

    public AnonymousClass6KI(C220712t r1, C220412q r2, C1261862w r3) {
        C36321k7.A0x(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
