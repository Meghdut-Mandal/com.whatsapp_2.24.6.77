package X;

import java.util.Set;

/* renamed from: X.9W8  reason: invalid class name */
public final class AnonymousClass9W8 {
    public final Set A00;
    public final Set A01;
    public final Set A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9W8) {
                AnonymousClass9W8 r5 = (AnonymousClass9W8) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A02, C36351kA.A05(this.A00, C36391kE.A0A(this.A01)));
    }

    public AnonymousClass9W8(Set set, Set set2, Set set3) {
        C36321k7.A11(set, set2, set3);
        this.A01 = set;
        this.A00 = set2;
        this.A02 = set3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("GroupProcessResult(successfulGroups=");
        A0u.append(this.A01);
        A0u.append(", failedGroups=");
        A0u.append(this.A00);
        A0u.append(", truncatedGroups=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
