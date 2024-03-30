package X;

/* renamed from: X.9WG  reason: invalid class name */
public final class AnonymousClass9WG {
    public final String A00;
    public final String A01;
    public final String A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9WG) {
                AnonymousClass9WG r5 = (AnonymousClass9WG) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02) || !AnonymousClass00C.A0J(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((C36421kH.A04(this.A01) + C36341k9.A09(this.A02)) * 31) + C36421kH.A05(this.A00);
    }

    public AnonymousClass9WG(String str, String str2, String str3) {
        this.A01 = str;
        this.A02 = str2;
        this.A00 = str3;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("PixKey(type=");
        A0u.append(this.A01);
        A0u.append(", value=");
        A0u.append(this.A02);
        A0u.append(", name=");
        return C36321k7.A0E(this.A00, A0u);
    }
}
