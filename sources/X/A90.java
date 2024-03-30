package X;

import java.util.Arrays;
import java.util.List;

public final class A90 implements C22912AyO {
    public C206459tR A00;
    public final List A01;

    public A90(List list) {
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        for (Object A1M : this.A01) {
            C165567td.A1M(A1M, System.getProperty("line.separator"), A0u);
        }
        return C90504aG.A0m("GetCategoriesResponse{categoryResponses=%s}", Arrays.copyOf(C36431kI.A1Z(A0u, 1), 1));
    }

    public void Bqv(C206459tR r1) {
        this.A00 = r1;
    }
}
