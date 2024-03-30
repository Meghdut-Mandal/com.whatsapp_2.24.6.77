package X;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

/* renamed from: X.5aT  reason: invalid class name and case insensitive filesystem */
public abstract class C110315aT {
    public static final List A00(List list) {
        AnonymousClass00C.A0D(list, 0);
        HashSet A16 = C36441kJ.A16();
        HashMap A0J = AnonymousClass001.A0J();
        Map A01 = C000200c.A01(AnonymousClass001.A0J(), C155707Xc.A00);
        for (Object next : list) {
            if (A16.add(next)) {
                C36341k9.A1K(next, A0J, A16.size());
            }
            C36421kH.A1M(next, A01, AnonymousClass000.A0I(C90494aF.A0Y(next, A01)) + 1);
        }
        return C007103b.A0c(C36441kJ.A15(A16), new C163887qv(new AnonymousClass4YZ(A01, 2), A0J, 3));
    }
}
