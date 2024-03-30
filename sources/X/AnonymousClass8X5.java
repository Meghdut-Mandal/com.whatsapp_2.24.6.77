package X;

import java.util.List;

/* renamed from: X.8X5  reason: invalid class name */
public final class AnonymousClass8X5 extends AnonymousClass9EQ {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8X5) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass8X5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8X5(List list) {
        super(list);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Loading(loadingItems=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
