package X;

/* renamed from: X.3JJ  reason: invalid class name */
public final class AnonymousClass3JJ {
    public final C51882oX A00;
    public final AnonymousClass3T1 A01;
    public final C64933Qa A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3JJ) {
                AnonymousClass3JJ r5 = (AnonymousClass3JJ) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00 || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36351kA.A05(this.A00, C36391kE.A0A(this.A01)) + AnonymousClass000.A0H(this.A02);
    }

    public AnonymousClass3JJ(C51882oX r1, AnonymousClass3T1 r2, C64933Qa r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PinInChatMessageChange(message=");
        A0u.append(this.A01);
        A0u.append(", type=");
        A0u.append(this.A00);
        A0u.append(", previousMessageKeyBeforeEdit=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
