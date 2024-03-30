package X;

/* renamed from: X.7r3  reason: invalid class name and case insensitive filesystem */
public class C163967r3 implements C157667du {
    public Object A00;
    public final int A01;

    public C163967r3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final double BKs(double d) {
        double d2 = d;
        switch (this.A01) {
            case 0:
                C94564iQ r1 = (C94564iQ) this.A00;
                return C15040mb.A00(r1.A05.BKs(d2), (double) r1.A01, (double) r1.A00);
            case 1:
                C94564iQ r12 = (C94564iQ) this.A00;
                return r12.A03.BKs(C15040mb.A00(d2, (double) r12.A01, (double) r12.A00));
            case 2:
                C128406Cd r0 = (C128406Cd) this.A00;
                double d3 = r0.A00;
                double d4 = r0.A01;
                double d5 = r0.A02;
                double d6 = r0.A03;
                double d7 = r0.A04;
                if (d >= d6) {
                    return Math.pow((d3 * d) + d4, d7);
                }
                return d * d5;
            default:
                C128406Cd r2 = (C128406Cd) this.A00;
                double d8 = r2.A00;
                double d9 = r2.A01;
                double d10 = r2.A02;
                double d11 = r2.A03;
                double d12 = r2.A04;
                if (d >= d11 * d10) {
                    return (Math.pow(d2, 1.0d / d12) - d9) / d8;
                }
                return d / d10;
        }
    }
}
