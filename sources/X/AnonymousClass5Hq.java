package X;

import java.util.List;

/* renamed from: X.5Hq  reason: invalid class name */
public final class AnonymousClass5Hq extends C108675Ul {
    public final List list;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5Hq) && AnonymousClass00C.A0J(this.list, ((AnonymousClass5Hq) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public AnonymousClass5Hq(List list2) {
        this.list = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MultipleErrors(list=");
        return AnonymousClass000.A0m(this.list, A0u);
    }
}
