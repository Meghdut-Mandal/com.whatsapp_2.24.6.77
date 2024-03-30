package X;

import java.util.Map;

/* renamed from: X.68a  reason: invalid class name and case insensitive filesystem */
public final class C1273768a {
    public final Map A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1273768a) && AnonymousClass00C.A0J(this.A00, ((C1273768a) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1273768a(Map map) {
        this.A00 = map;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BloksFunctionTable(entries=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
