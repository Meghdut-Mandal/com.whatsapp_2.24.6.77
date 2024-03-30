package X;

import java.util.List;

/* renamed from: X.6Bk  reason: invalid class name and case insensitive filesystem */
public final class C128226Bk {
    public final List A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128226Bk) {
                C128226Bk r5 = (C128226Bk) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A01, C36391kE.A0A(this.A02)));
    }

    public C128226Bk(List list, List list2, List list3) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = list3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrosspostRequestDestinationResult(successIds=");
        A0u.append(this.A02);
        A0u.append(", failureUnknownIds=");
        A0u.append(this.A01);
        A0u.append(", failureDuplicateIds=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
