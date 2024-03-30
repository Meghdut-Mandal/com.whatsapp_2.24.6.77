package X;

import java.util.List;

/* renamed from: X.69m  reason: invalid class name and case insensitive filesystem */
public final class C1277469m {
    public final Boolean A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1277469m) {
                C1277469m r5 = (C1277469m) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A00);
    }

    public C1277469m(Boolean bool, List list) {
        this.A01 = list;
        this.A00 = bool;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BusinessResult(searchItems=");
        A0u.append(this.A01);
        A0u.append(", isFetchedFromNetwork=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
