package X;

import java.util.Collection;
import java.util.List;

public final class AFS implements B4W {
    public static final AGC A01 = new AGC();
    public final List A00;

    public boolean B6r(C194429Pq r4) {
        AnonymousClass00C.A0D(r4, 0);
        List<B4W> list = this.A00;
        if (!(!list.isEmpty())) {
            return false;
        }
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (B4W B6r : list) {
            if (B6r.B6r(r4)) {
                return true;
            }
        }
        return false;
    }

    public AFS(List list) {
        this.A00 = list;
    }
}
