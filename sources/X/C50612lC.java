package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.2lC  reason: invalid class name and case insensitive filesystem */
public class C50612lC extends C50492l0 implements C16380p9 {
    public C50612lC(List list, int i) {
        AnonymousClass6QB A0q = C36441kJ.A0q("accept_pay");
        if (i != 0) {
            C36331k8.A1D(A0q, "service", "UPI");
            if (C203539oF.A0Y(list, 1, 10)) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C592133b.A01(A0q, it);
                }
            }
        } else {
            C36331k8.A1D(A0q, "service", "FBPAY");
            if (C203539oF.A0Y(list, 1, 10)) {
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    C592133b.A01(A0q, it2);
                }
            }
        }
        C592133b.A00(A0q, this);
    }
}
