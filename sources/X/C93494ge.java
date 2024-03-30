package X;

/* renamed from: X.4ge  reason: invalid class name and case insensitive filesystem */
public final class C93494ge extends C137446g9 {
    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C93494ge) {
                C137446g9 r5 = (C137446g9) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36351kA.A05(this.A00, C36351kA.A05(this.A02, C36391kE.A0A(this.A03))));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RoundedCornerShape(topStart = ");
        A0u.append(this.A03);
        A0u.append(", topEnd = ");
        A0u.append(this.A02);
        A0u.append(", bottomEnd = ");
        A0u.append(this.A00);
        A0u.append(", bottomStart = ");
        return AnonymousClass000.A0m(this.A01, A0u);
    }

    public C93494ge(C157557dj r1, C157557dj r2, C157557dj r3, C157557dj r4) {
        super(r1, r2, r3, r4);
    }
}
