package X;

/* renamed from: X.69L  reason: invalid class name */
public final class AnonymousClass69L {
    public final int A00;
    public final String A01;

    public AnonymousClass69L(String str, int i) {
        AnonymousClass00C.A0D(str, 1);
        this.A01 = str;
        this.A00 = i;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69L) {
                AnonymousClass69L r5 = (AnonymousClass69L) obj;
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

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("WorkGenerationalId(workSpecId=");
        A0u.append(this.A01);
        A0u.append(", generation=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
