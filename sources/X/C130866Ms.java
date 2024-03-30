package X;

/* renamed from: X.6Ms  reason: invalid class name and case insensitive filesystem */
public class C130866Ms {
    public double A00;
    public double A01;
    public double A02;
    public double A03;

    public C130866Ms(double d, double d2, double d3, double d4) {
        this.A01 = d;
        this.A03 = d2;
        this.A02 = d3;
        this.A00 = d4;
    }

    public String toString() {
        StringBuilder A0u = AnonymousClass000.A0u();
        AnonymousClass000.A1C(this, A0u);
        A0u.append("(");
        A0u.append(this.A01);
        A0u.append(", ");
        A0u.append(this.A03);
        A0u.append(", ");
        A0u.append(this.A02);
        A0u.append(", ");
        A0u.append(this.A00);
        return C90474aD.A0f(A0u);
    }

    public C130866Ms() {
    }
}
