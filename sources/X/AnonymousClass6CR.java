package X;

/* renamed from: X.6CR  reason: invalid class name */
public final class AnonymousClass6CR {
    public AnonymousClass141 A00;
    public CharSequence A01;
    public final long A02;
    public final C223313w A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6CR) {
                AnonymousClass6CR r8 = (AnonymousClass6CR) obj;
                if (!AnonymousClass00C.A0J(this.A03, r8.A03) || this.A02 != r8.A02 || !AnonymousClass00C.A0J(this.A01, r8.A01) || !AnonymousClass00C.A0J(this.A00, r8.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36321k7.A00(this.A02, C36391kE.A0A(this.A03)) + AnonymousClass000.A0H(this.A01)) * 31) + C36411kG.A09(this.A00);
    }

    public AnonymousClass6CR(AnonymousClass141 r1, C223313w r2, CharSequence charSequence, long j) {
        this.A03 = r2;
        this.A02 = j;
        this.A01 = charSequence;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("NewsletterPollVoter(lid=");
        A0u.append(this.A03);
        A0u.append(", actionTimestamp=");
        A0u.append(this.A02);
        A0u.append(", displayName=");
        A0u.append(this.A01);
        A0u.append(", contact=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
