package X;

/* renamed from: X.69Z  reason: invalid class name */
public final class AnonymousClass69Z {
    public final String A00;
    public final String A01;

    public AnonymousClass69Z(String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69Z) {
                AnonymousClass69Z r5 = (AnonymousClass69Z) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A00) + C36341k9.A09(this.A01);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ARDModelRequestMetadata(name=");
        A0u.append(this.A00);
        A0u.append(", version=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
