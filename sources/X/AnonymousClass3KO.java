package X;

/* renamed from: X.3KO  reason: invalid class name */
public final class AnonymousClass3KO {
    public final long A00;
    public final C52382pL A01;
    public final C52172p0 A02;
    public final C223313w A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final C28981Uw A07;

    public AnonymousClass3KO(C52382pL r2, C52172p0 r3, C223313w r4, C28981Uw r5, Long l, String str, String str2, long j) {
        C36381kD.A1K(r5, 1, r3);
        this.A07 = r5;
        this.A03 = r4;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = l;
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = j;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3KO) {
                AnonymousClass3KO r8 = (AnonymousClass3KO) obj;
                if (!AnonymousClass00C.A0J(this.A07, r8.A07) || !AnonymousClass00C.A0J(this.A03, r8.A03) || !AnonymousClass00C.A0J(this.A05, r8.A05) || !AnonymousClass00C.A0J(this.A06, r8.A06) || !AnonymousClass00C.A0J(this.A04, r8.A04) || this.A01 != r8.A01 || this.A02 != r8.A02 || this.A00 != r8.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A00, C36351kA.A05(this.A02, C36351kA.A05(this.A01, (((((((C36391kE.A0A(this.A07) + AnonymousClass000.A0H(this.A03)) * 31) + C36341k9.A09(this.A05)) * 31) + C36341k9.A09(this.A06)) * 31) + C36411kG.A09(this.A04)) * 31)));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterMember(newsletterJid=");
        A0u.append(this.A07);
        A0u.append(", memberJid=");
        A0u.append(this.A03);
        A0u.append(", displayName=");
        A0u.append(this.A05);
        A0u.append(", profilePictureDirectPath=");
        A0u.append(this.A06);
        A0u.append(", subscriptionTimestamp=");
        A0u.append(this.A04);
        A0u.append(", role=");
        A0u.append(this.A01);
        A0u.append(", typeOfFetch=");
        A0u.append(this.A02);
        A0u.append(", fetchedMs=");
        return C36331k8.A0j(A0u, this.A00);
    }
}
