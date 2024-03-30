package X;

import java.math.BigDecimal;

/* renamed from: X.8VO  reason: invalid class name */
public final class AnonymousClass8VO extends AnonymousClass9EB {
    public final C128826Dt A00;
    public final C132386Tk A01;
    public final BigDecimal A02;

    public AnonymousClass8VO(C128826Dt r2, C132386Tk r3, BigDecimal bigDecimal) {
        super(2);
        this.A00 = r2;
        this.A02 = bigDecimal;
        this.A01 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass8VO) {
                AnonymousClass8VO r5 = (AnonymousClass8VO) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((AnonymousClass000.A0H(this.A00) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PromotionDisplayItem(promotion=");
        A0u.append(this.A00);
        A0u.append(", actualDiscount=");
        A0u.append(this.A02);
        A0u.append(", currency=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
