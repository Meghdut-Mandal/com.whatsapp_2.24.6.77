package X;

/* renamed from: X.9zc  reason: invalid class name and case insensitive filesystem */
public final class C209199zc implements B2A {
    public int A00;
    public int A01;
    public final int A02;
    public final int A03;
    public final C202309lW A04;

    public int BBw() {
        return -1;
    }

    public int Bmv() {
        int i = this.A02;
        if (i == 8) {
            return this.A04.A04();
        }
        if (i == 16) {
            return this.A04.A06();
        }
        int i2 = this.A01;
        this.A01 = i2 + 1;
        if (i2 % 2 != 0) {
            return this.A00 & 15;
        }
        int A042 = this.A04.A04();
        this.A00 = A042;
        return (A042 & 240) >> 4;
    }

    public C209199zc(C1688482g r3) {
        C202309lW r1 = r3.A00;
        this.A04 = r1;
        r1.A0I(12);
        this.A02 = r1.A05() & 255;
        this.A03 = r1.A05();
    }

    public int BGw() {
        return this.A03;
    }
}
