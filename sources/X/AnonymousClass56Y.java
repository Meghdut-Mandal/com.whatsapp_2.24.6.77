package X;

/* renamed from: X.56Y  reason: invalid class name */
public final class AnonymousClass56Y extends C110745bA {
    public final Exception A00;
    public final String A01;

    public AnonymousClass56Y(String str, Exception exc) {
        AnonymousClass00C.A0D(str, 2);
        this.A00 = exc;
        this.A01 = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass56Y) {
                AnonymousClass56Y r5 = (AnonymousClass56Y) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, AnonymousClass000.A0H(this.A00) * 31);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Error(exception=");
        A0u.append(this.A00);
        A0u.append(", prompt=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
