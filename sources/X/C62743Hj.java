package X;

import java.util.List;

/* renamed from: X.3Hj  reason: invalid class name and case insensitive filesystem */
public final class C62743Hj {
    public final List A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62743Hj) {
                C62743Hj r5 = (C62743Hj) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public C62743Hj(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LoadedDiscoveryBots(sections=");
        A0u.append(this.A00);
        A0u.append(", shimmer=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
