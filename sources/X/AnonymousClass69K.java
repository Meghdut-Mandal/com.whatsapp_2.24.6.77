package X;

/* renamed from: X.69K  reason: invalid class name */
public final class AnonymousClass69K {
    public final Long A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69K) {
                AnonymousClass69K r5 = (AnonymousClass69K) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + AnonymousClass000.A0H(this.A00);
    }

    public AnonymousClass69K(String str, Long l) {
        this.A01 = str;
        this.A00 = l;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Preference(key=");
        A0u.append(this.A01);
        A0u.append(", value=");
        return AnonymousClass000.A0m(this.A00, A0u);
    }
}
