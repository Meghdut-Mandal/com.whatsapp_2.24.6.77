package X;

import java.math.BigDecimal;

/* renamed from: X.9P0  reason: invalid class name */
public class AnonymousClass9P0 {
    public C193089Ju A00(C203399nx r8) {
        String A0e;
        C132386Tk r2;
        if (r8 == null) {
            return null;
        }
        C203399nx A0c = r8.A0c("subtotal");
        C203399nx A0c2 = r8.A0c("total");
        C203399nx A0c3 = r8.A0c("currency");
        C203399nx A0c4 = r8.A0c("price_status");
        if (A0c4 == null) {
            A0e = null;
        } else {
            A0e = A0c4.A0e();
        }
        if (A0c3 == null || AnonymousClass14B.A0F(A0c3.A0e())) {
            r2 = null;
        } else {
            r2 = new C132386Tk(A0c3.A0e());
        }
        BigDecimal A0z = C165607th.A0z(r2, A0c2);
        BigDecimal A0z2 = C165607th.A0z(r2, A0c);
        if (A0e == null || r2 == null || A0z == null || A0z2 == null) {
            return null;
        }
        return new C193089Ju(r2, A0z2, A0z);
    }
}
