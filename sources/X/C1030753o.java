package X;

import java.util.Map;

/* renamed from: X.53o  reason: invalid class name and case insensitive filesystem */
public final class C1030753o extends C117065le {
    public boolean A00;
    public final Map A01;

    public C1030753o(Map map, boolean z) {
        super(true);
        this.A01 = map;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1030753o) {
                C1030753o r5 = (C1030753o) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + C36341k9.A01(this.A00 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("FetchGroupedCategoriesSuccess(categories=");
        A0u.append(this.A01);
        A0u.append(", cached=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
