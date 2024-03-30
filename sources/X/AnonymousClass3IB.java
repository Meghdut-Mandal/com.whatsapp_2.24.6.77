package X;

/* renamed from: X.3IB  reason: invalid class name */
public final class AnonymousClass3IB {
    public final C51482nt A00;
    public final CharSequence A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IB) {
                AnonymousClass3IB r5 = (AnonymousClass3IB) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36401kF.A02(this.A01, C36391kE.A0A(this.A00));
    }

    public AnonymousClass3IB(C51482nt r1, CharSequence charSequence) {
        this.A00 = r1;
        this.A01 = charSequence;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("UiState(action=");
        A0u.append(this.A00);
        A0u.append(", descriptionText=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
