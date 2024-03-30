package X;

import java.util.Arrays;
import java.util.Set;

/* renamed from: X.3IP  reason: invalid class name */
public final class AnonymousClass3IP {
    public final Set A00;
    public final boolean A01;

    public static AnonymousClass3IP A00(Object[] objArr) {
        return new AnonymousClass3IP(AnonymousClass02N.A03(Arrays.copyOf(objArr, 2)), false);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IP) {
                AnonymousClass3IP r5 = (AnonymousClass3IP) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36341k9.A01(this.A01 ? 1 : 0) * 31);
    }

    public AnonymousClass3IP(Set set, boolean z) {
        this.A01 = z;
        this.A00 = set;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LazyLoadParams(isQuoted=");
        A0u.append(this.A01);
        A0u.append(", flags=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
