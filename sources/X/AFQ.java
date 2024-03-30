package X;

import java.util.Collection;
import java.util.List;

public final class AFQ implements B4W {
    public static final AGA A01 = new AGA();
    public final List A00;

    public boolean B6r(C194429Pq r4) {
        AnonymousClass00C.A0D(r4, 0);
        List<B4W> list = this.A00;
        if (!(!list.isEmpty())) {
            return false;
        }
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (B4W B6r : list) {
                if (!B6r.B6r(r4)) {
                    return false;
                }
            }
        }
        return true;
    }

    public AFQ(List list) {
        this.A00 = list;
    }
}
