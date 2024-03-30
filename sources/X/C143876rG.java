package X;

/* renamed from: X.6rG  reason: invalid class name and case insensitive filesystem */
public final class C143876rG implements C16230op {
    public final int A00;
    public final C16210on A01;
    public final C16220oo A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C143876rG) {
                C143876rG r5 = (C143876rG) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A01, C36391kE.A0A(this.A02)) + this.A00;
    }

    public C143876rG(C16210on r1, C16220oo r2, int i) {
        C36321k7.A0x(r2, r1);
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Visible(content=");
        A0u.append(this.A02);
        A0u.append(", startButton=");
        A0u.append(this.A01);
        A0u.append(", endCallRes=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
