package X;

import java.util.List;

/* renamed from: X.9yG  reason: invalid class name and case insensitive filesystem */
public class C208449yG implements B25 {
    public final List A00;

    public C196189Yb B4M() {
        List list = this.A00;
        if (((C202689mQ) C36391kE.A0t(list)).A03()) {
            return new AnonymousClass813(list);
        }
        return new C1685280y(list);
    }

    public boolean BNL() {
        List list = this.A00;
        if (list.size() != 1 || !((C202689mQ) list.get(0)).A03()) {
            return false;
        }
        return true;
    }

    public C208449yG(List list) {
        this.A00 = list;
    }

    public List BDO() {
        return this.A00;
    }
}
