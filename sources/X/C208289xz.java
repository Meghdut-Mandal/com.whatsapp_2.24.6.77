package X;

import java.util.List;

/* renamed from: X.9xz  reason: invalid class name and case insensitive filesystem */
public class C208289xz implements B0T, C22853Ax3 {
    public final C196189Yb A00;
    public final C196189Yb A01;
    public final C196189Yb A02;
    public final Integer A03;
    public final List A04 = AnonymousClass001.A0I();
    public final boolean A05;

    public void BkC() {
        int i = 0;
        while (true) {
            List list = this.A04;
            if (i < list.size()) {
                ((C22853Ax3) list.get(i)).BkC();
                i++;
            } else {
                return;
            }
        }
    }

    public void Bqe(List list, List list2) {
    }

    public C208289xz(C208579yU r4, C208409yC r5) {
        this.A05 = r4.A04;
        this.A03 = r4.A03;
        AnonymousClass812 A002 = C1684680s.A00(r4.A02);
        this.A02 = A002;
        AnonymousClass812 A003 = C1684680s.A00(r4.A00);
        this.A00 = A003;
        AnonymousClass812 A004 = C1684680s.A00(r4.A01);
        this.A01 = A004;
        r5.A0C(A002);
        r5.A0C(A003);
        r5.A0C(A004);
        A002.A09(this);
        A003.A09(this);
        A004.A09(this);
    }

    public String getName() {
        throw null;
    }
}
