package X;

/* renamed from: X.3IF  reason: invalid class name */
public final class AnonymousClass3IF {
    public AnonymousClass141 A00;
    public C61953Ed A01 = null;

    public AnonymousClass3IF(AnonymousClass141 r3) {
        AnonymousClass00C.A0D(r3, 1);
        this.A00 = r3;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IF) {
                AnonymousClass3IF r5 = (AnonymousClass3IF) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
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

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Suggestion(contact=");
        A0u.append(this.A00);
        A0u.append(", statusData=");
        return AnonymousClass000.A0m(this.A01, A0u);
    }
}
