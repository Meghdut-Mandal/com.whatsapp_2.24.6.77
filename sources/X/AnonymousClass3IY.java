package X;

/* renamed from: X.3IY  reason: invalid class name */
public final class AnonymousClass3IY {
    public final C88944Uq A00;
    public final AnonymousClass2bU A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IY) {
                AnonymousClass3IY r5 = (AnonymousClass3IY) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
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

    public AnonymousClass3IY(C88944Uq r1, AnonymousClass2bU r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CurrentMessage(message=");
        A0u.append(this.A01);
        A0u.append(", reactions=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
