package X;

import java.util.List;

/* renamed from: X.6Cb  reason: invalid class name and case insensitive filesystem */
public final class C128386Cb {
    public final List A00;
    public final List A01;
    public final List A02;
    public final List A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128386Cb) {
                C128386Cb r5 = (C128386Cb) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36351kA.A05(this.A01, C36351kA.A05(this.A02, C36391kE.A0A(this.A03))));
    }

    public C128386Cb(List list, List list2, List list3, List list4) {
        this.A03 = list;
        this.A02 = list2;
        this.A01 = list3;
        this.A00 = list4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("XFamilyCrosspostRequestResult(enforcedEncryptedSuccessUniqueIds=");
        A0u.append(this.A03);
        A0u.append(", enforcedEncryptedFailureUnknownIds=");
        A0u.append(this.A02);
        A0u.append(", enforcedEncryptedFailureDuplicateIds=");
        A0u.append(this.A01);
        A0u.append(", enforcedEncryptedFailureAlreadySharedIds=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
