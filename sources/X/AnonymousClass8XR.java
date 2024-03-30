package X;

import java.util.List;

/* renamed from: X.8XR  reason: invalid class name */
public final class AnonymousClass8XR extends AnonymousClass9ET {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8XR) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass8XR) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8XR(List list) {
        super(list);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SuccessContinueSearch(successItems=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
