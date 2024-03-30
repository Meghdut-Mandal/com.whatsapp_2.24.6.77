package X;

/* renamed from: X.3Ia  reason: invalid class name and case insensitive filesystem */
public final class C62913Ia {
    public final C28981Uw A00;
    public final C51952oe A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C62913Ia) {
                C62913Ia r5 = (C62913Ia) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A00, C36391kE.A0A(this.A01));
    }

    public C62913Ia(C28981Uw r1, C51952oe r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterSuccessAction(action=");
        A0u.append(this.A01);
        A0u.append(", jid=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
