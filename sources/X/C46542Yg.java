package X;

/* renamed from: X.2Yg  reason: invalid class name and case insensitive filesystem */
public final class C46542Yg extends C54882ti {
    public AnonymousClass141 A00;
    public boolean A01 = false;
    public final C44072La A02;

    public C46542Yg(C44072La r2, AnonymousClass141 r3) {
        this.A02 = r2;
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46542Yg) {
                C46542Yg r5 = (C46542Yg) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00) || this.A01 != r5.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A00, C36391kE.A0A(this.A02)) + C36341k9.A01(this.A01 ? 1 : 0)) * 31) + 1237;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterDataItem(newsletterInfo=");
        C36401kF.A1S(this.A02, A0u);
        A0u.append(this.A00);
        A0u.append(", isLoading=");
        A0u.append(this.A01);
        A0u.append(", showSubtitle=");
        return C36321k7.A0H(A0u, false);
    }
}
