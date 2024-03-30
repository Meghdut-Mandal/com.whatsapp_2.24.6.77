package X;

/* renamed from: X.69v  reason: invalid class name and case insensitive filesystem */
public final class C1278369v {
    public final int A00;
    public final AnonymousClass5T0 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1278369v) {
                C1278369v r5 = (C1278369v) obj;
                if (!(this.A01 == r5.A01 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public C1278369v(AnonymousClass5T0 r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UserProblem(userProblemReason=");
        A0u.append(this.A01);
        A0u.append(", strResourceId=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
