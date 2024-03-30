package X;

import java.util.List;

/* renamed from: X.3HW  reason: invalid class name */
public final class AnonymousClass3HW {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3HW) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass3HW) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass3HW(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkedAccountMedia(posts=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
