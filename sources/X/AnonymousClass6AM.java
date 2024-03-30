package X;

/* renamed from: X.6AM  reason: invalid class name */
public final class AnonymousClass6AM {
    public final Exception A00;
    public final Object A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6AM) {
                AnonymousClass6AM r5 = (AnonymousClass6AM) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (AnonymousClass000.A0H(this.A01) * 31) + C36411kG.A09(this.A00);
    }

    public AnonymousClass6AM(Exception exc, Object obj) {
        this.A01 = obj;
        this.A00 = exc;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Result(value=");
        A0u.append(this.A01);
        A0u.append(", exception=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
