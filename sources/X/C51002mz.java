package X;

/* renamed from: X.2mz  reason: invalid class name and case insensitive filesystem */
public final class C51002mz extends C56012va {
    public final C63013Ik A00;
    public final C63013Ik A01;
    public final C63323Jp A02;
    public final C51382nj A03;
    public final AnonymousClass2vZ A04;
    public final CharSequence A05;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C51002mz) {
                C51002mz r5 = (C51002mz) obj;
                if (!AnonymousClass00C.A0J(this.A02, r5.A02) || this.A03 != r5.A03 || !AnonymousClass00C.A0J(this.A04, r5.A04) || !AnonymousClass00C.A0J(this.A05, r5.A05) || !AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((((C36351kA.A05(this.A03, C36391kE.A0A(this.A02)) + AnonymousClass000.A0H(this.A04)) * 31) + AnonymousClass000.A0H(this.A05)) * 31) + AnonymousClass000.A0H(this.A00)) * 31) + C36411kG.A09(this.A01);
    }

    public C51002mz(C63013Ik r1, C63013Ik r2, C63323Jp r3, C51382nj r4, AnonymousClass2vZ r5, CharSequence charSequence) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = charSequence;
        this.A00 = r1;
        this.A01 = r2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ContentView(header=");
        A0u.append(this.A02);
        A0u.append(", footnotePosition=");
        A0u.append(this.A03);
        A0u.append(", content=");
        A0u.append(this.A04);
        A0u.append(", footnote=");
        A0u.append(this.A05);
        A0u.append(", primaryButton=");
        A0u.append(this.A00);
        A0u.append(", secondaryButton=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
