package X;

import java.util.Map;

/* renamed from: X.3I5  reason: invalid class name */
public final class AnonymousClass3I5 {
    public final Map A00;
    public final AnonymousClass00T A01 = C36431kI.A1I(new AnonymousClass4A3(this));

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass3I5) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass3I5) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass3I5(Map map) {
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CompoundedLoaderResults(mappedContacts=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
