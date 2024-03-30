package X;

/* renamed from: X.3KF  reason: invalid class name */
public final class AnonymousClass3KF {
    public C52602pr A00;
    public C52602pr A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KF) {
                AnonymousClass3KF r5 = (AnonymousClass3KF) obj;
                if (!(this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A05 == r5.A05 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A01, C36351kA.A05(this.A00, ((C36341k9.A01(this.A03 ? 1 : 0) * 31) + C36341k9.A01(this.A02 ? 1 : 0)) * 31)) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A04 ? 1 : 0);
    }

    public AnonymousClass3KF(C52602pr r1, C52602pr r2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A02 = z2;
        this.A00 = r1;
        this.A01 = r2;
        this.A05 = z3;
        this.A04 = z4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CrossPostingViewModelState(shareViewVisible=");
        A0u.append(this.A03);
        A0u.append(", shareViewShouldAnimate=");
        A0u.append(this.A02);
        A0u.append(", fbIconState=");
        A0u.append(this.A00);
        A0u.append(", igIconState=");
        A0u.append(this.A01);
        A0u.append(", upsellViewVisible=");
        A0u.append(this.A05);
        A0u.append(", upsellViewShouldAnimate=");
        return C36321k7.A0H(A0u, this.A04);
    }
}
