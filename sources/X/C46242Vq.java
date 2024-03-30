package X;

import java.util.Set;

/* renamed from: X.2Vq  reason: invalid class name and case insensitive filesystem */
public final class C46242Vq extends C54492t2 {
    public final Set A00;
    public final Set A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46242Vq) {
                C46242Vq r5 = (C46242Vq) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public C46242Vq(Set set, Set set2) {
        this.A00 = set;
        this.A01 = set2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LinkSubgroupsResult(groups=");
        A0u.append(this.A00);
        A0u.append(", participants=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
