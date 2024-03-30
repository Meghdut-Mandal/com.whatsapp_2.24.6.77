package X;

/* renamed from: X.3KP  reason: invalid class name */
public final class AnonymousClass3KP {
    public final long A00;
    public final C52382pL A01;
    public final AnonymousClass141 A02;
    public final String A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KP) {
                AnonymousClass3KP r8 = (AnonymousClass3KP) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r8.A02) && AnonymousClass00C.A0J(this.A04, r8.A04) && AnonymousClass00C.A0J(this.A03, r8.A03) && this.A05 == r8.A05 && this.A01 == r8.A01 && this.A07 == r8.A07 && this.A06 == r8.A06 && this.A00 == r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        C52382pL r0 = this.A01;
        return C36341k9.A02(this.A00, (((C36351kA.A05(r0, (((((C36391kE.A0A(this.A02) + C36341k9.A09(this.A04)) * 31) + C36421kH.A05(this.A03)) * 31) + C36341k9.A01(this.A05 ? 1 : 0)) * 31) + C36341k9.A01(this.A07 ? 1 : 0)) * 31) + C36341k9.A01(this.A06 ? 1 : 0)) * 31);
    }

    public AnonymousClass3KP(C52382pL r1, AnonymousClass141 r2, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        this.A02 = r2;
        this.A04 = str;
        this.A03 = str2;
        this.A05 = z;
        this.A01 = r1;
        this.A07 = z2;
        this.A06 = z3;
        this.A00 = j;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterUiState(contact=");
        A0u.append(this.A02);
        A0u.append(", title=");
        A0u.append(this.A04);
        A0u.append(", description=");
        A0u.append(this.A03);
        A0u.append(", isMuted=");
        A0u.append(this.A05);
        A0u.append(", membership=");
        A0u.append(this.A01);
        A0u.append(", isVerified=");
        A0u.append(this.A07);
        A0u.append(", isSuspended=");
        A0u.append(this.A06);
        A0u.append(", subscribersCount=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
