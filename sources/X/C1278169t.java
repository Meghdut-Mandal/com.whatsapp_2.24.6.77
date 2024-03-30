package X;

import java.util.List;

/* renamed from: X.69t  reason: invalid class name and case insensitive filesystem */
public final class C1278169t {
    public final List A00;
    public final C1274868m A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1278169t) {
                C1278169t r5 = (C1278169t) obj;
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

    public C1278169t(C1274868m r1, List list) {
        this.A00 = list;
        this.A01 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("AREffectsConnection(nodes=");
        A0u.append(this.A00);
        A0u.append(", pageInfo=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
