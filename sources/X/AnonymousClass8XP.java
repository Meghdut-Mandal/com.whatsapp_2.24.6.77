package X;

import java.util.List;

/* renamed from: X.8XP  reason: invalid class name */
public final class AnonymousClass8XP extends AnonymousClass9ET {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass8XP) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass8XP) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass8XP(List list) {
        super(list);
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LoadingContinueSearch(loadingItems=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
