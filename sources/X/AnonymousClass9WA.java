package X;

import java.util.Set;

/* renamed from: X.9WA  reason: invalid class name */
public final class AnonymousClass9WA {
    public final int A00;
    public final B15 A01;
    public final Set A02;

    public AnonymousClass9WA(B15 b15, Set set, int i) {
        AnonymousClass00C.A0D(set, 2);
        this.A00 = i;
        this.A02 = set;
        this.A01 = b15;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WA) {
                AnonymousClass9WA r5 = (AnonymousClass9WA) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A02, this.A00 * 31));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("StubMessageParserInfo(messageType=");
        A0u.append(this.A00);
        A0u.append(", stubTypes=");
        A0u.append(this.A02);
        A0u.append(", parser=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
