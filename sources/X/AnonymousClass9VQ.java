package X;

import java.util.List;

/* renamed from: X.9VQ  reason: invalid class name */
public final class AnonymousClass9VQ {
    public final List A00;
    public final C193089Ju A01;

    public AnonymousClass9VQ(C193089Ju r2, List list) {
        AnonymousClass00C.A0D(list, 2);
        this.A01 = r2;
        this.A00 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VQ) {
                AnonymousClass9VQ r5 = (AnonymousClass9VQ) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, AnonymousClass000.A0H(this.A01) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CartInfo(price=");
        A0u.append(this.A01);
        A0u.append(", products=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
