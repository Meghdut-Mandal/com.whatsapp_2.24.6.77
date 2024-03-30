package X;

import java.util.Arrays;

/* renamed from: X.9Ws  reason: invalid class name and case insensitive filesystem */
public final class C195899Ws {
    public int A00;
    public int A01 = 0;
    public C191079Bm[] A02 = new C191079Bm[100];
    public int A03;
    public final int A04;

    public C195899Ws(int i) {
        C200319h9.A01(AnonymousClass000.A1R(i));
        this.A04 = i;
    }

    public synchronized int A00() {
        return this.A00 * this.A04;
    }

    public synchronized void A01() {
        int i = this.A03;
        int i2 = this.A04;
        int max = Math.max(0, (((i + i2) - 1) / i2) - this.A00);
        int i3 = this.A01;
        if (max < i3) {
            Arrays.fill(this.A02, max, i3, (Object) null);
            this.A01 = max;
        }
    }

    public synchronized void A02(int i) {
        boolean A1T = AnonymousClass000.A1T(i, this.A03);
        this.A03 = i;
        if (A1T) {
            A01();
        }
    }
}
