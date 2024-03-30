package X;

import java.util.List;

/* renamed from: X.9Ww  reason: invalid class name and case insensitive filesystem */
public final class C195939Ww {
    public final long A00;
    public final C128826Dt A01;
    public final C193089Ju A02;
    public final String A03;
    public final List A04;

    public C195939Ww(C128826Dt r2, C193089Ju r3, String str, List list, long j) {
        AnonymousClass00C.A0D(list, 2);
        this.A03 = str;
        this.A04 = list;
        this.A00 = j;
        this.A02 = r3;
        this.A01 = r2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195939Ww) {
                C195939Ww r8 = (C195939Ww) obj;
                if (!AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A04, r8.A04) || this.A00 != r8.A00 || !AnonymousClass00C.A0J(this.A02, r8.A02) || !AnonymousClass00C.A0J(this.A01, r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36321k7.A00(this.A00, C36351kA.A05(this.A04, C36421kH.A04(this.A03))) + AnonymousClass000.A0H(this.A02)) * 31) + C36411kG.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Order(id=");
        A0u.append(this.A03);
        A0u.append(", products=");
        A0u.append(this.A04);
        A0u.append(", timestamp=");
        A0u.append(this.A00);
        A0u.append(", price=");
        A0u.append(this.A02);
        A0u.append(", appliedPromotion=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
