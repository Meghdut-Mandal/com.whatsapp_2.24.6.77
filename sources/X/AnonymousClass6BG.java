package X;

/* renamed from: X.6BG  reason: invalid class name */
public final class AnonymousClass6BG {
    public final String A00;
    public final String A01;
    public final Object A02;

    public AnonymousClass6BG(Object obj, String str, String str2) {
        AnonymousClass00C.A0D(str2, 2);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = obj;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6BG) {
                AnonymousClass6BG r5 = (AnonymousClass6BG) obj;
                if (!AnonymousClass00C.A0J(this.A00, r5.A00) || !AnonymousClass00C.A0J(this.A01, r5.A01) || !AnonymousClass00C.A0J(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36381kD.A08(this.A01, C36421kH.A04(this.A00)) + AnonymousClass000.A0H(this.A02);
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("BreadCrumbItem(itemId=");
        A0u.append(this.A00);
        A0u.append(", itemName=");
        A0u.append(this.A01);
        A0u.append(", data=");
        return AnonymousClass000.A0m(this.A02, A0u);
    }
}
