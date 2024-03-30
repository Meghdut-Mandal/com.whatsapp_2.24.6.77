package X;

/* renamed from: X.6BI  reason: invalid class name */
public final class AnonymousClass6BI {
    public final int A00;
    public final C61243Bc A01;
    public final Integer A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BI) {
                AnonymousClass6BI r5 = (AnonymousClass6BI) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A02)) * 31) + this.A00;
    }

    public AnonymousClass6BI(C61243Bc r1, Integer num, int i) {
        this.A01 = r1;
        this.A02 = num;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SubtitleState(stringProvider=");
        A0u.append(this.A01);
        A0u.append(", drawableRes=");
        A0u.append(this.A02);
        A0u.append(", animationState=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
