package X;

import java.util.List;

/* renamed from: X.56i  reason: invalid class name and case insensitive filesystem */
public final class C1036656i extends C110775bD {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1036656i) && AnonymousClass00C.A0J(this.A00, ((C1036656i) obj).A00) && Float.compare(4.0f, 4.0f) == 0);
    }

    public int hashCode() {
        return C90514aH.A0C((C36391kE.A0A(this.A00) - 16711936) * 31, 4.0f);
    }

    public C1036656i(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Data(shapes=");
        A0u.append(this.A00);
        A0u.append(", strokeColor=");
        A0u.append(-16711936);
        A0u.append(", strokeWidth=");
        return C90464aC.A0g(A0u, 4.0f);
    }
}
