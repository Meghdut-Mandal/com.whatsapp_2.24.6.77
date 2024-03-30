package X;

import java.util.List;

/* renamed from: X.5Hi  reason: invalid class name */
public final class AnonymousClass5Hi extends C108665Uk {
    public final List list;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass5Hi) && AnonymousClass00C.A0J(this.list, ((AnonymousClass5Hi) obj).list));
    }

    public int hashCode() {
        return this.list.hashCode();
    }

    public AnonymousClass5Hi(List list2) {
        this.list = list2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("MultipleErrors(list=");
        return AnonymousClass000.A0m(this.list, A0u);
    }
}
