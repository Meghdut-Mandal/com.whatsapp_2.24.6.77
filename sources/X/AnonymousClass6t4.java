package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6t4  reason: invalid class name */
public final class AnonymousClass6t4 implements AnonymousClass7gT {
    public final AnonymousClass1AP A00;

    public AnonymousClass6t4(AnonymousClass1AP r2) {
        AnonymousClass00C.A0D(r2, 1);
        this.A00 = r2;
    }

    public void Bcw(AnonymousClass591 r8) {
        int i;
        AnonymousClass00C.A0D(r8, 0);
        AnonymousClass1AP r1 = this.A00;
        List A0A = r1.A0A();
        ArrayList A09 = r1.A09((C117885mz) null);
        int i2 = 0;
        ArrayList A08 = r1.A08(0);
        r8.A15 = C36441kJ.A0y(A0A.size());
        if (!(A09 instanceof Collection) || !A09.isEmpty()) {
            Iterator it = A09.iterator();
            i = 0;
            while (it.hasNext()) {
                if (C90514aH.A0g(it).A0P && (i = i + 1) < 0) {
                    throw C36371kC.A0s();
                }
            }
        } else {
            i = 0;
        }
        r8.A14 = C36441kJ.A0y(i);
        r8.A16 = Long.valueOf(((long) A0A.size()) + ((long) A09.size()));
        if (!(A08 instanceof Collection) || !A08.isEmpty()) {
            Iterator it2 = A08.iterator();
            while (it2.hasNext()) {
                AnonymousClass3S2 r0 = C90504aG.A0U(it2).A04;
                if (r0 != null && r0.A0B && (i2 = i2 + 1) < 0) {
                    throw C36371kC.A0s();
                }
            }
        }
        r8.A10 = C36441kJ.A0y(i2);
        r8.A11 = C36441kJ.A0y(A08.size());
    }
}
