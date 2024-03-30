package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.3CS  reason: invalid class name */
public final class AnonymousClass3CS {
    public final C20310xM A00;

    public AnonymousClass3CS(C20310xM r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public final void A00(AnonymousClass3T1 r12, String str, String str2) {
        C23043B1o b1o;
        C207219uk BA8;
        if (r12 != null) {
            C207089uX r5 = null;
            if (!(!(r12 instanceof C23043B1o) || (b1o = (C23043B1o) r12) == null || (BA8 = b1o.BA8()) == null)) {
                C207089uX r4 = BA8.A04;
                if (r4 != null) {
                    List list = r4.A03;
                    AnonymousClass00C.A0D(list, 0);
                    ArrayList A15 = C36441kJ.A15(list);
                    Iterator it = A15.iterator();
                    int i = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            throw C36351kA.A0v();
                        }
                        C206969uL r1 = ((C206569tc) next).A01;
                        if (AnonymousClass00C.A0J(r1.A00, str)) {
                            A15.set(i, new C206569tc(new C206969uL(str2, r1.A01), false));
                        }
                        i = i2;
                    }
                    r5 = new C207089uX((C206499tV) null, r4.A02, A15, (List) null, 0);
                }
                BA8.A04 = r5;
            }
            this.A00.A0k(r12);
        }
    }
}
