package X;

/* renamed from: X.51l  reason: invalid class name */
public final class AnonymousClass51l extends C1255960m {
    public static final C110235aL A02 = new C110235aL();
    public final String A00;
    public final String A01;

    public AnonymousClass51l(String str, String str2) {
        AnonymousClass00C.A0D(str2, 2);
        this.A00 = str;
        this.A01 = str2;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass51l) {
                AnonymousClass51l r5 = (AnonymousClass51l) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C90504aG.A0B(this.A01, C36421kH.A04(this.A00));
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("RecentSearchBusiness(id=");
        A0u.append(this.A00);
        A0u.append(", jid=");
        return C36321k7.A0E(this.A01, A0u);
    }
}
