package X;

/* renamed from: X.3KA  reason: invalid class name */
public final class AnonymousClass3KA {
    public final int A00;
    public final int A01;
    public final C28981Uw A02;
    public final C51952oe A03;
    public final boolean A04;
    public final boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KA) {
                AnonymousClass3KA r5 = (AnonymousClass3KA) obj;
                if (!(this.A03 == r5.A03 && AnonymousClass00C.A0J(this.A02, r5.A02) && this.A01 == r5.A01 && this.A00 == r5.A00 && this.A04 == r5.A04 && this.A05 == r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C36351kA.A05(this.A02, C36391kE.A0A(this.A03)) + this.A01) * 31) + this.A00) * 31) + C36341k9.A01(this.A04 ? 1 : 0)) * 31) + C36341k9.A01(this.A05 ? 1 : 0);
    }

    public AnonymousClass3KA(C28981Uw r1, C51952oe r2, int i, int i2, boolean z, boolean z2) {
        this.A03 = r2;
        this.A02 = r1;
        this.A01 = i;
        this.A00 = i2;
        this.A04 = z;
        this.A05 = z2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterActionError(action=");
        A0u.append(this.A03);
        A0u.append(", jid=");
        A0u.append(this.A02);
        A0u.append(", title=");
        A0u.append(this.A01);
        A0u.append(", message=");
        A0u.append(this.A00);
        A0u.append(", shouldRetry=");
        A0u.append(this.A04);
        A0u.append(", isConnectivityError=");
        return C36321k7.A0H(A0u, this.A05);
    }
}
