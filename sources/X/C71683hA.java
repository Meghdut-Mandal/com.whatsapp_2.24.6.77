package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.3hA  reason: invalid class name and case insensitive filesystem */
public final class C71683hA implements AnonymousClass7gT {
    public final C220412q A00;
    public final C235518x A01;
    public final C20810yC A02;

    public void Bcw(AnonymousClass591 r9) {
        boolean z;
        int i;
        AnonymousClass00C.A0D(r9, 0);
        C235518x r5 = this.A01;
        r9.A0w = C36441kJ.A0y(C36431kI.A05(r5));
        if (this.A02.A0E(7402)) {
            Collection A0F = this.A00.A0F();
            ArrayList<C65073Qp> A13 = C36411kG.A13(A0F);
            Iterator it = A0F.iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((C65073Qp) next).A0b.expiration > 0) {
                    A13.add(next);
                }
            }
            long size = (long) A13.size();
            if (!(A13 instanceof Collection) || !A13.isEmpty()) {
                i = 0;
                for (C65073Qp r0 : A13) {
                    C62943Id r02 = r0.A0a;
                    if (r02 != null && C36371kC.A1X(r02.A01, true) && (i = i + 1) < 0) {
                        throw C36371kC.A0s();
                    }
                }
            } else {
                i = 0;
            }
            long j = (long) i;
            r9.A0M = Boolean.valueOf(r5.A06());
            if (j <= 0) {
                z = false;
            }
            r9.A0N = Boolean.valueOf(z);
            r9.A0u = Long.valueOf(size);
            r9.A0v = Long.valueOf(j);
        }
    }

    public C71683hA(C220412q r1, C235518x r2, C20810yC r3) {
        C36321k7.A11(r3, r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
