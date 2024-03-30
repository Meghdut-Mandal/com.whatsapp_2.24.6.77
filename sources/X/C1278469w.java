package X;

import java.util.List;

/* renamed from: X.69w  reason: invalid class name and case insensitive filesystem */
public final class C1278469w {
    public final AnonymousClass5TQ A00;
    public final List A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1278469w) {
                C1278469w r5 = (C1278469w) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
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

    public C1278469w(AnonymousClass5TQ r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserProblemData(userProblemCategory=");
        A0u.append(this.A00);
        A0u.append(", userProblems=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
