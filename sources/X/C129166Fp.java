package X;

import java.io.File;

/* renamed from: X.6Fp  reason: invalid class name and case insensitive filesystem */
public class C129166Fp {
    public int A00;
    public C133136Wx A01;
    public Boolean A02;
    public Boolean A03 = false;
    public Boolean A04;
    public Integer A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public Long A0B;
    public Long A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H = false;
    public byte[] A0I;
    public int A0J;
    public File A0K;
    public byte[] A0L;

    public synchronized int A00() {
        return this.A0J;
    }

    public synchronized C133136Wx A01() {
        return this.A01;
    }

    public synchronized C129166Fp A02() {
        C129166Fp r1;
        r1 = new C129166Fp();
        r1.A03 = this.A03;
        r1.A04 = this.A04;
        r1.A02 = this.A02;
        r1.A0H = this.A0H;
        r1.A01 = this.A01;
        r1.A0J = this.A0J;
        r1.A0K = this.A0K;
        r1.A0C = this.A0C;
        r1.A0D = this.A0D;
        r1.A0I = this.A0I;
        r1.A0L = this.A0L;
        r1.A0A = this.A0A;
        r1.A09 = this.A09;
        r1.A07 = this.A07;
        r1.A08 = this.A08;
        r1.A0B = this.A0B;
        r1.A00 = this.A00;
        r1.A0G = this.A0G;
        r1.A0E = this.A0E;
        r1.A05 = this.A05;
        r1.A0F = this.A0F;
        return r1;
    }

    public synchronized File A03() {
        return this.A0K;
    }

    public synchronized Boolean A04() {
        return this.A03;
    }

    public synchronized void A05() {
        this.A02 = false;
    }

    public synchronized void A06() {
        this.A0H = true;
    }

    public synchronized void A07() {
        this.A04 = false;
    }

    public synchronized void A08(int i) {
        this.A09 = Integer.valueOf(i);
    }

    public synchronized void A09(int i) {
        this.A0J = i;
    }

    public synchronized void A0A(int i) {
        this.A0A = Integer.valueOf(i);
    }

    public synchronized void A0B(long j) {
        this.A0B = Long.valueOf(j);
    }

    public synchronized void A0C(long j) {
        this.A0C = Long.valueOf(j);
    }

    public synchronized void A0D(C133136Wx r2, int i, boolean z) {
        this.A03 = Boolean.valueOf(z);
        this.A04 = C36381kD.A0j();
        this.A01 = r2;
        this.A00 = i;
    }

    public synchronized void A0E(File file) {
        this.A0K = file;
    }

    public synchronized void A0F(boolean z) {
        this.A03 = Boolean.valueOf(z);
    }

    public synchronized void A0G(byte[] bArr) {
        this.A0L = bArr;
    }

    public synchronized byte[] A0H() {
        return this.A0L;
    }

    public C129166Fp() {
        Boolean A0m = C36371kC.A0m();
        this.A04 = A0m;
        this.A02 = A0m;
        this.A0J = 0;
    }
}
