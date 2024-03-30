package X;

import java.util.List;

/* renamed from: X.6Bo  reason: invalid class name and case insensitive filesystem */
public final class C128266Bo {
    public final C128746Dl A00;
    public final List A01;
    public final List A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128266Bo) {
                C128266Bo r5 = (C128266Bo) obj;
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

    public C128266Bo(C128746Dl r1, List list, List list2) {
        this.A02 = list;
        this.A01 = list2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostEligibilityCheckResult(enforcedEncryptedUniqueIdList=");
        A0u.append(this.A02);
        A0u.append(", crosspostedStateList=");
        A0u.append(this.A01);
        A0u.append(", purposeEncryptionParams=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
