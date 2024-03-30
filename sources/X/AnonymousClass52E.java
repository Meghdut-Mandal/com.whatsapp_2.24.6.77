package X;

import java.util.List;

/* renamed from: X.52E  reason: invalid class name */
public final class AnonymousClass52E extends AnonymousClass5UX {
    public final List list;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass52E) && AnonymousClass00C.A0J(this.list, ((AnonymousClass52E) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public AnonymousClass52E(List list2) {
        this.list = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MultipleErrors(list=");
        return AnonymousClass000.A0m(this.list, A0u);
    }
}
