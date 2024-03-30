package X;

/* renamed from: X.6Bp  reason: invalid class name and case insensitive filesystem */
public final class C128276Bp {
    public AnonymousClass65H A00 = null;
    public AnonymousClass72L A01;
    public boolean A02 = false;
    public final AnonymousClass72L A03;

    public C128276Bp(AnonymousClass72L r3, AnonymousClass72L r4) {
        this.A03 = r3;
        this.A01 = r4;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128276Bp) {
                C128276Bp r5 = (C128276Bp) obj;
                if (!AnonymousClass00C.A0J(this.A03, r5.A03) || !AnonymousClass00C.A0J(this.A01, r5.A01) || this.A02 != r5.A02 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36351kA.A05(this.A01, C36391kE.A0A(this.A03)) + C36341k9.A01(this.A02 ? 1 : 0)) * 31) + AnonymousClass000.A0H(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TextSubstitutionValue(original=");
        A0u.append(this.A03);
        A0u.append(", substitution=");
        A0u.append(this.A01);
        A0u.append(", isShowingSubstitution=");
        A0u.append(this.A02);
        A0u.append(", layoutCache=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
