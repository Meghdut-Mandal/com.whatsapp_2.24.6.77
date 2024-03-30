package X;

import java.util.List;

/* renamed from: X.9Vb  reason: invalid class name and case insensitive filesystem */
public final class C195599Vb {
    public final ACU A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C195599Vb) {
                C195599Vb r5 = (C195599Vb) obj;
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

    public C195599Vb(ACU acu, List list) {
        this.A00 = acu;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RequestSection(headingRow=");
        A0u.append(this.A00);
        A0u.append(", requestRows=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
