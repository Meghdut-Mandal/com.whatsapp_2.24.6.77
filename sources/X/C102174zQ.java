package X;

import java.math.BigDecimal;

/* renamed from: X.4zQ  reason: invalid class name and case insensitive filesystem */
public final class C102174zQ extends C102194zS {
    public final C132386Tk A00;
    public final BigDecimal A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C102174zQ) {
                C102174zQ r5 = (C102174zQ) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public C102174zQ(C132386Tk r1, BigDecimal bigDecimal) {
        this.A01 = bigDecimal;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TooLittleCartPriceFailure(minimumCartPrice=");
        A0u.append(this.A01);
        A0u.append(", currency=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
