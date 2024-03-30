package X;

/* renamed from: X.3JI  reason: invalid class name */
public final class AnonymousClass3JI {
    public AnonymousClass141 A00;
    public boolean A01 = false;
    public final C44072La A02;

    public AnonymousClass3JI(C44072La r2, AnonymousClass141 r3) {
        this.A02 = r2;
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JI) {
                AnonymousClass3JI r5 = (AnonymousClass3JI) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, C36391kE.A0A(this.A02)) + C36341k9.A01(this.A01 ? 1 : 0);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RecommendedNewsletterDataItem(newsletterInfo=");
        C36401kF.A1S(this.A02, A0u);
        A0u.append(this.A00);
        A0u.append(", isLoading=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
