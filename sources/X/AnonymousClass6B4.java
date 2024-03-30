package X;

/* renamed from: X.6B4  reason: invalid class name */
public final class AnonymousClass6B4 {
    public long A00;
    public long A01;
    public final C207269up A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass6B4) {
                AnonymousClass6B4 r8 = (AnonymousClass6B4) obj;
                if (!(AnonymousClass00C.A0J(this.A02, r8.A02) && this.A00 == r8.A00 && this.A01 == r8.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(this.A01, C36321k7.A00(this.A00, C36391kE.A0A(this.A02)));
    }

    public AnonymousClass6B4(C207269up r1, long j, long j2) {
        this.A02 = r1;
        this.A00 = j;
        this.A01 = j2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("CartItem(product=");
        A0u.append(this.A02);
        A0u.append(", quantity=");
        A0u.append(this.A00);
        A0u.append(", totalVariantQuantity=");
        return C36331k8.A0j(A0u, this.A01);
    }
}
