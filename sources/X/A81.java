package X;

import java.util.Iterator;

public class A81 implements C22904AyG {
    public boolean B6t(C200269h0 r7, C200269h0 r8, AnonymousClass9LX r9) {
        boolean z;
        if (r8 instanceof AnonymousClass8TB) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            r8 = AnonymousClass8TB.A00(r8);
            if (r8 instanceof AnonymousClass8T4) {
                return false;
            }
        }
        AnonymousClass8TD A06 = r8.A06();
        if (r7 instanceof AnonymousClass8TB) {
            r7 = AnonymousClass8TB.A00(r7);
            if (r7 instanceof AnonymousClass8T4) {
                return false;
            }
        }
        Iterator it = r7.A06().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Iterator it2 = A06.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (next.equals(it2.next())) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
