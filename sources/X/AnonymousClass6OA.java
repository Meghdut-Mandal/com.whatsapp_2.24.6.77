package X;

/* renamed from: X.6OA  reason: invalid class name */
public final class AnonymousClass6OA {
    public double A00;
    public double A01;
    public double A02;
    public double A03;
    public boolean A04 = false;

    public C135076c5 A00() {
        double d = this.A03;
        double d2 = this.A00;
        double d3 = this.A02;
        double d4 = this.A01;
        if (d3 == d4 && d == d2) {
            double d5 = d2 + 2.0E-4d;
            if (d5 < 180.0d) {
                d2 = d5;
            }
            double d6 = d - 2.0E-4d;
            if (d6 > -180.0d) {
                d = d6;
            }
        }
        return new C135076c5(C134976bv.A00(d3, d), C134976bv.A00(d4, d2));
    }

    public void A01(C134976bv r13) {
        if (!this.A04) {
            double d = r13.A00;
            this.A02 = d;
            this.A01 = d;
            double d2 = r13.A01;
            this.A00 = d2;
            this.A03 = d2;
            this.A04 = true;
        }
        double d3 = r13.A00;
        if (d3 > this.A01) {
            this.A01 = d3;
        } else if (d3 < this.A02) {
            this.A02 = d3;
        }
        double d4 = this.A00;
        double d5 = this.A03;
        double d6 = d4 - d5;
        int i = 0;
        if (d6 < 0.0d) {
            i = 360;
        }
        double d7 = d6 + ((double) i);
        double d8 = r13.A01;
        double d9 = d8 - d5;
        int i2 = 0;
        if (d9 < 0.0d) {
            i2 = 360;
        }
        double d10 = d9 + ((double) i2);
        double d11 = d4 - d8;
        int i3 = 0;
        if (d11 < 0.0d) {
            i3 = 360;
        }
        double d12 = d11 + ((double) i3);
        if (Double.compare(d10, d7) <= 0 && Double.compare(d12, d7) <= 0) {
            return;
        }
        if (d10 <= d12) {
            this.A00 = d8;
        } else {
            this.A03 = d8;
        }
    }

    public AnonymousClass6OA(C135076c5 r5) {
        C134976bv r3 = r5.A00;
        this.A01 = r3.A00;
        C134976bv r2 = r5.A01;
        this.A02 = r2.A00;
        this.A00 = r3.A01;
        this.A03 = r2.A01;
        this.A04 = true;
    }

    public AnonymousClass6OA() {
    }
}
