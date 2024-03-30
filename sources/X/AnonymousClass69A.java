package X;

/* renamed from: X.69A  reason: invalid class name */
public final class AnonymousClass69A {
    public double A00;
    public double A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass69A) {
                AnonymousClass69A r7 = (AnonymousClass69A) obj;
                if (!(Double.compare(this.A01, r7.A01) == 0 && Double.compare(this.A00, r7.A00) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(Double.doubleToLongBits(this.A00), C90464aC.A08(Double.doubleToLongBits(this.A01)));
    }

    public AnonymousClass69A(double d, double d2) {
        this.A01 = d;
        this.A00 = d2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("ComplexDouble(_real=");
        A0u.append(this.A01);
        A0u.append(", _imaginary=");
        A0u.append(this.A00);
        return AnonymousClass000.A0t(A0u, ')');
    }
}
