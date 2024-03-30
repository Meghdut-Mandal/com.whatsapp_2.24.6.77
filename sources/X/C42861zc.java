package X;

import java.util.Set;

/* renamed from: X.1zc  reason: invalid class name and case insensitive filesystem */
public final class C42861zc extends C53012qZ {
    public final Set A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C42861zc) && AnonymousClass00C.A0J(this.A00, ((C42861zc) obj).A00));
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + 1231;
    }

    public C42861zc(Set set) {
        this.A00 = C007103b.A0f(set);
    }
}
