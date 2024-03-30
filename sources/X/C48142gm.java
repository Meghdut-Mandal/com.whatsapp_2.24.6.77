package X;

/* renamed from: X.2gm  reason: invalid class name and case insensitive filesystem */
public final class C48142gm extends C55652uy {
    public AnonymousClass141 A00;
    public boolean A01;
    public final C44072La A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48142gm) {
                C48142gm r5 = (C48142gm) obj;
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

    public C48142gm(C44072La r1, AnonymousClass141 r2, boolean z) {
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = z;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterRemoteDataItem(newsletter=");
        C36401kF.A1S(this.A02, A0u);
        A0u.append(this.A00);
        A0u.append(", isLoading=");
        return C36321k7.A0H(A0u, this.A01);
    }
}
