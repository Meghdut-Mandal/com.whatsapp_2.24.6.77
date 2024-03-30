package X;

import java.util.List;

/* renamed from: X.69q  reason: invalid class name and case insensitive filesystem */
public final class C1277869q {
    public final long A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1277869q) {
                C1277869q r8 = (C1277869q) obj;
                if (!AnonymousClass00C.A0J(this.A01, r8.A01) || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public C1277869q(List list, long j) {
        this.A01 = list;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PopularBusinesses(popularBusinessDataList=");
        A0u.append(this.A01);
        A0u.append(", lastUpdated=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
