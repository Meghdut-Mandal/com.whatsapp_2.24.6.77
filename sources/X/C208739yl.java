package X;

import java.util.List;

/* renamed from: X.9yl  reason: invalid class name and case insensitive filesystem */
public class C208739yl implements C22856Ax7 {
    public List A00;

    public boolean BPR(C1890892a r3, AnonymousClass825 r4) {
        for (AnonymousClass9QC A03 : this.A00) {
            if (C203389nt.A03(r3, A03, r4)) {
                return false;
            }
        }
        return true;
    }

    public C208739yl(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("not(");
        A0u.append(this.A00);
        return C90474aD.A0f(A0u);
    }
}
