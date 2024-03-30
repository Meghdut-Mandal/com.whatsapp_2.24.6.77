package X;

import java.util.Map;

/* renamed from: X.2ap  reason: invalid class name */
public final class AnonymousClass2ap extends C55102u4 {
    public final Map A00;

    public AnonymousClass2ap(Map map) {
        AnonymousClass00C.A0D(map, 1);
        this.A00 = map;
    }

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass2ap) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass2ap) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Ready(newsletterAppealsMap=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }

    public AnonymousClass2ap() {
        this(C000400e.A0D());
    }
}
