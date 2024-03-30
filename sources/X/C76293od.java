package X;

import java.util.List;

/* renamed from: X.3od  reason: invalid class name and case insensitive filesystem */
public final class C76293od implements AnonymousClass0p2 {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C76293od) && AnonymousClass00C.A0J(this.A00, ((C76293od) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C76293od(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(reports=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
