package X;

import java.util.List;

/* renamed from: X.4pq  reason: invalid class name and case insensitive filesystem */
public final class C97534pq extends C109505Xv {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C97534pq) && AnonymousClass00C.A0J(this.A00, ((C97534pq) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C97534pq(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Success(aiOutputs=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
