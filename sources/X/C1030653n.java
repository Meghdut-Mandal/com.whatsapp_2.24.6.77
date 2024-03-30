package X;

import java.util.List;

/* renamed from: X.53n  reason: invalid class name and case insensitive filesystem */
public final class C1030653n extends C117065le {
    public boolean A00;
    public final List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1030653n(List list, boolean z) {
        super(true);
        AnonymousClass00C.A0D(list, 1);
        this.A01 = list;
        this.A00 = z;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1030653n) {
                C1030653n r5 = (C1030653n) obj;
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
        A0u.append("FetchCategoriesSuccess(categories=");
        A0u.append(this.A01);
        A0u.append(", cached=");
        return C36321k7.A0H(A0u, this.A00);
    }
}
