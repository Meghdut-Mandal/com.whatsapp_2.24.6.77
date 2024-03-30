package X;

/* renamed from: X.3QI  reason: invalid class name */
public final class AnonymousClass3QI {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3QI) {
                AnonymousClass3QI r5 = (AnonymousClass3QI) obj;
                if (!(this.A01 == r5.A01 && this.A03 == r5.A03 && this.A02 == r5.A02 && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (((((this.A01 * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public AnonymousClass3QI(int i, int i2, int i3, int i4) {
        this.A01 = i;
        this.A03 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("Margins(left=");
        A0u.append(this.A01);
        A0u.append(", top=");
        A0u.append(this.A03);
        A0u.append(", right=");
        A0u.append(this.A02);
        A0u.append(", bottom=");
        return C36321k7.A0G(A0u, this.A00);
    }

    public AnonymousClass3QI() {
        this(0, 0, 0, 0);
    }
}
