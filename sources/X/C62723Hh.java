package X;

import java.util.List;

/* renamed from: X.3Hh  reason: invalid class name and case insensitive filesystem */
public final class C62723Hh {
    public final List A00;
    public final boolean A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62723Hh)) {
            return false;
        }
        C62723Hh r4 = (C62723Hh) obj;
        return !AnonymousClass00C.A0J(this.A00, r4.A00) && this.A01 != r4.A01;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, (this.A01 ? 1 : 0) * true);
    }

    public C62723Hh(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ActivityStack{");
        StringBuilder A0u2 = AnonymousClass000.A0u();
        A0u2.append("activities=");
        A0u2.append(this.A00);
        C36351kA.A1K(A0u2, A0u);
        StringBuilder A0u3 = AnonymousClass000.A0u();
        A0u3.append("isEmpty=");
        A0u3.append(this.A01);
        String A0q = AnonymousClass000.A0q(AnonymousClass000.A0s(A0u3), A0u);
        AnonymousClass00C.A08(A0q);
        return A0q;
    }
}
