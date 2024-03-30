package X;

import java.util.List;

/* renamed from: X.9yH  reason: invalid class name and case insensitive filesystem */
public abstract class C208459yH implements B25 {
    public final List A00;

    public boolean BNL() {
        List list = this.A00;
        if (list.isEmpty() || (list.size() == 1 && ((C202689mQ) list.get(0)).A03())) {
            return true;
        }
        return false;
    }

    public C208459yH(List list) {
        this.A00 = list;
    }

    public List BDO() {
        return this.A00;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        List list = this.A00;
        if (!list.isEmpty()) {
            A0u.append("values=");
            C90514aH.A1T(A0u, list.toArray());
        }
        return A0u.toString();
    }
}
