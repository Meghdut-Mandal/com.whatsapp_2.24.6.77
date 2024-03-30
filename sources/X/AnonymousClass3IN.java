package X;

/* renamed from: X.3IN  reason: invalid class name */
public final class AnonymousClass3IN {
    public final C51252nW A00;
    public final Integer A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IN) {
                AnonymousClass3IN r5 = (AnonymousClass3IN) obj;
                if (this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A00) + AnonymousClass000.A0H(this.A01);
    }

    public AnonymousClass3IN(C51252nW r1, Integer num) {
        this.A00 = r1;
        this.A01 = num;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("SendMessageState(result=");
        A0u.append(this.A00);
        A0u.append(", messageResId=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
