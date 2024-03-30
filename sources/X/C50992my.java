package X;

/* renamed from: X.2my  reason: invalid class name and case insensitive filesystem */
public final class C50992my extends C56012va {
    public final C63013Ik A00;
    public final C63013Ik A01;
    public final C63323Jp A02;
    public final CharSequence A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C50992my) {
                C50992my r5 = (C50992my) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((C36391kE.A0A(this.A02) + AnonymousClass000.A0H(this.A03)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01);
    }

    public C50992my(C63013Ik r1, C63013Ik r2, C63323Jp r3, CharSequence charSequence) {
        this.A02 = r3;
        this.A03 = charSequence;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Card(header=");
        A0u.append(this.A02);
        A0u.append(", footnote=");
        A0u.append(this.A03);
        A0u.append(", primaryButton=");
        A0u.append(this.A00);
        A0u.append(", secondaryButton=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
