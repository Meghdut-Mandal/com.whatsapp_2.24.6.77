package X;

/* renamed from: X.6Cd  reason: invalid class name and case insensitive filesystem */
public final class C128406Cd {
    public final double A00;
    public final double A01;
    public final double A02;
    public final double A03;
    public final double A04;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C128406Cd) {
                C128406Cd r7 = (C128406Cd) obj;
                if (!(Double.compare(this.A04, r7.A04) == 0 && Double.compare(this.A00, r7.A00) == 0 && Double.compare(this.A01, r7.A01) == 0 && Double.compare(this.A02, r7.A02) == 0 && Double.compare(this.A03, r7.A03) == 0 && Double.compare(0.0d, 0.0d) == 0)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public C128406Cd(double d, double d2, double d3, double d4, double d5) {
        this.A04 = d;
        this.A00 = d2;
        this.A01 = d3;
        this.A02 = d4;
        this.A03 = d5;
        if (Double.isNaN(d2) || Double.isNaN(d3) || Double.isNaN(d4) || Double.isNaN(d5) || Double.isNaN(0.0d) || Double.isNaN(d)) {
            throw AnonymousClass001.A08("Parameters cannot be NaN");
        } else if (d5 < 0.0d || d5 > 1.0d) {
            StringBuilder A0u = AnonymousClass000.A0u();
            A0u.append("Parameter d must be in the range [0..1], was ");
            A0u.append(d5);
            throw AnonymousClass000.A0b(A0u);
        } else if (d5 == 0.0d && (d2 == 0.0d || d == 0.0d)) {
            throw AnonymousClass001.A08("Parameter a or g is zero, the transfer function is constant");
        } else if (d5 >= 1.0d && d4 == 0.0d) {
            throw AnonymousClass001.A08("Parameter c is zero, the transfer function is constant");
        } else if ((d2 == 0.0d || d == 0.0d) && d4 == 0.0d) {
            throw AnonymousClass001.A08("Parameter a or g is zero, and c is zero, the transfer function is constant");
        } else if (d4 < 0.0d) {
            throw AnonymousClass001.A08("The transfer function must be increasing");
        } else if (d2 < 0.0d || d < 0.0d) {
            throw AnonymousClass001.A08("The transfer function must be positive or increasing");
        }
    }

    public int hashCode() {
        int A002 = C36321k7.A00(Double.doubleToLongBits(this.A03), C36321k7.A00(Double.doubleToLongBits(this.A02), C36321k7.A00(Double.doubleToLongBits(this.A01), C36321k7.A00(Double.doubleToLongBits(this.A00), C90464aC.A08(Double.doubleToLongBits(this.A04))))));
        int A08 = AnonymousClass000.A08(Double.doubleToLongBits(0.0d));
        return ((A002 + A08) * 31) + A08;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        A0u.append("TransferParameters(gamma=");
        A0u.append(this.A04);
        A0u.append(", a=");
        A0u.append(this.A00);
        A0u.append(", b=");
        A0u.append(this.A01);
        A0u.append(", c=");
        A0u.append(this.A02);
        A0u.append(", d=");
        A0u.append(this.A03);
        A0u.append(", e=");
        A0u.append(0.0d);
        A0u.append(", f=");
        A0u.append(0.0d);
        return AnonymousClass000.A0t(A0u, ')');
    }
}
