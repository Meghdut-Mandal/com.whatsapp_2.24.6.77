package X;

/* renamed from: X.3Jw  reason: invalid class name and case insensitive filesystem */
public final class C63393Jw {
    public final int A00;
    public final C28981Uw A01;
    public final C52332pG A02;
    public final String A03;
    public final String A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C63393Jw) {
                C63393Jw r5 = (C63393Jw) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A04, r5.A04) || this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36381kD.A08(this.A04, (C36391kE.A0A(this.A01) + this.A00) * 31) + AnonymousClass000.A0H(this.A02)) * 31) + C36421kH.A05(this.A03);
    }

    public C63393Jw(C28981Uw r1, C52332pG r2, String str, String str2, int i) {
        C36321k7.A0y(r1, str);
        this.A01 = r1;
        this.A00 = i;
        this.A04 = str;
        this.A02 = r2;
        this.A03 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ForwardedNewsletterMessageInfo(newsletterJid=");
        A0u.append(this.A01);
        A0u.append(", serverMessageId=");
        A0u.append(this.A00);
        A0u.append(", newsletterName=");
        A0u.append(this.A04);
        A0u.append(", contentType=");
        A0u.append(this.A02);
        A0u.append(", accessibilityText=");
        return C36321k7.A0E(this.A03, A0u);
    }
}
