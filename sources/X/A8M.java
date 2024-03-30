package X;

import java.util.Map;

public final class A8M implements C22907AyJ {
    public AnonymousClass8TN A00;
    public final C199959gK A01;

    public boolean BPS(Object obj) {
        C194879Rp r1 = this.A01.A01;
        C23091B4b b4b = r1.A00;
        if (!(obj instanceof Map)) {
            return false;
        }
        AnonymousClass8TN r3 = this.A00;
        if (!r3.A08() || (r3.A01 == null && r1.A03.contains(C188068yz.DEFAULT_PATH_LEAF_TO_NULL))) {
            return true;
        }
        return b4b.BGJ(obj).containsAll(r3.A01);
    }

    public A8M(C199959gK r1, C196179Ya r2) {
        this.A01 = r1;
        this.A00 = (AnonymousClass8TN) r2;
    }
}
