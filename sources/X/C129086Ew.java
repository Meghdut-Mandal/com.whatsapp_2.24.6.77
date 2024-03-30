package X;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* renamed from: X.6Ew  reason: invalid class name and case insensitive filesystem */
public abstract class C129086Ew {
    public abstract String A00();

    public abstract ArrayList A01(int i, long j);

    public abstract ArrayList A02(C64933Qa r1, int i, long j);

    public abstract void A04(List list, Set set);

    public Set A03() {
        Long l;
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append(A00());
        C36321k7.A1a(A0u, "/resolveOrphanMessages");
        LinkedHashSet A17 = C36441kJ.A17();
        boolean z = true;
        long j = -1;
        do {
            ArrayList A01 = A01(200, j);
            A04(A01, A17);
            if (A01.size() < 200) {
                z = false;
            }
            if (A01.isEmpty() || (l = ((AnonymousClass9XS) C007103b.A0N(A01)).A07) == null) {
                return A17;
            }
            j = l.longValue();
        } while (z);
        return A17;
    }
}
