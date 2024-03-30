package X;

/* renamed from: X.1Bd  reason: invalid class name and case insensitive filesystem */
public class C24111Bd {
    public long A00;
    public long A01;
    public long A02;
    public final long A03;
    public final long A04;

    public synchronized long A00() {
        return this.A02;
    }

    public synchronized long A01() {
        long j;
        this.A02++;
        long j2 = this.A00;
        j = this.A04;
        if (j2 <= j) {
            long j3 = this.A01 + j2;
            this.A01 = j3;
            long j4 = j3 - j2;
            this.A00 = j4;
            j = j3 - j4;
        }
        return j;
    }

    public synchronized void A02() {
        this.A02 = 0;
        this.A00 = 0;
        this.A01 = this.A03;
    }

    public synchronized void A03(long j) {
        boolean z = false;
        if (j >= 0) {
            z = true;
        }
        C18740tg.A0C(z);
        if (j < this.A02) {
            A02();
        }
        while (this.A02 < j) {
            A01();
        }
    }

    public C24111Bd(long j, long j2) {
        boolean z = true;
        C18740tg.A0C(j > 0);
        C18740tg.A0C(j2 <= 0 ? false : z);
        this.A04 = j2;
        this.A03 = j;
        A02();
    }
}
