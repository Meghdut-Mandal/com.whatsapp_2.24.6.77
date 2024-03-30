package X;

import java.util.List;

/* renamed from: X.5IK  reason: invalid class name */
public final class AnonymousClass5IK extends AnonymousClass61F {
    public final C111375cB A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass5IK) {
                AnonymousClass5IK r5 = (AnonymousClass5IK) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5IK(C111375cB r1, List list) {
        super(r1);
        C36321k7.A0x(r1, list);
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(searchType=");
        A0u.append(this.A00);
        A0u.append(", stickers=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
