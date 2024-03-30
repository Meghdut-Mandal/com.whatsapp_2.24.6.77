package X;

import java.util.Iterator;

/* renamed from: X.A7q  reason: case insensitive filesystem */
public class C21079A7q implements C22904AyG {
    public boolean B6t(C200269h0 r6, C200269h0 r7, AnonymousClass9LX r8) {
        boolean z;
        AnonymousClass8TD A06 = r7.A06();
        if (r6 instanceof AnonymousClass8TB) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C200269h0 A00 = AnonymousClass8TB.A00(r6);
            if (!(A00 instanceof AnonymousClass8TD)) {
                return true;
            }
            AnonymousClass8TD A062 = A00.A06();
            Iterator it = A06.iterator();
            while (it.hasNext()) {
                if (!A062.A00.contains(it.next())) {
                }
            }
            return true;
        }
        return false;
    }
}
