package X;

/* renamed from: X.6A6  reason: invalid class name */
public final class AnonymousClass6A6 {
    public final String A00;
    public final String A01;

    public AnonymousClass6A6(String str, String str2) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A00 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6A6) {
                AnonymousClass6A6 r5 = (AnonymousClass6A6) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + C36341k9.A09(this.A00);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Command(name=");
        A0u.append(this.A01);
        A0u.append(", description=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
