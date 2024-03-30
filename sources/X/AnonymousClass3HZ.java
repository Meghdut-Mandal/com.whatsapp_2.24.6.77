package X;

import java.util.Set;

/* renamed from: X.3HZ  reason: invalid class name */
public final class AnonymousClass3HZ {
    public final Set A00;

    public AnonymousClass3HZ(Set set) {
        AnonymousClass00C.A0D(set, 1);
        this.A00 = set;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3HZ) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass3HZ) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterGeosuspendedInfo(countries=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
