package X;

public final class A04 implements B3L {
    public final int A00;

    public B3L B2y() {
        return new A04(0);
    }

    public int BGD(int i) {
        int i2 = i - 1;
        if (i2 >= 0) {
            return i2;
        }
        return -1;
    }

    public B3L B2z(int i, int i2) {
        return new A04(this.A00 + i2);
    }

    public B3L B30(int i, int i2) {
        return new A04((this.A00 - i2) + i);
    }

    public int BBt() {
        if (this.A00 > 0) {
            return 0;
        }
        return -1;
    }

    public int BDQ() {
        int i = this.A00;
        int i2 = i - 1;
        if (i <= 0) {
            return -1;
        }
        return i2;
    }

    public int BEV(int i) {
        int i2 = i + 1;
        if (i2 >= this.A00) {
            return -1;
        }
        return i2;
    }

    public A04(int i) {
        this.A00 = i;
    }

    public int getLength() {
        return this.A00;
    }
}
