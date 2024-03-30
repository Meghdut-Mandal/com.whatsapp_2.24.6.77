package X;

/* renamed from: X.3IM  reason: invalid class name */
public final class AnonymousClass3IM {
    public final double A00;
    public final double A01;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass3IM) {
                AnonymousClass3IM r7 = (AnonymousClass3IM) obj;
                if (!(Double.compare(this.A00, r7.A00) == 0 && Double.compare(this.A01, r7.A01) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C36341k9.A02(Double.doubleToLongBits(this.A01), AnonymousClass000.A08(Double.doubleToLongBits(this.A00)) * 31);
    }

    public AnonymousClass3IM(double d, double d2) {
        this.A00 = d;
        this.A01 = d2;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("LocationPoint(latitude=");
        A0u.append(this.A00);
        A0u.append(", longitude=");
        A0u.append(this.A01);
        return AnonymousClass000.A0t(A0u, ')');
    }
}
