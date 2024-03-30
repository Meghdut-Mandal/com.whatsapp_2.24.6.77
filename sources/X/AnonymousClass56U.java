package X;

/* renamed from: X.56U  reason: invalid class name */
public final class AnonymousClass56U extends C110735b9 {
    public final int A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass56U) {
                AnonymousClass56U r5 = (AnonymousClass56U) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36421kH.A04(this.A01) + this.A00;
    }

    public AnonymousClass56U(String str, int i) {
        this.A01 = str;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Header(prompt=");
        A0u.append(this.A01);
        A0u.append(", batchId=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
