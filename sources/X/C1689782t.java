package X;

/* renamed from: X.82t  reason: invalid class name and case insensitive filesystem */
public final class C1689782t extends C1690082w {
    public int A00;
    public final int A01;
    public final B38 A02;

    public B5S B4q(AnonymousClass9WT r4, C195899Ws r5, long j) {
        int i = this.A01;
        B38 b38 = this.A02;
        if (i != Integer.MAX_VALUE) {
            r4 = r4.A00(r4.A02 % this.A00);
        }
        return b38.B4q(r4, r5, j);
    }

    public void BnT(B5S b5s) {
        this.A02.BnT(b5s);
    }

    public C1689782t(B38 b38, int i) {
        C200319h9.A01(AnonymousClass000.A1R(i));
        this.A02 = b38;
        this.A01 = i;
    }

    public void A05() {
        super.A05();
        this.A00 = 0;
    }

    public void A06(C202709mU r3, boolean z) {
        super.A06(r3, z);
        A07(this.A02, (Object) null);
    }
}
