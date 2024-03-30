package X;

/* renamed from: X.9VX  reason: invalid class name */
public final class AnonymousClass9VX {
    public final C172418Nt A00;
    public final AnonymousClass918 A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9VX) {
                AnonymousClass9VX r5 = (AnonymousClass9VX) obj;
                if (this.A01 != r5.A01 || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + AnonymousClass000.A0H(this.A00);
    }

    public AnonymousClass9VX(C172418Nt r1, AnonymousClass918 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PlaceholderMessageResendResponseResult(resultType=");
        A0u.append(this.A01);
        A0u.append(", placeholderMessageResendResponse=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
