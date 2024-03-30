package X;

/* renamed from: X.69V  reason: invalid class name */
public final class AnonymousClass69V {
    public final int A00;
    public final C134596bI A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69V) {
                AnonymousClass69V r5 = (AnonymousClass69V) obj;
                if (!AnonymousClass00C.A0J(this.A01, r5.A01) || this.A00 != r5.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36391kE.A0A(this.A01) + this.A00;
    }

    public AnonymousClass69V(C134596bI r1, int i) {
        this.A01 = r1;
        this.A00 = i;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CdsBorderData(color=");
        A0u.append(this.A01);
        A0u.append(", width=");
        return C36321k7.A0G(A0u, this.A00);
    }
}
