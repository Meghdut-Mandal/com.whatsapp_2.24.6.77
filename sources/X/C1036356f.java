package X;

import java.util.List;

/* renamed from: X.56f  reason: invalid class name and case insensitive filesystem */
public final class C1036356f extends C110765bC {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1036356f) && AnonymousClass00C.A0J(this.A00, ((C1036356f) obj).A00));
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A00) - 65536) * 31) + 4;
    }

    public C1036356f(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Data(shapes=");
        A0u.append(this.A00);
        A0u.append(", strokeColor=");
        A0u.append(-65536);
        A0u.append(", strokeWidth=");
        return C36321k7.A0G(A0u, 4);
    }
}
