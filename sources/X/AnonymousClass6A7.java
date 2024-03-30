package X;

/* renamed from: X.6A7  reason: invalid class name */
public final class AnonymousClass6A7 {
    public final String A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6A7) {
                AnonymousClass6A7 r5 = (AnonymousClass6A7) obj;
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

    public AnonymousClass6A7(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Prompt(text=");
        A0u.append(this.A01);
        A0u.append(", emoji=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
