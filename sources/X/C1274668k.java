package X;

import java.util.List;

/* renamed from: X.68k  reason: invalid class name and case insensitive filesystem */
public final class C1274668k {
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C1274668k) && AnonymousClass00C.A0J(this.A00, ((C1274668k) obj).A00));
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C1274668k(List list) {
        this.A00 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ARClassLookup(values=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
