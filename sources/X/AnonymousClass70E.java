package X;

import java.util.Map;

/* renamed from: X.70E  reason: invalid class name */
public final class AnonymousClass70E implements C16360p7 {
    public Map A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass70E) && AnonymousClass00C.A0J(this.A00, ((AnonymousClass70E) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public AnonymousClass70E(Map map) {
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BkMockGalaxyActionEvent(data=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
