package X;

import java.io.IOException;

public final class A02 implements B2j {
    public int A00;
    public boolean A01;
    public final /* synthetic */ C209369zt A02;

    public A02(C209369zt r1) {
        this.A02 = r1;
    }

    public boolean BMw() {
        return this.A02.A02;
    }

    public void BPd() {
        C198829eG r1 = this.A02.A08;
        IOException iOException = r1.A01;
        if (iOException == null) {
            C166117v3 r0 = r1.A00;
            if (r0 != null) {
                int i = r0.A04;
                IOException iOException2 = r0.A01;
                if (iOException2 != null && r0.A00 > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public int Bms(C190989Bd r9, AnonymousClass82Z r10, int i) {
        int i2 = this.A00;
        if (i2 == 2) {
            r10.A00 = 4 | r10.A00;
            return -4;
        } else if ((i & 2) == 2 || i2 == 0) {
            r9.A00 = this.A02.A06;
            this.A00 = 1;
            return -5;
        } else {
            C209369zt r6 = this.A02;
            if (!r6.A02) {
                return -3;
            }
            if (r6.A03) {
                r10.A00 = 0;
                r10.A00 = 1 | r10.A00;
                r10.A00(r6.A01);
                r10.A01.put(r6.A04, 0, r6.A01);
                if (!this.A01) {
                    C202249lP r4 = r6.A07;
                    C207099uY r3 = r6.A06;
                    r4.A05(r3, C203249nb.A01(r3.A0S), 0);
                    this.A01 = true;
                }
            } else {
                r10.A00 = 4 | r10.A00;
            }
            this.A00 = 2;
            return -4;
        }
    }

    public int BuD(long j) {
        if (j <= 0 || this.A00 == 2) {
            return 0;
        }
        this.A00 = 2;
        if (this.A01) {
            return 1;
        }
        C209369zt r0 = this.A02;
        C202249lP r4 = r0.A07;
        C207099uY r3 = r0.A06;
        r4.A05(r3, C203249nb.A01(r3.A0S), 0);
        this.A01 = true;
        return 1;
    }
}
